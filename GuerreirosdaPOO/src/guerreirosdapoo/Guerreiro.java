package guerreirosdapoo;
import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia = 5;
    Random r = new Random();

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public String incrementarEnergia(){
        if(energia==5){
            return "Energia cheia!";
        }
        energia++;
        this.setEnergia(energia);
        return "Energia Aumentada!";
    }
    
    public void decrementarEnergia(){
        if (energia>0){
            energia--;
        this.setEnergia(energia);
        }
    }
    
    public String alimetarSe(){
        return this.incrementarEnergia();     
    }
    
    public int atacar(){
        return r.nextInt(2);
    }
    
    public String lutar(Guerreiro op){
        System.out.println("Lutar \n");
        while (this.getEnergia()>0 && op.getEnergia()>0){
            if(this.atacar()>op.atacar()){
                op.decrementarEnergia();
                System.out.println("Guerreiro(a) " + this.getNome() 
                        + " Venceu essa rodada!");
            }
            else if(this.atacar()<op.atacar()){
                this.decrementarEnergia();
                System.out.println("Guerreiro(a) " + op.getNome() + " Venceu essa "
                        + "rodada!");
            }
            else{
                System.out.println("Empate ");            
            }
        }
        if(this.getEnergia()==0){
            return op.getNome();
        }
        else{
            return this.getNome();
        }
    }
    public Guerreiro lutarRecursivo(Guerreiro op){

        if(this.atacar()>op.atacar()){
                op.decrementarEnergia();
                System.out.println("Guerreiro(a) " + this.getNome() 
                        + " Venceu essa rodada!");
            }
        else if(this.atacar()<op.atacar()){
            this.decrementarEnergia();
            System.out.println("Guerreiro(a) " + op.getNome() + " Venceu essa "
                 + "rodada!");
        }
        else{
            System.out.println("Empate ");            
        }
        
        if(this.getEnergia()==0){
            return op;
        }
        else if(op.getEnergia()==0){
            return this;
        }
        
        return this.lutarRecursivo(op);
        
    }
    
    
    
    @Override
    public String toString() {
        return "Codigo = " + codigo + ", Nome = " + nome + ", Energia = " + energia ;
    }
    
}
