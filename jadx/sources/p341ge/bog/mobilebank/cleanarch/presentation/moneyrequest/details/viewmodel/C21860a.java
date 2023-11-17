package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel;

import androidx.lifecycle.C1645y;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.a */
final /* synthetic */ class C21860a implements C1645y, C41532h {

    /* renamed from: a */
    private final /* synthetic */ C43075l f58273a;

    C21860a(C43075l lVar) {
        C41536l.m120489i(lVar, "function");
        this.f58273a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.f58273a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.f58273a.invoke(obj);
    }
}
