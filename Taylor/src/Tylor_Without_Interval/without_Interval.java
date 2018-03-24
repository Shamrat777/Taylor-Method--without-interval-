/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tylor_Without_Interval;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Shamrat
 */
public class without_Interval {
     public static void main(String[] args) {
         
         DecimalFormat df=new DecimalFormat("#.######");
        DecimalFormat df1=new DecimalFormat("#.##");
        without_interval_methods m_obj=new without_interval_methods();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of X");
        double X=sc.nextDouble();
        System.out.println("Enter The value of Xo");
        double Xo=sc.nextDouble();
        System.out.println("Enter The value of Yo");
        double Yo=sc.nextDouble();
       
        
        
         double X1=Double.parseDouble(df.format(m_obj.function(Yo, X, Xo, m_obj.Yi(Xo, Yo), m_obj.Yii(Xo, Yo), m_obj.Yiii(Xo, Yo), m_obj.Yiv(Xo, Yo))));
          System.out.printf("%n%n");
          System.out.println("The value of Y"+"("+X+") is: "+X1);
          
          double relative_error=Double.parseDouble(df1.format(((Yo-X1)/X1)*100));
          System.out.println("The Approximate Relative Error :"+Math.abs(relative_error));
          
          
          
          
          
        }
         
}

