package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {

    /* renamed from: d */
    private final Intent f12241d;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f12241d = intent;
    }
}
