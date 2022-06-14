import javax.swing.*;

public class studentMain {
	public static void main(String args[]){
		String test = "امیرمحد";
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		functions.menuBar.student(mainFrame);
		functions.header.showHeader(mainFrame,test);
		//studentPages.removeUnit(mainFrame,12);
		//commonPages.profileEdit(mainFrame);
		//commonPages.leaveForm(mainFrame,12);
		commonPages.contactWays(mainFrame);
	}
}
