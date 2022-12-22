package BAI3;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}
	public Cat(String ten) {
		super(ten);
	}
	public Cat(String ten,int tuoi) {
		super(ten,tuoi);
	}
	public Cat(String ten,int tuoi,String mota) {
		super(ten,tuoi,mota);
	}
	@Override
	public void tiengKeu() {
		System.out.println("MEO MEO"); 
	}

}
