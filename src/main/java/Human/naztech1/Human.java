package Human.naztech1;

import java.time.LocalDate;

public class Human implements Comparable<Human> {
	String name;
	int age;
	float salary;

	LocalDate dateOfBirth;

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	float getSalary() {
		return salary;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public int compareTo(Human o) {
		return this.getName().compareTo(o.name);
	}

	@Override
	public boolean equals(Object o) {
		Human hum = (Human) o;
		return this.getName().equals(hum.getName()) && this.getAge() == hum.getAge()
				&& this.getDateOfBirth().equals(hum.getDateOfBirth())
				&& Float.valueOf(this.getSalary()).equals(Float.valueOf(hum.getSalary()));
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public Human(String name, int age, float salary, LocalDate dateOfBirth) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

}
