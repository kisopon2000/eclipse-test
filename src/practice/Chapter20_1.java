package practice;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Chapter20_1 {

	/*public static void main(String[] args) {
		new Thread(new Printer()).start(); // スレッドの開始

		System.out.println("キーボードで入力して下さい");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine(); // キーボード入力
			System.out.println(str);
		}
		System.out.println("入力終了");
	}
	
	static class Printer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);// 1秒待つ
				} catch (InterruptedException e) {
				}
			}
		}
	}*/
	
	/*static class Fraction {
		
		private int bs;	// 分子の値
		private int bb;	// 分母の値
		
		// コンストラクタ
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
		
		// 足し算
		public Fraction add(Fraction fc) {
			int bs = fc.bb * this.bs + fc.bs * this.bb;
			int bb = fc.bb * this.bb;
			return this.reductFraction(bs, bb);
		}
		
		// 最大公約数の算出
		public int getGcd(int bs, int bb) {
			int gcd;
			while (bs % bb != 0) {
				gcd = bb;
				bb = bs % bb;
				bs = gcd;
			}
			return bb;
		}
		
		// 約分
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
		// 3つの分数インスタンスの生成
		Fraction x = new Fraction(1, -2);	// 分数 -1/2 を表現
		Fraction y = new Fraction(5, 6);	// 分数 5/6 を表現
		Fraction z = new Fraction(7, 1);	// 分数 7/1 を表現
		
		// 計算結果表示
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
			System.out.println(x);	// ユーザーが定義する部分
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
