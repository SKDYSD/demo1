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
	
	public static void CD() {   //�˵�
		System.out.println("+--------------------------+");
		System.out.println("+                     �˵�                   +");
		System.out.println("+--------------------------+");
		System.out.println("+           1.��½         +");
		System.out.println("+--------------------------+");
		System.out.println("+           0.�˳�         +");
		System.out.println("+--------------------------+");
		System.out.println("��ѡ��:");
	}

	public static int DL(int a) {   //��½
		if (a==1) {
			DLJM();
			return 1;
		}
		else if(a==0) {
			return 0;
		}
		else {
			System.out.println("������������������!");
			CD();
			return 1;
		}
	}
	
	public static void DLJM() {    //��½����
		int id;
		String pass;
		Scanner u=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		System.out.println("�������˺ţ�");
		id=u.nextInt();
		System.out.println("���������룺");
		pass=p.nextLine();
		if (id==12306 && pass.equals("abcd")) {
			DY();
			CQK();
		}
		else {
			System.out.println("��������˺Ż��������!");
			CD();
		}
	}
	
	public static void CQK () {    //��ȡ�����
		int a;
		System.out.println("��ѡ�����");
		System.out.println("1.���");
		System.out.println("2.ȡ��");
		System.out.println("0.�˳�");
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
				System.out.println("��������������ѡ��!");
				i=1;
			}
		}
		
	}
	
	public static void CK () {    //���
		user u=new user();
		double je;
		double yje=0.0;//ԭ���
		System.out.println("��������Ҫ�洢�Ľ�");
		Scanner j=new Scanner(System.in);
		je=j.nextDouble();
		DY(je);
		CQK();
	}
	
	public static void QK () {    //ȡ��
		
	}
	
	public static double DY(double a) {   //��������
		user u=new user();
		bank b=new bank();
		sta yje=new sta();
		//double je=0.0;
		double yje1=0.0;//ԭ���
		a=a+yje1;
		yje1=a;
		u.setId(12306);
		u.getId();
		u.setName("����");
		u.getName();
		u.setPassw("abcd1234");
		u.setBalance(a);
		u.getBalance();
		b.bankname="�й���������";
		b.street="�Ϻ��ֶ�";
		u.information();
		b.information();
		return a;
	}
	
 	public static void DY() {   //�����
		user u=new user();
		bank b=new bank();
		u.setId(12306);
		u.getId();
		u.setName("����");
		u.getName();
		u.setPassw("abcd1234");
		u.setBalance(0.0);
		u.getBalance();
		b.bankname="�й���������";
		b.street="�Ϻ��ֶ�";
		u.information();
		b.information();
	}
	
}

class sta{
	static double yje=0.0;
}

class user{
	private int id;//�˺�
	private String name;//����
	private String passw;//����
	private static double balance;//���
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
		System.out.println("�˺ţ�"+id);
		System.out.println("������"+name);
		System.out.println("��"+balance);
	}
	
}

class bank{
	String bankname;//��������
	String street;//�ֵ�
	public void information() {
		System.out.println("��������"+bankname);
		System.out.println("�ֵ���"+street);
	}
}
