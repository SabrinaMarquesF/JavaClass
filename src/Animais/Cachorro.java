package Animais;

public class Cachorro extends Animal{

    static int numeroDeCachorros;

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        super(nome, cor,altura, peso, estadoDeEspirito);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome.equals("Rex")){
            this.nome= null;
        }
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String pegar(){
        return "Bolinha";
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public String interagir(String acao) {

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro";

        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Latido");
    }
}