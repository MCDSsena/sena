package com.project.viewController.view;

import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CrearProducto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblTipo;
	private JLabel lblCantidad;
	private JLabel lblFechaEntrada;
	private JLabel lblPrecio;
	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CrearProducto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearProducto.class.getResource("/com/project/viewController/view/img/ic_add_shopping_cart_black_24dp_1x.png")));
		setTitle("Crear Producto");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setBounds(11, 39, 11, 14);
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(60, 36, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblFechaEntrada = new JLabel("Fecha Entrada");
		lblFechaEntrada.setBounds(235, 39, 70, 14);
		lblFechaEntrada.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblFechaEntrada);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(311, 36, 118, 20);
		contentPane.add(formattedTextField);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(11, 65, 37, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 62, 119, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(235, 65, 29, 14);
		lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(311, 62, 118, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(11, 91, 20, 14);
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(60, 88, 119, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fruver", "Carnes", "Aseo"}));
		contentPane.add(comboBox);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(11, 118, 43, 14);
		lblCantidad.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblCantidad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 115, 119, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(311, 114, 118, 23);
		contentPane.add(btnRegistrar);
	}
}
