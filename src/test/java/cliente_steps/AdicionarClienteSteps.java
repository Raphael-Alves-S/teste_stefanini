package cliente_steps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import core.ConfigUrl;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.AddCustomerPage;

public class AdicionarClienteSteps {
	private static ConfigUrl config=new ConfigUrl();
	private static AddCustomerPage addCustomer= new AddCustomerPage(config.getDriver());
	
	
@Test
@Dado("que altero a versão do sistema")
public void alterarVersaoBootstrap() {
	addCustomer.alterVersion();
}

@Test
@E("acesso o formulário")
public void acessarFormulario() {
	addCustomer.customerButton();
}

@Test
@E("preencho o formulário com as informações solicitadas")
public void preencherFormulario() {
	addCustomer.includeCustomer();
}

@Test
@Quando("clicar no botão Salvar")
public void clicarEmSalvar() {
	addCustomer.clickSave();
}

@Test
@Então("valido a mensagem de sucesso do cadastro")
public void validarMensagemSucesso(){	
	assertEquals(AddCustomerPage.MSG, addCustomer.valSucess());
}

@After
public static void sairNavegador() {
	addCustomer.exitBrowser();
}
}
