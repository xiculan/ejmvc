package controller;

import model.modelo;
import view.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlador implements ActionListener {
	private vista vista;
	private modelo modelo;

	// En el constructor inicializamos nuestros objetos y tambien
	// añadimos el ActionListener al boton "cmdsumar" de la VISTA
	public controlador(vista vista, modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		this.vista.cmdSumar.addActionListener(this);
		this.vista.bClean.addActionListener(this);
	}

	// Inicia los valores del jFrame VISTA con los datos del MODELO
	public void iniciar_vista() {
		vista.setTitle("Demo MVC");
		vista.setLocationRelativeTo(null);
		vista.vtxt1.setText(String.valueOf(modelo.getValor1()));
//	         vista
		vista.vtxt2.setText(String.valueOf(modelo.getValor2()));
		vista.vtxt3.setText(String.valueOf(modelo.getTotal()));
	}

	// La accion del boton de la VISTA es capturado, asi como los valores de
	// los jtextbox, entonces se realiza la funcion SUMAR y se actualiza
	// el jtextbox correspondiente al resultado
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.vista.cmdSumar) {
			modelo.setValor1(Integer.valueOf(vista.vtxt1.getText()));
			modelo.setValor2(Integer.valueOf(vista.vtxt2.getText()));
			modelo.sumar();
			vista.vtxt3.setText(String.valueOf(modelo.getTotal()));
		}
		if(e.getSource()==this.vista.bClean) {
			vista.vtxt1.setText("");
			vista.vtxt2.setText("");
			vista.vtxt3.setText("");
			
			
		}
	}

}
