package day0614;

import java.util.HashMap;
import java.util.Map;

public class TreeMap1 {
	public static void main(String[] args) {
//		Map<Integer, String> map = new TreeMap<>(); // TreeSet과 같음 알아서 정렬되어 나온다(오름차순)
		Map<Integer, String> map = new HashMap<>(); // 순서를 지켜주지 않는다. 다 섞임
		
		map.put(5, "value");
		map.put(59, "value");
		map.put(355, "value");
		map.put(8, "value");
		map.put(10, "value");
		map.put(26, "value");
		map.put(300, "value");
		map.put(15962, "value");
		map.put(1236, "value");
		map.put(2, "value");
		map.put(26, "value");
		
		System.out.println(map.keySet());
	}
}