package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);		
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*
		 for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i); //i 위치에 해당하는 배열 안 instance 가지고 옴
			
			int tempId = member.getMemberId();
			
			if( tempId == memberId) {
				arrayList.remove(i);
				return true;
			}			
		}
		*/
		 
		//Iterator
		Iterator<Member> ir = arrayList.iterator();
		
		//hashNext : (boolean) 다음이 있는지 true/false
		while(ir.hasNext()) {
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for(Member member : arrayList) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}

