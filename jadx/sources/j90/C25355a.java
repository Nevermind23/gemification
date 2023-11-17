package j90;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: j90.a */
public final class C25355a {

    /* renamed from: a */
    private final String f64999a;

    /* renamed from: b */
    private BigDecimal f65000b;

    /* renamed from: c */
    private LookupUiModel f65001c;

    /* renamed from: d */
    private String f65002d;

    public C25355a(String str, BigDecimal bigDecimal, LookupUiModel lookupUiModel, String str2) {
        C41536l.m120489i(str, "currency");
        this.f64999a = str;
        this.f65000b = bigDecimal;
        this.f65001c = lookupUiModel;
        this.f65002d = str2;
    }

    /* renamed from: a */
    public final String mo63920a() {
        return this.f64999a;
    }

    /* renamed from: b */
    public final BigDecimal mo63921b() {
        return this.f65000b;
    }

    /* renamed from: c */
    public final LookupUiModel mo63922c() {
        return this.f65001c;
    }

    /* renamed from: d */
    public final String mo63923d() {
        return this.f65002d;
    }

    /* renamed from: e */
    public final boolean mo63924e() {
        return (this.f65000b == null || this.f65001c == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25355a)) {
            return false;
        }
        C25355a aVar = (C25355a) obj;
        return C41536l.m120484d(this.f64999a, aVar.f64999a) && C41536l.m120484d(this.f65000b, aVar.f65000b) && C41536l.m120484d(this.f65001c, aVar.f65001c) && C41536l.m120484d(this.f65002d, aVar.f65002d);
    }

    /* renamed from: f */
    public final boolean mo63926f() {
        return (this.f65000b == null || this.f65001c == null || this.f65002d == null) ? false : true;
    }

    /* renamed from: g */
    public final void mo63927g(BigDecimal bigDecimal) {
        this.f65000b = bigDecimal;
    }

    /* renamed from: h */
    public final void mo63928h(LookupUiModel lookupUiModel) {
        this.f65001c = lookupUiModel;
    }

    public int hashCode() {
        int hashCode = this.f64999a.hashCode() * 31;
        BigDecimal bigDecimal = this.f65000b;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        LookupUiModel lookupUiModel = this.f65001c;
        int hashCode3 = (hashCode2 + (lookupUiModel == null ? 0 : lookupUiModel.hashCode())) * 31;
        String str = this.f65002d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final void mo63930i(String str) {
        this.f65002d = str;
    }

    public String toString() {
        String str = this.f64999a;
        BigDecimal bigDecimal = this.f65000b;
        LookupUiModel lookupUiModel = this.f65001c;
        String str2 = this.f65002d;
        return "ClaFirstStageFormData(currency=" + str + ", loanAmount=" + bigDecimal + ", loanTerm=" + lookupUiModel + ", rsContract=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25355a(String str, BigDecimal bigDecimal, LookupUiModel lookupUiModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : lookupUiModel, (i & 8) != 0 ? null : str2);
    }
}
