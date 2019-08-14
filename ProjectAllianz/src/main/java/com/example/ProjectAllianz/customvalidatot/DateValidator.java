package com.example.ProjectAllianz.customvalidatot;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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


        String strDate = contactField;
        boolean result;
        result = contactField != null && isBeforeexpectYear(-18,strDate);

        return result;

    }

    private boolean isBeforeexpectYear(int range ,String sDate){
        try {
            Date   dateOfBirshtObj = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
            LocalDate localNow = LocalDate.now();
            Date dateNow =Date.from(localNow.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Calendar calendar = Calendar.getInstance();

            calendar.setTime(dateNow);
            calendar.add(Calendar.YEAR,range);


            if (dateOfBirshtObj.before(calendar.getTime()) || dateOfBirshtObj.after(dateNow)){
                System.out.println("not valid year");
                return false;
            }else {
                System.out.println("valid ");
                return true;
            }

        } catch (ParseException e) {
            e.printStackTrace();
            return false ;
        }

    }
}
