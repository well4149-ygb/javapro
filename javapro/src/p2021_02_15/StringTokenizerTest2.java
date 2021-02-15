package p2021_02_15;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
	
		String source1="한국 미국 태국 중국 이란";
		StringTokenizer st1=new StringTokenizer(source1," ");
		while(st1.hasMoreTokens()){		// 가져올 토큰이 있으면
			System.out.println("st1.token:"+st1.nextToken());
		}
		
		System.out.println();
		System.out.println();
		
		String source2="푸들,삽살개,풍산개,진돗개";
		StringTokenizer st2=new StringTokenizer(source2,",");
		while(st2.hasMoreTokens()){		// 가져올 토큰이 있으면
			System.out.println("st2.token:"+st2.nextToken());
		}
		
		System.out.println();
		System.out.println();		
		
		// true : 구분기호(,)도 토큰에 포함을해서 처리한다는 의미
		StringTokenizer st3=new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()){		// 가져올 토큰이 있으면
			System.out.println("st3.token:"+st3.nextToken());
		}
		
		
		
		
	}

}
