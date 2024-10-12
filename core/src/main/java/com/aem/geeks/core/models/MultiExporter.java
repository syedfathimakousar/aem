package com.aem.project.core.models;

import java.util.Calendar;
import java.util.List;

public interface MultiExporter {
    public String getTitle();
    public String getDescription();
    public List<String> getBooks();
    public Calendar getDate();
}
