package androidx.fragment.app;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import ue1.C43079p;

/* renamed from: androidx.fragment.app.o */
public abstract class C1533o {
    /* renamed from: b */
    public static final void m5445b(Fragment fragment, String str, Bundle bundle) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "result");
        fragment.getParentFragmentManager().mo4364E1(str, bundle);
    }

    /* renamed from: c */
    public static final void m5446c(Fragment fragment, String str, C43079p pVar) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(pVar, "listener");
        fragment.getParentFragmentManager().mo4367F1(str, fragment, new C1531n(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m5447d(C43079p pVar, String str, Bundle bundle) {
        C41536l.m120489i(pVar, "$tmp0");
        C41536l.m120489i(str, "p0");
        C41536l.m120489i(bundle, "p1");
        pVar.invoke(str, bundle);
    }
}
