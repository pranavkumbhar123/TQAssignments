package com.mobilestore;

import java.util.Scanner;

public class Store {

	static int mCount = 0;
	static Scanner sc = new Scanner(System.in);

	public static void addmobile(Mobile m) {
		System.out.println("Enter mobile id:");
		m.setId(sc.nextInt());

		System.out.println("Enter mobile brand:");
		m.setbName(sc.next());

		System.out.println("Enter a mobile price:");
		m.setPrice(sc.nextFloat());

	}

	public static void viewMobileByBrand(Mobile[] mobi, String bName) {
		boolean flag = false;
		for (int i = 0; i < mCount; i++) {
			if (mobi[i].getbName().equalsIgnoreCase(bName)) {
				flag = true;
				System.out.println("Mobile details are:");
				System.out.println(mobi[i]);
				break;
			}
		}

		if (!flag)
			System.out.println("Mobile brand not found");

	}

	public static void viewAllMobile(Mobile[] mobi) {
		System.out.println("******************************************");
		System.out.println("================Mobile List===============");
		System.out.println("//////////////////////////////////////////");
		for (int i = 0; i < mCount; i++) {
			System.out.println(mobi[i]);
		}
	}

	public static void updateMobilePrice(Mobile[] mobi, float price) {
		boolean flag = false;
		for (int i = 0; i < mCount; i++) {
			if (mobi[i].getPrice() == price) {
				flag = true;
				System.out.println("Mobile details are:");
				System.out.println(mobi[i]);

				System.out.println("Ente a mobile brand name: ");
				String bName = sc.next();

				mobi[i].setbName(bName);

				System.out.println("Enter price:");
				price = sc.nextFloat();
				mobi[i].setPrice(price);

				System.out.println("Mobile details updated succesfully");
				break;

			}
		}
	}

	public static void deleteMobile(Mobile[] mobi, int id) {
		boolean flag = false;
		for (int i = 0; i < mCount; i++) {
			if (mobi[i].getId() == id) {
				flag = true;

				System.out.println(mobi[i].getbName());

				for (int j = i; j < mCount - 1; j++) {
					mobi[j] = mobi[j + 1];

				}
				mobi[mCount - 1] = null;
				mCount = mCount - 1;
				System.out.println("Mobile deleted succesfully");
				break;
			}
		}
		if (!flag) {
			System.out.println("Mobile not found");
		}
	}

	public static void main(String args[]) {

		Mobile[] m1 = new Mobile[4];
		String ch;
		int choice;
		do {
			System.out.println("----------------Mobile Store------------------");
			System.out.println("1.Add a mobile:");
			System.out.println("2.Delete a mobile");
			System.out.println("3.Update price of mobile:");
			System.out.println("4.View mobile by brand:");
			System.out.println("5.View all mobile:");
			System.out.println("0.Exit");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (mCount < m1.length) {
					m1[mCount] = new Mobile();
					addmobile(m1[mCount]);
					mCount++;
				} else {
					System.out.println("out of stock");

				}
				break;
			case 2:
				System.out.println("Ente a mobile id to be deleted:");
				int id = sc.nextInt();
				deleteMobile(m1, id);
				break;
			case 3:

				System.out.println("Enter a price to be updated");
				float price = sc.nextFloat();
				updateMobilePrice(m1, price);
				break;
			case 4:
				System.out.println("Enter the mobile brand name for view:");
				String bName = sc.next();
				viewMobileByBrand(m1, bName);
				break;
			case 5:
				viewAllMobile(m1);
				break;
			}

			System.out.println("Do you want to perform more operation(yes/no)");
			ch = sc.next();
		} while (!ch.equalsIgnoreCase("no"));
	}
}
