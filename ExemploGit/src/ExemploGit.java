import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploGit {

    private String nome;
    private Integer numero;
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public Integer getNumero() {
        return numero;
    }
    
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public ExemploGit(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return "Numero: "+numero+" Nome: "+nome;
    }
    
    public static void main(String[] args) {
        //Teste conflito
        System.out.println("teste git");
        //Esse eh o branch teste...
        List<ExemploGit> objetos = Arrays.asList(
                new ExemploGit("Asdfg", 1),
                new ExemploGit("Gaseqwe", 3),
                new ExemploGit("baei", 2),
                new ExemploGit("asdfg", 10),
                new ExemploGit("baei", 2),
                new ExemploGit("TYe", 5)
                );
        ordenarListaPorNumero(objetos);
        System.out.println(objetos.toString());
    }

    private static void ordenarListaPorNumero(List<ExemploGit> objetos) {
        Collections.sort(objetos,new Comparator<ExemploGit>() {
            @Override
            public int compare(ExemploGit o1, ExemploGit o2) {
                boolean isMaior = o1.getNumero() > o2.getNumero();
                if(isMaior) {
                    return 1;
                }
                return -1;
            }});
    }
}
