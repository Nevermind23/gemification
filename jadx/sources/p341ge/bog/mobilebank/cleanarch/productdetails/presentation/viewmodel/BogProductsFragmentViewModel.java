package p341ge.bog.mobilebank.cleanarch.productdetails.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import g91.C32343x;
import hd1.C41204a;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import k30.C25627a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l30.C25803a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEvent;
import p341ge.bog.mobilebank.model.Client;
import p748eu.C20292b;
import p842nv.C26615g;
import p951xz.C29877a;
import p951xz.C29879c;

/* renamed from: ge.bog.mobilebank.cleanarch.productdetails.presentation.viewmodel.BogProductsFragmentViewModel */
public final class BogProductsFragmentViewModel extends C21481a {

    /* renamed from: n */
    public static final C22504a f59519n = new C22504a((DefaultConstructorMarker) null);

    /* renamed from: o */
    private static final C25627a f59520o = new C25627a(new ArrayList(), false, false, false, 12, (DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C29877a f59521d;

    /* renamed from: e */
    private final C26615g f59522e;

    /* renamed from: f */
    private final C25803a f59523f;

    /* renamed from: g */
    private final C20292b f59524g;

    /* renamed from: h */
    private final C29879c f59525h;

    /* renamed from: i */
    private final Client f59526i;

    /* renamed from: j */
    private final C41438c f59527j;

    /* renamed from: k */
    private final C1644x f59528k = new C1644x();

    /* renamed from: l */
    private final C1644x f59529l = new C1644x();

    /* renamed from: m */
    private final C1644x f59530m = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.productdetails.presentation.viewmodel.BogProductsFragmentViewModel$a */
    public static final class C22504a {
        private C22504a() {
        }

        public /* synthetic */ C22504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BogProductsFragmentViewModel(C29877a aVar, C26615g gVar, C25803a aVar2, C20292b bVar, C29879c cVar, Client client, C41438c cVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getCreditInfoPermission");
        C41536l.m120489i(gVar, "getOfferInfo");
        C41536l.m120489i(aVar2, "offersDataMapper");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(cVar, "isCreditLoanAllowedUseCase");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(cVar2, "eventBus");
        this.f59521d = aVar;
        this.f59522e = gVar;
        this.f59523f = aVar2;
        this.f59524g = bVar;
        this.f59525h = cVar;
        this.f59526i = client;
        this.f59527j = cVar2;
        cVar2.mo96185q(this);
    }

    @C41452l
    public final void onAgreementHtmlEvent(AgreementTemplateEvent agreementTemplateEvent) {
        C41536l.m120489i(agreementTemplateEvent, "agreementTemplateEvent");
        this.f59529l.mo4823o(C32343x.m95466m(agreementTemplateEvent));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f59527j.mo96186s(this);
    }
}
