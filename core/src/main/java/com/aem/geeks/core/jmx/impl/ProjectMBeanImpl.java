package com.aem.project.core.jmx.impl;

import com.aem.project.core.jmx.ProjectMBean;
import com.adobe.granite.jmx.annotation.AnnotatedStandardMBean;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.DynamicMBean;
import javax.management.NotCompliantMBeanException;

@Component(
        immediate = true,
        service = DynamicMBean.class,
        property = {
                "jmx.objectname = com.aem.project.core.jmx:type=Project MBean"
        }
)
public class ProjectMBeanImpl extends AnnotatedStandardMBean implements ProjectMBean {

    private static final Logger LOG = LoggerFactory.getLogger(ProjectMBeanImpl.class);
    public ProjectMBeanImpl() throws NotCompliantMBeanException {
        super(ProjectMBean.class);
    }

    @Override
    public String getAuthorName(String authorName) {
        LOG.info("\n ==========Calling ProjectMBean===========");
        return authorName;
    }
}
