package androidx.core.p016os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.core.os.c */
final class C0906c {

    /* renamed from: a */
    public static final C0906c f3533a = new C0906c();

    private C0906c() {
    }

    /* renamed from: a */
    public static final void m3332a(Bundle bundle, String str, IBinder iBinder) {
        C41536l.m120489i(bundle, "bundle");
        C41536l.m120489i(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
