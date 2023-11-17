package p068e9;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C5270e;
import com.salesforce.marketingcloud.C11398b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p027b9.C2175a;
import p027b9.C2184f;
import p040c9.C2280a;
import p055d9.C5855b;
import p081f9.C6173c;
import p081f9.C6188i;
import p133j9.C6762f;
import p159l9.C7026i;
import p172m9.C7142a;
import p172m9.C7144c;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: e9.m */
public class C6089m {

    /* renamed from: a */
    private final Context f18930a;

    /* renamed from: b */
    private final C5270e f18931b;

    /* renamed from: c */
    private final C6106s f18932c;

    /* renamed from: d */
    private final C6052b0 f18933d = new C6052b0();

    /* renamed from: e */
    private final long f18934e = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6095n f18935f;

    /* renamed from: g */
    private C6095n f18936g;

    /* renamed from: h */
    private boolean f18937h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6074k f18938i;

    /* renamed from: j */
    private final C6114w f18939j;

    /* renamed from: k */
    private final C6762f f18940k;

    /* renamed from: l */
    public final C5855b f18941l;

    /* renamed from: m */
    private final C2280a f18942m;

    /* renamed from: n */
    private final ExecutorService f18943n;

    /* renamed from: o */
    private final C6066i f18944o;

    /* renamed from: p */
    private final C2175a f18945p;

    /* renamed from: e9.m$a */
    class C6090a implements Callable {

        /* renamed from: d */
        final /* synthetic */ C7026i f18946d;

        C6090a(C7026i iVar) {
            this.f18946d = iVar;
        }

        /* renamed from: a */
        public Task call() {
            return C6089m.this.m24348f(this.f18946d);
        }
    }

    /* renamed from: e9.m$b */
    class C6091b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C7026i f18948d;

        C6091b(C7026i iVar) {
            this.f18948d = iVar;
        }

        public void run() {
            Task unused = C6089m.this.m24348f(this.f18948d);
        }
    }

    /* renamed from: e9.m$c */
    class C6092c implements Callable {
        C6092c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C6089m.this.f18935f.mo19629d();
                if (!d) {
                    C2184f.m8346f().mo7097k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C2184f.m8346f().mo7092e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: e9.m$d */
    class C6093d implements Callable {
        C6093d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C6089m.this.f18938i.mo19579s());
        }
    }

    public C6089m(C5270e eVar, C6114w wVar, C2175a aVar, C6106s sVar, C5855b bVar, C2280a aVar2, C6762f fVar, ExecutorService executorService) {
        this.f18931b = eVar;
        this.f18932c = sVar;
        this.f18930a = eVar.mo17481j();
        this.f18939j = wVar;
        this.f18945p = aVar;
        this.f18941l = bVar;
        this.f18942m = aVar2;
        this.f18943n = executorService;
        this.f18940k = fVar;
        this.f18944o = new C6066i(executorService);
    }

    /* renamed from: d */
    private void m24347d() {
        try {
            this.f18937h = Boolean.TRUE.equals((Boolean) C6107s0.m24419f(this.f18944o.mo19558h(new C6093d())));
        } catch (Exception unused) {
            this.f18937h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Task m24348f(C7026i iVar) {
        mo19615n();
        try {
            this.f18941l.mo121a(new C6087l(this));
            this.f18938i.mo19572S();
            if (!iVar.mo21237b().f20901b.f20908a) {
                C2184f.m8346f().mo7089b("Collection of crash reports disabled in Crashlytics settings.");
                return C9231i.m34112f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f18938i.mo19582z(iVar)) {
                C2184f.m8346f().mo7097k("Previous sessions could not be finalized.");
            }
            Task W = this.f18938i.mo19576W(iVar.mo21236a());
            mo19614m();
            return W;
        } catch (Exception e) {
            C2184f.m8346f().mo7092e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C9231i.m34112f(e);
        } finally {
            mo19614m();
        }
    }

    /* renamed from: h */
    private void m24349h(C7026i iVar) {
        Future<?> submit = this.f18943n.submit(new C6091b(iVar));
        C2184f.m8346f().mo7089b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C2184f.m8346f().mo7092e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C2184f.m8346f().mo7092e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C2184f.m8346f().mo7092e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: i */
    public static String m24350i() {
        return "18.3.7";
    }

    /* renamed from: j */
    static boolean m24351j(String str, boolean z) {
        if (!z) {
            C2184f.m8346f().mo7095i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo19610e() {
        return this.f18935f.mo19628c();
    }

    /* renamed from: g */
    public Task mo19611g(C7026i iVar) {
        return C6107s0.m24421h(this.f18943n, new C6090a(iVar));
    }

    /* renamed from: k */
    public void mo19612k(String str) {
        this.f18938i.mo19578a0(System.currentTimeMillis() - this.f18934e, str);
    }

    /* renamed from: l */
    public void mo19613l(Throwable th) {
        this.f18938i.mo19577Z(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19614m() {
        this.f18944o.mo19558h(new C6092c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo19615n() {
        this.f18944o.mo19555b();
        this.f18935f.mo19627a();
        C2184f.m8346f().mo7095i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean mo19616o(C6049a aVar, C7026i iVar) {
        C7026i iVar2 = iVar;
        if (m24351j(aVar.f18830b, C6063h.m24220k(this.f18930a, "com.crashlytics.RequireBuildId", true))) {
            String gVar = new C6061g(this.f18939j).toString();
            try {
                this.f18936g = new C6095n("crash_marker", this.f18940k);
                this.f18935f = new C6095n("initialization_marker", this.f18940k);
                C6188i iVar3 = new C6188i(gVar, this.f18940k, this.f18944o);
                C6173c cVar = new C6173c(this.f18940k);
                C6049a aVar2 = aVar;
                C6173c cVar2 = cVar;
                C6188i iVar4 = iVar3;
                C6088l0 g = C6088l0.m24327g(this.f18930a, this.f18939j, this.f18940k, aVar2, cVar2, iVar4, new C7142a(C11398b.f33141t, new C7144c(10)), iVar, this.f18933d);
                Context context = this.f18930a;
                C6066i iVar5 = this.f18944o;
                C6114w wVar = this.f18939j;
                C6106s sVar = this.f18932c;
                C6762f fVar = this.f18940k;
                C6095n nVar = this.f18936g;
                C6188i iVar6 = iVar3;
                Context context2 = context;
                String str = gVar;
                C6066i iVar7 = iVar5;
                C6114w wVar2 = wVar;
                C6106s sVar2 = sVar;
                C6762f fVar2 = fVar;
                C6095n nVar2 = nVar;
                C6049a aVar3 = aVar;
                this.f18938i = new C6074k(context2, iVar7, wVar2, sVar2, fVar2, nVar2, aVar3, iVar6, cVar, g, this.f18945p, this.f18942m);
                boolean e = mo19610e();
                m24347d();
                this.f18938i.mo19581x(str, Thread.getDefaultUncaughtExceptionHandler(), iVar2);
                if (!e || !C6063h.m24212c(this.f18930a)) {
                    C2184f.m8346f().mo7089b("Successfully configured exception handler.");
                    return true;
                }
                C2184f.m8346f().mo7089b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m24349h(iVar2);
                return false;
            } catch (Exception e2) {
                C2184f.m8346f().mo7092e("Crashlytics was not started due to an exception during initialization", e2);
                this.f18938i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
    }

    /* renamed from: p */
    public void mo19617p(String str, String str2) {
        this.f18938i.mo19573T(str, str2);
    }

    /* renamed from: q */
    public void mo19618q(String str) {
        this.f18938i.mo19575V(str);
    }
}
