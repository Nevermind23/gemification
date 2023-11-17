package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1182j3;
import androidx.core.view.C1188k3;
import androidx.core.view.ViewPropertyAnimatorCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
public class C0275h {

    /* renamed from: a */
    final ArrayList f1456a = new ArrayList();

    /* renamed from: b */
    private long f1457b = -1;

    /* renamed from: c */
    private Interpolator f1458c;

    /* renamed from: d */
    C1182j3 f1459d;

    /* renamed from: e */
    private boolean f1460e;

    /* renamed from: f */
    private final C1188k3 f1461f = new C0276a();

    /* renamed from: androidx.appcompat.view.h$a */
    class C0276a extends C1188k3 {

        /* renamed from: a */
        private boolean f1462a = false;

        /* renamed from: b */
        private int f1463b = 0;

        C0276a() {
        }

        /* renamed from: b */
        public void mo513b(View view) {
            int i = this.f1463b + 1;
            this.f1463b = i;
            if (i == C0275h.this.f1456a.size()) {
                C1182j3 j3Var = C0275h.this.f1459d;
                if (j3Var != null) {
                    j3Var.mo513b((View) null);
                }
                mo787d();
            }
        }

        /* renamed from: c */
        public void mo514c(View view) {
            if (!this.f1462a) {
                this.f1462a = true;
                C1182j3 j3Var = C0275h.this.f1459d;
                if (j3Var != null) {
                    j3Var.mo514c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo787d() {
            this.f1463b = 0;
            this.f1462a = false;
            C0275h.this.mo780b();
        }
    }

    /* renamed from: a */
    public void mo779a() {
        if (this.f1460e) {
            Iterator it = this.f1456a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).mo3470c();
            }
            this.f1460e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo780b() {
        this.f1460e = false;
    }

    /* renamed from: c */
    public C0275h mo781c(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f1460e) {
            this.f1456a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    /* renamed from: d */
    public C0275h mo782d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f1456a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.mo3475j(viewPropertyAnimatorCompat.mo3471d());
        this.f1456a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    /* renamed from: e */
    public C0275h mo783e(long j) {
        if (!this.f1460e) {
            this.f1457b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0275h mo784f(Interpolator interpolator) {
        if (!this.f1460e) {
            this.f1458c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0275h mo785g(C1182j3 j3Var) {
        if (!this.f1460e) {
            this.f1459d = j3Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo786h() {
        if (!this.f1460e) {
            Iterator it = this.f1456a.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
                long j = this.f1457b;
                if (j >= 0) {
                    viewPropertyAnimatorCompat.mo3472f(j);
                }
                Interpolator interpolator = this.f1458c;
                if (interpolator != null) {
                    viewPropertyAnimatorCompat.mo3473g(interpolator);
                }
                if (this.f1459d != null) {
                    viewPropertyAnimatorCompat.mo3474h(this.f1461f);
                }
                viewPropertyAnimatorCompat.mo3477l();
            }
            this.f1460e = true;
        }
    }
}
