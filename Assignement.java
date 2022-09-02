/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dj_sp
 */



public class Assignement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

    Scanner s=new Scanner(new File("C:\\Users\\dj_sp\\Documents\\text.txt"));
       ArrayList<String> list=new ArrayList<String>();
        
        while(s.hasNext())
            list.add(s.next());
        System.out.println(list);
        System.out.println(list.get(5));
        String p;
       p= list.get(4);
        System.out.println(p);
        
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        
        
        
        
//        for(int i = 0;i<list.size();i++){
//            list.add(s.nextInt());
//            System.out.println(list.get(i));
//        }
            
          
    }
    
}
