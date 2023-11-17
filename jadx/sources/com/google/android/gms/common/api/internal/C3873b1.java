package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
public final class C3873b1 {

    /* renamed from: c */
    public static final Status f12347c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    final Set f12348a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C3870a1 f12349b = new C3870a1(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12020a(BasePendingResult basePendingResult) {
        this.f12348a.add(basePendingResult);
        basePendingResult.mo11980o(this.f12349b);
    }

    /* renamed from: b */
    public final void mo12021b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f12348a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo11980o((C3870a1) null);
            if (basePendingResult.mo11979n()) {
                this.f12348a.remove(basePendingResult);
            }
        }
    }
}
