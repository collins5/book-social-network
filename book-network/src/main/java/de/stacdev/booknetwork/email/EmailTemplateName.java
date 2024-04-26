package de.stacdev.booknetwork.email;

import lombok.Getter;

/**
 * @author Collins Souop
 */
@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account");
    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
