package com.szymonharabasz.simplefaces;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@ApplicationScoped
@FacesConfig(
        version = JSF_2_3
)
public class ConfigurationBean {
}
