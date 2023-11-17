package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: d */
    private final Feature f12264d;

    public UnsupportedApiCallException(Feature feature) {
        this.f12264d = feature;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f12264d));
    }
}
