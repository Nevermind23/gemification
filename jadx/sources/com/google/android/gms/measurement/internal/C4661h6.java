package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
final class C4661h6 implements C4774r9 {

    /* renamed from: a */
    final /* synthetic */ C4793t6 f14489a;

    C4661h6(C4793t6 t6Var) {
        this.f14489a = t6Var;
    }

    /* renamed from: a */
    public final void mo14453a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f14489a.mo14909t("auto", "_err", bundle, str);
        } else {
            this.f14489a.mo14907r("auto", "_err", bundle);
        }
    }
}
