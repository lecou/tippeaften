package no.tippeaften.core;

import no.tippeaften.domain.Bet;

public class BetHandler {

	public Bet register(Bet bet) {
		
		// TODO: Lagre bet
		return new Bet(bet.getMatch(), bet.getBetter(), bet.getBetMatch());
	}
}
