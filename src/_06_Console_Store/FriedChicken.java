package _06_Console_Store;

import javax.swing.JLabel;

import _02_Generics_Store.Food;

public class FriedChicken extends Food {
	
	public FriedChicken () {
		this.item = "fried chicken.jpg";
		price = 10;
	}

	@Override
	public JLabel getFood() {
		return new JLabel(loadImage(this.item));
	}

}
