import javax.swing.*;

public class moderatorPages{
	public static void mainPage(JFrame mainFrame,String nameStr){
		// menuBar and header 
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
	public static void createNews(JFrame mainFrame,String nameStr){
		functions.menuBar.staff(mainFrame);
		functions.header.showHeader(mainFrame,nameStr);
		
		//component
		JTextArea newsField = new JTextArea(); //text field for news
		JLabel newsLabel = new JLabel("خبر جدید:"); //news label
		JButton subNews = new JButton("ثبت خبر"); // submit button
		
		//xy
		newsField.setBounds(300,220,600,400); //field
		newsLabel.setBounds(900,170,100,30); //news Label
		subNews.setBounds(300,650,100,30);
		
		//adding
		mainFrame.add(subNews);
		mainFrame.add(newsField);
		mainFrame.add(newsLabel);
	}
	public static void deleteUser(JFrame mainFrame, String id){
		
	}
	public static void crediting(JFrame mainFrame){
		
	}
}
