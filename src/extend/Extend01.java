package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		// Human�N���X�̃C���X�^���X�𐶐�
		Human sugimoto = new Human("���{", 16);
		System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + sugimoto.getName());

		// Student�N���X�̃C���X�^���X�𐶐�
		Student sato = new Student("����", 17, 70);
		// �T�u�N���X�̃C���X�^���X����X�[�p�[�N���X�iHuman�N���X�j�̃��\�b�h���Ăяo��
		System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + sato.getName());
		// Student�N���X�ɒǉ�����getStudentProfile���\�b�h���Ăяo��
		System.out.println("Student�N���X�̃��\�b�h�F�v���t�B�[���́A" + sato.getStudentProfile());

		// Employee�N���X�̃C���X�^���X�𐶐����āA�A�b�v�L���X�g�i���j��Human�N���X�̕ϐ��ɑ��
		Human human = new Employee("�c��", 28, "�V�X�e����");
		// �X�[�p�[�N���X�iHuman�N���X�j�̃��\�b�h���Ăяo��
		System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + human.getName());
		// Human�N���X�ɂ́AgetEmployeeProfile���\�b�h���Ȃ��̂ŃA�N�Z�X����ƃR���p�C���G���[
		// System.out.println("Employee�N���X�̃��\�b�h�F" + human.getEmployeeProfile());
		// Employee�N���X�̕ϐ��Ƀ_�E���L���X�g�i���j
		Employee tanaka = (Employee) human;
		// Employee�N���X�̕ϐ��Ȃ̂ŁAEmployee�N���X�ɒǉ�����getEmployeeProfile���\�b�h�̌Ăяo�����ł���
		System.out.println("Employee�N���X�̃��\�b�h�F�v���t�B�[���́A" + tanaka.getEmployeeProfile());

		// printName���\�b�h���Ăяo���āA���O��\��
		Extend01.printName(sugimoto);
		// Human�N���X�̃T�u�N���X�̕ϐ��������ɂ��ČĂяo��
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	// ������Human�N���X�Ȃ̂ŁAHuman�N���X���A���̃T�u�N���X�Ȃ�Ăяo���ł���
	public static void printName(Human human) {
		System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + human.getName());
	}
}