package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Metodos  {

	WebDriver driver;
	
	
	public void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://buger-eats.vercel.app/deliver");
		driver.manage().window().maximize();
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}
	
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}
	
	public void anexarArquivo() throws AWTException {
		
		Robot rb = new Robot();
		rb.delay(1000);
		StringSelection ss = new StringSelection("C:\\Users\\Usuário\\Documents\\E2E Treinamentos\\cnh\\cnh-digital.webp");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		}
	

	public void validarTexto ( By elemento , String textoDesejado ) {
		   try {
		   String textoCapturado = driver.findElement ( elemento ) .getText ( ) ;
		    assertTrue ( textoCapturado.contains ( textoDesejado ) ) ;
		    } catch ( Exception e ) {
		       System.out.println ( e.getCause ( ) ) ;
		       System.out.println ( e.getMessage ( ) ) ;
		}
	} 

	public void esperar(int tempo) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}
}

