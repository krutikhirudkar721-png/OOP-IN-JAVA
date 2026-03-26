// StringBuffer operations: append, insert, reverse

class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("Before Reverse: " + sb);
        System.out.println("After Reverse: " + sb.reverse());
    }
}
