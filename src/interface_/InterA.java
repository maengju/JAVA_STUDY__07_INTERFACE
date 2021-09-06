package interface_;

public interface InterA { // 인터페이스 안에 들어가는건 오로지 상수와 추상메소드만 존재
	public static final String NAME = "홍길동"; //상수
	int AGE = 25; //인터페이스안에선 public static final생략가능
	public abstract void aa();//추상메소드
	public void bb();// interface안에선 abstract 생략가능
	
	

}
