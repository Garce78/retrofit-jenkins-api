package com.teotas.jenkins.api.models.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class JenkinsParameterDefinition {
    private DefaultJenkinsParameter defaultParameterValue;
    private String description;
    private String name;
    private String type;
}
