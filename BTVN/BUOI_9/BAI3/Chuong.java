package BAI3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong {
	private int maChuong;
	ArrayList<Animal> AnimalList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public Chuong(int maChuong) {
		this.maChuong=maChuong;
	}

	public int getMaChuong() {
		return maChuong;
	}
	public void setMaChuong(int maChuong) {
		this.maChuong = maChuong;
	}
	
	public void themConVat(Animal a) {
		System.out.print("NHAP TEN: ");
		a.setTen(sc.nextLine());
		System.out.print("NHAP TUOI: ");
		a.setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.print("NHAP MO TA: ");
		a.setMoTa(sc.nextLine());
		AnimalList.add(a);
	}
	public void xoaConVat(String ten) {
		for(int i=0;i<AnimalList.size();i++) {
			if(AnimalList.get(i).getTen()==ten) {
				AnimalList.remove(i);
			}
		}
	}
	
	public void show() {
		for(int i=0;i<AnimalList.size();i++) {
			if(AnimalList.get(i) instanceof Tiger) {
				System.out.println("\t\tTiger");
				AnimalList.get(i).xemThongTin();
			}
			else if(AnimalList.get(i) instanceof Cat) {
				System.out.println("\t\tCat");
				AnimalList.get(i).xemThongTin();
			}
			else {
				System.out.println("\t\tDog");
				AnimalList.get(i).xemThongTin();
			}
		}
	}
	
}
