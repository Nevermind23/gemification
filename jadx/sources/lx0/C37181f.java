package lx0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: lx0.f */
public final class C37181f {

    /* renamed from: a */
    private final Integer f89547a;

    /* renamed from: b */
    private final String f89548b;

    /* renamed from: c */
    private final Boolean f89549c;

    /* renamed from: d */
    private final String f89550d;

    /* renamed from: e */
    private final C37182g f89551e;

    /* renamed from: f */
    private final String f89552f;

    /* renamed from: g */
    private final String f89553g;

    /* renamed from: h */
    private final List f89554h;

    public C37181f(Integer num, String str, Boolean bool, String str2, C37182g gVar, String str3, String str4, List list) {
        this.f89547a = num;
        this.f89548b = str;
        this.f89549c = bool;
        this.f89550d = str2;
        this.f89551e = gVar;
        this.f89552f = str3;
        this.f89553g = str4;
        this.f89554h = list;
    }

    /* renamed from: a */
    public final List mo90195a() {
        return this.f89554h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37181f)) {
            return false;
        }
        C37181f fVar = (C37181f) obj;
        return C41536l.m120484d(this.f89547a, fVar.f89547a) && C41536l.m120484d(this.f89548b, fVar.f89548b) && C41536l.m120484d(this.f89549c, fVar.f89549c) && C41536l.m120484d(this.f89550d, fVar.f89550d) && C41536l.m120484d(this.f89551e, fVar.f89551e) && C41536l.m120484d(this.f89552f, fVar.f89552f) && C41536l.m120484d(this.f89553g, fVar.f89553g) && C41536l.m120484d(this.f89554h, fVar.f89554h);
    }

    public int hashCode() {
        Integer num = this.f89547a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f89548b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f89549c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f89550d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C37182g gVar = this.f89551e;
        int hashCode5 = (hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str3 = this.f89552f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89553g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f89554h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Integer num = this.f89547a;
        String str = this.f89548b;
        Boolean bool = this.f89549c;
        String str2 = this.f89550d;
        C37182g gVar = this.f89551e;
        String str3 = this.f89552f;
        String str4 = this.f89553g;
        List list = this.f89554h;
        return "PaymentResponse(addBonusAmount=" + num + ", offloadingContractType=" + str + ", offloadingContract=" + bool + ", offloadingKey=" + str2 + ", campaignPrize=" + gVar + ", offloadingPrizeCcy=" + str3 + ", offloadingPrize=" + str4 + ", executeResult=" + list + ")";
    }
}
