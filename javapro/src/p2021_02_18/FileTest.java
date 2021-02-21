package p2021_02_18;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.
import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에
			// test폴더가 생성됨
			File temp = new File("C:/java01", "temp");//c:/java01 - temp
			File tempFile = new File("test");         // javapro - test

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를
			// 반환함)
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

//1. 디렉토리 삭제 : 비어있는 디렉토리만 삭제됨
//tempFile.delete(); // test 디렉토리 삭제
			
//2. 비어있지 않는 디렉토리 삭제
//test디렉토리 안에 있는 모든 파일 구해오기
//	File[] f = tempFile.listFiles();
//	for(int i=0; i<f.length; i++)
//		f[i].delete();		//test디렉토리 안에 있는 모든 파일 삭제
//
//		tempFile.delete();		// 비어있는 디렉토리 삭제

////3. 자식 디렉토리 삭제
//		temp.delete();			// temp 디렉토리 삭제
//
////4. 부모 디렉토리 삭제
//		temp.getParentFile().delete(); // c:/java01 디렉토리 삭제
//			
//			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
//			// 여러가지 정보를 얻을수 있음

			System.out.println("temp canRead : " + temp.canRead());
			System.out.println("temp canWrite : " + temp.canWrite());
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			System.out.println("temp getName : " + temp.getName());
			System.out.println("temp getParent : " + temp.getParent());
			System.out.println("temp getPath : " + temp.getPath());
			System.out.println("temp isDirectory : " + temp.isDirectory());
			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
		
		}
	}
}
