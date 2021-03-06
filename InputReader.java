
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
   //Método para obter números inteiros
   public int getIntegerNumber(String question){
       showFormattedQuestion(question);
       
       while(!reader.hasNextInt()){
           reader.nextLine();
           showFormattedQuestion(question);
       }
       
       int number = reader.nextInt();
       reader.nextLine();
       return number;
   }
   
   //Método para receber números reais
    public double getRealNumber(String question){
       showFormattedQuestion(question);
       
       while(!reader.hasNextDouble()){
           reader.nextLine();
           showFormattedQuestion(question);
       }
       
       double number = reader.nextDouble();
       reader.nextLine();
       return number;
   }
   
   //Método para obter texto de entrada
   public String getText(String question){
       showFormattedQuestion(question);
       return reader.nextLine();
   }
}
