/*
 * .
 */
package ctaahorro;
import javax.swing.*;

/**
 *
 * @author FREDY CASTRO
 */
public class Ctaahorro {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double nuevosaldo = 0;
        int tipo=0;
        double saldo=0;
        double interes=0;
        int movimientos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de movimientos"));
        int tipoint =Integer.parseInt(JOptionPane.showInputDialog("Tipo de Cuenta :\n 1.  ahorro1  \n 2.  ahorro2 "));
        
        if (tipoint == 2 ){
            interes = 5;
            saldo = 300000;
        }
        else {
             interes = 4;
             saldo = 200000;
          }    
              
               
        
        CuentaDeAhorrosClass cuenta;
        cuenta = new CuentaDeAhorrosClass();
        cuenta.CuentaDeAhorrosClass(saldo, interes);
        
        
        /* cuenta = new CuentaDeAhorrosClass(saldo, interes);
         */
        
        
        for(int i=0;i<movimientos;i++) {
            tipo=Integer.parseInt(JOptionPane.showInputDialog("Tipo de Transaccion :\n 1. Deposito \n 2. Retiro"));
                    
           if (tipo == 1) { 
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor"));
                nuevosaldo = cuenta.Depositos(saldo, nuevosaldo);
                saldo = nuevosaldo;
                }
            if (tipo == 2) { 
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor"));
                if (valor <= saldo){
                     nuevosaldo = cuenta.Retiros(saldo, valor);
                    saldo = nuevosaldo;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }    
                }
        
                }
            JOptionPane.showMessageDialog(null,"Saldo: "+nuevosaldo);
            cuenta.Extracto(saldo, interes);
            
           
            
    }
    
}
