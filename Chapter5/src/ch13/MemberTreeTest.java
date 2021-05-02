package ch13;

import java.util.Comparator;
import java.util.TreeSet;

//Comparator: 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현 가능 
class MyCompare implements Comparator<Member> {

	@Override
	public int compare(Member member1, Member member2) {
		
		return member1.compareTo(member2)*(-1);
	}
	
}

public class MemberTreeTest {

	public static void main(String[] args) {
		
		/*
		TreeSet<String> set = new TreeSet<String>();
		
		 //binary search tree로 되어있기 때문에 순서는 중요하지 않음
		set.add("홍길동");
		set.add("강감찬"); 
		set.add("이순신");
		
		System.out.println(set); // [강감찬, 이순신, 홍길동] 정렬되서 호출됨.
		*/
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();//comparable 구현 없이 호출 시 오류걸림
		//Member의 comparable을 구현 후 compareTo를 재정의 한다.

		
		

	}

}
