package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.pf */
public final class C4357pf extends C4239j {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4507ye f13592f;

    public C4357pf(C4507ye yeVar) {
        super("internal.logger");
        this.f13592f = yeVar;
        this.f13360e.put("log", new C4340of(this, false, true));
        this.f13360e.put("silent", new C4473wc(this, "silent"));
        ((C4239j) this.f13360e.get("silent")).mo13082i("log", new C4340of(this, true, true));
        this.f13360e.put("unmonitored", new C4490xd(this, "unmonitored"));
        ((C4239j) this.f13360e.get("unmonitored")).mo13082i("log", new C4340of(this, false, false));
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        return C4358q.f13593U2;
    }
}
