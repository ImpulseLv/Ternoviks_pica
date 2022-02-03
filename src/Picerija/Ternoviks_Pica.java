package Picerija;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Ternoviks_Pica {
	
	public static String izveletiesPicu(String picasNos) {
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
		return picasNos;
	}
	
	public static int izveletiesIzm(int picasIzm) {

		try {
			if(picasIzm==30) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasIzm+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(picasIzm==45) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(picasIzm+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(picasIzm==60){
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
		return picasIzm;
	}
	
	public static String izveletiesDzer(String dzer) {
		try {
			if(
					dzer.equals("Kola")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(dzer+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(dzer.equals("Fanta")) {
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(dzer+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else if(dzer.equals("Sprite")){
				FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
				PrintWriter raksta = new PrintWriter(fw) ;
				fw.write(dzer+" | ");
				fw.close();
				JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Tads izmers nepiestav!","Kluda",JOptionPane.ERROR_MESSAGE);
			}
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Notikusi kluda ierakstot faila","Kluda",JOptionPane.ERROR_MESSAGE);
			
		}
		return dzer;
	}
	
public static String iela(String ielasNosaukums) {
		
		try {
			FileWriter fw = new FileWriter("Ternoviks_Pica.txt",true);
			PrintWriter raksta = new PrintWriter(fw) ;
			fw.write(ielasNosaukums+" iela");
			fw.close();
			JOptionPane.showMessageDialog(null,"Saglabats!","Info",JOptionPane.INFORMATION_MESSAGE);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Notikusi kluda ierakstot faila","Kluda",JOptionPane.ERROR_MESSAGE);
		}
		return ielasNosaukums;
	}




	public static void main(String[] args) {
		
		String izvele;
		
		do {
			
		izvele = JOptionPane.showInputDialog("1-Izveleties picu | 2-Izveleties picas izmeru | 3-Iveleties dzerienu | 4-Ievadit ielu | 5-Uzzinat kopigo cenu | stop");
		izvele.toLowerCase();
		String izveleP="";
		int izveleIzm = 0;
		String iela = "";
		String izveleDzer="";
		double cena=0;
		switch(izvele) {
		
		case "1":
			
			izveleP = JOptionPane.showInputDialog("Piperonni | Salami | Havai | Taiti | Margarita");
			izveletiesPicu(izveleP);
			break;
			
		case "2":
			
			izveleIzm =Integer.parseInt(JOptionPane.showInputDialog("30 | 45 | 60 - centimetri"));
			izveletiesIzm(izveleIzm);
			break;
			
		case "3":
			
			izveleDzer = JOptionPane.showInputDialog("Kola | Fanta | Sprite");
			izveletiesDzer(izveleDzer);
			break;
			
		case "4":
			
			 iela =JOptionPane.showInputDialog("Ievadi savu ielu!");
			iela(iela);
			break;
			
		case "5":
			if(izveleP.equals("Piperonni") || izveleP.equals("Havai")){
				cena = cena + 7.99;
			}else {
				cena = cena + 9.99;
			}
			if(izveleIzm==30) {
				cena = cena + 2;
			}else if(izveleIzm==45){
				cena = cena + 3;
			}else if(izveleIzm==60){
				cena = cena + 4;
			}
			if(izveleDzer.equals("Kola")||izveleDzer.equals("Sprite")){
				cena = cena + 1;
			}else {
				cena = cena + 1;
			}
			
		
			
			JOptionPane.showMessageDialog(null, "Par visu pasutito jus samaksasiet: "+cena+" EUR");
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

