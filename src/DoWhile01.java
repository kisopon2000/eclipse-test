
public class DoWhile01 {

	public static void main(String[] args) {
		int number = 1;
        // do-while���F���[�v�J�n
        do {
        // �u���b�N�F
        // number��number * 2 �������āAnumber���o��
        number *= 2;
            System.out.println("DoWhile01 = " + number);
        // do-while���F
        // number��50�����̏ꍇ�A�u���b�N�̏��������[�v���s����
        } while (number < 50);
	}

}
