import javax.swing.*;

public class studentMain {
	public static void main(String args[]){
		String test = "امیرمحد";
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		functions.menuBar.student(mainFrame);
		functions.header.showHeader(mainFrame,test);
		//studentPages.removeUnit(mainFrame,12);
		//studentPages.payment(mainFrame,12);
		//studentPages.teacherGrading(mainFrame,12);
		//studentPages.unitSelect(mainFrame,12);
		//commonPages.loan(mainFrame,12);
		studentPages.viewUnits(mainFrame,12);
		//commonPages.login(mainFrame);
		//commonPages.profileEdit(mainFrame);
		//commonPages.leaveForm(mainFrame,12);
		//commonPages.contactWays(mainFrame);
	}
}
