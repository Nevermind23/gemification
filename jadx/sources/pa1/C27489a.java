package pa1;

import af1.C40303i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1644x;
import ce1.C40397a;
import ce1.C40398b;
import dd1.C40505e0;
import dd1.C40624w3;
import de1.C40640a;
import ed1.C40734b;
import ei1.C40894a;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.sso_client.models.C35947l;
import sso.type.AuthTokenType;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: pa1.a */
public final class C27489a extends C1613n0 {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f70373j = {C41520a0.m120439e(new C41539o(C27489a.class, "enteredPassCode", "getEnteredPassCode()Ljava/lang/String;", 0))};

    /* renamed from: d */
    private final C40624w3 f70374d;

    /* renamed from: e */
    private final C40505e0 f70375e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f70376f = new C1644x();

    /* renamed from: g */
    private final C41204a f70377g = new C41204a();

    /* renamed from: h */
    private String f70378h = "";

    /* renamed from: i */
    private final C41555e f70379i;

    /* renamed from: pa1.a$a */
    static final class C27490a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27489a f70380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27490a(C27489a aVar) {
            super(1);
            this.f70380d = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f70380d.m85270jw();
            this.f70380d.f70376f.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: pa1.a$b */
    static final class C27491b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27489a f70381d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27491b(C27489a aVar) {
            super(0);
            this.f70381d = aVar;
        }

        public final void invoke() {
            this.f70381d.f70376f.mo4826r(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: pa1.a$c */
    public static final class C27492c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C27489a f70382a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27492c(Object obj, C27489a aVar) {
            super(obj);
            this.f70382a = aVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            String str = (String) obj;
            if (((String) obj2).length() == 4) {
                this.f70382a.m85269hw();
            }
        }
    }

    public C27489a(C40624w3 w3Var, C40505e0 e0Var) {
        C41536l.m120489i(w3Var, "setPassCodeUseCase");
        C41536l.m120489i(e0Var, "generateTokenUseCase");
        this.f70374d = w3Var;
        this.f70375e = e0Var;
        C41551a aVar = C41551a.f97718a;
        this.f70379i = new C27492c("", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public final void m85269hw() {
        boolean z;
        this.f70376f.mo4826r(C35947l.C35950c.f86976a);
        if (this.f70378h.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f70378h = mo66802gw();
            mo66803iw("");
        } else if (!C41536l.m120484d(this.f70378h, mo66802gw())) {
            this.f70376f.mo4826r(new C35947l.C35949b(new IllegalArgumentException()));
            m85270jw();
        } else {
            C40734b z2 = C40734b.m117919j(this.f70374d.mo94628c(mo66802gw()), this.f70375e.mo94550d(AuthTokenType.PASSCODE)).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
            C41536l.m120488h(z2, "concatArray(\n           …dSchedulers.mainThread())");
            C40397a.m116967a(C40398b.m116971d(z2, new C27490a(this), new C27491b(this)), this.f70377g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public final void m85270jw() {
        this.f70378h = "";
        mo66803iw("");
    }

    /* renamed from: gw */
    public final String mo66802gw() {
        return (String) this.f70379i.getValue(this, f70373j[0]);
    }

    /* renamed from: iw */
    public final void mo66803iw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f70379i.setValue(this, f70373j[0], str);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f70377g.dispose();
        super.onCleared();
    }
}
