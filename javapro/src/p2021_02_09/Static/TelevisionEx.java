package p2021_02_09.Static;
// p240

class Television{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//정적 초기화 블럭
	static {
		info = company + "-" + model;
	}	
}

public class TelevisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Television.info);		
		
	}

}
