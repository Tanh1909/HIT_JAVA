import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Honey extends Person {
	private String id;
	private int status;
	private Favorite fv;
	private List<Favorite> listfv=new ArrayList<>();
	public Honey() {
		fv=new Favorite();
	}
	public Honey(String id, int status, Favorite fv) {

		this.id = id;
		this.status = status;
		this.fv = fv;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Favorite getFv() {
		return fv;
	}
	public void setFv(Favorite fv) {
		this.fv = fv;
	}
	public void addFv() {
		fv.nhap();
		listfv.add(fv);
	}
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.print("NHAP ID: ");
		setId(sc.nextLine());
		System.out.println("NHAP STATUS: ");
		setStatus(sc.nextInt());
		sc.nextLine();
	}
	public void tieude() {
		super.tieude();
		System.out.printf("%-15s%-10s","ID","STATUS");
		System.out.println();
	}
	public void xuat() {
		super.xuat();
		System.out.printf("%-15s%-10d",getId(),getStatus());
		System.out.println();
	}
}
