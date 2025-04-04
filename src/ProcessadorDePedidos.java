import java.util.Scanner;

public class ProcessadorDePedidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exibirCabecalho();

        try {
            int idInicial = lerId("Digite o ID inicial do pedido: ", scanner);
            int idFinal = lerId("Digite o ID final do pedido: ", scanner);

            exibirSeparador();
            processarPedidos(idInicial, idFinal);
        } catch (IntervaloInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: Digite apenas números. " + e.getMessage());
        } finally {
            scanner.close();
            exibirRodape();
        }
    }

    public static int lerId(String mensagem, Scanner scanner) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void processarPedidos(int idInicial, int idFinal) throws IntervaloInvalidoException {
        if (idInicial >= idFinal) {
            throw new IntervaloInvalidoException("O ID final deve ser maior que o ID inicial.");
        }

        int totalPedidos = idFinal - idInicial + 1;
        System.out.println("Iniciando o processamento de " + totalPedidos + " pedidos...\n");

        for (int i = idInicial; i <= idFinal; i++) {
            System.out.printf("Processando pedido #%d...\n", i);
            pausar(300); // Pausa para simular o tempo de processamento
        }

        System.out.println("\nTodos os pedidos foram processados com sucesso!");
    }

    public static void pausar(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void exibirCabecalho() {
        System.out.println("============================================");
        System.out.println("      SISTEMA DE PROCESSAMENTO DE PEDIDOS   ");
        System.out.println("============================================\n");
    }

    public static void exibirRodape() {
        System.out.println("\n--------------------------------------------");
        System.out.println("Desenvolvido por André Arraes");
        System.out.println("Projeto demonstrativo - Portfólio Java");
        System.out.println("--------------------------------------------");
    }

    public static void exibirSeparador() {
        System.out.println("\n--------------------------------------------\n");
    }
}
