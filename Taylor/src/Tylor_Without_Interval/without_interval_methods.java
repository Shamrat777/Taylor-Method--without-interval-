/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tylor_Without_Interval;

/**
 *
 * @author Shamrat
 */
public class without_interval_methods {
   

        public double fact(int n)
    {
       
      double result;

       if(n==1){
         return 1;
       }
       else{
       result = fact(n-1)*n ;
           
           
       return result;
       }
    }
        
        //1st derive function
        public double Yi(double Xo, double Yo)
        {  
            double calculate=((Xo - Yo) / 2);
           return  calculate;
        }
       

      // 2nd derive function
        public double Yii(double Xo, double Yo)
        {       
            double calculate=((1-(Yi(Xo, Yo)))/2);
            return calculate;
        }
      

       //3rd derive function
        public double Yiii(double Xo, double Yo)
        {   
            double calculate=(-(Yii(Xo,Yo))/2);
            return calculate;
        }
        

        //4th derive function
        public double Yiv(double Xo, double Yo)
        {     
            double calculate=(-(Yiii(Xo,Yo))/2);
            return calculate;
        }  
        
         public double function(double Yo,double X, double Xo,double Yi, double Yii, double Yiii,double Yiv){
    
         double calculate=Yo+((X-Xo)*Yi)+((Math.pow((X-Xo), 2)*Yii)/fact(2))+((Math.pow((X-Xo), 3)*Yiii)/fact(3))+((Math.pow((X-Xo), 4)*Yiv)/fact(4));
    
        return calculate;
    
    }

    }
     

