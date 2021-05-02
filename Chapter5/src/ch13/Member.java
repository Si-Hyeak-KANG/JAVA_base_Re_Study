package ch13;

//Comparable->compareTo 매개변수 한개 , Comparator구현 가능 -> compare 매개변수 두개
public class Member implements Comparable<Member>{

	private int memberId; //회원 아이디
	private String memberName; //회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public Member() {
		
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Member) {
			
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
		
/*	첫번째 방법 if문 활용

		// int 반환 -> 자신보다 크면 양수 , 작으면 음수, 같으면 0
		if( this.memberId > member.memberId)
			return 1;
		else if(this.memberId < member.memberId)
			return -1;
		else return 0;
 */	
		
// 두번째 방법 간단한 식(오름차순) **내림차순을 원하면 *(-1)
		return (this.memberId - member.memberId);
		
	}
	 
	/*
	내가 새로들어가는 엘리먼트(this) 내가 들어갈 때 이미 기존에 트리를 구성하는 
	요소들이 binary search tree여서 다 비교는 안하고 위치를 잡을 때 까지	
	하나씩 하나씩 넘어온다. -> call back 함수
	*/
}
