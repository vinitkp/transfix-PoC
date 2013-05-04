import java.util.*;
class InternationalizationSupportProg{
	public InternationalizationSupportProg(){
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
