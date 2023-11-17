package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.C1005e;
import androidx.core.util.C1006f;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
class C1839y {

    /* renamed from: a */
    final SimpleArrayMap f5508a = new SimpleArrayMap();

    /* renamed from: b */
    final LongSparseArray f5509b = new LongSparseArray();

    /* renamed from: androidx.recyclerview.widget.y$a */
    static class C1840a {

        /* renamed from: d */
        static C1005e f5510d = new C1006f(20);

        /* renamed from: a */
        int f5511a;

        /* renamed from: b */
        RecyclerView.C1742m.C1744b f5512b;

        /* renamed from: c */
        RecyclerView.C1742m.C1744b f5513c;

        private C1840a() {
        }

        /* renamed from: a */
        static void m7191a() {
            do {
            } while (f5510d.mo3440b() != null);
        }

        /* renamed from: b */
        static C1840a m7192b() {
            C1840a aVar = (C1840a) f5510d.mo3440b();
            if (aVar == null) {
                return new C1840a();
            }
            return aVar;
        }

        /* renamed from: c */
        static void m7193c(C1840a aVar) {
            aVar.f5511a = 0;
            aVar.f5512b = null;
            aVar.f5513c = null;
            f5510d.mo3439a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.y$b */
    interface C1841b {
        /* renamed from: a */
        void mo5470a(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2);

        /* renamed from: b */
        void mo5471b(RecyclerView.C1734f0 f0Var);

        /* renamed from: c */
        void mo5472c(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2);

        /* renamed from: d */
        void mo5473d(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2);
    }

    C1839y() {
    }

    /* renamed from: l */
    private RecyclerView.C1742m.C1744b m7174l(RecyclerView.C1734f0 f0Var, int i) {
        C1840a aVar;
        RecyclerView.C1742m.C1744b bVar;
        int indexOfKey = this.f5508a.indexOfKey(f0Var);
        if (indexOfKey >= 0 && (aVar = (C1840a) this.f5508a.valueAt(indexOfKey)) != null) {
            int i2 = aVar.f5511a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.f5511a = i3;
                if (i == 4) {
                    bVar = aVar.f5512b;
                } else if (i == 8) {
                    bVar = aVar.f5513c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f5508a.removeAt(indexOfKey);
                    C1840a.m7193c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6084a(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null) {
            aVar = C1840a.m7192b();
            this.f5508a.put(f0Var, aVar);
        }
        aVar.f5511a |= 2;
        aVar.f5512b = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6085b(RecyclerView.C1734f0 f0Var) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null) {
            aVar = C1840a.m7192b();
            this.f5508a.put(f0Var, aVar);
        }
        aVar.f5511a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6086c(long j, RecyclerView.C1734f0 f0Var) {
        this.f5509b.put(j, f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6087d(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null) {
            aVar = C1840a.m7192b();
            this.f5508a.put(f0Var, aVar);
        }
        aVar.f5513c = bVar;
        aVar.f5511a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6088e(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null) {
            aVar = C1840a.m7192b();
            this.f5508a.put(f0Var, aVar);
        }
        aVar.f5512b = bVar;
        aVar.f5511a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6089f() {
        this.f5508a.clear();
        this.f5509b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1734f0 mo6090g(long j) {
        return (RecyclerView.C1734f0) this.f5509b.get(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo6091h(RecyclerView.C1734f0 f0Var) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null || (aVar.f5511a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6092i(RecyclerView.C1734f0 f0Var) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar == null || (aVar.f5511a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6093j() {
        C1840a.m7191a();
    }

    /* renamed from: k */
    public void mo6094k(RecyclerView.C1734f0 f0Var) {
        mo6098p(f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1742m.C1744b mo6095m(RecyclerView.C1734f0 f0Var) {
        return m7174l(f0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1742m.C1744b mo6096n(RecyclerView.C1734f0 f0Var) {
        return m7174l(f0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6097o(C1841b bVar) {
        for (int size = this.f5508a.size() - 1; size >= 0; size--) {
            RecyclerView.C1734f0 f0Var = (RecyclerView.C1734f0) this.f5508a.keyAt(size);
            C1840a aVar = (C1840a) this.f5508a.removeAt(size);
            int i = aVar.f5511a;
            if ((i & 3) == 3) {
                bVar.mo5471b(f0Var);
            } else if ((i & 1) != 0) {
                RecyclerView.C1742m.C1744b bVar2 = aVar.f5512b;
                if (bVar2 == null) {
                    bVar.mo5471b(f0Var);
                } else {
                    bVar.mo5472c(f0Var, bVar2, aVar.f5513c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo5470a(f0Var, aVar.f5512b, aVar.f5513c);
            } else if ((i & 12) == 12) {
                bVar.mo5473d(f0Var, aVar.f5512b, aVar.f5513c);
            } else if ((i & 4) != 0) {
                bVar.mo5472c(f0Var, aVar.f5512b, (RecyclerView.C1742m.C1744b) null);
            } else if ((i & 8) != 0) {
                bVar.mo5470a(f0Var, aVar.f5512b, aVar.f5513c);
            }
            C1840a.m7193c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6098p(RecyclerView.C1734f0 f0Var) {
        C1840a aVar = (C1840a) this.f5508a.get(f0Var);
        if (aVar != null) {
            aVar.f5511a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6099q(RecyclerView.C1734f0 f0Var) {
        int size = this.f5509b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (f0Var == this.f5509b.valueAt(size)) {
                this.f5509b.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        C1840a aVar = (C1840a) this.f5508a.remove(f0Var);
        if (aVar != null) {
            C1840a.m7193c(aVar);
        }
    }
}
