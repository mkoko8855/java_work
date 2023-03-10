package oop.obj_arr;

public class Score {

	/*
	 * - 이름, 국어, 영어, 수학, 총점, 평균(double)을 담을 수 있는 객체를 디자인하세요.
	 * 
	 * - 학생의 모든 정보를 한 눈에 확인할 수 있게 scoreInfo() 메서드를 선언해 주세요. 메서드 내부에는 출력문을 이용해서 모든
	 * 정보를 출력해 주세요.
	 * 
	 * - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */

	private String name;
	private int k;
	private int e;
	private int m;
	private int total;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	public Score(String name, int k, int e, int m, int total, double avg) {
		super(); //있어도 되고 없어도됨. 
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
		this.total = total;
		this.avg = avg;
	}

	public void ScoreInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + k);
		System.out.println("영어 : " + e);
		System.out.println("수학 : " + m);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
