/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg5;
import javax.swing.JOptionPane;

/**
 *
 * @author dcuerdogarcia
 */
public class Metodos {
private double num = this.pedirNum();
    public double pedirNum(){
        do{
            String dato = JOptionPane.showInputDialog("Introducir números");
            num = Double.parseDouble(dato);
       }while (num<=0);
        return num;
    }
    public String Metodo1(){
        long num0=0;
        String Metodo1= "";
        for (int i=0; i<num; i++){
            num0 = num0 + 2;
            Metodo1 += " " + num0;
        }
        return Metodo1;
    }
        
    public String Metodo2(){
        String Metodo2= "";
        for (int i= 1; i< + 1; i++){
           if (i%2 == 0){
               Metodo2 = Metodo2 + "+" + i;
            } 
           if (i%2 == 1){
               Metodo2 += "-" + i;
           }
        }
        return Metodo2;
        
    }
    public String Metodo3(){
        long a=0;
        long b=1;
        long c=0;
        String Metodo3=a+","+b;
        for (int i=2; i<num; i++){
            c = a+b;
            a = b;
            b = c;
            Metodo3 += ","+c;
        }
        return Metodo3;
    }
public void calcularMetodos(){
    String Metodos= ("Metodo1: "+ this.Metodo1() + "\nMetodo2: " + this.Metodo2() + "\nMetodo3: " + this.Metodo3());
    JOptionPane.showMessageDialog(null, Metodos);
}


}
