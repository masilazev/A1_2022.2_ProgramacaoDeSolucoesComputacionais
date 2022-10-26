import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner resposta = new Scanner(System.in);

        System.out.print("Nome do funcionario: ");
        String nome = resposta.nextLine();
        System.out.print("Peso atual do funcionario em Kg: ");
        double peso = resposta.nextDouble();
        System.out.print("Quantos litros de agua ingeridos hoje: ");
        double qtdAgua = resposta.nextDouble();

        System.out.println("-----------------------");

        //Calcular a quantidade ideal de agua
        double qtdIdeal = (0.035 * peso);
        //Calcular quanto falta ingerir de agua

        System.out.println("Nome do funcionari: " + nome);
        System.out.println("Peso atual do funcionario em Kg: " + peso);
        System.out.println("Quantos litros de agua ingeridos hoje: " + qtdAgua);
        //Mostrar quantidade ideal a ingerir
        System.out.println("A quantidade de agua idel a ser iingerida em litros de acordo com seu peso eh de: " + qtdIdeal + " Litros");
    
        double restante = qtdIdeal - qtdAgua;

        //Se a quantidade a ingerir seja negativa, imprimir a mensagem “Parabéns, você atingiu a meta de hidratação diária”
        if (qtdAgua > qtdIdeal)
            {
                System.out.println("Parabéns, você atingiu a meta de hidratação diária");
            }
            //Caso contrário, se quantidade a ingerir seja zero ou positiva, imprimir a mensagem “Continue focado em se hidratar por hoje, ainda faltam [x] litros!
            else
            {
                System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + restante + " Litros");
            }
    
    }
}
