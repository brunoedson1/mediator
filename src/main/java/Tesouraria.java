public class Tesouraria implements SetorFinanceiro {

    private static Tesouraria instancia = new Tesouraria();

    private Tesouraria() {}

    public static Tesouraria getInstancia() {
        return instancia;
    }

    @Override
    public String receberFechamento(String mensagem) {
        return "A Tesouraria registrou o fechamento: " + mensagem;
    }

    @Override
    public String receberPrevisao(String mensagem) {
        return "A Tesouraria registrou a previsão: " + mensagem;
    }

    @Override
    public String receberAuditoria(String mensagem) {
        return "A Tesouraria vai analisar a auditoria: " + mensagem;
    }
}