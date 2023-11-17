package p419fg;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.k */
public final class C12886k {

    /* renamed from: a */
    private final C12887l f38065a;

    /* renamed from: b */
    private final String f38066b;

    /* renamed from: c */
    private final Integer f38067c;

    public C12886k(C12887l lVar, String str, Integer num) {
        C41536l.m120489i(lVar, "type");
        this.f38065a = lVar;
        this.f38066b = str;
        this.f38067c = num;
    }

    /* renamed from: a */
    public final String mo33616a() {
        return this.f38066b;
    }

    /* renamed from: b */
    public final C12887l mo33617b() {
        return this.f38065a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12886k)) {
            return false;
        }
        C12886k kVar = (C12886k) obj;
        return this.f38065a == kVar.f38065a && C41536l.m120484d(this.f38066b, kVar.f38066b) && C41536l.m120484d(this.f38067c, kVar.f38067c);
    }

    public int hashCode() {
        int hashCode = this.f38065a.hashCode() * 31;
        String str = this.f38066b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f38067c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C12887l lVar = this.f38065a;
        String str = this.f38066b;
        Integer num = this.f38067c;
        return "Participant(type=" + lVar + ", nickname=" + str + ", participantId=" + num + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12886k(C12887l lVar, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
