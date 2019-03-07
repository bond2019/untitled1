import java.math.BigDecimal;

public class Break {
    public static void main(String[] args) {
//b2
        for (int i = 0; i <3; i++)
            for (int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++) {
                    if (k == 2) break;
                    System.out.println(i);
                }



    }
}
