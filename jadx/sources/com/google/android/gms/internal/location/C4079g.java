package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p118i7.C6595f;
import p156l6.C6933c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.location.g */
final class C4079g extends C6595f {

    /* renamed from: b */
    private final C6933c f13089b;

    public C4079g(C6933c cVar) {
        boolean z;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "listener can't be null.");
        this.f13089b = cVar;
    }

    /* renamed from: x */
    private final void m15439x(int i) {
        C6933c cVar = this.f13089b;
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        cVar.mo19853a(new Status(i));
    }

    /* renamed from: H0 */
    public final void mo12797H0(int i, PendingIntent pendingIntent) {
        m15439x(i);
    }

    /* renamed from: a0 */
    public final void mo12798a0(int i, String[] strArr) {
        m15439x(i);
    }

    /* renamed from: y2 */
    public final void mo12799y2(int i, String[] strArr) {
        m15439x(i);
    }
}
