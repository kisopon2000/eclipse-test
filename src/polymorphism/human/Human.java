package polymorphism.human;

public class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// final�C���q���ݒ肳��Ă���̂ŃI�[�o�[���C�h�֎~
	final public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getProfile() {
		return "���O��" + this.name + "�A�N���" + this.age + "�ł��B";
	}
}