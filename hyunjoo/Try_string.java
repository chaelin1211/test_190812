public class Try_string{
    public static void main(String args[]){
        String str1 = new String("This is really not immutable!!");
        String str2 = str1;
        boolean retVal;
        //int length;
        double d =102939939.939;
        retVal = str1.equals(str2);
        System.out.printf("Returned Value :" + retVal + "\n");
        System.out.printf("String Length is :" +str1.length() + "\n");
        System.out.printf("String comparing is :" + str1.compareTo(str2) + "\n");
        System.out.printf("String concat is :" + str1.concat(str2) + "\n");
        System.out.printf("String replaceAll is :" + str1.replaceAll("is","??") + "\n");
        System.out.printf("String substring is :" + str1.substring(10) + "\n");
        System.out.printf("Return Value :" + String.valueOf(d) + "\n");
    }
}