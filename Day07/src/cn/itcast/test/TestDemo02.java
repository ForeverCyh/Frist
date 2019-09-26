package cn.itcast.test;

public class TestDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     add1();
	}
	public static void add1(){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println(sum);
	}

}
