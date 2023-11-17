package lc1;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import cd1.C40393c;
import ce1.C40398b;
import dd1.C40484a4;
import dd1.C40578p1;
import de1.C40640a;
import ed1.C40762x;
import gb1.C32383o;
import gd1.C40992a;
import ha1.C15458b;
import he1.C41238w;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35963s;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import sso.type.AuthElementType;
import ue1.C43075l;

/* renamed from: lc1.k */
public final class C41665k extends C15458b {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f97925n = {C41520a0.m120439e(new C41539o(C41665k.class, "enteredPassCode", "getEnteredPassCode()Ljava/lang/String;", 0))};

    /* renamed from: h */
    private final C40484a4 f97926h;

    /* renamed from: i */
    private final C40393c f97927i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C32383o f97928j = new C32383o();

    /* renamed from: k */
    private final C1644x f97929k = new C1644x();

    /* renamed from: l */
    private String f97930l = "";

    /* renamed from: m */
    private final C41555e f97931m;

    /* renamed from: lc1.k$a */
    static final class C41666a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41665k f97932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41666a(C41665k kVar) {
            super(1);
            this.f97932d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97932d.f97928j.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: lc1.k$b */
    static final class C41667b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41665k f97933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41667b(C41665k kVar) {
            super(1);
            this.f97933d = kVar;
        }

        /* renamed from: a */
        public final void mo96480a(C35963s sVar) {
            this.f97933d.f97928j.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96480a((C35963s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc1.k$c */
    public static final class C41668c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C41665k f97934a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41668c(Object obj, C41665k kVar) {
            super(obj);
            this.f97934a = kVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            String str = (String) obj;
            if (((String) obj2).length() == 4) {
                this.f97934a.m120893qw();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41665k(C40484a4 a4Var, C40393c cVar) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(a4Var, "setupSecurityParametersUseCase");
        C41536l.m120489i(cVar, "startTMXProfilingUseCase");
        this.f97926h = a4Var;
        this.f97927i = cVar;
        C41551a aVar = C41551a.f97718a;
        this.f97931m = new C41668c("", this);
    }

    /* renamed from: kw */
    private final Set m120892kw() {
        return C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final void m120893qw() {
        boolean z;
        this.f97929k.mo4826r(C35947l.C35950c.f86976a);
        if (this.f97930l.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97930l = mo96471mw();
            mo96476sw("");
        } else if (!C41536l.m120484d(this.f97930l, mo96471mw())) {
            this.f97929k.mo4826r(new C35947l.C35949b(new IllegalArgumentException()));
            m120894uw();
        } else {
            this.f97929k.mo4826r(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: uw */
    private final void m120894uw() {
        this.f97930l = "";
        mo96476sw("");
    }

    /* renamed from: lw */
    public final boolean mo96470lw() {
        return C10146d0.C10159c.m37143b().getBiometricEnabled$sso_client_release();
    }

    /* renamed from: mw */
    public final String mo96471mw() {
        return (String) this.f97931m.getValue(this, f97925n[0]);
    }

    /* renamed from: nw */
    public final boolean mo96472nw() {
        return C10146d0.C10159c.m37143b().getPassCodeEnabled$sso_client_release();
    }

    /* renamed from: ow */
    public final LiveData mo96473ow() {
        return this.f97929k;
    }

    /* renamed from: pw */
    public final LiveData mo96474pw() {
        return this.f97928j;
    }

    /* renamed from: rw */
    public final boolean mo96475rw() {
        return m120892kw().contains(AuthElementType.TRUSTED_DEVICE);
    }

    /* renamed from: sw */
    public final void mo96476sw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f97931m.setValue(this, f97925n[0], str);
    }

    /* renamed from: tw */
    public final void mo96477tw(boolean z, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        C40762x B = this.f97926h.mo94537d(z, str, str2, str3, str4).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "setupSecurityParametersU…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C41666a(this), new C41667b(this)));
    }

    /* renamed from: vw */
    public final void mo96478vw() {
        mo42540ew(this.f97927i.mo94454b(TMXFlags.TMX_FLAG_SEC_PARAMS_KEY));
    }
}
