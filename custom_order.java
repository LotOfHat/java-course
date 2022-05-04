// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input
git add custom_order.java
git commit -m"add cupcake shop"
git push origin master

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	    Scanner scanner = new Scanner (System.in);
	    String nomeUtente;
	    String tipoOrdine;
	    String glassa;
	    String ripieno;
	    String guarnizione;
	    String input;
	    int numeroCupcake;
	    
	    double costo= 15.00;
	    final double TAX_RATE= .08;
	    double tax;
	   
	    
	  

	 
    // Introduce shop and prompt user to input first name
      System.out.println("BENVENUTO NELLO SHOP JAVA CHAKE & CUPCAKE!");
	System.out.println("Realizziamo torte personalizzate con la nostra ricetta segreta.");

    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   SYstem.out.println("Inserisci il tuo nome e cognome");
	    nomeUtente=Scanner.nextLine;
  
    System.out.println("Benvenuto/a"+nomeUtente+". Seleziona e visualizza il nostro menù : "); 
	    System.out.println("\n");
    // STEP 4 DISPLAY MENU
	System.out.println("--------- MENU' ----------");
	System.out.println("1. Ordina una torta.");
	System.out.println("2. Ordina un set di cupcake.");
	 System.out.println("3. Esci dal menù."); 
    
    // STEP 5 PROMPT USER TO ORDER
	    case 1:
	    System.out.println("Che tipo di torta desideri?");
	    tipoOrdine=Scanner.nextLine;
	  	System.out.println("Indica la glassa: ");
	   	System.out.println("Vaniglia");
	   	System.out.pritnln("Cioccolato";
		System.out.println("Cocco";
		System.out.println("Frutti di bosco");
	   glassa=Scanner.nextLine;
	    System.out.println("Inserisci il ripierno: ");
	    System.out.println("Mocha");
	    System.out.println("Menta");		   
	    System.out.println("Limone");
	    System.out.println("Cioccolato");
		ripeino=Scanner.nextLine;		 
	    break;
	    case 2: 
	    System.out,println("Quanti cupcake desideri?");
	    numeroCupcake=Scanner.nextInt;
		System.out.println("\n");
		System.out.println("Indica la glassa per i tuoi cupcake");
		System.out.println("Mocha");
	    	System.out.println("Menta");		   
	   	System.out.println("Limone");
	    	System.out.println("Cioccolato")
		guarnizione=Scanner.nextLine;		   ;		   
	    break;
	    case 3:
	    System.out.println("Grazie per aver visitato lo shop. A presto !.");
	    break;

      
    // STEP 9 DISPLAY ORDER CONFIRMATION
	System.out.println("");
	System.out.pritnln(nomeUtente+", abbiamo ricevuto il tuo ordine.);
	System.out.println("_________________________________________");
	System.out.println("Cos'hai ordinato: " + tipoOrdine);
	System.out.println("Numero cupcake: " + numeroCupcake);		   
	System.out.println("Glassa: " + glassa);
	System.out.println("Ripieno: " + ripieno);
	System.out.println("Guarnizione: " + guarnizione);
	System.out.println("_________________________________________");	   
			   

      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  System.out.println("Il costo del tuo ordine è: "+ costo);
	tax= costo*TAX_RATE;
  System.out.println("Il valore delle tasse è: "+ tax);	
  System.out.println("Il totale del tuo ordine è: "+ (tax+costo));			   
    }   
}
