public class Main {
    public static void main(String[] args) {
        for(int row=6; row>0; row--)
        {
            for(int col=row; col>0; col--)
            {
                String sym="*";
                System.out.print(sym);
            }
            System.out.println();
        }

        int rounds=6;
        for(int row=1; row<=rounds; row++)
        {
            for(int star=row; star>0; star--)
            {
                System.out.print("*");
            }
            for(int dash=rounds-row; dash>0; dash--)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}