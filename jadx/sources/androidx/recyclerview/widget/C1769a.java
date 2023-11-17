package androidx.recyclerview.widget;

import androidx.core.util.C1005e;
import androidx.core.util.C1006f;
import androidx.recyclerview.widget.C1822q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
final class C1769a implements C1822q.C1823a {

    /* renamed from: a */
    private C1005e f5282a;

    /* renamed from: b */
    final ArrayList f5283b;

    /* renamed from: c */
    final ArrayList f5284c;

    /* renamed from: d */
    final C1770a f5285d;

    /* renamed from: e */
    Runnable f5286e;

    /* renamed from: f */
    final boolean f5287f;

    /* renamed from: g */
    final C1822q f5288g;

    /* renamed from: h */
    private int f5289h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C1770a {
        /* renamed from: a */
        void mo5490a(int i, int i2);

        /* renamed from: b */
        void mo5491b(C1771b bVar);

        /* renamed from: c */
        void mo5492c(C1771b bVar);

        /* renamed from: d */
        void mo5493d(int i, int i2);

        /* renamed from: e */
        void mo5494e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.C1734f0 mo5495f(int i);

        /* renamed from: g */
        void mo5496g(int i, int i2);

        /* renamed from: h */
        void mo5497h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static final class C1771b {

        /* renamed from: a */
        int f5290a;

        /* renamed from: b */
        int f5291b;

        /* renamed from: c */
        Object f5292c;

        /* renamed from: d */
        int f5293d;

        C1771b(int i, int i2, int i3, Object obj) {
            this.f5290a = i;
            this.f5291b = i2;
            this.f5293d = i3;
            this.f5292c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo5889a() {
            int i = this.f5290a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1771b)) {
                return false;
            }
            C1771b bVar = (C1771b) obj;
            int i = this.f5290a;
            if (i != bVar.f5290a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f5293d - this.f5291b) == 1 && this.f5293d == bVar.f5291b && this.f5291b == bVar.f5293d) {
                return true;
            }
            if (this.f5293d != bVar.f5293d || this.f5291b != bVar.f5291b) {
                return false;
            }
            Object obj2 = this.f5292c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f5292c)) {
                    return false;
                }
            } else if (bVar.f5292c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5290a * 31) + this.f5291b) * 31) + this.f5293d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo5889a() + ",s:" + this.f5291b + "c:" + this.f5293d + ",p:" + this.f5292c + "]";
        }
    }

    C1769a(C1770a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m6809c(C1771b bVar) {
        m6815v(bVar);
    }

    /* renamed from: d */
    private void m6810d(C1771b bVar) {
        m6815v(bVar);
    }

    /* renamed from: f */
    private void m6811f(C1771b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f5291b;
        int i2 = bVar.f5293d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f5285d.mo5495f(i3) != null || m6813h(i3)) {
                if (c2 == 0) {
                    m6814k(mo5871a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6815v(mo5871a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f5293d) {
            mo5872b(bVar);
            bVar = mo5871a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m6814k(bVar);
        } else {
            m6815v(bVar);
        }
    }

    /* renamed from: g */
    private void m6812g(C1771b bVar) {
        int i = bVar.f5291b;
        int i2 = bVar.f5293d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f5285d.mo5495f(i) != null || m6813h(i)) {
                if (!z) {
                    m6814k(mo5871a(4, i4, i3, bVar.f5292c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m6815v(mo5871a(4, i4, i3, bVar.f5292c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f5293d) {
            Object obj = bVar.f5292c;
            mo5872b(bVar);
            bVar = mo5871a(4, i4, i3, obj);
        }
        if (!z) {
            m6814k(bVar);
        } else {
            m6815v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m6813h(int i) {
        int size = this.f5284c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1771b bVar = (C1771b) this.f5284c.get(i2);
            int i3 = bVar.f5290a;
            if (i3 == 8) {
                if (mo5878n(bVar.f5293d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f5291b;
                int i5 = bVar.f5293d + i4;
                while (i4 < i5) {
                    if (mo5878n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m6814k(C1771b bVar) {
        int i;
        boolean z;
        int i2 = bVar.f5290a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z2 = m6816z(bVar.f5291b, i2);
        int i3 = bVar.f5291b;
        int i4 = bVar.f5290a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f5293d; i6++) {
            int z3 = m6816z(bVar.f5291b + (i * i6), bVar.f5290a);
            int i7 = bVar.f5290a;
            if (i7 == 2 ? z3 != z2 : !(i7 == 4 && z3 == z2 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i5++;
            } else {
                C1771b a = mo5871a(i7, z2, i5, bVar.f5292c);
                mo5876l(a, i3);
                mo5872b(a);
                if (bVar.f5290a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                z2 = z3;
            }
        }
        Object obj = bVar.f5292c;
        mo5872b(bVar);
        if (i5 > 0) {
            C1771b a2 = mo5871a(bVar.f5290a, z2, i5, obj);
            mo5876l(a2, i3);
            mo5872b(a2);
        }
    }

    /* renamed from: v */
    private void m6815v(C1771b bVar) {
        this.f5284c.add(bVar);
        int i = bVar.f5290a;
        if (i == 1) {
            this.f5285d.mo5496g(bVar.f5291b, bVar.f5293d);
        } else if (i == 2) {
            this.f5285d.mo5493d(bVar.f5291b, bVar.f5293d);
        } else if (i == 4) {
            this.f5285d.mo5494e(bVar.f5291b, bVar.f5293d, bVar.f5292c);
        } else if (i == 8) {
            this.f5285d.mo5490a(bVar.f5291b, bVar.f5293d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m6816z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f5284c.size() - 1; size >= 0; size--) {
            C1771b bVar = (C1771b) this.f5284c.get(size);
            int i5 = bVar.f5290a;
            if (i5 == 8) {
                int i6 = bVar.f5291b;
                int i7 = bVar.f5293d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f5291b = i6 + 1;
                            bVar.f5293d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f5291b = i6 - 1;
                            bVar.f5293d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f5293d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f5293d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f5291b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f5291b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f5291b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f5293d;
                    } else if (i5 == 2) {
                        i += bVar.f5293d;
                    }
                } else if (i2 == 1) {
                    bVar.f5291b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f5291b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f5284c.size() - 1; size2 >= 0; size2--) {
            C1771b bVar2 = (C1771b) this.f5284c.get(size2);
            if (bVar2.f5290a == 8) {
                int i9 = bVar2.f5293d;
                if (i9 == bVar2.f5291b || i9 < 0) {
                    this.f5284c.remove(size2);
                    mo5872b(bVar2);
                }
            } else if (bVar2.f5293d <= 0) {
                this.f5284c.remove(size2);
                mo5872b(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public C1771b mo5871a(int i, int i2, int i3, Object obj) {
        C1771b bVar = (C1771b) this.f5282a.mo3440b();
        if (bVar == null) {
            return new C1771b(i, i2, i3, obj);
        }
        bVar.f5290a = i;
        bVar.f5291b = i2;
        bVar.f5293d = i3;
        bVar.f5292c = obj;
        return bVar;
    }

    /* renamed from: b */
    public void mo5872b(C1771b bVar) {
        if (!this.f5287f) {
            bVar.f5292c = null;
            this.f5282a.mo3439a(bVar);
        }
    }

    /* renamed from: e */
    public int mo5873e(int i) {
        int size = this.f5283b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1771b bVar = (C1771b) this.f5283b.get(i2);
            int i3 = bVar.f5290a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f5291b;
                    if (i4 <= i) {
                        int i5 = bVar.f5293d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f5291b;
                    if (i6 == i) {
                        i = bVar.f5293d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f5293d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f5291b <= i) {
                i += bVar.f5293d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5874i() {
        int size = this.f5284c.size();
        for (int i = 0; i < size; i++) {
            this.f5285d.mo5492c((C1771b) this.f5284c.get(i));
        }
        mo5887x(this.f5284c);
        this.f5289h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5875j() {
        mo5874i();
        int size = this.f5283b.size();
        for (int i = 0; i < size; i++) {
            C1771b bVar = (C1771b) this.f5283b.get(i);
            int i2 = bVar.f5290a;
            if (i2 == 1) {
                this.f5285d.mo5492c(bVar);
                this.f5285d.mo5496g(bVar.f5291b, bVar.f5293d);
            } else if (i2 == 2) {
                this.f5285d.mo5492c(bVar);
                this.f5285d.mo5497h(bVar.f5291b, bVar.f5293d);
            } else if (i2 == 4) {
                this.f5285d.mo5492c(bVar);
                this.f5285d.mo5494e(bVar.f5291b, bVar.f5293d, bVar.f5292c);
            } else if (i2 == 8) {
                this.f5285d.mo5492c(bVar);
                this.f5285d.mo5490a(bVar.f5291b, bVar.f5293d);
            }
            Runnable runnable = this.f5286e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5887x(this.f5283b);
        this.f5289h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5876l(C1771b bVar, int i) {
        this.f5285d.mo5491b(bVar);
        int i2 = bVar.f5290a;
        if (i2 == 2) {
            this.f5285d.mo5497h(i, bVar.f5293d);
        } else if (i2 == 4) {
            this.f5285d.mo5494e(i, bVar.f5293d, bVar.f5292c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5877m(int i) {
        return mo5878n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo5878n(int i, int i2) {
        int size = this.f5284c.size();
        while (i2 < size) {
            C1771b bVar = (C1771b) this.f5284c.get(i2);
            int i3 = bVar.f5290a;
            if (i3 == 8) {
                int i4 = bVar.f5291b;
                if (i4 == i) {
                    i = bVar.f5293d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f5293d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f5291b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f5293d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f5293d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5879o(int i) {
        return (i & this.f5289h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5880p() {
        return this.f5283b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5881q() {
        return !this.f5284c.isEmpty() && !this.f5283b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5882r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f5283b.add(mo5871a(4, i, i2, obj));
        this.f5289h |= 4;
        if (this.f5283b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5883s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5283b.add(mo5871a(1, i, i2, (Object) null));
        this.f5289h |= 1;
        if (this.f5283b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5884t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f5283b.add(mo5871a(8, i, i2, (Object) null));
            this.f5289h |= 8;
            if (this.f5283b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5885u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5283b.add(mo5871a(2, i, i2, (Object) null));
        this.f5289h |= 2;
        if (this.f5283b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5886w() {
        this.f5288g.mo6031b(this.f5283b);
        int size = this.f5283b.size();
        for (int i = 0; i < size; i++) {
            C1771b bVar = (C1771b) this.f5283b.get(i);
            int i2 = bVar.f5290a;
            if (i2 == 1) {
                m6809c(bVar);
            } else if (i2 == 2) {
                m6811f(bVar);
            } else if (i2 == 4) {
                m6812g(bVar);
            } else if (i2 == 8) {
                m6810d(bVar);
            }
            Runnable runnable = this.f5286e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5283b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5887x(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5872b((C1771b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5888y() {
        mo5887x(this.f5283b);
        mo5887x(this.f5284c);
        this.f5289h = 0;
    }

    C1769a(C1770a aVar, boolean z) {
        this.f5282a = new C1006f(30);
        this.f5283b = new ArrayList();
        this.f5284c = new ArrayList();
        this.f5289h = 0;
        this.f5285d = aVar;
        this.f5287f = z;
        this.f5288g = new C1822q(this);
    }
}
