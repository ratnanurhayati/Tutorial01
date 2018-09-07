public class Mahasiswa {
	private String nama;
	private String npm;
	private double ipk;

	public MahasiswaModel (String nama, String npm, double ipk){
		this.nama = nama;
		this.npm = npm;
		this.ipk = ipk;
	}

	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}



	public String getNpm(){
		return npm;
	}
	public void setNpm(String npm){
		this.npm = npm;
	}

	public double getIpk(){
		return ipk;
	}
	public void setIpk(double ipk){
		this.ipk = ipk;
	}
}