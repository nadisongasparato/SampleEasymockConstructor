package br.sample.easymock.constructor.SampleEasymockConstructor;


public class App 
{
    public void printText(){
   	TextBD textBD = new TextBD("Iniciado App Class", 6);
   	
   	System.out.println(textBD.printText());
       }
}
