package exception;

public class Exception03 {

	public static void main(String[] args) {
		try {
			// division���\�b�h���Ăяo��
			Exception03.division(100, 0);
        // ArithmeticException�N���X�̗�O�����������ꍇ�̗�O����
		} catch (ArithmeticException e) {
			// ���̗�ł͗�O�N���X����v���Ȃ��̂ŁA��O���������s����Ȃ�
			System.out.println("ArithmeticException��O������");
		// IllegalArgumentException�N���X�̗�O�����������ꍇ�̗�O����
		} catch (IllegalArgumentException e) {
			// ��O���������s�����
			System.out.println("IllegalArgumentException��O������");
			// �L���b�`������O�C���X�^���X���X���[
			throw e;
		}
		// finally�u���b�N�łȂ��̂ŏ��������s����Ȃ�
		System.out.println("�v���O�����I��");
	}
	
	public static void division(int a, int b) {
		System.out.println(a + " �� " + b + " �́H");
		if (b == 0) {
			// ����Z�ŗ�O����������̂ŁA�Ӑ}�I��IllegalArgumentException��O���X���[
			throw new IllegalArgumentException("�������s���ł�");
		}
		int result = a / b;
		System.out.println("�v�Z����" + result);
	}

}
