package j21;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.ChangeDailyLimitsParams;
import p523mm.C16723a;
import pc0.C27494a;

/* renamed from: j21.f */
public final class C36721f extends C21481a implements C36718d, C36720e {

    /* renamed from: d */
    private final C16723a f88604d;

    /* renamed from: e */
    private final C27494a f88605e;

    /* renamed from: f */
    private final long f88606f;

    /* renamed from: g */
    private final List f88607g;

    /* renamed from: h */
    private final C36718d f88608h = this;

    /* renamed from: i */
    private final C36720e f88609i = this;

    /* renamed from: j */
    private final C1644x f88610j = new C1644x(Boolean.FALSE);

    /* renamed from: k */
    private final C1644x f88611k = new C1644x();

    /* renamed from: l */
    private final C1644x f88612l = new C1644x();

    /* renamed from: m */
    private final C1644x f88613m = new C1644x();

    /* renamed from: n */
    private final C1644x f88614n;

    /* renamed from: o */
    private CardDailyLimitUiModel f88615o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36721f(C16723a aVar, C27494a aVar2, long j, List list) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "changeDailyLimitsUseCase");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(list, "providedLimits");
        this.f88604d = aVar;
        this.f88605e = aVar2;
        this.f88606f = j;
        this.f88607g = list;
        C1644x xVar = new C1644x();
        this.f88614n = xVar;
        xVar.mo4823o(list);
    }

    /* renamed from: gw */
    private final boolean m108877gw(ChangeDailyLimitsParams changeDailyLimitsParams) {
        return (changeDailyLimitsParams.getOperationId() == null || changeDailyLimitsParams.getOperationReference() == null || changeDailyLimitsParams.getScaAuthCode() == null) ? false : true;
    }

    /* renamed from: N9 */
    public LiveData mo89531N9() {
        return this.f88611k;
    }

    /* renamed from: Nv */
    public LiveData mo89532Nv() {
        return this.f88610j;
    }

    /* renamed from: Wd */
    public void mo89530Wd(Long l, String str, String str2, String str3, String str4) {
        String str5;
        String valueOf = String.valueOf(this.f88606f);
        CardDailyLimitUiModel cardDailyLimitUiModel = this.f88615o;
        if (cardDailyLimitUiModel != null) {
            str5 = cardDailyLimitUiModel.mo84222a();
        } else {
            str5 = null;
        }
        ChangeDailyLimitsParams changeDailyLimitsParams = new ChangeDailyLimitsParams(valueOf, str5, (String) null, str2, str3, str4, 4, (DefaultConstructorMarker) null);
        if (!m108877gw(changeDailyLimitsParams)) {
            this.f88611k.mo4823o(C32343x.m95466m(changeDailyLimitsParams));
        } else {
            bindToLifecycle(C31270e.m92876e(C31270e.m92878g(this.f88604d.mo43854a(mo89536ew(changeDailyLimitsParams)), -1), this.f88613m));
        }
    }

    /* renamed from: Ys */
    public LiveData mo89533Ys() {
        return this.f88614n;
    }

    /* renamed from: dw */
    public final C36718d mo89535dw() {
        return this.f88608h;
    }

    /* renamed from: ew */
    public HashMap mo89536ew(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f88605e.mo66809a(otpParams);
    }

    /* renamed from: fw */
    public final C36720e mo89537fw() {
        return this.f88609i;
    }

    /* renamed from: hw */
    public void mo89538hw(CardDailyLimitUiModel cardDailyLimitUiModel) {
        boolean z;
        C41536l.m120489i(cardDailyLimitUiModel, "selectedLimitType");
        this.f88615o = cardDailyLimitUiModel;
        C1644x xVar = this.f88610j;
        if (cardDailyLimitUiModel.mo84222a().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        xVar.mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: i4 */
    public LiveData mo89534i4() {
        return this.f88613m;
    }
}
