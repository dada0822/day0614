package day0614;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable1 {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		System.out.println(map);
		
		map.put("summer", "1234");
		System.out.println(map);
		
		map.put("winter", "12345");
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 아이디와 비밀번호를 입력받아 
			// 아이디와 비밀번호가 일치하면 "로그인 완료" 출력
			// 아이디가 존재하지 않으면 "아이디 오류" 출력
			// 비밀번호가 일치하지 않으면 "비밀번호 오류" 출력
			
			System.out.println("아이디, 비밀번호 입력 > ");
			System.out.print("아이디 > ");
			String id = scan.next();
			System.out.print("비밀번호 > ");
			String pw = scan.next();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 완료");
					break;
				} else {
					System.out.println("비밀번호 오류");
				}
			} else {
				System.out.println("아이디 오류");
			}
			
		}
	}
}