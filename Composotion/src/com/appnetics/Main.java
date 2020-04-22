package com.appnetics;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B","Dell","240V",dimensions);


	    Monitor theMonitor = new Monitor("27Inch Beast","Acer",27, new Resolution(2540,1440));

	    Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,"V2.44");

	    PC thePc = new PC(theCase,theMonitor,theMotherBoard);
	    thePc.getMonitor().drawPixelAt(1500,1200,"Red");
	    thePc.getMotherboard().loadProgram("Ubuntu 16.4");
	    thePc.getTheCase().pressPowerButton();
    }
}
