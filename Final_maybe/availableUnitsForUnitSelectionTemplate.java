import javax.swing.*;

public class main {
	public static void main(String args[]){
		JFrame mainFrame = new JFrame("main window");
		String[] avaUid = {};
		String[] avaUname = {};
		String[] avaUteacher = {};
		
		int yoff=170;

		JLabel avaUnitLbl = new JLabel();
		for (int i=0;i<avaUid.length;i++){
			avaUnitLbl.setText(avaUname+" "+avaUteacher+" "+avaUid);
			avaUnitLbl.setBounds(50,yoff,400,30);

			mainFrame.add(avaUnitLbl);

			yoff = yoff + 50;
		}
	}	
}
