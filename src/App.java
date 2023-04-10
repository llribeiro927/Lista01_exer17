import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        // Início do Programa 

        // Faça um Programa para uma loja de tintas
        // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada
        // Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
        // e que a tinta é vendida em latas de 18 litros
        //  que custam R$ 80,00 
        // em galões de 3,6 litros, que custam R$ 25,00.
        // Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        // Requisitos: 
        // comprar apenas latas de 18 litros;
        // comprar apenas galões de 3,6 litros;
        // misturar latas e galões, de forma que o desperdício de tinta seja menor
        // Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

        // Declaração de variaveis
        double custoDoGalao, custoDeGalaoELata, galao, latas, custo, latasEGalao, area;
        // Solicitação de Dados do usuário
        System.out.println("Informe em metros quadrados o tamanho da aréa a ser pintada: ");
        Scanner teclado = new Scanner(System.in); 
        area = teclado.nextDouble(); 
        // Calcular Latas, Galões e Custo. 
        latas = Math.ceil (area / 108); 
        custo = latas * 80;  
        galao = Math.ceil (area / 21.6); 
        custoDoGalao = galao * 25; 
        latasEGalao = Math.ceil (area / 129.6); 
        custoDeGalaoELata = latasEGalao * 105; 
        // Calcular a quantidade total de tinta necessária com 10% de folga 
        double litrosTotal = area / 6.0 * 1.1; 
        // Calcular a quantidade de latas e galões necessáriaos para minimizar o desperdício
        double latasMistura = Math.floor(litrosTotal / 18.0); 
        double galoesMistura = Math.ceil((litrosTotal - latasMistura * 18.0) / 3.6);
        // Calcular o custo custo total da mistura 
        double custoMistura = latasMistura * 80.0 + galoesMistura * 25.0; 
        // Informar quantas latas de 18 litros e galões de 3.6 litros vai precisar e valor total 
        System.out.println("Preferência 1: Comprar apenas latas de 18 litros: ");
        System.out.println("Você precisará de " + latas + " latas de 18 litros ");
        System.out.println("O valor total é de R$ " + custo);

        System.out.println("Preferêmcia 2: Comprar apenas galões de 3.6 litros: ");
        System.out.println("Você precisará de " + galao + " galões de 3.6 litros ");
        System.out.println("O valor total é de R$ " + custoDoGalao);

        System.out.println("Preferência 3: Misturar latas e galões: ");
        System.out.println("Você precisará de " + latasMistura + " latas de 18 litros e " + galoesMistura + " galões de 3.6 litros ");
        System.out.println("O valor total é de R$ " + custoMistura);
        teclado.close();




        
        
    }
}
