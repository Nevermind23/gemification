package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p048d2.C5804f;

/* renamed from: com.airbnb.lottie.k0 */
public class C2332k0 {

    /* renamed from: e */
    public static Executor f7317e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set f7318a;

    /* renamed from: b */
    private final Set f7319b;

    /* renamed from: c */
    private final Handler f7320c;

    /* renamed from: d */
    private volatile C2328i0 f7321d;

    /* renamed from: com.airbnb.lottie.k0$a */
    private class C2333a extends FutureTask {
        C2333a(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C2332k0.this.m9042k((C2328i0) get());
                } catch (InterruptedException | ExecutionException e) {
                    C2332k0.this.m9042k(new C2328i0(e));
                }
            }
        }
    }

    public C2332k0(Callable callable) {
        this(callable, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m9038e() {
        C2328i0 i0Var = this.f7321d;
        if (i0Var != null) {
            if (i0Var.mo7567b() != null) {
                m9041h(i0Var.mo7567b());
            } else {
                m9039f(i0Var.mo7566a());
            }
        }
    }

    /* renamed from: f */
    private synchronized void m9039f(Throwable th) {
        ArrayList<C2322f0> arrayList = new ArrayList<>(this.f7319b);
        if (arrayList.isEmpty()) {
            C5804f.m23335d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (C2322f0 a : arrayList) {
            a.mo7447a(th);
        }
    }

    /* renamed from: g */
    private void m9040g() {
        this.f7320c.post(new C2330j0(this));
    }

    /* renamed from: h */
    private synchronized void m9041h(Object obj) {
        for (C2322f0 a : new ArrayList(this.f7318a)) {
            a.mo7447a(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m9042k(C2328i0 i0Var) {
        if (this.f7321d == null) {
            this.f7321d = i0Var;
            m9040g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: c */
    public synchronized C2332k0 mo7573c(C2322f0 f0Var) {
        C2328i0 i0Var = this.f7321d;
        if (!(i0Var == null || i0Var.mo7566a() == null)) {
            f0Var.mo7447a(i0Var.mo7566a());
        }
        this.f7319b.add(f0Var);
        return this;
    }

    /* renamed from: d */
    public synchronized C2332k0 mo7574d(C2322f0 f0Var) {
        C2328i0 i0Var = this.f7321d;
        if (!(i0Var == null || i0Var.mo7567b() == null)) {
            f0Var.mo7447a(i0Var.mo7567b());
        }
        this.f7318a.add(f0Var);
        return this;
    }

    /* renamed from: i */
    public synchronized C2332k0 mo7575i(C2322f0 f0Var) {
        this.f7319b.remove(f0Var);
        return this;
    }

    /* renamed from: j */
    public synchronized C2332k0 mo7576j(C2322f0 f0Var) {
        this.f7318a.remove(f0Var);
        return this;
    }

    C2332k0(Callable callable, boolean z) {
        this.f7318a = new LinkedHashSet(1);
        this.f7319b = new LinkedHashSet(1);
        this.f7320c = new Handler(Looper.getMainLooper());
        this.f7321d = null;
        if (z) {
            try {
                m9042k((C2328i0) callable.call());
            } catch (Throwable th) {
                m9042k(new C2328i0(th));
            }
        } else {
            f7317e.execute(new C2333a(callable));
        }
    }
}
