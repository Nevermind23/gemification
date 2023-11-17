package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p156l6.C6971w;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
final class C3904k1 extends C6971w {

    /* renamed from: a */
    final /* synthetic */ Dialog f12475a;

    /* renamed from: b */
    final /* synthetic */ C3907l1 f12476b;

    C3904k1(C3907l1 l1Var, Dialog dialog) {
        this.f12476b = l1Var;
        this.f12475a = dialog;
    }

    /* renamed from: a */
    public final void mo12062a() {
        this.f12476b.f12481e.m14835o();
        if (this.f12475a.isShowing()) {
            this.f12475a.dismiss();
        }
    }
}
