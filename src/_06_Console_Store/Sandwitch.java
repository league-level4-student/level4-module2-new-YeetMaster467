package _06_Console_Store;

import javax.swing.JLabel;

import _02_Generics_Store.Food;

public class Sandwitch extends Food {
	
	public Sandwitch () {
		this.item = "sandwitch.jpg";
		this.price = 6;
	}

	@Override
	public JLabel getFood() {
		return new JLabel(loadImage(this.item));
	}

}
