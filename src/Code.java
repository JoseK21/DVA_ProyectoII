import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;

public class Code extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	

	/**
	 * Create the dialog.
	 */
	public Code() {
		setTitle("Insert Code");
		setBounds(100, 100, 650, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();			
			buttonPane.setBounds(10, 468, 614, 32);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("Run");
				okButton.setIcon(new ImageIcon(Code.class.getResource("/Image/run.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setBounds(10, 5, 83, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setBounds(103, 5, 80, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 32, 614, 425);
		contentPanel.add(textPane);
		
		Label label = new Label("Write or Copy your Code here, please");
		label.setFont(new Font("Cooper Black", Font.BOLD | Font.ITALIC, 13));
		label.setBounds(10, 10, 266, 22);
		contentPanel.add(label);
	}
	

	public static void showInsertCode() {
		try {
			Code dialog = new Code();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
