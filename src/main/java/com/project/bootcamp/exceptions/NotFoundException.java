package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
