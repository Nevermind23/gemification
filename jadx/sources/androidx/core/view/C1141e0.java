package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.e0 */
public class C1141e0 {

    /* renamed from: a */
    private final Runnable f3803a;

    /* renamed from: b */
    private final CopyOnWriteArrayList f3804b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Map f3805c = new HashMap();

    /* renamed from: androidx.core.view.e0$a */
    private static class C1142a {

        /* renamed from: a */
        final C1593j f3806a;

        /* renamed from: b */
        private C1606m f3807b;

        C1142a(C1593j jVar, C1606m mVar) {
            this.f3806a = jVar;
            this.f3807b = mVar;
            jVar.mo4906a(mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3706a() {
            this.f3806a.mo4909d(this.f3807b);
            this.f3807b = null;
        }
    }

    public C1141e0(Runnable runnable) {
        this.f3803a = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m4192f(C1242t0 t0Var, C1619q qVar, C1593j.C1594a aVar) {
        if (aVar == C1593j.C1594a.ON_DESTROY) {
            mo3705l(t0Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m4193g(C1593j.C1598b bVar, C1242t0 t0Var, C1619q qVar, C1593j.C1594a aVar) {
        if (aVar == C1593j.C1594a.m5630e(bVar)) {
            mo3698c(t0Var);
        } else if (aVar == C1593j.C1594a.ON_DESTROY) {
            mo3705l(t0Var);
        } else if (aVar == C1593j.C1594a.m5629b(bVar)) {
            this.f3804b.remove(t0Var);
            this.f3803a.run();
        }
    }

    /* renamed from: c */
    public void mo3698c(C1242t0 t0Var) {
        this.f3804b.add(t0Var);
        this.f3803a.run();
    }

    /* renamed from: d */
    public void mo3699d(C1242t0 t0Var, C1619q qVar) {
        mo3698c(t0Var);
        C1593j lifecycle = qVar.getLifecycle();
        C1142a aVar = (C1142a) this.f3805c.remove(t0Var);
        if (aVar != null) {
            aVar.mo3706a();
        }
        this.f3805c.put(t0Var, new C1142a(lifecycle, new C1122c0(this, t0Var)));
    }

    /* renamed from: e */
    public void mo3700e(C1242t0 t0Var, C1619q qVar, C1593j.C1598b bVar) {
        C1593j lifecycle = qVar.getLifecycle();
        C1142a aVar = (C1142a) this.f3805c.remove(t0Var);
        if (aVar != null) {
            aVar.mo3706a();
        }
        this.f3805c.put(t0Var, new C1142a(lifecycle, new C1135d0(this, bVar, t0Var)));
    }

    /* renamed from: h */
    public void mo3701h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f3804b.iterator();
        while (it.hasNext()) {
            ((C1242t0) it.next()).mo3723d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void mo3702i(Menu menu) {
        Iterator it = this.f3804b.iterator();
        while (it.hasNext()) {
            ((C1242t0) it.next()).mo3720a(menu);
        }
    }

    /* renamed from: j */
    public boolean mo3703j(MenuItem menuItem) {
        Iterator it = this.f3804b.iterator();
        while (it.hasNext()) {
            if (((C1242t0) it.next()).mo3722c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3704k(Menu menu) {
        Iterator it = this.f3804b.iterator();
        while (it.hasNext()) {
            ((C1242t0) it.next()).mo3721b(menu);
        }
    }

    /* renamed from: l */
    public void mo3705l(C1242t0 t0Var) {
        this.f3804b.remove(t0Var);
        C1142a aVar = (C1142a) this.f3805c.remove(t0Var);
        if (aVar != null) {
            aVar.mo3706a();
        }
        this.f3803a.run();
    }
}
