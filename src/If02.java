
public class If02 {

	public static void main(String[] args) {
		int number = 7;

		// �������@�Fif���B
		// number��5���������f
		if (number < 5) {
			// �u���b�N(������)�@
			System.out.println(number + " ��5�����ł�");

		// �������A�Felse-if���B�����@��false�̏ꍇ�B
		// number��10���������f
		} else if (number < 10) {
			// �u���b�N(������)�A (number = 7�̂��߁A�u���b�N(������)�����s����)
			System.out.println(number + " ��5�ȏ�A10�����ł�");

		// �������B�Felse-if���F�����@�A��false�̏ꍇ�B
		// number��15���������f
		} else if (number < 15) {
			// �u���b�N(������)�B
			System.out.println(number + " ��10�ȏ�A15�����ł�");

		// else���F�����@�A�B��false�̏ꍇ�B
		} else {
			// �u���b�N(������)�C
			System.out.println(number + " ��15�����łȂ��ł�");
		}
	}

}
