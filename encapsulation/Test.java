package com.demo.encapsulation;

public class Test { // gettr and setter - initaialise private varaible and right click -source- getter/setter optin

	

		private int numberofplayers = 11;
		private int numberodovers = 20 ;
		private String playername = "Sachin";
		public int getNumberofplayers() {
			return numberofplayers;
		}
		public void setNumberofplayers(int numberofplayers) {
			this.numberofplayers = numberofplayers;
		}
		public int getNumberodovers() {
			return numberodovers;
		}
		public void setNumberodovers(int numberodovers) {
			this.numberodovers = numberodovers;
		}
		public String getPlayername() {
			return playername;
		}
		public void setPlayername(String playername) {
			this.playername = playername;
		}

	

}
