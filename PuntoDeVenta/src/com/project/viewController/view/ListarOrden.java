package com.project.viewController.view;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ListarOrden extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;	

	/**
	 * Create the frame.
	 */
	public ListarOrden() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarOrden.class.getResource("/com/project/viewController/view/img/ic_view_list_black_24dp_1x.png")));
		setTitle("Lista");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentasActivas = new JLabel("Ventas Activas");
		lblVentasActivas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentasActivas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVentasActivas.setBounds(148, 24, 143, 28);
		contentPane.add(lblVentasActivas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 416, 157);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descripci\u00F3n", "Cantidad", "% IVA", "Precio", "Acciones"
			}
		));
	}
}
