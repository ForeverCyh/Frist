package cn.itcast.test03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
/**
 * �����ڼ�����ʹ��
 * @author Forever
 *
 */
public class TestDemo02 {
@Test
//������List�ϵ�ʹ��
	public void testList(){
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		����list���� �м��ַ�ʽ  ����       
//		��ͨforѭ�� ������ ��ǿfor
//		��ͨforѭ��
		for(int i=0;i<list.size();i++){
			String s=list.get(i);
			System.out.println(s);
		}
//		ʹ����ǿfor
		for( String s1:list){
			System.out.println(s1);
		}
//		ʹ�õ���������
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
