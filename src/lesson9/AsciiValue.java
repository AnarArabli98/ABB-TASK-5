package lesson9;

public class AsciiValue {
    private final char character;
    private final int asciiValue;

    public AsciiValue(char character) {
        this.character = character;
        this.asciiValue = character;
    }

    @Override
    public String toString() {
        return "AsciiValue{" +
                "character=" + character +
                ", asciiValue=" + asciiValue +
                '}';
    }
}
