package androidx.core.p016os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.core.os.d */
final class C0907d {

    /* renamed from: a */
    public static final C0907d f3534a = new C0907d();

    private C0907d() {
    }

    /* renamed from: a */
    public static final void m3333a(Bundle bundle, String str, Size size) {
        C41536l.m120489i(bundle, "bundle");
        C41536l.m120489i(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m3334b(Bundle bundle, String str, SizeF sizeF) {
        C41536l.m120489i(bundle, "bundle");
        C41536l.m120489i(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
