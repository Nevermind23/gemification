package ba1;

import ad1.C40281a;
import ad1.C40284d;
import ad1.C40285e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1644x;
import ca1.C10379a;
import ce1.C40397a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import dd1.C40482a3;
import dd1.C40521g2;
import dd1.C40527h2;
import dd1.C40574o4;
import dd1.C40588q3;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40736c;
import fh1.C40951a;
import fh1.C40952b;
import gh1.C41125a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import hh1.C41267b;
import hh1.C41268c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35938f;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.security_settings.SecuritySettingsActivity;
import p341ge.bog.sso_client.signin.SignInActivity;
import qa1.C27700a1;
import qc1.C42216e0;
import sso.type.AuthElementType;
import sso.type.ProcessFlow;
import ue1.C43064a;
import ue1.C43075l;
import va1.C39263a;
import va1.C39266b;
import va1.C39270c;
import va1.C39274d;
import va1.C39277e;
import va1.C39281f;
import va1.C39288g;
import va1.C39302h;
import va1.C39311i;
import va1.C39312j;
import va1.C39318k;
import va1.C39407l;
import xg1.C43288a;

/* renamed from: ba1.d0 */
public final class C10146d0 {

    /* renamed from: c */
    public static final C10171d f28134c = new C10171d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C1644x f28135d = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C1644x f28136e = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C10146d0 f28137f;

    /* renamed from: a */
    private final ComponentName f28138a;

    /* renamed from: b */
    private final ComponentName f28139b;

    /* renamed from: ba1.d0$a */
    static final class C10147a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Context f28140d;

        /* renamed from: e */
        final /* synthetic */ C10172e f28141e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10147a(Context context, C10172e eVar) {
            super(1);
            this.f28140d = context;
            this.f28141e = eVar;
        }

        /* renamed from: a */
        public final void mo26672a(C40952b bVar) {
            C41536l.m120489i(bVar, "$this$startKoin");
            C43288a.m124321a(bVar, this.f28140d);
            bVar.mo95351g(C39302h.m114449a(this.f28141e), C39312j.m114464d(), C39281f.m114424d(), C39288g.m114435a(), C39318k.m114473a(), C39407l.m114562a(), C39270c.m114410a(), C39266b.m114406a(), C39263a.m114402b(), C39277e.m114417a(), C39274d.m114414a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26672a((C40952b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ba1.d0$b */
    public static final class C10148b {

        /* renamed from: a */
        public static final C10148b f28142a = new C10148b();

        /* renamed from: b */
        private static final C41217g f28143b = C41219i.m119470b(C10157i.f28155d);

        /* renamed from: c */
        private static boolean f28144c;

        /* renamed from: d */
        private static final C41217g f28145d = C41219i.m119470b(C10151c.f28149d);

        /* renamed from: e */
        private static C40736c f28146e;

        /* renamed from: f */
        private static C10149a f28147f;

        /* renamed from: ba1.d0$b$a */
        public interface C10149a {
            void invoke();
        }

        /* renamed from: ba1.d0$b$b */
        public static final class C10150b implements C41125a {

            /* renamed from: a */
            private final Object f28148a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40527h2.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26680b() {
                return this.f28148a;
            }
        }

        /* renamed from: ba1.d0$b$c */
        static final class C10151c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C10151c f28149d = new C10151c();

            C10151c() {
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final void m37128c(C40736c cVar) {
                C41536l.m120489i(cVar, "it");
                C10148b.f28142a.mo26677s(cVar);
            }

            /* renamed from: b */
            public final C40734b invoke() {
                C40734b k = C40734b.m117920k(new C10193f0());
                C41536l.m120488h(k, "create {\n               …mitter = it\n            }");
                return k;
            }
        }

        /* renamed from: ba1.d0$b$d */
        public static final class C10152d implements C41125a {

            /* renamed from: a */
            private final Object f28150a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26682b() {
                return this.f28150a;
            }
        }

        /* renamed from: ba1.d0$b$e */
        public static final class C10153e implements C41125a {

            /* renamed from: a */
            private final Object f28151a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40521g2.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26683b() {
                return this.f28151a;
            }
        }

        /* renamed from: ba1.d0$b$f */
        public static final class C10154f implements C41125a {

            /* renamed from: a */
            private final Object f28152a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40588q3.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26684b() {
                return this.f28152a;
            }
        }

        /* renamed from: ba1.d0$b$g */
        public static final class C10155g implements C41125a {

            /* renamed from: a */
            private final Object f28153a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40482a3.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26685b() {
                return this.f28153a;
            }
        }

        /* renamed from: ba1.d0$b$h */
        public static final class C10156h implements C41125a {

            /* renamed from: a */
            private final Object f28154a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26686b() {
                return this.f28154a;
            }
        }

        /* renamed from: ba1.d0$b$i */
        static final class C10157i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C10157i f28155d = new C10157i();

            /* renamed from: ba1.d0$b$i$a */
            public static final class C10158a implements C41125a {

                /* renamed from: a */
                private final Object f28156a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

                /* renamed from: a */
                public C40951a mo26679a() {
                    return C41125a.C41126a.m119226a(this);
                }

                /* renamed from: b */
                public final Object mo26688b() {
                    return this.f28156a;
                }
            }

            C10157i() {
                super(0);
            }

            /* renamed from: b */
            public final C27700a1 invoke() {
                return (C27700a1) new C10158a().mo26688b();
            }
        }

        static {
            if (C10146d0.f28137f != null) {
                return;
            }
            throw new IllegalStateException("Must call SSO.init() before using the Auth".toString());
        }

        private C10148b() {
        }

        /* renamed from: b */
        public static final void m37106b(ApiException apiException) {
            C41536l.m120489i(apiException, "error");
            ((C40527h2) new C10150b().mo26680b()).mo94564b(apiException);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m37107c(C40736c cVar) {
            C41536l.m120489i(cVar, "it");
            cVar.onComplete();
        }

        /* renamed from: e */
        private final C40734b m37108e() {
            return (C40734b) f28145d.getValue();
        }

        /* renamed from: g */
        public static final DeviceIdentifier m37109g() {
            return f28142a.m37111i().mo67242c();
        }

        /* renamed from: h */
        public static final C10149a m37110h() {
            return f28147f;
        }

        /* renamed from: i */
        private final C27700a1 m37111i() {
            return (C27700a1) f28143b.getValue();
        }

        /* renamed from: k */
        public static final C40734b m37112k(int i, FragmentManager fragmentManager) {
            C41536l.m120489i(fragmentManager, "fragmentManager");
            fragmentManager.mo4428p().mo4639r(i, C42216e0.f99324q.mo97698a()).mo4517k();
            return f28142a.m37108e();
        }

        /* renamed from: l */
        public static final void m37113l() {
            f28142a.m37114m();
            C10159c.f28157a.mo26689a();
        }

        /* renamed from: m */
        private final void m37114m() {
            f28144c = true;
            ((C40521g2) new C10153e().mo26683b()).mo94560a().mo94890I(C40640a.m117458b()).mo94886E();
        }

        /* renamed from: n */
        private final void m37115n() {
            ((C40588q3) new C10154f().mo26684b()).mo94604a().mo94890I(C40640a.m117458b()).mo94886E();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
            if (kotlin.jvm.internal.C41536l.m120484d(ba1.C10146d0.C10159c.m37143b().getAlwaysSkipSecurityOffer$sso_client_release(), r1) != false) goto L_0x005f;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final p349ah.C9860d m37116o(boolean r2) {
            /*
                ge.bog.sso_client.models.Session r0 = ba1.C10146d0.C10159c.m37143b()
                java.lang.Boolean r0 = r0.getOfferSecuritySettingsSetup()
                if (r0 == 0) goto L_0x002a
                ge.bog.sso_client.models.Session r0 = ba1.C10146d0.C10159c.m37143b()
                java.lang.Boolean r0 = r0.getOfferSecuritySettingsSetup()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
                if (r0 != 0) goto L_0x002a
                if (r2 == 0) goto L_0x005f
                ge.bog.sso_client.models.Session r2 = ba1.C10146d0.C10159c.m37143b()
                java.lang.Boolean r2 = r2.getAlwaysSkipSecurityOffer$sso_client_release()
                boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r1)
                if (r2 != 0) goto L_0x005f
            L_0x002a:
                ba1.d0$b r2 = f28142a
                qa1.a1 r0 = r2.m37111i()
                java.lang.String r0 = r0.mo67245f()
                if (r0 == 0) goto L_0x003f
                boolean r0 = cf1.C40439w.m117118v(r0)
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = 0
                goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                if (r0 != 0) goto L_0x005f
                qa1.a1 r2 = r2.m37111i()
                java.lang.String r2 = r2.mo67245f()
                ge.bog.sso_client.models.Session r0 = ba1.C10146d0.C10159c.m37143b()
                java.lang.String r0 = r0.getUsername()
                boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r0)
                if (r2 == 0) goto L_0x005f
                lc1.c$a r2 = lc1.C41649c.f97893D
                lc1.c r2 = r2.mo96460a()
                goto L_0x0060
            L_0x005f:
                r2 = 0
            L_0x0060:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ba1.C10146d0.C10148b.m37116o(boolean):ah.d");
        }

        /* renamed from: p */
        public static final C40734b m37117p() {
            C40734b y = ((C40482a3) new C10155g().mo26685b()).mo94535d().mo95092y();
            C41536l.m120488h(y, "ssoKoinComponentGet<Refr…         .ignoreElement()");
            return y;
        }

        /* renamed from: r */
        public static final void m37118r() {
            C10148b bVar = f28142a;
            bVar.m37115n();
            C10159c.f28157a.mo26689a();
            bVar.m37111i().mo67240a();
        }

        /* renamed from: t */
        public static final void m37119t(C10149a aVar) {
            f28147f = aVar;
        }

        /* renamed from: d */
        public final C40734b mo26673d() {
            C40734b bVar;
            C43064a a = ((C10172e) new C10152d().mo26682b()).mo26710a();
            C10159c.f28157a.mo26692g();
            if (a != null && (bVar = (C40734b) a.invoke()) != null) {
                return bVar;
            }
            C40734b k = C40734b.m117920k(new C10191e0());
            C41536l.m120488h(k, "create {\n               …nComplete()\n            }");
            return k;
        }

        /* renamed from: f */
        public final C40736c mo26674f() {
            return f28146e;
        }

        /* renamed from: j */
        public final boolean mo26675j() {
            return f28144c;
        }

        /* renamed from: q */
        public final Intent mo26676q(Context context) {
            ActivityInfo activityInfo;
            C41536l.m120489i(context, "context");
            ComponentName o = ((C10172e) new C10156h().mo26686b()).mo26724o();
            if (o != null) {
                Intent intent = new Intent();
                intent.setComponent(o);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
                if (resolveActivity != null) {
                    activityInfo = resolveActivity.activityInfo;
                } else {
                    activityInfo = null;
                }
                if (activityInfo != null) {
                    return intent;
                }
            }
            return null;
        }

        /* renamed from: s */
        public final void mo26677s(C40736c cVar) {
            f28146e = cVar;
        }
    }

    /* renamed from: ba1.d0$c */
    public static final class C10159c {

        /* renamed from: a */
        public static final C10159c f28157a = new C10159c();

        /* renamed from: b */
        private static final AtomicReference f28158b = new AtomicReference(C35962r.m107006d());

        /* renamed from: c */
        private static final C41217g f28159c = C41219i.m119470b(C10169j.f28172d);

        /* renamed from: d */
        private static final Object f28160d = new Object();

        /* renamed from: ba1.d0$c$a */
        public static final class C10160a implements C41125a {

            /* renamed from: a */
            private final Object f28161a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26694b() {
                return this.f28161a;
            }
        }

        /* renamed from: ba1.d0$c$b */
        public static final class C10161b implements C41125a {

            /* renamed from: a */
            private final Object f28162a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26695b() {
                return this.f28162a;
            }
        }

        /* renamed from: ba1.d0$c$c */
        public static final class C10162c implements C41125a {

            /* renamed from: a */
            private final Object f28163a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26696b() {
                return this.f28163a;
            }
        }

        /* renamed from: ba1.d0$c$d */
        public static final class C10163d implements C41125a {

            /* renamed from: a */
            private final Object f28164a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26697b() {
                return this.f28164a;
            }
        }

        /* renamed from: ba1.d0$c$e */
        public static final class C10164e implements C41125a {

            /* renamed from: a */
            private final Object f28165a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26698b() {
                return this.f28165a;
            }
        }

        /* renamed from: ba1.d0$c$f */
        public static final class C10165f implements C41125a {

            /* renamed from: a */
            private final Object f28166a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26699b() {
                return this.f28166a;
            }
        }

        /* renamed from: ba1.d0$c$g */
        public static final class C10166g implements C41125a {

            /* renamed from: a */
            private final Object f28167a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26700b() {
                return this.f28167a;
            }
        }

        /* renamed from: ba1.d0$c$h */
        public static final class C10167h implements C41125a {

            /* renamed from: a */
            private final Object f28168a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26701b() {
                return this.f28168a;
            }
        }

        /* renamed from: ba1.d0$c$i */
        static final class C10168i extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ boolean f28169d;

            /* renamed from: e */
            final /* synthetic */ String f28170e;

            /* renamed from: f */
            final /* synthetic */ boolean f28171f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10168i(boolean z, String str, boolean z2) {
                super(1);
                this.f28169d = z;
                this.f28170e = str;
                this.f28171f = z2;
            }

            /* renamed from: a */
            public final void mo26702a(Session session) {
                C41536l.m120489i(session, "$this$edit");
                ArrayList arrayList = new ArrayList();
                if (this.f28169d) {
                    session.setPassCodeToken$sso_client_release(this.f28170e);
                    arrayList.add(AuthElementType.PASSCODE);
                }
                if (this.f28171f) {
                    session.setBiometricToken$sso_client_release(this.f28170e);
                    arrayList.add(AuthElementType.BIOMETRY);
                }
                if (arrayList.size() > 0) {
                    session.setAvailableAuthTypes$sso_client_release(C41361y0.m120040l(session.getAvailableAuthTypes$sso_client_release(), arrayList));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo26702a((Session) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ba1.d0$c$j */
        static final class C10169j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C10169j f28172d = new C10169j();

            /* renamed from: ba1.d0$c$j$a */
            public static final class C10170a implements C41125a {

                /* renamed from: a */
                private final Object f28173a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

                /* renamed from: a */
                public C40951a mo26679a() {
                    return C41125a.C41126a.m119226a(this);
                }

                /* renamed from: b */
                public final Object mo26704b() {
                    return this.f28173a;
                }
            }

            C10169j() {
                super(0);
            }

            /* renamed from: b */
            public final C27700a1 invoke() {
                return (C27700a1) new C10170a().mo26704b();
            }
        }

        static {
            if (C10146d0.f28137f != null) {
                return;
            }
            throw new IllegalStateException("Must call SSO.init() before using the AuthSession".toString());
        }

        private C10159c() {
        }

        /* renamed from: b */
        public static final Session m37143b() {
            Object obj = f28158b.get();
            C41536l.m120488h(obj, "currentRef.get()");
            return (Session) obj;
        }

        /* renamed from: c */
        private final C27700a1 m37144c() {
            return (C27700a1) f28159c.getValue();
        }

        /* renamed from: e */
        public static final boolean m37145e() {
            return C41536l.m120484d(f28158b.get(), C35962r.m107006d());
        }

        /* renamed from: a */
        public final void mo26689a() {
            f28158b.set(C35962r.m107006d());
        }

        /* renamed from: d */
        public final void mo26690d() {
            mo26691f(m37144c().mo67245f(), false);
        }

        /* renamed from: f */
        public final Session mo26691f(String str, boolean z) {
            Map map;
            Session session;
            if (str == null) {
                f28158b.set(C35962r.m107006d());
            } else {
                AtomicReference atomicReference = f28158b;
                boolean z2 = true;
                boolean z3 = !C41536l.m120484d(((Session) atomicReference.get()).getUsername(), str);
                if (C41536l.m120484d(atomicReference.get(), C35962r.m107006d()) || z3) {
                    synchronized (f28160d) {
                        C10159c cVar = f28157a;
                        HashMap i = cVar.m37144c().mo67249i();
                        if (i != null) {
                            map = (Map) i.get(str);
                        } else {
                            map = null;
                        }
                        if (map == null) {
                            map = new HashMap();
                        }
                        session = new Session(map, (Map) null, 2, (DefaultConstructorMarker) null);
                        session.setUsername$sso_client_release(str);
                        if (C41536l.m120484d(cVar.m37144c().mo67245f(), str)) {
                            session.setLastUserIsTrusted$sso_client_release(cVar.m37144c().mo67246g());
                            cVar.m37144c().mo67254n("SET");
                        }
                        String i2 = ((C10172e) new C10160a().mo26694b()).mo26718i();
                        boolean s = ((C10172e) new C10161b().mo26695b()).mo26728s();
                        boolean t = ((C10172e) new C10162c().mo26696b()).mo26729t();
                        if (i2 != null) {
                            if (!C40439w.m117118v(i2)) {
                                z2 = false;
                            }
                        }
                        if (!z2 && C41536l.m120484d(((C10172e) new C10163d().mo26697b()).mo26720k(), str) && !C40439w.m117118v(str)) {
                            C35962r.m107005c(session, new C10168i(t, i2, s));
                            ((C10172e) new C10164e().mo26698b()).mo26730u((String) null);
                            ((C10172e) new C10165f().mo26699b()).mo26731v(false);
                            ((C10172e) new C10166g().mo26700b()).mo26732w(false);
                        }
                        C43064a d = ((C10172e) new C10167h().mo26701b()).mo26713d();
                        if (d != null) {
                            d.invoke();
                        }
                    }
                    atomicReference.set(session);
                }
                if (z && !z3) {
                    ((Session) atomicReference.get()).setSavedCompanyClientKey$sso_client_release((String) null);
                }
            }
            Object obj = f28158b.get();
            C41536l.m120488h(obj, "currentRef.get()");
            return (Session) obj;
        }

        /* renamed from: g */
        public final void mo26692g() {
            LinkedHashMap linkedHashMap;
            if (C41536l.m120484d(m37143b().getSaveUser(), Boolean.TRUE) && !C41536l.m120484d(m37143b().getUsername(), m37144c().mo67245f())) {
                C27700a1 c = m37144c();
                HashMap i = m37144c().mo67249i();
                if (i != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : i.entrySet()) {
                        if (C41536l.m120484d(entry.getKey(), m37143b().getUsername())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    c.mo67256p(linkedHashMap);
                    m37144c().mo67253m(m37143b().getUsername());
                    if (m37144c().mo67246g() != null) {
                        m37144c().mo67254n("SET");
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ ge.bog.sso_client.models.SessionKt.SessionAttrs }>{ ge.bog.sso_client.models.SessionKt.UserSessions }");
            }
        }

        /* renamed from: h */
        public final void mo26693h(Session session) {
            HashMap hashMap;
            C41536l.m120489i(session, "session");
            if (!C41536l.m120484d(session, C35962r.m107006d())) {
                synchronized (f28160d) {
                    C10159c cVar = f28157a;
                    HashMap i = cVar.m37144c().mo67249i();
                    if (i != null) {
                        hashMap = new HashMap(i);
                    } else {
                        hashMap = new HashMap();
                    }
                    String username = session.getUsername();
                    if (username != null) {
                        hashMap.put(username, session.getInternalAttrs$sso_client_release());
                    }
                    cVar.m37144c().mo67256p(hashMap);
                    C41238w wVar = C41238w.f97225a;
                }
            }
        }
    }

    /* renamed from: ba1.d0$d */
    public static final class C10171d {
        private C10171d() {
        }

        public /* synthetic */ C10171d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1644x mo26705a() {
            return C10146d0.f28136e;
        }

        /* renamed from: b */
        public final C1644x mo26706b() {
            return C10146d0.f28135d;
        }

        /* renamed from: c */
        public final void mo26707c(Context context, C10172e eVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(eVar, "config");
            if (C10146d0.f28137f == null) {
                synchronized (this) {
                    if (C10146d0.f28137f == null) {
                        C10146d0.f28137f = new C10146d0(context, eVar, (DefaultConstructorMarker) null);
                        C10146d0 d = C10146d0.f28137f;
                        if (d != null) {
                            d.mo26671g();
                        }
                        C40285e.f95730a.mo94308e(context, eVar.mo26727r());
                    }
                }
            }
        }

        /* renamed from: d */
        public final void mo26708d() {
            mo26709e();
        }

        /* renamed from: e */
        public final void mo26709e() {
            C10146d0 d = C10146d0.f28137f;
            if (d != null) {
                d.mo26671g();
            }
        }
    }

    /* renamed from: ba1.d0$e */
    public static final class C10172e {

        /* renamed from: a */
        private final ComponentName f28174a;

        /* renamed from: b */
        private final C39311i f28175b;

        /* renamed from: c */
        private final C10199i f28176c;

        /* renamed from: d */
        private final C10190e f28177d;

        /* renamed from: e */
        private final C43064a f28178e;

        /* renamed from: f */
        private final C10195g0 f28179f;

        /* renamed from: g */
        private final C43064a f28180g;

        /* renamed from: h */
        private C43064a f28181h;

        /* renamed from: i */
        private final C10174b f28182i;

        /* renamed from: j */
        private final boolean f28183j;

        /* renamed from: k */
        private final String f28184k;

        /* renamed from: l */
        private final String f28185l;

        /* renamed from: m */
        private final C1644x f28186m;

        /* renamed from: n */
        private String f28187n;

        /* renamed from: o */
        private final C43064a f28188o;

        /* renamed from: p */
        private boolean f28189p;

        /* renamed from: q */
        private boolean f28190q;

        /* renamed from: r */
        private final C10205l f28191r;

        /* renamed from: s */
        private final C10379a f28192s;

        /* renamed from: t */
        private final C40284d f28193t;

        /* renamed from: ba1.d0$e$a */
        public static final class C10173a {

            /* renamed from: a */
            private final C10174b f28194a;

            /* renamed from: b */
            private ComponentName f28195b;

            /* renamed from: c */
            private String f28196c;

            /* renamed from: d */
            private String f28197d;

            /* renamed from: e */
            private String f28198e;

            /* renamed from: f */
            private C10199i f28199f = C10203k.m37284b();

            /* renamed from: g */
            private C10190e f28200g = C10194g.m37264c();

            /* renamed from: h */
            private boolean f28201h;

            /* renamed from: i */
            private C1644x f28202i;

            /* renamed from: j */
            private C43064a f28203j;

            /* renamed from: k */
            private C10195g0 f28204k;

            /* renamed from: l */
            private C43064a f28205l;

            /* renamed from: m */
            private C43064a f28206m;

            /* renamed from: n */
            private String f28207n;

            /* renamed from: o */
            private String f28208o;

            /* renamed from: p */
            private C43064a f28209p;

            /* renamed from: q */
            private String f28210q;

            /* renamed from: r */
            private boolean f28211r;

            /* renamed from: s */
            private boolean f28212s;

            /* renamed from: t */
            private C10205l f28213t = C10207m.m37293a();

            /* renamed from: u */
            private C10379a f28214u;

            /* renamed from: v */
            private C40284d f28215v;

            public C10173a(C10174b bVar) {
                C41536l.m120489i(bVar, "screenType");
                this.f28194a = bVar;
            }

            /* renamed from: a */
            public final C10172e mo26733a() {
                ComponentName componentName = this.f28195b;
                String str = this.f28196c;
                if (str != null) {
                    String str2 = this.f28197d;
                    if (str2 != null) {
                        String str3 = this.f28198e;
                        if (str3 != null) {
                            C39311i iVar = r6;
                            C39311i iVar2 = new C39311i(str, str2, str3);
                            return new C10172e(componentName, iVar, this.f28199f, this.f28200g, this.f28203j, this.f28204k, this.f28205l, this.f28206m, this.f28194a, this.f28201h, this.f28207n, this.f28210q, this.f28202i, this.f28208o, this.f28209p, this.f28211r, this.f28212s, this.f28213t, this.f28214u, this.f28215v, (DefaultConstructorMarker) null);
                        }
                        throw new IllegalArgumentException("invalid channelSecret".toString());
                    }
                    throw new IllegalArgumentException("invalid channel".toString());
                }
                throw new IllegalArgumentException("invalid serverUrl".toString());
            }

            /* renamed from: b */
            public final C10173a mo26734b(String str, String str2) {
                C41536l.m120489i(str, "channel");
                C41536l.m120489i(str2, "channelSecret");
                this.f28197d = str;
                this.f28198e = str2;
                return this;
            }

            /* renamed from: c */
            public final C10173a mo26735c(C10195g0 g0Var) {
                C41536l.m120489i(g0Var, "getTextByKey");
                this.f28204k = g0Var;
                return this;
            }

            /* renamed from: d */
            public final C10173a mo26736d(C43064a aVar, C43064a aVar2) {
                C41536l.m120489i(aVar, "getAppTheme");
                this.f28205l = aVar;
                this.f28206m = aVar2;
                return this;
            }

            /* renamed from: e */
            public final C10173a mo26737e(C10190e eVar) {
                C41536l.m120489i(eVar, "provider");
                this.f28200g = eVar;
                return this;
            }

            /* renamed from: f */
            public final C10173a mo26738f(C10199i iVar) {
                C41536l.m120489i(iVar, "localeManager");
                this.f28199f = new C10202j(iVar);
                return this;
            }

            /* renamed from: g */
            public final C10173a mo26739g(C10205l lVar) {
                C41536l.m120489i(lVar, "factory");
                this.f28213t = lVar;
                return this;
            }

            /* renamed from: h */
            public final C10173a mo26740h(String str) {
                C41536l.m120489i(str, "serverUrl");
                this.f28196c = str;
                return this;
            }

            /* renamed from: i */
            public final C10173a mo26741i(C43064a aVar) {
                this.f28203j = aVar;
                return this;
            }

            /* renamed from: j */
            public final C10173a mo26742j(C10379a aVar) {
                C41536l.m120489i(aVar, "analytics");
                this.f28214u = aVar;
                return this;
            }

            /* renamed from: k */
            public final C10173a mo26743k(String str, boolean z, boolean z2, C43064a aVar) {
                C41536l.m120489i(str, "token");
                C41536l.m120489i(aVar, "authDataSaved");
                this.f28208o = str;
                this.f28211r = z;
                this.f28212s = z2;
                this.f28209p = aVar;
                return this;
            }

            /* renamed from: l */
            public final C10173a mo26744l(String str) {
                this.f28210q = str;
                return this;
            }

            /* renamed from: m */
            public final C10173a mo26745m(C1644x xVar) {
                C41536l.m120489i(xVar, "initFinishLister");
                this.f28202i = xVar;
                return this;
            }

            /* renamed from: n */
            public final C10173a mo26746n(boolean z) {
                this.f28201h = z;
                return this;
            }

            /* renamed from: o */
            public final C10173a mo26747o(String str, String str2) {
                C41536l.m120489i(str, "orgId");
                C41536l.m120489i(str2, "fpServer");
                this.f28215v = new C40284d(str, str2);
                return this;
            }

            /* renamed from: p */
            public final C10173a mo26748p(String str) {
                this.f28207n = str;
                return this;
            }
        }

        /* renamed from: ba1.d0$e$b */
        public enum C10174b {
            FULL_SCREEN,
            WINDOWED
        }

        public /* synthetic */ C10172e(ComponentName componentName, C39311i iVar, C10199i iVar2, C10190e eVar, C43064a aVar, C10195g0 g0Var, C43064a aVar2, C43064a aVar3, C10174b bVar, boolean z, String str, String str2, C1644x xVar, String str3, C43064a aVar4, boolean z2, boolean z3, C10205l lVar, C10379a aVar5, C40284d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(componentName, iVar, iVar2, eVar, aVar, g0Var, aVar2, aVar3, bVar, z, str, str2, xVar, str3, aVar4, z2, z3, lVar, aVar5, dVar);
        }

        /* renamed from: a */
        public final C43064a mo26710a() {
            return this.f28178e;
        }

        /* renamed from: b */
        public final C10379a mo26711b() {
            return this.f28192s;
        }

        /* renamed from: c */
        public final C43064a mo26712c() {
            return this.f28181h;
        }

        /* renamed from: d */
        public final C43064a mo26713d() {
            return this.f28188o;
        }

        /* renamed from: e */
        public final C10190e mo26714e() {
            return this.f28177d;
        }

        /* renamed from: f */
        public final C43064a mo26715f() {
            return this.f28180g;
        }

        /* renamed from: g */
        public final C10195g0 mo26716g() {
            return this.f28179f;
        }

        /* renamed from: h */
        public final C1644x mo26717h() {
            return this.f28186m;
        }

        /* renamed from: i */
        public final String mo26718i() {
            return this.f28187n;
        }

        /* renamed from: j */
        public final String mo26719j() {
            return this.f28185l;
        }

        /* renamed from: k */
        public final String mo26720k() {
            return this.f28184k;
        }

        /* renamed from: l */
        public final C10199i mo26721l() {
            return this.f28176c;
        }

        /* renamed from: m */
        public final boolean mo26722m() {
            return this.f28183j;
        }

        /* renamed from: n */
        public final C10205l mo26723n() {
            return this.f28191r;
        }

        /* renamed from: o */
        public final ComponentName mo26724o() {
            return this.f28174a;
        }

        /* renamed from: p */
        public final C10174b mo26725p() {
            return this.f28182i;
        }

        /* renamed from: q */
        public final C39311i mo26726q() {
            return this.f28175b;
        }

        /* renamed from: r */
        public final C40284d mo26727r() {
            return this.f28193t;
        }

        /* renamed from: s */
        public final boolean mo26728s() {
            return this.f28190q;
        }

        /* renamed from: t */
        public final boolean mo26729t() {
            return this.f28189p;
        }

        /* renamed from: u */
        public final void mo26730u(String str) {
            this.f28187n = str;
        }

        /* renamed from: v */
        public final void mo26731v(boolean z) {
            this.f28190q = z;
        }

        /* renamed from: w */
        public final void mo26732w(boolean z) {
            this.f28189p = z;
        }

        private C10172e(ComponentName componentName, C39311i iVar, C10199i iVar2, C10190e eVar, C43064a aVar, C10195g0 g0Var, C43064a aVar2, C43064a aVar3, C10174b bVar, boolean z, String str, String str2, C1644x xVar, String str3, C43064a aVar4, boolean z2, boolean z3, C10205l lVar, C10379a aVar5, C40284d dVar) {
            this.f28174a = componentName;
            this.f28175b = iVar;
            this.f28176c = iVar2;
            this.f28177d = eVar;
            this.f28178e = aVar;
            this.f28179f = g0Var;
            this.f28180g = aVar2;
            this.f28181h = aVar3;
            this.f28182i = bVar;
            this.f28183j = z;
            this.f28184k = str;
            this.f28185l = str2;
            this.f28186m = xVar;
            this.f28187n = str3;
            this.f28188o = aVar4;
            this.f28189p = z2;
            this.f28190q = z3;
            this.f28191r = lVar;
            this.f28192s = aVar5;
            this.f28193t = dVar;
        }
    }

    /* renamed from: ba1.d0$f */
    public static final class C10175f {

        /* renamed from: a */
        public static final C10175f f28219a = new C10175f();

        /* renamed from: b */
        private static final AtomicReference f28220b = new AtomicReference();

        /* renamed from: c */
        private static String f28221c = "";

        /* renamed from: d */
        private static final AtomicReference f28222d = new AtomicReference();

        /* renamed from: e */
        private static Long f28223e;

        private C10175f() {
        }

        /* renamed from: a */
        public static final String m37216a() {
            Object obj = f28220b.get();
            C41536l.m120488h(obj, "_flowProcessReference.get()");
            return (String) obj;
        }

        /* renamed from: b */
        public static final Long m37217b() {
            return (Long) f28222d.get();
        }

        /* renamed from: c */
        public static final void m37218c(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            f28220b.set(str);
            f28221c = str;
        }

        /* renamed from: d */
        public static final void m37219d(Long l) {
            f28222d.set(l);
            f28223e = l;
        }
    }

    /* renamed from: ba1.d0$g */
    public static final class C10176g {

        /* renamed from: a */
        public static final C10176g f28224a = new C10176g();

        /* renamed from: b */
        private static final AtomicReference f28225b = new AtomicReference("");

        /* renamed from: c */
        private static String f28226c = "";

        /* renamed from: d */
        private static final AtomicReference f28227d = new AtomicReference(Boolean.FALSE);

        /* renamed from: e */
        private static boolean f28228e;

        /* renamed from: f */
        private static final AtomicReference f28229f = new AtomicReference("");

        /* renamed from: g */
        private static String f28230g = "";

        /* renamed from: h */
        private static final AtomicReference f28231h = new AtomicReference("");

        /* renamed from: i */
        private static String f28232i = "";

        /* renamed from: j */
        private static final AtomicReference f28233j = new AtomicReference();

        /* renamed from: k */
        private static String f28234k = "";

        /* renamed from: l */
        private static final AtomicReference f28235l;

        /* renamed from: m */
        private static C35938f f28236m;

        static {
            ProcessFlow processFlow = ProcessFlow.UNKNOWN__;
            f28235l = new AtomicReference(new C35938f(processFlow, ""));
            f28236m = new C35938f(processFlow, "");
        }

        private C10176g() {
        }

        /* renamed from: a */
        public static final String m37220a() {
            Object obj = f28233j.get();
            C41536l.m120488h(obj, "_facetecSessionId.get()");
            return (String) obj;
        }

        /* renamed from: b */
        public static final String m37221b() {
            Object obj = f28225b.get();
            C41536l.m120488h(obj, "_flowProcessReference.get()");
            return (String) obj;
        }

        /* renamed from: c */
        public static final C35938f m37222c() {
            Object obj = f28235l.get();
            C41536l.m120488h(obj, "_identifyProcessFlow.get()");
            return (C35938f) obj;
        }

        /* renamed from: d */
        public static final String m37223d() {
            Object obj = f28231h.get();
            C41536l.m120488h(obj, "_operationReference.get()");
            return (String) obj;
        }

        /* renamed from: e */
        public static final String m37224e() {
            Object obj = f28229f.get();
            C41536l.m120488h(obj, "_pin.get()");
            return (String) obj;
        }

        /* renamed from: f */
        public static final boolean m37225f() {
            Object obj = f28227d.get();
            C41536l.m120488h(obj, "_skipPin.get()");
            return ((Boolean) obj).booleanValue();
        }

        /* renamed from: g */
        public static final void m37226g(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            f28233j.set(str);
            f28234k = str;
        }

        /* renamed from: h */
        public static final void m37227h(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            f28225b.set(str);
            f28226c = str;
        }

        /* renamed from: i */
        public static final void m37228i(C35938f fVar) {
            C41536l.m120489i(fVar, C11755a.C11756a.f34100b);
            f28235l.set(fVar);
            f28236m = fVar;
        }

        /* renamed from: j */
        public static final void m37229j(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            f28231h.set(str);
            f28232i = str;
        }

        /* renamed from: k */
        public static final void m37230k(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            f28229f.set(str);
            f28230g = str;
        }

        /* renamed from: l */
        public static final void m37231l(boolean z) {
            f28227d.set(Boolean.valueOf(z));
            f28228e = z;
        }
    }

    /* renamed from: ba1.d0$h */
    public static final class C10177h {

        /* renamed from: a */
        public static final C10177h f28237a = new C10177h();

        /* renamed from: ba1.d0$h$a */
        public static final class C10178a implements C41125a {

            /* renamed from: a */
            private final Object f28238a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26749b() {
                return this.f28238a;
            }
        }

        private C10177h() {
        }

        /* renamed from: a */
        public static final String m37232a() {
            String h = ((C27700a1) new C10178a().mo26749b()).mo67248h();
            if (h == null) {
                return "";
            }
            return h;
        }

        /* renamed from: b */
        public static final C40281a m37233b() {
            return C40285e.f95730a.mo94309h();
        }
    }

    /* renamed from: ba1.d0$i */
    public static final class C10179i implements C41125a {

        /* renamed from: a */
        private final Object f28239a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26750b() {
            return this.f28239a;
        }
    }

    /* renamed from: ba1.d0$j */
    public static final class C10180j implements C41125a {

        /* renamed from: a */
        private final Object f28240a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26751b() {
            return this.f28240a;
        }
    }

    /* renamed from: ba1.d0$k */
    public static final class C10181k implements C41125a {

        /* renamed from: a */
        private final Object f28241a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26752b() {
            return this.f28241a;
        }
    }

    /* renamed from: ba1.d0$l */
    public static final class C10182l implements C41125a {

        /* renamed from: a */
        private final Object f28242a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26753b() {
            return this.f28242a;
        }
    }

    /* renamed from: ba1.d0$m */
    public static final class C10183m implements C41125a {

        /* renamed from: a */
        private final Object f28243a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26754b() {
            return this.f28243a;
        }
    }

    /* renamed from: ba1.d0$n */
    public static final class C10184n implements C41125a {

        /* renamed from: a */
        private final Object f28244a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40574o4.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26755b() {
            return this.f28244a;
        }
    }

    /* renamed from: ba1.d0$o */
    public static final class C10185o implements C41125a {

        /* renamed from: a */
        private final Object f28245a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26756b() {
            return this.f28245a;
        }
    }

    /* renamed from: ba1.d0$p */
    public static final class C10186p implements C41125a {

        /* renamed from: a */
        private final Object f28246a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26757b() {
            return this.f28246a;
        }
    }

    /* renamed from: ba1.d0$q */
    public static final class C10187q implements C41125a {

        /* renamed from: a */
        private final Object f28247a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26758b() {
            return this.f28247a;
        }
    }

    /* renamed from: ba1.d0$r */
    public static final class C10188r implements C41125a {

        /* renamed from: a */
        private final Object f28248a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26759b() {
            return this.f28248a;
        }
    }

    /* renamed from: ba1.d0$s */
    public static final class C10189s implements C41125a {

        /* renamed from: a */
        private final Object f28249a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo26760b() {
            return this.f28249a;
        }
    }

    public /* synthetic */ C10146d0(Context context, C10172e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m37101h() {
        String str;
        C1644x h = ((C10172e) new C10185o().mo26756b()).mo26717h();
        if (h != null) {
            DeviceIdentifier c = ((C27700a1) new C10186p().mo26757b()).mo67242c();
            if (c != null) {
                str = c.getExtCustomerId();
            } else {
                str = null;
            }
            h.mo4823o(str);
        }
        f28135d.mo4823o(new C35947l.C35951d(C41238w.f97225a));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r3 != false) goto L_0x006f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m37102i(java.lang.Throwable r4) {
        /*
            boolean r0 = r4 instanceof dd1.C40574o4.C40575a
            r1 = 0
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4 instanceof p469io.reactivex.exceptions.CompositeException
            if (r0 == 0) goto L_0x0039
            r0 = r4
            io.reactivex.exceptions.CompositeException r0 = (p469io.reactivex.exceptions.CompositeException) r0
            java.util.List r0 = r0.mo96022b()
            java.lang.String r2 = "throwable.exceptions"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0021
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0021
            goto L_0x0036
        L_0x0021:
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof dd1.C40574o4.C40575a
            if (r2 == 0) goto L_0x0025
            r3 = 1
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            goto L_0x006f
        L_0x0039:
            ba1.d0$r r4 = new ba1.d0$r
            r4.<init>()
            java.lang.Object r4 = r4.mo26759b()
            ba1.d0$e r4 = (ba1.C10146d0.C10172e) r4
            androidx.lifecycle.x r4 = r4.mo26717h()
            if (r4 == 0) goto L_0x0062
            ba1.d0$s r0 = new ba1.d0$s
            r0.<init>()
            java.lang.Object r0 = r0.mo26760b()
            qa1.a1 r0 = (qa1.C27700a1) r0
            ge.bog.sso_client.models.DeviceIdentifier r0 = r0.mo67242c()
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r0.getExtCustomerId()
        L_0x005f:
            r4.mo4823o(r1)
        L_0x0062:
            androidx.lifecycle.x r4 = f28135d
            ge.bog.sso_client.models.l$d r0 = new ge.bog.sso_client.models.l$d
            he1.w r1 = he1.C41238w.f97225a
            r0.<init>(r1)
            r4.mo4823o(r0)
            goto L_0x008d
        L_0x006f:
            ba1.d0$q r0 = new ba1.d0$q
            r0.<init>()
            java.lang.Object r0 = r0.mo26758b()
            ba1.d0$e r0 = (ba1.C10146d0.C10172e) r0
            androidx.lifecycle.x r0 = r0.mo26717h()
            if (r0 == 0) goto L_0x0083
            r0.mo4823o(r1)
        L_0x0083:
            androidx.lifecycle.x r0 = f28135d
            ge.bog.sso_client.models.l$b r1 = new ge.bog.sso_client.models.l$b
            r1.<init>(r4)
            r0.mo4823o(r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba1.C10146d0.m37102i(java.lang.Throwable):void");
    }

    /* renamed from: g */
    public final void mo26671g() {
        C41205b G = ((C40574o4) new C10184n().mo26755b()).mo94595b(f28136e).mo94890I(C40640a.m117458b()).mo94888G(new C10142b0(), new C10144c0());
        C41536l.m120488h(G, "ssoKoinComponentGet<Upda…         }\n            })");
        C40397a.m116967a(G, new C41204a());
    }

    private C10146d0(Context context, C10172e eVar) {
        this.f28138a = new ComponentName(context, SignInActivity.class);
        this.f28139b = new ComponentName(context, SecuritySettingsActivity.class);
        C10147a aVar = new C10147a(context, eVar);
        boolean z = true;
        C41267b.m119575b((C41268c) null, aVar, 1, (Object) null);
        String k = ((C10172e) new C10179i().mo26750b()).mo26720k();
        if (!(k == null || C40439w.m117118v(k))) {
            ((C27700a1) new C10180j().mo26751b()).mo67253m(k);
        }
        String j = ((C10172e) new C10181k().mo26752b()).mo26719j();
        if (j != null && !C40439w.m117118v(j)) {
            z = false;
        }
        if (!z) {
            ((C27700a1) new C10182l().mo26753b()).mo67250j(new DeviceIdentifier(j, (Long) null));
        }
        ((C27700a1) new C10183m().mo26754b()).mo67255o((String) null);
    }
}
