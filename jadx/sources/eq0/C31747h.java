package eq0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p775gx.C24836a;
import rq0.C38329a;
import ue1.C43075l;
import ue1.C43079p;
import up0.C39056c;

/* renamed from: eq0.h */
public final class C31747h extends C21481a implements C31743d, C31744e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39056c f78324d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24836a f78325e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38329a f78326f;

    /* renamed from: g */
    private final C31743d f78327g = this;

    /* renamed from: h */
    private final C31744e f78328h = this;

    /* renamed from: i */
    private final C1644x f78329i;

    /* renamed from: j */
    private final C1644x f78330j;

    /* renamed from: eq0.h$a */
    static final class C31748a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanAccountSelectorData f78331d;

        /* renamed from: e */
        final /* synthetic */ C31747h f78332e;

        /* renamed from: eq0.h$a$a */
        static final class C31749a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C31747h f78333d;

            /* renamed from: e */
            final /* synthetic */ LoanAccountSelectorData f78334e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31749a(C31747h hVar, LoanAccountSelectorData loanAccountSelectorData) {
                super(2);
                this.f78333d = hVar;
                this.f78334e = loanAccountSelectorData;
            }

            /* renamed from: a */
            public final List invoke(List list, TransferAccounts transferAccounts) {
                C41536l.m120489i(list, "loanAccounts");
                C41536l.m120489i(transferAccounts, "transferAccounts");
                return this.f78333d.f78326f.mo91876c(list, transferAccounts, this.f78334e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31748a(LoanAccountSelectorData loanAccountSelectorData, C31747h hVar) {
            super(1);
            this.f78331d = loanAccountSelectorData;
            this.f78332e = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List m93938c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (List) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C40762x xVar;
            C41536l.m120489i(num, "it");
            if (this.f78331d.mo73223b() == C37124a.CL) {
                xVar = this.f78332e.f78324d.mo92747a(this.f78331d.mo73222a());
            } else {
                xVar = C40762x.m118162z(C41341q.m119907j());
                C41536l.m120488h(xVar, "{\n                      …())\n                    }");
            }
            C40762x T = C40762x.m118154T(xVar, this.f78332e.f78325e.mo63245a(), new C31746g(new C31749a(this.f78332e, this.f78331d)));
            C41536l.m120488h(T, "class ViewModel @Assiste…(account)\n        }\n    }");
            return C31270e.m92880i(T, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31747h(LoanAccountSelectorData loanAccountSelectorData, C39056c cVar, C24836a aVar, C38329a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(loanAccountSelectorData, "data");
        C41536l.m120489i(cVar, "getLoanAccounts");
        C41536l.m120489i(aVar, "getTransferAccounts");
        C41536l.m120489i(aVar2, "loanActivationMapper");
        this.f78324d = cVar;
        this.f78325e = aVar;
        this.f78326f = aVar2;
        C1644x xVar = new C1644x();
        this.f78329i = xVar;
        this.f78330j = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C31745f(new C31748a(loanAccountSelectorData, this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m93928ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: g */
    public LiveData mo72180g() {
        return this.f78329i;
    }

    /* renamed from: iw */
    public final C31743d mo72182iw() {
        return this.f78327g;
    }

    /* renamed from: jw */
    public final C31744e mo72183jw() {
        return this.f78328h;
    }

    /* renamed from: k2 */
    public void mo72179k2(LoanAccountListItem loanAccountListItem) {
        C41536l.m120489i(loanAccountListItem, "account");
        C37224b.m109965d(this.f78330j, loanAccountListItem);
    }

    /* renamed from: qi */
    public LiveData mo72181qi() {
        return this.f78330j;
    }
}
