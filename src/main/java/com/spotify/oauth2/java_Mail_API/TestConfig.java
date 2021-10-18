package com.spotify.oauth2.java_Mail_API;

import com.spotify.oauth2.constants.FrameworkConstants;

/**
 * Data for Sending EMail after execution
 */
public class TestConfig {

	private static String server = "smtp.gmail.com";
	private static String port = "587";

	private static String from = "testtmail95@gmail.com";
	private static String password = "HelloSher";

	private static String[] to = { /* "rajatvermaa95@gmail.com", */ "testtmail95@gmail.com" };

	/*
	 * public static String[] to = { "rajatvermaa95@gmail.com",
	 * "testtmail95@gmail.com", "vermanishant93@gmail.com", "GAUTYVERMA@gmail.com",
	 * "skv563.sv@gmail.com" };
	 */

	private static String subject = FrameworkConstants.getProjectName();

	public static String getServer() {
		return server;
	}

	public static String getPort() {
		return port;
	}

	public static String getFrom() {
		return from;
	}

	public static String getPassword() {
		return password;
	}

	public static String[] getTo() {
		return to;
	}

	public static String getSubject() {
		return subject;
	}

}