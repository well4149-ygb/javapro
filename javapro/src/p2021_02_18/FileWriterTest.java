package p2021_02_18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try {
			// 명령행 첫번째 인수로 들어오는 값을
			// 인수로 받아 들여 FileReader 객체 생성
			FileReader fr = new FileReader("data.txt");

			// 명령행 두번째 인수를
			// 생성자의 argument로 받아 들여 FileWriter 객체 생성
			FileWriter fw = new FileWriter("c:/temp/data1.txt");

			int input = 0;

			// File에 저장된 모든 데이터를 스트림을 통해
			// 읽어 들여 다른File에 저장
			while ((input = fr.read()) != -1) {
				System.out.print((char) input); // 화면에 출력 부분
				fw.write(input); // 다른 파일에 쓰는 부분
			}

			// FileInputStream, FileOutputStream을 해제
			fr.close();
			fw.close();
		} catch (IOException io) {
			System.out.println(io);
		}
	}// main() end
}
