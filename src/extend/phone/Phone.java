package extend.phone;

// Phone�C���^�[�t�F�[�X�̐錾
public interface Phone {
	// �t�B�[���h�̐錾�i�萔�j
	int MAX_NUMBER_DIGITS = 11;

	// public abstract�������Œǉ������i���ۃ��\�b�h�j
	void call(String number);
	
	// default���\�b�h�̐錾
	default void powerOff() {
		System.out.println("�d����؂�܂��B");
	}
}