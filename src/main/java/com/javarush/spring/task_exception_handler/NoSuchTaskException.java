package com.javarush.spring.task_exception_handler;

public class NoSuchTaskException extends RuntimeException{

    public NoSuchTaskException(String message) {
        super(message);
    }
}
