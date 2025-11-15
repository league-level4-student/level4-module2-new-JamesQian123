package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Wallet extends NonFood{
	public Wallet() {
		this.item = "wallet.jpeg";
			
		
		}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}