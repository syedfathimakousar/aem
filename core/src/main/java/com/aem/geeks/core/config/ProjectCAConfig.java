package com.aem.project.core.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(label="Project - Context Aware Configuration", description="Context Aware Configuration for AEM Project.")
public @interface ProjectCAConfig {

    @Property(label = "Project Country Site",
            description = "Project Site Name")
    String siteCountry() default "us";

    @Property(label = "Project Site Locale",
            description = "Project Site for for different languages")
    String siteLocale() default "en";

    @Property(label = "Project Site Admin",
            description = "Admin for updating country site.")
    String siteAdmin() default "aem-project";

    @Property(label = "Site Section",
            description = "Site section for project site.")
    String siteSection() default "aem";
}


