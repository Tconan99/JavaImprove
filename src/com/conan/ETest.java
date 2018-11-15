package com.conan;

public class ETest {
    public static void main(String[] args) {
        E[] staff = new E[3];

        staff[0] = new E("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new E("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new E("Tony Tester", 40000, 1990, 3, 15);

        for (E e : staff) {
            e.raiseSalary(5);
        }

        for (E e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}