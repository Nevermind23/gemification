package da1;

import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import rc1.C42355a;
import rc1.C42357b;
import sso.type.AuthElementType;

/* renamed from: da1.i */
public final class C12043i extends C12030b {

    /* renamed from: c */
    private C42355a f35440c;

    /* renamed from: da1.i$a */
    public /* synthetic */ class C12044a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35441a;

        static {
            int[] iArr = new int[AuthElementType.values().length];
            iArr[AuthElementType.BIOMETRY.ordinal()] = 1;
            iArr[AuthElementType.OTP.ordinal()] = 2;
            iArr[AuthElementType.PASSCODE.ordinal()] = 3;
            iArr[AuthElementType.PASSWORD.ordinal()] = 4;
            f35441a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12043i(C12038f fVar, C42355a aVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
        this.f35440c = aVar;
    }

    /* renamed from: h */
    public static /* synthetic */ void m44222h(C12043i iVar, C42357b bVar, AuthElementType authElementType, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            authElementType = null;
        }
        iVar.mo32169g(bVar, authElementType);
    }

    /* renamed from: a */
    public void mo32123a() {
        C42355a aVar = this.f35440c;
        if (aVar != null) {
            aVar.mo97799j();
        }
        C42355a aVar2 = this.f35440c;
        boolean z = false;
        if (aVar2 != null && aVar2.mo97798i()) {
            z = true;
        }
        if (z) {
            m44222h(this, (C42357b) null, (AuthElementType) null, 3, (Object) null);
        } else {
            mo32125c().mo32156o().mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: f */
    public final void mo32168f() {
        mo32125c().mo32156o().mo4823o(C41238w.f97225a);
    }

    /* renamed from: g */
    public final void mo32169g(C42357b bVar, AuthElementType authElementType) {
        int i;
        AuthElementType authElementType2 = null;
        if (bVar == null) {
            C42355a aVar = this.f35440c;
            if (aVar != null) {
                bVar = aVar.mo97796d(authElementType);
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            authElementType2 = bVar.mo97802a();
        }
        if (authElementType2 == null) {
            i = -1;
        } else {
            i = C12044a.f35441a[authElementType2.ordinal()];
        }
        if (i == 1) {
            mo32125c().mo32145d().mo4823o(C41238w.f97225a);
        } else if (i == 2) {
            mo32125c().mo32150i().mo4823o(C41238w.f97225a);
        } else if (i == 3) {
            mo32125c().mo32151j().mo4823o(Boolean.valueOf(bVar.mo97808f()));
        } else if (i != 4) {
            C42355a aVar2 = this.f35440c;
            if (aVar2 != null) {
                aVar2.mo97795b();
            }
            mo32125c().mo32157p().mo4823o(C41238w.f97225a);
        } else {
            mo32125c().mo32153l().mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: i */
    public final void mo32170i() {
        C42355a aVar = this.f35440c;
        if (aVar != null) {
            aVar.mo97799j();
        }
    }

    /* renamed from: j */
    public final void mo32171j(List list) {
        mo32125c().mo32162u(list);
        mo32127e();
    }

    /* renamed from: k */
    public final void mo32172k() {
        C42357b bVar;
        C42355a aVar = this.f35440c;
        if (aVar != null) {
            bVar = aVar.mo97800k();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            m44222h(this, bVar, (AuthElementType) null, 2, (Object) null);
        }
    }

    /* renamed from: l */
    public final C42357b mo32173l() {
        C42355a aVar = this.f35440c;
        if (aVar != null) {
            return aVar.mo97797f();
        }
        return null;
    }
}
