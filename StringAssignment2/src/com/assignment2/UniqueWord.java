package com.assignment2;

public class UniqueWord {

	public static void uniqueWords(String s1[]) {
		System.out.println(" unique words=");
		int count;

		for (int i = 0; i < s1.length; i++) {
			count = 1;
			if (s1[i].equals("null")) {
				continue;
			}
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
					s1[j] = "null";
				}
			}
			if (count == 1) {
				System.out.println(s1[i] + " " + count);

			}
		}
	}

	public static void main(String[] args) {
	
		String s[] = { "Pranav","Pranav ","ravi", "Rohan" };
		uniqueWords(s);
	}

}
