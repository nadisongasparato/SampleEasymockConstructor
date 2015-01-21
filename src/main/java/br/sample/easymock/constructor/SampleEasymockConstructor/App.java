package br.sample.easymock.constructor.SampleEasymockConstructor;


public class App {

    public void printText() {
	TextBD textBD = new TextBD("Iniciado App Class", 6);

	System.out.println(textBD.printText());

	System.out.println("Retorno do method Private --> " + this.addOne(textBD.getVezes()));
    }

    private int addOne(int valor) {
	return valor++;
    }

}
