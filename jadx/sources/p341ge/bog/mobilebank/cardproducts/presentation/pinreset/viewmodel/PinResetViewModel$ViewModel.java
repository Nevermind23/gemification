package p341ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.cardproducts.data.entity.PinResetParams;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p510ln.C16601k;
import p703zn.C19080a;
import p703zn.C19082b;
import p703zn.C19083c;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel.PinResetViewModel$ViewModel */
public final class PinResetViewModel$ViewModel extends C21481a implements C19080a, C19082b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16601k f42149d;

    /* renamed from: e */
    private final C36735g f42150e;

    /* renamed from: f */
    private final C27494a f42151f;

    /* renamed from: g */
    private final C19080a f42152g = this;

    /* renamed from: h */
    private final C19082b f42153h = this;

    /* renamed from: i */
    private final C1644x f42154i = new C1644x();

    /* renamed from: j */
    private final C1644x f42155j;

    /* renamed from: k */
    private final C40765a f42156k;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel.PinResetViewModel$ViewModel$a */
    static final class C14396a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PinResetViewModel$ViewModel f42157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14396a(PinResetViewModel$ViewModel pinResetViewModel$ViewModel) {
            super(1);
            this.f42157d = pinResetViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(PinResetParams pinResetParams) {
            C41536l.m120489i(pinResetParams, "it");
            C40749p f = this.f42157d.f42149d.mo43749a(this.f42157d.mo40280hw(pinResetParams)).mo94897f(C40749p.m118043h0(C41238w.f97225a));
            C41536l.m120488h(f, "resetPin(getOtpParamsMap…en(Observable.just(Unit))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinResetViewModel$ViewModel(C16601k kVar, C36735g gVar, C27494a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "resetPin");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        this.f42149d = kVar;
        this.f42150e = gVar;
        this.f42151f = aVar;
        C1644x xVar = new C1644x();
        this.f42155j = xVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<PinResetParams>()");
        this.f42156k = h1;
        C40749p L0 = h1.mo94989L0(new C19083c(new C14396a(this)));
        C41536l.m120488h(L0, "pinResetSubject.switchMa…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m53323ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: jw */
    private final boolean m53325jw(PinResetParams pinResetParams) {
        return (pinResetParams.getOperationId() == null || pinResetParams.getOperationReference() == null || pinResetParams.getScaAuthCode() == null) ? false : true;
    }

    /* renamed from: Wt */
    public void mo40278Wt(long j, String str, String str2, String str3) {
        Long l;
        C37228a a = this.f42150e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        PinResetParams pinResetParams = new PinResetParams(j, l, str, str2, str3);
        if (m53325jw(pinResetParams)) {
            this.f42156k.onNext(pinResetParams);
        } else {
            this.f42154i.mo4823o(C32343x.m95466m(pinResetParams));
        }
    }

    /* renamed from: gw */
    public final C19080a mo40279gw() {
        return this.f42152g;
    }

    /* renamed from: hw */
    public HashMap mo40280hw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f42151f.mo66809a(otpParams);
    }

    /* renamed from: iw */
    public final C19082b mo40281iw() {
        return this.f42153h;
    }

    /* renamed from: no */
    public LiveData mo40282no() {
        return this.f42154i;
    }

    /* renamed from: yr */
    public LiveData mo40283yr() {
        return this.f42155j;
    }
}
