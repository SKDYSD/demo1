package two;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		int xz;
		boolean y;
		System.out.println("��ѡ����Ҫ�ķ���:    1.�鿴��������      2.��ѯ����       0.�˳�");
		Scanner sc=new Scanner(System.in);
		while (y=true) {
			
			xz=sc.nextInt();
			if(xz==0) {
				break;
			}
			switch (xz) {
			case 1:
				xinzuoyunshi();
				System.out.println("��ѡ����Ҫ�ķ���:    1.�鿴��������      2.��ѯ����       0.�˳�");
				break;
			case 2:
				xinzuochaxun();
				System.out.println("��ѡ����Ҫ�ķ���:    1.�鿴��������      2.��ѯ����       0.�˳�");
				break;
			default:
				System.out.println("����������ѡ��:    1.�鿴��������      2.��ѯ����       0.�˳�");
				break;
			}
		}
	}

	public static void xinzuoyunshi() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("��ǰʱ��Ϊ:"+df.format(new Date()));
		System.out.println("������������:");
		yunshi();
	}
	
	public static void xinzuochaxun() {
		int year;
		int month;
		int day;
		System.out.println("���������ĳ������:");
		Scanner sy=new Scanner(System.in);
		year=sy.nextInt();
		System.out.println("���������ĳ����·�:");
		Scanner sm=new Scanner(System.in);
		month=sm.nextInt();
		System.out.println("���������ĳ�������:");
		Scanner sd=new Scanner(System.in);
		day=sd.nextInt();
		zodiac_select(month,day);
	}
	
	public static int day_select() {
		int D;
		String a;
		SimpleDateFormat dm = new SimpleDateFormat("MM");
		a=dm.format(new Date());
		D=Integer.parseInt(a);
		return D;
	}
	
	public static int month_select() {
		int M;
		String a;
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		a=dd.format(new Date());
		M=Integer.parseInt(a);
		return M;
	}
	
	public static int year_select() {
		int Y;
		String a;
		SimpleDateFormat dm = new SimpleDateFormat("MM");
		a=dm.format(new Date());
		Y=Integer.parseInt(a);
		return Y;
	}
	
	public static void zodiac_select(int month,int day) {
		if (month==1) {
			if (day>=20&&day<=31) {
				System.out.println("����ˮƿ��!");
			}
			else {
				System.out.println("����Ħ����!");
			}
		}
		if (month==2) {
			if (day>=19&&day<=30) {
				System.out.println("����˫����!");
			}
			else {
				System.out.println("����ˮƿ��!");
			}
	    }
		if (month==3) {
			if (day>=1&&day<=20) {
				System.out.println("����˫����!");
			}
			else {
				System.out.println("���ǰ�����!");
			}
	    }
		if (month==4) {
			if (day>=11&&day<=19) {
				System.out.println("���ǰ�����!");
			}
			else {
				System.out.println("���ǽ�ţ��!");
			}
	    }
		if (month==5) {
			if (day>=21&&day<=31) {
				System.out.println("����˫����!");
			}
			else {
				System.out.println("���ǽ�ţ��!");
			}
	    }
		if (month==6) {
			if (day>=22&&day<=30) {
				System.out.println("���Ǿ�з��!");
			}
			else {
				System.out.println("����˫����!");
			}
	    }
		if (month==7) {
			if (day>=23&&day<=31) {
				System.out.println("����ʨ����!");
			}
			else {
				System.out.println("���Ǿ�з��!");
			}
	    }
		if (month==8) {
			if (day>=23&&day<=30) {
				System.out.println("���Ǵ�Ů��!");
			}
			else {
				System.out.println("����ʨ����!");
			}
	    }
		if (month==9) {
			if (day>=23&&day<=30) {
				System.out.println("����������!");
			}
			else {
				System.out.println("���Ǵ�Ů��!");
			}
	    }
		if (month==10) {
			if (day>=24&&day<=31) {
				System.out.println("������Ы��!");
			}
			else {
				System.out.println("����������!");
			}
	    }
		if (month==11) {
			if (day>=23&&day<=30) {
				System.out.println("����������!");
			}
			else {
				System.out.println("������Ы��!");
			}
	    }
		if (month==12) {
			if (day>=22&&day<=31) {
				System.out.println("����Ħ����!");
			}
			else {
				System.out.println("����������!");
			}
	    }
	}

	public static void yunshi() {
		int D;
		Random ra =new Random();
		D=ra.nextInt(7)+1;
		switch (D) {
		case 1:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("����������������");
			System.out.println("������Ʒ��ʯ��ʯ");
			System.out.println("�������飺��ȼ�ױ�ը");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("����������˫����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺ϸ������");
			System.out.println("˫����:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�4");
			System.out.println("���������������");
			System.out.println("������Ʒ��Ħ��ʯ ");
			System.out.println("�������飺�Ӻ�����");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("����������������");
			System.out.println("������Ʒ�����ʯ");
			System.out.println("�������飺��׷�");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������˫����");
			System.out.println("������Ʒ���ڼ⾧");
			System.out.println("�������飺��������");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������˫����");
			System.out.println("������Ʒ�������");
			System.out.println("�������飺���Ʒ���");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺ż����");
			System.out.println("��Ы��:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�3");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ��ʯ��ʯ");
			System.out.println("�������飺�������");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������������");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��������");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ���̰׾�");
			System.out.println("�������飺͸����");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("���������������");
			System.out.println("������Ʒ������");
			System.out.println("�������飺�����޹�");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺���Ƽ���");
			break;
		case 2:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������˫����");
			System.out.println("������Ʒ�������");
			System.out.println("�������飺�������");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("���������������");
			System.out.println("������Ʒ�����¹�");
			System.out.println("�������飺��������");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�0");
			System.out.println("����������˫����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺���꽫��");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺�������");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�0");
			System.out.println("����������������");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺��������");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ�������");
			System.out.println("�������飺���꽻��");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�2");
			System.out.println("����������ˮƿ��");
			System.out.println("������Ʒ����ˮ��");
			System.out.println("�������飺������ů");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("���������������");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺С��ˬ");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��������");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ�������");
			System.out.println("�������飺�������");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�6");
			System.out.println("����������˫����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��۵糸");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������˫����");
			System.out.println("������Ʒ��Ħ��ʯ");
			System.out.println("�������飺ȭͷ��ı���");
			break;
		case 3:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��������");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("����������������");
			System.out.println("������Ʒ��̹ɣʯ");
			System.out.println("�������飺���꽻��");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("������������Ů��");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺�����");
			System.out.println("��з��:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�4");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺�ͷ�ϸ��");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������˫����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺����һ���");
			System.out.println("��Ů��:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�3");
			System.out.println("���������������");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺��ת����");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫc");
			System.out.println("�������֣�7");
			System.out.println("����������˫����");
			System.out.println("������Ʒ������");
			System.out.println("�������飺ëë��");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ���̰׾�");
			System.out.println("�������飺�ú������");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("������������Ů��");
			System.out.println("������Ʒ����ɰʯ");
			System.out.println("�������飺ů��");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("����������������");
			System.out.println("������Ʒ�����ʯ");
			System.out.println("�������飺����");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("����������˫����");
			System.out.println("������Ʒ������");
			System.out.println("�������飺�����Ƶ�");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ���������");
			System.out.println("�������飺С��ˬ");
			break;
		case 4:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("������������з��");
			System.out.println("������Ʒ��������");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫc");
			System.out.println("�������֣�3");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ������");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�2");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ��Ħ��ʯ");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������˫����");
			System.out.println("������Ʒ����ĸ��");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�2");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ�������");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ��ʯ��ʯ");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ�����ʯ");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ�����");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("����������ˮƿ��");
			System.out.println("������Ʒ������");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("����������˫����");
			System.out.println("������Ʒ�����ʯ");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ��è��ʯ");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������������");
			System.out.println("������Ʒ��è��ʯ ");
			break;
		case 5:
			System.out.println("������:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�0");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ�����¹�");
			System.out.println("�������飺��ů���");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������˫����");
			System.out.println("������Ʒ���������");
			System.out.println("�������飺��ɳ����");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������˫����");
			System.out.println("������Ʒ���̰׾�");
			System.out.println("�������飺̫����");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ����ˮ��");
			System.out.println("�������飺΢�����");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ���̰׾�");
			System.out.println("�������飺ů��");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("���������������");
			System.out.println("������Ʒ��Īɣ��");
			System.out.println("�������飺���￴��");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ����ʯ");
			System.out.println("�������飺����ϸ����");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������������");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺һ���˳�ɡ");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ����ˮ��");
			System.out.println("�������飺��������");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺������ů");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������ˮƿ��");
			System.out.println("������Ʒ����ˮ��");
			System.out.println("�������飺���������С");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������������");
			System.out.println("������Ʒ���𷢾�");
			System.out.println("�������飺��ʱ��");
			break;
		case 6:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ��̫��ʯ");
			System.out.println("�������飺��������");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("����������������");
			System.out.println("������Ʒ���Ҵ�ʯ");
			System.out.println("�������飺���Ƽ���");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�0");
			System.out.println("������������Ů��");
			System.out.println("������Ʒ���̰׾�");
			System.out.println("�������飺ż����");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������������");
			System.out.println("������Ʒ����ɰʯ");
			System.out.println("�������飺���������С");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("������������Ы��");
			System.out.println("������Ʒ������");
			System.out.println("�������飺ëë��");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��׷�");
			System.out.println("�����:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������ˮƿ��");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺����һҹ������");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("����������������");
			System.out.println("������Ʒ���챦ʯ");
			System.out.println("�������飺ǧ�����");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������˫����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺���꽫��");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ��Īɣ��");
			System.out.println("�������飺���粻��");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ������ɫ");
			System.out.println("�������֣�8");
			System.out.println("���������������");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺����ѹ��");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�2");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺΢�����");
			break;
		case 7:
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("������������з��");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺��������");
			System.out.println("��ţ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("������������Ů��");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺��ë��ѩ");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�2");
			System.out.println("����������ʨ����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺�ϱڲ�ԫ");
			System.out.println("��з��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�3");
			System.out.println("����������Ħ����");
			System.out.println("������Ʒ������ʯ");
			System.out.println("�������飺��׷�");
			System.out.println("ʨ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�9");
			System.out.println("����������˫����");
			System.out.println("������Ʒ����ɰʯ");
			System.out.println("�������飺�����Ƶ�");
			System.out.println("��Ů��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("����������������");
			System.out.println("������Ʒ��������");
			System.out.println("�������飺ëë��");
			System.out.println("�����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�4");
			System.out.println("������������ţ��");
			System.out.println("������Ʒ�����¹�");
			System.out.println("�������飺�Ŀڹ����");
			System.out.println("��Ы��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�7");
			System.out.println("���������������");
			System.out.println("������Ʒ���⾧ʯ");
			System.out.println("�������飺���Ƽ���");
			System.out.println("������:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�6");
			System.out.println("������������з��");
			System.out.println("������Ʒ������ĸ");
			System.out.println("�������飺��ѩ����");
			System.out.println("Ħ����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�8");
			System.out.println("����������˫����");
			System.out.println("������Ʒ�����ʯ");
			System.out.println("�������飺��ʱ��");
			System.out.println("ˮƿ��:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�5");
			System.out.println("����������������");
			System.out.println("������Ʒ���������");
			System.out.println("�������飺�ȷ���");
			System.out.println("˫����:");
			System.out.println("������ɫ����ɫ");
			System.out.println("�������֣�1");
			System.out.println("����������������");
			System.out.println("������Ʒ�������");
			System.out.println("�������飺�������");
			break;
		default:
			break;
		}
	}
}