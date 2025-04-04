/**
 * Exceção lançada quando o intervalo de IDs de pedidos é considerado inválido.
 *
 * Essa exceção é utilizada para indicar que o ID final é menor ou igual ao ID inicial.
 */
public class IntervaloInvalidoException extends Exception {

    public IntervaloInvalidoException(String mensagem) {
        super(mensagem);
    }
}
