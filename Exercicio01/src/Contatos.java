
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Contatos {
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
        this("","","","");
    }

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void guardarDados(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do contato: ");
        setNome(scan.next());
        
        System.out.println("Digite o telefone do contato: ");
        setTelefone(scan.next());
        
        System.out.println("Digite o endereço do contato: ");
        setEndereco(scan.next());
        
        System.out.println("Digite a cidade do contato: ");
        setCidade(scan.next());
    }
    public void mostrarDados(){
        System.out.println("\n Dados do Usuário \n Nome: " + getNome() + "\n" +
         "Telefone: " + getTelefone() + "\n" + 
         "Endereço: " + getEndereco() + "\n"+
         "Cidade: " + getCidade());
    }
}
