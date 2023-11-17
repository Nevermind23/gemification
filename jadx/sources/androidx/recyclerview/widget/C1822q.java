package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1769a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.q */
class C1822q {

    /* renamed from: a */
    final C1823a f5483a;

    /* renamed from: androidx.recyclerview.widget.q$a */
    interface C1823a {
        /* renamed from: a */
        C1769a.C1771b mo5871a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo5872b(C1769a.C1771b bVar);
    }

    C1822q(C1823a aVar) {
        this.f5483a = aVar;
    }

    /* renamed from: a */
    private int m7043a(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1769a.C1771b) list.get(size)).f5290a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m7044c(List list, int i, C1769a.C1771b bVar, int i2, C1769a.C1771b bVar2) {
        int i3;
        int i4 = bVar.f5293d;
        int i5 = bVar2.f5291b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = bVar.f5291b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            bVar.f5291b = i6 + bVar2.f5293d;
        }
        int i7 = bVar2.f5291b;
        if (i7 <= i4) {
            bVar.f5293d = i4 + bVar2.f5293d;
        }
        bVar2.f5291b = i7 + i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m7045d(List list, int i, int i2) {
        C1769a.C1771b bVar = (C1769a.C1771b) list.get(i);
        C1769a.C1771b bVar2 = (C1769a.C1771b) list.get(i2);
        int i3 = bVar2.f5290a;
        if (i3 == 1) {
            m7044c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo6032e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo6033f(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6031b(List list) {
        while (true) {
            int a = m7043a(list);
            if (a != -1) {
                m7045d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6032e(List list, int i, C1769a.C1771b bVar, int i2, C1769a.C1771b bVar2) {
        boolean z;
        int i3 = bVar.f5291b;
        int i4 = bVar.f5293d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f5291b == i3 && bVar2.f5293d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f5291b == i4 + 1 && bVar2.f5293d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f5291b;
        if (i4 < i5) {
            bVar2.f5291b = i5 - 1;
        } else {
            int i6 = bVar2.f5293d;
            if (i4 < i5 + i6) {
                bVar2.f5293d = i6 - 1;
                bVar.f5290a = 2;
                bVar.f5293d = 1;
                if (bVar2.f5293d == 0) {
                    list.remove(i2);
                    this.f5483a.mo5872b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f5291b;
        int i8 = bVar2.f5291b;
        C1769a.C1771b bVar3 = null;
        if (i7 <= i8) {
            bVar2.f5291b = i8 + 1;
        } else {
            int i9 = bVar2.f5293d;
            if (i7 < i8 + i9) {
                bVar3 = this.f5483a.mo5871a(2, i7 + 1, (i8 + i9) - i7, (Object) null);
                bVar2.f5293d = bVar.f5291b - bVar2.f5291b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f5483a.mo5872b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i12 = bVar.f5291b;
                if (i12 > bVar3.f5291b) {
                    bVar.f5291b = i12 - bVar3.f5293d;
                }
                int i13 = bVar.f5293d;
                if (i13 > bVar3.f5291b) {
                    bVar.f5293d = i13 - bVar3.f5293d;
                }
            }
            int i14 = bVar.f5291b;
            if (i14 > bVar2.f5291b) {
                bVar.f5291b = i14 - bVar2.f5293d;
            }
            int i15 = bVar.f5293d;
            if (i15 > bVar2.f5291b) {
                bVar.f5293d = i15 - bVar2.f5293d;
            }
        } else {
            if (bVar3 != null) {
                int i16 = bVar.f5291b;
                if (i16 >= bVar3.f5291b) {
                    bVar.f5291b = i16 - bVar3.f5293d;
                }
                int i17 = bVar.f5293d;
                if (i17 >= bVar3.f5291b) {
                    bVar.f5293d = i17 - bVar3.f5293d;
                }
            }
            int i18 = bVar.f5291b;
            if (i18 >= bVar2.f5291b) {
                bVar.f5291b = i18 - bVar2.f5293d;
            }
            int i19 = bVar.f5293d;
            if (i19 >= bVar2.f5291b) {
                bVar.f5293d = i19 - bVar2.f5293d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f5291b != bVar.f5293d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6033f(java.util.List r9, int r10, androidx.recyclerview.widget.C1769a.C1771b r11, int r12, androidx.recyclerview.widget.C1769a.C1771b r13) {
        /*
            r8 = this;
            int r0 = r11.f5293d
            int r1 = r13.f5291b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f5291b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f5293d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f5293d = r5
            androidx.recyclerview.widget.q$a r0 = r8.f5483a
            int r1 = r11.f5291b
            java.lang.Object r5 = r13.f5292c
            androidx.recyclerview.widget.a$b r0 = r0.mo5871a(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f5291b
            int r5 = r13.f5291b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f5291b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f5293d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.q$a r4 = r8.f5483a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f5292c
            androidx.recyclerview.widget.a$b r4 = r4.mo5871a(r2, r1, r5, r3)
            int r1 = r13.f5293d
            int r1 = r1 - r5
            r13.f5293d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f5293d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.q$a r11 = r8.f5483a
            r11.mo5872b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1822q.mo6033f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
