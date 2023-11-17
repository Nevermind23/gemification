package p599se;

import com.threatmetrix.TrustDefender.C11893e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p585re.C17587d;
import p613te.C17931a;
import p613te.C17945c;
import p613te.C17946d;
import p613te.C17948f;
import p613te.C17952j;

/* renamed from: se.a */
public final class C17764a implements C11893e, C17587d {

    /* renamed from: g */
    private static final String f49568g;

    /* renamed from: h */
    public static int f49569h = m61443f();

    /* renamed from: i */
    public static int f49570i = m61443f();

    /* renamed from: j */
    public static int f49571j = 1;

    /* renamed from: k */
    public static int f49572k = 2;

    /* renamed from: a */
    private final List f49573a = new ArrayList(2);

    /* renamed from: b */
    private volatile int f49574b = 10000;

    /* renamed from: c */
    private volatile int f49575c = 0;

    /* renamed from: d */
    private byte[][] f49576d;

    /* renamed from: e */
    private byte[][] f49577e;

    /* renamed from: f */
    private ExecutorService f49578f = Executors.newCachedThreadPool();

    /* renamed from: se.a$a */
    public class C17765a extends FutureTask {
        public C17765a(Runnable runnable, Void voidR) {
            super(runnable, voidR);
        }

        public void run() {
            super.run();
            synchronized (C17764a.m61444g(C17764a.this)) {
                C17764a.m61444g(C17764a.this).remove(this);
            }
        }
    }

    static {
        String c = C17952j.m61850c(C17764a.class);
        if (((m61443f() + f49571j) * m61443f()) % f49572k != f49570i) {
        }
        f49568g = c;
    }

    /* renamed from: f */
    public static int m61443f() {
        return 69;
    }

    /* renamed from: g */
    public static /* synthetic */ List m61444g(C17764a aVar) {
        int i = f49569h;
        if (((f49571j + i) * i) % f49572k != f49570i) {
            f49569h = m61443f();
            f49570i = 70;
        }
        return aVar.f49573a;
    }

    /* renamed from: a */
    public void mo31942a(C11893e.C11894a aVar, String str, Map map, byte[] bArr, C11893e.C11895b bVar) {
        C17945c cVar = new C17945c(new C17946d(this.f49576d, this.f49577e, this.f49574b), aVar, str, map, bArr, this.f49575c, bVar);
        if (((m61443f() + f49571j) * m61443f()) % f49572k != f49570i) {
            f49569h = m61443f();
            f49570i = 45;
        }
        mo45353e(cVar);
    }

    /* renamed from: b */
    public void mo31943b() {
        synchronized (this.f49573a) {
            for (C17765a cancel : this.f49573a) {
                cancel.cancel(true);
            }
            this.f49573a.clear();
        }
    }

    /* renamed from: c */
    public String mo45140c() {
        int i = f49569h;
        if (((f49571j + i) * i) % f49572k != f49570i) {
            f49569h = m61443f();
            f49570i = m61443f();
        }
        return C17931a.m61768c("rkqlxr", 20, 4);
    }

    /* renamed from: d */
    public void mo31944d(String str) {
        int i = f49569h;
        if (((f49571j + i) * i) % f49572k != f49570i) {
            f49569h = m61443f();
            f49570i = 41;
        }
        mo45353e(new C17948f(str));
    }

    /* renamed from: e */
    public void mo45353e(Runnable runnable) {
        C17765a aVar = new C17765a(runnable, (Void) null);
        synchronized (this.f49573a) {
            this.f49573a.add(aVar);
        }
        this.f49578f.execute(aVar);
    }

    /* renamed from: h */
    public C17764a mo45354h(int i, TimeUnit timeUnit) {
        int i2 = f49569h;
        if (((f49571j + i2) * i2) % f49572k != f49570i) {
            f49569h = m61443f();
            f49570i = 16;
        }
        this.f49574b = (int) timeUnit.toMillis((long) i);
        if (this.f49574b < 1) {
            this.f49574b = 1;
        }
        return this;
    }
}
