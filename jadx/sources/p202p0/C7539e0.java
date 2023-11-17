package p202p0;

import android.os.Bundle;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.flow.C41558c;
import kotlinx.coroutines.flow.C41568k;
import kotlinx.coroutines.flow.C41578r;
import kotlinx.coroutines.flow.C41581t;

/* renamed from: p0.e0 */
public abstract class C7539e0 {

    /* renamed from: a */
    private final ReentrantLock f21986a = new ReentrantLock(true);

    /* renamed from: b */
    private final C41568k f21987b;

    /* renamed from: c */
    private final C41568k f21988c;

    /* renamed from: d */
    private boolean f21989d;

    /* renamed from: e */
    private final C41578r f21990e;

    /* renamed from: f */
    private final C41578r f21991f;

    public C7539e0() {
        C41568k a = C41581t.m120610a(C41341q.m119907j());
        this.f21987b = a;
        C41568k a2 = C41581t.m120610a(C41357x0.m119985e());
        this.f21988c = a2;
        this.f21990e = C41558c.m120515b(a);
        this.f21991f = C41558c.m120515b(a2);
    }

    /* renamed from: a */
    public abstract C7549j mo22070a(C7589q qVar, Bundle bundle);

    /* renamed from: b */
    public final C41578r mo22071b() {
        return this.f21990e;
    }

    /* renamed from: c */
    public final C41578r mo22072c() {
        return this.f21991f;
    }

    /* renamed from: d */
    public final boolean mo22073d() {
        return this.f21989d;
    }

    /* renamed from: e */
    public void mo22074e(C7549j jVar) {
        C41536l.m120489i(jVar, "entry");
        C41568k kVar = this.f21988c;
        kVar.setValue(C41361y0.m120039k((Set) kVar.getValue(), jVar));
    }

    /* renamed from: f */
    public void mo22075f(C7549j jVar) {
        C41536l.m120489i(jVar, "backStackEntry");
        C41568k kVar = this.f21987b;
        kVar.setValue(C41358y.m120024n0(C41358y.m120022l0((Iterable) kVar.getValue(), C41358y.m120019i0((List) this.f21987b.getValue())), jVar));
    }

    /* renamed from: g */
    public void mo22076g(C7549j jVar, boolean z) {
        C41536l.m120489i(jVar, "popUpTo");
        ReentrantLock reentrantLock = this.f21986a;
        reentrantLock.lock();
        try {
            C41568k kVar = this.f21987b;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) kVar.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!C41536l.m120484d((C7549j) next, jVar))) {
                    break;
                }
                arrayList.add(next);
            }
            kVar.setValue(arrayList);
            C41238w wVar = C41238w.f97225a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public void mo22077h(C7549j jVar) {
        C41536l.m120489i(jVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f21986a;
        reentrantLock.lock();
        try {
            C41568k kVar = this.f21987b;
            kVar.setValue(C41358y.m120024n0((Collection) kVar.getValue(), jVar));
            C41238w wVar = C41238w.f97225a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final void mo22078i(boolean z) {
        this.f21989d = z;
    }
}
