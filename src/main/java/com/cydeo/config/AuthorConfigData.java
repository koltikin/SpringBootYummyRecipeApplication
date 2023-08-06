package com.cydeo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

    @Data // should use @Data otherwise does not work;
    @Configuration
    @ConfigurationProperties(prefix = "author")// prefix must be lowercase

    public class AuthorConfigData {
        private String Name; // private String AuthorName dot allowed, should be the same after prefix
        private String Email;
        private String url;

        public String toString() {
            return "Author Name = " + this.getName() + "\n" +
                    "Author Email = " + this.getEmail() + "\n" +
                    "Author Url = " + this.getUrl() + "\n";
        }
    }
