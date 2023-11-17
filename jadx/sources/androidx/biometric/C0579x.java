package androidx.biometric;

import android.content.DialogInterface;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.x */
public class C0579x {

    /* renamed from: k */
    private static C0579x f2377k;

    /* renamed from: a */
    private int f2378a;

    /* renamed from: b */
    private C0565s f2379b;

    /* renamed from: c */
    private C0580y f2380c;

    /* renamed from: d */
    private C0586z f2381d;

    /* renamed from: e */
    private Executor f2382e;

    /* renamed from: f */
    private DialogInterface.OnClickListener f2383f;

    /* renamed from: g */
    private BiometricPrompt.C0534b f2384g;

    /* renamed from: h */
    private boolean f2385h;

    /* renamed from: i */
    private int f2386i = 0;

    /* renamed from: j */
    private int f2387j = 0;

    private C0579x() {
    }

    /* renamed from: e */
    static C0579x m2204e() {
        if (f2377k == null) {
            f2377k = new C0579x();
        }
        return f2377k;
    }

    /* renamed from: f */
    static C0579x m2205f() {
        return f2377k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BiometricPrompt.C0534b mo2454a() {
        return this.f2384g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2455b() {
        return this.f2378a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2456c() {
        return this.f2386i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Executor mo2457d() {
        return this.f2382e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2458g() {
        if (this.f2387j == 0) {
            this.f2387j = 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2459h() {
        return this.f2385h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2460i() {
        int i = this.f2387j;
        if (i != 2) {
            if (i == 1) {
                mo2468q();
                return;
            }
            this.f2378a = 0;
            this.f2379b = null;
            this.f2380c = null;
            this.f2381d = null;
            this.f2382e = null;
            this.f2383f = null;
            this.f2384g = null;
            this.f2386i = 0;
            this.f2385h = false;
            f2377k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2461j(C0565s sVar) {
        this.f2379b = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2462k(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.C0534b bVar) {
        this.f2382e = executor;
        this.f2383f = onClickListener;
        this.f2384g = bVar;
        C0565s sVar = this.f2379b;
        if (sVar == null || Build.VERSION.SDK_INT < 28) {
            C0580y yVar = this.f2380c;
            if (yVar != null && this.f2381d != null) {
                yVar.mo2473X1(onClickListener);
                this.f2381d.mo2484t1(executor, bVar);
                this.f2381d.mo2486v1(this.f2380c.mo2470M1());
                return;
            }
            return;
        }
        sVar.mo2440s1(executor, onClickListener, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2463l(int i) {
        this.f2378a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2464m(boolean z) {
        this.f2385h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2465n(int i) {
        this.f2386i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2466o(C0580y yVar, C0586z zVar) {
        this.f2380c = yVar;
        this.f2381d = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2467p() {
        this.f2387j = 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2468q() {
        this.f2387j = 0;
    }
}
