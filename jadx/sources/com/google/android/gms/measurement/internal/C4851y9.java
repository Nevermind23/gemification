package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.medallia.digital.mobilesdk.C10749b8;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
public final class C4851y9 {

    /* renamed from: a */
    private final C4791t4 f15057a;

    public C4851y9(C4791t4 t4Var) {
        this.f15057a = t4Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14969a(String str, Bundle bundle) {
        String str2;
        this.f15057a.mo14552f().mo14554h();
        if (!this.f15057a.mo14869o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f15057a.mo14849F().f14278v.mo14320b(str2);
                this.f15057a.mo14849F().f14279w.mo14296b(this.f15057a.mo14548a().mo23594a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14970b() {
        String str;
        this.f15057a.mo14552f().mo14554h();
        if (mo14972d()) {
            if (mo14973e()) {
                this.f15057a.mo14849F().f14278v.mo14320b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f15057a.mo14851I().mo14910u("auto", "_cmpx", bundle);
            } else {
                String a = this.f15057a.mo14849F().f14278v.mo14319a();
                if (TextUtils.isEmpty(a)) {
                    this.f15057a.mo14551d().mo14677t().mo14615a("Cache still valid but referrer not found");
                } else {
                    long a2 = this.f15057a.mo14849F().f14279w.mo14295a() / C10749b8.C10751b.f30744c;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a2 - 1) * C10749b8.C10751b.f30744c);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f15057a.mo14851I().mo14910u(str, "_cmp", (Bundle) pair.second);
                }
                this.f15057a.mo14849F().f14278v.mo14320b((String) null);
            }
            this.f15057a.mo14849F().f14279w.mo14296b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14971c() {
        if (mo14972d() && mo14973e()) {
            this.f15057a.mo14849F().f14278v.mo14320b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo14972d() {
        return this.f15057a.mo14849F().f14279w.mo14295a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo14973e() {
        if (mo14972d() && this.f15057a.mo14548a().mo23594a() - this.f15057a.mo14849F().f14279w.mo14295a() > this.f15057a.mo14876z().mo14412r((String) null, C4636f3.f14354U)) {
            return true;
        }
        return false;
    }
}
