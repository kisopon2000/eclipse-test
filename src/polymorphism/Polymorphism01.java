package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism01 {
	public static void main(String[] args) {
		// Student�N���X�̃C���X�^���X�𐶐����āAHuman�N���X�̕ϐ��ɑ��
		Human human1 = new Student("����", 17, 70);
		// �I�[�o�[���C�h���Ă���̂ŁAStudent�N���X�̃��\�b�h�����s�����
		System.out.println("Human�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + human1.getProfile());

		// Employee�N���X�̃C���X�^���X�𐶐����āAHuman�N���X�̕ϐ��ɑ��
		Human human2 = new Employee("�c��", 28, "�V�X�e����");
		// �I�[�o�[���C�h���Ă���̂ŁAEmployee�N���X�̃��\�b�h�����s�����
		System.out.println("Human�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + human2.getProfile());
	}
}