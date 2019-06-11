package dam.mtribor.taskcalendarservice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class CalendarExceptionHandler extends ResponseEntityExceptionHandler {

    public CalendarExceptionHandler() {
        super();
    }

    @ExceptionHandler(value = NoSuchElementException.class)
    protected ResponseEntity<Object> handleTaskNotFoundException(
            NoSuchElementException ex, WebRequest request) {

        return handleExceptionInternal(ex, "The resource was not found!",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        return handleExceptionInternal(ex, "One or more of the fields are not valid",
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}