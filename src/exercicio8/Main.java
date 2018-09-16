/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author Luis Guilherme
 */
public class Main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.instanciaFuncionario1();
        empresa.instanciaFuncionario2();
        empresa.instanciaFuncionario3();
        empresa.imprimiFuncionario1();
        empresa.imprimiFuncionario2();
        empresa.imprimiFuncionario3();
        System.out.println("O número total de funcionários é: " + empresa.imprimiTotalFuncionarios());
    }
    
}
