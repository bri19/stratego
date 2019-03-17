/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author ASUS GAMER
 */
public class Matrix extends JFrame implements ActionListener {

	public Matrix() {
		JToolBar barraHerramientas = new JToolBar();
		JLabel lblFilas = new JLabel();
		JLabel lblColumnas = new JLabel();
		txtColumnas = new JTextField();
		txtFilas = new JTextField();
		btnCrear = new JButton();
		panel = new JPanel( null );

		//Para que el JFrame cierre la aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Colocamos el JToolBar en la parte de arriba del JFrame
		this.add(barraHerramientas, BorderLayout.PAGE_START);

		//Se agrega el panel a boton
                this.add(panel, BorderLayout.CENTER);
                btnCrear.setText("JUGAR");
		btnCrear.addActionListener(this);
		barraHerramientas.add(btnCrear);
		this.setSize(1420, 1000);
		//Permite que la ventana se coloque al centro de la pantalla
		this.setLocationRelativeTo(null);
                //hola bri
                // cambie esto

	}

	public void actionPerformed( ActionEvent evt ) {
        
        //Se cambia de cadena de caracteres a numeros
        int filas = 7;
        int columnas = 8;
		
		//Eliminamos los anteriores botones
        panel.removeAll();

        Boton [][] botones;
            botones = new Boton[ filas ][ columnas ];
        
        //Se recorren las filas
        for( int fila = 0 ; fila < filas; fila++ )
        {
            //Estando en la fila se recorrer las columnas
            for( int columna = 0 ; columna < columnas; columna++ )
            {
                //Se crea el boton y se agrega a las celda de la matriz
                botones[fila][columna] = new Boton( 175 * columna, 130 * fila, 175, 130 );
                
                //Se da el nombre en forma de coordenada enviando la fila y columna
                botones[fila][columna].setNombre(fila, columna);
                
                //Se agrega el boton al panel
                panel.add( botones[fila][columna] );
            }
        }
        
        //Se actualiza el panel para que se vean los botones
		panel.updateUI();
	}    //ACA                                    

	public static void main(String args[]) {
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
			ex.printStackTrace();
        }
		new Matrix().setVisible(true);
    }

	JButton btnCrear;
	JTextField txtColumnas;
	JTextField txtFilas;
	JPanel panel;
}
