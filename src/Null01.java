
public class Null01 {

	public static void main(String[] args) {
		String string1;
		// �h�������h�̕��������o��
		string1 = "������";
		System.out.println(string1 + "�̕������F" + string1.length());
		// �h�h�i�󕶎��j�̕��������o��
		string1 = "";
		System.out.println(string1 + "�̕������F" + string1.length());
		
		int[] array1 = new int[3];  // �z��̐錾�Ɛ���
		array1[0] = 60;  // �C���f�b�N�X�ԍ��u0�v���w�肵�ĂP�Ԗڂ̗v�f�Ƀf�[�^����
		array1[2] = 20;  // �Q�Ԗڂ̗v�f����ɂR�Ԗڂ̗v�f�Ƀf�[�^����
		array1[1] = 20;  // �R�ԖڂƓ����l���Q�Ԗڂ̗v�f�ɑ��
		int int2 = array1[2];  // �C���f�b�N�X�ԍ��u2�v���w�肵�ĂR�Ԗڂ̗v�f���擾

		int array2[] = null;  // []�͕ϐ����̌��ł���
	}

}
