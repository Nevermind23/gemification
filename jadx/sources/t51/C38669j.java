package t51;

import b50.C19335b;
import b50.C19336c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: t51.j */
public final class C38669j implements C38670k {

    /* renamed from: a */
    private final String f92547a;

    /* renamed from: b */
    private final String f92548b;

    /* renamed from: c */
    private final String f92549c;

    /* renamed from: d */
    private final Integer f92550d;

    /* renamed from: e */
    private final C19336c f92551e;

    /* renamed from: f */
    private final BigDecimal f92552f;

    /* renamed from: g */
    private final C19335b f92553g;

    /* renamed from: h */
    private final long f92554h;

    /* renamed from: i */
    private final String f92555i;

    /* renamed from: j */
    private final boolean f92556j;

    /* renamed from: k */
    private final AccountOperation f92557k;

    public C38669j(String str, String str2, String str3, Integer num, C19336c cVar, BigDecimal bigDecimal, C19335b bVar, long j, String str4, boolean z, AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "accountOperation");
        this.f92547a = str;
        this.f92548b = str2;
        this.f92549c = str3;
        this.f92550d = num;
        this.f92551e = cVar;
        this.f92552f = bigDecimal;
        this.f92553g = bVar;
        this.f92554h = j;
        this.f92555i = str4;
        this.f92556j = z;
        this.f92557k = accountOperation;
    }

    /* renamed from: a */
    public final AccountOperation mo92316a() {
        return this.f92557k;
    }

    /* renamed from: b */
    public final Integer mo92317b() {
        return this.f92550d;
    }

    /* renamed from: c */
    public final boolean mo92318c() {
        return this.f92556j;
    }

    /* renamed from: d */
    public final long mo92319d() {
        return this.f92554h;
    }

    /* renamed from: e */
    public final C19336c mo92320e() {
        return this.f92551e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38669j)) {
            return false;
        }
        C38669j jVar = (C38669j) obj;
        return C41536l.m120484d(this.f92547a, jVar.f92547a) && C41536l.m120484d(this.f92548b, jVar.f92548b) && C41536l.m120484d(this.f92549c, jVar.f92549c) && C41536l.m120484d(this.f92550d, jVar.f92550d) && this.f92551e == jVar.f92551e && C41536l.m120484d(this.f92552f, jVar.f92552f) && this.f92553g == jVar.f92553g && this.f92554h == jVar.f92554h && C41536l.m120484d(this.f92555i, jVar.f92555i) && this.f92556j == jVar.f92556j && C41536l.m120484d(this.f92557k, jVar.f92557k);
    }

    /* renamed from: f */
    public final BigDecimal mo92322f() {
        return this.f92552f;
    }

    /* renamed from: g */
    public final C19335b mo92323g() {
        return this.f92553g;
    }

    /* renamed from: h */
    public final String mo92324h() {
        return this.f92555i;
    }

    public int hashCode() {
        String str = this.f92547a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92548b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92549c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f92550d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        C19336c cVar = this.f92551e;
        int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f92552f;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        C19335b bVar = this.f92553g;
        int hashCode7 = (((hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31) + C7397t.m28148a(this.f92554h)) * 31;
        String str4 = this.f92555i;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.f92556j;
        if (z) {
            z = true;
        }
        return ((i2 + (z ? 1 : 0)) * 31) + this.f92557k.hashCode();
    }

    public String toString() {
        String str = this.f92547a;
        String str2 = this.f92548b;
        String str3 = this.f92549c;
        Integer num = this.f92550d;
        C19336c cVar = this.f92551e;
        BigDecimal bigDecimal = this.f92552f;
        C19335b bVar = this.f92553g;
        long j = this.f92554h;
        String str4 = this.f92555i;
        boolean z = this.f92556j;
        AccountOperation accountOperation = this.f92557k;
        return "RegularItem(title=" + str + ", subtitle=" + str2 + ", amount=" + str3 + ", amountColor=" + num + ", sign=" + cVar + ", subamount=" + bigDecimal + ", subamountType=" + bVar + ", date=" + j + ", url=" + str4 + ", applyTint=" + z + ", accountOperation=" + accountOperation + ")";
    }
}
