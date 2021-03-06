
/**
 * Escreva a descrição da classe InputReader aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class InputReader
{
   //Atributo reader para ler dados no ecrã
   private Scanner reader;
   
   //Construtor
   public InputReader(){
       reader = new Scanner(System.in);
   }
   
   //Métodos Auxiliares
   private void showFormattedQuestion(String question){
       if(question == null){
           question = "";
       }
       question += "> ";
       System.out.println(question);
   }
   
   public int getIntegerNumber(String question){
       showFormattedQuestion(question);
       
       while(!reader.hasNextInt()){
           reader.nextLine();
           showFormattedQuestion(question);
       }
       
       int number = reader.nextInt();
       reader.nextLine();
       
   }
}
