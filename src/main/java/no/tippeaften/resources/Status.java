package no.tippeaften.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;

import no.tippeaften.core.BetHandler;
import no.tippeaften.core.MatchHandler;
import no.tippeaften.core.PlayerHandler;
import no.tippeaften.domain.Bet;
import no.tippeaften.domain.Match;
import no.tippeaften.domain.Player;
import no.tippeaften.domain.Team;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

public class Status {
	private AtomicLong counter;
	private BetHandler betHandler;
	private MatchHandler matchHandler;
	private PlayerHandler playerHandler;

	public Status() {
        this.counter = new AtomicLong();
    }
	
	@GET
	@Timed
	public Bet registerBet(@QueryParam("bet") Bet bet) {
		return betHandler.register(bet);
	}
	
	@GET
	@Timed
	public Match registerMatch(@QueryParam("bet") Match bet) {
		return matchHandler.register(bet);
	}

	@GET
	@Timed
	public Player registerPlayer(@QueryParam("bet") Player bet) {
		return playerHandler.register(bet);
	}
	
	@GET
	@Timed
	public Match registerMatch(@QueryParam("hosts") String hosts, @QueryParam("visitors") String visitors) {
		return new Match(counter.incrementAndGet(), new Team(hosts), new Team(visitors));
	}

	@GET
	@Timed
	public List<Match> getOngoingMatches() {
		return new ArrayList<Match>();
	}

	@GET
	@Timed
	public List<Bet> getOngoingBets() {
		return new ArrayList<Bet>();
	}
	
    @GET
    @Timed
    public Match getMatch(@QueryParam("id") Optional<Long> id) {
        return new Match();
    }
}
