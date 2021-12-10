
public class Ejercicio4
{
    public int sierpinski(int nivel){
        if(nivel <= 1){
            return 1;
        }else{
            return 2 + 3*sierpinski(nivel-1);
        }
    }
}
