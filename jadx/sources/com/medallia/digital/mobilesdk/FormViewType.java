package com.medallia.digital.mobilesdk;

public enum FormViewType {
    full,
    modal,
    none;

    protected static FormViewType fromString(String str) {
        FormViewType formViewType = modal;
        if (formViewType.name().equals(str)) {
            return formViewType;
        }
        FormViewType formViewType2 = full;
        return formViewType2.name().equals(str) ? formViewType2 : none;
    }
}
