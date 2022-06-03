import javax.swing.*;

public class Main {
	//every UI class must called with username that loged-in so:
	String username;
	public static void main(String[] args) {
		//mainFrame 
		JFrame mainFrame = new JFrame("صفحه اصلی");

		//variables
		JMenuBar teacherMB = new JMenuBar();
		JMenu menuTahsili = new JMenu("امور تحصیلی");
		JMenu menuMali = new JMenu("امور مالی");
		JMenu menuEdari = new JMenu("امور اداری");
		JMenu menuExtra = new JMenu("متفرقه");
		/* --tahsili menu submenus-- */
		JMenuItem tahsiliNomre = new JMenuItem("نمره دهی");
		JMenuItem tahsiliHazf = new JMenuItem("حذف دانشجو");
		JMenuItem tahsiliMoshahedeD = new JMenuItem("مشاهده دروس");
		JMenuItem tahsiliMoshDan = new JMenuItem("مشاهده لیست دانشجویان");
		/* --mali menu submenu-- */
		JMenuItem maliVaziyat = new JMenuItem("مشاهده تراز مالی");
		JMenuItem maliVaam = new JMenuItem("درخواست وام");
		/* --edari menu submenu-- */
		JMenuItem edariMorakhasi = new JMenuItem("ثبت مرخصی");
		/* --extra menu submenu-- */
		JMenuItem extraProfedit = new JMenuItem("ویرایش پروفایل");
		JMenuItem extraContact = new JMenuItem("راه های ارتباطی");
		JMenuItem extraGuide = new JMenuItem("راهنما");

		//adding submenus to menubar
		teacherMB.add(menuTahsili);
		teacherMB.add(menuMali);
		teacherMB.add(menuEdari);
		teacherMB.add(menuExtra);
		/* --tahsili submenu-- */
		menuTahsili.add(tahsiliNomre);
		menuTahsili.add(tahsiliHazf);
		menuTahsili.add(tahsiliMoshahedeD);
		menuTahsili.add(tahsiliMoshDan);
		/* --mali submenu-- */
		menuMali.add(maliVaziyat);
		menuMali.add(maliVaam);
		/* --edari submenu-- */
		menuEdari.add(edariMorakhasi);
		/* --extra submenu-- */
		menuExtra.add(extraProfedit);
		menuExtra.add(extraContact);
		menuExtra.add(extraGuide);

		//adding elements to mainFrame
		mainFrame.setJMenuBar(teacherMB);
		
		//mainFrame init
		mainFrame.setSize(1270,1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}
