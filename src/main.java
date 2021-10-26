import java.awt.FlowLayout;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Journal App");
		
		
		frame.setSize(1100,900);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
