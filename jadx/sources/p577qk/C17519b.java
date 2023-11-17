package p577qk;

import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import p241s0.C8095d;
import ue1.C43064a;

/* renamed from: qk.b */
public final /* synthetic */ class C17519b implements C8095d.C8097b, C41532h {

    /* renamed from: a */
    private final /* synthetic */ C43064a f49051a;

    public C17519b(C43064a aVar) {
        this.f49051a = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8095d.C8097b) || !(obj instanceof C41532h)) {
            return false;
        }
        return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
    }

    public final C41212c getFunctionDelegate() {
        return this.f49051a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
