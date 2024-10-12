package com.aem.project.core.services.impl;

import com.aem.project.core.config.ProjectOSGiConfig;
import com.aem.project.core.services.OSGiConfigModule;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = OSGiConfigModule.class,immediate = true)
@Designate(ocd = ProjectOSGiConfig.class)
public class OSGiConfigModuleImpl implements OSGiConfigModule{

    private int serviceId;
    private String serviceName;
    private String serviceURL;

    @Activate
    protected void activate(ProjectOSGiConfig projectOSGiConfig){
        serviceId=projectOSGiConfig.serviceID();
        serviceName=projectOSGiConfig.serviceName();
        serviceURL=projectOSGiConfig.serviceURL();
    }
    @Override
    public int getServiceId() {
        return serviceId;
    }
    @Override
    public String getServiceName() {
        return serviceName;
    }
    @Override
    public String getServiceURL() {
        return serviceURL;
    }
}
