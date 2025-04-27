package Main.String;

public class Number_of_Segments_in_a_String {
    public static int countSegments(String s) {
        if(s.length() == 0) return 0;
        int count = 0;
        int index = 0;
        while(index < s.length()) {
            // Skip spaces
            while(index < s.length() && s.charAt(index) == ' ') {
                index++;
            }
            // Count the segment
            if(index < s.length() && s.charAt(index) != ' ') {
                count++;
                // Skip the segment
                while(index < s.length() && s.charAt(index) != ' ') {
                    index++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("hellw, my name is sanchay"));
    }
}