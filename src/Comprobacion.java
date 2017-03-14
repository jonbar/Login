import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public Comprobacion(Main main, boolean b) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Comprobacion dialog = new Comprobacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Comprobacion() {
		setBounds(100, 100, 227, 140);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblOngiEtorri = new JLabel("Ongi Etorri ");
			contentPanel.add(lblOngiEtorri);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						abrirVentanaAcciones();
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	protected void abrirVentanaAcciones() {
		Acciones abrirAcciones = new Acciones();
		abrirAcciones.setVisible(true);
	}

}
