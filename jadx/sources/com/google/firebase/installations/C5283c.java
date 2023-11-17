package com.google.firebase.installations;

import android.support.p013v4.media.session.C0125b;
import android.text.TextUtils;
import com.google.firebase.C5270e;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p011aa.C0092b;
import p011aa.C0093c;
import p011aa.C0095d;
import p028ba.C2192c;
import p028ba.C2193d;
import p028ba.C2197f;
import p182n6.C7264i;
import p326y8.C9134u;
import p327y9.C9142b;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;
import p339z9.C9266a;
import p339z9.C9267b;
import p339z9.C9268c;
import p339z9.C9269d;
import p339z9.C9270e;
import p339z9.C9272g;

/* renamed from: com.google.firebase.installations.c */
public class C5283c implements C9270e {

    /* renamed from: m */
    private static final Object f16906m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f16907n = new C5284a();

    /* renamed from: a */
    private final C5270e f16908a;

    /* renamed from: b */
    private final C2192c f16909b;

    /* renamed from: c */
    private final C0093c f16910c;

    /* renamed from: d */
    private final C5291h f16911d;

    /* renamed from: e */
    private final C9134u f16912e;

    /* renamed from: f */
    private final C9272g f16913f;

    /* renamed from: g */
    private final Object f16914g;

    /* renamed from: h */
    private final ExecutorService f16915h;

    /* renamed from: i */
    private final Executor f16916i;

    /* renamed from: j */
    private String f16917j;

    /* renamed from: k */
    private Set f16918k;

    /* renamed from: l */
    private final List f16919l;

    /* renamed from: com.google.firebase.installations.c$a */
    class C5284a implements ThreadFactory {

        /* renamed from: d */
        private final AtomicInteger f16920d = new AtomicInteger(1);

        C5284a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f16920d.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    static /* synthetic */ class C5285b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16921a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16922b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                ba.f$b[] r0 = p028ba.C2197f.C2199b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16922b = r0
                r1 = 1
                ba.f$b r2 = p028ba.C2197f.C2199b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f16922b     // Catch:{ NoSuchFieldError -> 0x001d }
                ba.f$b r3 = p028ba.C2197f.C2199b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f16922b     // Catch:{ NoSuchFieldError -> 0x0028 }
                ba.f$b r3 = p028ba.C2197f.C2199b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                ba.d$b[] r2 = p028ba.C2193d.C2195b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f16921a = r2
                ba.d$b r3 = p028ba.C2193d.C2195b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f16921a     // Catch:{ NoSuchFieldError -> 0x0043 }
                ba.d$b r2 = p028ba.C2193d.C2195b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5283c.C5285b.<clinit>():void");
        }
    }

    C5283c(C5270e eVar, C9142b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new C2192c(eVar.mo17481j(), bVar), new C0093c(eVar), C5291h.m20893c(), new C9134u(new C9267b(eVar)), new C9272g());
    }

    /* renamed from: A */
    private void m20846A() {
        C7264i.m27899h(mo17507n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C7264i.m27899h(mo17508u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C7264i.m27899h(mo17506m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C7264i.m27893b(C5291h.m20896h(mo17507n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C7264i.m27893b(C5291h.m20895g(mo17506m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: B */
    private String m20847B(C0095d dVar) {
        if ((!this.f16908a.mo17482m().equals("CHIME_ANDROID_SDK") && !this.f16908a.mo17487u()) || !dVar.mo157m()) {
            return this.f16913f.mo24914a();
        }
        String f = m20864p().mo149f();
        if (TextUtils.isEmpty(f)) {
            return this.f16913f.mo24914a();
        }
        return f;
    }

    /* renamed from: C */
    private C0095d m20848C(C0095d dVar) {
        String str;
        if (dVar.mo132d() == null || dVar.mo132d().length() != 11) {
            str = null;
        } else {
            str = m20864p().mo150i();
        }
        C2193d d = this.f16909b.mo7123d(mo17506m(), dVar.mo132d(), mo17508u(), mo17507n(), str);
        int i = C5285b.f16921a[d.mo7102e().ordinal()];
        if (i == 1) {
            return dVar.mo162s(d.mo7100c(), d.mo7101d(), this.f16911d.mo17513b(), d.mo7099b().mo7114c(), d.mo7099b().mo7115d());
        } else if (i == 2) {
            return dVar.mo160q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C5278a.UNAVAILABLE);
        }
    }

    /* renamed from: D */
    private void m20849D(Exception exc) {
        synchronized (this.f16914g) {
            Iterator it = this.f16919l.iterator();
            while (it.hasNext()) {
                if (((C5290g) it.next()).mo17510a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: E */
    private void m20850E(C0095d dVar) {
        synchronized (this.f16914g) {
            Iterator it = this.f16919l.iterator();
            while (it.hasNext()) {
                if (((C5290g) it.next()).mo17511b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: F */
    private synchronized void m20851F(String str) {
        this.f16917j = str;
    }

    /* renamed from: G */
    private synchronized void m20852G(C0095d dVar, C0095d dVar2) {
        if (this.f16918k.size() != 0 && !TextUtils.equals(dVar.mo132d(), dVar2.mo132d())) {
            Iterator it = this.f16918k.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                dVar2.mo132d();
                throw null;
            }
        }
    }

    /* renamed from: g */
    private Task m20857g() {
        C9227g gVar = new C9227g();
        m20859i(new C5286d(this.f16911d, gVar));
        return gVar.mo24883a();
    }

    /* renamed from: h */
    private Task m20858h() {
        C9227g gVar = new C9227g();
        m20859i(new C5287e(gVar));
        return gVar.mo24883a();
    }

    /* renamed from: i */
    private void m20859i(C5290g gVar) {
        synchronized (this.f16914g) {
            this.f16919l.add(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20870w(boolean r3) {
        /*
            r2 = this;
            aa.d r0 = r2.m20867s()
            boolean r1 = r0.mo153i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo156l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.h r3 = r2.f16911d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo17515f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            aa.d r3 = r2.m20862l(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            aa.d r3 = r2.m20848C(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.m20869v(r3)
            r2.m20852G(r0, r3)
            boolean r0 = r3.mo155k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo132d()
            r2.m20851F(r0)
        L_0x0039:
            boolean r0 = r3.mo153i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.C5278a.BAD_CONFIG
            r3.<init>(r0)
            r2.m20849D(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo154j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m20849D(r3)
            goto L_0x005e
        L_0x005b:
            r2.m20850E(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m20849D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5283c.m20870w(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m20872y(boolean z) {
        C0095d t = m20868t();
        if (z) {
            t = t.mo159p();
        }
        m20850E(t);
        this.f16916i.execute(new C9268c(this, z));
    }

    /* renamed from: l */
    private C0095d m20862l(C0095d dVar) {
        C2197f e = this.f16909b.mo7124e(mo17506m(), dVar.mo132d(), mo17508u(), dVar.mo135f());
        int i = C5285b.f16922b[e.mo7113b().ordinal()];
        if (i == 1) {
            return dVar.mo158o(e.mo7114c(), e.mo7115d(), this.f16911d.mo17513b());
        } else if (i == 2) {
            return dVar.mo160q("BAD CONFIG");
        } else {
            if (i == 3) {
                m20851F((String) null);
                return dVar.mo161r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C5278a.UNAVAILABLE);
        }
    }

    /* renamed from: o */
    private synchronized String m20863o() {
        return this.f16917j;
    }

    /* renamed from: p */
    private C0092b m20864p() {
        return (C0092b) this.f16912e.get();
    }

    /* renamed from: q */
    public static C5283c m20865q() {
        return m20866r(C5270e.m20805l());
    }

    /* renamed from: r */
    public static C5283c m20866r(C5270e eVar) {
        boolean z;
        if (eVar != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "Null is not a valid value of FirebaseApp.");
        return (C5283c) eVar.mo17480i(C9270e.class);
    }

    /* renamed from: s */
    private C0095d m20867s() {
        C0095d d;
        synchronized (f16906m) {
            C5282b a = C5282b.m20844a(this.f16908a.mo17481j(), "generatefid.lock");
            try {
                d = this.f16910c.mo152d();
                if (a != null) {
                    a.mo17503b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo17503b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: t */
    private C0095d m20868t() {
        C0095d d;
        synchronized (f16906m) {
            C5282b a = C5282b.m20844a(this.f16908a.mo17481j(), "generatefid.lock");
            try {
                d = this.f16910c.mo152d();
                if (d.mo154j()) {
                    d = this.f16910c.mo151b(d.mo163t(m20847B(d)));
                }
                if (a != null) {
                    a.mo17503b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo17503b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: v */
    private void m20869v(C0095d dVar) {
        synchronized (f16906m) {
            C5282b a = C5282b.m20844a(this.f16908a.mo17481j(), "generatefid.lock");
            try {
                this.f16910c.mo151b(dVar);
                if (a != null) {
                    a.mo17503b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo17503b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m20871x() {
        m20872y(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ C0092b m20873z(C5270e eVar) {
        return new C0092b(eVar);
    }

    /* renamed from: a */
    public Task mo17504a() {
        m20846A();
        String o = m20863o();
        if (o != null) {
            return C9231i.m34113g(o);
        }
        Task h = m20858h();
        this.f16915h.execute(new C9266a(this));
        return h;
    }

    /* renamed from: b */
    public Task mo17505b(boolean z) {
        m20846A();
        Task g = m20857g();
        this.f16915h.execute(new C9269d(this, z));
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo17506m() {
        return this.f16908a.mo17483n().mo17516b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo17507n() {
        return this.f16908a.mo17483n().mo17517c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo17508u() {
        return this.f16908a.mo17483n().mo17519e();
    }

    C5283c(ExecutorService executorService, Executor executor, C5270e eVar, C2192c cVar, C0093c cVar2, C5291h hVar, C9134u uVar, C9272g gVar) {
        this.f16914g = new Object();
        this.f16918k = new HashSet();
        this.f16919l = new ArrayList();
        this.f16908a = eVar;
        this.f16909b = cVar;
        this.f16910c = cVar2;
        this.f16911d = hVar;
        this.f16912e = uVar;
        this.f16913f = gVar;
        this.f16915h = executorService;
        this.f16916i = executor;
    }
}
