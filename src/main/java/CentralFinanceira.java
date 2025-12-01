public class CentralFinanceira {

    private static CentralFinanceira instancia = new CentralFinanceira();

    private CentralFinanceira() {}

    public static CentralFinanceira getInstancia() {
        return instancia;
    }

    public String enviarFechamentoTesouraria(String mensagem) {
        return "A Central Financeira registrou sua solicitação.\n" +
                "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Tesouraria.getInstancia().receberFechamento(mensagem);
    }

    public String enviarPrevisaoTesouraria(String mensagem) {
        return "A Central Financeira registrou sua solicitação.\n" +
                "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Tesouraria.getInstancia().receberPrevisao(mensagem);
    }

    public String enviarAuditoriaTesouraria(String mensagem) {
        return "A Central Financeira registrou sua solicitação.\n" +
                "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Tesouraria.getInstancia().receberAuditoria(mensagem);
    }
}