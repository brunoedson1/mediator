public class AnalistaFinanceiro {

    public String enviarFechamento(String mensagem) {
        return CentralFinanceira.getInstancia().enviarFechamentoTesouraria(mensagem);
    }

    public String enviarPrevisao(String mensagem) {
        return CentralFinanceira.getInstancia().enviarPrevisaoTesouraria(mensagem);
    }

    public String enviarAuditoria(String mensagem) {
        return CentralFinanceira.getInstancia().enviarAuditoriaTesouraria(mensagem);
    }
}