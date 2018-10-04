class HelloCodiva {
  
  /* Kopieer deze code in Codiva en probeer dingen uit! */
  
  public static void main(String[] args) {
    
    //Gebruik maken van strings.
    //Maak twee strings aan en concateneer deze.
    String groet = "hoi ";
    String naam = "Samed";
    String hallo = groet + naam;
    System.out.println(hallo);
    
    //Gebruik maken van een int, een while loop en een if-statement.
    //Zet de variabele x op 5. Telt steeds 1 op bij x zolang x kleiner is dan 100 en print dit.
    //Kijk of het gelukt is; is x gelijk aan 100?
    int x = 5;
    while (x < 100) {
      x++;
      System.out.println(x);
    }
    
    if (x == 100) {
      System.out.println("goed gedaan");
    } else {
      System.out.println("fout :(");
    }

    //Gebruiker maken van een array met integers en een for loop.
    //Maak een array aan die plek heeft voor 4 integers en vul deze array.
    //Print de waarden in de array door middel van een for loop.
    int[] getallenArray = new int[4];
    getallenArray[0] = 7;
    getallenArray[1] = 4;
    getallenArray[2] = 9;
    getallenArray[3] = 11;
    
    for (int i = 0; i < 4; i++) {
      System.out.println(getallenArray[i]);
    }
    
    //Gebruik maken van een double
    //Maak een double aan, geef die een waarde, verdubbel de waarde en print deze.
    double d = 5.6;
    d = d * 2;
    System.out.println(d);
    
    //Gebruik maken van een boolean en een if-statement
    //Maak een boolean aan, geef die waaqrde true en print een text als deze waarde false is
    boolean defect = true;
    if (!defect) {
      System.out.println("ik ben niet defect");
    }
    
  }
  
}
