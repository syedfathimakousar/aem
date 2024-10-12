package com.aem.project.core.jmx;

import com.adobe.granite.jmx.annotation.Description;
public interface ProjectMBean {
    @Description("Please enter Author Name")
    String getAuthorName(String authorName);
}
