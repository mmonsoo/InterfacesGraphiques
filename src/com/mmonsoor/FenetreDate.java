package com.mmonsoor;

public class FenetreDate {

	public FenetreDate() {
		// TODO Auto-generated constructor stub
	}
	
	public static String afficheDate() {
		java.util.Date date = new java.util.Date(); //On r�cup�re la date au format brut
		String format = "dd/MM/yy H:mm:ss"; //Permet de d�finir sous quel format nous voulons que la date s'affiche
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); //Avec ce format on d�finit un formateur de date
		 return formater.format( date ) ; //On affiche la date en passant la donn�e brute en param�tre
	}

}
