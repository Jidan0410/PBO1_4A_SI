import Koneksi.Database;
import Model.Dosen;
import Model.Mahasiswa;
import Model.MataKuliah;

public class main{
	public static void main(String [] args){
		System.out.println("Ini Program Main");
		Database.hubungkan();
		Dosen.tampilkaninfo();
		Mahasiswa.tampilkaninfo();
		MataKuliah.tampilkaninfo();
	}
}