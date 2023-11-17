package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.u5 */
final class C4432u5 extends C4365q6 {

    /* renamed from: a */
    private final Context f13727a;

    /* renamed from: b */
    private final C4162e7 f13728b;

    C4432u5(Context context, C4162e7 e7Var) {
        this.f13727a = context;
        this.f13728b = e7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo13492a() {
        return this.f13727a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4162e7 mo13493b() {
        return this.f13728b;
    }

    public final boolean equals(Object obj) {
        C4162e7 e7Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4365q6) {
            C4365q6 q6Var = (C4365q6) obj;
            if (!this.f13727a.equals(q6Var.mo13492a()) || ((e7Var = this.f13728b) != null ? !e7Var.equals(q6Var.mo13493b()) : q6Var.mo13493b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f13727a.hashCode() ^ 1000003;
        C4162e7 e7Var = this.f13728b;
        if (e7Var == null) {
            i = 0;
        } else {
            i = e7Var.hashCode();
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String obj = this.f13727a.toString();
        String valueOf = String.valueOf(this.f13728b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
