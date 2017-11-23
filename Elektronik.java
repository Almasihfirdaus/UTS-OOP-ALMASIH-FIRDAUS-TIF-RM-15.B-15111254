public class Elektronik extends Barang {
public void tampil(){
	
	String merek = "samsung";
	String harga = "10jt";
	String warna = "gold";
	String jenis = "smartphone";

	
	Barang b = new Barang();

	b.input ("hp", "10", "sply");

	System.out.println("Merek 		:"+merek);
    System.out.println("harga 		:"+harga);
    System.out.println("warna 		:"+warna);
    System.out.println("jenis 		:"+jenis);
	}
}