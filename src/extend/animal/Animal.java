package extend.animal;

//abstract�C���q��ݒ肵�āA���ۃN���X�Ƃ��Đ錾
public abstract class Animal {
	protected String name;

	// ���ʃ��\�b�h���L�q
	public void eat() {
		System.out.println(name + "���H�������܂����I");
	}

	// �T�u�N���X���ƂɈႤ�����́A���ۃ��\�b�h�ɂ��ăT�u�N���X�Ɏ���������
	public abstract void cry();
}