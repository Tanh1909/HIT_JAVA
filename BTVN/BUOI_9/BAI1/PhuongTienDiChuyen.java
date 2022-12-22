package BAI1;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat=new HangSanXuat();
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String layTenHangSanXuat() {
		return hangSanXuat.getTenHangSanXuat();
	}
	public void batDau() {
		System.out.println("BAT DAU");
	}
	public void tangToc() {
		System.out.println("TANG TOC");
	}
	public void dungLai() {
		System.out.println("DUNG LAI");
	}
	public abstract double layVanToc();
}
