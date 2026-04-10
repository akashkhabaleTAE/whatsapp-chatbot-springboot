package com.internshala.assignments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBotApplication.class, args);
		printInBox("Welcome to the Chat Bot!");
	}

	private static void printInBox(String text) {
		char TOP_LEFT = '\u2554';
		char TOP_RIGHT = '\u2557';
		char BOTTOM_LEFT = '\u255A';
		char BOTTOM_RIGHT = '\u255D';
		char HORIZONTAL = '\u2550';
		char VERTICAL = '\u2551';

		int textLength = text.length() + 2;
		System.out.println(TOP_LEFT + String.valueOf(HORIZONTAL).repeat(textLength) + TOP_RIGHT);
		System.out.println(VERTICAL + " " + text + " " + VERTICAL);
		System.out.println(BOTTOM_LEFT + String.valueOf(HORIZONTAL).repeat(textLength) + BOTTOM_RIGHT);
	}

}
