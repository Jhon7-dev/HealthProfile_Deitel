
import java.util.Scanner;

public class Profi {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         char opcao = 's';
         do {
          
             HealthProfile p = new HealthProfile();
             
             System.out.println("DIGITE SEU NOME: " );
             p.setNome(scn.nextLine());
             System.out.println("DIGITE SEU SOBRENOME: ");
             p.setSobrenome(scn.nextLine());
             System.out.println("DIGITE SEU SEXO (M/F)");
             p.setSexo(scn.nextLine().toUpperCase());
             
             System.out.println("DIGITE O DIA DO SEU NASCIMENTO: ");
             p.setDia_nascimento(scn.nextInt());

             scn.nextLine();

             System.out.println("DIGITE O MÊS DO SEU NASCIMENTO: ");
             p.setMes_nascimento(scn.nextInt());
             scn.nextLine();
             System.out.println("DIGITE O ANO DO SEU NASCIMENTO: ");
             p.setAno_nascimento(scn.nextInt());
             scn.nextLine();
             System.out.println("DIGITE SUA ALTURA: ");
             p.setAltura(scn.nextDouble());
             scn.nextLine();
             System.out.println("DIGITE SEU PESO: ");
             p.setPeso(scn.nextDouble());
             scn.nextLine();
             p.Mostar();
             p.CalcularIdade();
             p.FrequenciaAlvo();
             p.FrequenciaCardiacaMaxima();
             p.Imc();
          
             System.out.println("DESEJA CADASTRAR OUTRO CONTINUAR ? (S/N)");
             opcao = scn.nextLine().charAt(0);

         } while (Character.toLowerCase(opcao) != 'n');
         System.out.println("PROGRAMA ENCERRADO!");
     }
}

