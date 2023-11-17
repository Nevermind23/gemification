package jw0;

import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: jw0.d */
public final class C36807d {

    /* renamed from: a */
    private final String f88784a;

    /* renamed from: b */
    private final String f88785b;

    public C36807d(String str, String str2) {
        C41536l.m120489i(str, "destination");
        C41536l.m120489i(str2, "errorInfo");
        this.f88784a = str;
        this.f88785b = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C36807d m109036b(C36807d dVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f88784a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f88785b;
        }
        return dVar.mo89714a(str, str2);
    }

    /* renamed from: a */
    public final C36807d mo89714a(String str, String str2) {
        C41536l.m120489i(str, "destination");
        C41536l.m120489i(str2, "errorInfo");
        return new C36807d(str, str2);
    }

    /* renamed from: c */
    public final String mo89715c() {
        return this.f88784a;
    }

    /* renamed from: d */
    public final String mo89716d() {
        return this.f88785b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36807d)) {
            return false;
        }
        C36807d dVar = (C36807d) obj;
        return C41536l.m120484d(this.f88784a, dVar.f88784a) && C41536l.m120484d(this.f88785b, dVar.f88785b);
    }

    public int hashCode() {
        return (this.f88784a.hashCode() * 31) + this.f88785b.hashCode();
    }

    public String toString() {
        String str = this.f88784a;
        String str2 = this.f88785b;
        return "DestinationInoutUiState(destination=" + str + ", errorInfo=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36807d(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C32343x.m95388F("text.p2p.payment.send.request.default.nomination", new Object[0]) : str, (i & 2) != 0 ? "" : str2);
    }
}
