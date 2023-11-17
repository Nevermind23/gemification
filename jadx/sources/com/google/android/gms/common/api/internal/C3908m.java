package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p337z7.C9227g;
import p342j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.common.api.internal.m */
public final class C3908m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f12482a = DesugarCollections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f12483b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m14828h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f12482a) {
            hashMap = new HashMap(this.f12482a);
        }
        synchronized (this.f12483b) {
            hashMap2 = new HashMap(this.f12483b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo11974f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C9227g) entry2.getKey()).mo24886d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12114c(BasePendingResult basePendingResult, boolean z) {
        this.f12482a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo11970b(new C3902k(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12115d(C9227g gVar, boolean z) {
        this.f12483b.put(gVar, Boolean.valueOf(z));
        gVar.mo24883a().mo24858c(new C3905l(this, gVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12116e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m14828h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo12117f() {
        m14828h(false, C3874c.f12350r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo12118g() {
        return !this.f12482a.isEmpty() || !this.f12483b.isEmpty();
    }
}
