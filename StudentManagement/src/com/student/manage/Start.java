package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to student management system.....");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to delete student");
			System.out.println("Enter 3 to display student");
			System.out.println("Enter 4 to exit ");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				// Add student
				System.out.println("Enter Sname");
				String sname = br.readLine();

				System.out.println("Enter Sphone");
				String sphone = br.readLine();

				System.out.println("Enter Scity");
				String scity = br.readLine();

				Student s = new Student(sname, sphone, scity);
				Boolean ans = StudentDao.insertStudent(s);
				if (ans) {
					System.out.println("Inserted successfully..");
				} else {
					System.out.println("Something went wrong");
				}
			} else if (c == 2) {
				// Delete student
				System.out.println("Enter sid: ");
				int userId = Integer.parseInt(br.readLine());
				boolean ans = StudentDao.deleteStudent(userId);
				if (ans) {
					System.out.println("Deleted Successfully..");
				}
			} else if (c == 3) {
				// Display student
				StudentDao.displayStudents();
			} else {
				break;
			}
		}
		System.out.println("Thank You");
	}

}
