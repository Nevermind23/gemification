package gm0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40762x;
import g91.C32319m;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import tl0.C28463c;
import ue1.C43064a;
import ue1.C43075l;
import ul0.C28877d;

/* renamed from: gm0.j */
public final class C24772j extends C21481a implements C24769g, C24770h {

    /* renamed from: d */
    private final C28463c f63664d;

    /* renamed from: e */
    private final Client f63665e;

    /* renamed from: f */
    private final int f63666f;

    /* renamed from: g */
    private final C24769g f63667g = this;

    /* renamed from: h */
    private final C24770h f63668h = this;

    /* renamed from: i */
    private final C1644x f63669i = new C1644x();

    /* renamed from: j */
    private final C1644x f63670j = new C1644x();

    /* renamed from: k */
    private final C1644x f63671k = new C1644x();

    /* renamed from: gm0.j$a */
    /* synthetic */ class C24773a extends C41535k implements C43075l {
        C24773a(Object obj) {
            super(1, obj, C37224b.class, "postEvent", "postEvent(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo63176b(C28877d dVar) {
            C41536l.m120489i(dVar, "p0");
            C37224b.m109965d((C1644x) this.receiver, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63176b((C28877d) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24772j(C28463c cVar, Client client, int i) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "policyUrlUseCase");
        C41536l.m120489i(client, "client");
        this.f63664d = cVar;
        this.f63665e = client;
        this.f63666f = i;
        bindToLifecycle(C32343x.m95490u(C32343x.m95465l1(cVar.mo68089a(i)), (C43064a) null, (C43075l) null, (C43075l) null, 7, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final void m79363fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    private final String m79364hw(Long l) {
        String str;
        if (l != null) {
            str = C32319m.m95297d(l.longValue(), "dd.MM.yyyy");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public LiveData mo63170a() {
        return this.f63671k;
    }

    /* renamed from: ew */
    public void mo63171ew(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        String str;
        String str2;
        String str3;
        Long l;
        if (travelInsuranceFilledInfo != null) {
            UserInfo client = this.f63665e.getUserInfo().getClient();
            if (travelInsuranceFilledInfo.mo62732r() == InsurancePersonType.ME) {
                str = client.firstNameInt;
                C41536l.m120488h(str, "clientInfo.firstNameInt");
                str3 = client.lastNameInt;
                C41536l.m120488h(str3, "clientInfo.lastNameInt");
                str2 = client.pin;
                C41536l.m120488h(str2, "clientInfo.pin");
                l = client.birthDate;
            } else {
                String k = travelInsuranceFilledInfo.mo62727k();
                String str4 = "";
                if (k == null) {
                    k = str4;
                }
                String m = travelInsuranceFilledInfo.mo62729m();
                if (m == null) {
                    m = str4;
                }
                String p = travelInsuranceFilledInfo.mo62730p();
                if (p != null) {
                    str4 = p;
                }
                String str5 = k;
                l = travelInsuranceFilledInfo.mo62725i();
                str = str5;
                String str6 = m;
                str2 = str4;
                str3 = str6;
            }
            this.f63671k.mo4823o(new C24767e(str, str3, str2, m79364hw(l)));
        }
    }

    /* renamed from: gw */
    public C1644x mo63169Sn() {
        return this.f63670j;
    }

    /* renamed from: iw */
    public final C24769g mo63173iw() {
        return this.f63667g;
    }

    /* renamed from: jw */
    public final C24770h mo63174jw() {
        return this.f63668h;
    }

    /* renamed from: kw */
    public C1644x mo63168G4() {
        return this.f63669i;
    }

    /* renamed from: rk */
    public void mo63167rk() {
        C40762x m = this.f63664d.mo68089a(this.f63666f).mo95084m(new C24771i(new C24773a(mo63169Sn())));
        C41536l.m120488h(m, "policyUrlUseCase(docKey)…downloadEvent::postEvent)");
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(C32343x.m95465l1(m), -1), mo63168G4()));
    }
}
