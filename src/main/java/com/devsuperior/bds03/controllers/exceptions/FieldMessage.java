package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;

    public FieldMessage(String fieldMessage) {
    }

    public FieldMessage(String fieldMessage, String message) {
        this.fieldName = fieldMessage;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
