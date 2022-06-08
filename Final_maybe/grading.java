import javax.swing.*;

public class grading {
	public static class gradingForm {
		String name="some";
		JLabel nameLabel;
		JTextField markField;
	}
	public static void main(String args[]){
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
		
				
		// grading Form
		int lxoff=150; // xoffset of lables 
		int txoff=550; // xoffset of textfields
		int yoff=100; // yoffset of lables and textfileds // will increase with loop index
		
		/* SUBMIT MARKS */
		JButton subButton = new JButton("ثبت نمرات");
		subButton.setBounds(1020,800,100,40);

		/* NEXT AND PRE PAGE BUTTON */
		JButton nextPage = new JButton("صفحهه بعدی");
		JButton prePage = new JButton("صفحه قبلی");
		nextPage.setBounds(900,800,100,40);
		prePage.setBounds(780,800,100,40);
		
		// DB QUERY ->  STORE NAMES FROM DB TO ARRAY

		// store names from db to array
		String[] namesArr = {"SINA","KIARASH","AMIRMOHAMMAD"}/*names from db*/ ;
		gradingForm[] studentForm = new gradingForm[namesArr.length];
		for (int i=0;i<studentForm.length;i++){
			studentForm[i] = new gradingForm();
			studentForm[i].name=namesArr[i];
			studentForm[i].nameLabel = new JLabel();
			studentForm[i].markField = new JTextField();
			studentForm[i].nameLabel.setText(studentForm[i].name);
	
			studentForm[i].nameLabel.setBounds(lxoff,yoff,200,30);
			studentForm[i].markField.setBounds(txoff,yoff,50,40);
			yoff = yoff + 70 ;	

			mainFrame.add(studentForm[i].nameLabel);
			mainFrame.add(studentForm[i].markField);
		}
		// adding submit and next and pre page BUTTONon to jframe
		mainFrame.add(subButton);	
		mainFrame.add(nextPage);
		mainFrame.add(prePage);
		//mainFrame init
		mainFrame.setSize(1270,1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);

	}
}
