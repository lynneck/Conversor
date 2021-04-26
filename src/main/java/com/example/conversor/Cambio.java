package com.example.conversor;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class Cambio {
    private String name;
    private String bid;
    private String create_date;

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
