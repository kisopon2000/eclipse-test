package polymorphism.human;

// Human�N���X���p��
public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		// �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo��
		super(name, age);
		this.score = score;
	}

	// �I�[�o�[���C�h���āAStudent�N���X�p�ɏ�����ύX
	@Override
	public String getProfile() {
		String profile = "�N���" + getAge() + "�ł��B";
		profile += "�w���ŁA�e�X�g�̓_����" + this.score + "�_�ł��B";
		return profile;
	}
}