import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HoneyManager {
	public static List<Honey> list;
	Scanner sc = new Scanner(System.in);

	public HoneyManager() {
		list = new ArrayList<>();
	}

	public boolean check(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (id.equalsIgnoreCase(list.get(i).getId())) {
				return true;
			}
		}
		return false;
	}

	public void addHoney() {
		Honey hn = new Honey();
		hn.nhap();
		if (check(hn.getId())) {
			System.out.println("TRUNG ID!");
			return;
		} else {
			list.add(hn);
		}
	}

	public void showAllHoney() {
		Honey hn = new Honey();
		hn.tieude();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).xuat();
		}
	}

	public void DeleteHoney() {
		System.out.print("NHAP ID MUON XOA: ");
		String id = sc.nextLine();
		if (check(id)) {
			boolean ok = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equalsIgnoreCase(id)) {
					ok = true;
					list.remove(i);
				}
			}
			if (ok) {
				System.out.println("XOA THANH CONG!");
			} else {
				System.out.println("XOA THAT BAI!");
			}
		} else {
			System.out.println("KHONG TIM THAY ID!");
		}

	}

	public void editHoney() {
		System.out.print("NHAP ID MUON SUA: ");
		String id = sc.nextLine();
		if (check(id)) {
			Honey hn=new Honey();
			for(int i=0;i<list.size();i++) {
				if(id.equalsIgnoreCase(list.get(i).getId())) {
					hn=list.get(i);
				}
			}
			System.out.print("NHAP THONG TIN MUON SUA:(NAME,AGE,PHONE,STATUS) ");
			String sql=sc.nextLine();
			if(sql.equalsIgnoreCase("NAME")) {
				System.out.print("NHAP NAME MUON SUA: ");
				String name=sc.nextLine();
				hn.setName(name);
			}
			if(sql.equalsIgnoreCase("AGE")) {
				System.out.print("NHAP AGE MUON SUA: ");
				int age=sc.nextInt();
				sc.nextLine();
				hn.setAge(age);
			}
			if(sql.equalsIgnoreCase("PHONE")) {
				System.out.print("NHAP PHONE MUON SUA: ");
				String phone=sc.nextLine();
				hn.setPhone(phone);
			}
			if(sql.equalsIgnoreCase("STATUS")) {
				System.out.print("NHAP STAUS MUON SUA: ");
				int status=sc.nextInt();
				sc.nextLine();
				hn.setStatus(status);;
			}
		} else {
			System.out.println("KHONG TIM THAY ID!");
		}

	}
	public void addFV() {
		System.out.print("NHAP ID MUON THEM FV: ");
		String id=sc.nextLine();
		if(check(id)) {
			for(int i=0;i<list.size();i++) {
				if(id.equalsIgnoreCase(list.get(i).getId())) {
					list.get(i).addFv();
				}
			}
		}
		else {
			System.out.println("KHONG TIM THAY ID!");
		}
	}
	public void sortByName() {
		Collections.sort(list,(a,b)->b.getFirstName().compareTo(a.getFirstName()));
		showAllHoney();
	}
	
}
