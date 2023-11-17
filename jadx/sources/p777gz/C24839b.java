package p777gz;

import kotlin.jvm.internal.C41536l;

/* renamed from: gz.b */
public final class C24839b {

    /* renamed from: a */
    private final String f63765a;

    /* renamed from: b */
    private final String f63766b;

    /* renamed from: c */
    private final Object f63767c;

    /* renamed from: d */
    private final Object f63768d;

    /* renamed from: e */
    private final Boolean f63769e;

    /* renamed from: f */
    private final Object f63770f;

    public C24839b(String str, String str2, Object obj, Object obj2, Boolean bool, Object obj3) {
        C41536l.m120489i(str, "code");
        C41536l.m120489i(str2, "caption");
        this.f63765a = str;
        this.f63766b = str2;
        this.f63767c = obj;
        this.f63768d = obj2;
        this.f63769e = bool;
        this.f63770f = obj3;
    }

    /* renamed from: a */
    public final String mo63257a() {
        return this.f63766b;
    }

    /* renamed from: b */
    public final String mo63258b() {
        return this.f63765a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24839b)) {
            return false;
        }
        C24839b bVar = (C24839b) obj;
        return C41536l.m120484d(this.f63765a, bVar.f63765a) && C41536l.m120484d(this.f63766b, bVar.f63766b) && C41536l.m120484d(this.f63767c, bVar.f63767c) && C41536l.m120484d(this.f63768d, bVar.f63768d) && C41536l.m120484d(this.f63769e, bVar.f63769e) && C41536l.m120484d(this.f63770f, bVar.f63770f);
    }

    public int hashCode() {
        int hashCode = ((this.f63765a.hashCode() * 31) + this.f63766b.hashCode()) * 31;
        Object obj = this.f63767c;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f63768d;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Boolean bool = this.f63769e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj3 = this.f63770f;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f63765a;
        String str2 = this.f63766b;
        Object obj = this.f63767c;
        Object obj2 = this.f63768d;
        Boolean bool = this.f63769e;
        Object obj3 = this.f63770f;
        return "MoneyTransferCountry(code=" + str + ", caption=" + str2 + ", deliveryOptions=" + obj + ", currencies=" + obj2 + ", receiveAllowed=" + bool + ", states=" + obj3 + ")";
    }
}
