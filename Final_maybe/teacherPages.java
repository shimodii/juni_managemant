import javax.swing.*;

public class teacherPages {
	public static class gradingForm {
		String nameStr,studentCodeStr;
		JLabel nameCodeLabel;
		JTextField markField;
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
}
