package p606sl;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sl.l */
public final class C17846l {

    /* renamed from: a */
    private final long f50827a;

    /* renamed from: b */
    private final long f50828b;

    /* renamed from: c */
    private final String f50829c;

    /* renamed from: d */
    private final String f50830d;

    /* renamed from: e */
    private final String f50831e;

    /* renamed from: f */
    private final String f50832f;

    public C17846l(long j, long j2, String str, String str2, String str3, String str4) {
        this.f50827a = j;
        this.f50828b = j2;
        this.f50829c = str;
        this.f50830d = str2;
        this.f50831e = str3;
        this.f50832f = str4;
    }

    /* renamed from: a */
    public final String mo45499a() {
        return this.f50830d;
    }

    /* renamed from: b */
    public final String mo45500b() {
        return this.f50829c;
    }

    /* renamed from: c */
    public final String mo45501c() {
        return this.f50832f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17846l)) {
            return false;
        }
        C17846l lVar = (C17846l) obj;
        return this.f50827a == lVar.f50827a && this.f50828b == lVar.f50828b && C41536l.m120484d(this.f50829c, lVar.f50829c) && C41536l.m120484d(this.f50830d, lVar.f50830d) && C41536l.m120484d(this.f50831e, lVar.f50831e) && C41536l.m120484d(this.f50832f, lVar.f50832f);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f50827a) * 31) + C7397t.m28148a(this.f50828b)) * 31;
        String str = this.f50829c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50830d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50831e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50832f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f50827a;
        long j2 = this.f50828b;
        String str = this.f50829c;
        String str2 = this.f50830d;
        String str3 = this.f50831e;
        String str4 = this.f50832f;
        return "BnplMerchantStore(merchantId=" + j + ", clientId=" + j2 + ", addressGE=" + str + ", addressEN=" + str2 + ", qrCode=" + str3 + ", qrSource=" + str4 + ")";
    }
}
