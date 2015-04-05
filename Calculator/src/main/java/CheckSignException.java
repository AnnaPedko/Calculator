/**
 * Created by User on 19.03.2015.
 */

class CheckSignException extends Exception{
    private String message = null;

    public CheckSignException() {
        super();
    }
    public CheckSignException(String message) {
        super(message);
        this.message = message;
    }

    public CheckSignException(Throwable cause) {
        super(cause);
        }


    }

