package py0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: py0.d */
public final class C38050d {

    /* renamed from: a */
    private final String f91418a;

    /* renamed from: b */
    private final String f91419b;

    public C38050d(String str, String str2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C41536l.m120489i(str2, "dictionaryKey");
        this.f91418a = str;
        this.f91419b = str2;
    }

    /* renamed from: a */
    public final String mo91455a() {
        return this.f91419b;
    }

    /* renamed from: b */
    public final String mo91456b() {
        return this.f91418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38050d)) {
            return false;
        }
        C38050d dVar = (C38050d) obj;
        return C41536l.m120484d(this.f91418a, dVar.f91418a) && C41536l.m120484d(this.f91419b, dVar.f91419b);
    }

    public int hashCode() {
        return (this.f91418a.hashCode() * 31) + this.f91419b.hashCode();
    }

    public String toString() {
        String str = this.f91418a;
        String str2 = this.f91419b;
        return "DepositProlongationWithdrawalType(value=" + str + ", dictionaryKey=" + str2 + ")";
    }
}
