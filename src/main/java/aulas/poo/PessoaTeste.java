package aulas.poo;

//intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {

        //new => constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo","Pereira");

        System.out.println(recemNascido.altura);
        recemNascido.idade++; //envelhecer
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostraImc();

        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("batata");

        //Exemplo pessoas
        Pessoa pedro = new Pessoa("Pedro", "José", 29, 1.8, 80);

        Pessoa joao = new Pessoa("João", "Carlos", 30, 1.75, 90);

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);

        System.out.println(pedro.nome.length());




    }
}
