package odevExecution1;

import java.util.ArrayList;
import java.util.Scanner;

public class metodlar {

	
	
	
	Scanner scanner = new Scanner(System.in);	
	public int cik(ArrayList<String> kelimeler,int i,int AX,int BX,int CX,int DX) {
		if (kelimeler.get(i).equals("CIK")) {
			if (kelimeler.get(i + 1).equals("AX")) {
				if (kelimeler.get(i + 2).equals("BX")) {
					AX = AX - BX;}
				 	else if (kelimeler.get(i + 2).equals("CX")) {
					AX = AX - CX;} 
					else if (kelimeler.get(i + 2).equals("DX")) {
					AX = AX - DX;}
				 	else {
					AX = AX - Integer.parseInt(kelimeler.get(i + 2));}
				
				return AX;}
																		
			else if (kelimeler.get(i + 1).equals("BX")) {
				if (kelimeler.get(i + 2).equals("AX")) {
					BX = BX - AX;}
				 	else if (kelimeler.get(i + 2).equals("CX")) {
					BX = BX - CX;}
				 	else if (kelimeler.get(i + 2).equals("DX")) {
					BX = BX - DX;}
				 	else {
					BX = BX - Integer.parseInt(kelimeler.get(i + 2));}
				
				return BX;}
															
			else if (kelimeler.get(i + 1).equals("CX")) {
				if (kelimeler.get(i + 2).equals("AX")) {
					CX = CX - AX;}
				 else if (kelimeler.get(i + 2).equals("BX")) {
					CX = CX - BX;}
				 else if (kelimeler.get(i + 2).equals("DX")) {
					CX = CX - DX;}
				 else {
					CX = CX - Integer.parseInt(kelimeler.get(i + 2));}
				
				return CX;			
			}
			
			else if (kelimeler.get(i + 1).equals("DX")) {
				if (kelimeler.get(i + 2).equals("AX")) {
					DX = DX - AX;}
				 else if (kelimeler.get(i + 2).equals("BX")) {
					DX = DX - BX;}
				 else if (kelimeler.get(i + 2).equals("CX")) {
					DX = DX - CX;}
				 else {
					DX = DX - Integer.parseInt(kelimeler.get(i + 2));}
				
				return DX;}}
		return 0;}
		
		

	
	
	
	
	
	public int toplama(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("TOP")) {
			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX = AX + BX;}
				 else if (words.get(i + 2).equals("CX")) {
					AX = AX + CX;}
				 else if (words.get(i + 2).equals("DX")) {
					AX = AX + DX;}
				 else {
					AX = AX + Integer.parseInt(words.get(i + 2));}
				
				return AX;}
																
			 else if (words.get(i + 1).equals("BX")) {
				if (words.get(i + 2).equals("AX")) {
					BX = BX + AX;}
				 else if (words.get(i + 2).equals("CX")) {
					BX = BX + CX;}
				 else if (words.get(i + 2).equals("DX")) {
					BX = BX + DX;}
				 else {
					BX = BX + Integer.parseInt(words.get(i + 2));}			
				return BX;}
			
			 else if (words.get(i + 1).equals("CX")) {
				if (words.get(i + 2).equals("AX")) {
					CX = CX + AX;}
				 else if (words.get(i + 2).equals("BX")) {
					CX = CX + BX;}
				 else if (words.get(i + 2).equals("DX")) {
					CX = CX + DX;}
				 else {
					CX = CX + Integer.parseInt(words.get(i + 2));}
				
				return CX;}
			
			 else if (words.get(i + 1).equals("DX")) {
				if (words.get(i + 2).equals("AX")) {
					DX = DX + AX;}
				 else if (words.get(i + 2).equals("BX")) {
					DX = DX + BX;}
				 else if (words.get(i + 2).equals("CX")) {
					DX = DX + CX;}
				 else {
					DX = DX + Integer.parseInt(words.get(i + 2));}
				
				return DX;}}
					
		return 0;}

	

	
	
	
	
	
	public int bolme(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("BOL")) {
			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX = AX / BX;}
				 	else if (words.get(i + 2).equals("CX")) {
					AX = AX / CX;}
				 	else if (words.get(i + 2).equals("DX")) {
					AX = AX / DX;}
				 	else {
					AX = AX / Integer.parseInt(words.get(i + 2));}
				
				return AX;}
								
			else if (words.get(i + 1).equals("BX")) {
				if (words.get(i + 2).equals("AX")) {
					BX = BX / AX;}
				 	else if (words.get(i + 2).equals("CX")) {
					BX = BX / CX;}
				 	else if (words.get(i + 2).equals("DX")) {
					BX = BX / DX;}
				 	else {
					BX = BX / Integer.parseInt(words.get(i + 2));}
				
				return BX;}
			
			else if (words.get(i + 1).equals("CX")) {
				if (words.get(i + 2).equals("AX")) {
					CX = CX / AX;
				} else if (words.get(i + 2).equals("BX")) {
					CX = CX / BX;
				} else if (words.get(i + 2).equals("DX")) {
					CX = CX / DX;
				} else {
					CX = CX / Integer.parseInt(words.get(i + 2));
				}
				return CX;

			}
			else if (words.get(i + 1).equals("DX")) {
				if (words.get(i + 2).equals("AX")) {
					DX = DX / AX;
				} else if (words.get(i + 2).equals("BX")) {
					DX = DX / BX;
				} else if (words.get(i + 2).equals("CX")) {
					DX = DX / CX;
				} else {
					DX = DX / Integer.parseInt(words.get(i + 2));
				}
				return DX;
			}
		}
		return 0;

	}
	public int carp(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("CARP")) {
			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX = AX * BX;
				} 	else if (words.get(i + 2).equals("CX")) {
					AX = AX * CX;
				} 	else if (words.get(i + 2).equals("DX")) {
					AX = AX * DX;
				} 	else {
					AX = AX * Integer.parseInt(words.get(i + 2));
				}

				return AX;
			}
			else if (words.get(i + 1).equals("BX")) {
				if (words.get(i + 2).equals("AX")) {
					BX = BX * AX;
				} 	else if (words.get(i + 2).equals("CX")) {
					BX = BX * CX;
				} 	else if (words.get(i + 2).equals("DX")) {
					BX = BX * DX;
				} 	else {
					BX = BX * Integer.parseInt(words.get(i + 2));
				}

				return BX;
			}
			else if (words.get(i + 1).equals("CX")) {
				if (words.get(i + 2).equals("AX")) {
					CX = CX * AX;
				} else if (words.get(i + 2).equals("BX")) {
					CX = CX * BX;
				} else if (words.get(i + 2).equals("DX")) {
					CX = CX * DX;
				} else {
					CX = CX * Integer.parseInt(words.get(i + 2));
				}
				return CX;

			}
			else if (words.get(i + 1).equals("DX")) {
				if (words.get(i + 2).equals("AX")) {
					DX = DX * AX;
				} else if (words.get(i + 2).equals("BX")) {
					DX = DX * BX;
				} else if (words.get(i + 2).equals("CX")) {
					DX = DX * CX;
				} else {
					DX = DX * Integer.parseInt(words.get(i + 2));
				}
				return DX;
			}
		}
		return 0;

	}
	
	

	public int deg(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("DEG")) {		
			if (words.get(i + 1).equals("AX")) {
				AX=Integer.MAX_VALUE-AX;
				return AX;
			}
			else if (words.get(i + 1).equals("BX")) {
				AX=Integer.MAX_VALUE-BX;
				return BX;

			}
			else if (words.get(i + 1).equals("CX")) {
				AX=Integer.MAX_VALUE-CX;
				return CX;

			}
			else if (words.get(i + 1).equals("DX")) {
				AX=Integer.MAX_VALUE-DX;
				return DX;

			}


		}
		return 0;
	}

	public int okuma(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("OKU")) {
			if(words.get(i+1).equals("AX")) {
				System.out.println("AX'in değerini giriniz: ");
				AX=scanner.nextInt();	
				return AX;				
			}
			if(words.get(i+1).equals("BX")) {
				System.out.println("BX'in değerini giriniz: ");
				BX=scanner.nextInt();	
				return BX;				
			}
			if(words.get(i+1).equals("CX")) {
				System.out.println("CX'in değerini giriniz: ");
				CX=scanner.nextInt();	
				return CX;				
			}
			if(words.get(i+1).equals("DX")) {
				System.out.println("DX'in değerini giriniz: ");
				DX=scanner.nextInt();	
				return DX;				
			}

		}
		return 0;}


	public int hrk(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("HRK")) {
			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX =  BX;
	        } 	else if (words.get(i + 2).equals("CX")) {
	        		AX = CX;
	        } 	else if (words.get(i + 2).equals("DX")) {
	            	AX = DX;
	        } 	else {
	            	AX = Integer.parseInt(words.get(i + 2));
	        }
	        
	        return AX;
		}
		
		else if (words.get(i + 1).equals("BX")) {
			if (words.get(i + 2).equals("AX")) {
				BX =  AX;
        } 	else if (words.get(i + 2).equals("CX")) {
        		BX =  CX;
        } 	else if (words.get(i + 2).equals("DX")) {
            	BX =  DX;
        } 	else {
            	BX =  Integer.parseInt(words.get(i + 2));
        }
        
        return BX;
    }
		else if (words.get(i + 1).equals("CX")) {
	        if (words.get(i + 2).equals("AX")) {
	            CX =  AX;
	        } else if (words.get(i + 2).equals("BX")) {
	            CX =  BX;
	        } else if (words.get(i + 2).equals("DX")) {
	            CX =  DX;
	        } else {
	            CX =  Integer.parseInt(words.get(i + 2));
	        }
	        return CX;
		
}
		else if (words.get(i + 1).equals("DX")) {
	        if (words.get(i + 2).equals("AX")) {
	            DX =  AX;
	        } else if (words.get(i + 2).equals("BX")) {
	            DX =  BX;
	        } else if (words.get(i + 2).equals("CX")) {
	            DX =  CX;
	        } else {
	            DX =  Integer.parseInt(words.get(i + 2));
	        }
	        return DX;
	    }
}
		
		return 0;
}
	public int ve(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("VE")) {

			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX=AX&BX;

				} else if (words.get(i + 2).equals("CX")) {
					AX = AX & CX;
				} else if (words.get(i + 2).equals("DX")) {
					AX = AX & DX;
				} else {
					AX = AX & Integer.parseInt(words.get(i + 2));
				}
				return AX;

			} else if (words.get(i + 1).equals("BX")) {
				if (words.get(i + 2).equals("AX")) {
					BX = BX & AX;
				} else if (words.get(i + 2).equals("CX")) {
					BX = BX & CX;
				} else if (words.get(i + 2).equals("DX")) {
					BX = BX & DX;
				} else {
					BX = BX & Integer.parseInt(words.get(i + 2));
				}
				return BX;
			} else if (words.get(i + 1).equals("CX")) {
				if (words.get(i + 2).equals("AX")) {
					CX = CX & AX;
				} else if (words.get(i + 2).equals("BX")) {
					CX = CX & BX;
				} else if (words.get(i + 2).equals("DX")) {
					CX = CX & DX;
				} else {
					CX = CX & Integer.parseInt(words.get(i + 2));
				}
				return CX;
			} else if (words.get(i + 1).equals("DX")) {
				if (words.get(i + 2).equals("AX")) {
					DX = DX & AX;
				} else if (words.get(i + 2).equals("BX")) {
					DX = DX & BX;
				} else if (words.get(i + 2).equals("CX")) {
					DX = DX & CX;
				} else {
					DX = DX & Integer.parseInt(words.get(i + 2));
				}
				return DX;
			}
		}
		return 0;

	}

	public int vey(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {
		if (words.get(i).equals("VEY")) {

			if (words.get(i + 1).equals("AX")) {
				if (words.get(i + 2).equals("BX")) {
					AX=AX | BX;

				} else if (words.get(i + 2).equals("CX")) {
					AX = AX | CX;
				} else if (words.get(i + 2).equals("DX")) {
					AX = AX | DX;
				} else {
					AX = AX | Integer.parseInt(words.get(i + 2));
				}
				return AX;

			} else if (words.get(i + 1).equals("BX")) {
				if (words.get(i + 2).equals("AX")) {
					BX = BX | AX;
				} else if (words.get(i + 2).equals("CX")) {
					BX = BX | CX;
				} else if (words.get(i + 2).equals("DX")) {
					BX = BX | DX;
				} else {
					BX = BX | Integer.parseInt(words.get(i + 2));
				}
				return BX;
			} else if (words.get(i + 1).equals("CX")) {
				if (words.get(i + 2).equals("AX")) {
					CX = CX | AX;
				} else if (words.get(i + 2).equals("BX")) {
					CX = CX | BX;
				} else if (words.get(i + 2).equals("DX")) {
					CX = CX | DX;
				} else {
					CX = CX | Integer.parseInt(words.get(i + 2));
				}
				return CX;
			} else if (words.get(i + 1).equals("DX")) {
				if (words.get(i + 2).equals("AX")) {
					DX = DX | AX;
				} else if (words.get(i + 2).equals("BX")) {
					DX = DX | BX;
				} else if (words.get(i + 2).equals("CX")) {
					DX = DX | CX;
				} else {
					DX = DX | Integer.parseInt(words.get(i + 2));
				}
				return DX;
			}
		}
		return 0;
	}

	
	public void yazdir(ArrayList<String> words,int i,int AX,int BX,int CX,int DX) {

		if (words.get(i).equals("YAZ")) {
			if (words.get(i + 1).equals("AX")) {
				System.out.println("AX'in degeri: "+AX);



			} else if (words.get(i + 1).equals("BX")) {

				System.out.println("BX'in degeri: "+BX);

			} else if (words.get(i + 1).equals("CX")) {
				System.out.println("CX'in degeri: "+CX);

			} else if (words.get(i + 1).equals("DX")) {
				System.out.println("DX'in degeri: "+DX);

			}
			else 
				System.out.println(words.get(i+1));

		}
	}
}