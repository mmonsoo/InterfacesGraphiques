package com.mmonsoor;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame {
	//Attributs de la classe
	private JPanel panneau;
    private JLabel label;
    private List<JLabel> listeJLabel;
    private JButton monbutton;
    
	public MaFenetre() {
		this.setTitle("Voici mon titre pour l'exercice");
		this.setSize(500, 500);
		//ça place la fenêtre au centre de l'écran quand c'est égal à null
		this.setLocationRelativeTo(null);
		//On rend la fenêtre visible
		this.setVisible(true);
		//Quand on clique sur la croix rouge, ça ferme le programme
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panneau=new JPanel();
		//Panneau sans layout pour placer librement les éléments
		panneau.setLayout(null);
		this.setContentPane(panneau);
		label=new JLabel();
		label.setBounds(0,1,200,20);
		label.setText(FenetreDate.afficheDate());
		panneau.add(label);
		//Créer une liste de JLabel
		//createArrayListJLabel();
		monbutton=new JButton();
		monbutton.setBounds(0,20,200,20);
		monbutton.setText("Mettre à jour la date");
		monbutton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Le code à executer en cas de clique
						label.setText(FenetreDate.afficheDate());
					}
				}
				);
		panneau.add(monbutton);
		
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton getMonbutton() {
		return monbutton;
	}

	public void setMonbutton(JButton monbutton) {
		this.monbutton = monbutton;
	}

	public void setListeJLabel(List<JLabel> listeJLabel) {
		this.listeJLabel = listeJLabel;
	}

	/**
	 * 
	 */
	public void createArrayListJLabel() {
		Dimension dim=this.getSize();
		listeJLabel= new ArrayList<JLabel>();
		for(int i=0;i<dim.getHeight()/20;i++) {
			label=new JLabel();
			label.setBounds(0, 1, 150, 20);
			listeJLabel.add(label);
		}
	}

	public JPanel getPanneau() {
		return panneau;
	}

	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}

	public List<JLabel> getListeJLabel() {
		return listeJLabel;
	}

	public void setListeJLabel(ArrayList<JLabel> listeJLabel) {
		this.listeJLabel = listeJLabel;
	}

}
