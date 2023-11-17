package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17041s;
import p563pk.C17374d;
import p605sk.C17827g;
import p605sk.C17828h;
import p605sk.C17829i;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputViewModel$ViewModel */
public final class CarOwnerInputViewModel$ViewModel extends C21481a implements C17828h, C17829i {

    /* renamed from: d */
    private final C17041s f40729d;

    /* renamed from: e */
    private final C17829i f40730e = this;

    /* renamed from: f */
    private final C17828h f40731f = this;

    /* renamed from: g */
    private C1644x f40732g;

    /* renamed from: h */
    private final LiveData f40733h;

    /* renamed from: i */
    private final C1644x f40734i;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputViewModel$ViewModel$a */
    static final class C13623a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13623a f40735d = new C13623a();

        C13623a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C17827g gVar) {
            return Boolean.valueOf(gVar.mo45410c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarOwnerInputViewModel$ViewModel(C17041s sVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(sVar, "onCarOwnerEntered");
        this.f40729d = sVar;
        C1644x xVar = new C1644x(new C17827g((String) null, (String) null, (String) null, (C17374d) null, (Long) null, 31, (DefaultConstructorMarker) null));
        this.f40732g = xVar;
        this.f40733h = C1607m0.m5655c(xVar, C13623a.f40735d);
        this.f40734i = new C1644x();
    }

    /* renamed from: Ea */
    public void mo37495Ea(String str) {
        C17827g gVar;
        C41536l.m120489i(str, "firstName");
        C1644x xVar = this.f40732g;
        C17827g gVar2 = (C17827g) xVar.mo4814f();
        if (gVar2 != null) {
            gVar = C17827g.m61584b(gVar2, str, (String) null, (String) null, (C17374d) null, (Long) null, 30, (Object) null);
        } else {
            gVar = null;
        }
        xVar.mo4826r(gVar);
    }

    /* renamed from: F8 */
    public void mo37496F8(String str) {
        C17827g gVar;
        C41536l.m120489i(str, "idNumber");
        C1644x xVar = this.f40732g;
        C17827g gVar2 = (C17827g) xVar.mo4814f();
        if (gVar2 != null) {
            gVar = C17827g.m61584b(gVar2, (String) null, (String) null, str, (C17374d) null, (Long) null, 27, (Object) null);
        } else {
            gVar = null;
        }
        xVar.mo4826r(gVar);
    }

    /* renamed from: Lo */
    public void mo37497Lo(C17374d dVar) {
        C17827g gVar;
        C41536l.m120489i(dVar, "gender");
        C1644x xVar = this.f40732g;
        C17827g gVar2 = (C17827g) xVar.mo4814f();
        if (gVar2 != null) {
            gVar = C17827g.m61584b(gVar2, (String) null, (String) null, (String) null, dVar, (Long) null, 23, (Object) null);
        } else {
            gVar = null;
        }
        xVar.mo4826r(gVar);
    }

    /* renamed from: W9 */
    public void mo37498W9(String str) {
        C17827g gVar;
        C41536l.m120489i(str, "lastName");
        C1644x xVar = this.f40732g;
        C17827g gVar2 = (C17827g) xVar.mo4814f();
        if (gVar2 != null) {
            gVar = C17827g.m61584b(gVar2, (String) null, str, (String) null, (C17374d) null, (Long) null, 29, (Object) null);
        } else {
            gVar = null;
        }
        xVar.mo4826r(gVar);
    }

    /* renamed from: bp */
    public C17827g mo37500bp() {
        Object f = this.f40732g.mo4814f();
        C41536l.m120486f(f);
        return (C17827g) f;
    }

    /* renamed from: cc */
    public void mo37501cc() {
        C37224b.m109966e(mo37499Xf(), mo37500bp().mo45414f());
    }

    /* renamed from: dw */
    public final C17828h mo37502dw() {
        return this.f40731f;
    }

    /* renamed from: ew */
    public C1644x mo37499Xf() {
        return this.f40734i;
    }

    /* renamed from: fw */
    public final C17829i mo37504fw() {
        return this.f40730e;
    }

    /* renamed from: gw */
    public void mo37505gw() {
        if (mo37500bp().mo45410c()) {
            C17041s sVar = this.f40729d;
            String e = mo37500bp().mo45412e();
            String h = mo37500bp().mo45416h();
            String g = mo37500bp().mo45415g();
            C17374d f = mo37500bp().mo45414f();
            Long d = mo37500bp().mo45411d();
            C41536l.m120486f(d);
            sVar.mo44232a(e, h, g, f, d.longValue());
        }
    }

    /* renamed from: m9 */
    public LiveData mo37506m9() {
        return this.f40733h;
    }

    /* renamed from: z4 */
    public void mo37507z4(long j) {
        C1644x xVar = this.f40732g;
        C17827g gVar = (C17827g) xVar.mo4814f();
        xVar.mo4826r(gVar != null ? C17827g.m61584b(gVar, (String) null, (String) null, (String) null, (C17374d) null, Long.valueOf(j), 15, (Object) null) : null);
    }
}
