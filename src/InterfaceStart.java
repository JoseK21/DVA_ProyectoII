import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class InterfaceStart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceStart frame = new InterfaceStart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceStart() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfaceStart.class.getResource("/Image/IconDVA.PNG")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem insertCode = new JMenuItem("Insert Code");
		insertCode.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/code1.png")));
		file.add(insertCode);
		
		JMenuItem openFile = new JMenuItem("Open File");
		openFile.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/file.png")));
		file.add(openFile);
		
		JMenuItem close = new JMenuItem("Close");
		close.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/exit1.png")));
		file.add(close);
		
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);
		
		JMenuItem clean = new JMenuItem("Clean");
		clean.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/clean.png")));
		edit.add(clean);
		
		JMenu help = new JMenu("Help");
		menuBar.add(help);
		
		JMenuItem helpContents = new JMenuItem("Help Contents");
		helpContents.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/help.png")));
		help.add(helpContents);
		
		JMenuItem aboutDVA = new JMenuItem("About DVA");
		aboutDVA.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/IconDVA.PNG")));
		help.add(aboutDVA);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	
	

}
