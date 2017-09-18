package com.project.viewController.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Principal {

	private JFrame frmTerminalpuntoDeVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTerminalpuntoDeVenta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTerminalpuntoDeVenta = new JFrame();
		frmTerminalpuntoDeVenta.setBackground(SystemColor.activeCaption);
		frmTerminalpuntoDeVenta.setTitle("Terminal-Punto de Venta");
		frmTerminalpuntoDeVenta.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/com/project/viewController/view/img/ic_store_black_24dp_1x.png")));
		frmTerminalpuntoDeVenta.setBounds(100, 100, 450, 300);
		frmTerminalpuntoDeVenta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTerminalpuntoDeVenta.getContentPane().setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBackground(SystemColor.controlLtHighlight);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTerminalpuntoDeVenta.dispose();
				new Main().setVisible(Boolean.TRUE);
			}
		});
		btnIniciar.setBounds(171, 154, 89, 23);
		frmTerminalpuntoDeVenta.getContentPane().add(btnIniciar);
		
		JLabel lblAbrirCaja = new JLabel("Abrir Caja");
		lblAbrirCaja.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbrirCaja.setBounds(171, 129, 89, 14);
		frmTerminalpuntoDeVenta.getContentPane().add(lblAbrirCaja);
	}
}
