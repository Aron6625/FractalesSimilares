
public class Ejercicio6
{
    public int arboles(int n){
        int res;
        if(n <= 1){
            res = 1;
        }else{
            res = arboles(n-1)+(int)(Math.pow(2, n-1));
        }
        return res;
    }
}
