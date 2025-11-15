package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cup extends NonFood{
	public Cup() {
		this.item = "cup,jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}