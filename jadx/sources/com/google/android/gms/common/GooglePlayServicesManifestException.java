package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: d */
    private final int f12238d;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.f12238d = i;
    }
}
