package com.interviewprep.trees;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class BaconProblem {
	
	
	public class Actor {
    private String name;
	private Set<Actor> coActors;
	private int baconNumber ;
	
	public Actor(String name, Set<Actor> coActors) {
		this.name = name;
		this.coActors = coActors;
		this.baconNumber = -1;
	}
	
	public void addActor(Actor coStar) {
		this.coActors.add(coStar);
		coStar.coActors.add(this);
	}
	
	
	}
	
	public  Integer findBaconNumber(Actor primaryActor, Actor secondaryActor) {
		
		Queue<Actor> processingQueue = new LinkedList<Actor> () ;
		primaryActor.baconNumber = 0;
		processingQueue.add(primaryActor);
		while(! processingQueue.isEmpty()) {
			Actor top = processingQueue.poll();
			if(top.equals(secondaryActor)) {
				return top.baconNumber;
			}
			for(Actor linkedActor: top.coActors) {
				if(linkedActor.baconNumber == -1) {
					linkedActor.baconNumber = top.baconNumber + 1;
					processingQueue.add(linkedActor);
					
				}
				
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		Set<Actor> factorSet = new HashSet<Actor> ();
		Set<Actor> sactorSet = new HashSet<Actor> ();
		Set<Actor> tactorSet = new HashSet<Actor> ();
		Set<Actor> fouractorSet = new HashSet<Actor> ();
		
		BaconProblem bc = new BaconProblem();
		Actor first = bc.new Actor("first", factorSet);
		Actor second = bc.new Actor("second", sactorSet);
		Actor third = bc.new Actor("third", tactorSet);
		Actor fourth = bc.new Actor("fourth", fouractorSet);
		first.addActor(second);
		second.addActor(third);
		third.addActor(fourth);
		first.addActor(third);

		System.out.println(bc.findBaconNumber(first, fourth));
		
		
	}

}
