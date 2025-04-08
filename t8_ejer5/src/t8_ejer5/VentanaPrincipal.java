package t8_ejer5;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class VentanaPrincipal {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldNombre;
	private JTextField textFieldPrecio;
	private JTextField textFieldUnidades;
	private JTextField textFieldCodigo;
	private JTextField textFieldCodigoact;
	private JTextField textFieldPrecioact;
	private JTextField textFieldCodunidades;
	private JTextField textFieldUnidadesact;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			System.out.println();
		Connection con=ConnectionSingleton.getConnection();
		frame = new JFrame();
		frame.setBounds(100, 100, 748, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Codigo");
		model.addColumn("Nombre");
		model.addColumn("Precio");
		model.addColumn("Unidades");
		
		table_1 = new JTable(model);
		frame.getContentPane().add(table_1);
		
		JScrollPane scrollPane =new JScrollPane(table_1);
		scrollPane.setBounds(98, 12, 299, 114);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblAadirProducto = new JLabel("Añadir producto:");
		lblAadirProducto.setBounds(95, 152, 124, 15);
		frame.getContentPane().add(lblAadirProducto);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(98, 206, 70, 15);
		frame.getContentPane().add(lblPrecio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(98, 179, 70, 15);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setBounds(248, 179, 88, 15);
		frame.getContentPane().add(lblUnidades);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(174, 179, 56, 19);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(174, 204, 56, 19);
		frame.getContentPane().add(textFieldPrecio);
		
		textFieldUnidades = new JTextField();
		textFieldUnidades.setColumns(10);
		textFieldUnidades.setBounds(337, 177, 60, 19);
		frame.getContentPane().add(textFieldUnidades);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(174, 235, 117, 25);
		frame.getContentPane().add(btnInsertar);
		
		JLabel lblBorrarProducto = new JLabel("Borrar producto:");
		lblBorrarProducto.setBounds(98, 297, 132, 15);
		frame.getContentPane().add(lblBorrarProducto);
		
		JLabel lblCdigo = new JLabel("Código: ");
		lblCdigo.setBounds(98, 324, 70, 15);
		frame.getContentPane().add(lblCdigo);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(174, 322, 45, 19);
		frame.getContentPane().add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(108, 359, 117, 25);
		frame.getContentPane().add(btnBorrar);
		
		JLabel lblActualizarPrecio = new JLabel("Actualizar precio:");
		lblActualizarPrecio.setBounds(477, 25, 132, 15);
		frame.getContentPane().add(lblActualizarPrecio);
		
		JLabel lblCdigo_1 = new JLabel("Código: ");
		lblCdigo_1.setBounds(473, 52, 70, 15);
		frame.getContentPane().add(lblCdigo_1);
		
		textFieldCodigoact = new JTextField();
		textFieldCodigoact.setColumns(10);
		textFieldCodigoact.setBounds(546, 50, 45, 19);
		frame.getContentPane().add(textFieldCodigoact);
		
		JButton btnActualizarPrecio = new JButton("Actualizar precio");
		btnActualizarPrecio.setBounds(477, 127, 174, 25);
		frame.getContentPane().add(btnActualizarPrecio);
		
		JLabel lblPrecio_1 = new JLabel("Precio:");
		lblPrecio_1.setBounds(477, 79, 70, 15);
		frame.getContentPane().add(lblPrecio_1);
		
		textFieldPrecioact = new JTextField();
		textFieldPrecioact.setColumns(10);
		textFieldPrecioact.setBounds(546, 79, 56, 19);
		frame.getContentPane().add(textFieldPrecioact);
		
		JLabel lblStocl = new JLabel("Stock:");
		lblStocl.setBounds(477, 179, 56, 15);
		frame.getContentPane().add(lblStocl);
		
		JLabel lblCdigo_1_1 = new JLabel("Código: ");
		lblCdigo_1_1.setBounds(473, 206, 70, 15);
		frame.getContentPane().add(lblCdigo_1_1);
		
		textFieldCodunidades = new JTextField();
		textFieldCodunidades.setColumns(10);
		textFieldCodunidades.setBounds(546, 204, 45, 19);
		frame.getContentPane().add(textFieldCodunidades);
		
		JLabel lblUnidades_1 = new JLabel("Unidades");
		lblUnidades_1.setBounds(473, 240, 70, 15);
		frame.getContentPane().add(lblUnidades_1);
		
		textFieldUnidadesact = new JTextField();
		textFieldUnidadesact.setColumns(10);
		textFieldUnidadesact.setBounds(546, 238, 45, 19);
		frame.getContentPane().add(textFieldUnidadesact);
		
		JButton btnActualizarUnidades = new JButton("Actualizar");
		btnActualizarUnidades.setBounds(477, 267, 117, 25);
		frame.getContentPane().add(btnActualizarUnidades);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
