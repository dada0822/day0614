package day0614;

import java.util.HashMap;
import java.util.Map;

class Student {
	public int no;
	public String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return no+name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			return (no==stu.no) && (name.equals(stu.name));
		} else {
			return false;
		}
	}
}

public class HashMap4 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>(); // Student 타입의 키와 Integer 점수
		
		map.put(new Student(1, "김그린"), 90);
		map.put(new Student(1, "김그린"), 95); // 객체가 생성되어서 안에 키가 동일하더라도 두 개가 생성 ,,
		
		System.out.println("총 인원 수 : " +  map.size());
	}
}