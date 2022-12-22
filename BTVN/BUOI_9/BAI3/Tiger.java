package BAI3;

public class Tiger extends Animal {
	
	public Tiger() {
		super();
	}
	public Tiger(String ten) {
		super(ten);
	}
	public Tiger(String ten,int tuoi) {
		super(ten,tuoi);
	}
	public Tiger(String ten,int tuoi,String mota) {
		super(ten,tuoi,mota);
	}
	@Override
	public void tiengKeu() {
		System.out.println("GRU GRU"); 
	}

}
