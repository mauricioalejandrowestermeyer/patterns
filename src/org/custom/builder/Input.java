package org.custom.builder;

public interface Input {

    default void buildUpperLabel(String label) {

    }

    default void setMaxLength(long length) {

    }

    default void setValue(Object value) {

    }

    default void setWidth(long width) {

    }

    default void setHeight(long height) {

    }
}