package uq0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import he1.C41233s;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import np0.C37438d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.model.LoanSubtypeData;
import vq0.C39437a;
import yp0.C40044a;
import yp0.C40045b;

/* renamed from: uq0.g */
public final class C39066g extends C21481a implements C39064e, C39065f {

    /* renamed from: d */
    private final List f93204d;

    /* renamed from: e */
    private final LoanSubtypeData f93205e;

    /* renamed from: f */
    private final C39064e f93206f = this;

    /* renamed from: g */
    private final C39065f f93207g = this;

    /* renamed from: h */
    private final C1644x f93208h;

    /* renamed from: i */
    private final C1644x f93209i;

    /* renamed from: uq0.g$a */
    public /* synthetic */ class C39067a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93210a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ov.c[] r0 = p852ov.C27088c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ov.c r1 = p852ov.C27088c.PARALLEL_LOAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ov.c r1 = p852ov.C27088c.BOG_REFINANCING_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ov.c r1 = p852ov.C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f93210a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uq0.C39066g.C39067a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39066g(List list, LoanSubtypeData loanSubtypeData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        int i;
        List list2 = list;
        LoanSubtypeData loanSubtypeData2 = loanSubtypeData;
        C41536l.m120489i(list2, "offers");
        C41536l.m120489i(loanSubtypeData2, "loanData");
        this.f93204d = list2;
        this.f93205e = loanSubtypeData2;
        C1644x xVar = new C1644x();
        this.f93208h = xVar;
        this.f93209i = new C1644x();
        m114029fw(this, C40044a.LOAN_OPEN_SUGGESTION_PAGE, (String) null, 2, (Object) null);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoanOfferLimitUiModel loanOfferLimitUiModel = (LoanOfferLimitUiModel) it.next();
            String b = this.f93205e.mo73578b();
            String a = this.f93205e.mo73577a();
            String b2 = loanOfferLimitUiModel.mo54646e().mo66359b();
            String g = loanOfferLimitUiModel.mo54649g();
            String a2 = loanOfferLimitUiModel.mo54642a();
            BigDecimal b3 = loanOfferLimitUiModel.mo54643b();
            String d = loanOfferLimitUiModel.mo54644d();
            int i2 = C39067a.f93210a[loanOfferLimitUiModel.mo54646e().ordinal()];
            if (i2 == 1) {
                i = C37438d.new_loan_illustration;
            } else if (i2 == 2) {
                i = C37438d.bog_refinance_loan_illustration;
            } else if (i2 == 3) {
                i = C37438d.all_loan_refinance_illustration;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new C39437a(b, b2, g, a2, b3, d, a, i));
        }
        xVar.mo4826r(arrayList);
    }

    /* renamed from: fw */
    static /* synthetic */ void m114029fw(C39066g gVar, C40044a aVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        gVar.m114030o5(aVar, str);
    }

    /* renamed from: o5 */
    private final void m114030o5(C40044a aVar, String str) {
        C40045b.m116033a(this, aVar, C41341q.m119910m(this.f93205e.mo73578b(), this.f93205e.mo73579d().mo51954a(), str));
    }

    /* renamed from: aq */
    public LiveData mo92753aq() {
        return this.f93208h;
    }

    /* renamed from: dw */
    public final C39064e mo92755dw() {
        return this.f93206f;
    }

    /* renamed from: ew */
    public final C39065f mo92756ew() {
        return this.f93207g;
    }

    /* renamed from: sv */
    public LiveData mo92754sv() {
        return this.f93209i;
    }

    /* renamed from: u4 */
    public void mo92752u4(C39437a aVar) {
        C41536l.m120489i(aVar, "offer");
        m114030o5(C40044a.LOAN_SUGGESTION_SELECTED, aVar.mo93069f());
        C37224b.m109965d(this.f93209i, C41233s.m119492a(this.f93205e.mo73578b(), aVar.mo93069f()));
    }
}
