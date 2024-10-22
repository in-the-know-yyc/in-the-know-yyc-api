package com.intheknowyyc.api.data.exceptions;

/**
 * An exception thrown when a resource is not found.
 */
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
