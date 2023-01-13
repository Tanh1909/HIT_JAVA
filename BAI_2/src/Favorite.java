import java.util.Scanner;

public class Favorite {
	private String id;
	private String name;
	public Favorite() {
		// TODO Auto-generated constructor stub
	}
	public Favorite(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("NHAP ID FAVORITE: ");
		setId(sc.nextLine());
		System.out.print("NHAP NAME FAVORITE: ");
		setName(sc.nextLine());
	}
	public void tieude() {
		System.out.printf("%-15s%-15s","ID FV","NAME FV");
	}
	public void xuat() {
		System.out.printf("%-15s%-15s",getId(),getName());
	}
	
}
