
/**
 * Escreva a descrição da classe Simulator aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Simulator
{
    private Investment investment;
    private InputReader reader;
    
    public Simulator(){
        reader = new InputReader();
    }
    
    public void showWelcome(){
        System.out.println("### Simulador de depósito a Prazo ###");
        System.out.println();
        System.out.println("Banco EST - Setúbal");
        System.out.println();
    }
    
    public void runOnce(){
        System.out.println("Montante Inicial:");
        double amount = reader.getRealNumber("Valor");
        
        System.out.println("Taxa de juros:");
        double rate = reader.getRealNumber("Taxa");
        
        investment = new Investment(amount, rate);
        
        System.out.println("Calcular 1 - por anos ou 2 - por montante final:");
        int answer = reader.getIntegerNumber("1-anos, 2-montante");
        
        if(answer == 1){
            System.out.println("Número de anos:");
            
        }
    }
}
