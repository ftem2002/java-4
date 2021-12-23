package scanner_swing;
import javax.swing.JOptionPane;
public class home_work_4_swing
{

	public static void main(String[] args)
	{
		String height , width ;
		int h , w , area ;
		
		height = JOptionPane.showInputDialog(" enter the height :")	;
		h = Integer.parseInt(height);
		
		width = JOptionPane.showInputDialog(" enter the width : ");
		w = Integer.parseInt(width) ;
		
        area = w * h ;
        JOptionPane.showMessageDialog(null, " area = " + area);
        System.exit(0);
	}

}
