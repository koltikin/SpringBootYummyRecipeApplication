package com.cydeo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

    @Getter
    @Setter
    @Configuration
    @ConfigurationProperties(prefix = "author")// prefix must be lowercase

    public class AuthorConfigData {
        private String Name; // private String AuthorName Not allowed, should be the same after prefix
        private String Email;
        private String url;

        public String toString() {
            return "Author Name = " + this.getName() + "\n" +
                    "Author Email = " + this.getEmail() + "\n" +
                    "Author Url = " + this.getUrl() + "\n";
        }

    }
