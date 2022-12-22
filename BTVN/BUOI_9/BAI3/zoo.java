package BAI3;

import java.util.ArrayList;
import java.util.Scanner;

public class zoo {
	static Scanner sc=new Scanner(System.in);
	ArrayList<Chuong> DanhSachChuong=new ArrayList<>();
	public void themChuong() {
		System.out.print("NHAP MA CHUONG MUON THEM: ");
		int maChuong=sc.nextInt();
		sc.nextLine();
		Chuong c=new Chuong(maChuong);
		DanhSachChuong.add(c);
		
	}
	public void xoaChuong() {
		System.out.print("NHAP MA CHUONG MUON XOA");
		int maChuong=sc.nextInt();
		for(int i=0;i<DanhSachChuong.size();i++) {
			if(DanhSachChuong.get(i).getMaChuong()==maChuong) {
				DanhSachChuong.remove(i);
			}
		}
	}
	public void themConVat() {
		System.out.print("NHAP MA CHUONG CAN THEM CON VAT: ");
		int maChuong=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<DanhSachChuong.size();i++) {
			if(DanhSachChuong.get(i).getMaChuong()==maChuong) {
				String loaidv;
				System.out.print("NHAP LOAI DONG VAT MUON THEM (Tiger,Dog,Cat)");
				loaidv=sc.nextLine();
				if(loaidv.equalsIgnoreCase("Tiger")) {
					Tiger t=new Tiger();
					DanhSachChuong.get(i).themConVat(t);
				}
				else if(loaidv.equalsIgnoreCase("Dog")) {
					Dog d=new Dog();
					DanhSachChuong.get(i).themConVat(d);
				}
				else {
					Cat c=new Cat();
					DanhSachChuong.get(i).themConVat(c);
				}
			}
		}
	}
	public void XoaConVat() {
		System.out.print("NHAP MA CHUONG CAN XOA CON VAT: ");
		int maChuong=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<DanhSachChuong.size();i++) {
			if(DanhSachChuong.get(i).getMaChuong()==maChuong) {
				System.out.print("NHAP TEN CON VAT CAN XOA");
				String ten=sc.nextLine();
				DanhSachChuong.get(i).xoaConVat(ten);
			}
		}
	}
	public void Display() {
		for(int i=0;i<DanhSachChuong.size();i++) {
			System.out.println("MA CHUONG: "+DanhSachChuong.get(i).getMaChuong());
			DanhSachChuong.get(i).show();
		}
	}
}
