package polymorphism.human;

// Human�N���X���p��
public class Employee extends Human {
	private String department;

	public Employee(String name, int age, String department) {
		// �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo��
		super(name, age);
		this.department = department;
	}

	// �I�[�o�[���C�h���āAEmployee�N���X�p�ɏ�����ύX
	@Override
	public String getProfile() {
		String profile = "�N���" + getAge() + "�ł��B";
		profile += "�T�����[�}���ŁA������" + this.department + "�ł��B";
		return profile;
	}
}