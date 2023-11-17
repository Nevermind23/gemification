package dy0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;

/* renamed from: dy0.c */
public final class C31620c {

    /* renamed from: a */
    private final C21503d f78186a;

    public C31620c(C21503d dVar) {
        this.f78186a = dVar;
    }

    /* renamed from: a */
    public final C21503d mo72043a() {
        return this.f78186a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31620c) && C41536l.m120484d(this.f78186a, ((C31620c) obj).f78186a);
    }

    public int hashCode() {
        C21503d dVar = this.f78186a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public String toString() {
        C21503d dVar = this.f78186a;
        return "ScaStateResource(resource=" + dVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31620c(C21503d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dVar);
    }
}
