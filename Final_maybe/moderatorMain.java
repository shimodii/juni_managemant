import javax.swing.*;

public class moderatorMain {

	public static void main(String args[]){
		//main frame
		JFrame mainFrame = new JFrame("صفحه اصلی");
		
		String nameStr = "امیرمحمد";
		
		moderatorPages.createNews(mainFrame,nameStr);	
	}
}
