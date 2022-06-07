import javax.swing.*;

public class grading {
	public class gradingForm {
		String name;
		JLabel nameLabel;
		JTextField markField;
	}
	public static void main(String args[]){
		int lxoff=50; // xoffset of lables 
		int txoff=100; // xoffset of textfields
		int yoff=50; // yoffset of lables and textfileds // will increase with loop index
		// store names from db to array
		String[] namesArr = /*names from db*/ ;
		gradingForm[] studentForm = new gradingForm[namesArr];
		for (int i=0;i<studentForm.length;i++){
			studentForm[i].name=namesArr[i];
			studentForm[i].nameLabel.setText(studentForm[i].name);

		}
	}
}
