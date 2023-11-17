package wa0;

import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb0.C25702a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p775gx.C24836a;
import ue1.C43064a;
import ue1.C43075l;
import y11.C39989a;
import ya0.C29957a;
import z11.C40139a;

/* renamed from: wa0.n */
public final class C29263n extends C21481a implements C29957a {

    /* renamed from: d */
    private final C29957a f74328d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29255g f74329e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C24836a f74330f;

    /* renamed from: g */
    private final C41217g f74331g = C41219i.m119470b(new C29264a(this));

    /* renamed from: wa0.n$a */
    static final class C29264a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29263n f74332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29264a(C29263n nVar) {
            super(0);
            this.f74332d = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m89269c(C29263n nVar, TransferAccountItem transferAccountItem) {
            C41536l.m120489i(nVar, "this$0");
            C41536l.m120489i(transferAccountItem, "account");
            List<TransferAccountItem> t = transferAccountItem.mo52151t();
            if ((t instanceof Collection) && t.isEmpty()) {
                return false;
            }
            for (TransferAccountItem i : t) {
                if (C41536l.m120484d(i.mo52142i(), nVar.f74329e.mo69097b().mo57165a())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C39989a invoke() {
            return new C29262m(this.f74332d);
        }
    }

    /* renamed from: wa0.n$b */
    static final class C29265b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29263n f74333d;

        /* renamed from: wa0.n$b$a */
        static final class C29266a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C29263n f74334d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29266a(C29263n nVar) {
                super(1);
                this.f74334d = nVar;
            }

            /* renamed from: a */
            public final List invoke(TransferAccounts transferAccounts) {
                boolean z;
                C41536l.m120489i(transferAccounts, "list");
                C29263n nVar = this.f74334d;
                List fw = nVar.m89237kw(transferAccounts, C40139a.SRC);
                C39989a gw = this.f74334d.m89238lw();
                ArrayList arrayList = new ArrayList();
                for (Object next : fw) {
                    if (gw.mo57048z((TransferAccountItem) next)) {
                        arrayList.add(next);
                    }
                }
                C29263n nVar2 = this.f74334d;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (((TransferAccountItem) next2).mo52146m() == nVar2.f74329e.mo69098c()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next2);
                    }
                }
                return nVar.m89243qw(arrayList2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29265b(C29263n nVar) {
            super(1);
            this.f74333d = nVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return this.f74333d.f74330f.mo63245a().mo95062A(new C29268o(new C29266a(this.f74333d))).mo95075O();
        }
    }

    /* renamed from: wa0.n$c */
    static final class C29267c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29263n f74335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29267c(C29263n nVar) {
            super(1);
            this.f74335d = nVar;
        }

        /* renamed from: a */
        public final void mo69107a(List list) {
            C41536l.m120488h(list, "result");
            TransferAccountItem transferAccountItem = (TransferAccountItem) C41358y.m120009Y(list);
            if (transferAccountItem != null) {
                this.f74335d.mo64738P(transferAccountItem);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69107a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29263n(C29957a aVar, C29255g gVar, C24836a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "depositSecondStepDelegate");
        C41536l.m120489i(gVar, "args");
        C41536l.m120489i(aVar2, "getAccountsUseCase");
        this.f74328d = aVar;
        this.f74329e = gVar;
        this.f74330f = aVar2;
        mo64759lr(onRefresh());
        mo64740Rd();
        mo64734Ja();
        m89239mw();
        m89240nw();
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public final List m89237kw(TransferAccounts transferAccounts, C40139a aVar) {
        List list = null;
        if (aVar == C40139a.DST) {
            TransferAccount b = transferAccounts.mo52162b();
            if (b != null) {
                list = b.mo52122a();
            }
        } else {
            TransferAccount b2 = transferAccounts.mo52162b();
            if (b2 != null) {
                list = b2.mo52123b();
            }
        }
        if (list == null) {
            return C41341q.m119907j();
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final C39989a m89238lw() {
        return (C39989a) this.f74331g.getValue();
    }

    /* renamed from: mw */
    private final void m89239mw() {
        mo64764ov(new C25702a(this.f74329e.mo69097b(), (DepositPurposeUiModel) null, (String) null, (TransferAccountItem) null, 14, (DefaultConstructorMarker) null));
        mo64762mj(this.f74329e.mo69096a());
        mo64746bu(this.f74329e.mo69099d());
    }

    /* renamed from: nw */
    private final void m89240nw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C29260k(new C29265b(this)));
        C41536l.m120488h(L0, "private fun loadAccounts…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95453h1(L0).mo94981F0(new C29261l(new C29267c(this)));
        C41536l.m120488h(F0, "private fun loadAccounts…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m89241ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m89242pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final List m89243qw(List list) {
        TransferAccountItem transferAccountItem;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransferAccountItem transferAccountItem2 = (TransferAccountItem) it.next();
            Iterator it2 = transferAccountItem2.mo52151t().iterator();
            while (true) {
                transferAccountItem = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C41536l.m120484d(((TransferAccountItem) obj).mo52142i(), this.f74329e.mo69097b().mo57165a())) {
                    break;
                }
            }
            TransferAccountItem transferAccountItem3 = (TransferAccountItem) obj;
            if (transferAccountItem3 != null) {
                transferAccountItem = TransferAccountItem.m68075b(transferAccountItem3, false, false, 0, (String) null, (String) null, (String) null, (BigDecimal) null, 0, (BigDecimal) null, false, (String) null, false, (String) null, (List) null, (String) null, transferAccountItem2.mo52143j(), transferAccountItem2.mo52144k(), (TransferExternalFile) null, 163839, (Object) null);
            }
            if (transferAccountItem != null) {
                arrayList.add(transferAccountItem);
            }
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public LiveData mo64733F0() {
        return this.f74328d.mo64733F0();
    }

    /* renamed from: Ja */
    public void mo64734Ja() {
        this.f74328d.mo64734Ja();
    }

    /* renamed from: Ma */
    public void mo64736Ma() {
        this.f74328d.mo64736Ma();
    }

    /* renamed from: O */
    public void mo64737O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        this.f74328d.mo64737O(str, str2, str3, str4);
    }

    /* renamed from: P */
    public void mo64738P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        this.f74328d.mo64738P(transferAccountItem);
    }

    /* renamed from: P2 */
    public LiveData mo64739P2() {
        return this.f74328d.mo64739P2();
    }

    /* renamed from: Rd */
    public void mo64740Rd() {
        this.f74328d.mo64740Rd();
    }

    /* renamed from: Uo */
    public LiveData mo64741Uo() {
        return this.f74328d.mo64741Uo();
    }

    /* renamed from: Uu */
    public AccumulateOnSpecificDateModel mo64742Uu() {
        return this.f74328d.mo64742Uu();
    }

    /* renamed from: Ve */
    public void mo64743Ve(Long l) {
        this.f74328d.mo64743Ve(l);
    }

    /* renamed from: Yv */
    public LiveData mo64744Yv() {
        return this.f74328d.mo64744Yv();
    }

    /* renamed from: Z */
    public void mo64745Z() {
        this.f74328d.mo64745Z();
    }

    /* renamed from: bu */
    public void mo64746bu(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        C41536l.m120489i(accumulateOnSpecificDateModel, "<set-?>");
        this.f74328d.mo64746bu(accumulateOnSpecificDateModel);
    }

    /* renamed from: gs */
    public int mo64747gs() {
        return this.f74328d.mo64747gs();
    }

    /* renamed from: i3 */
    public LiveData mo64750i3() {
        return this.f74328d.mo64750i3();
    }

    /* renamed from: j3 */
    public LiveData mo64752j3() {
        return this.f74328d.mo64752j3();
    }

    /* renamed from: k0 */
    public void mo64755k0() {
        this.f74328d.mo64755k0();
    }

    /* renamed from: ki */
    public LiveData mo64756ki() {
        return this.f74328d.mo64756ki();
    }

    /* renamed from: kp */
    public AccumulateOnPaymentModel mo64757kp() {
        return this.f74328d.mo64757kp();
    }

    /* renamed from: lr */
    public void mo64759lr(C40749p pVar) {
        C41536l.m120489i(pVar, "onRefresh");
        this.f74328d.mo64759lr(pVar);
    }

    /* renamed from: m */
    public LiveData mo64761m() {
        return this.f74328d.mo64761m();
    }

    /* renamed from: mj */
    public void mo64762mj(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        C41536l.m120489i(accumulateOnPaymentModel, "<set-?>");
        this.f74328d.mo64762mj(accumulateOnPaymentModel);
    }

    /* renamed from: ov */
    public void mo64764ov(C25702a aVar) {
        C41536l.m120489i(aVar, "depositData");
        this.f74328d.mo64764ov(aVar);
    }

    /* renamed from: rq */
    public void mo64765rq(String str) {
        this.f74328d.mo64765rq(str);
    }
}
