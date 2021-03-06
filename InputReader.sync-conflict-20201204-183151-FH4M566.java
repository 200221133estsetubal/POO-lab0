
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
       
   }
}
