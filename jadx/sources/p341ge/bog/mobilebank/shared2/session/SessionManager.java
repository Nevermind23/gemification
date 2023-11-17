package p341ge.bog.mobilebank.shared2.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.C1565c0;
import androidx.lifecycle.C1577e;
import androidx.lifecycle.C1579f;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import d51.C31539b;
import ed1.C40734b;
import ed1.C40739f;
import ee1.C40767b;
import he1.C41238w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import ze1.C43425h;

/* renamed from: ge.bog.mobilebank.shared2.session.SessionManager */
public class SessionManager {

    /* renamed from: l */
    public static final C34683b f83836l = new C34683b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f83837a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C31539b f83838b;

    /* renamed from: c */
    private final long f83839c;

    /* renamed from: d */
    private final AtomicBoolean f83840d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C34684c f83841e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1639v f83842f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43425h f83843g;

    /* renamed from: h */
    private final Handler f83844h;

    /* renamed from: i */
    private final InactivityWatcherImpl f83845i;

    /* renamed from: j */
    private final C40767b f83846j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C40767b f83847k;

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$InactivityWatcherImpl */
    private final class InactivityWatcherImpl implements C1579f {

        /* renamed from: d */
        private boolean f83848d;

        public InactivityWatcherImpl() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo3970a(C1619q qVar) {
            C1577e.m5595a(this, qVar);
        }

        /* renamed from: d */
        public /* synthetic */ void mo3971d(C1619q qVar) {
            C1577e.m5598d(this, qVar);
        }

        /* renamed from: e */
        public /* synthetic */ void mo3972e(C1619q qVar) {
            C1577e.m5597c(this, qVar);
        }

        public /* synthetic */ void onDestroy(C1619q qVar) {
            C1577e.m5596b(this, qVar);
        }

        public void onStart(C1619q qVar) {
            C41536l.m120489i(qVar, "owner");
            C43425h k = SessionManager.this.f83843g;
            if (k != null && this.f83848d && !k.mo102128r(SystemClock.elapsedRealtime())) {
                SessionManager.this.f83841e.mo4826r(C34690a.EXPIRED_ON_LOCAL);
            }
        }

        public void onStop(C1619q qVar) {
            C41536l.m120489i(qVar, "owner");
            this.f83848d = SessionManager.this.mo84761s();
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$a */
    static final class C34681a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SessionManager f83850d;

        /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$a$a */
        public /* synthetic */ class C34682a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f83851a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ge.bog.mobilebank.shared2.session.a[] r0 = p341ge.bog.mobilebank.shared2.session.C34690a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.shared2.session.a r1 = p341ge.bog.mobilebank.shared2.session.C34690a.EXPIRED_ON_LOCAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.shared2.session.a r1 = p341ge.bog.mobilebank.shared2.session.C34690a.EXPIRED_ON_REMOTE_SERVER     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f83851a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared2.session.SessionManager.C34681a.C34682a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34681a(SessionManager sessionManager) {
            super(1);
            this.f83850d = sessionManager;
        }

        /* renamed from: a */
        public final void mo84765a(C34690a aVar) {
            int i;
            Boolean bool;
            C1639v n = this.f83850d.f83842f;
            if (aVar == null) {
                i = -1;
            } else {
                i = C34682a.f83851a[aVar.ordinal()];
            }
            if (i == 1 || i == 2) {
                this.f83850d.m101892o(false);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            n.mo4826r(bool);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84765a((C34690a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$b */
    public static final class C34683b {
        private C34683b() {
        }

        public /* synthetic */ C34683b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final long m101906b(long j, TimeUnit timeUnit) {
            boolean z;
            boolean z2;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            boolean z3 = true;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (millis == 0 && i > 0) {
                        z3 = false;
                    }
                    if (z3) {
                        return millis;
                    }
                    throw new IllegalArgumentException("timeout too small.".toString());
                }
                throw new IllegalArgumentException("timeout too large.".toString());
            }
            throw new IllegalStateException("timeout < 0".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$c */
    public final class C34684c extends C1644x {

        /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$c$a */
        static final class C34685a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SessionManager f83853d;

            /* renamed from: e */
            final /* synthetic */ C1645y f83854e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34685a(SessionManager sessionManager, C1645y yVar) {
                super(1);
                this.f83853d = sessionManager;
                this.f83854e = yVar;
            }

            /* renamed from: a */
            public final void mo84766a(C34690a aVar) {
                if (this.f83853d.mo84761s() && aVar != C34690a.NONE) {
                    C1645y yVar = this.f83854e;
                    C41536l.m120488h(aVar, "t");
                    yVar.onChanged(aVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo84766a((C34690a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$c$b */
        static final class C34686b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SessionManager f83855d;

            /* renamed from: e */
            final /* synthetic */ C1645y f83856e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34686b(SessionManager sessionManager, C1645y yVar) {
                super(1);
                this.f83855d = sessionManager;
                this.f83856e = yVar;
            }

            /* renamed from: a */
            public final void mo84767a(C34690a aVar) {
                if (this.f83855d.mo84761s() && aVar != C34690a.NONE) {
                    C1645y yVar = this.f83856e;
                    C41536l.m120488h(aVar, "t");
                    yVar.onChanged(aVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo84767a((C34690a) obj);
                return C41238w.f97225a;
            }
        }

        public C34684c() {
            super(C34690a.NONE);
        }

        /* renamed from: k */
        public void mo4819k(C1619q qVar, C1645y yVar) {
            C41536l.m120489i(qVar, "owner");
            C41536l.m120489i(yVar, "observer");
            super.mo4819k(qVar, new C34696g(new C34685a(SessionManager.this, yVar)));
        }

        /* renamed from: l */
        public void mo4820l(C1645y yVar) {
            C41536l.m120489i(yVar, "observer");
            super.mo4820l(new C34696g(new C34686b(SessionManager.this, yVar)));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$d */
    static final class C34687d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SessionManager f83857d;

        /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$d$a */
        static final class C34688a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SessionManager f83858d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34688a(SessionManager sessionManager) {
                super(1);
                this.f83858d = sessionManager;
            }

            /* renamed from: a */
            public final C40739f invoke(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                return this.f83858d.f83838b.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34687d(SessionManager sessionManager) {
            super(1);
            this.f83857d = sessionManager;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40739f m101912c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40739f) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40739f invoke(Boolean bool) {
            C41536l.m120489i(bool, "enabled");
            if (bool.booleanValue()) {
                return this.f83857d.f83847k.mo95003S0(this.f83857d.f83837a, TimeUnit.SECONDS).mo95006U(new C34695f(new C34688a(this.f83857d)));
            }
            return C40734b.m117918i();
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.session.SessionManager$e */
    static final class C34689e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34689e f83859d = new C34689e();

        C34689e() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    public SessionManager(long j, TimeUnit timeUnit, long j2, C31539b bVar) {
        C41536l.m120489i(timeUnit, "timeoutUnit");
        C41536l.m120489i(bVar, "accessTokenRefresher");
        this.f83837a = j2;
        this.f83838b = bVar;
        this.f83839c = f83836l.m101906b(j, timeUnit);
        C34684c cVar = new C34684c();
        this.f83841e = cVar;
        C1639v vVar = new C1639v();
        this.f83842f = vVar;
        this.f83844h = new Handler(Looper.getMainLooper(), new C34691b(this));
        this.f83845i = new InactivityWatcherImpl();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f83846j = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f83847k = h12;
        C41536l.m120488h(h1.mo95043y().mo94993N0(new C34692c(new C34687d(this))).mo94888G(new C34693d(), new C34694e(C34689e.f83859d)), "tokenRefreshSwitcher\n   …      }, {\n            })");
        vVar.mo4956s(cVar, new C34696g(new C34681a(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m101882e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m101883f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m101884g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m101892o(boolean z) {
        this.f83846j.onNext(Boolean.valueOf(z));
    }

    /* renamed from: p */
    private final boolean m101893p() {
        return this.f83841e.mo4814f() == C34690a.NONE;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m101894r(SessionManager sessionManager, Message message) {
        C41536l.m120489i(sessionManager, "this$0");
        C41536l.m120489i(message, "msg");
        int i = message.what;
        if (i == 1) {
            sessionManager.f83841e.mo4826r(C34690a.EXPIRED_ON_LOCAL);
        } else if (i == 2) {
            C34684c cVar = sessionManager.f83841e;
            Object obj = message.obj;
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.shared2.session.SessionExpirationStatus");
            cVar.mo4826r((C34690a) obj);
        }
        return true;
    }

    /* renamed from: v */
    private final void m101895v() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f83843g = new C43425h(elapsedRealtime, this.f83839c + elapsedRealtime);
    }

    /* renamed from: q */
    public final LiveData mo84760q() {
        return C1607m0.m5653a(this.f83842f);
    }

    /* renamed from: s */
    public final boolean mo84761s() {
        return this.f83840d.get();
    }

    /* renamed from: t */
    public final void mo84762t(C34690a aVar) {
        C41536l.m120489i(aVar, "status");
        this.f83844h.removeMessages(1);
        if (mo84761s()) {
            Message.obtain(this.f83844h, 2, aVar).sendToTarget();
        }
    }

    /* renamed from: u */
    public final void mo84763u() {
        this.f83844h.removeMessages(1);
        if (mo84761s() && m101893p()) {
            this.f83844h.sendEmptyMessageDelayed(1, this.f83839c);
            this.f83847k.onNext(C41238w.f97225a);
        }
        m101895v();
    }

    /* renamed from: w */
    public final void mo84764w(boolean z) {
        this.f83840d.set(z);
        m101892o(z);
        this.f83844h.removeCallbacksAndMessages((Object) null);
        this.f83841e.mo4826r(C34690a.NONE);
        this.f83842f.mo4826r(Boolean.FALSE);
        if (z) {
            mo84763u();
            C1565c0.f4566l.mo4857a().getLifecycle().mo4906a(this.f83845i);
            return;
        }
        this.f83843g = null;
        C1565c0.f4566l.mo4857a().getLifecycle().mo4909d(this.f83845i);
    }
}
