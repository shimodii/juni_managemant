import javax.swing.*;

public class teacherPages {
	public static class gradingForm {
		String nameStr,studentCodeStr;
		JLabel nameCodeLabel;
		JTextField markField;

		JLabel nameLbl,courseLbl,majorLbl;
	}
	public static void viewUnits(JFrame mainFrame,int id){
		JLabel titleLabel = new JLabel("مشاهده دروس");
		titleLabel.setBounds(900,100,100,30);
		mainFrame.add(titleLabel);
		
		JLabel courseIdPup = new JLabel();
		int namex=60,yoffset=170;

		String[] courseNameList = {}/*DB*/;
		String[] courseIdList = {}/*DB*/;
		String[] coursePupList = {}/*DB*/;


		for(int i=0;i<studentsFirst.length;i++){
			courseIdPup.setText(courseNameList[i]+":"+courseIdList[i]+"           "+coursePupList[i]);
			courseIdPup.setBounds(namex,yoffset,400,30);
			mainFrame.add(courseIdPup);

			yoffset = yoffset + 50;
		}
	}
	public static void viewStudents(JFrame mainFrame,int id){
		JLabel titleLabel = new JLabel("مشاهده لیست دانشجویان");
		titleLabel.setBounds(900,100,100,30);
		mainFrame.add(titleLabel);
		
		JLabel nameCourseMajor = new JLabel();
		int namex=60,yoffset=170;

		String[] studentsFirst = {} /*DB*/;
		String[] studentLast = {} /*DB*/;
		String[] courseName = {} /*DB*/;
		String[] studentMajor = {} /*DB*/;

		for(int i=0;i<studentsFirst.length;i++){
			nameCourseMajor.setText(studentsFirst[i]+" "+studentLast[i]+" - "+courseName[i]+" - "+studentMajor[i]);
			nameCourseMajor.setBounds(namex,yoffset,400,30);
			mainFrame.add(nameCourseMajor);

			yoffset = yoffset + 50;
		}
			
	}
	public static void mainPage(JFrame mainFrame){
	
		JLabel mainPageLabel = new JLabel("جونی منیجمنت، زیبا پیشرو مطمئن");

		mainPageLabel.setBounds(450,450,200,30);

		mainFrame.add(mainPageLabel);
	}
	public static void grading (JFrame mainFrame,int id) {
		String[] studentNames = {"خیارش","سینا","امیرمحمد"};
		String[] studentCodes = {"123","456","789"};
		
		JButton submitMarksButton = new JButton("ثبت نمرات");	

		int nameLabelx=50,markFieldx=250,yoffset=130;

		gradingForm[] marking = new gradingForm[studentNames.length];

		for (int i=0;i<marking.length;i++){
			marking[i] = new gradingForm();

			marking[i].nameCodeLabel = new JLabel(studentNames[i] + studentCodes[i]);
			marking[i].markField = new JTextField();

			marking[i].nameCodeLabel.setBounds(nameLabelx,yoffset,200,30);
			marking[i].markField.setBounds(markFieldx,yoffset,80,30);

			mainFrame.add(marking[i].nameCodeLabel);
			mainFrame.add(marking[i].markField);

			yoffset = yoffset + 40;
		}
		yoffset = yoffset + 20;

		submitMarksButton.setBounds(nameLabelx,yoffset,130,40);
		mainFrame.add(submitMarksButton);
	}
	public static void dept(JFrame mainFrame,int id){
		Jlabel titleLabel = new JLabel("مشاهده تراز مالی");
		titleLabel.setBounds(900,150,100,30);
		mainFrame.add(titleLabel);


		int mark = /* from db */;
		int dept = /* from db */;
		JLabel deptNewLabel;
		JLabel pointStatus = new JLabel();
		JLabel mainDeptLabel = new JLabel(dept);
		
		pointStatus.setText("بدون پاداش یا کسری");
		
		if (mark > 0){
			dept = dept + (dept * 0.05);
			deptNewLabel = new JLabel(dept + "ریال");
			pointStatus.setText("با ۵% پاداش به دلیل رضایت دانشجو");
		}else if (mark < 0){
			dept = dept - (dept * 0.05);
			deptNewLabel = new JLabel(dept + "ریال");
			pointStatus.setText("با ۵% کسری به دلیل عدم رضایت دانشجو");
		}
		
		
		pointStatus.setBounds(200,230,100,30);
		deptNewLabel.setBounds(200,280,100,30);
		mainDeptLabel.setBounds(200,330,100,30);

		mainFrame.add(pointStatus);
		mainFrame.add(deptNewLabel);
		mainFrame.add(mainDeptLabel);
	}
}
