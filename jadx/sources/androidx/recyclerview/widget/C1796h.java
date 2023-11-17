package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
public abstract class C1796h {

    /* renamed from: a */
    private static final Comparator f5381a = new C1797a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    class C1797a implements Comparator {
        C1797a() {
        }

        /* renamed from: a */
        public int compare(C1800d dVar, C1800d dVar2) {
            return dVar.f5384a - dVar2.f5384a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public static abstract class C1798b {
        /* renamed from: a */
        public abstract boolean mo5907a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo5908b(int i, int i2);

        /* renamed from: c */
        public Object mo5909c(int i, int i2) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo5910d();

        /* renamed from: e */
        public abstract int mo5911e();
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    static class C1799c {

        /* renamed from: a */
        private final int[] f5382a;

        /* renamed from: b */
        private final int f5383b;

        C1799c(int i) {
            int[] iArr = new int[i];
            this.f5382a = iArr;
            this.f5383b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo5969a() {
            return this.f5382a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5970b(int i) {
            return this.f5382a[i + this.f5383b];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5971c(int i, int i2) {
            this.f5382a[i + this.f5383b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    static class C1800d {

        /* renamed from: a */
        public final int f5384a;

        /* renamed from: b */
        public final int f5385b;

        /* renamed from: c */
        public final int f5386c;

        C1800d(int i, int i2, int i3) {
            this.f5384a = i;
            this.f5385b = i2;
            this.f5386c = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5972a() {
            return this.f5384a + this.f5386c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5973b() {
            return this.f5385b + this.f5386c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    public static class C1801e {

        /* renamed from: a */
        private final List f5387a;

        /* renamed from: b */
        private final int[] f5388b;

        /* renamed from: c */
        private final int[] f5389c;

        /* renamed from: d */
        private final C1798b f5390d;

        /* renamed from: e */
        private final int f5391e;

        /* renamed from: f */
        private final int f5392f;

        /* renamed from: g */
        private final boolean f5393g;

        C1801e(C1798b bVar, List list, int[] iArr, int[] iArr2, boolean z) {
            this.f5387a = list;
            this.f5388b = iArr;
            this.f5389c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5390d = bVar;
            this.f5391e = bVar.mo5911e();
            this.f5392f = bVar.mo5910d();
            this.f5393g = z;
            m6943a();
            m6945e();
        }

        /* renamed from: a */
        private void m6943a() {
            C1800d dVar;
            if (this.f5387a.isEmpty()) {
                dVar = null;
            } else {
                dVar = (C1800d) this.f5387a.get(0);
            }
            if (!(dVar != null && dVar.f5384a == 0 && dVar.f5385b == 0)) {
                this.f5387a.add(0, new C1800d(0, 0, 0));
            }
            this.f5387a.add(new C1800d(this.f5391e, this.f5392f, 0));
        }

        /* renamed from: d */
        private void m6944d(int i) {
            int i2;
            int size = this.f5387a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C1800d dVar = (C1800d) this.f5387a.get(i4);
                while (i3 < dVar.f5385b) {
                    if (this.f5389c[i3] != 0 || !this.f5390d.mo5908b(i, i3)) {
                        i3++;
                    } else {
                        if (this.f5390d.mo5907a(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f5388b[i] = (i3 << 4) | i2;
                        this.f5389c[i3] = (i << 4) | i2;
                        return;
                    }
                }
                i3 = dVar.mo5973b();
            }
        }

        /* renamed from: e */
        private void m6945e() {
            int i;
            for (C1800d dVar : this.f5387a) {
                for (int i2 = 0; i2 < dVar.f5386c; i2++) {
                    int i3 = dVar.f5384a + i2;
                    int i4 = dVar.f5385b + i2;
                    if (this.f5390d.mo5907a(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f5388b[i3] = (i4 << 4) | i;
                    this.f5389c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f5393g) {
                m6946f();
            }
        }

        /* renamed from: f */
        private void m6946f() {
            int i = 0;
            for (C1800d dVar : this.f5387a) {
                while (i < dVar.f5384a) {
                    if (this.f5388b[i] == 0) {
                        m6944d(i);
                    }
                    i++;
                }
                i = dVar.mo5972a();
            }
        }

        /* renamed from: g */
        private static C1803g m6947g(Collection collection, int i, boolean z) {
            C1803g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (C1803g) it.next();
                if (gVar.f5394a == i && gVar.f5396c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C1803g gVar2 = (C1803g) it.next();
                if (z) {
                    gVar2.f5395b--;
                } else {
                    gVar2.f5395b++;
                }
            }
            return gVar;
        }

        /* renamed from: b */
        public void mo5974b(C1821p pVar) {
            C1781e eVar;
            int i;
            if (pVar instanceof C1781e) {
                eVar = (C1781e) pVar;
            } else {
                eVar = new C1781e(pVar);
            }
            int i2 = this.f5391e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f5391e;
            int i4 = this.f5392f;
            for (int size = this.f5387a.size() - 1; size >= 0; size--) {
                C1800d dVar = (C1800d) this.f5387a.get(size);
                int a = dVar.mo5972a();
                int b = dVar.mo5973b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f5388b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C1803g g = m6947g(arrayDeque, i6, false);
                        if (g != null) {
                            int i7 = (i2 - g.f5395b) - 1;
                            eVar.mo5896d(i3, i7);
                            if ((i5 & 4) != 0) {
                                eVar.mo5895c(i7, 1, this.f5390d.mo5909c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C1803g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        eVar.mo5894b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.f5389c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C1803g g2 = m6947g(arrayDeque, i9, true);
                        if (g2 == null) {
                            arrayDeque.add(new C1803g(i4, i2 - i3, false));
                        } else {
                            eVar.mo5896d((i2 - g2.f5395b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                eVar.mo5895c(i3, 1, this.f5390d.mo5909c(i9, i4));
                            }
                        }
                    } else {
                        eVar.mo5893a(i3, 1);
                        i2++;
                    }
                }
                int i12 = dVar.f5384a;
                int i13 = dVar.f5385b;
                for (i = 0; i < dVar.f5386c; i++) {
                    if ((this.f5388b[i12] & 15) == 2) {
                        eVar.mo5895c(i12, 1, this.f5390d.mo5909c(i12, i13));
                    }
                    i12++;
                    i13++;
                }
                i3 = dVar.f5384a;
                i4 = dVar.f5385b;
            }
            eVar.mo5915e();
        }

        /* renamed from: c */
        public void mo5975c(RecyclerView.C1736h hVar) {
            mo5974b(new C1772b(hVar));
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    public static abstract class C1802f {
        /* renamed from: a */
        public abstract boolean mo5976a(Object obj, Object obj2);

        /* renamed from: b */
        public abstract boolean mo5977b(Object obj, Object obj2);

        /* renamed from: c */
        public Object mo5978c(Object obj, Object obj2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    private static class C1803g {

        /* renamed from: a */
        int f5394a;

        /* renamed from: b */
        int f5395b;

        /* renamed from: c */
        boolean f5396c;

        C1803g(int i, int i2, boolean z) {
            this.f5394a = i;
            this.f5395b = i2;
            this.f5396c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h */
    static class C1804h {

        /* renamed from: a */
        int f5397a;

        /* renamed from: b */
        int f5398b;

        /* renamed from: c */
        int f5399c;

        /* renamed from: d */
        int f5400d;

        public C1804h() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5979a() {
            return this.f5400d - this.f5399c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5980b() {
            return this.f5398b - this.f5397a;
        }

        public C1804h(int i, int i2, int i3, int i4) {
            this.f5397a = i;
            this.f5398b = i2;
            this.f5399c = i3;
            this.f5400d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$i */
    static class C1805i {

        /* renamed from: a */
        public int f5401a;

        /* renamed from: b */
        public int f5402b;

        /* renamed from: c */
        public int f5403c;

        /* renamed from: d */
        public int f5404d;

        /* renamed from: e */
        public boolean f5405e;

        C1805i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5981a() {
            return Math.min(this.f5403c - this.f5401a, this.f5404d - this.f5402b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5982b() {
            return this.f5404d - this.f5402b != this.f5403c - this.f5401a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5983c() {
            return this.f5404d - this.f5402b > this.f5403c - this.f5401a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1800d mo5984d() {
            if (!mo5982b()) {
                int i = this.f5401a;
                return new C1800d(i, this.f5402b, this.f5403c - i);
            } else if (this.f5405e) {
                return new C1800d(this.f5401a, this.f5402b, mo5981a());
            } else {
                if (mo5983c()) {
                    return new C1800d(this.f5401a, this.f5402b + 1, mo5981a());
                }
                return new C1800d(this.f5401a + 1, this.f5402b, mo5981a());
            }
        }
    }

    /* renamed from: a */
    private static C1805i m6927a(C1804h hVar, C1798b bVar, C1799c cVar, C1799c cVar2, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if ((hVar.mo5980b() - hVar.mo5979a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b = hVar.mo5980b() - hVar.mo5979a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar2.mo5970b(i7 + 1) < cVar2.mo5970b(i7 - 1))) {
                i3 = cVar2.mo5970b(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.mo5970b(i7 - 1);
                i2 = i3 - 1;
            }
            int i8 = hVar.f5400d - ((hVar.f5398b - i2) - i7);
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 + 1;
            }
            while (i2 > hVar.f5397a && i8 > hVar.f5399c && bVar.mo5908b(i2 - 1, i8 - 1)) {
                i2--;
                i8--;
            }
            cVar2.mo5971c(i7, i2);
            if (!z || (i5 = b - i7) < i6 || i5 > i || cVar.mo5970b(i5) < i2) {
                i7 += 2;
            } else {
                C1805i iVar = new C1805i();
                iVar.f5401a = i2;
                iVar.f5402b = i8;
                iVar.f5403c = i3;
                iVar.f5404d = i4;
                iVar.f5405e = true;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1801e m6928b(C1798b bVar) {
        return m6929c(bVar, true);
    }

    /* renamed from: c */
    public static C1801e m6929c(C1798b bVar, boolean z) {
        C1804h hVar;
        int e = bVar.mo5911e();
        int d = bVar.mo5910d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1804h(0, e, 0, d));
        int i = ((((e + d) + 1) / 2) * 2) + 1;
        C1799c cVar = new C1799c(i);
        C1799c cVar2 = new C1799c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1804h hVar2 = (C1804h) arrayList2.remove(arrayList2.size() - 1);
            C1805i e2 = m6931e(hVar2, bVar, cVar, cVar2);
            if (e2 != null) {
                if (e2.mo5981a() > 0) {
                    arrayList.add(e2.mo5984d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C1804h();
                } else {
                    hVar = (C1804h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f5397a = hVar2.f5397a;
                hVar.f5399c = hVar2.f5399c;
                hVar.f5398b = e2.f5401a;
                hVar.f5400d = e2.f5402b;
                arrayList2.add(hVar);
                hVar2.f5398b = hVar2.f5398b;
                hVar2.f5400d = hVar2.f5400d;
                hVar2.f5397a = e2.f5403c;
                hVar2.f5399c = e2.f5404d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f5381a);
        return new C1801e(bVar, arrayList, cVar.mo5969a(), cVar2.mo5969a(), z);
    }

    /* renamed from: d */
    private static C1805i m6930d(C1804h hVar, C1798b bVar, C1799c cVar, C1799c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (Math.abs(hVar.mo5980b() - hVar.mo5979a()) % 2 != 1) {
            z = false;
        }
        int b = hVar.mo5980b() - hVar.mo5979a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar.mo5970b(i7 + 1) > cVar.mo5970b(i7 - 1))) {
                i3 = cVar.mo5970b(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar.mo5970b(i7 - 1);
                i2 = i3 + 1;
            }
            int i8 = (hVar.f5399c + (i2 - hVar.f5397a)) - i7;
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 - 1;
            }
            while (i2 < hVar.f5398b && i8 < hVar.f5400d && bVar.mo5908b(i2, i8)) {
                i2++;
                i8++;
            }
            cVar.mo5971c(i7, i2);
            if (!z || (i5 = b - i7) < i6 + 1 || i5 > i - 1 || cVar2.mo5970b(i5) > i2) {
                i7 += 2;
            } else {
                C1805i iVar = new C1805i();
                iVar.f5401a = i3;
                iVar.f5402b = i4;
                iVar.f5403c = i2;
                iVar.f5404d = i8;
                iVar.f5405e = false;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static C1805i m6931e(C1804h hVar, C1798b bVar, C1799c cVar, C1799c cVar2) {
        if (hVar.mo5980b() >= 1 && hVar.mo5979a() >= 1) {
            int b = ((hVar.mo5980b() + hVar.mo5979a()) + 1) / 2;
            cVar.mo5971c(1, hVar.f5397a);
            cVar2.mo5971c(1, hVar.f5398b);
            for (int i = 0; i < b; i++) {
                C1805i d = m6930d(hVar, bVar, cVar, cVar2, i);
                if (d != null) {
                    return d;
                }
                C1805i a = m6927a(hVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
