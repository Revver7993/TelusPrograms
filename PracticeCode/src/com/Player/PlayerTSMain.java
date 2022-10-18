package com.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PlayerTSMain {

	public static void main(String[] args) {
		Player p1=new Player(100, "Rohan");
		Player p2=new Player(95, "Sohan");
		Player p3=new Player(93, "Mohan");
		Player p4=new Player(85, "Raja");
		Player p5=new Player(101,"Pravin");
		
		
//      TreeSet<Player> tSet = new TreeSet<>((x,y)-> (x.getScore()-y.getScore())); // Tree Set
//		tSet.add(p1);
//		tSet.add(p2);
//		tSet.add(p3);
//		tSet.add(p4);
//		tSet.add(p5);
//		System.out.println(tSet);
		
		
//		Set<Player> tSet=new HashSet<>(); // Finding Max in HashSet
//		tSet.add(p1);
//		tSet.add(p2);
//		tSet.add(p3);
//		tSet.add(p4);
//		tSet.add(p5);
//    	
//    	Player player = tSet.stream().max((x, y) -> (x.score - y.score)).get();
//    	System.out.println(player);
    	
    	
    	Set<Player> tSet=new TreeSet<>((x,y)-> (x.getScore()-y.getScore())); // Finding Max in TreeSet
		tSet.add(p1);
		tSet.add(p2);
		tSet.add(p3);
		tSet.add(p4);
		tSet.add(p5);
    	
    	Player player = tSet.stream().max((x, y) -> (x.score - y.score)).get();
    	System.out.println(player);
				

	}

}
