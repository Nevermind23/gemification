package p341ge.bog.mobilebank.p975ui.activities;

import androidx.lifecycle.C1645y;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.activities.n1 */
final /* synthetic */ class C35449n1 implements C1645y, C41532h {

    /* renamed from: a */
    private final /* synthetic */ C43075l f85730a;

    C35449n1(C43075l lVar) {
        C41536l.m120489i(lVar, "function");
        this.f85730a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.f85730a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.f85730a.invoke(obj);
    }
}
