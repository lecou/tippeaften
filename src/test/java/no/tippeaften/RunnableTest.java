package no.tippeaften;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import no.tippeaften.config.Config;

public class RunnableTest extends Application<Config> {
    public static void main(String[] args) throws Exception {
        new RunnableTest().run(args);
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
    public void run(Config configuration,
                    Environment environment) {
        // nothing to do yet
    }

}