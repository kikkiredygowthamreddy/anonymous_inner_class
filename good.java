class a{
      public void Antena(){
            System.out.println("connecting. a..");
      }
class b extends a{
      public void Antena(){
            System.out.println("connecting. to a ..");
      }
}
}
public class good{
      public static void main(String args[])
      {
       a obj = new a()
       {
            public void Antena(){
                  System.out.println("connecting...");
            }
       };   
       obj.Antena();
      }
}