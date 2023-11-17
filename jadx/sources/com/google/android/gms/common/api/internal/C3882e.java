package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C3877d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.e */
public class C3882e {

    /* renamed from: a */
    private final Set f12380a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static C3877d m14699a(Object obj, Looper looper, String str) {
        C7264i.m27903l(obj, "Listener must not be null");
        C7264i.m27903l(looper, "Looper must not be null");
        C7264i.m27903l(str, "Listener type must not be null");
        return new C3877d(looper, obj, str);
    }

    /* renamed from: b */
    public static C3877d.C3878a m14700b(Object obj, String str) {
        C7264i.m27903l(obj, "Listener must not be null");
        C7264i.m27903l(str, "Listener type must not be null");
        C7264i.m27899h(str, "Listener type must not be empty");
        return new C3877d.C3878a(obj, str);
    }

    /* renamed from: c */
    public final void mo12054c() {
        for (C3877d a : this.f12380a) {
            a.mo12041a();
        }
        this.f12380a.clear();
    }
}
