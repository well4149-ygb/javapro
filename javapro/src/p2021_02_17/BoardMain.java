package p2021_02_17;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		
		do {
			System.out.println("메뉴를 입력 하세요?");
			System.out.println("1.게시판 글쓰기");
			System.out.println("2.글 목록 보기");
			System.out.println("3.글 삭제");
			System.out.println("4.종료");

			String menu = sc.next();

			switch (menu) {
			case "1":boardSVC.writeArticle(sc);	//게시판 글쓰기
					 break;
			case "2":boardSVC.listArticles(sc);	//글 목록 보기
					 break;
			case "3":boardSVC.removeArticle(sc); // 글 삭제
					 break;
			case "4":isStop = true;	// 종료
			}

		} while (!isStop);
	}

}
