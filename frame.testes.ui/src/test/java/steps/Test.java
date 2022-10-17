package steps;

import java.awt.AWTException;


import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class Test {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	//MOTO
	@Dado("que eu esteja na tela de cadastro")
	public void que_eu_esteja_na_tela_de_cadastro() {
		metodos.abrirNavegador();
	}

	@Dado("preencha dados pessoais validos")
	public void preencha_dados_pessoais_validos() {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
	}
	
	@Dado("preencha endereco valido")
	public void preencha_endereco_valido() {
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
	}

	@Dado("selecione tipo de veiculo")
	public void selecione_tipo_de_veiculo() {
		metodos.clicar(el.getMoto());
	}

	@Quando("envie a foto da cnh valida")
	public void envie_a_foto_da_cnh_valida() throws AWTException {
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
	}

	@Entao("clicar em cadastre-se para fazer entregas")
	public void clicar_em_cadastre_se_para_fazer_entregas() {
		metodos.clicar(el.getBtnCadastrar());
	}

	@Entao("valido cadastro realizado com sucesso")
	public void valido_cadastro_realizado_com_sucesso() throws InterruptedException {
    metodos.validarTexto(el.getMsgConfirmacao(), "Recebemos os seus dados");
	metodos.fecharNavegador();
	}

	//bicicleta
	
	@Quando("eu clicar em cadastra-se para entrega de bicicleta")
	public void eu_clicar_em_cadastra_se_para_entrega_de_bicicleta() throws AWTException, InterruptedException {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getBicicleta());
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
		metodos.clicar(el.getBtnCadastrar());
		
	}

	@Entao("eu valido as informacoes")
	public void eu_valido_as_informacoes() {
		metodos.validarTexto(el.getMsgConfirmacao(), "Recebemos os seus dados");
		metodos.fecharNavegador();
	}

	//van
	
	@Quando("eu clicar em cadastra-se para entrega de van")
	public void eu_clicar_em_cadastra_se_para_entrega_de_van() throws AWTException {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getCarro());
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
		metodos.clicar(el.getBtnCadastrar());
		metodos.validarTexto(el.getMsgConfirmacao(), "Recebemos os seus dados");
		metodos.fecharNavegador();
	}

	@Dado("escolher mais de um metodo de entrega")
	public void escolher_mais_de_um_metodo_de_entrega() throws AWTException {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getCarro());
		metodos.clicar(el.getBicicleta());
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
	}

	@Quando("clico em cadastra-se")
	public void clico_em_cadastra_se() {
		metodos.clicar(el.getBtnCadastrar());
	}

	@Entao("eu valido a mensagem de erro sobre a obrigatoridade do metodo de entrega")
	public void eu_valido_a_mensagem_de_erro_sobre_a_obrigatoridade_do_metodo_de_entrega() {
		metodos.validarTexto(el.getMsgError(), "Oops!");
		metodos.fecharNavegador();
	}

	@Dado("nao informo nenhum dado obrigatorio")
	public void nao_informo_nenhum_dado_obrigatorio() throws AWTException {
		metodos.escrever(el.getNomeCompleto(), "");
		metodos.escrever(el.getCpf(), "");
		metodos.escrever(el.getEmail(), "");
		metodos.escrever(el.getWpp(), "");
		metodos.escrever(el.getCep(), "");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getCarro());
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
		metodos.clicar(el.getBtnCadastrar());
	}

	@Entao("valido mensagens nos campos indicando obrigatoridade do preenchimento")
	public void valido_mensagens_nos_campos_indicando_obrigatoridade_do_preenchimento() {
		metodos.validarTexto(el.getMsgDadosObrigatorios(), "É necessário informar o nome");
		metodos.fecharNavegador();
	}

	@Dado("informo dado obrigatorios invalidos")
	public void informo_dado_obrigatorios_invalidos() throws AWTException {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "djfnjdnfdjnfjdnfjkmkamskamksk");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getCarro());
		metodos.clicar(el.getBicicleta());
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
		metodos.clicar(el.getBtnCadastrar());
	}

	@Entao("valido mensagens nos campos indicando dados invalidos")
	public void valido_mensagens_nos_campos_indicando_dados_invalidos() {
		metodos.validarTexto(el.getMsgError(), "Oops!");
		metodos.fecharNavegador();
	}

	@Dado("preencho os campos obrigatorios")
	public void preencho_os_campos_obrigatorios() {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getCarro());
	}

	@Dado("nao anexo a cnh")
	public void nao_anexo_a_cnh() {
	}

	@Entao("valido mensagem de erro sobre a obrigatoriedade do anexo")
	public void valido_mensagem_de_erro_sobre_a_obrigatoriedade_do_anexo() {
		metodos.clicar(el.getBtnCadastrar());
		metodos.validarTexto(el.getMsgCNH(), "Adicione");
		metodos.fecharNavegador();
	}

	@Dado("nao informo nenhum metodo de entrega")
	public void nao_informo_nenhum_metodo_de_entrega() throws AWTException {
		metodos.escrever(el.getNomeCompleto(), "Antonio Leonel Rodrigues Junior");
		metodos.escrever(el.getCpf(), "34526757004");
		metodos.escrever(el.getEmail(), "vawahi4845@keyido.com");
		metodos.escrever(el.getWpp(), "11997179875");
		metodos.escrever(el.getCep(), "11990000");
		metodos.clicar(el.getBtnCep());
		metodos.escrever(el.getComplemento(), "200");
		metodos.clicar(el.getBtnCnh());
		metodos.anexarArquivo();
		metodos.clicar(el.getBtnCadastrar());
	}

	@Entao("valido mensagem de erro sobre a obrigatoriedade de um metodo")
	public void valido_mensagem_de_erro_sobre_a_obrigatoriedade_de_um_metodo() {
		metodos.validarTexto(el.getMsgMetodoEntrega(), "Selecione o método de entrega");
		metodos.fecharNavegador();
	}

}