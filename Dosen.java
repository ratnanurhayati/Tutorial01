public class Dosen {
	private String nama;
	private String nidn;

	public DosenModel (String nama, String nidsn){
		this.nama = nama;
		this.nidn = nidn;
	}

	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}



	public String getNidn(){
		return nidn;
	}
	public void setNidn(String nidn){
		this.nidn = nidn;
	}

}