
public class Ejercicio5{
    public int triangulo(int nivel){
        if(nivel ==  1){
            return 4;
        }else{
            return triangulo(nivel-1)*5-8;
        }
    
    }
}
