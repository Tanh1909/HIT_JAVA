package BAI3;

import java.util.Scanner;

public class testZoo {
	static void menu() {
		System.out.println("--------------MENU--------------");
		System.out.println("1.THEM CHUONG");
		System.out.println("2.XOA CHUONG");
		System.out.println("3.THEM CON VAT");
		System.out.println("4.XOA CON VAT");
		System.out.println("5.XEM TAT CA CAC CON VAT");
		System.out.println("6.THOAT");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon;
		zoo z=new zoo();
		menu();
		do {
			System.out.print("NHAP LUA CHON: ");
			luachon = sc.nextInt();
			switch (luachon) {
				case 1:{
					z.themChuong();
					break;
				}
				case 2:{
					z.xoaChuong();
					break;
				}
				case 3:{
					z.themConVat();
					break;
				}
				case 4:{
					z.XoaConVat();
					break;
				}
				case 5:{
					z.Display();
					break;
				}
				case 6:{
					System.exit(0);
					break;
				}
				default:{
					System.out.println("LUA CHON KHONG HOP LE");
					break;
				}
			}
		} while (true);
	}
}
