package extend;

import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {

		// Dog�N���X�̃C���X�^���X�𐶐�
		Dog dog = new Dog();
		// Animal�N���X�̃��\�b�h���Ăяo��
		dog.eat();
		// ���ۃ��\�b�h�������������\�b�h���Ăяo��
		dog.cry();

		// ���ۃN���X�̓C���X�^���X��������ƃR���p�C���G���[
		// Animal animal = new Animal();
	}
}