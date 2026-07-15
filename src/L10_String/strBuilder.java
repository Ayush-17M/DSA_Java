package L10_String;

public class strBuilder {
    static void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
