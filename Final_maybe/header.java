import javax.swing.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class header {
	public static void showHeader(JFrame mainFrame, String name){

		JLabel nameLabel = new JLabel();
		JLabel lastLogin = new JLabel();
		JButton exitButton = new JButton("خروج");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime now = LocalDateTime.now();
		// dtf.format(now) it return current time
		
		// time and name label values
		lastLogin.setText(dtf.format(now));
		nameLabel.setText(name);
		
		// xy
		exitButton.setBounds(40,40,80,30);
		nameLabel.setBounds(150,40,120,30);
		lastLogin.setBounds(210,40,100,30);

		// adding
		mainFrame.add(exitButton);
		mainFrame.add(nameLabel);
		mainFrame.add(lastLogin);

	}
}
