package br.sample.easymock.constructor.SampleEasymockConstructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({TextBD.class, App.class})
public class AppTest {

    /**
     * Exemplo de como injetar uma instancia no teste durante o tempo de execução.
     */
    @Test
    public void testAppInjectInstance() {
	App app = new App();
	TextBD mockTextBD = new TextBD("Iniciado Test Class", 5);
	try {
	    PowerMock.expectNew(TextBD.class, "Iniciado App Class", 6).andReturn(mockTextBD);
	    PowerMock.replay(TextBD.class);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	app.printText();
    }


    /**
     * Exemplo de como efetuar mock de um metodo private
     */
    @Test
    public void testAppMockPrivateMethod() {
	App appTest = PowerMock.createPartialMock(App.class, "addOne");
	try {
	    PowerMock.expectPrivate(appTest, "addOne", 6).andReturn(10);
	    PowerMock.replay(appTest);
	    appTest.printText();

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
