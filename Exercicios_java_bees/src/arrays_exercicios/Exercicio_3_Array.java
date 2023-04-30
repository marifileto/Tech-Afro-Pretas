package arrays_exercicios;

import java.util.Scanner;

public class Exercicio_3_Array {

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) 
 e cria:

a) Uma matriz M1 cujos elementos serão as somas dos elementos
de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos são as diferenças dos 
elementos de mesma posição das matrizes N1 e N2.*/

	public static void main(String[] args) {
				
		//Declarando variáveis necessárias à matriz
		final int ArraySize1 = 4;
		final int ArraySize2 = 6;
				
		Scanner input = new Scanner(System.in);
		
		//Criando as matrizes solicitadas
		double[][] N1 = {{100,200,300,400,500,600},{700,800,900,100,110,120},{130,140,150,160,170,180},{19,20,21,22,23,24}};
		double[][] N2 = {{19,20,21,22,23,24},{13,14,15,16,17,18},{13,14,15,16,17,18},{8,2,1,4,3,6}};
		//Criando as matrizes para calcular a somatória e a diferença entre as matrizes
		double[][] M1 = new double [ArraySize1][ArraySize2];
		double[][] M2 = new double [ArraySize1][ArraySize2];
		
		//Verificando os dados e declarando sua somatória
		for (int i = 0; i < ArraySize1; ++i) {
				for (int j = 0; j < ArraySize2; ++j) {
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.println("a) O valor das somas dos elementos de mesma posição das matrizes N1 e N2 são: " + M1[i][j]);
				
			}
		}
		//Verificando os dados e declarando sua diferença
		for (int i = 0; i < ArraySize1; i++) {
			for (int j = 0; j < ArraySize2; j++) {				
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.println("b) O valor das diferenças dos elementos de mesma posição das matrizes N1 e N2 são: " + M2[i][j]);
			}
		}

	}

}
