package p936wv;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: wv.a */
public final class C29575a {

    /* renamed from: a */
    private final Long f74699a;

    /* renamed from: b */
    private final long f74700b;

    /* renamed from: c */
    private final Long f74701c;

    /* renamed from: d */
    private final String f74702d;

    /* renamed from: e */
    private final Boolean f74703e;

    /* renamed from: f */
    private final String f74704f;

    /* renamed from: g */
    private final String f74705g;

    /* renamed from: h */
    private final BigDecimal f74706h;

    /* renamed from: i */
    private final BigDecimal f74707i;

    /* renamed from: j */
    private final Integer f74708j;

    public C29575a(Long l, long j, Long l2, String str, Boolean bool, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "nameKey");
        C41536l.m120489i(bigDecimal, "spent");
        C41536l.m120489i(bigDecimal2, C11755a.C11756a.f34100b);
        this.f74699a = l;
        this.f74700b = j;
        this.f74701c = l2;
        this.f74702d = str;
        this.f74703e = bool;
        this.f74704f = str2;
        this.f74705g = str3;
        this.f74706h = bigDecimal;
        this.f74707i = bigDecimal2;
        this.f74708j = num;
    }

    /* renamed from: a */
    public final long mo69420a() {
        return this.f74700b;
    }

    /* renamed from: b */
    public final String mo69421b() {
        return this.f74702d;
    }

    /* renamed from: c */
    public final Long mo69422c() {
        return this.f74699a;
    }

    /* renamed from: d */
    public final String mo69423d() {
        return this.f74704f;
    }

    /* renamed from: e */
    public final Integer mo69424e() {
        return this.f74708j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29575a)) {
            return false;
        }
        C29575a aVar = (C29575a) obj;
        return C41536l.m120484d(this.f74699a, aVar.f74699a) && this.f74700b == aVar.f74700b && C41536l.m120484d(this.f74701c, aVar.f74701c) && C41536l.m120484d(this.f74702d, aVar.f74702d) && C41536l.m120484d(this.f74703e, aVar.f74703e) && C41536l.m120484d(this.f74704f, aVar.f74704f) && C41536l.m120484d(this.f74705g, aVar.f74705g) && C41536l.m120484d(this.f74706h, aVar.f74706h) && C41536l.m120484d(this.f74707i, aVar.f74707i) && C41536l.m120484d(this.f74708j, aVar.f74708j);
    }

    /* renamed from: f */
    public final Long mo69426f() {
        return this.f74701c;
    }

    /* renamed from: g */
    public final String mo69427g() {
        return this.f74705g;
    }

    /* renamed from: h */
    public final BigDecimal mo69428h() {
        return this.f74706h;
    }

    public int hashCode() {
        Long l = this.f74699a;
        int i = 0;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.f74700b)) * 31;
        Long l2 = this.f74701c;
        int hashCode2 = (((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f74702d.hashCode()) * 31;
        Boolean bool = this.f74703e;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.f74704f.hashCode()) * 31;
        String str = this.f74705g;
        int hashCode4 = (((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f74706h.hashCode()) * 31) + this.f74707i.hashCode()) * 31;
        Integer num = this.f74708j;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final BigDecimal mo69430i() {
        return this.f74707i;
    }

    /* renamed from: j */
    public final Boolean mo69431j() {
        return this.f74703e;
    }

    public String toString() {
        Long l = this.f74699a;
        long j = this.f74700b;
        Long l2 = this.f74701c;
        String str = this.f74702d;
        Boolean bool = this.f74703e;
        String str2 = this.f74704f;
        String str3 = this.f74705g;
        BigDecimal bigDecimal = this.f74706h;
        BigDecimal bigDecimal2 = this.f74707i;
        Integer num = this.f74708j;
        return "Budget(id=" + l + ", catId=" + j + ", parentCatId=" + l2 + ", color=" + str + ", isCatIncome=" + bool + ", nameKey=" + str2 + ", parentCatNameKey=" + str3 + ", spent=" + bigDecimal + ", value=" + bigDecimal2 + ", orderNo=" + num + ")";
    }
}
