package BAI3;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}
	public Dog(String ten) {
		super(ten);
	}
	public Dog(String ten,int tuoi) {
		super(ten,tuoi);
	}
	public Dog(String ten,int tuoi,String mota) {
		super(ten,tuoi,mota);
	}

	@Override
	public void tiengKeu() {
		System.out.println("GAU GAU"); 
	}

}
