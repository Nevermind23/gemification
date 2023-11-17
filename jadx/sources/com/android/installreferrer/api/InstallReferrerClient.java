package com.android.installreferrer.api;

import android.content.Context;

public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    public static final class C2368b {

        /* renamed from: a */
        private final Context f7497a;

        /* renamed from: a */
        public InstallReferrerClient mo7634a() {
            Context context = this.f7497a;
            if (context != null) {
                return new C2369a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C2368b(Context context) {
            this.f7497a = context;
        }
    }

    /* renamed from: b */
    public static C2368b m9141b(Context context) {
        return new C2368b(context);
    }

    /* renamed from: a */
    public abstract ReferrerDetails mo7632a();

    /* renamed from: c */
    public abstract void mo7633c(InstallReferrerStateListener installReferrerStateListener);
}
