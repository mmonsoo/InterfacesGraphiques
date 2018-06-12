package com.mmonsoor;

public class FenetreDate {

	public FenetreDate() {
		// TODO Auto-generated constructor stub
	}
	
	public static String afficheDate() {
		java.util.Date date = new java.util.Date(); //On récupère la date au format brut
		String format = "dd/MM/yy H:mm:ss"; //Permet de définir sous quel format nous voulons que la date s'affiche
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); //Avec ce format on définit un formateur de date
		 return formater.format( date ) ; //On affiche la date en passant la donnée brute en paramètre
	}

}
