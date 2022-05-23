import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		//mainFrame 
		JFrame mainFrame = new JFrame("Login");

		//variables
		JMenuBar studentMB = new JMenuBar();
		JMenu menuTahsili = new JMenu("tahsili");
		JMenu menuMali = new JMenu("mali");
		JMenu menuEdari = new JMenu("edari");
		JMenuItem tahsiliHazf = new JMenuItem("hazf/ezafe");
		JMenuItem tahsiliEntekhab = new JMenuItem("entekhab");

		//adding submenus
		studentMB.add(menuTahsili);
		studentMB.add(menuMali);
		studentMB.add(menuEdari);
		/* --tahsili submenu-- */
		menuTahsili.add(tahsiliEntekhab);
		menuTahsili.add(tahsiliHazf);

		//adding elements to mainFrame
		mainFrame.setJMenuBar(studentMB);
		
		//mainFrame init
		mainFrame.setSize(1270,1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}