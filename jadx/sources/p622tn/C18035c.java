package p622tn;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: tn.c */
public final class C18035c {

    /* renamed from: a */
    private final String f51262a;

    /* renamed from: b */
    private final long f51263b;

    public C18035c(String str, long j) {
        C41536l.m120489i(str, "cardPan");
        this.f51262a = str;
        this.f51263b = j;
    }

    /* renamed from: a */
    public final long mo45736a() {
        return this.f51263b;
    }

    /* renamed from: b */
    public final String mo45737b() {
        return this.f51262a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18035c)) {
            return false;
        }
        C18035c cVar = (C18035c) obj;
        return C41536l.m120484d(this.f51262a, cVar.f51262a) && this.f51263b == cVar.f51263b;
    }

    public int hashCode() {
        return (this.f51262a.hashCode() * 31) + C7397t.m28148a(this.f51263b);
    }

    public String toString() {
        String str = this.f51262a;
        long j = this.f51263b;
        return "PlasticCardActivationActionSheetModel(cardPan=" + str + ", cardId=" + j + ")";
    }
}
