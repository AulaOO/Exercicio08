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
public class Funcionario {
    private String matricula;
    private String nome;
    private int idade;
    private String cargo;
    private float salario;
    private static int numeroFuncionarios;


    public Funcionario(){
        salario = 1500;
    }
    
    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Funcionario(String matricula, String nome, float salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void acrescentaFuncionario(){
        numeroFuncionarios = numeroFuncionarios + 1;
    }
    
    public static int getNumeroFuncionarios(){
        return numeroFuncionarios;
    }
    
    static void numeroFunionarios(){
        numeroFuncionarios = numeroFuncionarios + 1;
    }
}
