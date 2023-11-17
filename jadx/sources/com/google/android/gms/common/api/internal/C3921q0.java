package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import p156l6.C6931b;
import p156l6.C6969u;
import p182n6.C7258g;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
final class C3921q0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6931b f12513a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Feature f12514b;

    /* synthetic */ C3921q0(C6931b bVar, Feature feature, C6969u uVar) {
        this.f12513a = bVar;
        this.f12514b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3921q0)) {
            C3921q0 q0Var = (C3921q0) obj;
            if (!C7258g.m27880a(this.f12513a, q0Var.f12513a) || !C7258g.m27880a(this.f12514b, q0Var.f12514b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f12513a, this.f12514b);
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("key", this.f12513a).mo21632a("feature", this.f12514b).toString();
    }
}
