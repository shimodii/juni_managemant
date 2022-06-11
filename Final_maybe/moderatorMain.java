import javax.swing.*;

public class moderatorMain {

	public static void main(String args[]){
		//main frame
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		String nameStr = "امیرمحمد";
		
		//menubar and header
		functions.menuBar.staff(mainFrame);
		functions.header.showHeader(mainFrame,nameStr);
		
		//menu items
		JButton menuCredit = new JButton("اعتبار سنجی کارکنان");
		JButton menuNews = new JButton("ایجاد خبر جدید");
		JButton menuDelete = new JButton("حذف کاربر");

		//xy
		menuCredit.setBounds(500,300,200,40);
		menuNews.setBounds(500,370,200,40);
		menuDelete.setBounds(500,430,200,40);

		//add
		mainFrame.add(menuCredit);
		mainFrame.add(menuNews);
		mainFrame.add(menuDelete);
	}
}
