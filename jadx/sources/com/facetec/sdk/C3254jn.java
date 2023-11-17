package com.facetec.sdk;

import com.facetec.sdk.C3277jz;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.jn */
public final class C3254jn {

    /* renamed from: j */
    private static /* synthetic */ boolean f10640j = true;

    /* renamed from: a */
    final Deque<C3277jz.C3279b> f10641a = new ArrayDeque();

    /* renamed from: b */
    private int f10642b = 64;

    /* renamed from: c */
    private Runnable f10643c;

    /* renamed from: d */
    private int f10644d = 5;

    /* renamed from: e */
    private ExecutorService f10645e;

    /* renamed from: f */
    private final Deque<C3277jz> f10646f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C3277jz.C3279b> f10647g = new ArrayDeque();

    /* renamed from: e */
    private synchronized ExecutorService m13041e() {
        if (this.f10645e == null) {
            this.f10645e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3303ki.m13253b("OkHttp Dispatcher", false));
        }
        return this.f10645e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9479a() {
        int i;
        boolean z;
        if (f10640j || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<C3277jz.C3279b> it = this.f10641a.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C3277jz.C3279b next = it.next();
                    if (this.f10647g.size() >= this.f10642b) {
                        break;
                    }
                    for (C3277jz.C3279b next2 : this.f10647g) {
                        if (!C3277jz.this.f10759g && next2.mo9572d().equals(next.mo9572d())) {
                            i++;
                        }
                    }
                    if (i < this.f10644d) {
                        it.remove();
                        arrayList.add(next);
                        this.f10647g.add(next);
                    }
                }
                if (m13039d() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int size = arrayList.size();
            while (i < size) {
                C3277jz.C3279b bVar = (C3277jz.C3279b) arrayList.get(i);
                ExecutorService e = m13041e();
                if (C3277jz.C3279b.f10762c || !Thread.holdsLock(C3277jz.this.f10758e.mo9518l())) {
                    try {
                        e.execute(bVar);
                    } catch (RejectedExecutionException e2) {
                        new InterruptedIOException("executor rejected").initCause(e2);
                        C3264jt unused = C3277jz.this.f10757d;
                        bVar.f10764d.mo8842b();
                        C3277jz.this.f10758e.mo9518l().mo9481d(bVar);
                    } catch (Throwable th) {
                        C3277jz.this.f10758e.mo9518l().mo9481d(bVar);
                        throw th;
                    }
                    i++;
                } else {
                    throw new AssertionError();
                }
            }
            return z;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo9480b() {
        synchronized (this) {
            this.f10642b = 1;
        }
        mo9479a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9481d(C3277jz.C3279b bVar) {
        m13040d(this.f10647g, bVar);
    }

    /* renamed from: d */
    private <T> void m13040d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f10643c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!mo9479a() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    private synchronized int m13039d() {
        return this.f10647g.size() + this.f10646f.size();
    }
}
