package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.j */
final class C3842j extends C3843k {
    C3842j(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11840a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo11843d((Object) null);
        } else {
            mo11842c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11841b() {
        return true;
    }
}
