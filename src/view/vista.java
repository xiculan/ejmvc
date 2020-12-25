package view;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class vista extends JFrame {

//	vista.vtxt1.setText( String.valueOf(modelo.get_valor1()) );
//    vista.vtxt2.setText( String.valueOf(modelo.get_valor2()) );
//    vista.vtxt3.setText( String.valueOf(modelo.get_total()) );
//    
	public JTextField vtxt1, vtxt2, vtxt3;
//	private JTextField tId, tAbuscar, tBuscaImg;
	public JLabel lSuma, lResultado;
	public JButton cmdSumar,bClean;

	public vista() throws HeadlessException {
		this.setBounds(0, 0, 400, 300);
		//this.add(vtxt1);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		
			
		vtxt1 = new JTextField("sdsdrfd");
		vtxt1.setBounds(200, 2, 150, 20); // xpos,ypos,wide,height ex:10,30,125,20
		
		lSuma = new JLabel("+");
		lSuma.setBounds(200, 30, 10, 10);
		
		
		vtxt2 = new JTextField("");
		vtxt2.setBounds(200, 50, 150, 20); // xpos,ypos,wide,height ex:10,30,125,20
		
		lResultado = new JLabel("Resultado:");
		lResultado.setBounds(100, 80 , 150 , 20 );
		
		vtxt3 = new JTextField("");
		vtxt3.setBounds(200, 80, 150, 20); // xpos,ypos,wide,height ex:10,30,125,20
		
		cmdSumar = new JButton("Sumar");
		cmdSumar.setBounds(200, 150, 120, 20); // xpos,ypos,wide,height ex:10,30,125,20
		
		bClean = new JButton("Clean boxes");
		bClean.setBounds(20, 50, 120, 20); // xpos,ypos,wide,height ex:10,30,125,20
		
		this.add(vtxt1);
		this.add(lSuma);
		this.add(vtxt2);
		this.add(lResultado);
		this.add(vtxt3);
		this.add(cmdSumar);
		this.add(bClean);
		
	}

}
