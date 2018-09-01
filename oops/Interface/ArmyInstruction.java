package com.demo.oops.Interface;

public class ArmyInstruction implements Enemy {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void attack(String code) {
		// TODO Auto-generated method stub
		
	//}

	@Override
	public void heal(int percentage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventonDeath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot(String Sound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attacks(String code) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ArmyInstruction AI = new ArmyInstruction ();
		AI.attacks("one");
	}
	
			
	
}
