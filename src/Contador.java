import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int primeiroValor; int segundoValor;

        System.out.println("============= Contador =============");
        System.out.println("Digite um valor: ");
        primeiroValor = Integer.parseInt(scan.nextLine());
        System.out.println("Digite outro valor: ");
        segundoValor = Integer.parseInt(scan.nextLine());
        
        try {
            contador(primeiroValor, segundoValor);
        } catch (Exception e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro!\n");
            e.printStackTrace();
        }

        scan.close();
    }

    static void contador(int primeiroValor, int segundoValor) throws ParametrosInvalidosException
    {
        if(primeiroValor > segundoValor){
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoValor - primeiroValor;

        for(int index = 1; index <= contagem; index++)
        {  
            System.out.println("Imprimindo o número "+ index);
        }
    }
}
