package classmethod.human;

public class Human04 {
	// �����o�[�ϐ�
	// static�ϐ�
	static public int humanCount = 0;
    // �C���X�^���X�ϐ�
	public String name;
	// �萔
	public static final String GREETING = "����ɂ���";

	public Human04(String name) {
		this.name = name;
		// �C���X�^���X�������Ƃ�static�ϐ����C���N�������g
		Human04.humanCount++;
	}

	static public void staticMethodPrint() {
		// static���\�b�h����C���X�^���X�ϐ��͎g�p�ł��Ȃ��i�R���p�C���G���[�j
		// System.out.println("���O�́A" + name);
		// static�ϐ���humanCount��\��
		System.out.println("�l�̐���" + Human04.humanCount);
	}

	public void instanceMethodPrint() {
		// �C���X�^���X�ϐ���name��\��
		System.out.println("���O��" + name);
	}
}
