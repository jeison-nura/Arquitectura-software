import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBoton extends JFrame implements Observer, ActionListener{

	ClaseObservador miObservador;
	int colorSeleccionado;
	JButton botonColor;
	
	
	public VentanaBoton(ClaseObservador observador) {
		 miObservador=observador;
		 
		 botonColor = new JButton("color");
		 botonColor.setBounds(20, 40, 150, 25);
		 add(botonColor);
		 
		 setSize(200,110);
		  setTitle("Ventana Color");
		  setLocation(500,150);
		  setLayout(null);
		  setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		colorSeleccionado=miObservador.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1: 
		botonColor.setBackground(Color.yellow);
		
		break;
		case 2:
		botonColor.setBackground(Color.blue);
		
		break;
		case 3: 
		botonColor.setBackground(Color.red);
		
		break;
		case 4: 
		botonColor.setBackground(Color.green);
		
		break;
		case 5:
		botonColor.setBackground(Color.black);
		
		break;
		case 6:
		botonColor.setBackground(Color.white);
		
		break;
		case 7:
		botonColor.setBackground(Color.orange);
		
		break;
		default : 
		botonColor.setBackground(null);
		
		}
		
	}

}
