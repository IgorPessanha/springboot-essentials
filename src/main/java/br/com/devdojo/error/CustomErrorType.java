package br.com.devdojo.error;

/**
 * @author igor - By DevDojo
 */
public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
