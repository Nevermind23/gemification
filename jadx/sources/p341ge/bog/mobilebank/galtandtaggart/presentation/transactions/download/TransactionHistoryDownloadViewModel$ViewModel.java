package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import ie0.C25190j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import rg0.C28028f;
import rg0.C28029g;
import rg0.C28030h;
import rg0.C28031i;
import ue1.C43075l;
import we0.C29344l;
import we0.C29349n;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.TransactionHistoryDownloadViewModel$ViewModel */
public final class TransactionHistoryDownloadViewModel$ViewModel extends C21481a implements C28028f, C28029g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29349n f62223d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29344l f62224e;

    /* renamed from: f */
    private final Client f62225f;

    /* renamed from: g */
    private final C28029g f62226g = this;

    /* renamed from: h */
    private final C28028f f62227h = this;

    /* renamed from: i */
    private final C40767b f62228i;

    /* renamed from: j */
    private final C1644x f62229j;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.TransactionHistoryDownloadViewModel$ViewModel$a */
    static final class C23963a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryDownloadViewModel$ViewModel f62230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23963a(TransactionHistoryDownloadViewModel$ViewModel transactionHistoryDownloadViewModel$ViewModel) {
            super(1);
            this.f62230d = transactionHistoryDownloadViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C40762x xVar;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            long longValue = ((Number) mVar.mo95675a()).longValue();
            if (((Boolean) mVar.mo95676b()).booleanValue()) {
                xVar = this.f62230d.f62223d.mo69201b(longValue, (Long) null);
            } else {
                xVar = this.f62230d.f62224e.mo69197b(longValue, (Long) null);
            }
            C40749p O = xVar.mo95075O();
            C41536l.m120488h(O, "when {\n                 …         }.toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.TransactionHistoryDownloadViewModel$ViewModel$b */
    static final class C23964b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryDownloadViewModel$ViewModel f62231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23964b(TransactionHistoryDownloadViewModel$ViewModel transactionHistoryDownloadViewModel$ViewModel) {
            super(1);
            this.f62231d = transactionHistoryDownloadViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60937a(C31128a aVar) {
            this.f62231d.mo60935xk().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60937a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryDownloadViewModel$ViewModel(C29349n nVar, C29344l lVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(nVar, "getAccountStatementUseCase");
        C41536l.m120489i(lVar, "getAccountConfirmUseCase");
        C41536l.m120489i(client, "client");
        this.f62223d = nVar;
        this.f62224e = lVar;
        this.f62225f = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<Long, Boolean>>()");
        this.f62228i = h1;
        this.f62229j = new C1644x();
        C40749p L0 = h1.mo94989L0(new C28030h(new C23963a(this)));
        C41536l.m120488h(L0, "pdfSubject.switchMap { (…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C28031i(new C23964b(this)));
        C41536l.m120488h(F0, "pdfSubject.switchMap { (…result)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m77308fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m77309gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Dg */
    public void mo60929Dg(long j, boolean z) {
        this.f62228i.onNext(new C41224m(Long.valueOf(j), Boolean.valueOf(z)));
    }

    /* renamed from: Rh */
    public int mo60930Rh() {
        if (this.f62225f.getUserInfo().isSolo()) {
            return C25190j.gt_history_download_monthly_hint_solo;
        }
        return C25190j.gt_history_download_monthly_hint_rb;
    }

    /* renamed from: jw */
    public final C28028f mo60931jw() {
        return this.f62227h;
    }

    /* renamed from: kw */
    public final C28029g mo60932kw() {
        return this.f62226g;
    }

    /* renamed from: lk */
    public int mo60933lk() {
        if (this.f62225f.getUserInfo().isSolo()) {
            return C25190j.gt_history_download_daily_hint_solo;
        }
        return C25190j.gt_history_download_daily_hint_rb;
    }

    /* renamed from: lw */
    public C1644x mo60935xk() {
        return this.f62229j;
    }
}
