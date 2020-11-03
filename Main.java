class Main {
  public static void main(String[] args) {
      String[] names = {"Kanye","Biden","Trump","Victor","Tomster","BIG","threepac"};
      for(int i = 0; i < 7;i++){
      System.out.println(names[i]);
     }

    names [6]= "tupac";
    System.out.println("\n Here is our updated array.");
    for(int i = 0; i < 7;i++){
    System.out.println(names[i]);
    }
   sysytem.out.println("Looping backwards through array");
   for(int i = 8;i >= 0;i--);{
     System.out.println(names[i]);
   }
  
  }
}