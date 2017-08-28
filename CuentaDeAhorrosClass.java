/*
 * 
 * 
 */
package ctaahorro;

/**
 *
 * @author FREDY CASTRO
 */
public class CuentaDeAhorrosClass {
    private double saldo;
    private double interes;
    private double rentabilidad=0;
    private double retiro;
    private double deposito=0;

  

    // Constructor con los dos atributos
    public void CuentaDeAhorrosClass(double saldocta, double interescta){
        saldo = saldocta;
        interes = interescta;
        retiro = 0;
        deposito = 0;
        rentabilidad=0;
      }
 

    public double Retiros(double saldocta, double retirocta) {
        saldo = saldocta;
        retiro = retirocta;
        return saldo - retiro;
        
    }
     public double Depositos(double saldocta, double depositocta) {
        saldo = saldocta;
        deposito = depositocta;
        return saldo + deposito;
    }
     
        public void Extracto(double valor_saldo, double valor_interes){ 
           rentabilidad=0;
        saldo = valor_saldo;
        interes = valor_interes;
        for(int i=0;i<12;i++) {
             rentabilidad = saldo * interes /100;
            saldo = saldo + rentabilidad;
            System.out.println("Mes "+i);
            System.out.println("Rentabilidad : "+rentabilidad);
            System.out.println("Saldo :"+saldo);
        
        }
    }
    
}
