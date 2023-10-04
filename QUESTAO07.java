public class QUESTAO07{
    public static void main(String[] args) {
        int i = 55;

        while (i != 1) {
            System.out.print(i + " , ");
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = 3 * i + 1;
            }
        }

        System.out.println(i);
    }
}

