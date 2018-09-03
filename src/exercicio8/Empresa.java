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
public class Empresa {
    private Funcionario funcionario1;
    private Funcionario funcionario2;
    private Funcionario funcionario3;
    
    
    public void instanciaFuncionario1(){
        funcionario1 = new Funcionario();
        funcionario1.acrescentaFuncionario();
    }
    
    
    public void imprimiFuncionario1(){
        System.out.println("Dados do funcionario 1: " + "\nNome: " 
                + funcionario1.getNome() + "\nMatricula: " + funcionario1.getMatricula() + "\nIdade: " 
                + funcionario1.getIdade() + "\nCargo: " 
                + funcionario1.getCargo() + "\nSalario: " + funcionario1.getSalario());
    }
    
    public void instanciaFuncionario2(){
        funcionario2 = new Funcionario("Jonas", 24);
        funcionario2.acrescentaFuncionario();
    }
    
        public void imprimiFuncionario2(){
        System.out.println("Dados do funcionario 2: " + "\nNome: " 
                + funcionario2.getNome() + "\nMatricula: " + funcionario2.getMatricula() + "\nIdade: " 
                + funcionario2.getIdade() + "\nCargo: " 
                + funcionario2.getCargo() + "\nSalario: " + funcionario2.getSalario());
    }
        
        public void instanciaFuncionario3(){
            funcionario3 = new Funcionario("201776040", "Ana", 1700);
            funcionario3.acrescentaFuncionario();
        }
        
            public void imprimiFuncionario3(){
        System.out.println("Dados do funcionario 3: " + "\nNome: " 
                + funcionario3.getNome() + "\nMatricula: " + funcionario3.getMatricula() + "\nIdade: " 
                + funcionario3.getIdade() + "\nCargo: " 
                + funcionario3.getCargo() + "\nSalario: " + funcionario3.getSalario());
    }
            
            public int imprimiTotalFuncionarios(){
                int total = Funcionario.getNumeroFuncionarios();
                return total;
            }
}
