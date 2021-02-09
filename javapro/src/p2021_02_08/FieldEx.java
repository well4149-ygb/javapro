package p2021_02_08;

//p202
class FieldInitValue{
	// 필드(field)
	byte byteField;
	short shortField;
	int intField;			// 0으로 초기화됨
	long longField;
	
	boolean booleanField;   // false로 초기화
	char charField;
	
	float floatField;
	double doubleField;     // 0.0으로 초기화
	
	int[] arrField;			// null로 초기화
	String referenceField;	// null : 참조할 주소가 없다는 의미
}

public class FieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField:"+fiv.byteField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		
		System.out.println("booleanField:"+fiv.booleanField);
		System.out.println("charField:"+fiv.charField);
		System.out.println("floatField:"+fiv.floatField);
		System.out.println("doubleField:"+fiv.doubleField);
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("referenceField:"+fiv.referenceField);
	}

}
