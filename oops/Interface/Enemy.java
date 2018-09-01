package com.demo.oops.Interface;

public interface Enemy {

	public void speak();
	public void moveTo(int g , int y);
	public void attacks(String code);
	public void heal (int percentage);
	public void eventonDeath();
	public void shoot (String Sound);


}
