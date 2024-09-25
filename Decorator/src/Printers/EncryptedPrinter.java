package Printers;

public class EncryptedPrinter implements IPrinter {
    private IPrinter wrappedPrinter;

    public EncryptedPrinter(IPrinter printer) {
        this.wrappedPrinter = printer;
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encryptMessage(message);
        wrappedPrinter.print(encryptedMessage);
    }

    // Decryption with a Caesar cipher (shift by 3 characters)
    private String encryptMessage(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    // decrypt method here if needed in the future
    public String decryptMessage(String encryptedMessage) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedMessage.toCharArray()) {
            decrypted.append((char) (c - 3));
        }
        return decrypted.toString();
    }
}

