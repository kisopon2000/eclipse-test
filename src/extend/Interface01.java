package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		// MobilePhone�C���X�^���X�𐶐�
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

		// Phone�C���^�[�t�F�[�X�̃t�B�[���h�i�萔�j���Q��
		System.out.println("�d�b�ԍ��͍ő�" + MobilePhone.MAX_NUMBER_DIGITS + "���ł��B");
		// Phone�C���^�[�t�F�[�X�̒��ۃ��\�b�h�������������\�b�h���Ăяo��
		mobilePhone.call("99-8888-7777");
		// classTakePicture���\�b�h�̌Ăяo��
		Interface01.classTakePicture(mobilePhone);
	}

	// Camera�C���^�[�t�F�[�X���������N���X�������ɓn����
	public static void classTakePicture(Camera camera) {
		// �A�b�v�L���X�g���ꂽ�ϐ��̃��\�b�h���Ăяo��
		camera.takePicture();
	}
}