import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelpContents extends JDialog {

	
	/**
	 * Create the dialog.
	 */
	public HelpContents() {
		setTitle("Help Contents");
		
		setBounds(100, 100, 600, 455);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Back");		
				
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			JTextArea textAreaHelpContents = new JTextArea();
			textAreaHelpContents.setEditable(false);
			textAreaHelpContents.setText("   Plugin DVA (Plugin Debugging and Visual Analysis)\r\n\r\n   This eclipse plugin provides debugging and visual analysis of algorithms using flowcharts and \r\n   Java Plaftform Debugger Architecture (JPDA) to facilitate the learning of basic programming concepts \r\n   and the understanding of the algorithmic complexity of programs.\r\n\r\n   The tool takes as input the execution sequence of the source code of simple programs and displays an \r\n   animation based on a flowchart.\r\n\r\n   The system interface can be seen on the left side of the source code being evaluated, while in the \r\n   center of the window is shown the flow diagram corresponding to the code being executed.\r\n   As the debugging is done the program makes an animation of the instruction that is running, both in \r\n   the source code and in the flowchart. If the program calls a method that has been defined externally, \r\n   in another class of the same project or in the same class, it is enabled the option to choose if you \r\n   want to do a step into or step over. If you choose to use a step into, another flow diagram is shown \r\n   with the execution animation of each method instruction on the right side of the main flow diagram.\r\n\r\n   The values \u200B\u200Bthat the variables take during the execution of a program are displayed in a panel at the \r\n   right end of the window, as well as the algorithmic complexity of the blocks that make up the \r\n   program under study.\r\n");
			getContentPane().add(textAreaHelpContents, BorderLayout.CENTER);
		}
	}
	
	public static void showHelpContents() {			// del MAIN  se cambio el nombre y se quito lo de adentro
		try {
			HelpContents dialog = new HelpContents();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
