package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
/*	public static void main(String[] args){
		Deck deck = new Deck();
		System.out.println(deck.DrawCard().geteRank());
	}*/
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		//TODO: Add a player to the table (should be pretty easy)		
		return this;
	}
}
