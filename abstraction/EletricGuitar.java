package com.demo.abstraction;

public class EletricGuitar extends StringInstrument{

	public EletricGuitar() {
		super();
		this.name = "Guitar" ;
		this.numberofstrings = 6;

	}
	public EletricGuitar (int numberofstrings) {
		super();
		this.name = "Guitar" ;
		this.numberofstrings = numberofstrings ;
	}

	public void play ()
	{
		System.out.println("An electric" + numberofstrings + "-string" + name + "is rocking");
	}
	@Override
	public void playfootball() {
		// TODO Auto-generated method stub
		
	}
	
	
}
