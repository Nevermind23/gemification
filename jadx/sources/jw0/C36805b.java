package jw0;

import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: jw0.b */
public final class C36805b {

    /* renamed from: a */
    private final String f88776a;

    /* renamed from: b */
    private final boolean f88777b;

    public C36805b(String str, boolean z) {
        C41536l.m120489i(str, "name");
        this.f88776a = str;
        this.f88777b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C36805b m109026b(C36805b bVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f88776a;
        }
        if ((i & 2) != 0) {
            z = bVar.f88777b;
        }
        return bVar.mo89699a(str, z);
    }

    /* renamed from: a */
    public final C36805b mo89699a(String str, boolean z) {
        C41536l.m120489i(str, "name");
        return new C36805b(str, z);
    }

    /* renamed from: c */
    public final String mo89700c() {
        return this.f88776a;
    }

    /* renamed from: d */
    public final boolean mo89701d() {
        return this.f88777b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36805b)) {
            return false;
        }
        C36805b bVar = (C36805b) obj;
        return C41536l.m120484d(this.f88776a, bVar.f88776a) && this.f88777b == bVar.f88777b;
    }

    public int hashCode() {
        int hashCode = this.f88776a.hashCode() * 31;
        boolean z = this.f88777b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f88776a;
        boolean z = this.f88777b;
        return "ButtonUiState(name=" + str + ", isButtonProcessed=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36805b(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C32343x.m95388F("text.p2p.payment.send.request.next.btn", new Object[0]) : str, (i & 2) != 0 ? false : z);
    }
}
