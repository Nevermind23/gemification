package p068e9;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: e9.s0 */
public abstract class C6107s0 {

    /* renamed from: a */
    private static final ExecutorService f18981a = C6109u.m24433c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: f */
    public static Object m24419f(Task task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo24865j(f18981a, new C6096n0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4, TimeUnit.SECONDS);
        }
        if (task.mo24873r()) {
            return task.mo24869n();
        }
        if (task.mo24871p()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.mo24872q()) {
            throw new IllegalStateException(task.mo24868m());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: g */
    public static boolean m24420g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static Task m24421h(Executor executor, Callable callable) {
        C9227g gVar = new C9227g();
        executor.execute(new C6100p0(callable, executor, gVar));
        return gVar.mo24883a();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m24423j(C9227g gVar, Task task) {
        if (task.mo24873r()) {
            gVar.mo24885c(task.mo24869n());
            return null;
        } else if (task.mo24868m() == null) {
            return null;
        } else {
            gVar.mo24884b(task.mo24868m());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m24424k(Callable callable, Executor executor, C9227g gVar) {
        try {
            ((Task) callable.call()).mo24865j(executor, new C6103q0(gVar));
        } catch (Exception e) {
            gVar.mo24884b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Void m24425l(C9227g gVar, Task task) {
        if (task.mo24873r()) {
            gVar.mo24887e(task.mo24869n());
            return null;
        } else if (task.mo24868m() == null) {
            return null;
        } else {
            gVar.mo24886d(task.mo24868m());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Void m24426m(C9227g gVar, Task task) {
        if (task.mo24873r()) {
            gVar.mo24887e(task.mo24869n());
            return null;
        } else if (task.mo24868m() == null) {
            return null;
        } else {
            gVar.mo24886d(task.mo24868m());
            return null;
        }
    }

    /* renamed from: n */
    public static Task m24427n(Executor executor, Task task, Task task2) {
        C9227g gVar = new C9227g();
        C6098o0 o0Var = new C6098o0(gVar);
        task.mo24865j(executor, o0Var);
        task2.mo24865j(executor, o0Var);
        return gVar.mo24883a();
    }

    /* renamed from: o */
    public static Task m24428o(Task task, Task task2) {
        C9227g gVar = new C9227g();
        C6105r0 r0Var = new C6105r0(gVar);
        task.mo24866k(r0Var);
        task2.mo24866k(r0Var);
        return gVar.mo24883a();
    }
}
