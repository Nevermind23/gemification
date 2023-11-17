package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.u */
public final class C17104u {

    /* renamed from: a */
    private final String f47894a;

    /* renamed from: b */
    private final String f47895b;

    public C17104u(String str, String str2) {
        C41536l.m120489i(str, "cardNickname");
        C41536l.m120489i(str2, "clientNickname");
        this.f47894a = str;
        this.f47895b = str2;
    }

    /* renamed from: a */
    public final String mo44491a() {
        return this.f47894a;
    }

    /* renamed from: b */
    public final String mo44492b() {
        return this.f47895b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17104u)) {
            return false;
        }
        C17104u uVar = (C17104u) obj;
        return C41536l.m120484d(this.f47894a, uVar.f47894a) && C41536l.m120484d(this.f47895b, uVar.f47895b);
    }

    public int hashCode() {
        return (this.f47894a.hashCode() * 31) + this.f47895b.hashCode();
    }

    public String toString() {
        String str = this.f47894a;
        String str2 = this.f47895b;
        return "DebitCardNickname(cardNickname=" + str + ", clientNickname=" + str2 + ")";
    }
}
