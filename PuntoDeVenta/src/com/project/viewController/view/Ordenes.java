package com.project.viewController.view;

import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Ordenes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTable tProducto;
	private JTable tPedido;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ordenes() {
		setType(Type.POPUP);
		setTitle("Ordenes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ordenes.class.getResource("/com/project/viewController/view/img/ic_shopping_cart_black_24dp_1x.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFiltrarPor = new JLabel("Filtrar por:");
		lblFiltrarPor.setBounds(26, 11, 75, 14);
		contentPane.add(lblFiltrarPor);
		
		JComboBox cbFiltro = new JComboBox();
		cbFiltro.setModel(new DefaultComboBoxModel(new String[] {"C\u00F3digo", "Descripci\u00F3n"}));
		cbFiltro.setBounds(26, 36, 104, 20);
		contentPane.add(cbFiltro);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(173, 36, 86, 20);
		contentPane.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(333, 35, 89, 23);
		contentPane.add(btnCargar);
		
		String[][] rows = {
			{},
		};
		
		String[] columnNames = {
			"C\u00F3digo", "Descripci\u00F3n", "Precio"
		};
		
		DefaultTableModel dfTableModel = new DefaultTableModel(rows, columnNames);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 67, 396, 41);
		contentPane.add(scrollPane);
		
		tProducto = new JTable();
		tProducto.setRowSelectionAllowed(false);
		scrollPane.setViewportView(tProducto);
		tProducto.setFillsViewportHeight(true);
		tProducto.setModel(dfTableModel);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBounds(26, 131, 46, 14);
		contentPane.add(lblPedido);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 156, 396, 44);
		contentPane.add(scrollPane_1);
		
		tPedido = new JTable();
		scrollPane_1.setViewportView(tPedido);
		tPedido.setRowSelectionAllowed(false);
		tPedido.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descripci\u00F3n", "Cantidad", "% IVA", "Precio"
			}
		));
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(26, 211, 46, 14);
		contentPane.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(172, 211, 46, 14);
		contentPane.add(lblTotal);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(26, 243, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(182, 243, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(335, 243, 89, 23);
		contentPane.add(btnRegistrar);
	}
}
