package com.seleznov.smt.autoclient;

import java.util.Set;

/**
 * @author Illia Seleznov
 */
public class AutoClientConfiguration {

    private static class ConfigurationGroup {
        private String configurationItemName;
        private Set<String> configurationItemValue;

    }

    private Set<ConfigurationGroup> configuration;
    private ConfigurationValidator validator;

}
