import javax.swing.*;
public class Supermercado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ventas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas:"));
		int cantidadContado=0;
		int tipo=0;
		double comision=0;
		int monto=0;
		int contado=0;
		int tarjetaCredito=0;
		int cuotas=0;
		
		for(int i=0;i<ventas;) {
			tipo=Integer.parseInt(JOptionPane.showInputDialog("Tipo de Venta :\n 1. Contado \n 2. Tarjeta de credito \n 3. Cuotas"));
			if(tipo==1||tipo==2||tipo==3) {
				i++;
				if(tipo==1) {
					monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la venta:"));
					cantidadContado++;
					contado+=monto;
				}
				if(tipo==2) {
					monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la venta:"));
					tarjetaCredito+=monto;
				}
				if(tipo==3) {
					monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la venta:"));
					cuotas+=monto;
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"Tipo de Venta Incorrecto");
			}
		}
		System.out.println("Resumen de Ventas");
		System.out.println("Monto total de ventas de contado : "+contado);
		System.out.println("Monto total de ventas realizadas por tarjeta de crédito : "+tarjetaCredito);
		System.out.println("Monto total de ventas realizadas a cuotas : "+cuotas);
		System.out.println("Número total de ventas realizadas de contados : "+cantidadContado);
		comision=(contado*0.05)+(tarjetaCredito*0.03)+(cuotas*0.02);
		System.out.println("Monto total de todas las comisiones : "+comision);
	}
}
