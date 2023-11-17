package de0;

import android.app.Activity;
import g91.C32297d;
import kotlin.jvm.internal.C41536l;

/* renamed from: de0.a */
public final class C19982a extends C19983b {

    /* renamed from: c */
    private final Activity f54576c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19982a(android.app.Activity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "activity.resources"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f54576c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de0.C19982a.<init>(android.app.Activity):void");
    }

    /* renamed from: e */
    public String mo48348e() {
        String simpleName = this.f54576c.getClass().getSimpleName();
        C41536l.m120488h(simpleName, "activity.javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: g */
    public void mo48349g(String str) {
        C41536l.m120489i(str, "text");
        C32297d.m95154b(this.f54576c, str);
    }
}
