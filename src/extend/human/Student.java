package extend.human;

public class Student extends Human {
	// �T�u�N���X�Œǉ������t�B�[���h
	private int score;

	public Student(String name, int age, int score) {
		// �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo��
		super(name, age);
		this.score = score;
	}

	// �T�u�N���X�Œǉ��������\�b�h
	public String getStudentProfile() {
		// �e�C���X�^���X�̃t�B�[���h��super�ϐ��ŎQ��
		String profile = "�N���" + super.age + "�ł��B";
		profile += "�w���ŁA�e�X�g�̓_����" + this.score + "�_�ł��B";
		return profile;
	}
}
