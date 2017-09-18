package com.project.viewController.view;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	/**
	 * Variables for the Main Window.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Main() {
		setBackground(SystemColor.activeCaption);
		setTitle("Caja");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/com/project/viewController/view/img/ic_monetization_on_black_24dp_1x.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCerrarCaja = new JButton("Cerrar Caja");
		btnCerrarCaja.setBackground(SystemColor.controlLtHighlight);
		btnCerrarCaja.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				close();
				new Principal().main(null);;				
			}
		});
		btnCerrarCaja.setBounds(21, 23, 107, 23);
		contentPane.add(btnCerrarCaja);
		
		JPanel pnlOrdenes = new JPanel();
		pnlOrdenes.setBounds(10, 78, 185, 144);
		pnlOrdenes.setBorder(BorderFactory.createTitledBorder("Ordenes"));
		contentPane.add(pnlOrdenes);
		
		JButton btnCrearOrden = new JButton("Crear");
		btnCrearOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Ordenes().setVisible(Boolean.TRUE);
			}
		});
		btnCrearOrden.setBackground(SystemColor.controlLtHighlight);
		pnlOrdenes.add(btnCrearOrden);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ListarOrden().setVisible(Boolean.TRUE);
			}
		});
		btnListar.setBackground(SystemColor.controlLtHighlight);
		pnlOrdenes.add(btnListar);
		
		JPanel pnlProductos = new JPanel();
		pnlProductos.setBounds(212, 78, 185, 144);
		pnlProductos.setBorder(BorderFactory.createTitledBorder("Productos"));
		contentPane.add(pnlProductos);
		
		JButton btnCrearProd = new JButton("Crear");
		btnCrearProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CrearProducto().setVisible(Boolean.TRUE);
			}
		});
		btnCrearProd.setBackground(SystemColor.controlLtHighlight);
		pnlProductos.add(btnCrearProd);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EliminarProducto().setVisible(Boolean.TRUE);
			}
		});
		btnEliminar.setBackground(SystemColor.controlLtHighlight);
		pnlProductos.add(btnEliminar);
	}
	
	/**
	 * Method to close the current window.
	 */
	private void close() {
		this.setVisible(Boolean.FALSE);
	}
}
