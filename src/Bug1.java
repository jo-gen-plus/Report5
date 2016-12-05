import java.util.DoubleSummaryStatistics;

/**
 * Created by e165715 on 2016/12/04.
 *
 */
public class Bug1 {
    public static void main(String[] arg){
        try{
            String str = "3．14";
            double value ;
            value = Double.parseDouble(str);
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }




    }

}
