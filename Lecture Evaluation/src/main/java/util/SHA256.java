package util;

import java.security.MessageDigest;

public class SHA256 {
	
	public static String getSHA256(String input) {
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
}
