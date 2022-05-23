import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		//mainFrame 
		JFrame mainFrame = new JFrame("Login");

		//variables
		/* --LABELS-- */
		JLabel user_id = new JLabel("Username:");
		JLabel user_pass = new JLabel("Password:");
		/* --USERNAME/PASSWORD FIELDS-- */
		JTextField usernameField = new JTextField(8);
		JPasswordField passwordFiled = new JPasswordField(10);
		/* --RADIO BUTTONS-- */
		JRadioButton staffButton = new JRadioButton("staff");
		JRadioButton studentButton = new JRadioButton("student");
		JRadioButton teacherButton = new JRadioButton("teacher");
		/* --LOGIN BUTTON-- */
		JButton loginButton = new JButton("Login!");

		//geo
		user_id.setBounds(100,75,100,40); //username label
		user_pass.setBounds(100,135,100,40); //password label
		usernameField.setBounds(200,80,200,30); //username field
		passwordFiled.setBounds(200,140,200,30); //password field
		staffButton.setBounds(120,205,80,30); //staff button
		teacherButton.setBounds(200,205,80,30); //teacher button
		studentButton.setBounds(300,205,80,30); //student button
		loginButton.setBounds(200,300,120,30); //login button

		//adding elements to mainFrame
		mainFrame.add(user_id);
		mainFrame.add(user_pass);
		mainFrame.add(usernameField);
		mainFrame.add(passwordFiled);
		mainFrame.add(staffButton);
		mainFrame.add(studentButton);
		mainFrame.add(teacherButton);
		mainFrame.add(loginButton);

		//mainFrame init
		mainFrame.setSize(520,430);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}