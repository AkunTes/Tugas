public class AkunGrab{
	private int nik,saldo,usia;
	private String nama,alamat,jenisKelamin,namaKendaraan,noKendaraan,alamatEmail,noPonsel;

	public AkunGrab(int nik,int saldo,int usia,String nama,String alamat,String jenisKelamin,String namaKendaraan,String noKendaraan,String alamatEmail,String noPonsel){
		this.nik = nik;
		this.saldo = saldo;
		this.usia = usia;
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.namaKendaraan = namaKendaraan;
		this.noKendaraan = noKendaraan;
		this.alamatEmail = alamatEmail;
		this.noPonsel = noPonsel;
	}

	public int Nik(){
		return nik;
	}

	public int Saldo(){
		return saldo;
	}	

	public int Usia(){
		return usia;
	}

	public String Nama(){
		return nama;
	}

	public String Alamat(){
		return alamat;
	}

	public String JenisKelamin(){
		return jenisKelamin;
	}

	public String NamaKendaraan(){
		return namaKendaraan;
	}
	
	public String NoKendaraan(){
		return noKendaraan;
	}

	public String AlamatEmail(){
		return alamatEmail;
	}
	public String NoPonsel(){
		return noPonsel;
	}
}