package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAllMember(); //순서대로 안나옴
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong); //hashcode가 같기 때문에 add x
		
		memberHashSet.showAllMember(); // 아이디가 중복 되면 안됌.
		
		

	}

}
