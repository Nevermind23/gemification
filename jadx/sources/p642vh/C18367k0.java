package p642vh;

import af1.C40303i;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C41536l;

/* renamed from: vh.k0 */
public final class C18367k0 {

    /* renamed from: a */
    private WeakReference f51822a;

    /* renamed from: a */
    public final Object mo46152a(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        WeakReference weakReference = this.f51822a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo46153b(Object obj, C40303i iVar, Object obj2) {
        WeakReference weakReference;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (obj2 != null) {
            weakReference = new WeakReference(obj2);
        } else {
            weakReference = null;
        }
        this.f51822a = weakReference;
    }
}
