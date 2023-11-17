package p000a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: a.a */
public final class C0000a {

    /* renamed from: a */
    private final Set f0a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f1b;

    /* renamed from: a */
    public void mo1a(C0001b bVar) {
        if (this.f1b != null) {
            bVar.mo6a(this.f1b);
        }
        this.f0a.add(bVar);
    }

    /* renamed from: b */
    public void mo2b() {
        this.f1b = null;
    }

    /* renamed from: c */
    public void mo3c(Context context) {
        this.f1b = context;
        for (C0001b a : this.f0a) {
            a.mo6a(context);
        }
    }

    /* renamed from: d */
    public Context mo4d() {
        return this.f1b;
    }

    /* renamed from: e */
    public void mo5e(C0001b bVar) {
        this.f0a.remove(bVar);
    }
}
