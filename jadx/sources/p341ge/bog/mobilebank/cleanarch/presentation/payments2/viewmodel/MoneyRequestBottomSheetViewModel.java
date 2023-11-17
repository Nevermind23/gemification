package p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.C26359a;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p802jv.C25498e;
import p802jv.C25503h;
import p812kv.C25779b;
import p812kv.C25781d;
import p832mv.C26305b;
import p891su.C28261a;
import p891su.C28269e;
import r30.C27896c;
import ue1.C43075l;
import w10.C29190a;
import w30.C29200a;
import w30.C29201b;
import w30.C29202c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel */
public final class MoneyRequestBottomSheetViewModel extends C21481a {

    /* renamed from: d */
    private final C25503h f58585d;

    /* renamed from: e */
    private final C25498e f58586e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f58587f = new C1644x();

    /* renamed from: g */
    private final C1644x f58588g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f58589h = new C1644x();

    /* renamed from: i */
    private long f58590i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C22021a f58591j;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel$a */
    public static final class C22021a {

        /* renamed from: a */
        private final long f58592a;

        /* renamed from: b */
        private final long f58593b;

        /* renamed from: c */
        private final String f58594c;

        /* renamed from: d */
        private final String f58595d;

        /* renamed from: e */
        private final String f58596e;

        /* renamed from: f */
        private final String f58597f;

        /* renamed from: g */
        private final C25781d f58598g;

        public C22021a(long j, long j2, String str, String str2, String str3, String str4, C25781d dVar) {
            C41536l.m120489i(str2, "amount");
            C41536l.m120489i(str4, "transferForm");
            C41536l.m120489i(dVar, "requestType");
            this.f58592a = j;
            this.f58593b = j2;
            this.f58594c = str;
            this.f58595d = str2;
            this.f58596e = str3;
            this.f58597f = str4;
            this.f58598g = dVar;
        }

        /* renamed from: a */
        public final String mo54720a() {
            return this.f58594c;
        }

        /* renamed from: b */
        public final String mo54721b() {
            return this.f58595d;
        }

        /* renamed from: c */
        public final String mo54722c() {
            return this.f58596e;
        }

        /* renamed from: d */
        public final long mo54723d() {
            return this.f58592a;
        }

        /* renamed from: e */
        public final C25781d mo54724e() {
            return this.f58598g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22021a)) {
                return false;
            }
            C22021a aVar = (C22021a) obj;
            return this.f58592a == aVar.f58592a && this.f58593b == aVar.f58593b && C41536l.m120484d(this.f58594c, aVar.f58594c) && C41536l.m120484d(this.f58595d, aVar.f58595d) && C41536l.m120484d(this.f58596e, aVar.f58596e) && C41536l.m120484d(this.f58597f, aVar.f58597f) && this.f58598g == aVar.f58598g;
        }

        /* renamed from: f */
        public final String mo54726f() {
            return this.f58597f;
        }

        public int hashCode() {
            int a = ((C7397t.m28148a(this.f58592a) * 31) + C7397t.m28148a(this.f58593b)) * 31;
            String str = this.f58594c;
            int i = 0;
            int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f58595d.hashCode()) * 31;
            String str2 = this.f58596e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + this.f58597f.hashCode()) * 31) + this.f58598g.hashCode();
        }

        public String toString() {
            long j = this.f58592a;
            long j2 = this.f58593b;
            String str = this.f58594c;
            String str2 = this.f58595d;
            String str3 = this.f58596e;
            String str4 = this.f58597f;
            C25781d dVar = this.f58598g;
            return "OpenTransferData(requestId=" + j + ", contactId=" + j2 + ", accountNumber=" + str + ", amount=" + str2 + ", nomination=" + str3 + ", transferForm=" + str4 + ", requestType=" + dVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel$b */
    static final class C22022b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestBottomSheetViewModel f58599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22022b(MoneyRequestBottomSheetViewModel moneyRequestBottomSheetViewModel) {
            super(1);
            this.f58599d = moneyRequestBottomSheetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58599d.f58589h.mo4826r(C32343x.m95466m(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel$c */
    static final class C22023c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestBottomSheetViewModel f58600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22023c(MoneyRequestBottomSheetViewModel moneyRequestBottomSheetViewModel) {
            super(1);
            this.f58600d = moneyRequestBottomSheetViewModel;
        }

        /* renamed from: a */
        public final void mo54730a(C25779b bVar) {
            String str;
            Object W = C41358y.m120007W(bVar.mo64389h());
            C41536l.m120487g(W, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.domain.moneyrequest.model.MoneyRequestReceiver.ExistingContact");
            C26305b.C26306a aVar = (C26305b.C26306a) W;
            C28261a h = aVar.mo65477h();
            this.f58600d.f58587f.mo4826r(new C27896c(bVar.mo64385e(), C26359a.m82388a(h), h.mo67858n(), C29190a.m89130b(h), C29190a.m89129a(h), aVar.mo65471b(), bVar.mo64383c()));
            if (h.mo67850g() == C28269e.BUDGET) {
                str = TransferForm.TRANSFER_FORM_BUDGET;
            } else {
                str = TransferForm.TRANSFER_FORM_OTHER;
            }
            String str2 = str;
            MoneyRequestBottomSheetViewModel moneyRequestBottomSheetViewModel = this.f58600d;
            moneyRequestBottomSheetViewModel.f58591j = new C22021a(moneyRequestBottomSheetViewModel.mo54717pw(), h.mo67857m(), bVar.mo64381a(), String.valueOf(aVar.mo65471b()), bVar.mo64383c(), str2, bVar.mo64393k());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54730a((C25779b) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyRequestBottomSheetViewModel(C25503h hVar, C25498e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getRequestById");
        C41536l.m120489i(eVar, "declineRequest");
        this.f58585d = hVar;
        this.f58586e = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m71296kw(MoneyRequestBottomSheetViewModel moneyRequestBottomSheetViewModel) {
        C41536l.m120489i(moneyRequestBottomSheetViewModel, "this$0");
        moneyRequestBottomSheetViewModel.f58589h.mo4826r(C32343x.m95466m(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m71297lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: qw */
    private final void m71298qw() {
        C41205b u = this.f58585d.mo64054a(this.f58590i).mo94957s(C40992a.m118827a()).mo94959u(new C29202c(new C22023c(this)));
        C41536l.m120488h(u, "private fun loadMoneyReq…}.bindToLifecycle()\n    }");
        bindToLifecycle(u);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m71299rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: jw */
    public final void mo54713jw() {
        C41205b G = this.f58586e.mo64050a(this.f58590i).mo94906z(C40992a.m118827a()).mo94888G(new C29200a(this), new C29201b(new C22022b(this)));
        C41536l.m120488h(G, "fun decline() {\n        …).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: mw */
    public final LiveData mo54714mw() {
        return this.f58589h;
    }

    /* renamed from: nw */
    public final LiveData mo54715nw() {
        return this.f58588g;
    }

    /* renamed from: ow */
    public final LiveData mo54716ow() {
        return this.f58587f;
    }

    /* renamed from: pw */
    public final long mo54717pw() {
        return this.f58590i;
    }

    /* renamed from: sw */
    public final void mo54718sw() {
        C22021a aVar = this.f58591j;
        if (aVar != null) {
            this.f58588g.mo4826r(C32343x.m95466m(aVar));
        }
    }

    /* renamed from: tw */
    public final void mo54719tw(long j) {
        this.f58590i = j;
        m71298qw();
    }
}
