package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import ot0.C37739e0;
import ot0.C37741f0;
import ot0.C37743g0;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import xd0.C29742a;
import xs0.C39863i0;
import yd0.C29991a;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PiggyBankSuccessViewModel$ViewModel */
public final class PiggyBankSuccessViewModel$ViewModel extends C21481a implements C37741f0, C37739e0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29742a f81163d;

    /* renamed from: e */
    private final C39863i0 f81164e;

    /* renamed from: f */
    private final C37739e0 f81165f = this;

    /* renamed from: g */
    private final C37741f0 f81166g = this;

    /* renamed from: h */
    private final C1644x f81167h;

    /* renamed from: i */
    private final C1644x f81168i;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PiggyBankSuccessViewModel$ViewModel$a */
    static final class C33134a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessViewModel$ViewModel f81169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33134a(PiggyBankSuccessViewModel$ViewModel piggyBankSuccessViewModel$ViewModel) {
            super(1);
            this.f81169d = piggyBankSuccessViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(C32343x.m95465l1(this.f81169d.f81163d.mo47470a(C29991a.C29994c.C30001g.f75813e)), num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PiggyBankSuccessViewModel$ViewModel(C29742a aVar, C39863i0 i0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getClientCampaignInfo");
        C41536l.m120489i(i0Var, "refreshCasServiceInfo");
        this.f81163d = aVar;
        this.f81164e = i0Var;
        C1644x xVar = new C1644x();
        this.f81167h = xVar;
        this.f81168i = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37743g0(new C33134a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(it)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m97692ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Tn */
    public void mo75253Tn() {
        this.f81164e.mo93569a();
        C37224b.m109962a(this.f81168i);
    }

    /* renamed from: Xe */
    public LiveData mo75254Xe() {
        return this.f81167h;
    }

    /* renamed from: gw */
    public final C37739e0 mo75255gw() {
        return this.f81165f;
    }

    /* renamed from: hw */
    public final C37741f0 mo75256hw() {
        return this.f81166g;
    }

    /* renamed from: ps */
    public LiveData mo75257ps() {
        return this.f81168i;
    }
}
