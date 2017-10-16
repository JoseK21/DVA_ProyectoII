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
import javax.swing.JTextArea;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.JSeparator;

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
		setAutoRequestFocus(false);
		setTitle("DVA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfaceStart.class.getResource("/Image/IconDVA.PNG")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 735);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem insertCode = new JMenuItem("Insert Code");
		insertCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Code.showInsertCode();
			}
		});
		insertCode.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/code1.png")));
		file.add(insertCode);
		
		JMenuItem openFile = new JMenuItem("Open File");
		openFile.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/file.png")));
		file.add(openFile);
		
		JMenuItem close = new JMenuItem("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
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
		aboutDVA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpContents.showHelpContents();
				
			}
		});
		aboutDVA.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/IconDVA.PNG")));
		help.add(aboutDVA);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Consolas", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setBounds(0, 0, 368, 720);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Consolas", Font.PLAIN, 13));
		textArea_1.setEditable(false);
		textArea_1.setBounds(1074, 622, 310, 53);
		contentPane.add(textArea_1);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(374, 0, 694, 675);
		contentPane.add(canvas);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Consolas", Font.PLAIN, 13));
		textArea_2.setEditable(false);
		textArea_2.setBounds(1074, 441, 310, 184);
		contentPane.add(textArea_2);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBounds(1069, 0, 315, 408);
		contentPane.add(canvas_1);
		
		JButton stepInto = new JButton("Step Into");
		stepInto.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/stepInto.png")));
		stepInto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		stepInto.setBounds(1074, 414, 162, 25);
		contentPane.add(stepInto);
		
		JButton stepOver = new JButton("Step Over");
		stepOver.setIcon(new ImageIcon(InterfaceStart.class.getResource("/Image/stepOver.png")));
		stepOver.setBounds(1230, 414, 154, 25);
		contentPane.add(stepOver);
	}
}
