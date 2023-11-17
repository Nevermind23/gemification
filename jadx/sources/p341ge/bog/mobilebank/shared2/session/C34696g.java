package p341ge.bog.mobilebank.shared2.session;

import androidx.lifecycle.C1645y;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.shared2.session.g */
final /* synthetic */ class C34696g implements C1645y, C41532h {

    /* renamed from: a */
    private final /* synthetic */ C43075l f83868a;

    C34696g(C43075l lVar) {
        C41536l.m120489i(lVar, "function");
        this.f83868a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.f83868a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.f83868a.invoke(obj);
    }
}
