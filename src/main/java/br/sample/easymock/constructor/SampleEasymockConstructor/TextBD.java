package br.sample.easymock.constructor.SampleEasymockConstructor;

public class TextBD {
    
    private String text = "Init Class";
    
    private int vezes = 0;
    
    
    public TextBD(){
	super();
    }
    
    
    public TextBD(String text) {
	this.text = text;
    }
    
    public TextBD(String text, int vezes) {
   	this.text = text;
   	this.vezes = vezes;
       }
    
    
    public String getText(){
	return this.text;
    }
    
    public void setText(String text){
	this.text = text;
    }


    public int getVezes() {
        return vezes;
    }


    public void setVezes(int vezes) {
        this.vezes = vezes;
    }
    
    public String printText(){
	return this.text + " " + this.vezes;
    }

}
