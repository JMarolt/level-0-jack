import javax.swing.JOptionPane;

public class soemthingelse {
	public static void main(String[] args) {
for(int i = 0; i < 3; i++) {
	// Ask the user what height they are. 
		String fourfootandunder = "You are too short sorry";
String height = 	JOptionPane.showInputDialog("What is your height");
int h = Integer.parseInt(height);
if(h < 4) {
	JOptionPane.showMessageDialog(null, "Sorry, you are too short");
}
else	{
	JOptionPane.showMessageDialog(null, "Ok, go have fun");
// If they are over 4ft, tell them they can go on the rollercoaster. 
	// If they are under 4ft, tell them they need to grow more first.		
}
}
}
}