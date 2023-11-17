package p214q;

import p175n.C7174d;
import p175n.C7183i;
import p214q.C7803d;
import p214q.C7806e;

/* renamed from: q.a */
public class C7800a extends C7813i {

    /* renamed from: N0 */
    private int f22529N0 = 0;

    /* renamed from: O0 */
    private boolean f22530O0 = true;

    /* renamed from: P0 */
    private int f22531P0 = 0;

    /* renamed from: Q0 */
    boolean f22532Q0 = false;

    /* renamed from: g */
    public void mo22554g(C7174d dVar, boolean z) {
        C7803d[] dVarArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C7803d[] dVarArr2 = this.f22608W;
        dVarArr2[0] = this.f22600O;
        dVarArr2[2] = this.f22601P;
        dVarArr2[1] = this.f22602Q;
        dVarArr2[3] = this.f22603R;
        int i6 = 0;
        while (true) {
            dVarArr = this.f22608W;
            if (i6 >= dVarArr.length) {
                break;
            }
            C7803d dVar2 = dVarArr[i6];
            dVar2.f22563i = dVar.mo21489q(dVar2);
            i6++;
        }
        int i7 = this.f22529N0;
        if (i7 >= 0 && i7 < 4) {
            C7803d dVar3 = dVarArr[i7];
            if (!this.f22532Q0) {
                mo22558p1();
            }
            if (this.f22532Q0) {
                this.f22532Q0 = false;
                int i8 = this.f22529N0;
                if (i8 == 0 || i8 == 1) {
                    dVar.mo21480f(this.f22600O.f22563i, this.f22623f0);
                    dVar.mo21480f(this.f22602Q.f22563i, this.f22623f0);
                } else if (i8 == 2 || i8 == 3) {
                    dVar.mo21480f(this.f22601P.f22563i, this.f22625g0);
                    dVar.mo21480f(this.f22603R.f22563i, this.f22625g0);
                }
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 >= this.f22711M0) {
                        z2 = false;
                        break;
                    }
                    C7806e eVar = this.f22710L0[i9];
                    if ((this.f22530O0 || eVar.mo22555h()) && ((((i4 = this.f22529N0) == 0 || i4 == 1) && eVar.mo22687y() == C7806e.C7808b.MATCH_CONSTRAINT && eVar.f22600O.f22560f != null && eVar.f22602Q.f22560f != null) || (((i5 = this.f22529N0) == 2 || i5 == 3) && eVar.mo22621R() == C7806e.C7808b.MATCH_CONSTRAINT && eVar.f22601P.f22560f != null && eVar.f22603R.f22560f != null))) {
                        z2 = true;
                    } else {
                        i9++;
                    }
                }
                z2 = true;
                if (this.f22600O.mo22579k() || this.f22602Q.mo22579k()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f22601P.mo22579k() || this.f22603R.mo22579k()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i3 = this.f22529N0) != 0 || !z3) && ((i3 != 2 || !z4) && ((i3 != 1 || !z3) && (i3 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    i = 4;
                } else {
                    i = 5;
                }
                for (int i12 = 0; i12 < this.f22711M0; i12++) {
                    C7806e eVar2 = this.f22710L0[i12];
                    if (this.f22530O0 || eVar2.mo22555h()) {
                        C7183i q = dVar.mo21489q(eVar2.f22608W[this.f22529N0]);
                        C7803d[] dVarArr3 = eVar2.f22608W;
                        int i13 = this.f22529N0;
                        C7803d dVar4 = dVarArr3[i13];
                        dVar4.f22563i = q;
                        C7803d dVar5 = dVar4.f22560f;
                        if (dVar5 == null || dVar5.f22558d != this) {
                            i2 = 0;
                        } else {
                            i2 = dVar4.f22561g + 0;
                        }
                        if (i13 == 0 || i13 == 2) {
                            dVar.mo21483i(dVar3.f22563i, q, this.f22531P0 - i2, z2);
                        } else {
                            dVar.mo21481g(dVar3.f22563i, q, this.f22531P0 + i2, z2);
                        }
                        dVar.mo21479e(dVar3.f22563i, q, this.f22531P0 + i2, i);
                    }
                }
                int i14 = this.f22529N0;
                if (i14 == 0) {
                    dVar.mo21479e(this.f22602Q.f22563i, this.f22600O.f22563i, 0, 8);
                    dVar.mo21479e(this.f22600O.f22563i, this.f22613a0.f22602Q.f22563i, 0, 4);
                    dVar.mo21479e(this.f22600O.f22563i, this.f22613a0.f22600O.f22563i, 0, 0);
                } else if (i14 == 1) {
                    dVar.mo21479e(this.f22600O.f22563i, this.f22602Q.f22563i, 0, 8);
                    dVar.mo21479e(this.f22600O.f22563i, this.f22613a0.f22600O.f22563i, 0, 4);
                    dVar.mo21479e(this.f22600O.f22563i, this.f22613a0.f22602Q.f22563i, 0, 0);
                } else if (i14 == 2) {
                    dVar.mo21479e(this.f22603R.f22563i, this.f22601P.f22563i, 0, 8);
                    dVar.mo21479e(this.f22601P.f22563i, this.f22613a0.f22603R.f22563i, 0, 4);
                    dVar.mo21479e(this.f22601P.f22563i, this.f22613a0.f22601P.f22563i, 0, 0);
                } else if (i14 == 3) {
                    dVar.mo21479e(this.f22601P.f22563i, this.f22603R.f22563i, 0, 8);
                    dVar.mo21479e(this.f22601P.f22563i, this.f22613a0.f22601P.f22563i, 0, 4);
                    dVar.mo21479e(this.f22601P.f22563i, this.f22613a0.f22603R.f22563i, 0, 0);
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo22555h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo22556l0() {
        return this.f22532Q0;
    }

    /* renamed from: m0 */
    public boolean mo22557m0() {
        return this.f22532Q0;
    }

    /* renamed from: p1 */
    public boolean mo22558p1() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f22711M0;
            if (i4 >= i) {
                break;
            }
            C7806e eVar = this.f22710L0[i4];
            if ((this.f22530O0 || eVar.mo22555h()) && ((((i2 = this.f22529N0) == 0 || i2 == 1) && !eVar.mo22556l0()) || (((i3 = this.f22529N0) == 2 || i3 == 3) && !eVar.mo22557m0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f22711M0; i6++) {
            C7806e eVar2 = this.f22710L0[i6];
            if (this.f22530O0 || eVar2.mo22555h()) {
                if (!z2) {
                    int i7 = this.f22529N0;
                    if (i7 == 0) {
                        i5 = eVar2.mo22666m(C7803d.C7805b.LEFT).mo22572d();
                    } else if (i7 == 1) {
                        i5 = eVar2.mo22666m(C7803d.C7805b.RIGHT).mo22572d();
                    } else if (i7 == 2) {
                        i5 = eVar2.mo22666m(C7803d.C7805b.TOP).mo22572d();
                    } else if (i7 == 3) {
                        i5 = eVar2.mo22666m(C7803d.C7805b.BOTTOM).mo22572d();
                    }
                    z2 = true;
                }
                int i8 = this.f22529N0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.mo22666m(C7803d.C7805b.LEFT).mo22572d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.mo22666m(C7803d.C7805b.RIGHT).mo22572d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.mo22666m(C7803d.C7805b.TOP).mo22572d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.mo22666m(C7803d.C7805b.BOTTOM).mo22572d());
                }
            }
        }
        int i9 = i5 + this.f22531P0;
        int i12 = this.f22529N0;
        if (i12 == 0 || i12 == 1) {
            mo22594C0(i9, i9);
        } else {
            mo22600F0(i9, i9);
        }
        this.f22532Q0 = true;
        return true;
    }

    /* renamed from: q1 */
    public boolean mo22559q1() {
        return this.f22530O0;
    }

    /* renamed from: r1 */
    public int mo22560r1() {
        return this.f22529N0;
    }

    /* renamed from: s1 */
    public int mo22561s1() {
        return this.f22531P0;
    }

    /* renamed from: t1 */
    public int mo22562t1() {
        int i = this.f22529N0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public String toString() {
        String str = "[Barrier] " + mo22676r() + " {";
        for (int i = 0; i < this.f22711M0; i++) {
            C7806e eVar = this.f22710L0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo22676r();
        }
        return str + "}";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo22564u1() {
        for (int i = 0; i < this.f22711M0; i++) {
            C7806e eVar = this.f22710L0[i];
            if (this.f22530O0 || eVar.mo22555h()) {
                int i2 = this.f22529N0;
                if (i2 == 0 || i2 == 1) {
                    eVar.mo22618P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    eVar.mo22618P0(1, true);
                }
            }
        }
    }

    /* renamed from: v1 */
    public void mo22565v1(boolean z) {
        this.f22530O0 = z;
    }

    /* renamed from: w1 */
    public void mo22566w1(int i) {
        this.f22529N0 = i;
    }

    /* renamed from: x1 */
    public void mo22567x1(int i) {
        this.f22531P0 = i;
    }
}
