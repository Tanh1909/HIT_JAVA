package BAI3;

public abstract class Animal {
	protected String ten;
	protected int tuoi;
	protected String moTa;
	
	public Animal() {
	}
	public Animal(String ten) {
		this.ten=ten;
	}
	public Animal(String ten, int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public Animal(String ten, int tuoi, String moTa) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.moTa = moTa;
	}
	

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	public void xemThongTin() {
		System.out.println("\t\t\tTEN: "+getTen());
		System.out.println("\t\t\tTUOI: "+getTuoi());
		System.out.println("\t\t\tMOTA: "+getMoTa());
	}
	public abstract void tiengKeu();
	
}
