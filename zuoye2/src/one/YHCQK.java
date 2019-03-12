package one;

import java.util.Scanner;

public class YHCQK {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		CD();
		for (int i = 1; i != 0;) {
			a=s.nextInt();
			i=DL(a);
		}
	}
	
	public static void CD() {   //菜单
		System.out.println("+--------------------------+");
		System.out.println("+                     菜单                   +");
		System.out.println("+--------------------------+");
		System.out.println("+           1.登陆         +");
		System.out.println("+--------------------------+");
		System.out.println("+           0.退出         +");
		System.out.println("+--------------------------+");
		System.out.println("请选择:");
	}

	public static int DL(int a) {   //登陆
		if (a==1) {
			DLJM();
			return 1;
		}
		else if(a==0) {
			return 0;
		}
		else {
			System.out.println("输入有误，请重新输入!");
			CD();
			return 1;
		}
	}
	
	public static void DLJM() {    //登陆界面
		int id;
		String pass;
		Scanner u=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		System.out.println("请输入账号：");
		id=u.nextInt();
		System.out.println("请输入密码：");
		pass=p.nextLine();
		if (id==12306 && pass.equals("abcd")) {
			DY();
			CQK();
		}
		else {
			System.out.println("您输入的账号或密码错误!");
			CD();
		}
	}
	
	public static void CQK () {    //存取款界面
		int a;
		System.out.println("请选择服务：");
		System.out.println("1.存款");
		System.out.println("2.取款");
		System.out.println("0.退出");
		Scanner k=new Scanner(System.in);
		for (int i = 1; i != 0;) {
			a=k.nextInt();
			if (a==1) {
				CK();
				i=0;
			}
			else if(a==2) {
				QK();
				i=0;
			}
			else if(a==0) {
				System.exit(0);
			}
			else {
				System.out.println("输入有误，请重新选择!");
				i=1;
			}
		}
		
	}
	
	public static void CK () {    //存款
		user u=new user();
		double je;
		double yje=0.0;//原金额
		System.out.println("请输入需要存储的金额：");
		Scanner j=new Scanner(System.in);
		je=j.nextDouble();
		DY(je);
		CQK();
	}
	
	public static void QK () {    //取款
		
	}
	
	public static double DY(double a) {   //存款类调用
		user u=new user();
		bank b=new bank();
		sta yje=new sta();
		//double je=0.0;
		double yje1=0.0;//原金额
		a=a+yje1;
		yje1=a;
		u.setId(12306);
		u.getId();
		u.setName("张三");
		u.getName();
		u.setPassw("abcd1234");
		u.setBalance(a);
		u.getBalance();
		b.bankname="中国人民银行";
		b.street="上海浦东";
		u.information();
		b.information();
		return a;
	}
	
 	public static void DY() {   //类调用
		user u=new user();
		bank b=new bank();
		u.setId(12306);
		u.getId();
		u.setName("张三");
		u.getName();
		u.setPassw("abcd1234");
		u.setBalance(0.0);
		u.getBalance();
		b.bankname="中国人民银行";
		b.street="上海浦东";
		u.information();
		b.information();
	}
	
}

class sta{
	static double yje=0.0;
}

class user{
	private int id;//账号
	private String name;//姓名
	private String passw;//密码
	private static double balance;//余额
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void information() {
		System.out.println("账号："+id);
		System.out.println("姓名："+name);
		System.out.println("余额："+balance);
	}
	
}

class bank{
	String bankname;//银行名称
	String street;//街道
	public void information() {
		System.out.println("银行名："+bankname);
		System.out.println("街道："+street);
	}
}
