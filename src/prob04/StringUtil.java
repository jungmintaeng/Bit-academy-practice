package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < str.length; i++) {
        	builder.append(str[i]);
        }
        return builder.toString();
    }
}