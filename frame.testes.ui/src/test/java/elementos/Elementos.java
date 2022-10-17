package elementos;

import org.openqa.selenium.By;

public class Elementos {

	//DADOS
	private By NomeCompleto = By.cssSelector("#page-deliver > form > fieldset:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input[type=text]");
	private By Cpf = By.cssSelector("#page-deliver > form > fieldset:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input[type=text]");
	private By Email = By.cssSelector("#page-deliver > form > fieldset:nth-child(2) > div:nth-child(3) > div:nth-child(1) > input[type=email]");
    private By Wpp = By.cssSelector("#page-deliver > form > fieldset:nth-child(2) > div:nth-child(3) > div:nth-child(2) > input[type=text]");
    
    //ENDERECO
    private By Cep = By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input[type=text]");
	private By BtnCep = By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(2) > div:nth-child(2) > input[type=button]");
	private By Numero = By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(4) > div:nth-child(1) > input[type=text]");
	private By Complemento = By.cssSelector("#page-deliver > form > fieldset:nth-child(3) > div:nth-child(4) > div:nth-child(2) > input[type=text]");
	
	//ENTREGA
	private By Moto = By.cssSelector("#page-deliver > form > fieldset:nth-child(4) > ul > li:nth-child(1)");
	private By Bicicleta = By.cssSelector("#page-deliver > form > fieldset:nth-child(4) > ul > li:nth-child(2) > img");
	private By Carro = By.cssSelector("#page-deliver > form > fieldset:nth-child(4) > ul > li:nth-child(3) > img");
	private By btnCnh = By.cssSelector("#page-deliver > form > div > p");
	private By BtnCadastrar = By.cssSelector("#page-deliver > form > button");
	
	//MENSAGENS
	private By msgConfirmacao = By.xpath("//div[@class='swal2-html-container']");
	private By msgError = By.xpath("//span[text()='Oops! Selecione apenas um método de entrega']");
	private By msgDadosObrigatorios = By.xpath("//span[text()='É necessário informar o nome']");
	private By msgCNH = By.xpath("//span[text()='Adicione uma foto da sua CN']");
	private By msgMetodoEntrega = By.xpath("//span[text()='Selecione o método de entrega']");
	
	
    public By getMsgMetodoEntrega() {
		return msgMetodoEntrega;
	}
	
    public By getMsgCNH() {
		return msgCNH;
	}
	
    public By getMsgDadosObrigatorios() {
		return msgDadosObrigatorios;
	}
	public By getMsgError() {
		return msgError;
	}
	
	public By getMsgConfirmacao() {
		return msgConfirmacao;
	}
	public By getBtnCnh() {
		return btnCnh;
	}
	public By getNomeCompleto() {
		return NomeCompleto;
	}
	public By getCpf() {
		return Cpf;
	}
	public By getEmail() {
		return Email;
	}
	public By getWpp() {
		return Wpp;
	}
	
	public By getCep() {
		return Cep;
	}
	public By getBtnCep() {
		return BtnCep;
	}
	
	public By getNumero() {
		return Numero;
	}
	public By getComplemento() {
		return Complemento;
	}
	
	public By getMoto() {
		return Moto;
	}
	public By getBicicleta() {
		return Bicicleta;
	}
	public By getCarro() {
		return Carro;
	}
	
	public By getBtnCadastrar() {
		return BtnCadastrar;
	}
	
	
}
