package Picerija;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Ternoviks_Pica {
	
	public static void izveletiesPicu(String picasNos) {
		try {
			if(picasNos.equals("Havai")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasNos+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}else if(picasNos.equals("Piperonni")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasNos+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}else if(picasNos.equals("Taiti")){
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasNos+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}else if(picasNos.equals("Salami")){
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasNos+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}else if(picasNos.equals("Margarita")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasNos+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(null, "Tada pica neeksiste","Kluda",JOptionPane.ERROR_MESSAGE);
			}
		
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "Notikusi kluda ierakstot faila","Kluda",JOptionPane.ERROR_MESSAGE);
	}
	}
	
	public static void izveletiesIzm(String picasIzm) {

		try {
			if(picasIzm.equals("30cm")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasIzm+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(picasIzm.equals("45cm")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasIzm+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(picasIzm.equals("60cm")){
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasIzm+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Tads izmers nepiestav!","Kluda",JOptionPane.ERROR_MESSAGE);
			}
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Notikusi kluda ierakstot faila","Kluda",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}


	public static void main(String[] args) {
		
		String izvele;
		
		do {
			
		izvele = JOptionPane.showInputDialog("1-Izveleties picu | 2-Izveleties picas izmeru | 3-Iveleties dzerienu | 4-Ievadit ielu | 5-Uzzinat kopigo cenu | stop");
		izvele.toLowerCase();
		
		switch(izvele) {
		
		case "1":
			String izveleP = JOptionPane.showInputDialog("Piperonni | Salami | Havai | Taiti | Margarita");
			izveletiesPicu(izveleP);
			break;
			
		case "2":
			String izveleIzm = JOptionPane.showInputDialog("30cm | 45cm | 60cm");
			izveletiesIzm(izveleIzm);
			break;
			
		case "3":
			
			break;
			
		case "4":
			
			break;
			
		case "5":
			
			break;
			
		case "stop":
			JOptionPane.showMessageDialog(null,"Programma aptureta","Info",JOptionPane.INFORMATION_MESSAGE);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Darbiba nepastav","Kluda",JOptionPane.ERROR_MESSAGE);
		
		}
			
		}while(!izvele.equals("stop"));

	}

}

