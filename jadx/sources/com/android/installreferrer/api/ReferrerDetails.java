package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {

    /* renamed from: a */
    private final Bundle f7498a;

    public ReferrerDetails(Bundle bundle) {
        this.f7498a = bundle;
    }

    /* renamed from: a */
    public String mo7637a() {
        return this.f7498a.getString("install_referrer");
    }
}
