package com.project.viewController.view;

import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class EliminarProducto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtDescripcin;
	private JTextField txtPrecio;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnEliminar;
	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public EliminarProducto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EliminarProducto.class.getResource("/com/project/viewController/view/img/ic_remove_shopping_cart_black_24dp_1x.png")));
		setTitle("Eliminar Producto");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(22, 11, 376, 109);
		panel.setBorder(BorderFactory.createTitledBorder("Filtro"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(10, 44, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtDescripcin = new JTextField();
		txtDescripcin.setBounds(140, 44, 86, 20);
		panel.add(txtDescripcin);
		txtDescripcin.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(270, 44, 86, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 19, 46, 14);
		panel.add(lblId);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(140, 19, 86, 14);
		panel.add(lblDescripcin);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(270, 19, 46, 14);
		panel.add(lblPrecio);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(280, 75, 76, 23);
		panel.add(btnBuscar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 131, 346, 123);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setLocation(43, 0);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descripci\u00F3n", "Precio"
			}
		));
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(294, 263, 89, 23);
		contentPane.add(btnEliminar);
	}
}
