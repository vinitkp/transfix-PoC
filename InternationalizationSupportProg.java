import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
public class InternationalizationSupportProg {
	JTextArea ta;
	public InternationalizationSupportProg(){
		JFrame jf = new JFrame("multiple languages");
		jf.setSize(200,400);
		ta = new JTextArea();
		ta.setEditable(false);
		ta.setPreferredSize(new Dimension(200,300));
		jf.setLayout(new BorderLayout());
		JButton b1= new JButton("English");
		JButton b2 = new JButton("Hindi");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setPreferredSize(new Dimension(200,50));
		p.add(b1);
		p.add(b2);
		jf.add(p,BorderLayout.NORTH);
		jf.add(ta,BorderLayout.CENTER);
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
				ta.append("\n");
				ta.append(messages.getString("photo"));
				ta.append("\n");
				ta.append(messages.getString("bucket"));
				ta.append("\n");
				ta.append(messages.getString("Building"));
				ta.append("\n");
				ta.append(messages.getString("door"));
				ta.append("\n");
				ta.append(messages.getString("food"));
				ta.append("\n");
				ta.append(messages.getString("window"));
				ta.append("\n");
				ta.append(messages.getString("home"));
				ta.append("\n");
				ta.append(messages.getString("bed"));
				ta.append("\n");
				ta.append(messages.getString("chair"));
				ta.append("\n");
				ta.append(messages.getString("tree"));				
				ta.append("\n");
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
				ta.setText("");
				ta.append("ui strings in Hindi are\n\n");
				ResourceBundle messages;
				
				currentLocale = new Locale(language, country);
				System.out.println(currentLocale);
				messages = ResourceBundle.getBundle("for_use_poc-martus_random-strings",currentLocale);
				ta.append(messages.getString("stairs"));
				ta.append("\n");
				ta.append(messages.getString("photo"));
				ta.append("\n");
				ta.append(messages.getString("bucket"));
				ta.append("\n");
				ta.append(messages.getString("Building"));
				ta.append("\n");
				ta.append(messages.getString("door"));
				ta.append("\n");
				ta.append(messages.getString("food"));
				ta.append("\n");
				ta.append(messages.getString("window"));
				ta.append("\n");
				ta.append(messages.getString("home"));
				ta.append("\n");
				ta.append(messages.getString("bed"));
				ta.append("\n");
				ta.append(messages.getString("chair"));
				ta.append("\n");
				ta.append(messages.getString("tree"));				
				ta.append("\n");
			}
		});
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String []args){
		Properties prop = new Properties();
		 try {
			     prop.load(new FileInputStream("/for_use_poc-martus_random-strings_en_US.properties"));
                 String name = prop.getProperty("stairs");
                // String address = prop.getProperty("address");
                 System.out.println("Name: " + name);
                // System.out.println("Address: " + address);
			 } catch (Exception e) {
		          }
		InternationalizationSupportProg p = new InternationalizationSupportProg();

	}


}

