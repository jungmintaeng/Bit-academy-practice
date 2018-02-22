package prob02;

public class Book {
	private int bookNo;	//번호
	private String title;	//제목
	private String author;	//작가
	private int stateCode;	//상태코드
	
	/**
	 * Constructor
	 */
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	/**
	 * getter-setter
	 */
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * methods
	 */
	
	/*
	 * 대여기능을 수행하는 메소드
	 * statecode -> 0 ---이(가) 대여 됐습니다.
	 */
	public void rent() {
		if(stateCode == 0) {
			System.out.println("이미 대여 중인 책입니다.");
			return;
		}
		
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}
	
	/*
	 * 책의 정보 출력
	 */
	public void print() {
		System.out.println("책 제목:" + title + ", 작가:" + author + 
				", 대여 유무:" + (stateCode == 1 ? "재고있음" : "대여중"));
	}
}
