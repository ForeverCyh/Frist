package cn.itcast.test02;

public class TestJunit {
	public  void testAdd(int a,int b) {
/*		��Ԫ����  ���Զ�����һ�����еķ��� 
		junit����javase��һ���֣���Ҫʹ�õ���jar����������myeclipse���Դ�junit��jar��
		����junit�汾3.x 4.x ��Ԫ���Ե�ʱ�򣬷�����������public void ������(){}
		ʹ��ע��ķ�ʽ���в��Է��� ���ڷ������� @Test(ע������ĸ��д)
		ѡ�з��������ƣ��Ҽ����� ���run as ----junit test---��������ɫ������ʾ���Է���ͨ��������ֺ���ɫ�������ǲ�ͨ��
		Ҫ�����ж������ʱ���ǵ�����е�����λ�� run as---junit test
		**@Ignore ��ʾ�����е�Ԫ�����������
		**@Before��ÿ������֮ǰִ������
		**@After��ÿ������֮������*/
		System.out.println(a+b);
	}

}
