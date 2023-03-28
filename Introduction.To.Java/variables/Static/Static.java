class Static {

   // Static variable salary
   public static double rating;
   public static String name = "Variables Declaration";
}

class ArticleDemo
{
     public static void main(String args[]) {
      
      //accessing static variable without object         
      Static.rating = 4.5;
      System.out.println(Static.name + "'s  rating:" + Static.rating);
   }
    
}