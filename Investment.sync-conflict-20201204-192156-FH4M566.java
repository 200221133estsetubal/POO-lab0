
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
   
   public int getYear(){
       return year;
   }
   
   //Mostra os valores que se obtem com o investimento
   public void show(){
       System.out.println("Investimento de " + year + " anos.");
       System.out.println("Com a taxa de " + rate/100 + " %.");
       System.out.println("Montante Final: " + balance + " €.");
   }
   
   //Simular a passagem dos anos, fazendo a atualização do deposito
   //e dos anos passados.
   public void waitYears(){
    
   }
}
