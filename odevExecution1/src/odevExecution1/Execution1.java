package odevExecution1;
			
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Scanner;
		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;
		import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
		
public class Execution1 {
			
	public  static int AX=0;
	public static int BX=0;
	public static int CX=0;
	public static int DX=0;												
			public static void main(String[] args) {
					int i=0;
				Scanner scanner = new Scanner(System.in);
				System.out.println("dosyanın konumunu girin:");
				String dosyaYolu = scanner.nextLine();
				ArrayList<String> kelimeler = new ArrayList<>();
				metodlar metod= new metodlar();				
				try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
					String line;

					while ((line = reader.readLine()) != null) {

						String[] tokens = line.split("[,\\s\\[\\]]+");
						kelimeler.addAll(Arrays.asList(tokens));}
										
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				while( i!=kelimeler.size()) {
					if(kelimeler.get(i).equals("TOP")) {
						if(kelimeler.get(i+1).equals("AX")) {
						AX=metod.toplama(kelimeler,i,AX,BX,CX,DX);}					
						else if(kelimeler.get(i+1).equals("BX")) {
							BX=metod.toplama(kelimeler,i,AX,BX,CX,DX);}						
						else if(kelimeler.get(i+1).equals("CX")) {
						CX=metod.toplama(kelimeler,i,AX,BX,CX,DX);}					
						else if(kelimeler.get(i+1).equals("DX")) {
							DX=metod.toplama(kelimeler,i,AX,BX,CX,DX);}											
					}
					
					
					
					
					else if(kelimeler.get(i).equals("CIK")) {
						if(kelimeler.get(i+1).equals("AX")) {
							AX=metod.cik(kelimeler,i,AX,BX,CX,DX);}				
							else if(kelimeler.get(i+1).equals("BX")) {
								BX=metod.cik(kelimeler,i,AX,BX,CX,DX);}								
							else if(kelimeler.get(i+1).equals("CX")) {
							CX=metod.cik(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("DX")) {
								DX=metod.cik(kelimeler,i,AX,BX,CX,DX);}		}											
					
					
					
					
					
					else if(kelimeler.get(i).equals("CARP")) {
						if(kelimeler.get(i+1).equals("AX")) {
							AX=metod.carp(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("BX")) {
								BX=metod.carp(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("CX")) {
							CX=metod.carp(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("DX")) {
								DX=metod.carp(kelimeler,i,AX,BX,CX,DX);}}
								
						
					
					
					
					
					
					
					else if(kelimeler.get(i).equals("BOL")) {
						if(kelimeler.get(i+1).equals("AX")) {
							AX=metod.bolme(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("BX")) {
								BX=metod.bolme(kelimeler,i,AX,BX,CX,DX);}								
							else if(kelimeler.get(i+1).equals("CX")) {
							CX=metod.bolme(kelimeler,i,AX,BX,CX,DX);}						
							else if(kelimeler.get(i+1).equals("DX")) {
								DX=metod.bolme(kelimeler,i,AX,BX,CX,DX);}}
														
					
					
					
					
					
					
					
					else if(kelimeler.get(i).equals("VE")) {						
						if(kelimeler.get(i+1).equals("AX")) {							 
							AX=metod.ve(kelimeler,i,AX,BX,CX,DX);}												
						else if(kelimeler.get(i+1).equals("BX")) {						
							BX=metod.ve(kelimeler,i,AX,BX,CX,DX);}				
						else if(kelimeler.get(i+1).equals("CX")) {						
							CX=metod.ve(kelimeler,i,AX,BX,CX,DX);}				
						else if(kelimeler.get(i+1).equals("DX")) {							
							DX=metod.ve(kelimeler,i,AX,BX,CX,DX);}}
					
					
					else if(kelimeler.get(i).equals("VEY")) {						
						if(kelimeler.get(i+1).equals("AX")) {					 
							AX=metod.ve(kelimeler,i,AX,BX,CX,DX);}											
						else if(kelimeler.get(i+1).equals("BX")) {					
							BX=metod.ve(kelimeler,i,AX,BX,CX,DX);}					
					else if(kelimeler.get(i+1).equals("CX")) {						
							CX=metod.ve(kelimeler,i,AX,BX,CX,DX);}				
						else if(kelimeler.get(i+1).equals("DX")) {							
							DX=metod.ve(kelimeler,i,AX,BX,CX,DX);}}
					
					
					
					else if(kelimeler.get(i).equals("DEG")) {
						if(kelimeler.get(i+1).equals("AX")) {
							AX=metod.deg(kelimeler,i,AX,BX,CX,DX);}						
						else if(kelimeler.get(i+1).equals("BX")) {
							BX=metod.deg(kelimeler,i,AX,BX,CX,DX);}						
						else if(kelimeler.get(i+1).equals("CX")) {
							CX=metod.deg(kelimeler,i,AX,BX,CX,DX);}					
						else if(kelimeler.get(i+1).equals("DX")) {
							DX=metod.deg(kelimeler,i,AX,BX,CX,DX);}}
						
						
					
					
					
					else if(kelimeler.get(i).equals("HRK")) {						
							if(kelimeler.get(i+1).equals("AX")) {
								AX=metod.hrk(kelimeler,i,AX,BX,CX,DX);}							
							else if(kelimeler.get(i+1).equals("BX")) {
								BX=metod.hrk(kelimeler,i,AX,BX,CX,DX);}								
							else if(kelimeler.get(i+1).equals("CX")) {
								CX=metod.hrk(kelimeler,i,AX,BX,CX,DX);}						
							else if(kelimeler.get(i+1).equals("DX")) {
								DX=metod.hrk(kelimeler,i,AX,BX,CX,DX);}}
														
					
				
					
					
					else if(kelimeler.get(i).equals("OKU")) {
						if(kelimeler.get(i+1).equals("AX")) {
							AX=metod.okuma(kelimeler,i,AX,BX,CX,DX);}													
						else if(kelimeler.get(i+1).equals("BX")) {
							BX=metod.okuma(kelimeler,i,AX,BX,CX,DX);}													
						else if(kelimeler.get(i+1).equals("CX")) {
							CX=metod.okuma(kelimeler,i,AX,BX,CX,DX);}												
						else if(kelimeler.get(i+1).equals("DX")) {
							DX=metod.okuma(kelimeler,i,AX,BX,CX,DX);}}
							
						
						
						
					
					
					else if(kelimeler.get(i).equals("YAZ")) {
						if(kelimeler.get(i+1).equals("AX")) {
						metod.yazdir(kelimeler,i,AX,BX,CX,DX);}					
						else if(kelimeler.get(i+1).equals("BX")) {
							metod.yazdir(kelimeler,i,AX,BX,CX,DX);}						
						else if(kelimeler.get(i+1).equals("CX")) {
							metod.yazdir(kelimeler,i,AX,BX,CX,DX);}						
						else if(kelimeler.get(i+1).equals("DX")) {
							metod.yazdir(kelimeler,i,AX,BX,CX,DX);}}
							
					i++;}}}
					
					
	


