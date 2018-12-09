/**
 * Auto Generated Java Class.
 */
public class Test4 {
  
  public static void main(String[] args){
    for(int i=1; i < args.length && i<5 ; i=i+2){
  //    System.out.println(args[i]);
    }
    
    int ctr =1;
    
    while (ctr < args.length){
      if( ctr >= 4) break;
      if( ctr % 2 ==0 ){
        System.out.println(args[ctr]);
    }
      ++ctr;
  }
  }
}
