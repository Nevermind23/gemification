package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import androidx.lifecycle.C1645y;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$sam$androidx_lifecycle_Observer$0 */
final class MoreFragment$sam$androidx_lifecycle_Observer$0 implements C1645y, C41532h {
    private final /* synthetic */ C43075l function;

    MoreFragment$sam$androidx_lifecycle_Observer$0(C43075l lVar) {
        C41536l.m120489i(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
