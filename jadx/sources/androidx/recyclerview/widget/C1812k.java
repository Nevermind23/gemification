package androidx.recyclerview.widget;

import androidx.core.p016os.C0934x;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.k */
final class C1812k implements Runnable {

    /* renamed from: h */
    static final ThreadLocal f5446h = new ThreadLocal();

    /* renamed from: i */
    static Comparator f5447i = new C1813a();

    /* renamed from: d */
    ArrayList f5448d = new ArrayList();

    /* renamed from: e */
    long f5449e;

    /* renamed from: f */
    long f5450f;

    /* renamed from: g */
    private ArrayList f5451g = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.k$a */
    class C1813a implements Comparator {
        C1813a() {
        }

        /* renamed from: a */
        public int compare(C1815c cVar, C1815c cVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = cVar.f5459d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (cVar2.f5459d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                boolean z3 = cVar.f5456a;
                if (z3 == cVar2.f5456a) {
                    int i = cVar2.f5457b - cVar.f5457b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f5458c - cVar2.f5458c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    static class C1814b implements RecyclerView.C1747p.C1750c {

        /* renamed from: a */
        int f5452a;

        /* renamed from: b */
        int f5453b;

        /* renamed from: c */
        int[] f5454c;

        /* renamed from: d */
        int f5455d;

        C1814b() {
        }

        /* renamed from: a */
        public void mo5727a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5455d * 2;
                int[] iArr = this.f5454c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5454c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f5454c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5454c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f5455d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6006b() {
            int[] iArr = this.f5454c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5455d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6007c(RecyclerView recyclerView, boolean z) {
            this.f5455d = 0;
            int[] iArr = this.f5454c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1747p pVar = recyclerView.f5101q;
            if (recyclerView.f5099p != null && pVar != null && pVar.mo5626E0()) {
                if (z) {
                    if (!recyclerView.f5083h.mo5880p()) {
                        pVar.mo5188A(recyclerView.f5099p.getItemCount(), this);
                    }
                } else if (!recyclerView.mo5424x0()) {
                    pVar.mo5228z(this.f5452a, this.f5453b, recyclerView.f5092l0, this);
                }
                int i = this.f5455d;
                if (i > pVar.f5194p) {
                    pVar.f5194p = i;
                    pVar.f5195q = z;
                    recyclerView.f5079f.mo5767Q();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6008d(int i) {
            if (this.f5454c != null) {
                int i2 = this.f5455d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5454c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6009e(int i, int i2) {
            this.f5452a = i;
            this.f5453b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    static class C1815c {

        /* renamed from: a */
        public boolean f5456a;

        /* renamed from: b */
        public int f5457b;

        /* renamed from: c */
        public int f5458c;

        /* renamed from: d */
        public RecyclerView f5459d;

        /* renamed from: e */
        public int f5460e;

        C1815c() {
        }

        /* renamed from: a */
        public void mo6010a() {
            this.f5456a = false;
            this.f5457b = 0;
            this.f5458c = 0;
            this.f5459d = null;
            this.f5460e = 0;
        }
    }

    C1812k() {
    }

    /* renamed from: b */
    private void m6990b() {
        C1815c cVar;
        boolean z;
        int size = this.f5448d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f5448d.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5090k0.mo6007c(recyclerView, false);
                i += recyclerView.f5090k0.f5455d;
            }
        }
        this.f5451g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f5448d.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1814b bVar = recyclerView2.f5090k0;
                int abs = Math.abs(bVar.f5452a) + Math.abs(bVar.f5453b);
                for (int i5 = 0; i5 < bVar.f5455d * 2; i5 += 2) {
                    if (i3 >= this.f5451g.size()) {
                        cVar = new C1815c();
                        this.f5451g.add(cVar);
                    } else {
                        cVar = (C1815c) this.f5451g.get(i3);
                    }
                    int[] iArr = bVar.f5454c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5456a = z;
                    cVar.f5457b = abs;
                    cVar.f5458c = i6;
                    cVar.f5459d = recyclerView2;
                    cVar.f5460e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f5451g, f5447i);
    }

    /* renamed from: c */
    private void m6991c(C1815c cVar, long j) {
        long j2;
        if (cVar.f5456a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.C1734f0 i = m6995i(cVar.f5459d, cVar.f5460e, j2);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            m6994h(i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    private void m6992d(long j) {
        int i = 0;
        while (i < this.f5451g.size()) {
            C1815c cVar = (C1815c) this.f5451g.get(i);
            if (cVar.f5459d != null) {
                m6991c(cVar, j);
                cVar.mo6010a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m6993e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f5085i.mo5924j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1734f0 o0 = RecyclerView.m6198o0(recyclerView.f5085i.mo5923i(i2));
            if (o0.mPosition == i && !o0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m6994h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f5056H && recyclerView.f5085i.mo5924j() != 0) {
                recyclerView.mo5353j1();
            }
            C1814b bVar = recyclerView.f5090k0;
            bVar.mo6007c(recyclerView, true);
            if (bVar.f5455d != 0) {
                try {
                    C0934x.m3381a("RV Nested Prefetch");
                    recyclerView.f5092l0.mo5465f(recyclerView.f5099p);
                    for (int i = 0; i < bVar.f5455d * 2; i += 2) {
                        m6995i(recyclerView, bVar.f5454c[i], j);
                    }
                } finally {
                    C0934x.m3382b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1734f0 m6995i(RecyclerView recyclerView, int i, long j) {
        if (m6993e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1759w wVar = recyclerView.f5079f;
        try {
            recyclerView.mo5289T0();
            RecyclerView.C1734f0 O = wVar.mo5765O(i, false, j);
            if (O != null) {
                if (!O.isBound() || O.isInvalid()) {
                    wVar.mo5770a(O, false);
                } else {
                    wVar.mo5759H(O.itemView);
                }
            }
            return O;
        } finally {
            recyclerView.mo5293V0(false);
        }
    }

    /* renamed from: a */
    public void mo5999a(RecyclerView recyclerView) {
        this.f5448d.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6000f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5449e == 0) {
            this.f5449e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5090k0.mo6009e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6001g(long j) {
        m6990b();
        m6992d(j);
    }

    /* renamed from: j */
    public void mo6002j(RecyclerView recyclerView) {
        this.f5448d.remove(recyclerView);
    }

    public void run() {
        try {
            C0934x.m3381a("RV Prefetch");
            if (!this.f5448d.isEmpty()) {
                int size = this.f5448d.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f5448d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo6001g(TimeUnit.MILLISECONDS.toNanos(j) + this.f5450f);
                    this.f5449e = 0;
                    C0934x.m3382b();
                }
            }
        } finally {
            this.f5449e = 0;
            C0934x.m3382b();
        }
    }
}
