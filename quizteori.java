import java.util.Scanner;

class quizteori{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int biayabeban = 0;
		String nama;
		int tipe;
		int bayar,kembalian,total,meteran;
		boolean loop = true;
		
			
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
		System.out.println("Tipe Rumah 31 =  Rp. 100.000 ");
		System.out.println("Tipe Rumah 32 =  Rp. 125.000 ");
		System.out.println("Tipe Rumah 33 =  Rp. 450.000 ");
		System.out.println("Tipe Rumah 34 =  Rp. 480.000 ");
		System.out.println("Tipe Rumah 35 =  Rp. 500.000 ");
		System.out.println("Tipe Rumah 36 =  Rp. 550.000 ");
	
		while(loop){
		System.out.print("Masukkan Tipe Rumah (31|32|33|34|35|36) : ");
		tipe = input.nextInt();
		
		
		 switch(tipe){
            case 31 :
                biayabeban = 100000;
                System.out.println("Biaya Beban : "+biayabeban);
                
                loop = false;
                break;
                
            case 32 :
               biayabeban = 125000;
                 System.out.println("Biaya Beban :" +biayabeban);
                 
                loop= false;
                break;
                
            case 33 :
               biayabeban = 450000;
                 System.out.println("Biaya Beban :" +biayabeban);
                 
                loop = false;
                break;
                
            case 34 :
               biayabeban = 480000;
                 System.out.println("BIaya Beban :" +biayabeban);
                 
                loop = false;
                break;
                
            case 35 :
               biayabeban = 500000;
                 System.out.println("Biaya Beban :" +biayabeban);
                 
                loop = false;
                break;
                
            case 36 :
               biayabeban = 550000;
                 System.out.println("Biaya Beban :" +biayabeban);
                 
                loop = false;
                break;
            
               default :
                System.out.println("Tidak Ada Pilihan");        
        }
        
        
	  
	}
		System.out.println("---------------------------------");
		System.out.print("Masukkan Jumlah Meteran : ");
		meteran = input.nextInt();
		
		total = meteran*biayabeban;
		
		System.out.println("---------------------------------");
		System.out.println("Nama     	: "+nama );
	  	System.out.println("Total Harga	: "+total);
	
	  	System.out.print("Masukkan Jumlah Uang Anda : ");
		bayar = input.nextInt();
		
		kembalian =  bayar - total;
		
		System.out.println("----------------------------------");
	   	System.out.println("Bayar 		: "+bayar);
	   	System.out.println("Kembalian	: "+kembalian);
	   
	    	
		
				
	}
}