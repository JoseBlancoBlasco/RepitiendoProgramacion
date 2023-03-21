package programacion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] corredores = new int[1];
		
		int num = 0;
		int cont  = 0;
		while(num >-1) {
			System.out.print("Que corredor llego en la posicion " + (cont+1) + ": ");
			num = sc.nextInt();
			int com = 0;
			
			for(int j = 0; j<=cont;j++) {
				if(num == corredores[j]) {
					com = 1;
					System.out.println("Dorsal repetido!");
					cont--;
				}
			}
			if(com == 0) {
				corredores[cont] = num;
				corredores = agrandar(corredores,num);
				
			}
			cont++;
		}
		int [][] datos = datos(corredores);
		datos = antid(datos);
		datos = menor(datos);
		datos = pagar(datos);
		
		for(int i = 0;i<3;i++) {
			System.out.println("EN EL PUESTO NUEMRO " + (i+1) + " EL DORSAL: " + datos[i][0]);
		}
	}
	static int [] agrandar(int [] s, int d) {
		int [] nuevo = new int [s.length+1];
			if(d > -1) {
				for(int i = 0; i<s.length;i++) {
					nuevo[i] = s[i];
				}
			}else {
				int [] bajar = new int[s.length-1];
				for(int i = 0; i<bajar.length;i++) {
					bajar[i] = s[i];
				}
				nuevo = bajar;
			}
		return nuevo;
	}
	static int[][] datos(int [] c){
		int [][] ordenar =new int [c.length][4];
		for(int i = 0; i<ordenar.length;i++) {
			ordenar[i][0] = c[i];
		}
		for(int i = 0; i<ordenar.length; i++) {
			System.out.print("El corredor con el dorsal " + (ordenar[i][0]) + " es menor de edad?(Si = 0/No = 1): ");
			if(sc.nextInt() == 0) {
				ordenar[i][1] = 0;
			}else {
				ordenar[i][1] = 1;
			}
			System.out.print("El corredor con el dorsal " + (ordenar[i][0]) + " ha dado positivo en el antidoping?(Si = 0/No = 1): ");
			if(sc.nextInt() == 0) {
				ordenar[i][2] = 0;
			}else {
				ordenar[i][2] = 1;
			}
			System.out.print("El corredor con el dorsal " + (ordenar[i][0]) + " ha pagado?(Si = 0/No = 1): ");
			if(sc.nextInt() == 0) {
				ordenar[i][3] = 0;
			}else {
				ordenar[i][3] = 1;
			}
		}
		return ordenar;
	}
	static int[][] antid( int [][] d) {
		int cont = 0;
		for(int i = 0; i<d.length;i++) {
			if(d[i][2] == 0) {
				cont++;
				d[i][0] = -1;
			}
		}
		
		int [][] antid = new int[d.length-cont][4];
		
		int cont2 = 0;
		for(int i = 0;i<d.length;i++) {
			if(d[i][0] != -1) {
				for(int j = 0;j<d[i].length;j++) {
					
					antid[i-cont2][j] = d[i][j];
				}
			}else {
				cont2++;
			}
			
		}
		
		return antid;
	}
	static int[][] menor(int[][] m){
		
		int [][] menor= new int[m.length+1][4];
		
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				menor[i+1][j] = m[i][j];
			}
		}
		
		menor[0][0] = -1;
		menor[0][1] = -1;
		int [][]guardar = new int[1][4];
		for(int i = 1;i<menor.length;i++) {
			if(menor[i][1] == 0) {
				for(int j = 0;j<menor[i].length;j++) {
					guardar[0][j] = menor[i-1][j];
					menor[i-1][j] = menor[i][j];
					menor[i][j] = guardar[0][j];
				}
			}
		}
		int cont = 0;
		for(int i = 0;i<menor.length;i++) {
			if(menor[i][0] != -1) {
				for(int j = 0;j<m[i-cont].length;j++) {
					m[i-cont][j] = menor[i][j];
				}
			}else {
				cont++;
			}
			
		}
		
		return m;
	}
	static int[][] pagar(int[][] p){
		int cont = 0;
		for(int i = 0;i<p.length;i++) {
			if(p[i][2] == 1) {
				cont++;
			}
		}
		int[][] noPagados = new int[cont][4];
		cont = 0;
		for(int i = 0;i<p.length;i++) {
			if(p[i][2] == 1) {
				for(int j = 0;j<p[i].length;j++) {
					noPagados[cont][j] = p[i][j];
				}
				cont++;
			}
		}
		cont = 0;
		for(int i = 0;i<p.length;i++) {
			if(p[i][2] != 1) {
				for(int j = 0;j<p[i].length;j++) {
					p[i-cont][j] = p[i][j];
				}
			}else {
				cont++;
			}
		}
		int cont2 = 0;
		for(int i = p.length-cont;i<p.length;i++) {
				for(int j = 0;j<p[i].length;j++) {
					p[i][j] = noPagados[cont2][j];
				}
				cont2++;
		}
		
		
		return p;
	}

}
