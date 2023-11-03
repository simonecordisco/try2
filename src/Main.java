public class Main{

    public static void main(String[] args) {
        try {
            char c = 'k';
            validateCharacter(c);
            System.out.println("Il carattere è un numero.");
        } catch (CharacterNotANumberException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    public static void validateCharacter(char c) throws CharacterNotANumberException {
        if (!Character.isDigit(c)) {
            throw new CharacterNotANumberException("Il carattere non è un numero: " + c);
        }
    }
}

class CharacterNotANumberException extends Exception {
    public CharacterNotANumberException(String message) {
        super(message);
    }
}

