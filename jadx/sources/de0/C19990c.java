package de0;

import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import g91.C32297d;
import kotlin.jvm.internal.C41536l;

/* renamed from: de0.c */
public final class C19990c extends C19983b {

    /* renamed from: c */
    private final Fragment f54585c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19990c(androidx.fragment.app.Fragment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "fragment.resources"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f54585c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de0.C19990c.<init>(androidx.fragment.app.Fragment):void");
    }

    /* renamed from: e */
    public String mo48348e() {
        String simpleName = this.f54585c.getClass().getSimpleName();
        C41536l.m120488h(simpleName, "fragment.javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: g */
    public void mo48349g(String str) {
        C41536l.m120489i(str, "text");
        Fragment fragment = this.f54585c;
        if (fragment instanceof C1483c) {
            C32297d.m95156d((C1483c) fragment, str);
        } else {
            C32297d.m95154b(fragment.requireActivity(), str);
        }
    }
}
