package extend.animal;

// ���ۃN���X��Animal�N���X���p��
public class Dog extends Animal {

	public Dog() {
		this.name = "��";
	}

	// ���ۃ��\�b�h���㏑�����ď������L�q
	public void cry() {
		System.out.println(this.name + "���i���܂����B�����I�����I");
	}
}