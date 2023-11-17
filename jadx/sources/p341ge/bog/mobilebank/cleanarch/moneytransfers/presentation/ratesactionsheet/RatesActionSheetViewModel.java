package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p763fz.C20584f;
import p826lz.C26110d;
import p826lz.C26111e;
import p826lz.C26112f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel */
public final class RatesActionSheetViewModel extends C21481a {

    /* renamed from: d */
    private final C20584f f57010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f57011e = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel$a */
    static final class C21228a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RatesActionSheetViewModel f57012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21228a(RatesActionSheetViewModel ratesActionSheetViewModel) {
            super(1);
            this.f57012d = ratesActionSheetViewModel;
        }

        /* renamed from: a */
        public final void mo53219a(C41205b bVar) {
            C21484c.m69417i(this.f57012d.f57011e, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53219a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel$b */
    static final class C21229b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RatesActionSheetViewModel f57013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21229b(RatesActionSheetViewModel ratesActionSheetViewModel) {
            super(1);
            this.f57013d = ratesActionSheetViewModel;
        }

        /* renamed from: a */
        public final void mo53220a(CcyRatesWrapper ccyRatesWrapper) {
            C1644x gw = this.f57013d.f57011e;
            C41536l.m120488h(ccyRatesWrapper, "it");
            C21484c.m69418j(gw, ccyRatesWrapper);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53220a((CcyRatesWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel$c */
    static final class C21230c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RatesActionSheetViewModel f57014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21230c(RatesActionSheetViewModel ratesActionSheetViewModel) {
            super(1);
            this.f57014d = ratesActionSheetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57014d.f57011e, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatesActionSheetViewModel(C20584f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "remmitanceRatesUseCase");
        this.f57010d = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m68788jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m68789kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m68790lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final LiveData mo53217hw() {
        return this.f57011e;
    }

    /* renamed from: iw */
    public final void mo53218iw() {
        C41205b I = this.f57010d.mo49121a().mo95083l(new C26110d(new C21228a(this))).mo95070I(new C26111e(new C21229b(this)), new C26112f(new C21230c(this)));
        C41536l.m120488h(I, "fun loadRates() {\n      …).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }
}
