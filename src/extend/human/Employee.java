package extend.human;

// Human�N���X���p������Employee�N���X
public class Employee extends Human {
	// �T�u�N���X�Œǉ������t�B�[���h
	private String department;

	public Employee(String name, int age, String department) {
		// �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo��
		super(name, age);
		this.department = department;
	}

	// �T�u�N���X�Œǉ��������\�b�h
	public String getEmployeeProfile() {
		// �e�C���X�^���X�̃t�B�[���h��this�ϐ��ŎQ��
		String profile = "�N���" + this.age + "�ł��B";
		profile += "�T�����[�}���ŁA������" + this.department + "�ł��B";
		return profile;
	}
}