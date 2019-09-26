package cn.itcast.test02;

public class TestJunit {
	public  void testAdd(int a,int b) {
/*		单元测试  测试对象是一个类中的方法 
		junit不是javase的一部分，想要使用导入jar包，但是在myeclipse中自带junit的jar包
		首先junit版本3.x 4.x 单元测试的时候，方法命名规则public void 方法名(){}
		使用注解的方式运行测试方法 ，在方法上面 @Test(注意首字母大写)
		选中方法的名称，右键运行 点击run as ----junit test---当出现绿色条，表示测试方法通过否则出现红棕色条是则是不通过
		要是运行多个方法时则是点击类中的其他位置 run as---junit test
		**@Ignore 表示不进行单元测试这个方法
		**@Before在每个方法之前执行运行
		**@After在每个方法之后运行*/
		System.out.println(a+b);
	}

}
