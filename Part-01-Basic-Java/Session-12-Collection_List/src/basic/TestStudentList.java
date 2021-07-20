package basic;

import java.util.ArrayList;
import java.util.List;

public class TestStudentList {

	public static void main(String[] args) {
		// Created objects.
		Student s1 = new Student(1L, "Sagar", 95);
		Student s2 = new Student(2L, "Satish", 96);
		Student s3 = new Student(3L, "Sonali", 94);
		Student s4 = new Student(4L, "Namrata", 99);
		Student s5 = new Student(5L, "Lily", 100);
		Student s6 = new Student(6L, "Nikhil", 98);
		// List of Students
		List<Student> allStudent = new ArrayList<>();
		// adding student object into list/collection
		allStudent.add(s1);
		allStudent.add(s2);
		allStudent.add(s3);
		allStudent.add(s4);
		allStudent.add(s5);
		allStudent.add(s6);
		// printing list
		System.out.println("All :: " + allStudent);
		// grade o 96>
		// list namrata lily nikhil
		List<Student> oGradeList = new ArrayList<>();
		List<Student> aPlusGradeList = new ArrayList<>();
		for (Student stud : allStudent) {
			if (stud.getMark() > 96) {
				oGradeList.add(stud);
			} else {
				aPlusGradeList.add(stud);

			}
		}

		System.out.println("O Grade List " + oGradeList);
		System.out.println("A Plus Grade List " + aPlusGradeList);
		// A+
		// sagar,satish sonal

	}
}
