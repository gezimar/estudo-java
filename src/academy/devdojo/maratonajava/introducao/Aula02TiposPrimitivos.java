package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10; // numeros inteiros
        long numerogrande = 100000; // numeros inteiros só que podem ser maiores
        double salarioDouble = 2000; // numeros com virgula maiores
        float salarioFloat = 2500; // numeros com vigula menores
        byte idadebyte = 10; //somente 1 byte
        short idadeshort = 10; // até 2 byte
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // é possivel usar unicode ou ascii
        String nome = "Goku"; // é ultilizado para guardar nomes letras
        System.out.println("A idade é "+idade+" anos e seu nome é "+nome);
    }
}
