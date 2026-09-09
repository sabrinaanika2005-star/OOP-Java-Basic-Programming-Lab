class TextFormatter {

    static void formatText(String text) {
        System.out.println(text);
    }

    static void formatText(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }

    static void formatText(String text, String prefix) {
        System.out.println(prefix + " " + text);
    }

    public static void main(String[] args) {
        formatText("HELLO");
        formatText("Echo", 2);
        formatText("System updated", "[INFO]");
    }
}