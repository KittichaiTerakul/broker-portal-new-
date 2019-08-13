package com.example.ProjectAllianz.customvalidatot;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateValidator implements
        ConstraintValidator<DateConstraint, String> {

    @Override
    public void initialize(DateConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext constraintValidatorContext) {


//        System.out.println( contactField);
        boolean result;

//        try {
//            Date dateOfbirth =new SimpleDateFormat("dd/MM/yyyy").parse(contactField);
//            LocalDateTime localDateTime = LocalDateTime.now();
//            Date date = Date.from( localDateTime.atZone( ZoneId.systemDefault()).toInstant());
//            boolean overRangeYear
//            result = result &&
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


//        Calendar prevYear = Calendar.getInstance();
//        prevYear.add(Calendar.YEAR, -18);

        result = contactField != null;

        return result;

    }
}
