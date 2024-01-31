package Lambda;
interface Printable{
    void print(String message);
}
interface Iaverage{
    double avg(int[] array);
}
public class LambdaParameter {
    public static void main(String[] args) {
        Printable printable = mes -> System.out.println(mes.toUpperCase());
        printable.print("method invoked");

        int[] array = {1,5,7,8,56};

        Iaverage iaverage=(darray)->{

            double sum=0;
            int length=darray.length;
            for (int j : darray) {
          //for(int i=0;i<length;i++)  {
                sum = sum + j;
                //sum = sum + array[i];
            }

            return (sum/length);
        };


        System.out.println(iaverage.avg(array));

    }
}
