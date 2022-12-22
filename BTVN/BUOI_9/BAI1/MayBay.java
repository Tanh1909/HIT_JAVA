package BAI1;

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 50;
	}
	public void catCanh() {
		System.out.println("CAT CANH");
	}
	public void haCanh() {
		System.out.println("HA CANH");
	}
}
