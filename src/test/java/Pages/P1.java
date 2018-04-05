package Pages;

import org.testng.annotations.Test;

public class P1 {
	@Test(groups={"smoke","Regration"})
	public void p1test1(){
		System.out.println("p1 test1()");
	}
	@Test(groups={"smoke"})
	public void p1test2(){
		System.out.println("p1 test2()");
	}
	@Test(groups={"Regration"})
	public void p1test3(){
		System.out.println("p1 test3()");
}	@Test(groups={"Regration"})
	public void p1test4(){
		System.out.println("p1 test4()");
}
@Test(groups={"Regration"})
	public void p1test5(){
		System.out.println("p1 test5()");
}
}
