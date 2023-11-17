package p412en;

import androidx.lifecycle.C1645y;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: en.f0 */
final /* synthetic */ class C12526f0 implements C1645y, C41532h {

    /* renamed from: a */
    private final /* synthetic */ C43075l f37294a;

    C12526f0(C43075l lVar) {
        C41536l.m120489i(lVar, "function");
        this.f37294a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.f37294a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.f37294a.invoke(obj);
    }
}
