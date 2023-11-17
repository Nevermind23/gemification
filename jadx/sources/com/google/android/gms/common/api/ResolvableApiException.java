package com.google.android.gms.common.api;

import android.app.Activity;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    /* renamed from: c */
    public void mo11893c(Activity activity, int i) {
        mo11886a().mo11906s0(activity, i);
    }
}
