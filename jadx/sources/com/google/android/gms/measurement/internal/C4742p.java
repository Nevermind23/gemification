package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C4742p {

    /* renamed from: a */
    final String f14704a;

    /* renamed from: b */
    final String f14705b;

    /* renamed from: c */
    final String f14706c;

    /* renamed from: d */
    final long f14707d;

    /* renamed from: e */
    final long f14708e;

    /* renamed from: f */
    final zzau f14709f;

    C4742p(C4791t4 t4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        C7264i.m27898g(str2);
        C7264i.m27898g(str3);
        this.f14704a = str2;
        this.f14705b = str3;
        this.f14706c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14707d = j;
        this.f14708e = j2;
        if (j2 != 0 && j2 > j) {
            t4Var.mo14551d().mo14680w().mo14616b("Event created with reverse previous/current timestamps. appId", C4746p3.m18094z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    t4Var.mo14551d().mo14675r().mo14615a("Param name can't be null");
                    it.remove();
                } else {
                    Object o = t4Var.mo14856N().mo14822o(next, bundle2.get(next));
                    if (o == null) {
                        t4Var.mo14551d().mo14680w().mo14616b("Param value can't be null", t4Var.mo14847D().mo14529e(next));
                        it.remove();
                    } else {
                        t4Var.mo14856N().mo14796D(bundle2, next, o);
                    }
                }
            }
            zzau = new zzau(bundle2);
        }
        this.f14709f = zzau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4742p mo14670a(C4791t4 t4Var, long j) {
        return new C4742p(t4Var, this.f14706c, this.f14704a, this.f14705b, this.f14707d, j, this.f14709f);
    }

    public final String toString() {
        String str = this.f14704a;
        String str2 = this.f14705b;
        String obj = this.f14709f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    private C4742p(C4791t4 t4Var, String str, String str2, String str3, long j, long j2, zzau zzau) {
        C7264i.m27898g(str2);
        C7264i.m27898g(str3);
        C7264i.m27902k(zzau);
        this.f14704a = str2;
        this.f14705b = str3;
        this.f14706c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14707d = j;
        this.f14708e = j2;
        if (j2 != 0 && j2 > j) {
            t4Var.mo14551d().mo14680w().mo14617c("Event created with reverse previous/current timestamps. appId, name", C4746p3.m18094z(str2), C4746p3.m18094z(str3));
        }
        this.f14709f = zzau;
    }
}
