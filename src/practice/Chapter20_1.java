package practice;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Chapter20_1 {

	/*public static void main(String[] args) {
		new Thread(new Printer()).start(); // �X���b�h�̊J�n

		System.out.println("�L�[�{�[�h�œ��͂��ĉ�����");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine(); // �L�[�{�[�h����
			System.out.println(str);
		}
		System.out.println("���͏I��");
	}
	
	static class Printer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);// 1�b�҂�
				} catch (InterruptedException e) {
				}
			}
		}
	}*/
	
	/*static class Fraction {
		
		private int bs;	// ���q�̒l
		private int bb;	// ����̒l
		
		// �R���X�g���N�^
		Fraction(int bs, int bb) {
			this.bs = bs;
			this.bb = bb;
			if (bb < 0) {
				this.bb = bb * -1;
				if (this.bs > 0) {
					this.bs = bs * -1;
				}
			}
		}
		
		// �����Z
		public Fraction add(Fraction fc) {
			int bs = fc.bb * this.bs + fc.bs * this.bb;
			int bb = fc.bb * this.bb;
			return this.reductFraction(bs, bb);
		}
		
		// �ő���񐔂̎Z�o
		public int getGcd(int bs, int bb) {
			int gcd;
			while (bs % bb != 0) {
				gcd = bb;
				bb = bs % bb;
				bs = gcd;
			}
			return bb;
		}
		
		// ��
		public Fraction reductFraction(int bs, int bb) {
			int gcd = getGcd(bs, bb);
			return new Fraction((bs / gcd), (bb / gcd));
		}
		
		@Override
		public String toString() {
			if (this.bb == 1) {
				return "(" + this.bs + ")";
			} else {
				return "(" + this.bs + "/" + this.bb + ")";
			}
		}
	}
	
	public static void main(String[] args) {
		// 3�̕����C���X�^���X�̐���
		Fraction x = new Fraction(1, -2);	// ���� -1/2 ��\��
		Fraction y = new Fraction(5, 6);	// ���� 5/6 ��\��
		Fraction z = new Fraction(7, 1);	// ���� 7/1 ��\��
		
		// �v�Z���ʕ\��
		System.out.println(x + "+" + y + "=" + x.add(y));
		System.out.println(x + "+" + z + "=" + x.add(z));
		System.out.println(y + "+" + z + "=" + y.add(z));
	}*/
	
	/*@FunctionalInterface
	interface Func<T>{
		void foo(T t);
		String toString();
		static void X() {}
		default void Y() {}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Func<Integer> greeting = (x) -> {
			System.out.println(x);	// ���[�U�[����`���镔��
		};
		greeting.foo(100);
		
		Function<String, Integer> f = str -> Integer.parseInt(str);
		System.out.println(f.apply("100"));
	}*/
	
	static int a = 0;
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5)
		.forEach(i -> {
			if(i % 2 == 0) {
				a++;
				System.out.println(a + " ");
			}
		});
	}

}
