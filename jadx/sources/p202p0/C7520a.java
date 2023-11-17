package p202p0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;

/* renamed from: p0.a */
public final class C7520a implements C7593r {

    /* renamed from: a */
    private final int f21960a;

    /* renamed from: b */
    private final Bundle f21961b = new Bundle();

    public C7520a(int i) {
        this.f21960a = i;
    }

    /* renamed from: a */
    public int mo22014a() {
        return this.f21960a;
    }

    /* renamed from: b */
    public Bundle mo22015b() {
        return this.f21961b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C41536l.m120484d(C7520a.class, obj.getClass())) {
            return false;
        }
        if (mo22014a() == ((C7520a) obj).mo22014a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + mo22014a();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + mo22014a() + ')';
    }
}
