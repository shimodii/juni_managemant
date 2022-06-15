import javax.swing.*;

public class studentPages {
	public static class unitForm {
		String unitName,unitTeacher; //take from db
		JCheckBox unitCb;
		JLabel unitLabe,teacherLabel;
	}
	public static class teacherGradingForm {
		String teacherName;
		JLabel teacherLabel,goodL,badL;
		JCheckBox goodC,badC;
	}
	
	public static void unitSelect(JFrame mainFrame,int id){
			
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
		
	}
	public static void teacherGrading(JFrame mainFrame,int id){
		
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
		functions.menuBar.student(mainFrame);	
	}
	public static void showKarname(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);	
	}

}
