package basic.dev;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("nhập giá trị a:");
		a = sc.nextInt();
		System.out.println("nhập giá trị b:");
		b = sc.nextInt();
		int tong = a+b;
		System.out.println("Tổng của "+a+"+"+b+" ="+tong);
		int hieu = a-b;
		System.out.println("Hieu của "+a+"-"+b+" ="+hieu);
		int tich = a*b;
		System.out.println("Tich của "+a+"*"+b+" ="+tich);
		int thuong = (int) ((float) a/b);
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Tich của "+a+"/"+b+" =" + decimalFormat.format(thuong));
		 
		

	}

}
