package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		// �J�v�Z��������Ă��Ȃ��C���X�^���X�𐶐�
		HumanNoCapsule human1 = new HumanNoCapsule("�c��", 28);
		System.out.println("���O��" + human1.name + ", �N���" + human1.age + "�ł��B");
		// �A�N�Z�X�������Ȃ��̂ŕύX�ł��Ă��܂�
		human1.name = "���c";
		human1.age = 70;
		// �ύX����Ă��܂��̂őz��O�̖��O�ƔN��ɂȂ��Ă��܂�
		System.out.println("���O��" + human1.name + ", �N���" + human1.age + "�ł��B");

		// ���O��N��ύX�֎~�̃J�v�Z�������ꂽ�C���X�^���X�𐶐�
		HumanCapsule human2 = new HumanCapsule("����", 32);
		// private�̃A�N�Z�X�����̂��߁A�ȉ��̂悤��setter���g�킸�ɒ��ڕύX���悤�Ƃ���ƃR���p�C���G���[����������
		// human2.name = "�O��";
		// ���ڕύX����Ȃ����߁A�z��ʂ�̖��O�ƔN��擾�ł���B�擾�́Agetter���\�b�h���g�p����
		System.out.println("���O��" + human2.getName() + ", �N���" + human2.getAge() + "�ł��B");
	}
}