package taxiaereo;

import java.util.Scanner;


public class TaxiAereo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Boas Vindas */
        
        System.out.println("Bem vindo(a)!");
        System.out.println("Crie dois helepteros:");
        System.out.println("""
                           Obs: Os Helecopteros iniciam desligados e a altura sendo 0 
                           """);
        
        /* Helecotero 1*/
        
        System.out.println("Digite Capacidade de Pessoas do Helecoptero: ");
        int cap = s.nextInt();
        
        System.out.println("Digite Quantidade de Pessoas no Helecoptero: ");
        int quant = s.nextInt();
        
        Helecoptero h1 = new Helecoptero(cap,quant);
        System.out.println("Helocoptero 1 criado! \n");
        
        /* Helecotero 2*/
        
        System.out.println("Digite Capacidade de Pessoas do Helecoptero: ");
        cap = s.nextInt();
        
        System.out.println("Digite Quantidade de Pessoas no Helecoptero: ");
        quant = s.nextInt();
        
        Helecoptero h2 = new Helecoptero(cap,quant);
        System.out.println("Helocoptero 2 criado! \n");
        
        /* Estado dos Helecopteros */
        
        System.out.println("Helocoptero 1! \n");
        System.out.println(h1.toString()+ "\n");
        
        System.out.println("Helocoptero 2! \n");
        System.out.println(h2.toString()+ "\n");
        
        /* Adicionando pessoas nos Helecopteros */
        
        System.out.println("Digite quantas pessoas deseja adicionar em "
                + "Helecoptero 1: ");
        int newquant1 = s.nextInt();
        
        
        int cont = 0;
        while (cont<newquant1){
            System.out.println(h1.entrarPessoa() + "\n");
            cont++;
        }
        
        cont = 0;
        
        System.out.println("Digite quantas pessoas dejesa adicionar em "
                + "Helecoptero 2: ");
        int newquant2 = s.nextInt();
        
        
        while (cont<newquant2){
            System.out.println(h2.entrarPessoa() + "\n");
            cont++;
        }
        
        /* Ligando os Helecopteros */
        
        h1.ligarHelecoptero();
        h2.ligarHelecoptero();
        
        /* Decolandos os Helecopteros */
        
        System.out.println("Informe uma altura para decolar o Helecoptero 1");
        int alt1 = s.nextInt();
        h1.decolarHelecoptero(alt1);
        
        System.out.println("Informe uma altura para decolar o Helecoptero 2");
        int alt2 = s.nextInt();
        h2.decolarHelecoptero(alt2);
        
        /* Estado dos Helecopteros */
        
        System.out.println("Helocoptero 1!");
        System.out.println(h1.toString() + "\n");
        
        System.out.println("Helocoptero 2!");
        System.out.println(h2.toString()+ "\n");
        
        /* Aterrissando os Helecopteros */
        
        h1.aterrissarHelecoptero();
        h2.aterrissarHelecoptero();
        
        h1.desligarHelecoptero();
        h2.desligarHelecoptero();
        
        /* Removendo pessoas nos Helecopteros */
        
        System.out.println("Digite quantas pessoas dejesa retirar do "
                + "Helecoptero 1: ");
        newquant1 = s.nextInt();
        
        
        cont = 0;
        while (cont<newquant1){
            h1.sairPessoa();
            cont++;
        }
        
        cont = 0;
        
        System.out.println("Digite quantas pessoas dejesa retirar do "
                + "Helecoptero 2: ");
        newquant2 = s.nextInt();
        
        
        while (cont<newquant2){
            h2.sairPessoa();
            cont++;
        }
        
        /* Estado dos Helecopteros */
        
        System.out.println("Helocoptero 1!");
        System.out.println(h1.toString());
        
        System.out.println("Helocoptero 2!");
        System.out.println(h2.toString());
    }
    
   
}
