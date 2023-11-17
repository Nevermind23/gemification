package kb0;

import g91.C32319m;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;

/* renamed from: kb0.a */
public final class C25702a {

    /* renamed from: e */
    public static final C25703a f65470e = new C25703a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final DepositSubmissionNavData f65471a;

    /* renamed from: b */
    private final DepositPurposeUiModel f65472b;

    /* renamed from: c */
    private final String f65473c;

    /* renamed from: d */
    private final TransferAccountItem f65474d;

    /* renamed from: kb0.a$a */
    public static final class C25703a {
        private C25703a() {
        }

        public /* synthetic */ C25703a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C25702a(DepositSubmissionNavData depositSubmissionNavData, DepositPurposeUiModel depositPurposeUiModel, String str, TransferAccountItem transferAccountItem) {
        C41536l.m120489i(depositSubmissionNavData, "navData");
        this.f65471a = depositSubmissionNavData;
        this.f65472b = depositPurposeUiModel;
        this.f65473c = str;
        this.f65474d = transferAccountItem;
    }

    /* renamed from: b */
    public static /* synthetic */ C25702a m80911b(C25702a aVar, DepositSubmissionNavData depositSubmissionNavData, DepositPurposeUiModel depositPurposeUiModel, String str, TransferAccountItem transferAccountItem, int i, Object obj) {
        if ((i & 1) != 0) {
            depositSubmissionNavData = aVar.f65471a;
        }
        if ((i & 2) != 0) {
            depositPurposeUiModel = aVar.f65472b;
        }
        if ((i & 4) != 0) {
            str = aVar.f65473c;
        }
        if ((i & 8) != 0) {
            transferAccountItem = aVar.f65474d;
        }
        return aVar.mo64264a(depositSubmissionNavData, depositPurposeUiModel, str, transferAccountItem);
    }

    /* renamed from: a */
    public final C25702a mo64264a(DepositSubmissionNavData depositSubmissionNavData, DepositPurposeUiModel depositPurposeUiModel, String str, TransferAccountItem transferAccountItem) {
        C41536l.m120489i(depositSubmissionNavData, "navData");
        return new C25702a(depositSubmissionNavData, depositPurposeUiModel, str, transferAccountItem);
    }

    /* renamed from: c */
    public final TransferAccountItem mo64265c() {
        return this.f65474d;
    }

    /* renamed from: d */
    public final String mo64266d() {
        return this.f65473c;
    }

    /* renamed from: e */
    public final Integer mo64267e() {
        Long b = this.f65471a.mo57166b();
        if (b == null) {
            return null;
        }
        return Integer.valueOf((int) C32319m.m95318y(new Date(this.f65471a.mo57171f()), new Date(b.longValue())));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25702a)) {
            return false;
        }
        C25702a aVar = (C25702a) obj;
        return C41536l.m120484d(this.f65471a, aVar.f65471a) && C41536l.m120484d(this.f65472b, aVar.f65472b) && C41536l.m120484d(this.f65473c, aVar.f65473c) && C41536l.m120484d(this.f65474d, aVar.f65474d);
    }

    /* renamed from: f */
    public final Long mo64269f() {
        Long b = this.f65471a.mo57166b();
        if (b == null) {
            return null;
        }
        return Long.valueOf(C32319m.m95313t(this.f65471a.mo57171f(), b.longValue()));
    }

    /* renamed from: g */
    public final DepositSubmissionNavData mo64270g() {
        return this.f65471a;
    }

    /* renamed from: h */
    public final DepositPurposeUiModel mo64271h() {
        return this.f65472b;
    }

    public int hashCode() {
        int hashCode = this.f65471a.hashCode() * 31;
        DepositPurposeUiModel depositPurposeUiModel = this.f65472b;
        int i = 0;
        int hashCode2 = (hashCode + (depositPurposeUiModel == null ? 0 : depositPurposeUiModel.hashCode())) * 31;
        String str = this.f65473c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TransferAccountItem transferAccountItem = this.f65474d;
        if (transferAccountItem != null) {
            i = transferAccountItem.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final boolean mo64273i() {
        if (this.f65474d == null || this.f65471a.mo57173h().mo56813d() == null || this.f65471a.mo57173h().mo56812b() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo64274j(DepositPurposeUiModel depositPurposeUiModel) {
        String e;
        if (depositPurposeUiModel == null || (e = depositPurposeUiModel.mo56803e()) == null) {
            return false;
        }
        return C40439w.m117115s(e, "Other", true);
    }

    /* renamed from: k */
    public final boolean mo64275k() {
        return mo64274j(this.f65472b);
    }

    public String toString() {
        DepositSubmissionNavData depositSubmissionNavData = this.f65471a;
        DepositPurposeUiModel depositPurposeUiModel = this.f65472b;
        String str = this.f65473c;
        TransferAccountItem transferAccountItem = this.f65474d;
        return "DepositSubmissionData(navData=" + depositSubmissionNavData + ", purpose=" + depositPurposeUiModel + ", depositName=" + str + ", account=" + transferAccountItem + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25702a(DepositSubmissionNavData depositSubmissionNavData, DepositPurposeUiModel depositPurposeUiModel, String str, TransferAccountItem transferAccountItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(depositSubmissionNavData, (i & 2) != 0 ? null : depositPurposeUiModel, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : transferAccountItem);
    }
}
