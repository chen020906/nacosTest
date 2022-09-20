package com.bj.springcloud.predicate;

import lombok.Data;

import java.time.LocalTime;

@Data
public class AccessTimeConfig {

    private LocalTime start;

    private LocalTime end;


    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "AccessTimeConfig{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

}