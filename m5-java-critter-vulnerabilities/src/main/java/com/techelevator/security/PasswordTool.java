package com.techelevator.security;

import org.bouncycastle.util.encoders.Base64;

public class PasswordTool {
	
	public static void main(String[] args) {
		
		String password = "a1b2c3!4";
		
		PasswordHasher hasher = new PasswordHasher();
		
		byte[] salt = hasher.generateRandomSalt();
		String saltString = new String(Base64.encode(salt));
		
		String passwordHash = hasher.computeHash(password, salt);
		
		System.out.println("password: " + password);
		System.out.println("Salt: " + saltString);
		System.out.println("passwordHash: " + passwordHash);
		
	}

}
