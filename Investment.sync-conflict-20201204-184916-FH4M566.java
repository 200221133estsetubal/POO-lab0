
/**
 * Escreva a descrição da classe Investment aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Investment
{
    //Atributos da classe
   private double balance;
   private double rate;
   private int year;
 //Construtor a definir dados iniciais  
   public Investment(double balance, double rate){
       this.balance = balance;
       this.rate = rate;
       year = 0;
   }
   
   //Métodos seletores 
   public double getBalance(){
       return balance;
   }
   
   public double getRate(){
       return rate;
   }
   
   
}
