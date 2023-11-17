package androidx.lifecycle;

import androidx.lifecycle.C1620q0;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;

/* renamed from: androidx.lifecycle.r0 */
public abstract /* synthetic */ class C1630r0 {
    /* renamed from: a */
    public static C1613n0 m5684a(C1620q0.C1624b bVar, Class cls) {
        C41536l.m120489i(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static C1613n0 m5685b(C1620q0.C1624b bVar, Class cls, C7047a aVar) {
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(aVar, "extras");
        return bVar.mo4804b(cls);
    }
}
