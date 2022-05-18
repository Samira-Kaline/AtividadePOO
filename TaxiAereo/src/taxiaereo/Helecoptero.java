package taxiaereo;


public class Helecoptero {
    private boolean ligado = false;
    private int altura = 0;
    private int capacidade;
    private int quantpessoas;

    public Helecoptero(int capacidade, int quantpessoas) {
        this.capacidade = capacidade;
        this.quantpessoas = quantpessoas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantpessoas() {
        return quantpessoas;
    }

    public void setQuantpessoas(int quantpessoas) {
        this.quantpessoas = quantpessoas;
    }
    
    public String entrarPessoa(){
        if(quantpessoas==capacidade){
            return "O Helecoptero esta cheio!";
        }
        quantpessoas++;
        this.setQuantpessoas(quantpessoas);
        return "Bem vindo(a)!";
    }
    
    public String sairPessoa(){
        if(quantpessoas==0){
            return "O Helecoptero esta vazio!";
        }
        quantpessoas--;
        this.setQuantpessoas(quantpessoas);
        return "Adeus, ate a proxima!";
        
    }
    
    public void ligarHelecoptero(){
        if(ligado){
            System.out.println("O Helecoptero esta ligado!");
        }
        else{
            this.setLigado(true);
            System.out.println("O Helecoptero esta ligado!");
        }
    }
    
    public void decolarHelecoptero(int altura){
        if(ligado){
            if(this.altura==0){
                this.setAltura(altura);
                System.out.println("Vamos decolar!");
                System.out.println("Altura = "+this.getAltura());

            }
            else{
                System.out.println("O Helecoptero ja esta no ar!");
            }
        }
        else{
            System.out.println("O Helecoptero esta desligado!");
        }
    }
    
    public void aterrissarHelecoptero(){
        if(ligado){
            if(altura>0){
                this.setAltura(0);
                System.out.println("O passeio acabou!");
                System.out.println("Hora de pousar!");

            }
            else{
                System.out.println("O Helecoptero ja esta no chao!");
            }
        }
        else{
            System.out.println("O Helecoptero esta desligado!");
        }
    }
    
    public void desligarHelecoptero(){
        if(ligado){
            this.setLigado(false);
            System.out.println("O Helecoptero esta desligado!");
        }
        else{
            System.out.println("O Helecoptero esta desligado!");
        }
    }

    @Override
    public String toString() {
        return "Ligado = " + ligado + ", Altura = " + altura + ", Capacidade = " 
                + capacidade + ", Quantidade de pessoas = " + quantpessoas;
    }
    
    
}
