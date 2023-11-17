package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
final class C4364q5 extends ContentObserver {
    C4364q5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C4398s5.f13659e.set(true);
    }
}
