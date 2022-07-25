package practice_l3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter4 {

	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();

		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();
		
		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");
		
		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
		
		// 要素を取得する
		String item = list1.get(0);
		
		for (String list : list1) {
		  System.out.println(list); // 北海道、青森県、秋田県の順に表示
		}
		
		
		// HashMapを生成する場合(キーがInteger、値がString)
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// TreeMapを生成する場合(キー、値共にString)
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
		// 要素を取得する
		map1.get(0); // マスカットを返す
		map1.get(1); // nullを返す
		
		// キーのみ
		for (Integer key : map1.keySet()) {
		  System.out.println(key); // HashMapなので順序は不定
		}

		// 値のみ
		for (String name : map1.values()) {
		  System.out.println(name); // HashMapなので順序は不定
		}
		
		// キーと値のペア
		for (Map.Entry<Integer, String> classmate : map1.entrySet()) {
		  System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // HashMapなので順序は不定
		}
		
		
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		// 要素を追加する
		set1.add("スイカ");
		set1.add("メロン");
	}

}
