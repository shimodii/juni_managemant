import javax.swing.*;

public class studentMain {
	public static void main(String args[]){
		String test = "امیرمحد";
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		functions.menuBar.staff(mainFrame);
		functions.header.showHeader(mainFrame,test);
	}
}
