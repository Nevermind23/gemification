package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.l */
final class C3844l extends C3843k {
    C3844l(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11840a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo11843d(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11841b() {
        return false;
    }
}
