package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
class C1782f {

    /* renamed from: a */
    final C1784b f5325a;

    /* renamed from: b */
    final C1783a f5326b = new C1783a();

    /* renamed from: c */
    final List f5327c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    static class C1783a {

        /* renamed from: a */
        long f5328a = 0;

        /* renamed from: b */
        C1783a f5329b;

        C1783a() {
        }

        /* renamed from: c */
        private void m6889c() {
            if (this.f5329b == null) {
                this.f5329b = new C1783a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5934a(int i) {
            if (i >= 64) {
                C1783a aVar = this.f5329b;
                if (aVar != null) {
                    aVar.mo5934a(i - 64);
                    return;
                }
                return;
            }
            this.f5328a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5935b(int i) {
            C1783a aVar = this.f5329b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5328a);
                }
                return Long.bitCount(this.f5328a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5328a & ((1 << i) - 1));
            } else {
                return aVar.mo5935b(i - 64) + Long.bitCount(this.f5328a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5936d(int i) {
            if (i >= 64) {
                m6889c();
                return this.f5329b.mo5936d(i - 64);
            } else if ((this.f5328a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5937e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m6889c();
                this.f5329b.mo5937e(i - 64, z);
                return;
            }
            long j = this.f5328a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f5328a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo5940h(i);
            } else {
                mo5934a(i);
            }
            if (z2 || this.f5329b != null) {
                m6889c();
                this.f5329b.mo5937e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5938f(int i) {
            boolean z;
            if (i >= 64) {
                m6889c();
                return this.f5329b.mo5938f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f5328a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f5328a = j3;
            long j4 = j - 1;
            this.f5328a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1783a aVar = this.f5329b;
            if (aVar != null) {
                if (aVar.mo5936d(0)) {
                    mo5940h(63);
                }
                this.f5329b.mo5938f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5939g() {
            this.f5328a = 0;
            C1783a aVar = this.f5329b;
            if (aVar != null) {
                aVar.mo5939g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5940h(int i) {
            if (i >= 64) {
                m6889c();
                this.f5329b.mo5940h(i - 64);
                return;
            }
            this.f5328a |= 1 << i;
        }

        public String toString() {
            if (this.f5329b == null) {
                return Long.toBinaryString(this.f5328a);
            }
            return this.f5329b.toString() + "xx" + Long.toBinaryString(this.f5328a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    interface C1784b {
        /* renamed from: a */
        View mo5474a(int i);

        /* renamed from: b */
        void mo5475b(View view);

        /* renamed from: c */
        int mo5476c();

        /* renamed from: d */
        RecyclerView.C1734f0 mo5477d(View view);

        /* renamed from: e */
        void mo5478e(int i);

        /* renamed from: f */
        void mo5479f(View view, int i);

        /* renamed from: g */
        void mo5480g();

        /* renamed from: h */
        int mo5481h(View view);

        /* renamed from: i */
        void mo5482i(View view);

        /* renamed from: j */
        void mo5483j(int i);

        /* renamed from: k */
        void mo5484k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    C1782f(C1784b bVar) {
        this.f5325a = bVar;
    }

    /* renamed from: h */
    private int m6869h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f5325a.mo5476c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.f5326b.mo5935b(i2));
            if (b == 0) {
                while (this.f5326b.mo5936d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m6870l(View view) {
        this.f5327c.add(view);
        this.f5325a.mo5475b(view);
    }

    /* renamed from: t */
    private boolean m6871t(View view) {
        if (!this.f5327c.remove(view)) {
            return false;
        }
        this.f5325a.mo5482i(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5916a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5325a.mo5476c();
        } else {
            i2 = m6869h(i);
        }
        this.f5326b.mo5937e(i2, z);
        if (z) {
            m6870l(view);
        }
        this.f5325a.mo5479f(view, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5917b(View view, boolean z) {
        mo5916a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5918c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5325a.mo5476c();
        } else {
            i2 = m6869h(i);
        }
        this.f5326b.mo5937e(i2, z);
        if (z) {
            m6870l(view);
        }
        this.f5325a.mo5484k(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5919d(int i) {
        int h = m6869h(i);
        this.f5326b.mo5938f(h);
        this.f5325a.mo5478e(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo5920e(int i) {
        int size = this.f5327c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f5327c.get(i2);
            RecyclerView.C1734f0 d = this.f5325a.mo5477d(view);
            if (d.getLayoutPosition() == i && !d.isInvalid() && !d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo5921f(int i) {
        return this.f5325a.mo5474a(m6869h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5922g() {
        return this.f5325a.mo5476c() - this.f5327c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo5923i(int i) {
        return this.f5325a.mo5474a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5924j() {
        return this.f5325a.mo5476c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5925k(View view) {
        int h = this.f5325a.mo5481h(view);
        if (h >= 0) {
            this.f5326b.mo5940h(h);
            m6870l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5926m(View view) {
        int h = this.f5325a.mo5481h(view);
        if (h != -1 && !this.f5326b.mo5936d(h)) {
            return h - this.f5326b.mo5935b(h);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo5927n(View view) {
        return this.f5327c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5928o() {
        this.f5326b.mo5939g();
        for (int size = this.f5327c.size() - 1; size >= 0; size--) {
            this.f5325a.mo5482i((View) this.f5327c.get(size));
            this.f5327c.remove(size);
        }
        this.f5325a.mo5480g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5929p(View view) {
        int h = this.f5325a.mo5481h(view);
        if (h >= 0) {
            if (this.f5326b.mo5938f(h)) {
                m6871t(view);
            }
            this.f5325a.mo5483j(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5930q(int i) {
        int h = m6869h(i);
        View a = this.f5325a.mo5474a(h);
        if (a != null) {
            if (this.f5326b.mo5938f(h)) {
                m6871t(a);
            }
            this.f5325a.mo5483j(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5931r(View view) {
        int h = this.f5325a.mo5481h(view);
        if (h == -1) {
            m6871t(view);
            return true;
        } else if (!this.f5326b.mo5936d(h)) {
            return false;
        } else {
            this.f5326b.mo5938f(h);
            m6871t(view);
            this.f5325a.mo5483j(h);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5932s(View view) {
        int h = this.f5325a.mo5481h(view);
        if (h < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f5326b.mo5936d(h)) {
            this.f5326b.mo5934a(h);
            m6871t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f5326b.toString() + ", hidden list:" + this.f5327c.size();
    }
}
