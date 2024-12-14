package ifba.edu.web2.exception;

import org.springframework.http.HttpStatus;
public class NotFoundException extends RuntimeException {

    private int code = HttpStatus.NOT_FOUND.value();

    public NotFoundException(String msg) {
            super(msg);
    }
}

