package overload;

import extend.human.Human;
import extend.human.Student;

public class Overload {

	public static void main(String[] args) {
		// �X�[�p�[�N���X�iHuman�N���X�j�̕ϐ��ɃC���X�^���X����
		Human human = new Student("����", 17, 70);

		// Overload�C���X�^���X�𐶐�
		Overload polymorphism = new Overload();

		// printName���\�b�h�i�����Ȃ��j�̌Ăяo��
		polymorphism.printName();
		// printName���\�b�h�i������String�N���X�j�̌Ăяo��
		polymorphism.printName("���{");
		// printName���\�b�h�i������String�N���X��String�N���X�j�̌Ăяo��
		polymorphism.printName("���{", "����");
		// printName���\�b�h�i������Human�N���X�j�̌Ăяo��
		polymorphism.printName(human);
	}
	
	public void printName() {
		System.out.println("����ł��B");
	}

	public void printName(String name) {
		System.out.println(name + "�ł��B");
	}

	public void printName(String name1, String name2) {
		System.out.println(name1 + "��" + name2 + "�ł��B");
	}

	public void printName(Human human) {
		System.out.println(human.getName() + "�ł��B");
	}

}
