package p5;

import java.util.ResourceBundle;

public class ResBundle {
	public static String get(String x) {
		ResourceBundle rs = ResourceBundle.getBundle("messages");
		return rs.getString(x);
	}
}
