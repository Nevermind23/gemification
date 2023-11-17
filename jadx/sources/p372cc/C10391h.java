package p372cc;

import com.google.zxing.C5766o;

/* renamed from: cc.h */
final class C10391h extends C10390g {

    /* renamed from: c */
    private final boolean f29598c;

    C10391h(C10384c cVar, boolean z) {
        super(cVar);
        this.f29598c = z;
    }

    /* renamed from: h */
    private void m37762h(C10382a aVar) {
        C5766o oVar;
        C5766o oVar2;
        C10384c a = mo27039a();
        if (this.f29598c) {
            oVar = a.mo27017h();
        } else {
            oVar = a.mo27018i();
        }
        if (this.f29598c) {
            oVar2 = a.mo27011b();
        } else {
            oVar2 = a.mo27012c();
        }
        int e = mo27043e((int) oVar2.mo18902d());
        C10385d[] d = mo27042d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo27043e((int) oVar.mo18902d()); e2 < e; e2++) {
            C10385d dVar = d[e2];
            if (dVar != null) {
                dVar.mo27028j();
                int c = dVar.mo27021c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo27021c();
                    } else if (dVar.mo27021c() >= aVar.mo27005c()) {
                        d[e2] = null;
                    } else {
                        i = dVar.mo27021c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m37763l(C10385d[] dVarArr, C10382a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C10385d dVar = dVarArr[i];
            if (dVar != null) {
                int e = dVar.mo27023e() % 30;
                int c = dVar.mo27021c();
                if (c > aVar.mo27005c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f29598c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo27003a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo27004b() || e % 3 != aVar.mo27006d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo27007e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m37764m() {
        for (C10385d dVar : mo27042d()) {
            if (dVar != null) {
                dVar.mo27028j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27046g(C10382a aVar) {
        C5766o oVar;
        C5766o oVar2;
        boolean z;
        boolean z2;
        C10385d[] d = mo27042d();
        m37764m();
        m37763l(d, aVar);
        C10384c a = mo27039a();
        if (this.f29598c) {
            oVar = a.mo27017h();
        } else {
            oVar = a.mo27018i();
        }
        if (this.f29598c) {
            oVar2 = a.mo27011b();
        } else {
            oVar2 = a.mo27012c();
        }
        int e = mo27043e((int) oVar2.mo18902d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo27043e((int) oVar.mo18902d()); e2 < e; e2++) {
            C10385d dVar = d[e2];
            if (dVar != null) {
                int c = dVar.mo27021c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo27021c();
                    } else if (c < 0 || dVar.mo27021c() >= aVar.mo27005c() || c > e2) {
                        d[e2] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        if (c >= e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            if (d[e2 - i4] != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z) {
                            d[e2] = null;
                        } else {
                            i = dVar.mo27021c();
                        }
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10382a mo27047i() {
        C10385d[] d = mo27042d();
        C10383b bVar = new C10383b();
        C10383b bVar2 = new C10383b();
        C10383b bVar3 = new C10383b();
        C10383b bVar4 = new C10383b();
        for (C10385d dVar : d) {
            if (dVar != null) {
                dVar.mo27028j();
                int e = dVar.mo27023e() % 30;
                int c = dVar.mo27021c();
                if (!this.f29598c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo27009b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo27009b(e / 3);
                    bVar3.mo27009b(e % 3);
                } else if (i == 2) {
                    bVar.mo27009b(e + 1);
                }
            }
        }
        if (bVar.mo27008a().length == 0 || bVar2.mo27008a().length == 0 || bVar3.mo27008a().length == 0 || bVar4.mo27008a().length == 0 || bVar.mo27008a()[0] <= 0 || bVar2.mo27008a()[0] + bVar3.mo27008a()[0] < 3 || bVar2.mo27008a()[0] + bVar3.mo27008a()[0] > 90) {
            return null;
        }
        C10382a aVar = new C10382a(bVar.mo27008a()[0], bVar2.mo27008a()[0], bVar3.mo27008a()[0], bVar4.mo27008a()[0]);
        m37763l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo27048j() {
        int c;
        C10382a i = mo27047i();
        if (i == null) {
            return null;
        }
        m37762h(i);
        int c2 = i.mo27005c();
        int[] iArr = new int[c2];
        for (C10385d dVar : mo27042d()) {
            if (dVar != null && (c = dVar.mo27021c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo27049k() {
        return this.f29598c;
    }

    public String toString() {
        return "IsLeft: " + this.f29598c + 10 + super.toString();
    }
}
