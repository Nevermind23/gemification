package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
public abstract class C0264b {

    /* renamed from: d */
    private Object f1394d;

    /* renamed from: e */
    private boolean f1395e;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface C0265a {
        /* renamed from: a */
        void mo521a(C0264b bVar);

        /* renamed from: b */
        boolean mo522b(C0264b bVar, Menu menu);

        /* renamed from: c */
        boolean mo523c(C0264b bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo524d(C0264b bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo684c();

    /* renamed from: d */
    public abstract View mo685d();

    /* renamed from: e */
    public abstract Menu mo686e();

    /* renamed from: f */
    public abstract MenuInflater mo687f();

    /* renamed from: g */
    public abstract CharSequence mo688g();

    /* renamed from: h */
    public Object mo738h() {
        return this.f1394d;
    }

    /* renamed from: i */
    public abstract CharSequence mo689i();

    /* renamed from: j */
    public boolean mo739j() {
        return this.f1395e;
    }

    /* renamed from: k */
    public abstract void mo690k();

    /* renamed from: l */
    public abstract boolean mo691l();

    /* renamed from: m */
    public abstract void mo692m(View view);

    /* renamed from: n */
    public abstract void mo693n(int i);

    /* renamed from: o */
    public abstract void mo694o(CharSequence charSequence);

    /* renamed from: p */
    public void mo740p(Object obj) {
        this.f1394d = obj;
    }

    /* renamed from: q */
    public abstract void mo695q(int i);

    /* renamed from: r */
    public abstract void mo696r(CharSequence charSequence);

    /* renamed from: s */
    public void mo697s(boolean z) {
        this.f1395e = z;
    }
}
