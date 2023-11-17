package p068e9;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p027b9.C2175a;
import p027b9.C2184f;
import p027b9.C2185g;
import p040c9.C2280a;
import p068e9.C6101q;
import p081f9.C6173c;
import p081f9.C6188i;
import p094g9.C6285b0;
import p094g9.C6335d0;
import p133j9.C6762f;
import p159l9.C7018d;
import p159l9.C7026i;
import p337z7.C9225f;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: e9.k */
class C6074k {

    /* renamed from: s */
    static final FilenameFilter f18876s = new C6072j();

    /* renamed from: a */
    private final Context f18877a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6106s f18878b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6095n f18879c;

    /* renamed from: d */
    private final C6188i f18880d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6066i f18881e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6114w f18882f;

    /* renamed from: g */
    private final C6762f f18883g;

    /* renamed from: h */
    private final C6049a f18884h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C6173c f18885i;

    /* renamed from: j */
    private final C2175a f18886j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2280a f18887k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C6088l0 f18888l;

    /* renamed from: m */
    private C6101q f18889m;

    /* renamed from: n */
    private C7026i f18890n = null;

    /* renamed from: o */
    final C9227g f18891o = new C9227g();

    /* renamed from: p */
    final C9227g f18892p = new C9227g();

    /* renamed from: q */
    final C9227g f18893q = new C9227g();

    /* renamed from: r */
    final AtomicBoolean f18894r = new AtomicBoolean(false);

    /* renamed from: e9.k$a */
    class C6075a implements C6101q.C6102a {
        C6075a() {
        }

        /* renamed from: a */
        public void mo19583a(C7026i iVar, Thread thread, Throwable th) {
            C6074k.this.mo19567H(iVar, thread, th);
        }
    }

    /* renamed from: e9.k$b */
    class C6076b implements Callable {

        /* renamed from: d */
        final /* synthetic */ long f18896d;

        /* renamed from: e */
        final /* synthetic */ Throwable f18897e;

        /* renamed from: f */
        final /* synthetic */ Thread f18898f;

        /* renamed from: g */
        final /* synthetic */ C7026i f18899g;

        /* renamed from: h */
        final /* synthetic */ boolean f18900h;

        /* renamed from: e9.k$b$a */
        class C6077a implements C9225f {

            /* renamed from: a */
            final /* synthetic */ Executor f18902a;

            /* renamed from: b */
            final /* synthetic */ String f18903b;

            C6077a(Executor executor, String str) {
                this.f18902a = executor;
                this.f18903b = str;
            }

            /* renamed from: b */
            public Task mo17657a(C7018d dVar) {
                String str = null;
                if (dVar == null) {
                    C2184f.m8346f().mo7097k("Received null app settings, cannot send reports at crash time.");
                    return C9231i.m34113g((Object) null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = C6074k.this.m24260N();
                C6088l0 h = C6074k.this.f18888l;
                Executor executor = this.f18902a;
                if (C6076b.this.f18900h) {
                    str = this.f18903b;
                }
                taskArr[1] = h.mo19609w(executor, str);
                return C9231i.m34115i(taskArr);
            }
        }

        C6076b(long j, Throwable th, Thread thread, C7026i iVar, boolean z) {
            this.f18896d = j;
            this.f18897e = th;
            this.f18898f = thread;
            this.f18899g = iVar;
            this.f18900h = z;
        }

        /* renamed from: a */
        public Task call() {
            long b = C6074k.m24257F(this.f18896d);
            String c = C6074k.this.m24253B();
            if (c == null) {
                C2184f.m8346f().mo7091d("Tried to write a fatal exception while no session was open.");
                return C9231i.m34113g((Object) null);
            }
            C6074k.this.f18879c.mo19627a();
            C6074k.this.f18888l.mo19604r(this.f18897e, this.f18898f, c, b);
            C6074k.this.m24286w(this.f18896d);
            C6074k.this.mo19580t(this.f18899g);
            C6074k.this.m24285v(new C6061g(C6074k.this.f18882f).toString());
            if (!C6074k.this.f18878b.mo19637d()) {
                return C9231i.m34113g((Object) null);
            }
            Executor c2 = C6074k.this.f18881e.mo19556c();
            return this.f18899g.mo21236a().mo24874s(c2, new C6077a(c2, c));
        }
    }

    /* renamed from: e9.k$c */
    class C6078c implements C9225f {
        C6078c() {
        }

        /* renamed from: b */
        public Task mo17657a(Void voidR) {
            return C9231i.m34113g(Boolean.TRUE);
        }
    }

    /* renamed from: e9.k$d */
    class C6079d implements C9225f {

        /* renamed from: a */
        final /* synthetic */ Task f18906a;

        /* renamed from: e9.k$d$a */
        class C6080a implements Callable {

            /* renamed from: d */
            final /* synthetic */ Boolean f18908d;

            /* renamed from: e9.k$d$a$a */
            class C6081a implements C9225f {

                /* renamed from: a */
                final /* synthetic */ Executor f18910a;

                C6081a(Executor executor) {
                    this.f18910a = executor;
                }

                /* renamed from: b */
                public Task mo17657a(C7018d dVar) {
                    if (dVar == null) {
                        C2184f.m8346f().mo7097k("Received null app settings at app startup. Cannot send cached reports");
                        return C9231i.m34113g((Object) null);
                    }
                    Task unused = C6074k.this.m24260N();
                    C6074k.this.f18888l.mo19608v(this.f18910a);
                    C6074k.this.f18893q.mo24887e((Object) null);
                    return C9231i.m34113g((Object) null);
                }
            }

            C6080a(Boolean bool) {
                this.f18908d = bool;
            }

            /* renamed from: a */
            public Task call() {
                if (!this.f18908d.booleanValue()) {
                    C2184f.m8346f().mo7095i("Deleting cached crash reports...");
                    C6074k.m24283r(C6074k.this.mo19570L());
                    C6074k.this.f18888l.mo19607u();
                    C6074k.this.f18893q.mo24887e((Object) null);
                    return C9231i.m34113g((Object) null);
                }
                C2184f.m8346f().mo7089b("Sending cached crash reports...");
                C6074k.this.f18878b.mo19636c(this.f18908d.booleanValue());
                Executor c = C6074k.this.f18881e.mo19556c();
                return C6079d.this.f18906a.mo24874s(c, new C6081a(c));
            }
        }

        C6079d(Task task) {
            this.f18906a = task;
        }

        /* renamed from: b */
        public Task mo17657a(Boolean bool) {
            return C6074k.this.f18881e.mo19559i(new C6080a(bool));
        }
    }

    /* renamed from: e9.k$e */
    class C6082e implements Callable {

        /* renamed from: d */
        final /* synthetic */ long f18912d;

        /* renamed from: e */
        final /* synthetic */ String f18913e;

        C6082e(long j, String str) {
            this.f18912d = j;
            this.f18913e = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C6074k.this.mo19569J()) {
                return null;
            }
            C6074k.this.f18885i.mo19749g(this.f18912d, this.f18913e);
            return null;
        }
    }

    /* renamed from: e9.k$f */
    class C6083f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ long f18915d;

        /* renamed from: e */
        final /* synthetic */ Throwable f18916e;

        /* renamed from: f */
        final /* synthetic */ Thread f18917f;

        C6083f(long j, Throwable th, Thread thread) {
            this.f18915d = j;
            this.f18916e = th;
            this.f18917f = thread;
        }

        public void run() {
            if (!C6074k.this.mo19569J()) {
                long b = C6074k.m24257F(this.f18915d);
                String c = C6074k.this.m24253B();
                if (c == null) {
                    C2184f.m8346f().mo7097k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C6074k.this.f18888l.mo19605s(this.f18916e, this.f18917f, c, b);
                }
            }
        }
    }

    /* renamed from: e9.k$g */
    class C6084g implements Callable {

        /* renamed from: d */
        final /* synthetic */ String f18919d;

        C6084g(String str) {
            this.f18919d = str;
        }

        /* renamed from: a */
        public Void call() {
            C6074k.this.m24285v(this.f18919d);
            return null;
        }
    }

    /* renamed from: e9.k$h */
    class C6085h implements Callable {

        /* renamed from: d */
        final /* synthetic */ long f18921d;

        C6085h(long j) {
            this.f18921d = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f18921d);
            C6074k.this.f18887k.mo122a("_ae", bundle);
            return null;
        }
    }

    C6074k(Context context, C6066i iVar, C6114w wVar, C6106s sVar, C6762f fVar, C6095n nVar, C6049a aVar, C6188i iVar2, C6173c cVar, C6088l0 l0Var, C2175a aVar2, C2280a aVar3) {
        this.f18877a = context;
        this.f18881e = iVar;
        this.f18882f = wVar;
        this.f18878b = sVar;
        this.f18883g = fVar;
        this.f18879c = nVar;
        this.f18884h = aVar;
        this.f18880d = iVar2;
        this.f18885i = cVar;
        this.f18886j = aVar2;
        this.f18887k = aVar3;
        this.f18888l = l0Var;
    }

    /* renamed from: A */
    private static boolean m24252A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public String m24253B() {
        SortedSet n = this.f18888l.mo19602n();
        if (!n.isEmpty()) {
            return (String) n.first();
        }
        return null;
    }

    /* renamed from: C */
    private static long m24254C() {
        return m24257F(System.currentTimeMillis());
    }

    /* renamed from: D */
    static List m24255D(C2185g gVar, String str, C6762f fVar, byte[] bArr) {
        File o = fVar.mo20802o(str, "user-data");
        File o2 = fVar.mo20802o(str, C11769i.C11770a.f34151n);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6059f("logs_file", "logs", bArr));
        arrayList.add(new C6113v("crash_meta_file", "metadata", gVar.mo7083d()));
        arrayList.add(new C6113v("session_meta_file", "session", gVar.mo7086g()));
        arrayList.add(new C6113v("app_meta_file", "app", gVar.mo7084e()));
        arrayList.add(new C6113v("device_meta_file", "device", gVar.mo7080a()));
        arrayList.add(new C6113v("os_meta_file", "os", gVar.mo7085f()));
        arrayList.add(m24262P(gVar));
        arrayList.add(new C6113v("user_meta_file", "user", o));
        arrayList.add(new C6113v("keys_file", C11769i.C11770a.f34151n, o2));
        return arrayList;
    }

    /* renamed from: E */
    private InputStream m24256E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            C2184f.m8346f().mo7097k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C2184f.m8346f().mo7093g("No version control information found");
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static long m24257F(long j) {
        return j / 1000;
    }

    /* renamed from: M */
    private Task m24259M(long j) {
        if (m24252A()) {
            C2184f.m8346f().mo7097k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C9231i.m34113g((Object) null);
        }
        C2184f.m8346f().mo7089b("Logging app exception event to Firebase Analytics");
        return C9231i.m34110d(new ScheduledThreadPoolExecutor(1), new C6085h(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public Task m24260N() {
        ArrayList arrayList = new ArrayList();
        for (File file : mo19570L()) {
            try {
                arrayList.add(m24259M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C2184f f = C2184f.m8346f();
                f.mo7097k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C9231i.m34114h(arrayList);
    }

    /* renamed from: O */
    private static boolean m24261O(String str, File file, C6285b0.C6286a aVar) {
        if (file == null || !file.exists()) {
            C2184f f = C2184f.m8346f();
            f.mo7097k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C2184f f2 = C2184f.m8346f();
            f2.mo7093g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private static C6117z m24262P(C2185g gVar) {
        File c = gVar.mo7082c();
        if (c != null && c.exists()) {
            return new C6113v("minidump_file", "minidump", c);
        }
        return new C6059f("minidump_file", "minidump", new byte[]{0});
    }

    /* renamed from: R */
    private static byte[] m24263R(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[C11398b.f33141t];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: X */
    private Task m24264X() {
        if (this.f18878b.mo19637d()) {
            C2184f.m8346f().mo7089b("Automatic data collection is enabled. Allowing upload.");
            this.f18891o.mo24887e(Boolean.FALSE);
            return C9231i.m34113g(Boolean.TRUE);
        }
        C2184f.m8346f().mo7089b("Automatic data collection is disabled.");
        C2184f.m8346f().mo7095i("Notifying that unsent reports are available.");
        this.f18891o.mo24887e(Boolean.TRUE);
        Task t = this.f18878b.mo19638g().mo24875t(new C6078c());
        C2184f.m8346f().mo7089b("Waiting for send/deleteUnsentReports to be called.");
        return C6107s0.m24428o(t, this.f18892p.mo24883a());
    }

    /* renamed from: Y */
    private void m24265Y(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List a = ((ActivityManager) this.f18877a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (a.size() != 0) {
                this.f18888l.mo19606t(str, a, new C6173c(this.f18883g, str), C6188i.m24667i(str, this.f18883g, this.f18881e));
                return;
            }
            C2184f f = C2184f.m8346f();
            f.mo7095i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C2184f f2 = C2184f.m8346f();
        f2.mo7095i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static C6335d0.C6336a m24280o(C6114w wVar, C6049a aVar) {
        return C6335d0.C6336a.m25223b(wVar.mo19644f(), aVar.f18834f, aVar.f18835g, wVar.mo19643a(), C6108t.m24429a(aVar.f18832d).mo19640b(), aVar.f18836h);
    }

    /* renamed from: p */
    private static C6335d0.C6337b m24281p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C6335d0.C6337b.m25230c(C6063h.m24222m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C6063h.m24229t(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C6063h.m24235z(), C6063h.m24223n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static C6335d0.C6338c m24282q() {
        return C6335d0.C6338c.m25240a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C6063h.m24206A());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m24283r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24284u(boolean r4, p159l9.C7026i r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            e9.l0 r1 = r3.f18888l
            java.util.SortedSet r1 = r1.mo19602n()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            b9.f r4 = p027b9.C2184f.m8346f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo7095i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            l9.d r5 = r5.mo21237b()
            l9.d$a r5 = r5.f20901b
            boolean r5 = r5.f20909b
            if (r5 == 0) goto L_0x002f
            r3.m24265Y(r1)
            goto L_0x0038
        L_0x002f:
            b9.f r5 = p027b9.C2184f.m8346f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo7095i(r2)
        L_0x0038:
            b9.a r5 = r3.f18886j
            boolean r5 = r5.mo7079d(r1)
            if (r5 == 0) goto L_0x0043
            r3.m24287y(r1)
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            e9.l0 r5 = r3.f18888l
            long r0 = m24254C()
            r5.mo19600i(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p068e9.C6074k.m24284u(boolean, l9.i):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m24285v(String str) {
        long C = m24254C();
        C2184f f = C2184f.m8346f();
        f.mo7089b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C6089m.m24350i()});
        C6335d0.C6336a o = m24280o(this.f18882f, this.f18884h);
        C6335d0.C6338c q = m24282q();
        C6335d0.C6337b p = m24281p();
        this.f18886j.mo7078c(str, format, C, C6335d0.m25219b(o, q, p));
        this.f18885i.mo19747e(str);
        this.f18888l.mo19603o(str, C);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m24286w(long j) {
        try {
            C6762f fVar = this.f18883g;
            if (!fVar.mo20793e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C2184f.m8346f().mo7098l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private void m24287y(String str) {
        C2184f f = C2184f.m8346f();
        f.mo7095i("Finalizing native report for session " + str);
        C2185g a = this.f18886j.mo7076a(str);
        File c = a.mo7082c();
        C6285b0.C6286a b = a.mo7081b();
        if (m24261O(str, c, b)) {
            C2184f.m8346f().mo7097k("No native core present");
            return;
        }
        long lastModified = c.lastModified();
        C6173c cVar = new C6173c(this.f18883g, str);
        File i = this.f18883g.mo20797i(str);
        if (!i.isDirectory()) {
            C2184f.m8346f().mo7097k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m24286w(lastModified);
        List D = m24255D(a, str, this.f18883g, cVar.mo19745b());
        C6050a0.m24175b(i, D);
        C2184f.m8346f().mo7089b("CrashlyticsController#finalizePreviousNativeSession");
        this.f18888l.mo19599h(str, D, b);
        cVar.mo19744a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public String mo19566G() {
        InputStream E = m24256E("META-INF/version-control-info.textproto");
        if (E == null) {
            return null;
        }
        C2184f.m8346f().mo7089b("Read version control info");
        return Base64.encodeToString(m24263R(E), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo19567H(C7026i iVar, Thread thread, Throwable th) {
        mo19568I(iVar, thread, th, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public synchronized void mo19568I(C7026i iVar, Thread thread, Throwable th, boolean z) {
        C2184f f = C2184f.m8346f();
        f.mo7089b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C6107s0.m24419f(this.f18881e.mo19559i(new C6076b(System.currentTimeMillis(), th, thread, iVar, z)));
        } catch (TimeoutException unused) {
            C2184f.m8346f().mo7091d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            C2184f.m8346f().mo7092e("Error handling uncaught exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo19569J() {
        C6101q qVar = this.f18889m;
        return qVar != null && qVar.mo19634a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public List mo19570L() {
        return this.f18883g.mo20794f(f18876s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo19571Q(String str) {
        this.f18881e.mo19558h(new C6084g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo19572S() {
        try {
            String G = mo19566G();
            if (G != null) {
                mo19574U("com.crashlytics.version-control-info", G);
                C2184f.m8346f().mo7093g("Saved version control info");
            }
        } catch (IOException e) {
            C2184f.m8346f().mo7098l("Unable to save version control info", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo19573T(String str, String str2) {
        try {
            this.f18880d.mo19775l(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f18877a;
            if (context == null || !C6063h.m24233x(context)) {
                C2184f.m8346f().mo7091d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo19574U(String str, String str2) {
        try {
            this.f18880d.mo19776m(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f18877a;
            if (context == null || !C6063h.m24233x(context)) {
                C2184f.m8346f().mo7091d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo19575V(String str) {
        this.f18880d.mo19777n(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public Task mo19576W(Task task) {
        if (!this.f18888l.mo19601l()) {
            C2184f.m8346f().mo7095i("No crash reports are available to be sent.");
            this.f18891o.mo24887e(Boolean.FALSE);
            return C9231i.m34113g((Object) null);
        }
        C2184f.m8346f().mo7095i("Crash reports are available to be sent.");
        return m24264X().mo24875t(new C6079d(task));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo19577Z(Thread thread, Throwable th) {
        this.f18881e.mo19557g(new C6083f(System.currentTimeMillis(), th, thread));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo19578a0(long j, String str) {
        this.f18881e.mo19558h(new C6082e(j, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo19579s() {
        if (!this.f18879c.mo19628c()) {
            String B = m24253B();
            if (B == null || !this.f18886j.mo7079d(B)) {
                return false;
            }
            return true;
        }
        C2184f.m8346f().mo7095i("Found previous crash marker.");
        this.f18879c.mo19629d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo19580t(C7026i iVar) {
        m24284u(false, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo19581x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C7026i iVar) {
        this.f18890n = iVar;
        mo19571Q(str);
        C6101q qVar = new C6101q(new C6075a(), iVar, uncaughtExceptionHandler, this.f18886j);
        this.f18889m = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo19582z(C7026i iVar) {
        this.f18881e.mo19555b();
        if (mo19569J()) {
            C2184f.m8346f().mo7097k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C2184f.m8346f().mo7095i("Finalizing previously open sessions.");
        try {
            m24284u(true, iVar);
            C2184f.m8346f().mo7095i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C2184f.m8346f().mo7092e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
