
public class If02 {

	public static void main(String[] args) {
		int number = 7;

		// 条件式�@：if文。
		// numberが5未満か判断
		if (number < 5) {
			// ブロック(処理文)�@
			System.out.println(number + " は5未満です");

		// 条件式�A：else-if文。条件�@がfalseの場合。
		// numberが10未満か判断
		} else if (number < 10) {
			// ブロック(処理文)�A (number = 7のため、ブロック(処理文)を実行する)
			System.out.println(number + " は5以上、10未満です");

		// 条件式�B：else-if文：条件�@�Aがfalseの場合。
		// numberが15未満か判断
		} else if (number < 15) {
			// ブロック(処理文)�B
			System.out.println(number + " は10以上、15未満です");

		// else文：条件�@�A�Bがfalseの場合。
		} else {
			// ブロック(処理文)�C
			System.out.println(number + " は15未満でないです");
		}
	}

}
