import javax.swing.*;

public class studentPages {
	public static class unitForm {
		String unitName,unitTeacher,unitCode; //take from db
		JCheckBox unitCb;
		JLabel unitLabe,teacherLabel,unitCodeLabel;
	}
	public static class teacherGradingForm {
		String teacherName;
		JLabel teacherLabel,goodL,badL;
		JCheckBox goodC,badC;
	}
	
	public static void unitSelect(JFrame mainFrame,int id){
		String units_arr[] = {"math","ap","physics"}/*store from DB*/;
		String teachers[] = {"rostami","minoofam","mahzoon"};
		unitForm[] us = new unitForm[units_arr.length];
		
		int unitLabelx=100,chechBoxx=70,teacherLabelx=200,yoffset=150; 
		
		//title
		JLabel titleLabel = new JLabel("انتخاب واحد");
		titleLabel.setBounds(850,100,100,30);
		mainFrame.add(titleLabel);

		JButton unitSubmitButton = new JButton("ثبت دروس");
		
		//texfield form 
		JLabel unitSelectByCodeLabel = new JLabel("انتخاب واحد با کد درس");
		JTextField unitCodePrompt = new JTextField();
		JLabel unitCodeLabel = new JLabel("کد درس:");
		JButton submitByCodeButton = new JButton("ثبت درس");
		
		unitSelectByCodeLabel.setBounds(770,160,200,30);
		unitCodeLabel.setBounds(770,190,100,30);
		unitCodePrompt.setBounds(600,190,150,30);
		submitByCodeButton.setBounds(600,260,130,40);

		mainFrame.add(unitSelectByCodeLabel);
		mainFrame.add(unitCodeLabel);
		mainFrame.add(unitCodePrompt);
		mainFrame.add(submitByCodeButton);


		for (int i=0;i<us.length;i++) {
			us[i] = new unitForm();
			us[i].unitCb = new JCheckBox();
			us[i].unitLabe = new JLabel(units_arr[i]);
			us[i].teacherLabel = new JLabel(teachers[i]);
			
			us[i].unitCb.setBounds(chechBoxx,yoffset,20,20);
			us[i].unitLabe.setBounds(unitLabelx,yoffset,100,30);
			us[i].teacherLabel.setBounds(teacherLabelx,yoffset,100,30);
			
			yoffset = yoffset + 40;

			mainFrame.add(us[i].unitCb);
			mainFrame.add(us[i].unitLabe);
			mainFrame.add(us[i].teacherLabel);

			}
		unitSubmitButton.setBounds(100,yoffset,120,40);
		mainFrame.add(unitSubmitButton);

	}
	public static void removeUnit(JFrame mainFrame,int id){
		//title 
		JLabel titleLabel = new JLabel("حذف واحد درسی");
		titleLabel.setBounds(800,150,100,30);
		mainFrame.add(titleLabel);	

		String[] units = {"Math","AP","Phisycs"}/*store from DB*/ ;
		int lxoff=100,cxoff=65,yoff=200;
		unitForm[] unitToRemove = new unitForm[units.length];
		for(int i=0;i<unitToRemove.length;i++){
			unitToRemove[i] = new unitForm();
			unitToRemove[i].unitLabe = new JLabel();
			unitToRemove[i].unitCb = new JCheckBox();
			
			unitToRemove[i].unitLabe.setText(units[i]);

			unitToRemove[i].unitLabe.setBounds(lxoff,yoff,200,30);
			unitToRemove[i].unitCb.setBounds(cxoff,yoff,25,25);
			
			mainFrame.add(unitToRemove[i].unitLabe);
			mainFrame.add(unitToRemove[i].unitCb);
			
			yoff = yoff + 50;	
		}
		//remove button
		JButton removeButton = new JButton("حذف");
		removeButton.setBounds(700,yoff,100,30);
		mainFrame.add(removeButton);
	
	}
	public static void viewUnits(JFrame mainFrame,int id){
		String[] currentUnits = {"math","ap"}/*FROM DB*/;
		String[] teachersList = {"rostami","minoofam"};
		String[] unitsCode = {"123","456"};

		unitForm[] unitsList = new unitForm[currentUnits.length];

		int unitLabelx=100,teacherLabelx=230,codeLabelx=360,yoffset=140;

		for (int i=0;i<currentUnits.length;i++){
			unitsList[i] = new unitForm();
			
			unitsList[i].unitName = currentUnits[i];
			unitsList[i].unitTeacher = teachersList[i];
			unitsList[i].unitCode = unitsCode[i];

			unitsList[i].unitLabe = new JLabel(unitsList[i].unitName);
			unitsList[i].teacherLabel = new JLabel(unitsList[i].unitTeacher);
			unitsList[i].unitCodeLabel = new JLabel(unitsList[i].unitCode);

			unitsList[i].unitLabe.setBounds(unitLabelx,yoffset,100,30);
			unitsList[i].teacherLabel.setBounds(teacherLabelx,yoffset,100,30);
			unitsList[i].unitCodeLabel.setBounds(codeLabelx,yoffset,200,30);

			mainFrame.add(unitsList[i].unitLabe);
			mainFrame.add(unitsList[i].teacherLabel);
			mainFrame.add(unitsList[i].unitCodeLabel);

			yoffset = yoffset + 40;
		}
	}
	public static void teacherGrading(JFrame mainFrame,int id){
		JLabel titleLabel = new JLabel("ارزشیابی اساتید");
		JButton submitButton = new JButton("ثبت نظر");

		titleLabel.setBounds(900,60,100,30);
		mainFrame.add(titleLabel);

		int goodCheckboxXoffset=500;
		int goodLabelXoffset=530;
		int badChechboxXoffset=700;
		int badLabelXoffset=730;
		int yoffset=100;
		int teacherNameLabelXoffset=100;
		

		String[] teachersList = {"minoofam","panahi","amirmohammad"} /*DB*/;
		teacherGradingForm[] tg = new teacherGradingForm[teachersList.length];
		for(int i=0;i<teachersList.length;i++){
			tg[i] = new teacherGradingForm();
			//System.out.println(teachersList[i]);
			tg[i].teacherName = teachersList[i];
			//tg[i].teacherName = "helllo";
			tg[i].teacherLabel = new JLabel();
			tg[i].goodL = new JLabel("خوب");
			tg[i].badL = new JLabel("بد");
			tg[i].badC = new JCheckBox();
			tg[i].goodC = new JCheckBox();
	
			tg[i].teacherLabel.setText(tg[i].teacherName);
				
			tg[i].teacherLabel.setBounds(teacherNameLabelXoffset,yoffset,200,30);
			tg[i].goodC.setBounds(goodCheckboxXoffset,yoffset,30,30);
			tg[i].goodL.setBounds(goodLabelXoffset,yoffset,100,30);
			tg[i].badC.setBounds(badChechboxXoffset,yoffset,30,30);
			tg[i].badL.setBounds(badLabelXoffset,yoffset,100,30);

			yoffset = yoffset + 65;

			mainFrame.add(tg[i].teacherLabel);
			mainFrame.add(tg[i].goodC);
			mainFrame.add(tg[i].goodL);
			mainFrame.add(tg[i].badC);
			mainFrame.add(tg[i].badL);
		}
		submitButton.setBounds(200,yoffset,140,40);
		mainFrame.add(submitButton);
	}
	public static void eduStatus(JFrame mainFrame,int id){
		
	}
	public static void payment(JFrame mainFrame,int id){
		int dept = 200/*STORE FROM DB*/;
		JLabel titleLabel = new JLabel("پرداخت شهریه");
		JLabel deptNote = new JLabel();
		JLabel deptStatus = new JLabel();
		JButton payButton = new JButton("پرداخت");
		JLabel countity = new JLabel("مبلغ");
		JTextField moneyField = new JTextField();

		if(dept >= 0){
			deptStatus.setText("بده کار");
		}else{
			deptStatus.setText("بستانکار");
		}
		
		deptNote.setText("تراز مالی: "+ dept);

		//xy
		titleLabel.setBounds(900,200,100,30);
		deptNote.setBounds(400,300,100,30);
		deptStatus.setBounds(550,300,100,30);
		moneyField.setBounds(400,380,100,30);
		countity.setBounds(550,380,100,30);
		payButton.setBounds(400,450,100,40);
		
		//add
		//
		mainFrame.add(titleLabel);
		mainFrame.add(deptNote);
		mainFrame.add(deptStatus);
		mainFrame.add(moneyField);
		mainFrame.add(countity);
		mainFrame.add(payButton);

	}
	public static void eshteghal(JFrame mainFrame,String nameStr){
		
		JLabel eshteghalNote = new JLabel();
		eshteghalNote.setText("گواهی میشود دانشجو"+ nameStr + "در حال اشتغال به تحصیل میباشد");
		
		eshteghalNote.setBounds(500,250,400,400);

		mainFrame.add(eshteghalNote);
	}
	public static void showKarname(JFrame mainFrame,int id){
	}

}
