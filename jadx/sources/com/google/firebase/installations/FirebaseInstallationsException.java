package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: d */
    private final C5278a f16893d;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    public enum C5278a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(C5278a aVar) {
        this.f16893d = aVar;
    }

    public FirebaseInstallationsException(String str, C5278a aVar) {
        super(str);
        this.f16893d = aVar;
    }
}
