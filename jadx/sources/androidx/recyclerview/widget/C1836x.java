package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.x */
class C1836x {

    /* renamed from: a */
    final C1838b f5501a;

    /* renamed from: b */
    C1837a f5502b = new C1837a();

    /* renamed from: androidx.recyclerview.widget.x$a */
    static class C1837a {

        /* renamed from: a */
        int f5503a = 0;

        /* renamed from: b */
        int f5504b;

        /* renamed from: c */
        int f5505c;

        /* renamed from: d */
        int f5506d;

        /* renamed from: e */
        int f5507e;

        C1837a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6079a(int i) {
            this.f5503a = i | this.f5503a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6080b() {
            int i = this.f5503a;
            if ((i & 7) != 0 && (i & (mo6081c(this.f5506d, this.f5504b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f5503a;
            if ((i2 & 112) != 0 && (i2 & (mo6081c(this.f5506d, this.f5505c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f5503a;
            if ((i3 & 1792) != 0 && (i3 & (mo6081c(this.f5507e, this.f5504b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f5503a;
            if ((i4 & 28672) == 0 || (i4 & (mo6081c(this.f5507e, this.f5505c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo6081c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6082d() {
            this.f5503a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6083e(int i, int i2, int i3, int i4) {
            this.f5504b = i;
            this.f5505c = i2;
            this.f5506d = i3;
            this.f5507e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.x$b */
    interface C1838b {
        /* renamed from: a */
        View mo5722a(int i);

        /* renamed from: b */
        int mo5723b(View view);

        /* renamed from: c */
        int mo5724c();

        /* renamed from: d */
        int mo5725d();

        /* renamed from: e */
        int mo5726e(View view);
    }

    C1836x(C1838b bVar) {
        this.f5501a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo6077a(int i, int i2, int i3, int i4) {
        int i5;
        int c = this.f5501a.mo5724c();
        int d = this.f5501a.mo5725d();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a = this.f5501a.mo5722a(i);
            this.f5502b.mo6083e(c, d, this.f5501a.mo5723b(a), this.f5501a.mo5726e(a));
            if (i3 != 0) {
                this.f5502b.mo6082d();
                this.f5502b.mo6079a(i3);
                if (this.f5502b.mo6080b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f5502b.mo6082d();
                this.f5502b.mo6079a(i4);
                if (this.f5502b.mo6080b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6078b(View view, int i) {
        this.f5502b.mo6083e(this.f5501a.mo5724c(), this.f5501a.mo5725d(), this.f5501a.mo5723b(view), this.f5501a.mo5726e(view));
        if (i == 0) {
            return false;
        }
        this.f5502b.mo6082d();
        this.f5502b.mo6079a(i);
        return this.f5502b.mo6080b();
    }
}
