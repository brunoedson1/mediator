import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaFinanceiroTest {

    @Test
    void deveEnviarFechamentoParaTesouraria() {
        AnalistaFinanceiro analista = new AnalistaFinanceiro();

        assertEquals(
                "A Central Financeira registrou sua solicitação.\n" +
                        "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Tesouraria registrou o fechamento: Fechamento de Janeiro",
                analista.enviarFechamento("Fechamento de Janeiro")
        );
    }

    @Test
    void deveEnviarPrevisaoParaTesouraria() {
        AnalistaFinanceiro analista = new AnalistaFinanceiro();

        assertEquals(
                "A Central Financeira registrou sua solicitação.\n" +
                        "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Tesouraria registrou a previsão: Previsão do 1º trimestre",
                analista.enviarPrevisao("Previsão do 1º trimestre")
        );
    }

    @Test
    void deveEnviarAuditoriaParaTesouraria() {
        AnalistaFinanceiro analista = new AnalistaFinanceiro();

        assertEquals(
                "A Central Financeira registrou sua solicitação.\n" +
                        "A Tesouraria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Tesouraria vai analisar a auditoria: Auditoria das despesas de 2024",
                analista.enviarAuditoria("Auditoria das despesas de 2024")
        );
    }
}