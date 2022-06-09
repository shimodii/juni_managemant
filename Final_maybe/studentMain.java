import javax.swing.*;

public class studentMain {
	public static void main(String args[]){
		String test = "امیرمحد";
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		menuBar.student(mainFrame);
		header.showHeader(mainFrame,test);
	}
}
