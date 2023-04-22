package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudent(Student s) {
		boolean result = false;
		try {
			// jdbc code....
			Connection con = CP.createConnection();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			// Prepared statement to fire query
			PreparedStatement ps = con.prepareStatement(q);
			// set the values of parameter
			ps.setString(1, s.getSname());
			ps.setString(2, s.getSphone());
			ps.setString(3, s.getScity());
			// execute query
			ps.executeUpdate();

			result = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	public static boolean deleteStudent(int userId) {
		boolean result = false;
		try {
			// jdbc code....
			Connection con = CP.createConnection();
			String q = "delete from students where sid=?";
			// Prepared statment to fire queury
			PreparedStatement ps = con.prepareStatement(q);
			// set the values of paramenter
			ps.setInt(1, userId);
			// exexute query
			ps.executeUpdate();

			result = true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	public static void displayStudents() {
		try {
			// jdbc code....
			Connection con = CP.createConnection();
			String q = "select * from students";
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery(q);
			while (r.next()) {
				System.out.println("Id " + r.getInt(1));
				System.out.println("SName " + r.getString(2));
				System.out.println("SPhone " + r.getString(3));
				System.out.println("SCity " + r.getString(4));
				System.out.println("++++++++++++++++");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
