package extend.human;

public class Human {
	// private�͎������g����̂݃A�N�Z�X�\
	private String name;
	// protected�̓T�u�N���X������A�N�Z�X�\
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}
