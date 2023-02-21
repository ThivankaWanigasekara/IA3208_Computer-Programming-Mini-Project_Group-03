package com.example.attendanceapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

class AppCalendar extends DialogFragment {
    Calendar calendar = Calendar.getInstance();
    private int year = Calendar.YEAR;
    private int month = Calendar.MONTH;
    private int day = Calendar.DAY_OF_MONTH;

    private interface OnCalendarOkClickListener{
        void onClick(int year,int month, int day);
    }
    public OnCalendarOkClickListener onCalendarOkClickListener;

    public void setOnCalendarOkClickListener(OnCalendarOkClickListener onCalendarOkClickListener) {
        this.onCalendarOkClickListener = onCalendarOkClickListener;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(),((view, year, month, dayOfMonth) -> {
            OnCalendarOkClickListener.onClick(year, month, dayOfMonth);
        }), year, month, day);
    }

    void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    String
}
