
public class Variable01 {

	static final int MIN_NUMBER = 10;

	public static void main(String[] args) {
		System.out.println(MIN_NUMBER);
		// [1]������悤�Ƃ���ƃG���[
		// MIN_NUMBER = 20;

		// [2]final�萔�̐錾
		final int maxValue;
		// [2]��x�͒l��ݒ�ł���
		maxValue = 100;
		System.out.println(maxValue);
		// [2]�đ�����悤�Ƃ���ƃG���[
		// maxValue = 200;
	}

}
