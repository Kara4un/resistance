package ru.daigr.resistance.app;

import ru.daigr.resistance.primitives.ParallelResisorGroup;
import ru.daigr.resistance.primitives.Resistor;
import ru.daigr.resistance.primitives.SeriesResistorGroup;


public class ResistanceApp {

	public static void main(String[] args){
		
		ParallelResisorGroup chain = new ParallelResisorGroup();
		
		Resistor r1 = new Resistor(1,3);
		Resistor r2 = new Resistor(2,4);
		Resistor r3 = new Resistor(3,3);
		Resistor r4 = new Resistor(4,5);
		Resistor r5 = new Resistor(5,6);
		Resistor r6 = new Resistor(6,2);
		Resistor r7 = new Resistor(7,3);
		Resistor r8 = new Resistor(8,1);
		Resistor r9 = new Resistor(9,2);
		Resistor r10 = new Resistor(10,3);
		Resistor r11 = new Resistor(11,4);
		Resistor r12 = new Resistor(12,6);
		Resistor r13 = new Resistor(13,6);
		Resistor r14 = new Resistor(14,3);
		Resistor r15 = new Resistor(15,1);
		Resistor r16 = new Resistor(16,3);
		
		SeriesResistorGroup r123 = new SeriesResistorGroup();
		r123.addResistorGroup(r1);
		r123.addResistorGroup(r2);
		r123.addResistorGroup(r3);				
		
		SeriesResistorGroup r45= new SeriesResistorGroup();
		r45.addResistorGroup(r4);
		r45.addResistorGroup(r5);
						
		SeriesResistorGroup r67= new SeriesResistorGroup();
		r67.addResistorGroup(r6);
		r67.addResistorGroup(r7);
		
		SeriesResistorGroup r89= new SeriesResistorGroup();
		r89.addResistorGroup(r8);
		r89.addResistorGroup(r9);
		
		SeriesResistorGroup r10_11= new SeriesResistorGroup();
		r10_11.addResistorGroup(r10);
		r10_11.addResistorGroup(r11);
		
		SeriesResistorGroup r14_15= new SeriesResistorGroup();
		r14_15.addResistorGroup(r14);
		r14_15.addResistorGroup(r15);
		
		ParallelResisorGroup r12345 = new ParallelResisorGroup();
		r12345.addResistorGroup(r123);
		r12345.addResistorGroup(r45);		
		
		ParallelResisorGroup r6789 = new ParallelResisorGroup();
		r6789.addResistorGroup(r67);
		r6789.addResistorGroup(r89);
		
		ParallelResisorGroup r10_11_12 = new ParallelResisorGroup();
		r10_11_12.addResistorGroup(r10_11);
		r10_11_12.addResistorGroup(r12);
		
		ParallelResisorGroup r13_14_15 = new ParallelResisorGroup();
		r13_14_15.addResistorGroup(r13);		
		r13_14_15.addResistorGroup(r14_15);
				
		chain.addResistorGroup(r12345);
		chain.addResistorGroup(r6789);
		chain.addResistorGroup(r10_11_12);
		chain.addResistorGroup(r13_14_15);
		chain.addResistorGroup(r16);

		System.out.println("Величина сопротивления R1 = " + r1.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R2 = " + r2.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R3 = " + r3.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R4 = " + r4.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R5 = " + r5.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R6 = " + r6.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R7 = " + r7.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R8 = " + r8.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R9 = " + r9.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R10 = " + r10.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R11 = " + r11.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R12 = " + r12.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R13 = " + r13.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R14 = " + r14.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R15 = " + r15.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R16 = " + r16.calcResistance() + " Ом");
		System.out.println("============================================================");
		System.out.println("Величина сопротивления R123 = " + r123.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R45 = " + r45.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R67 = " + r67.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R89 = " + r89.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R10_11 = " + r10_11.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R14_15 = " + r14_15.calcResistance() + " Ом");
		System.out.println("============================================================");
		System.out.println("Величина сопротивления R12345 = " + r12345.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R6789 = " + r6789.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R10_11_12 = " + r10_11_12.calcResistance() + " Ом");
		System.out.println("Величина сопротивления R13_14_15 = " + r13_14_15.calcResistance() + " Ом");
		System.out.println("============================================================");
		System.out.println("Величина сопротивления всей цепи Rобщ = " + chain.calcResistance() + " Ом");
	}
	
	
}
