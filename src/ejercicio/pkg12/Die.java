package ejercicio.pkg12;

public class Die {
    private Integer value;
    
    public Die(){
       Integer randomValue = ((int)(Math.random() * 6)+1);
        value=randomValue;
    }

    public Integer getValue() {
        return value;
    }
    
}
