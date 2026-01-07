package solid;

public interface Employee {

/**********************************
* 
* 以下の問題文の「悪い例」をリファクタリングし、SOLID 原則を活用して改善案を考え、簡単なプログラム例を作成してみましょう。	
*	「悪い例」
* 	// 社員の給与を計算し、レポートを出力するクラス
*	class SalaryCalculator {
*	public void calculateSalary(Employee e) {
*	// 社員タイプごとに if で分岐
*	if (e.getType().equals("FullTime")) {
*	System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
*	} else if (e.getType().equals("Contract")) {
*	System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
*	}
*	}
*	}
*	
*	class Employee {
*	private String name;
*	private String type;
*	private int hours;
*	
*	public Employee(String name, String type, int hours) {
*	this.name = name;
*	this.type = type;
*	this.hours = hours;
*	}
*	
*	public String getName() { return name; }
*	public String getType() { return type; }
*	public int getHours() { return hours; }
*	}
*	
*	
*   以下のSOLID 原則を活かす形にリファクタリングしてみよう。	
*   ✅ S（単一責任の原則）	
*   ✅ O（開放/閉鎖の原則）	
*   ✅ L（リスコフの置換原則）	
*   ✅ I（インターフェイス分離の原則）	
*   ✅ D（依存関係逆転の原則）		
*
******************************************/
	
	String getName();
	
	int getHours();
	int calculateSalary();
	
	
}
