package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import b41.C31128a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33326b;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.f */
final class C33337f {

    /* renamed from: a */
    private final C33326b.C33329c f81461a;

    /* renamed from: b */
    private final C31128a f81462b;

    public C33337f(C33326b.C33329c cVar, C31128a aVar) {
        this.f81461a = cVar;
        this.f81462b = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C33337f m98013b(C33337f fVar, C33326b.C33329c cVar, C31128a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = fVar.f81461a;
        }
        if ((i & 2) != 0) {
            aVar = fVar.f81462b;
        }
        return fVar.mo79148a(cVar, aVar);
    }

    /* renamed from: a */
    public final C33337f mo79148a(C33326b.C33329c cVar, C31128a aVar) {
        return new C33337f(cVar, aVar);
    }

    /* renamed from: c */
    public final C31128a mo79149c() {
        return this.f81462b;
    }

    /* renamed from: d */
    public final C33326b.C33329c mo79150d() {
        return this.f81461a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33337f)) {
            return false;
        }
        C33337f fVar = (C33337f) obj;
        return C41536l.m120484d(this.f81461a, fVar.f81461a) && C41536l.m120484d(this.f81462b, fVar.f81462b);
    }

    public int hashCode() {
        C33326b.C33329c cVar = this.f81461a;
        int i = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        C31128a aVar = this.f81462b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C33326b.C33329c cVar = this.f81461a;
        C31128a aVar = this.f81462b;
        return "ViewState(header=" + cVar + ", accountsResult=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33337f(C33326b.C33329c cVar, C31128a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar);
    }
}
