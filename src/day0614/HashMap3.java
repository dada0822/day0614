package day0614;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		
		// Map.Entry : 'key-value' 쌍으로 된 데이터를 꺼낼 때 사용
		String[] data = {"A", "B", "A", "C", "D", "E", "C", "C", "E", "A", "C", "E"};
		
		HashMap<String, Integer> map = new HashMap<>(); // <> 생략해도 앞에서 작성한 게 있어서 알아서 불러옴
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				// containsKey : 지정된 key가 포함되어 있는지 확인하여
				// 있으면 true
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		
		// Map.Entry : Map 인터페이스의 내부 인터페이스
		// Map에 저장된 key-value를 다루기 위해 사용
		
		// Map.Entry 인터페이스 메서드
		// Object getKey() : Entry의 key 객체 반환
		// Object getValue() : Entry의 value 객체 반환
		// Object setValue(Object value) : Entry의 value 객체를 지정된 객체로 변경
		// boolean equals(Object o) : 동일한 Entry인지 비교
		// int hahCode() : Entry의 해시코드 반환
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int) entry.getValue();
			System.out.println(entry.getKey() + " : " + print('*', value) + " "  + value);
//			System.out.println(entry.getKey() + " : " + print(value) + " "  + value);
		}
		
	} // main
	
	// value의 값만큼 '#'을 표시
	public static String print(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar); // String은 객체라서 
	}
	
//	public static String print(int value) {
//		char[] bar = new char[value];
//		
//		for(int i=0; i<bar.length; i++) {
//			bar[i] = '#';
//		}
//		return new String(bar); // String은 객체라서 
//	}
}
/* 1. HashMap 생성 

   2. 반복문을 이용하여 data에 저장되어 있는 내용을 하나씩 비교함
   HashMap에 이미 있는 내용이면 value값을 1씩 증가시키고
   없는 값이면 새로 생성한다.

   3. 생성한 HashMap의 내용을 확인하고 출력하기 위해
   HashMap에 저장된 내용을 하나씩 분리하고
   내용이 있는 만큼 반복하도록 한다.(entrySet(), iterator() 사용)

   4. iterator()를 이용하여 값이 있는 동안에
   2에서 계산한 횟수만큼 '#' 기회가 반복하도록 설정하고
   반복이 끝나면마지막에 결과값 숫자를 표시한다.
   ('#'기호가 출력되는 메서드 생성) */