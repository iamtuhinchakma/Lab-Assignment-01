public class NameBox {
    public static void main(String[] args) {
        String myName = "Tuhin";
        int nameLength = myName.length() + 4;
        String horizontalLine = "+" + "-".repeat(nameLength) + "+";
        String emptyLine = "|" + " ".repeat(nameLength) + "|";

        System.out.println(horizontalLine);
        System.out.println(emptyLine);
        System.out.println("|  " + myName + "  |");
        System.out.println(emptyLine);
        System.out.println(horizontalLine);
    }
    
}