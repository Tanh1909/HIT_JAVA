package BAI2;

import java.util.ArrayList;

public class runMain {
	public static void main(String[] args) {
		ArrayList<IShape> listIS= new ArrayList<>();
		listIS.add(new Circle(5));
		listIS.add(new Rectangle(2,3));
		listIS.add(new Circle(2));
		for(int i=0;i<listIS.size();i++) {
			System.out.println("HINH THU:"+(i+1));
			if(listIS.get(i) instanceof Circle) {
				System.out.println("	DIEN TICH HINH TRON: "+listIS.get(i).getArea());
				System.out.println("	CHU VI HINH TRON: "+listIS.get(i).getPerimeter());
			}
			else {
				System.out.println("	DIEN TICH HINH CHU NHAT: "+listIS.get(i).getArea());
				System.out.println("	CHU VI HINH CHU NHAT: "+listIS.get(i).getPerimeter());
			}
		}
	}
}
