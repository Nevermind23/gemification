package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p248s7.C8253g;
import p248s7.C8263q;
import p248s7.C8264r;
import p248s7.C8265s;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
public final class C4691k3 {

    /* renamed from: b */
    protected static final AtomicReference f14560b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f14561c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f14562d = new AtomicReference();

    /* renamed from: a */
    private final C8253g f14563a;

    public C4691k3(C8253g gVar) {
        this.f14563a = gVar;
    }

    /* renamed from: g */
    private static final String m17857g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        C7264i.m27902k(strArr);
        C7264i.m27902k(strArr2);
        C7264i.m27902k(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo14525a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo14526b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo14526b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f14563a.mo14762a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo14529e(next));
            sb.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = mo14525a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo14525a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo14525a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo14527c(zzaw zzaw) {
        String str;
        if (!this.f14563a.mo14762a()) {
            return zzaw.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaw.f15105f);
        sb.append(",name=");
        sb.append(mo14528d(zzaw.f15103d));
        sb.append(",params=");
        zzau zzau = zzaw.f15104e;
        if (zzau == null) {
            str = null;
        } else if (!this.f14563a.mo14762a()) {
            str = zzau.toString();
        } else {
            str = mo14526b(zzau.mo14991x());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo14528d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f14563a.mo14762a()) {
            return str;
        }
        return m17857g(str, C8263q.f23463c, C8263q.f23461a, f14560b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo14529e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f14563a.mo14762a()) {
            return str;
        }
        return m17857g(str, C8264r.f23466b, C8264r.f23465a, f14561c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo14530f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f14563a.mo14762a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m17857g(str, C8265s.f23470b, C8265s.f23469a, f14562d);
        }
        return "experiment_id(" + str + ")";
    }
}
