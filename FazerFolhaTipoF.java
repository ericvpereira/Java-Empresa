public class FazerFolhaTipoF {

    public static void main(String[] args) {
        
        EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();

        piEmpregado.setNome("Barry Burd");
        piEmpregado.setCargo("CEO");
        piEmpregado.setSalarioSemanal(5000.00);
        piEmpregado.setDeducaoBeneficios(500.00);
        piEmpregado.preencherCheque(piEmpregado.calcValorPagamento());

        EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();

        mpEmpregado.setNome("Steve Surace");
        mpEmpregado.setCargo("Motorista");
        mpEmpregado.setTaxaHora(7.53);
        mpEmpregado.preencherCheque(mpEmpregado.calcValorPagamento(10));

        MeioPeriodoHorasEmDobro mpdEmpregado = new MeioPeriodoHorasEmDobro();

        mpdEmpregado.setNome("Chris Moffitt");
        mpdEmpregado.setCargo("Autor de Livros");
        mpdEmpregado.setTaxaHora(7.53);
        mpdEmpregado.preencherCheque(mpdEmpregado.calcValorPagamento(50));
    }
    
}
