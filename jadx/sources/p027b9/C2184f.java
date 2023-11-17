package p027b9;

import android.util.Log;

/* renamed from: b9.f */
public class C2184f {

    /* renamed from: c */
    static final C2184f f6376c = new C2184f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f6377a;

    /* renamed from: b */
    private int f6378b = 4;

    public C2184f(String str) {
        this.f6377a = str;
    }

    /* renamed from: a */
    private boolean m8345a(int i) {
        return this.f6378b <= i || Log.isLoggable(this.f6377a, i);
    }

    /* renamed from: f */
    public static C2184f m8346f() {
        return f6376c;
    }

    /* renamed from: b */
    public void mo7089b(String str) {
        mo7090c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo7090c(String str, Throwable th) {
        if (m8345a(3)) {
            Log.d(this.f6377a, str, th);
        }
    }

    /* renamed from: d */
    public void mo7091d(String str) {
        mo7092e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo7092e(String str, Throwable th) {
        if (m8345a(6)) {
            Log.e(this.f6377a, str, th);
        }
    }

    /* renamed from: g */
    public void mo7093g(String str) {
        mo7094h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo7094h(String str, Throwable th) {
        if (m8345a(4)) {
            Log.i(this.f6377a, str, th);
        }
    }

    /* renamed from: i */
    public void mo7095i(String str) {
        mo7096j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo7096j(String str, Throwable th) {
        if (m8345a(2)) {
            Log.v(this.f6377a, str, th);
        }
    }

    /* renamed from: k */
    public void mo7097k(String str) {
        mo7098l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo7098l(String str, Throwable th) {
        if (m8345a(5)) {
            Log.w(this.f6377a, str, th);
        }
    }
}
