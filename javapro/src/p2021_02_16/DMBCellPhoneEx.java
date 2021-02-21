package p2021_02_16;
// p290 ~ 292

class CellPhone{							// 부모 클래스
	String model;							// 필드
	String color;
	
	void powerOn() {						// 메소드
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방:"+message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}	
}

// 부모 클래스의 필드와 메소드는 상속된다.
class DMBCellPhone extends CellPhone{	// 자식 클래스
	int channel;

	public DMBCellPhone(String model, String color, int channel) {
		this.model = model;				// 자바폰
		this.color = color;				// 검정
		this.channel = channel;			// 10
	}
	
	void turnOnDmb() {
		System.out.println("채널:"+channel+"전 DMB방송 수신을 시작 합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}	
}

public class DMBCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DMBCellPhone dmb = new DMBCellPhone("자바폰", "검정", 10);
		
		// model, color 필드는 부모 클래스로 부터 상속 받아서 사용
		System.out.println("모델:"+dmb.model);
		System.out.println("색상:"+dmb.color);
		System.out.println("채널:"+dmb.channel);

		// 부모 클래스로 부터 상속 받아서 사용되는 메소드
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");		
		dmb.receiveVoice("안녕 하세요! 저는 홍길동 입니다.");		
		dmb.sendVoice("아~ 예 반갑습니다.");		

		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();		
	}

}
