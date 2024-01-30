package com.yash.demo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		List<Player> allBatters = new ArrayList<Player>();
		
		Team t1 = new Team(1,"MI", allBatters);
		
		Player p1 = new Player(1,"Harmanpreet Kaur",t1);
		Player p2 = new Player(2,"Amili Kerr",t1);
		
		allBatters.add(p1);
		allBatters.add(p2);
		
		Session ses= new Configuration().
				configure().
				buildSessionFactory().
				openSession();
		
		Transaction tr = ses.beginTransaction();
		
		ses.save(t1);
		
//		Team ref = ses.load(Team.class, 11);
//		System.out.println(ref.getBatters().get(0).getPlayerName());

		tr.commit();
		ses.close();
	}

}
