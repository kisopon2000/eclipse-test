package capsule.human;

public class HumanCapsule {
	// private�̃A�N�Z�X�C���q��ݒ肵�ĊO������B��
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name��getter���\�b�h
	// name�͊O������ύX�֎~�Ȃ̂ŁAsetter���\�b�h�͍쐬���Ȃ�
	public String getName() {
		return name;
	}

	// age��getter���\�b�h
	// age�͊O������ύX�֎~�Ȃ̂ŁAsetter���\�b�h�͍쐬���Ȃ�
	public int getAge() {
		return age;
	}
}
