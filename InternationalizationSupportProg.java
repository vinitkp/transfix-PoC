import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
public class InternationalizationSupportProg {
	JTextArea ta;
	public InternationalizationSupportProg(){
		JFrame jf = new JFrame("multiple languages");
		jf.setSize(200,600);
		ta = new JTextArea();
		ta.setEditable(false);
		ta.setPreferredSize(new Dimension(200,500));
		jf.setLayout(new GridLayout(2,1));
		JButton b1= new JButton("English");
		JButton b2 = new JButton("Hindi");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.add(b1);
		p.add(b2);
		jf.add(p);
		jf.add(ta);
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String language;
				String country;
				ta.setText("");
				
				language = new String("en");
				country = new String("US");
				Locale currentLocale;
				ta.append("ui strings in English are\n\n");
				ResourceBundle messages;
				
				currentLocale = new Locale(language, country);
				System.out.println(currentLocale);
				messages = ResourceBundle.getBundle("for_use_poc-martus_random-strings",currentLocale);
				ta.append(messages.getString("stairs"));
				ta.append(messages.getString("photo"));
				ta.append(messages.getString("bucket"));
				ta.append(messages.getString("Building"));
				ta.append(messages.getString("door"));
				ta.append(messages.getString("food"));
				ta.append(messages.getString("window"));
				ta.append(messages.getString("home"));
				ta.append(messages.getString("bed"));
				ta.append(messages.getString("chair"));
				ta.append(messages.getString("tree"));				
			}
		});
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String language;
				String country;
				language = new String("hi");
				country = new String("IN");
				Locale currentLocale;
				ta.append("ui strings in Hindi are\n\n");
				ResourceBundle messages;
				
				currentLocale = new Locale(language, country);
				System.out.println(currentLocale);
				messages = ResourceBundle.getBundle("for_use_poc-martus_random-strings",currentLocale);
				ta.append(messages.getString("stairs"));
				ta.append(messages.getString("photo"));
				ta.append(messages.getString("bucket"));
				ta.append(messages.getString("Building"));
				ta.append(messages.getString("door"));
				ta.append(messages.getString("food"));
				ta.append(messages.getString("window"));
				ta.append(messages.getString("home"));
				ta.append(messages.getString("bed"));
				ta.append(messages.getString("chair"));
				ta.append(messages.getString("tree"));				
			}
		});
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String []args){
		InternationalizationSupportProg p = new InternationalizationSupportProg();
	}


}

