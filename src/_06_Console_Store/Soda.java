package _06_Console_Store;

import javax.swing.JLabel;

import _02_Generics_Store.Food;

public class Soda extends Food {
	
	public Soda () {
		this.item = "soda.jpg";
		this.price = 2;
	}

	@Override
	public JLabel getFood() {
		return new JLabel(loadImage(this.item));
	}

}
