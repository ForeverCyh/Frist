package cn.itcast.test03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
/**
 * 泛型在集合上使用
 * @author Forever
 *
 */
public class TestDemo02 {
@Test
//泛型在List上的使用
	public void testList(){
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		遍历list集合 有几种方式  三种       
//		普通for循环 迭代器 增强for
//		普通for循环
		for(int i=0;i<list.size();i++){
			String s=list.get(i);
			System.out.println(s);
		}
//		使用增强for
		for( String s1:list){
			System.out.println(s1);
		}
//		使用迭代器遍历
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
