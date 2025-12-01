public interface SetorFinanceiro {

    String receberFechamento(String mensagem);

    String receberPrevisao(String mensagem);

    String receberAuditoria(String mensagem);
}