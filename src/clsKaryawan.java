//import komponen 
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest_2
 */
public class clsKaryawan extends clsKoneksi{
    //Mendeklarasikan variabel/atribut 
    String NIK; 
    String Nama; 
    String KodeDep; 
    int Gaji; 
	
    //Method menampilkan data 
    public void TampilData() 
    { 
	sql = "select tblKaryawan.NIK, tblKaryawan.Nama, tblKaryawan.KodeDep, tbldepartemen.NamaDep, tblKaryawan.Gaji from (tblKaryawan LEFT JOIN tbldepartemen ON tblKaryawan.KodeDep = tbldepartemen.KodeDep)"; 
    } 
	
    //Method baru 
    public void Baru() 
    { 
        try 
	{ 
            NIK = ""; 
            Nama = "";
            KodeDep = ""; 
            Gaji = 0;
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method simpan data 
    public void Simpan() 
    { 
        try 
	{ 
            sql = "insert into tblKaryawan values ('"+ NIK +"', '" + Nama + "', '" + KodeDep + "', '" + Gaji + "')"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //method edit data 
    public void Edit() 
    { 
        try 
	{ 
            sql = "update tblKaryawan set Nama = '" + Nama + "', KodeDep = '" + KodeDep + "', Gaji = '" + Gaji + "' where Nik ='" + NIK + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method hapus data 
    public void Hapus(String mKodeDep) 
    { 
        try 
	{ 
            sql = "delete from tblKaryawan where NIK = '" + NIK + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method keluar 
    public void Keluar() 
    { 
	try 
	{ 
            JOptionPane.showMessageDialog(null,"Keluar dari form pegawai"); 
	}
        catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    }
}
