package p177n1;

import android.content.Context;
import androidx.work.C2073m;
import he1.C41238w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p151l1.C6861a;
import p216q1.C7819c;

/* renamed from: n1.h */
public abstract class C7207h {

    /* renamed from: a */
    private final C7819c f21368a;

    /* renamed from: b */
    private final Context f21369b;

    /* renamed from: c */
    private final Object f21370c = new Object();

    /* renamed from: d */
    private final LinkedHashSet f21371d = new LinkedHashSet();

    /* renamed from: e */
    private Object f21372e;

    protected C7207h(Context context, C7819c cVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
        this.f21368a = cVar;
        Context applicationContext = context.getApplicationContext();
        C41536l.m120488h(applicationContext, "context.applicationContext");
        this.f21369b = applicationContext;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m27750b(List list, C7207h hVar) {
        C41536l.m120489i(list, "$listenersList");
        C41536l.m120489i(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6861a) it.next()).mo20933a(hVar.f21372e);
        }
    }

    /* renamed from: c */
    public final void mo21571c(C6861a aVar) {
        C41536l.m120489i(aVar, "listener");
        synchronized (this.f21370c) {
            if (this.f21371d.add(aVar)) {
                if (this.f21371d.size() == 1) {
                    this.f21372e = mo21562e();
                    C2073m e = C2073m.m8071e();
                    String a = C7208i.f21373a;
                    e.mo6959a(a, getClass().getSimpleName() + ": initial state = " + this.f21372e);
                    mo21567h();
                }
                aVar.mo20933a(this.f21372e);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Context mo21572d() {
        return this.f21369b;
    }

    /* renamed from: e */
    public abstract Object mo21562e();

    /* renamed from: f */
    public final void mo21573f(C6861a aVar) {
        C41536l.m120489i(aVar, "listener");
        synchronized (this.f21370c) {
            if (this.f21371d.remove(aVar) && this.f21371d.isEmpty()) {
                mo21568i();
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: g */
    public final void mo21574g(Object obj) {
        synchronized (this.f21370c) {
            Object obj2 = this.f21372e;
            if (obj2 == null || !C41536l.m120484d(obj2, obj)) {
                this.f21372e = obj;
                this.f21368a.mo22737a().execute(new C7206g(C41358y.m120036z0(this.f21371d), this));
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: h */
    public abstract void mo21567h();

    /* renamed from: i */
    public abstract void mo21568i();
}
