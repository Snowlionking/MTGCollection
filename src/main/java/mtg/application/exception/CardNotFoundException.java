package mtg.application.exception;

public class CardNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CardNotFoundException(Long id) {
        super("Could not find card " + id);
    }

}
