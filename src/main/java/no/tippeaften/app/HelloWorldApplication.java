package no.tippeaften.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import no.tippeaften.config.Config;
import no.tippeaften.metrics.TemplateHealthCheck;
import no.tippeaften.resources.HelloWorldResource;

public class HelloWorldApplication extends Application<Config> {
	public static void main(String[] args) throws Exception {
		new HelloWorldApplication().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<Config> bootstrap) {
		// nothing to do yet
	}

	@Override
	public void run(Config configuration, Environment environment) {
		final HelloWorldResource resource = new HelloWorldResource(
				configuration.getTemplate(), configuration.getDefaultName());
		environment.jersey().register(resource);

		final TemplateHealthCheck healthCheck = new TemplateHealthCheck(
				configuration.getTemplate());
		environment.healthChecks().register("template", healthCheck);
		environment.jersey().register(resource);
	}

}