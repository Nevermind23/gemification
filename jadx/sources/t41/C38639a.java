package t41;

import ba1.C10146d0;
import d51.C31538a;
import d51.C31540c;
import i41.C36354b;
import java.util.LinkedHashSet;
import java.util.Set;
import k41.C36869a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37350a;
import of1.C41869b0;
import of1.C41931v;
import p341ge.bog.mobilebank.rest.model.BogUrlHelper;
import p341ge.bog.sso_client.models.DeviceIdentifier;

/* renamed from: t41.a */
public final class C38639a {

    /* renamed from: f */
    public static final C38643d f92499f = new C38643d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C36869a f92500a;

    /* renamed from: b */
    private final C37350a f92501b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C31538a f92502c;

    /* renamed from: d */
    private final C31540c f92503d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36354b f92504e;

    /* renamed from: t41.a$a */
    private abstract class C38640a extends C38641b {
        public C38640a() {
            super();
        }

        /* renamed from: a */
        public C38646g mo92281a(boolean z) {
            mo92293m("x-os-version", C38639a.this.f92500a.mo89796d(), z);
            return this;
        }

        /* renamed from: b */
        public C38646g mo92282b(boolean z) {
            mo92293m("x-channel", C38639a.this.m113238g(), z);
            return this;
        }

        /* renamed from: c */
        public C38646g mo92283c(boolean z) {
            String str;
            if (C38639a.this.f92504e.invoke()) {
                str = "Y";
            } else {
                str = "N";
            }
            mo92293m("x-dark-mode", str, z);
            return this;
        }

        /* renamed from: d */
        public C38646g mo92284d(boolean z) {
            mo92293m("x-os", C38639a.this.f92500a.mo89795c(), z);
            return this;
        }

        /* renamed from: f */
        public C38646g mo92285f(boolean z) {
            mo92293m("x-app-version", C38639a.this.f92500a.mo89793a(), z);
            return this;
        }

        /* renamed from: g */
        public C38646g mo92286g(boolean z) {
            mo92293m("x-lang", C38639a.this.m113239h(), z);
            return this;
        }

        /* renamed from: i */
        public C38646g mo92287i(boolean z) {
            String str;
            DeviceIdentifier g = C10146d0.C10148b.m37109g();
            if (g != null) {
                str = g.getExtCustomerId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            mo92293m("x-ext-customer-id", str, z);
            return this;
        }

        /* renamed from: j */
        public C38646g mo92288j(boolean z) {
            mo92293m("x-device", C38639a.this.f92500a.mo89794b(), z);
            return this;
        }

        /* renamed from: k */
        public C38646g mo92289k(boolean z) {
            mo92293m("x-token", C38639a.this.f92502c.invoke(), z);
            return this;
        }
    }

    /* renamed from: t41.a$b */
    private abstract class C38641b implements C38646g {

        /* renamed from: a */
        private final Set f92506a = new LinkedHashSet();

        public C38641b() {
        }

        /* renamed from: e */
        public C38646g mo92290e(boolean z) {
            mo92293m("userAddress", "", z);
            return this;
        }

        /* renamed from: h */
        public C38646g mo92291h(boolean z) {
            mo92293m("userId", C38639a.this.m113240i(), z);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final Set mo92292l() {
            return this.f92506a;
        }

        /* renamed from: m */
        public C38646g mo92293m(String str, String str2, boolean z) {
            C41536l.m120489i(str, "name");
            C38648h hVar = new C38648h(str, str2, z);
            this.f92506a.remove(hVar);
            this.f92506a.add(hVar);
            return this;
        }
    }

    /* renamed from: t41.a$c */
    private abstract class C38642c extends C38641b {
        public C38642c() {
            super();
        }

        /* renamed from: a */
        public C38646g mo92281a(boolean z) {
            mo92293m("osVersion", C38639a.this.f92500a.mo89796d(), z);
            return this;
        }

        /* renamed from: b */
        public C38646g mo92282b(boolean z) {
            mo92293m("channel", C38639a.this.m113238g(), z);
            return this;
        }

        /* renamed from: c */
        public C38646g mo92283c(boolean z) {
            String str;
            if (C38639a.this.f92504e.invoke()) {
                str = "Y";
            } else {
                str = "N";
            }
            mo92293m("darkMode", str, z);
            return this;
        }

        /* renamed from: d */
        public C38646g mo92284d(boolean z) {
            mo92293m("os", C38639a.this.f92500a.mo89795c(), z);
            return this;
        }

        /* renamed from: f */
        public C38646g mo92285f(boolean z) {
            mo92293m("appVersion", C38639a.this.f92500a.mo89793a(), z);
            return this;
        }

        /* renamed from: g */
        public C38646g mo92286g(boolean z) {
            mo92293m("langCode", C38639a.this.m113239h(), z);
            return this;
        }

        /* renamed from: i */
        public C38646g mo92287i(boolean z) {
            String str;
            DeviceIdentifier g = C10146d0.C10148b.m37109g();
            if (g != null) {
                str = g.getExtCustomerId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            mo92293m("extCustomerId", str, z);
            return this;
        }

        /* renamed from: j */
        public C38646g mo92288j(boolean z) {
            mo92293m("device", C38639a.this.f92500a.mo89794b(), z);
            return this;
        }

        /* renamed from: k */
        public C38646g mo92289k(boolean z) {
            mo92293m("keycloakSessionToken", C38639a.this.f92502c.invoke(), z);
            return this;
        }
    }

    /* renamed from: t41.a$d */
    public static final class C38643d {
        private C38643d() {
        }

        public /* synthetic */ C38643d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: t41.a$e */
    private final class C38644e extends C38640a {

        /* renamed from: d */
        private final C41869b0 f92509d;

        /* renamed from: e */
        final /* synthetic */ C38639a f92510e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38644e(C38639a aVar, C41869b0 b0Var) {
            super();
            C41536l.m120489i(b0Var, "request");
            this.f92510e = aVar;
            this.f92509d = b0Var;
        }

        /* renamed from: n */
        public C41869b0 get() {
            C41869b0.C41870a h = this.f92509d.mo96679h();
            for (C38648h hVar : mo92292l()) {
                String a = hVar.mo92297a();
                String b = hVar.mo92298b();
                if ((hVar.mo92299c() || this.f92509d.mo96675d(a) == null) && b != null) {
                    h.mo96691i(a, b);
                }
            }
            return h.mo96684b();
        }
    }

    /* renamed from: t41.a$f */
    private final class C38645f extends C38642c {

        /* renamed from: d */
        private final C41869b0 f92511d;

        /* renamed from: e */
        final /* synthetic */ C38639a f92512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38645f(C38639a aVar, C41869b0 b0Var) {
            super();
            C41536l.m120489i(b0Var, "request");
            this.f92512e = aVar;
            this.f92511d = b0Var;
        }

        /* renamed from: n */
        public C41869b0 get() {
            C41931v.C41932a k = this.f92511d.mo96681j().mo96956k();
            for (C38648h hVar : mo92292l()) {
                String a = hVar.mo92297a();
                String b = hVar.mo92298b();
                if ((hVar.mo92299c() || this.f92511d.mo96681j().mo96961q(a) == null) && b != null) {
                    k.mo96976J(a, b);
                }
            }
            return this.f92511d.mo96679h().mo96706x(k.mo96981c()).mo96684b();
        }
    }

    /* renamed from: t41.a$g */
    public interface C38646g {

        /* renamed from: t41.a$g$a */
        public static final class C38647a {
            /* renamed from: a */
            public static /* synthetic */ C38646g m113278a(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92285f(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appVersion");
            }

            /* renamed from: b */
            public static /* synthetic */ C38646g m113279b(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92282b(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: channel");
            }

            /* renamed from: c */
            public static /* synthetic */ C38646g m113280c(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92283c(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: darkMode");
            }

            /* renamed from: d */
            public static /* synthetic */ C38646g m113281d(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92288j(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: device");
            }

            /* renamed from: e */
            public static /* synthetic */ C38646g m113282e(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92287i(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extCustomerId");
            }

            /* renamed from: f */
            public static /* synthetic */ C38646g m113283f(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92286g(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: language");
            }

            /* renamed from: g */
            public static /* synthetic */ C38646g m113284g(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92284d(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: os");
            }

            /* renamed from: h */
            public static /* synthetic */ C38646g m113285h(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92281a(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: osVersion");
            }

            /* renamed from: i */
            public static /* synthetic */ C38646g m113286i(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    return gVar.mo92289k(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sessionToken");
            }

            /* renamed from: j */
            public static /* synthetic */ C38646g m113287j(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92290e(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userAddress");
            }

            /* renamed from: k */
            public static /* synthetic */ C38646g m113288k(C38646g gVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = false;
                    }
                    return gVar.mo92291h(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userId");
            }
        }

        /* renamed from: a */
        C38646g mo92281a(boolean z);

        /* renamed from: b */
        C38646g mo92282b(boolean z);

        /* renamed from: c */
        C38646g mo92283c(boolean z);

        /* renamed from: d */
        C38646g mo92284d(boolean z);

        /* renamed from: e */
        C38646g mo92290e(boolean z);

        /* renamed from: f */
        C38646g mo92285f(boolean z);

        /* renamed from: g */
        C38646g mo92286g(boolean z);

        Object get();

        /* renamed from: h */
        C38646g mo92291h(boolean z);

        /* renamed from: i */
        C38646g mo92287i(boolean z);

        /* renamed from: j */
        C38646g mo92288j(boolean z);

        /* renamed from: k */
        C38646g mo92289k(boolean z);
    }

    /* renamed from: t41.a$h */
    private static final class C38648h {

        /* renamed from: a */
        private final String f92513a;

        /* renamed from: b */
        private final String f92514b;

        /* renamed from: c */
        private final boolean f92515c;

        public C38648h(String str, String str2, boolean z) {
            C41536l.m120489i(str, "name");
            this.f92513a = str;
            this.f92514b = str2;
            this.f92515c = z;
        }

        /* renamed from: a */
        public final String mo92297a() {
            return this.f92513a;
        }

        /* renamed from: b */
        public final String mo92298b() {
            return this.f92514b;
        }

        /* renamed from: c */
        public final boolean mo92299c() {
            return this.f92515c;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C38648h) && C41536l.m120484d(((C38648h) obj).f92513a, this.f92513a);
        }

        public int hashCode() {
            return this.f92513a.hashCode();
        }

        public String toString() {
            String str = this.f92513a;
            String str2 = this.f92514b;
            boolean z = this.f92515c;
            return "RequestParam(name=" + str + ", value=" + str2 + ", overwrite=" + z + ")";
        }
    }

    public C38639a(C36869a aVar, C37350a aVar2, C31538a aVar3, C31540c cVar, C36354b bVar) {
        C41536l.m120489i(aVar, "deviceInfo");
        C41536l.m120489i(aVar2, "languageStore");
        C41536l.m120489i(aVar3, "accessTokenProvider");
        C41536l.m120489i(cVar, "isLoggedIn");
        C41536l.m120489i(bVar, "isInNightMode");
        this.f92500a = aVar;
        this.f92501b = aVar2;
        this.f92502c = aVar3;
        this.f92503d = cVar;
        this.f92504e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final String m113238g() {
        return this.f92503d.invoke() ? "MOBILE" : BogUrlHelper.CHANNEL_MOBILE_EXT;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final String m113239h() {
        return this.f92501b.getLanguage().mo90433b();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final String m113240i() {
        return this.f92503d.invoke() ? "MOBILE" : BogUrlHelper.USER_ID_EXT;
    }

    /* renamed from: j */
    public final C38646g mo92279j(C41869b0 b0Var) {
        C41536l.m120489i(b0Var, "request");
        return new C38644e(this, b0Var);
    }

    /* renamed from: k */
    public final C38646g mo92280k(C41869b0 b0Var) {
        C41536l.m120489i(b0Var, "request");
        return new C38645f(this, b0Var);
    }
}
