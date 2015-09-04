package ru.daigr.resistance.primitives;

import java.util.ArrayList;

public class SeriesResistorGroup implements ResistorGroup {

	private ArrayList<ResistorGroup> resistorGroups = new ArrayList<>();
	
	public void addResistorGroup(ResistorGroup toAdd){
		resistorGroups.add(toAdd);
	}	
		
	@Override
	public double calcResistance() {
		double ret = 0;
		for (ResistorGroup r : resistorGroups){
			ret+=r.calcResistance();
		}
		return ret;
	}

	@Override
	public int countResistors() {
		int ret = 0;
		for (ResistorGroup r : resistorGroups){
			ret+=r.countResistors();
		}
		return ret;
	}
	
}
