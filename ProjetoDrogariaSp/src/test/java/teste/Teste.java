package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import page.PageServicosDrogaria;

public class Teste {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	PageServicosDrogaria pageServ = new PageServicosDrogaria();
	// Massa de Teste Sevico para sua saude
	String urlDesejadaTestCovid = "https://www.drogariasaopaulo.com.br/teste/de-covid";
	String urlDesejadapersiscricaoDigital = "https://www.drogariasaopaulo.com.br/servicos";
	String urlDesejadaConsulta = "https://www.drogariasaopaulo.com.br/consultas-medicas";
	String urlDesejadaPressaoArterial = "https://www.drogariasaopaulo.com.br/aferir-pressao";
	String urlDesejadaAplicaInjetaveis = "https://www.drogariasaopaulo.com.br/aplicacao-de-injetaveis";
	String urlDesejadaTodosOsServico = "https://www.drogariasaopaulo.com.br/servicos";
	// Massa de Teste Melhores desconto de farmacia
	String urlDesejedaDescontoEConvenio = "https://www.drogariasaopaulo.com.br/descontos/convenio";
	String urlDesejadaDescontoDermaclub = "https://www.drogariasaopaulo.com.br/dermaclub";
	String urlDesejadaCupomDesconto = "https://www.drogariasaopaulo.com.br/descontos/cupom";
	String urlDesejadaDescontoMedicamentos = "https://www.drogariasaopaulo.com.br/descontos/pbm";
	String urlDesejadaProgramaVivaSaude = "https://www.drogariasaopaulo.com.br/descontos/viva-saude";
	String urlDesejadaVejaTodosDiscontos = "https://www.drogariasaopaulo.com.br/descontos/para-voce";

	// Massa de Teste Baixe o app
	String urlDesejadaAppStore = "https://apps.apple.com/br/app/drogaria-s%C3%A3o-paulo/id1458029483";
	String urlDesejaGooglePlaySore = "https://play.google.com/store/apps/details?id=br.com.app.meuvivasaude.descontos";

	@Before
	public void antesDoteste() {
		metodo.abrirNavegador();
		metodo.scroll();
		metodo.pausa(4000);
	}

	@After
	public void dpoisDoTeste() {
		metodo.fecharNavegador();
	}

	@Test
	public void testeCovid19() {
		metodo.clicar(el.testCovid19);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaTestCovid);
	}

	@Test
	public void consultaOnline() {
		metodo.clicar(el.consultaOnline);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaConsulta);
	}

	@Test
	public void persiscricaoDigital() {
		metodo.clicar(el.persiscricaoDigital);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadapersiscricaoDigital);
	}

	@Test
	public void pressaoArterial() {
		metodo.clicar(el.pressaoArterial);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaPressaoArterial);
	}

	@Test
	public void aplicaInjetaveis() {
		metodo.clicar(el.aplicaInjetaveis);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaAplicaInjetaveis);
	}

	@Test
	public void descontoEConvenio() {
		metodo.clicar(el.descontoEConvenio);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejedaDescontoEConvenio);
	}

	@Test
	public void descontoDermaclub() {
		metodo.clicar(el.descontoDermaclub);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaDescontoDermaclub);
	}

	@Test
	public void cupomDesconto() {
		metodo.clicar(el.cupomDesconto);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaCupomDesconto);
	}

	@Test
	public void descontoMedicamentos() {
		metodo.clicar(el.descontoMedicamentos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaDescontoMedicamentos);
	}

	@Test
	public void programaVivaSaude() {
		metodo.clicar(el.programaVivaSaude);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaProgramaVivaSaude);
	}

	@Test
	public void todosServicos() {
		metodo.clicar(el.todosServicos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaTodosOsServico);
	}

	@Test
	public void vejaTodosDiscontos() {
		metodo.clicar(el.vejaTodosDiscontos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaVejaTodosDiscontos);
	}

	@Test
	public void appStore() {
		metodo.clicar(el.appStore);
		metodo.validarUrl(urlDesejadaAppStore);
		metodo.pausa(3000);
	}

	@Test
	public void googleStore() {
		metodo.clicar(el.googleStore);
		metodo.validarUrl(urlDesejaGooglePlaySore);
	}
}
