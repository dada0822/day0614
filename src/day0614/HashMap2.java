package day0614;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("김자바", 90);
		map.put("박그린", 80);
		map.put("박그린", 100);
		map.put("이자바", 70);
		map.put("이땡땡", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("학생 명단 : " + set);
		
		Collection values = map.values(); // 값만 가지고 오기
		
		it = values.iterator();
		int total = 0; // 합계
		
		while(it.hasNext()) {
			int score = (int)it.next();
			total += score;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		
	}
}