/**
 * Created by e165715 on 2016/12/04.
 *
 */
public class Error1 {
    public static void main(String[] arg){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            e.printStackTrace();
        }




    }

}
