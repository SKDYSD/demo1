package one;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		int num[]=new int[10];
		int i=0;
		int j=0;
		int n;
		Scanner sc=new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.printf("请输入第%d个数:",i+1);
			num[i]=sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				if (num[i]>num[j]) {
					n=num[i];
					num[i]=num[j];
					num[j]=n;
				}
			}
		}
		System.out.printf("倒序排序后的结果:\n");
		for (i = 0; i < 10; i++) {
			System.out.printf("%d\t",num[i]);
		}
	}

}
