import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String phone;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String gender, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFirstName() {
		String hoten=getName();
		int index=hoten.lastIndexOf(" ");
		String firstName=hoten.substring(index);
		return firstName;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("NHAP TEN: ");
		setName(sc.nextLine());
		System.out.print("NHAP TUOI: ");
		setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("NHAP GIOI TINH: ");
		setGender(sc.nextLine());
		System.out.print("NHAP SO DIEN THOAI: ");
		setPhone(sc.nextLine());
	}
	public void tieude() {
		System.out.printf("%-15s%-15s%-15s%-15s","HO TEN","TUOI","GIOI TINH","SDT");
	}
	public void xuat() {
		System.out.printf("%-15s%-15d%-15s%-15s",getName(),getAge(),getGender(),getPhone());
	}
}
