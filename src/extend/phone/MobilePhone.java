package extend.phone;

// Phone, Camera�C���^�[�t�F�[�X����������MobilePhone�N���X�̐錾
public class MobilePhone implements Phone, Camera {
	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}

	// Camera�C���^�[�t�F�[�X�̃��\�b�h������
	public void takePicture() {
		System.out.println("�ʐ^���Ƃ�܂��B");
	}

	// Phone�C���^�[�t�F�[�X�̃��\�b�h������
	public void call(String number) {
		System.out.println(this.number + " ���� " + number + " �ɓd�b�������܂��B");
	}
}