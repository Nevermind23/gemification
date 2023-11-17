package d30;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.account.AccountLov;

/* renamed from: d30.g */
public final class C19899g {

    /* renamed from: a */
    private final C19898f f54406a;

    /* renamed from: b */
    private BigDecimal f54407b;

    /* renamed from: c */
    private AccountLov f54408c;

    /* renamed from: d */
    private String f54409d;

    public C19899g(C19898f fVar, BigDecimal bigDecimal, AccountLov accountLov, String str) {
        C41536l.m120489i(fVar, "type");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "comment");
        this.f54406a = fVar;
        this.f54407b = bigDecimal;
        this.f54408c = accountLov;
        this.f54409d = str;
    }

    /* renamed from: a */
    public final AccountLov mo48263a() {
        return this.f54408c;
    }

    /* renamed from: b */
    public final BigDecimal mo48264b() {
        return this.f54407b;
    }

    /* renamed from: c */
    public final String mo48265c() {
        return this.f54409d;
    }

    /* renamed from: d */
    public final C19898f mo48266d() {
        return this.f54406a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19899g)) {
            return false;
        }
        C19899g gVar = (C19899g) obj;
        return this.f54406a == gVar.f54406a && C41536l.m120484d(this.f54407b, gVar.f54407b) && C41536l.m120484d(this.f54408c, gVar.f54408c) && C41536l.m120484d(this.f54409d, gVar.f54409d);
    }

    public int hashCode() {
        int hashCode = ((this.f54406a.hashCode() * 31) + this.f54407b.hashCode()) * 31;
        AccountLov accountLov = this.f54408c;
        return ((hashCode + (accountLov == null ? 0 : accountLov.hashCode())) * 31) + this.f54409d.hashCode();
    }

    public String toString() {
        C19898f fVar = this.f54406a;
        BigDecimal bigDecimal = this.f54407b;
        AccountLov accountLov = this.f54408c;
        String str = this.f54409d;
        return "WizardFieldsModel(type=" + fVar + ", amount=" + bigDecimal + ", account=" + accountLov + ", comment=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19899g(C19898f fVar, BigDecimal bigDecimal, AccountLov accountLov, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i & 2) != 0 ? new BigDecimal(Utils.DOUBLE_EPSILON) : bigDecimal, (i & 4) != 0 ? null : accountLov, (i & 8) != 0 ? "" : str);
    }
}
