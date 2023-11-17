package ad1;

import android.content.Context;
import android.util.Log;
import ba1.C10146d0;
import cd1.C40391a;
import ce1.C40397a;
import ce1.C40398b;
import com.threatmetrix.TrustDefender.C11889d;
import com.threatmetrix.TrustDefender.C11899f;
import com.threatmetrix.TrustDefender.C11903g;
import de1.C40640a;
import ed1.C40762x;
import fh1.C40951a;
import gd1.C40992a;
import gh1.C41125a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nh1.C41806a;
import p585re.C17584a;
import p585re.C17589f;
import p599se.C17764a;
import qa1.C27700a1;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ad1.e */
public final class C40285e implements C41125a {

    /* renamed from: a */
    public static final C40285e f95730a = new C40285e();

    /* renamed from: b */
    private static boolean f95731b;

    /* renamed from: ad1.e$a */
    private static final class C40286a implements C40281a {

        /* renamed from: a */
        private final C41204a f95732a;

        public C40286a(C41204a aVar) {
            C41536l.m120489i(aVar, "disposable");
            this.f95732a = aVar;
        }

        public void cancel() {
            if (!this.f95732a.isDisposed()) {
                this.f95732a.dispose();
            }
        }
    }

    /* renamed from: ad1.e$b */
    static final class C40287b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40282b f95733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40287b(C40282b bVar) {
            super(1);
            this.f95733d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f95733d.mo94301a(th);
        }
    }

    /* renamed from: ad1.e$c */
    static final class C40288c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40282b f95734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40288c(C40282b bVar) {
            super(1);
            this.f95734d = bVar;
        }

        /* renamed from: a */
        public final void mo94311a(String str) {
            C40282b bVar = this.f95734d;
            C41536l.m120488h(str, "it");
            bVar.onSuccess(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94311a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ad1.e$d */
    public static final class C40289d implements C41125a {

        /* renamed from: a */
        private final Object f95735a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo94312b() {
            return this.f95735a;
        }
    }

    /* renamed from: ad1.e$e */
    public static final class C40290e implements C41125a {

        /* renamed from: a */
        private final Object f95736a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C27700a1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo94313b() {
            return this.f95736a;
        }
    }

    /* renamed from: ad1.e$f */
    public static final class C40291f implements C40282b {
        C40291f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m116699c(C11899f.C11900a aVar) {
            if (aVar.mo31951b() == C17589f.TMX_OK) {
                C40285e eVar = C40285e.f95730a;
                String a = aVar.mo31950a();
                C41536l.m120488h(a, "it.sessionID");
                String upperCase = a.toUpperCase(Locale.ROOT);
                C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                eVar.m116689g(upperCase);
            }
            C40285e eVar2 = C40285e.f95730a;
            eVar2.m116688f("Profiling has been finished, session id : " + aVar.mo31950a() + ", TMXStatusCode : " + aVar.mo31951b());
        }

        /* renamed from: a */
        public void mo94301a(Throwable th) {
            C41536l.m120489i(th, "e");
        }

        public void onSuccess(String str) {
            C41536l.m120489i(str, "sessionId");
            C11903g gVar = new C11903g();
            gVar.mo31955d(str);
            C11889d.m43566K().mo31935E(gVar, new C40292f());
        }
    }

    private C40285e() {
    }

    /* renamed from: d */
    private final C41205b m116687d(C40282b bVar) {
        C40762x B = ((C40391a) mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40391a.class), (C41806a) null, (C43064a) null)).mo94453a().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "get<GetTMXProfilingSessi…dSchedulers.mainThread())");
        return C40398b.m116972e(B, new C40287b(bVar), new C40288c(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m116688f(String str) {
        if (((C10146d0.C10172e) new C40289d().mo94312b()).mo26722m()) {
            Log.d("Log_Profiling_Result", str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m116689g(String str) {
        ((C27700a1) new C40290e().mo94313b()).mo67255o(str);
    }

    /* renamed from: a */
    public C40951a mo26679a() {
        return C41125a.C41126a.m119226a(this);
    }

    /* renamed from: e */
    public final void mo94308e(Context context, C40284d dVar) {
        C41536l.m120489i(context, "context");
        if (dVar != null) {
            C17584a s = new C17584a().mo45133r(context).mo45135t(dVar.mo94304b()).mo45134s(dVar.mo94303a());
            C17764a aVar = new C17764a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C17584a u = s.mo45137v(aVar.mo45354h(30, timeUnit)).mo45136u(30, timeUnit);
            C41536l.m120488h(u, "TMXConfig().setContext(c…T_TIME, TimeUnit.SECONDS)");
            try {
                C11889d.m43566K().mo31934D(u);
                f95731b = true;
            } catch (Exception e) {
                f95731b = false;
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public final C40281a mo94309h() {
        C41204a aVar = new C41204a();
        if (f95731b) {
            C40397a.m116967a(m116687d(new C40291f()), aVar);
        } else {
            m116688f("TMXProfiling not initialized. Make sure to call setTMXInitConfigParameters() with the correct configuration.");
        }
        return new C40286a(aVar);
    }
}
