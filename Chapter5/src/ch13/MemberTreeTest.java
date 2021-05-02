package ch13;

import java.util.Comparator;
import java.util.TreeSet;

//Comparator: �̹� Comparable�� ������ ��� Comparator�� ���ϴ� ����� �ٽ� ���� ���� 
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
		
		 //binary search tree�� �Ǿ��ֱ� ������ ������ �߿����� ����
		set.add("ȫ�浿");
		set.add("������"); 
		set.add("�̼���");
		
		System.out.println(set); // [������, �̼���, ȫ�浿] ���ĵǼ� ȣ���.
		*/
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();//comparable ���� ���� ȣ�� �� �����ɸ�
		//Member�� comparable�� ���� �� compareTo�� ������ �Ѵ�.

		
		

	}

}
