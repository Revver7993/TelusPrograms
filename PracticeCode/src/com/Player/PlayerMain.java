package com.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerMain {

	public static void main(String[] args) {
		Set<Player> pSet=new HashSet<>();
		Player p1=new Player(100, "Rohan");
		Player p2=new Player(95, "Sohan");
		Player p3=new Player(93, "Mohan");
		Player p4=new Player(85, "Raja");
		Player p5=new Player(101,"Pravin");
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5);
		
		List<Player> set1= pSet.stream().sorted((x,y)->(x.score - y.score)).collect(Collectors.toList());
		System.out.println(set1);
		
	}

}
