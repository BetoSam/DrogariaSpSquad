package page;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class PageServicosDrogaria extends DriversFactory {
	public void selecionarServicos(String servicoSelecionado) {
		if (servicoSelecionado.equalsIgnoreCase("consulta online")) {
			servicoSelecionado= "consulta-online";
		}driver.findElement(By.xpath("(//li[@class='rnk-lista-item']//a[@href='/"+servicoSelecionado+"'])[1]")).click();
	}
}