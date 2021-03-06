package com.lioride.lioride;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerDialogTheme extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);



// for four

        DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(),
                AlertDialog.THEME_HOLO_DARK,this,year,month,day);



        return datepickerdialog;
    }

    public void onDateSet(DatePicker view, int year, int month, int day){

        TextView textview = (TextView)getActivity().findViewById(R.id.selectedDateTxt);

        textview.setText(day + ":" + (month+1) + ":" + year);

    }
}
