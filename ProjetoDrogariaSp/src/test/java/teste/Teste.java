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
	//Massa de Teste  Principal 
	String urlDesejadaOfertaRevista = "https://www.drogariasaopaulo.com.br/ofertas/revista?&utmi_p=_&utmi_pc=Html&utmi_cp=dsp-ativa_tabloide_01-06-23_story-90x90";
	String urlDesejadaVacina = "https://www.drogariasaopaulo.com.br/vacina-da-gripe?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-ativa_vacina-gripe_01-06-23-story-90x90";
	String urlDesejadaPedidosRecorrentes = "https://www.drogariasaopaulo.com.br/assinatura?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-ativa_assinatura_01-06-23_story-90x90";
	String urlDesejadaMarcaProprias = "https://www.drogariasaopaulo.com.br/marca/propria?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-ativa_evercare_01-06-23-story-90x90";
	String urlDesejadaLojaParceira = "https://www.drogariasaopaulo.com.br/busca/?fq=H:14067&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-mktp_babysec_05-06-23_story-90x90";
	String urlDesejadaCupons = "https://www.drogariasaopaulo.com.br/descontos/cupom?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-ativa_cupom_01-06-23_story-90x90";
	String urlDesejadaTesteCovid = "https://www.drogariasaopaulo.com.br/teste/de-covid?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-ativa_autoteste-covid_01-06-23_story-90x90";
	String urlDesejadaClubVantagens = "https://www.drogariasaopaulo.com.br/promocao-dermaclub?&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-trade_loreal-dermaclub_12-06-23_story-90x90";
	String urlDesejadaNeutrogena = "https://www.drogariasaopaulo.com.br/busca?fq=H:13805&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-trade_kenvue-neutrogena_06-06-23_story-90x90";
	String urlDesejadaSecret = "https://www.drogariasaopaulo.com.br/busca/?fq=H:14074&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-trade_procter-secret_01-06-23-story-90x90";
	String urlDesejadaDesodorante = "https://www.drogariasaopaulo.com.br/busca?fq=H:12926&utmi_p=_&utmi_pc=Html&utmi_cp=dpsp-trade_unilever-dove_01-06-23_story-90x90";
	
	@Before
	public void antesDoteste() {
		metodo.abrirNavegador();
		//metodo.scroll();
		//metodo.pausa(4000);
	}

	@After
	public void dpoisDoTeste() {
		metodo.fecharNavegador();
	}

	// @Test
	public void testeCovid19() {
		metodo.clicar(el.testCovid19);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaTestCovid);
	}

	// @Test
	public void consultaOnline() {
		metodo.clicar(el.consultaOnline);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaConsulta);
	}

	// @Test
	public void persiscricaoDigital() {
		metodo.clicar(el.persiscricaoDigital);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadapersiscricaoDigital);
	}

	// @Test
	public void pressaoArterial() {
		metodo.clicar(el.pressaoArterial);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaPressaoArterial);
	}

	// @Test
	public void aplicaInjetaveis() {
		metodo.clicar(el.aplicaInjetaveis);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaAplicaInjetaveis);
	}

	// @Test
	public void descontoEConvenio() {
		metodo.clicar(el.descontoEConvenio);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejedaDescontoEConvenio);
	}

	// @Test
	public void descontoDermaclub() {
		metodo.clicar(el.descontoDermaclub);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaDescontoDermaclub);
	}

	// @Test
	public void cupomDesconto() {
		metodo.clicar(el.cupomDesconto);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaCupomDesconto);
	}

	// @Test
	public void descontoMedicamentos() {
		metodo.clicar(el.descontoMedicamentos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaDescontoMedicamentos);
	}

	// @Test
	public void programaVivaSaude() {
		metodo.clicar(el.programaVivaSaude);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaProgramaVivaSaude);
	}

	// @Test
	public void todosServicos() {
		metodo.clicar(el.todosServicos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaTodosOsServico);
	}

	// @Test
	public void vejaTodosDiscontos() {
		metodo.clicar(el.vejaTodosDiscontos);
		metodo.pausa(3000);
		metodo.validarUrl(urlDesejadaVejaTodosDiscontos);
	}

	// @Test
	public void appStore() {
		metodo.clicar(el.appStore);
		metodo.validarUrl(urlDesejadaAppStore);
		metodo.pausa(3000);
	}

	// @Test
	public void googleStore() {
		metodo.clicar(el.googleStore);
		metodo.validarUrl(urlDesejaGooglePlaySore);
	}

	@Test
	public void campoServicoParaSuaSaude() {
		metodo.clicar(el.revistas);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaOfertaRevista);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.vacina);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaVacina);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.pedidoRecorrente);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaPedidosRecorrentes);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.marcasProprias);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaMarcaProprias);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.lojasParceiras);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaLojaParceira);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.cupons);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaCupons);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.testCovid);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaTesteCovid);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.clubLoreal);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaClubVantagens);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.neutrogena);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaNeutrogena);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.secret);
		metodo.pausa(1000);
		metodo.validarUrl(urlDesejadaSecret);
		metodo.voltar();
		metodo.pausa(1000);
		metodo.clicar(el.desodorantes);
		metodo.pausa(100);
		metodo.validarUrl(urlDesejadaDesodorante);
	}
//@Test
public void todosOsServicos() {
	metodo.clicar(el.todosServicos);
	metodo.pausa(3000);
	metodo.validarUrl(urlDesejadaTodosOsServico);
}
}
