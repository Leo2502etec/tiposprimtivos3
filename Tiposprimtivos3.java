/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimtivos3;

/** Primeiro programa em Java feito no laboratório 111
 *
 * @author FATEC ZONA LESTE
 */
public class Tiposprimtivos3 {
    public static void main(String[] args) {
         // Declaração de novas variáveis primitivas 
     byte quantidadeDias = 30;  // Armazena números pequenos (-128 a 127)
     short anoAtual = 2024; // Armazena valores um pouco maiores (-32.768 a 32.767)
     int numeroFuncionarios = 350; // Tipo mais comum para números inteiros
     long distanciaTerraLua = 384400000L; // Necessário 'L' para valores longos 

     float temperaturaMedia = 22.5f; // Necessário 'f' no final para indicar float
     double profundidadeOceano = 11000.5; // Mais preciso que float 

     char letraInicial = 'T'; // Armazena um único caractere 
     boolean statusDisponibilidade = false; // Armazena verdadeiro ou falso 
 
     // Exibição dos valores 
     System.out.println("Quantidade de dias: " + quantidadeDias);
     System.out.println("Ano atual: " + anoAtual);  
     System.out.println("Número de funcionários: " + numeroFuncionarios);
     System.out.println("Distância Terra-Lua: " + distanciaTerraLua + " metros");
     System.out.println("Temperatura média: " + temperaturaMedia + "°C");
     System.out.println("Profundidade do oceano: " + profundidadeOceano + " metros");
     System.out.println("Letra inicial: " + letraInicial);
     System.out.println("Está disponível? " + statusDisponibilidade);
   }
}


