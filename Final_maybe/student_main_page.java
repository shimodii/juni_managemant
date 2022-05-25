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
		JMenu menuExtra = new JMenu("motefareghe");
		/* --tahsili menu submenus-- */
		JMenuItem tahsiliHazf = new JMenuItem("hazf/ezafe");
		JMenuItem tahsiliEntekhab = new JMenuItem("entekhab");
		JMenuItem tahsiliMoshahedeD = new JMenuItem("moshahede drus");
		JMenuItem tahsiliArzeshyabi = new JMenuItem("arzeshyabi ostad");
		JMenuItem tahsiliMoshahedeV = new JMenuItem("moshahede vaziyat");
		JMenu tahsiliKarname = new JMenu("karname");
		/* --karname submenu-- */
		JMenuItem karnameMoshahede = new JMenuItem("moshahede karname");
		JMenuItem karnameEteraz = new JMenuItem("eteraz be nomre");
		/* --mali menu submenu-- */
		JMenuItem maliPardakht = new JMenuItem("pardakht shahrie");
		JMenuItem maliVaziyat = new JMenuItem("moshahede vaziyat mali");
		JMenuItem maliVaam = new JMenuItem("darkhast vaam");
		/* --edari menu submenu-- */
		JMenuItem edariMorakhasi = new JMenuItem("darkhast morakhasi");
		JMenuItem edariEshteghal = new JMenuItem("form eshteghal be tahsil");
		/* --extra menu submenu-- */
		JMenuItem extraProfedit = new JMenuItem("virayesh profile");
		JMenuItem extraContact = new JMenuItem("rah haye ertebati");
		JMenuItem extraGuide = new JMenuItem("rahnama");

		//adding submenus to menubar
		studentMB.add(menuTahsili);
		studentMB.add(menuMali);
		studentMB.add(menuEdari);
		studentMB.add(menuExtra);
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
		/* --mali submenu-- */
		menuMali.add(maliPardakht);
		menuMali.add(maliVaziyat);
		menuMali.add(maliVaam);
		/* --edari submenu-- */
		menuEdari.add(edariMorakhasi);
		menuEdari.add(edariEshteghal);
		/* --extra submenu-- */
		menuExtra.add(extraProfedit);
		menuExtra.add(extraContact);
		menuExtra.add(extraGuide);

		//adding elements to mainFrame
		mainFrame.setJMenuBar(studentMB);
		
		//mainFrame init
		mainFrame.setSize(1270,1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}