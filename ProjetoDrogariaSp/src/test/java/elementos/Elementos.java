package elementos;

import org.openqa.selenium.By;

public class Elementos {
	// baner de produtos
	public By hidratação = By.xpath(
			"//img[@data-src='/arquivos/dpsp-trade_johnson-hidratacao_01-05-23_sky-a-570x300.png?v=638183043055130000']");
	public By tintura = By.xpath(
			"//img[@data-src='/arquivos/dpsp-trade_coty-tinuras_01-05-23_sky-b-570x300.png?v=638182869440230000']");
	public By BanerProduto1 = By.xpath("(//li[@class='rnk-lista-item rnk-lista-item-extra'])[1]");

//Conheça os Serviços de Saúde da Drogaria São Paulo
	public By persiscricaoDigital = By.xpath("(//li[@class='rnk-lista-item']//a[@href='/servicos'])[1]");
	public By testCovid19 = By.xpath("(//li[@class='rnk-lista-item']//a[@href='/teste/de-covid'])[1]");
	public By consultaOnline = By.xpath("(//li[@class='rnk-lista-item']//a[@href='/consulta-online'])[1]");
	public By aplicaInjetaveis = By.xpath("(//li[@class='rnk-lista-item']//a[@href='/aplicacao-de-injetaveis'])[1]");
	public By pressaoArterial = By.xpath("(//li[@class='rnk-lista-item']//a[@href='/aferir-pressao'])[1]");
	public By todosServicos = By.xpath("(//span[@class='rnk-link-text'])[6]");
//Acessar Perfil
	public By email = By.id("input-floating-logar-email");
	public By acessarPerfil = By.xpath("//*[text()='Acesse aqui o seu perfil']");
	public By senha = By.id("initial-show-password");
	public By btnEntrar = By.xpath("(//button[text()='Entrar '])[1]");
	public By cadastro = By.xpath("//*[text()='Não tem uma senha? Cadastre agora.']");
	public By emailCadastrar = By.id("rnk-input-email-create-account");

//Os melhores desconto de farmacia
	public By descontoEConvenio = By.xpath("//*[text()='Descontos Convênios']");
	public By descontoDermaclub = By.xpath("//*[text()='Descontos Dermaclub']");
	public By cupomDesconto = By.xpath("//*[text()='Cupons de Desconto']");
	public By descontoMedicamentos = By.xpath("//*[text()='Descontos Medicamentos']");
	public By programaVivaSaude = By.xpath("//*[text()='Programa viva saúde']");
	public By vejaTodosDiscontos = By.xpath("//*[text()='Veja todos os descontos']");
	//Baixe o app
public By appStore =By.xpath("(//a[@href='https://apps.apple.com/br/app/drogaria-s%C3%A3o-paulo/id1458029483'])[2]");
public By googleStore = By.xpath("(//a[@href='https://play.google.com/store/apps/details?id=br.com.app.meuvivasaude.descontos'])[2]");
//Parte principal
public By revistas = By.xpath("//*[text()='Ofertas da Revista']");
public By recorrentes = By.xpath("//*[text()='Pedidos Recorrentes']");
public By marcasProprias  = By.xpath("//*[text()='Marcas Próprias']");
public By lojasParceiras = By.xpath("//img[@alt='Mamãe e bebê']");
public By  cupons = By.xpath("//h3[normalize-space()='Cupons']");
public By testCovid = By.xpath("//img[@alt='Teste de covid']");
public By neutrogena = By.xpath("//*[text()='Neutrogena']");
public By  secret = By.xpath("//img[@alt='Secret']");
public By  desodorantes = By.xpath("//*[text()='Desodorantes']");
public By vacina = By.xpath("(//img[@alt='Procter Vacina'])[1]");
public By clubLoreal = By.xpath("//*[text()='Clube de vantagens Loreal']");
public By pedidoRecorrente = By.xpath("//*[text()='Pedidos Recorrentes']");









}
