package mjj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        long a = 1;
//        long b = 2;
//        System.out.println(a / b);

        for(int j=0;j<10;j++){
        StringBuffer stringBuffer=new StringBuffer();
            for (int i = 0; i < 10; i++) {
                double random = Math.random();
                long round = Math.round(random * 10);
                if(round==10){
                    round--;
                }
                stringBuffer.append(round);
            }
        System.out.println(stringBuffer.toString());
        }

        }


}
