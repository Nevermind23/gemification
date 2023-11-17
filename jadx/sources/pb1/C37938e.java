package pb1;

import ba1.C10145d;
import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40762x;
import hb1.C36175k;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob1.C37704a;
import p217q2.C7843j;
import p341ge.bog.sso_client.onboarding.model.AddressUiModel;
import p341ge.bog.sso_client.onboarding.model.LegalAddressUiModel;
import rb1.C38319a;
import sso.queery.AddActualAddressQuery;
import sso.queery.GetCountriesQuery;
import sso.queery.GetLegalAddressQuery;
import sso.queery.GetRegionsQuery;
import ue1.C43075l;

/* renamed from: pb1.e */
public final class C37938e implements C38319a {

    /* renamed from: a */
    private final C36175k f91074a;

    /* renamed from: b */
    private final C37704a f91075b;

    public C37938e(C36175k kVar, C37704a aVar) {
        C41536l.m120489i(kVar, "apollo");
        C41536l.m120489i(aVar, "mapper");
        this.f91074a = kVar;
        this.f91075b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final List m111494h(C37938e eVar, C7843j jVar) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(jVar, "it");
        C37704a aVar = eVar.f91075b;
        Object b = jVar.mo22784b();
        C41536l.m120486f(b);
        GetCountriesQuery.RegistrationServices registrationServices = ((GetCountriesQuery.Data) b).getRegistrationServices();
        C41536l.m120486f(registrationServices);
        GetCountriesQuery.GetCountries getCountries = registrationServices.getGetCountries();
        C41536l.m120486f(getCountries);
        return aVar.mo90899b(getCountries);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final LegalAddressUiModel m111495i(C37938e eVar, C7843j jVar) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(jVar, "it");
        C37704a aVar = eVar.f91075b;
        Object b = jVar.mo22784b();
        C41536l.m120486f(b);
        GetLegalAddressQuery.RegistrationServices registrationServices = ((GetLegalAddressQuery.Data) b).getRegistrationServices();
        C41536l.m120486f(registrationServices);
        return aVar.mo90898a(registrationServices.getGetLegalAddress());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final LegalAddressUiModel m111496j(Throwable th) {
        C41536l.m120489i(th, "it");
        return new LegalAddressUiModel((AddressUiModel) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final List m111497k(C37938e eVar, C7843j jVar) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(jVar, "it");
        C37704a aVar = eVar.f91075b;
        Object b = jVar.mo22784b();
        C41536l.m120486f(b);
        GetRegionsQuery.RegistrationServices registrationServices = ((GetRegionsQuery.Data) b).getRegistrationServices();
        C41536l.m120486f(registrationServices);
        GetRegionsQuery.GetRegions getRegions = registrationServices.getGetRegions();
        C41536l.m120486f(getRegions);
        return aVar.mo90900c(getRegions);
    }

    /* renamed from: a */
    public C40762x mo91291a() {
        C40762x A = C36175k.m107584j(this.f91074a, new GetCountriesQuery(C10146d0.C10176g.m37221b()), false, (C43075l) null, 6, (Object) null).mo95062A(new C37934a(this));
        C41536l.m120488h(A, "apollo.createSingleQuery…ountries!!)\n            }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo91292b(String str) {
        C41536l.m120489i(str, "country");
        C40762x A = C36175k.m107584j(this.f91074a, new GetRegionsQuery(C10146d0.C10176g.m37221b(), str), false, (C43075l) null, 6, (Object) null).mo95062A(new C37935b(this));
        C41536l.m120488h(A, "apollo.createSingleQuery…!.getRegions!!)\n        }");
        return A;
    }

    /* renamed from: c */
    public C40734b mo91293c(String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "country");
        C41536l.m120489i(str2, "region");
        C41536l.m120489i(str3, "addressLine");
        return C36175k.m107582f(this.f91074a, new AddActualAddressQuery(C10146d0.C10176g.m37221b(), str, str2, str3, C10145d.m37094h(Boolean.valueOf(z))), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: d3 */
    public C40762x mo91294d3() {
        C40762x D = C36175k.m107584j(this.f91074a, new GetLegalAddressQuery(C10146d0.C10176g.m37221b()), false, (C43075l) null, 6, (Object) null).mo95062A(new C37936c(this)).mo95065D(new C37937d());
        C41536l.m120488h(D, "apollo.createSingleQuery…{ LegalAddressUiModel() }");
        return D;
    }
}
