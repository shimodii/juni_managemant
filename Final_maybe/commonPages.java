import javax.swing.*;

public class commonPages {
	public static class loanDetail {
		String money;
		JLabel loanText;
		JCheckBox loanCheck;
	}
	public static void login(JFrame mainFrame){
		JLabel user_id = new JLabel("شماره کاربری:");
		JLabel user_pass = new JLabel("رمز عبور:");
		
		JTextField usernameField = new JTextField(8);
		JPasswordField passwordFiled = new JPasswordField(10);
		
		JRadioButton staffButton = new JRadioButton("کارکنان");
		JRadioButton studentButton = new JRadioButton("دانشجویان");
		JRadioButton teacherButton = new JRadioButton("اساتید");
		
		JButton loginButton = new JButton("ورود");
		JButton guideButton = new JButton("راهنما");
			
		
		user_id.setBounds(100,75,100,40); //username label
		user_pass.setBounds(100,135,100,40); //password label
		usernameField.setBounds(200,80,200,30); //username field
		passwordFiled.setBounds(200,140,200,30); //password field
		staffButton.setBounds(120,205,80,30); //staff button
		teacherButton.setBounds(200,205,80,30); //teacher button
		studentButton.setBounds(300,205,80,30); //student button
		loginButton.setBounds(200,300,120,30); //login button
		guideButton.setBounds(420,10,70,27); //guide button

		
		mainFrame.add(user_id);
		mainFrame.add(user_pass);
		mainFrame.add(usernameField);
		mainFrame.add(passwordFiled);
		mainFrame.add(staffButton);
		mainFrame.add(studentButton);
		mainFrame.add(teacherButton);
		mainFrame.add(loginButton);
		mainFrame.add(guideButton);

		mainFrame.setSize(520,430);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
	public static void profileEdit(JFrame profPanel){
		String notice = """
			*موارد ستاره دار ضروری بوده و خالی گذاشتن فیلد های غیر ضروری به منزله عدم تغییر در آنهاست.
			""";
		
		JLabel usernameLabel = new JLabel("نام کاربری*"); //user label
		JTextField usernameField = new JTextField(11); //username prompt
		JLabel oldpassLabel = new JLabel("رمز عبور قدیمی*");	//old password label
		JPasswordField oldpasswordFiled = new JPasswordField(11); //old password prompt
		JLabel newpassLable = new JLabel("رمز عبور جدید");	//new password label
		JPasswordField newpasswordFiled = new JPasswordField(10); //new password prompt
		JLabel newpassrepLable = new JLabel("تکرار رمز عبور جدید"); //new pass repeat
		JPasswordField newpassrepField = new JPasswordField(11); //new pass repeat
		JLabel newphoneLable = new JLabel("شماره تلفن جدید");  //new phone number label
		JTextField newphoneField = new JTextField(11); //new phone prompt
		JLabel noticeLabel = new JLabel(notice); //notice label
		JButton subButton = new JButton("اعمال تغییرات"); //Done button
		JButton cancelButton = new JButton("انصراف"); //cancel button
		
		//xy
		usernameLabel.setBounds(100,100,100,40);
		usernameField.setBounds(250,100,200,30);
		oldpassLabel.setBounds(100,150,100,40);
		oldpasswordFiled.setBounds(250,150,200,30);
		newpassLable.setBounds(100,200,100,40);
		newpasswordFiled.setBounds(250,200,200,30);
		newpassrepLable.setBounds(100,250,100,40);
		newpassrepField.setBounds(250,250,200,30);
		newphoneLable.setBounds(100,300,100,40);
		newphoneField.setBounds(250,300,200,30);
		noticeLabel.setBounds(50,270,600,300);
		subButton.setBounds(340,510,120,30);
		cancelButton.setBounds(120,510,120,30);

		//adding elements	
		profPanel.add(usernameLabel);
		profPanel.add(usernameField);
		profPanel.add(oldpassLabel);
		profPanel.add(oldpasswordFiled);
		profPanel.add(newpassLable);
		profPanel.add(newpasswordFiled);
		profPanel.add(newpassrepLable);
		profPanel.add(newpassrepField);
		profPanel.add(newphoneLable);
		profPanel.add(newphoneField);
		profPanel.add(noticeLabel);
		profPanel.add(subButton);
		profPanel.add(cancelButton);

	}
	public static void leaveForm(JFrame mainFrame,int id){
		int restHours = 12/* take database */;
		JLabel restHoursLabel = new JLabel();
		JLabel titleLabel = new JLabel("ثبت مرخصی");
		JTextField leaveValue = new JTextField();
		JButton leaveSub = new JButton("ثبت");

		restHoursLabel.setText("ساعات باقی مانده :"+restHours );

		titleLabel.setBounds(1000,120,80,30);
		restHoursLabel.setBounds(800,200,150,30);
		leaveValue.setBounds(800,250,100,30);
		leaveSub.setBounds(800,310,90,20);

		mainFrame.add(titleLabel);
		mainFrame.add(restHoursLabel);
		mainFrame.add(leaveValue);
		mainFrame.add(leaveSub);
	}
	public static void contactWays(JFrame mainFrame){
		JLabel phone = new JLabel("+98-912345678");
		JLabel email = new JLabel("juni@contact.com");
		JLabel postalCode = new JLabel("123456");
		JLabel address = new JLabel("خیابان شهدای ۸ ام، پلاک ۱۰۵۷");
		
		int xoff=512;
		phone.setBounds(xoff,200,300,30);
		email.setBounds(xoff,260,300,30);
		postalCode.setBounds(xoff,320,300,30);
		address.setBounds(xoff,380,300,30);

		mainFrame.add(address);
		mainFrame.add(phone);
		mainFrame.add(email);
		mainFrame.add(postalCode);
	}
	public static void loan(JFrame mainFrame,int id){
	//	int userCredit=/*from db*/;
		String[] loanMoney = {"40","70","100"};
		loanDetail[] ld = new loanDetail[loanMoney.length];
		
		int checkBoxx=70,labelx=95,yoffset=120;

		JLabel titleLabel = new JLabel("درخواست وام");
		titleLabel.setBounds(850,120,100,30);
		mainFrame.add(titleLabel);
		
		JButton submitLoanButton = new JButton("درخواست وام");

		for(int i=0;i<ld.length;i++){
			ld[i] = new loanDetail();
			
			ld[i].money = loanMoney[i];
			
			ld[i].loanText = new JLabel();
			ld[i].loanText.setText("تومان"+ld[i].money);
			
			ld[i].loanCheck = new JCheckBox();

			ld[i].loanText.setBounds(labelx,yoffset,100,30);
			ld[i].loanCheck.setBounds(checkBoxx,yoffset,25,25);

			mainFrame.add(ld[i].loanText);
			mainFrame.add(ld[i].loanCheck);

			yoffset = yoffset + 40;
		}
		yoffset = yoffset +20;
		submitLoanButton.setBounds(40,yoffset,120,40);
		mainFrame.add(submitLoanButton);
	}
}
