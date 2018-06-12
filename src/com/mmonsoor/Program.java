package com.mmonsoor;

import javax.swing.JLabel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaFenetre mafenetre=new MaFenetre();
	/*	
		int i=1;
		for(JLabel j:mafenetre.getListeJLabel()) {
			j.setBounds(0, i, 300, 20);
			j.setText("Je me trouve à la position "+i+" pixels.");
			mafenetre.getPanneau().add(j);
			i+=20;
			mafenetre.getPanneau().repaint();
		}
	*/
		mafenetre.getPanneau().repaint();
	}
}
