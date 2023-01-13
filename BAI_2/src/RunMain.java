import java.awt.Menu;
import java.util.Scanner;

public class RunMain {
	public static void menu() {
		System.out.println("=============MENU===========");
		System.out.println("1.ADD HONEY");
		System.out.println("2.SHOW ALL HONEYS");
		System.out.println("3.DELETE HONEY BY ID");
		System.out.println("4.EDIT HONEY BY ID");
		System.out.println("5.ADD FV HONEY BY ID");
		System.out.println("6.SORT HONEY BY NAME");
		System.out.println("7.EXIT");
	}

	public static void main(String[] args) {
		HoneyManager hnm = new HoneyManager();
		Scanner sc = new Scanner(System.in);
		menu();
		while (true) {
			System.out.print("NHAP LUA CHON: ");
			int luachon = sc.nextInt();
			switch (luachon) {
			case 1: {
				hnm.addHoney();
				break;
			}
			case 2: {
				hnm.showAllHoney();
				break;
			}
			case 3: {
				hnm.DeleteHoney();
				break;
			}
			case 4: {
				hnm.editHoney();
				break;
			}
			case 5: {
				hnm.addFV();
				break;
			}
			case 6: {
				hnm.sortByName();
				break;
			}
			default:
				System.out.println("LUA CHON KHONG CHINH XAC!");
			}
		}
	}
}
