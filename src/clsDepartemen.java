import javax.swing.JOptionPane;
public class clsDepartemen extends clsKoneksi{
    //mendeklararsikan variabel/atribut 
    String KodeDep; 
    String NamaDep; 

    //method menampilkan data 
    public void TampilData() 
    {    
	sql = "select * from tbldepartemen"; 
    } 

    //method baru untuk menambah data 
    public void Baru(String mKodeDep, String mNamaDep) 
    { 
	try 
	{ 
            mKodeDep = ""; 
            mNamaDep = ""; 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method untuk menyimpan data 
    public void Simpan(String mKodeDep, String mNamaDep) 
    { 
        try 
        { 
            sql = "insert into tblDepartemen values ('"+ mKodeDep +"', '" + mNamaDep + "')"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method untuk edit data 
    public void Edit(String mKodeDep, String mNamaDep) 
    { 
	try 
	{ 
            sql = "update tbldepartemen set NamaDep = '" + mNamaDep + "'where KodeDep ='" + mKodeDep + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method hapus data 
    public void Hapus(String mKodeDep) 
    { 
	try 
	{ 
            sql = "delete from tbldepartemen where KodeDep = '" + mKodeDep + "'"; 
	}
	catch (Exception e) 
	{
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method keluar 
    public void Keluar() 
    { 
	try 
	{ 
            JOptionPane.showMessageDialog(null,"Keluar dari form departemen"); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    }
}
