package PClases;

public class Recursividad {
    public int Calcular(int base, int exp){
        if(base == 0){
            return 0;
        }
        else{
            if(exp==0){
                return 1;
            }
            else{
                if(exp!=1){
                    return base* Calcular(base, exp-1);
                }
                else{
                    return base;
                }
            }
        }
    }
}
