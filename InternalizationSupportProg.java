import java.util.*;
class InternationalizationSupportProg{
	public InternationalizationSupportProg(){
		String language;
		String country;
		language = new String("hi");
		country = new String("US");
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("for_use_poc-martus_random-strings",currentLocale);
		System.out.println(messages.getString("building"));
	}
	public static void main(String []args){
		InternationalizationSupportProg p = new InternationalizationSupportProg();
	}

}
