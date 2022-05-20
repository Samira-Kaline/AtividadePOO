package guerreirosdapoo;

import java.util.Scanner;

public class CampodeBatalha {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o codigo do guerreiro(a): ");
        int cod = s.nextInt();
        
        System.out.println("Digite o codigo do guerreiro(a): ");
        String nome = s.next();
        
        Guerreiro g1 = new Guerreiro(cod,nome);
        
        System.out.println("Digite o codigo do guerreiro: ");
        cod = s.nextInt();
        
        System.out.println("Digite o codigo do guerreiro: ");
        nome = s.next();
        
        Guerreiro g2 = new Guerreiro(cod,nome);
        
        System.out.println(g1.lutar(g2)+ " Ganhou!! \n");
        
        g1.setEnergia(5);
        g2.setEnergia(5);
        
        System.out.println("Lutar Recursivo \n");
        Guerreiro vencedor = g1.lutarRecursivo(g2);
        
        System.out.println(vencedor.getNome()+ " Ganhou!! \n");
        
        g1.alimetarSe();
        
        System.out.println(g1.toString() + "\n");
        System.out.println(g2.toString() + "\n");
    }
    
}
