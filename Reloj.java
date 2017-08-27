import javax.swing.*;
public class Reloj {
	
	private int horas;
	private int minutos;
	private int segundos;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void ajustarHora(Reloj prueba, int h, int m, int s) {
		prueba.setHoras(h);
		prueba.setMinutos(m);
		prueba.setSegundos(s);;
	}
	
	public void ajustarMinutos(Reloj prueba, int m) {
		prueba.setMinutos(m);
	}
	
	public void ajustarSegundos(Reloj prueba, int m) {
		prueba.setSegundos(m);
	}
	
	public void sumarSegundo(Reloj prueba) {
		int temp=prueba.getSegundos();
		if(temp<59) {
			temp+=1;
			prueba.setSegundos(temp);
		}
		else {
			prueba.setSegundos(0);
			int temp2=prueba.getMinutos();
			if(temp2<59) {
				temp2+=1;
				prueba.setMinutos(temp2);
			}
			else {
				prueba.setMinutos(0);
				int temp3=prueba.getHoras();
				if(temp3<23) {
					temp3+=1;
					prueba.setHoras(temp3);
				}
				else {
					prueba.setHoras(0);
				}
			}
		}
	}
	
	public void restaSegundo(Reloj prueba) {
		int temp=prueba.getSegundos();
		if(temp>0) {
			temp-=1;
			prueba.setSegundos(temp);
		}
		else {
			prueba.setSegundos(59);
			int temp2=prueba.getMinutos();
			if(temp2>0) {
				temp2-=1;
				prueba.setMinutos(temp2);
			}
			else {
				prueba.setMinutos(59);
				int temp3=prueba.getHoras();
				if(temp3>0) {
					temp3-=1;
					prueba.setHoras(temp3);
				}
				else {
					prueba.setHoras(23);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ho=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas"));
		int mi=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Minutos"));
		int se=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Segundos"));
		Reloj inicial=new Reloj();
		if(ho>=0&&ho<=23) {
			if(mi>=0&&mi<=59) {
				if(se>=0&&se<=59) {
					// Prueba cambio de hora
					
					inicial.ajustarHora(inicial, ho, mi, se);
					System.out.println("La hora inicial -> "+inicial.getHoras()+":"+inicial.getMinutos()+":"+inicial.getSegundos());
					
					// Prueba ajuste de minutos
					
					mi=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Minutos"));
					if(mi>=0&&mi<=59) {
						inicial.ajustarMinutos(inicial, mi);
						System.out.println("Minutos Ajustados -> "+inicial.getHoras()+":"+inicial.getMinutos()+":"+inicial.getSegundos());
					}
					else {
						System.out.println("Minutos fuera de rango");
					}
					
					// Prueba ajuste de segundos
					
					se=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Segundos"));
					if(se>=0&&se<=59) {
						inicial.ajustarSegundos(inicial, se);
						System.out.println("Segundos Ajustados -> "+inicial.getHoras()+":"+inicial.getMinutos()+":"+inicial.getSegundos());
					}
					else {
						System.out.println("Segundos fuera de rango");
					}
					
					// Aumenta un segundo 
					
					inicial.sumarSegundo(inicial);
					System.out.println("Un segundo mas -> "+inicial.getHoras()+":"+inicial.getMinutos()+":"+inicial.getSegundos());
					
					// Resta un segundo
					
					inicial.restaSegundo(inicial);
					System.out.println("Un segundo menos -> "+inicial.getHoras()+":"+inicial.getMinutos()+":"+inicial.getSegundos());
					
				}
				else {
					System.out.println("Segundos fuera de rango");
				}
			}
			else {
				System.out.println("Minutos fuera de rango");
			}
		}
		else {
			System.out.println("Horas fuera de rango");
		}
	}
}
