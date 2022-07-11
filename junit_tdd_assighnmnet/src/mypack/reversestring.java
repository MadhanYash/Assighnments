package mypack;

public class reversestring {
	public static String simbleremove(String str) {
		String convertedstring=str.replaceAll("[^a-z,A-Z]","");
		return convertedstring;
	}

}
