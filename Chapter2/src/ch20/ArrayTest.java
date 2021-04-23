package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		//직접 초기화 방법
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
		
		
		
		
		/*
		int[] arr = new int[10];
		int total = 0;
		
		for(int i =0, num=1; i < arr.length; i++) {
			arr[i] = num++;
		}
		
		//for문 enhanced for문 향상된 for문 -> 처음부터 끝까지 순회할 때 사용
		for( int num : arr) {
			
			total += num;
		}
		
		System.out.println(total);*/
	}

}
