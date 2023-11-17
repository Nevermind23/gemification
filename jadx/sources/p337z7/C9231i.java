package p337z7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p182n6.C7264i;

/* renamed from: z7.i */
public abstract class C9231i {
    /* renamed from: a */
    public static Object m34107a(Task task) {
        C7264i.m27900i();
        C7264i.m27903l(task, "Task must not be null");
        if (task.mo24872q()) {
            return m34118l(task);
        }
        C9235l lVar = new C9235l((C9234k) null);
        m34119m(task, lVar);
        lVar.mo24895c();
        return m34118l(task);
    }

    /* renamed from: b */
    public static Object m34108b(Task task, long j, TimeUnit timeUnit) {
        C7264i.m27900i();
        C7264i.m27903l(task, "Task must not be null");
        C7264i.m27903l(timeUnit, "TimeUnit must not be null");
        if (task.mo24872q()) {
            return m34118l(task);
        }
        C9235l lVar = new C9235l((C9234k) null);
        m34119m(task, lVar);
        if (lVar.mo24896d(j, timeUnit)) {
            return m34118l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static Task m34109c(Callable callable) {
        return m34110d(C9229h.f25653a, callable);
    }

    /* renamed from: d */
    public static Task m34110d(Executor executor, Callable callable) {
        C7264i.m27903l(executor, "Executor must not be null");
        C7264i.m27903l(callable, "Callback must not be null");
        C9230h0 h0Var = new C9230h0();
        executor.execute(new C9232i0(h0Var, callable));
        return h0Var;
    }

    /* renamed from: e */
    public static Task m34111e() {
        C9230h0 h0Var = new C9230h0();
        h0Var.mo24891w();
        return h0Var;
    }

    /* renamed from: f */
    public static Task m34112f(Exception exc) {
        C9230h0 h0Var = new C9230h0();
        h0Var.mo24889u(exc);
        return h0Var;
    }

    /* renamed from: g */
    public static Task m34113g(Object obj) {
        C9230h0 h0Var = new C9230h0();
        h0Var.mo24890v(obj);
        return h0Var;
    }

    /* renamed from: h */
    public static Task m34114h(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return m34113g((Object) null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C9230h0 h0Var = new C9230h0();
        C9237n nVar = new C9237n(collection.size(), h0Var);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            m34119m((Task) it2.next(), nVar);
        }
        return h0Var;
    }

    /* renamed from: i */
    public static Task m34115i(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m34113g((Object) null);
        }
        return m34114h(Arrays.asList(taskArr));
    }

    /* renamed from: j */
    public static Task m34116j(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return m34113g(Collections.emptyList());
        }
        return m34114h(collection).mo24867l(C9229h.f25653a, new C9233j(collection));
    }

    /* renamed from: k */
    public static Task m34117k(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m34113g(Collections.emptyList());
        }
        return m34116j(Arrays.asList(taskArr));
    }

    /* renamed from: l */
    private static Object m34118l(Task task) {
        if (task.mo24873r()) {
            return task.mo24869n();
        }
        if (task.mo24871p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo24868m());
    }

    /* renamed from: m */
    private static void m34119m(Task task, C9236m mVar) {
        Executor executor = C9229h.f25654b;
        task.mo24863h(executor, mVar);
        task.mo24860e(executor, mVar);
        task.mo24856a(executor, mVar);
    }
}
