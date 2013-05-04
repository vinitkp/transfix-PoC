import java.util.*;
import javax.swing.*;
import java.awt.*;
class InternationalizationSupportProg{
	public InternationalizationSupportProg(){
		JFrame jf = new JFrame("multiple languages");
		jf.setPreferredSize(new Dimension(600,300));
		JTable t = new JTable(12,1);
		t.setEnabled(false);
		JButton b1= new JButton("English");
		JButton b2 = new JButton("Hindi");
		jf.add(b1);
		jf.add(b2);
		jf.add(t);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		String language;
		String country;
		language = new String("en");
		country = new String("US");
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale(language, country);
		System.out.println(currentLocale);
		messages = ResourceBundle.getBundle("for_use_poc-martus_random-strings");
		System.out.println(messages.toString());
		System.out.println(messages.getString("building"));
	}
	public static void main(String []args){
		InternationalizationSupportProg p = new InternationalizationSupportProg();
	}

}
