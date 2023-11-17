package androidx.activity;

import androidx.core.util.C1000a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.h */
public abstract class C0152h {

    /* renamed from: a */
    private boolean f1037a;

    /* renamed from: b */
    private CopyOnWriteArrayList f1038b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private C1000a f1039c;

    public C0152h(boolean z) {
        this.f1037a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo360a(C0145a aVar) {
        this.f1038b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo361b();

    /* renamed from: c */
    public final boolean mo362c() {
        return this.f1037a;
    }

    /* renamed from: d */
    public final void mo363d() {
        Iterator it = this.f1038b.iterator();
        while (it.hasNext()) {
            ((C0145a) it.next()).cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo364e(C0145a aVar) {
        this.f1038b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo365f(boolean z) {
        this.f1037a = z;
        C1000a aVar = this.f1039c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo366g(C1000a aVar) {
        this.f1039c = aVar;
    }
}
