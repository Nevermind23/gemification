package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
final class C4686j9 implements C4774r9 {

    /* renamed from: a */
    final /* synthetic */ C4719m9 f14546a;

    C4686j9(C4719m9 m9Var) {
        this.f14546a = m9Var;
    }

    /* renamed from: a */
    public final void mo14453a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C4719m9 m9Var = this.f14546a;
            if (m9Var.f14636l != null) {
                m9Var.f14636l.mo14551d().mo14675r().mo14616b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f14546a.mo14552f().mo14776z(new C4675i9(this, str, "_err", bundle));
    }
}
