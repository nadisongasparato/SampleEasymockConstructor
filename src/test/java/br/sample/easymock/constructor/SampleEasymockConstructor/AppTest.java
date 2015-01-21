package br.sample.easymock.constructor.SampleEasymockConstructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({TextBD.class, App.class})
public class AppTest {

    @Test
    public void testApp(){
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
    
}
