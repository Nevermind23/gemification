package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;
import p118i7.C6600k;
import p156l6.C6933c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.location.h */
final class C4080h extends C6600k {

    /* renamed from: b */
    private final C6933c f13090b;

    public C4080h(C6933c cVar) {
        boolean z;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "listener can't be null.");
        this.f13090b = cVar;
    }

    /* renamed from: X */
    public final void mo12800X(LocationSettingsResult locationSettingsResult) {
        this.f13090b.mo19853a(locationSettingsResult);
    }
}
