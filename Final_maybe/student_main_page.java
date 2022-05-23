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
		/* --tahsili menu submenus-- */
		JMenuItem tahsiliEntekhab = new JMenuItem("entekhab");
		JMenuItem tahsiliMoshahedeD = new JMenuItem("moshahede drus");
		JMenuItem tahsiliArzeshyabi = new JMenuItem("arzeshyabi ostad");
		JMenuItem tahsiliMoshahedeV = new JMenuItem("moshahede vaziyat");
		JMenu tahsiliKarname = new JMenu("karname");
		/* --karname submenu-- */
		JMenuItem karnameMoshahede = new JMenuItem("moshahede karname");
		JMenuItem karnameEteraz = new JMenuItem("eteraz be nomre");

		//adding submenus to menubar
		studentMB.add(menuTahsili);
		studentMB.add(menuMali);
		studentMB.add(menuEdari);
		/* --tahsili submenu-- */
		menuTahsili.add(tahsiliEntekhab);
		menuTahsili.add(tahsiliHazf);
		menuTahsili.add(tahsiliMoshahedeD);
		menuTahsili.add(tahsiliArzeshyabi);
		menuTahsili.add(tahsiliMoshahedeV);
		menuTahsili.add(tahsiliKarname);
		/* .:karname submenu:. */
		tahsiliKarname.add(karnameMoshahede);
		tahsiliKarname.add(karnameEteraz);

		//adding elements to mainFrame
		mainFrame.setJMenuBar(studentMB);
		
		//mainFrame init
		mainFrame.setSize(1270,1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}