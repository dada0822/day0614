package day0614;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // 객체여야 하니까 Integer
		
		map.put("김그린", 85);
		map.put("이자바", 90);
		map.put("박제이", 68);
		map.put("김그린", 70);
		
		System.out.println("총 학생 수 : " + map.size());
		
		// 박제이의 데이터를 출력
		// 이름(key)로 점수(value)찾기
//		System.out.println("박제이 : " + map.get("박제이"));
		
		// key를 반환
		Set<String> keySet = map.keySet(); // 키의 타입
		
		// 키를 이용하여 값 찾아오기
		Iterator<String> keyIterator = keySet.iterator();
	
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("-----------------");
		
		map.remove("이자바");
		
		System.out.println("총 학생 수 : " + map.size());
		
		// 객체를 키와 값의 쌍으로 함께 처리하기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryItrator = entrySet.iterator();
		
		while (entryItrator.hasNext()) {
			Map.Entry<String, Integer> entry = entryItrator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("-----------------");
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 학생 수 : " + map.size());
	}
}