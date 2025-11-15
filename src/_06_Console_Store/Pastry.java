package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Pastry extends NonFood{
	public Pastry() {
			this.item = "pastry.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}