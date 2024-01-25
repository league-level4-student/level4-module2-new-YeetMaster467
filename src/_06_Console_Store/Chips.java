package _06_Console_Store;

import javax.swing.JLabel;

import _02_Generics_Store.Food;

public class Chips extends Food {
	
	public Chips () {
		this.item = "chips.jpg";
		price = 2;
	}

	@Override
	public JLabel getFood() {
		return new JLabel(loadImage(this.item));
	}

}
