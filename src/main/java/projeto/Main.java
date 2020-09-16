package projeto;

import seg.*;
/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        try{
            System.out.println(Cript.md5("Meu texto"));   
        }catch(Exception e){

        }
         try{
            System.out.println(Cript.sha256("Meu texto"));   
        }catch(Exception e){

        }

        
         try{
            System.out.println(Cript.sha512("Meu texto"));   
        }catch(Exception e){

        }
}
    
}
