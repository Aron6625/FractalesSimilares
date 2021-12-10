
public class Ejercicio7
{
    public int estrella(int nivel){
        if(nivel == 1){
            return 1;
        }else{
            return 5 + 4*estrella(nivel-1);
        }
    }
}
