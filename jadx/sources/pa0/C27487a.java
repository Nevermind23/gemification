package pa0;

import g91.C32319m;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import ue1.C43075l;

/* renamed from: pa0.a */
public final class C27487a {

    /* renamed from: g */
    public static final C27488a f70365g = new C27488a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final long f70366h = Calendar.getInstance().getTimeInMillis();

    /* renamed from: a */
    private final DepositTypeDetailsUiModel f70367a;

    /* renamed from: b */
    private final C43075l f70368b;

    /* renamed from: c */
    private final BigDecimal f70369c;

    /* renamed from: d */
    private final String f70370d;

    /* renamed from: e */
    private final Date f70371e;

    /* renamed from: f */
    private final WithdrawalTypeUiModel f70372f;

    /* renamed from: pa0.a$a */
    public static final class C27488a {
        private C27488a() {
        }

        public /* synthetic */ C27488a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo66801a() {
            return C27487a.f70366h;
        }
    }

    public C27487a(DepositTypeDetailsUiModel depositTypeDetailsUiModel, C43075l lVar, BigDecimal bigDecimal, String str, Date date, WithdrawalTypeUiModel withdrawalTypeUiModel) {
        C41536l.m120489i(depositTypeDetailsUiModel, "selectedDeposit");
        C41536l.m120489i(lVar, "initialAmountValidator");
        this.f70367a = depositTypeDetailsUiModel;
        this.f70368b = lVar;
        this.f70369c = bigDecimal;
        this.f70370d = str;
        this.f70371e = date;
        this.f70372f = withdrawalTypeUiModel;
    }

    /* renamed from: c */
    public static /* synthetic */ C27487a m85254c(C27487a aVar, DepositTypeDetailsUiModel depositTypeDetailsUiModel, C43075l lVar, BigDecimal bigDecimal, String str, Date date, WithdrawalTypeUiModel withdrawalTypeUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            depositTypeDetailsUiModel = aVar.f70367a;
        }
        if ((i & 2) != 0) {
            lVar = aVar.f70368b;
        }
        C43075l lVar2 = lVar;
        if ((i & 4) != 0) {
            bigDecimal = aVar.f70369c;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            str = aVar.f70370d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            date = aVar.f70371e;
        }
        Date date2 = date;
        if ((i & 32) != 0) {
            withdrawalTypeUiModel = aVar.f70372f;
        }
        return aVar.mo66788b(depositTypeDetailsUiModel, lVar2, bigDecimal2, str2, date2, withdrawalTypeUiModel);
    }

    /* renamed from: b */
    public final C27487a mo66788b(DepositTypeDetailsUiModel depositTypeDetailsUiModel, C43075l lVar, BigDecimal bigDecimal, String str, Date date, WithdrawalTypeUiModel withdrawalTypeUiModel) {
        C41536l.m120489i(depositTypeDetailsUiModel, "selectedDeposit");
        C41536l.m120489i(lVar, "initialAmountValidator");
        return new C27487a(depositTypeDetailsUiModel, lVar, bigDecimal, str, date, withdrawalTypeUiModel);
    }

    /* renamed from: d */
    public final Integer mo66789d() {
        Date date = this.f70371e;
        if (date == null) {
            return null;
        }
        return Integer.valueOf((int) C32319m.m95318y(new Date(f70366h), new Date(date.getTime())));
    }

    /* renamed from: e */
    public final Long mo66790e() {
        Date date = this.f70371e;
        if (date == null) {
            return null;
        }
        return Long.valueOf(C32319m.m95313t(f70366h, date.getTime()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27487a)) {
            return false;
        }
        C27487a aVar = (C27487a) obj;
        return C41536l.m120484d(this.f70367a, aVar.f70367a) && C41536l.m120484d(this.f70368b, aVar.f70368b) && C41536l.m120484d(this.f70369c, aVar.f70369c) && C41536l.m120484d(this.f70370d, aVar.f70370d) && C41536l.m120484d(this.f70371e, aVar.f70371e) && C41536l.m120484d(this.f70372f, aVar.f70372f);
    }

    /* renamed from: f */
    public final BigDecimal mo66792f() {
        return this.f70369c;
    }

    /* renamed from: g */
    public final boolean mo66793g() {
        return C41341q.m119910m(C25695d.TERM, C25695d.ENLARG).contains(this.f70367a.mo57218e());
    }

    /* renamed from: h */
    public final String mo66794h() {
        return this.f70370d;
    }

    public int hashCode() {
        int hashCode = ((this.f70367a.hashCode() * 31) + this.f70368b.hashCode()) * 31;
        BigDecimal bigDecimal = this.f70369c;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f70370d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f70371e;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f70372f;
        if (withdrawalTypeUiModel != null) {
            i = withdrawalTypeUiModel.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final DepositTypeDetailsUiModel mo66796i() {
        return this.f70367a;
    }

    /* renamed from: j */
    public final Date mo66797j() {
        return this.f70371e;
    }

    /* renamed from: k */
    public final WithdrawalTypeUiModel mo66798k() {
        return this.f70372f;
    }

    /* renamed from: l */
    public final boolean mo66799l() {
        boolean z;
        BigDecimal bigDecimal = this.f70369c;
        if (bigDecimal == null || !((Boolean) this.f70368b.invoke(bigDecimal)).booleanValue() || this.f70370d == null || this.f70372f == null) {
            return false;
        }
        if (!mo66793g() || this.f70371e != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public String toString() {
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = this.f70367a;
        C43075l lVar = this.f70368b;
        BigDecimal bigDecimal = this.f70369c;
        String str = this.f70370d;
        Date date = this.f70371e;
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f70372f;
        return "DepositApplicationFormData(selectedDeposit=" + depositTypeDetailsUiModel + ", initialAmountValidator=" + lVar + ", initialAmount=" + bigDecimal + ", selectedCurrency=" + str + ", selectedEndDate=" + date + ", selectedWithdrawalType=" + withdrawalTypeUiModel + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27487a(DepositTypeDetailsUiModel depositTypeDetailsUiModel, C43075l lVar, BigDecimal bigDecimal, String str, Date date, WithdrawalTypeUiModel withdrawalTypeUiModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(depositTypeDetailsUiModel, lVar, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : withdrawalTypeUiModel);
    }
}
