package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class MenuPrincipal extends JFrame {
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("SISTEMA DE FACTURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 398);
		
		JMenuBar MenuBar = new JMenuBar();
		MenuBar.setBackground(Color.ORANGE);
		MenuBar.setForeground(Color.ORANGE);
		setJMenuBar(MenuBar);
		
		JMenu mnNewMenu = new JMenu("Sistema");
		MenuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnNewMenu.setVisible(rootPaneCheckingEnabled);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Cliente");
		MenuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Crear Cliente");
		CrearCliente crearCliente = new CrearCliente();
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(crearCliente);
				crearCliente.setVisible(true);
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista Cliente");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Productos");
		MenuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Redes Sociales");
		MenuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Facebook");
		mntmNewMenuItem_3.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/facebook-icon-50x50-21 (1).jpg")));
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Instagram");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-30, -76, 956, 889);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		panel.add(desktopPane, "name_169561484276900");
		desktopPane.setLayout(null);
	}
	
}
