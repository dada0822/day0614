package day0614;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Collections1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		System.out.println(list);
		
		// list에 값을 알아서 넣어줌
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
			
		// 오른쪽으로 숫자만큼 이동함
		Collections.rotate(list, 2);
		System.out.println(list);
		
		// i번째와 j번째 값을 교환
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		// 임의의 순서로 섞기
		Collections.shuffle(list);
		System.out.println(list);
		
		// 정렬
//		Collections.sort(list);
//		System.out.println(list);
//
//		// 오름차순 정렬을 내림차순으로 출력
//		Collections.reverse(list);
//		System.out.println(list);
//		
//		// 정렬과 동시에 내림차순으로 출력
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
		
		// binarySearch : 지정된 값이 저장된 위치(index) 반환
		// 반드시 정렬이 되어 있어야 함
		int idx = Collections.binarySearch(list, 3);
		System.out.println(idx);
		
		// 최대값, 최소값
		System.out.println("max : " + Collections.max(list));
		System.out.println("min : " + Collections.min(list));
		System.out.println("min : " + Collections.max(list, Collections.reverseOrder()));
		
		// list를 해당 값으로 모두 채우기
		Collections.fill(list, 9);
		System.out.println(list);
		
		//  list와 같은 크기의 새로운 list를 생성하고 해당 값으로 채우기
		// nCopies를 이용하여 생성된 결과는 변경 불가능
		List newList = Collections.nCopies(list.size(), 8);
		System.out.println("newList : " + newList);
		
		// 에러남
//		Collections.fill(newList, 2);
//		System.out.println("newList : " + newList);
		
		// 두 list의 공통 요소가 없으면 true
		System.out.println(Collections.disjoint(list, newList));
		
		// newList의 내용을 list에 복사
		Collections.copy(list, newList);
		System.out.println("list" + list);
		System.out.println("newList : " + newList);
		
		Collections.replaceAll(list, 8, 1);
		System.out.println(list);
		
		
		Enumeration e = Collections.enumeration(list);
		ArrayList list2 = Collections.list(e);
		System.out.println("list2 : " + list2);
	}
}