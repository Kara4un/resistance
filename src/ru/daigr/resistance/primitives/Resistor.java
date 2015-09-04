package ru.daigr.resistance.primitives;

public class Resistor implements ResistorGroup {
	
	private int num = 0;
	private double value = 0;
	
	public Resistor(int aNum, int aValue){
		num = aNum;
		value = aValue;
	}	

	public int getNum(){
		return num;
	}

	@Override
	public double calcResistance() {
		return value;
	}

	@Override
	public int countResistors() {
		return 1;
	}
}
