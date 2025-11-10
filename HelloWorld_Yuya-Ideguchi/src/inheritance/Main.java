package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Employee fullTime = new FullTimeEmployee("E001", "佐藤太郎");
        // パートタイマーオブジェクトを作成
        Employee partTime = new PartTimeEmployee("P001", "鈴木花子");

        // 各社員の勤務時間を指定して日給を計算
        int fullTimeWage = fullTime.calculateDailyWage(10);  // 10時間勤務（2時間残業）
        int partTimeWage = partTime.calculateDailyWage(10);  // 10時間勤務（割増なし）

        // 結果表示
        System.out.println(fullTime.getName() + " の日給: " + fullTimeWage + "円");
        System.out.println(partTime.getName() + " の日給: " + partTimeWage + "円");
		

	}

}
