package com.daylog;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DayLog {
    private int _id;
    private LocalDateTime _dateTime;
    ArrayList<Log> _logs;

    public DayLog(ArrayList<Log> logs) {
        _logs = logs;
    }
}
