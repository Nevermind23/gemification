package ih1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: ih1.c */
public final class C41371c {

    /* renamed from: a */
    private final C43075l f97415a;

    public C41371c(C43075l lVar) {
        this.f97415a = lVar;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41371c) && C41536l.m120484d(this.f97415a, ((C41371c) obj).f97415a);
        }
        return true;
    }

    public int hashCode() {
        C43075l lVar = this.f97415a;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Callbacks(onClose=" + this.f97415a + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41371c(C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar);
    }
}
