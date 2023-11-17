package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import cm0.C19781a;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import g91.C32343x;
import gb1.C32393w;
import hd1.C41204a;
import java.util.Calendar;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.a */
public final class C24577a extends C21481a {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f63372i = {C41520a0.m120439e(new C41539o(C24577a.class, "filledInput", "getFilledInput()Lge/bog/mobilebank/insurance/travelinsurance/presentation/fillinfo/TravelInsuranceFilledInfo;", 0))};

    /* renamed from: d */
    private final TravelInsuranceFilledInfo f63373d;

    /* renamed from: e */
    private final C1644x f63374e = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f63375f = new C1644x();

    /* renamed from: g */
    private final C1644x f63376g = new C1644x();

    /* renamed from: h */
    private final C41555e f63377h;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.a$a */
    public interface C24578a {
        /* renamed from: a */
        C24577a mo32776a(TravelInsuranceFilledInfo travelInsuranceFilledInfo);
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.a$b */
    public static final class C24579b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C24577a f63378a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24579b(Object obj, C24577a aVar) {
            super(obj);
            this.f63378a = aVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) obj;
            this.f63378a.f63375f.mo4823o((TravelInsuranceFilledInfo) obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24577a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
        this.f63373d = travelInsuranceFilledInfo;
        C41551a aVar = C41551a.f97718a;
        this.f63377h = new C24579b(travelInsuranceFilledInfo, this);
        m78965rw(travelInsuranceFilledInfo);
    }

    /* renamed from: ew */
    private final C19781a m78962ew() {
        long W1 = C5023l.m19556W1();
        CalendarConstraints fw = m78963fw(W1);
        Long i = m78964hw().mo62725i();
        if (i != null) {
            W1 = i.longValue();
        }
        return new C19781a(fw, W1);
    }

    /* renamed from: fw */
    private final CalendarConstraints m78963fw(long j) {
        Calendar.getInstance().setTimeInMillis(j);
        CalendarConstraints.DateValidator d = CompositeDateValidator.m19386d(C41339p.m119900e(DateValidatorPointBackward.m19406a(j)));
        C41536l.m120488h(d, "allOf(validators)");
        CalendarConstraints a = new CalendarConstraints.C4986b().mo16158e(d).mo16156c(j).mo16154a();
        C41536l.m120488h(a, "Builder()\n              …\n                .build()");
        return a;
    }

    /* renamed from: hw */
    private final TravelInsuranceFilledInfo m78964hw() {
        return (TravelInsuranceFilledInfo) this.f63377h.getValue(this, f63372i[0]);
    }

    /* renamed from: rw */
    private final void m78965rw(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        this.f63377h.setValue(this, f63372i[0], travelInsuranceFilledInfo);
    }

    /* renamed from: gw */
    public LiveData mo62767gw() {
        return this.f63375f;
    }

    /* renamed from: iw */
    public LiveData mo62768iw() {
        return this.f63374e;
    }

    /* renamed from: jw */
    public LiveData mo62769jw() {
        return this.f63376g;
    }

    /* renamed from: kw */
    public void mo62770kw() {
        this.f63376g.mo4823o(C32343x.m95466m(m78962ew()));
    }

    /* renamed from: lw */
    public void mo62771lw() {
        this.f63374e.mo4823o(C32343x.m95466m(m78964hw()));
    }

    /* renamed from: mw */
    public void mo62772mw(String str) {
        C41536l.m120489i(str, "name");
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, C32393w.m95661b(str), (String) null, (String) null, (Long) null, 3932159, (Object) null));
    }

    /* renamed from: nw */
    public void mo62773nw(String str) {
        C41536l.m120489i(str, "name");
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (Long) null, 4128767, (Object) null));
    }

    /* renamed from: ow */
    public void mo62774ow(String str) {
        C41536l.m120489i(str, "personalId");
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (Long) null, 3145727, (Object) null));
    }

    /* renamed from: pw */
    public void mo62775pw(String str) {
        C41536l.m120489i(str, "surname");
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, C32393w.m95661b(str), (String) null, (Long) null, 3670015, (Object) null));
    }

    /* renamed from: qw */
    public void mo62776qw(String str) {
        C41536l.m120489i(str, "surname");
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (Long) null, 4063231, (Object) null));
    }

    /* renamed from: z4 */
    public void mo62777z4(long j) {
        m78965rw(TravelInsuranceFilledInfo.m78893b(m78964hw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Long.valueOf(j), 2097151, (Object) null));
    }
}
