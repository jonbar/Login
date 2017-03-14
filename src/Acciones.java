import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acciones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblDatosAlumnos;
	private JButton okButton;
	private JComboBox comboBoxAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acciones dialog = new Acciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acciones() {
		setBounds(100, 100, 345, 259);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			lblDatosAlumnos = new JLabel("Datos alumnos");
			lblDatosAlumnos.setFont(new Font("Calibri", Font.BOLD, 32));
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
		);
		
		JButton btnAñadirAlumno = new JButton("A\u00F1adir alumno");
		btnAñadirAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaInsertarUsuario();
			}
		});
		
		JButton btnEliminarAlumno = new JButton("Eliminar alumno");
		btnEliminarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBoxAlumnos.getSelectedIndex();
				eliminar(index);
			}
		});
		
		JButton btnMediaEdad = new JButton("Media edad");
		btnMediaEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		comboBoxAlumnos = new JComboBox();
		{
			okButton = new JButton("OK");
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnAñadirAlumno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnMediaEdad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnEliminarAlumno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
								.addComponent(comboBoxAlumnos, 0, 153, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
								.addComponent(lblDatosAlumnos)
								.addGap(56)))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(okButton)
							.addContainerGap())))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblDatosAlumnos)
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAñadirAlumno)
						.addComponent(comboBoxAlumnos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnEliminarAlumno)
					.addGap(18)
					.addComponent(btnMediaEdad)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(okButton)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		getContentPane().setLayout(groupLayout);
	}
	
	public void eliminar(int i){
		this.comboBoxAlumnos.removeItemAt(i);
	}
	
	protected void abrirVentanaInsertarUsuario() {
		EntradaDatos crearUsuario = new EntradaDatos(this, true);
		crearUsuario.setVisible(true);
	}
}
