import ru.netology.sqr.SqrRootService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int dia1 = 424;
        int dia2 = 657;


        SqrRootService service = new SqrRootService();
        System.out.println(service.calcSqrt(dia1,dia2));

    }
}


