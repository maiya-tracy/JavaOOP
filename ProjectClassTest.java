package com.OOP;

public class ProjectClassTest {

	public static void main(String[] args) {
		ProjectClass project1 = new ProjectClass();
		ProjectClass project2 = new ProjectClass("project 2");
		ProjectClass project3 = new ProjectClass("project 3", "some description");
		System.out.println(project1.getName());
		System.out.println(project2.getName());
		System.out.println(project3.getName());
		System.out.println(project3.getDescription());
		
		project2.setDescription("2 description");
		System.out.println(project2.getDescription());
		System.out.println(project2.elevatorPitch());
		System.out.println(project3.elevatorPitch());

	}

}
