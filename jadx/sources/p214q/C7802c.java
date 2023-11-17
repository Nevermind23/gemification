package p214q;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p214q.C7806e;

/* renamed from: q.c */
public class C7802c {

    /* renamed from: a */
    protected C7806e f22533a;

    /* renamed from: b */
    protected C7806e f22534b;

    /* renamed from: c */
    protected C7806e f22535c;

    /* renamed from: d */
    protected C7806e f22536d;

    /* renamed from: e */
    protected C7806e f22537e;

    /* renamed from: f */
    protected C7806e f22538f;

    /* renamed from: g */
    protected C7806e f22539g;

    /* renamed from: h */
    protected ArrayList f22540h;

    /* renamed from: i */
    protected int f22541i;

    /* renamed from: j */
    protected int f22542j;

    /* renamed from: k */
    protected float f22543k = Utils.FLOAT_EPSILON;

    /* renamed from: l */
    int f22544l;

    /* renamed from: m */
    int f22545m;

    /* renamed from: n */
    int f22546n;

    /* renamed from: o */
    boolean f22547o;

    /* renamed from: p */
    private int f22548p;

    /* renamed from: q */
    private boolean f22549q;

    /* renamed from: r */
    protected boolean f22550r;

    /* renamed from: s */
    protected boolean f22551s;

    /* renamed from: t */
    protected boolean f22552t;

    /* renamed from: u */
    protected boolean f22553u;

    /* renamed from: v */
    private boolean f22554v;

    public C7802c(C7806e eVar, int i, boolean z) {
        this.f22533a = eVar;
        this.f22548p = i;
        this.f22549q = z;
    }

    /* renamed from: b */
    private void m29530b() {
        int i = this.f22548p * 2;
        C7806e eVar = this.f22533a;
        boolean z = true;
        this.f22547o = true;
        C7806e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f22541i++;
            C7806e[] eVarArr = eVar.f22587F0;
            int i2 = this.f22548p;
            C7806e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f22585E0[i2] = null;
            if (eVar.mo22625T() != 8) {
                this.f22544l++;
                C7806e.C7808b s = eVar.mo22678s(this.f22548p);
                C7806e.C7808b bVar = C7806e.C7808b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.f22545m += eVar.mo22593C(this.f22548p);
                }
                int e = this.f22545m + eVar.f22608W[i].mo22573e();
                this.f22545m = e;
                int i3 = i + 1;
                this.f22545m = e + eVar.f22608W[i3].mo22573e();
                int e2 = this.f22546n + eVar.f22608W[i].mo22573e();
                this.f22546n = e2;
                this.f22546n = e2 + eVar.f22608W[i3].mo22573e();
                if (this.f22534b == null) {
                    this.f22534b = eVar;
                }
                this.f22536d = eVar;
                C7806e.C7808b[] bVarArr = eVar.f22611Z;
                int i4 = this.f22548p;
                if (bVarArr[i4] == bVar) {
                    int i5 = eVar.f22660y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f22542j++;
                        float f = eVar.f22583D0[i4];
                        if (f > Utils.FLOAT_EPSILON) {
                            this.f22543k += f;
                        }
                        if (m29531c(eVar, i4)) {
                            if (f < Utils.FLOAT_EPSILON) {
                                this.f22550r = true;
                            } else {
                                this.f22551s = true;
                            }
                            if (this.f22540h == null) {
                                this.f22540h = new ArrayList();
                            }
                            this.f22540h.add(eVar);
                        }
                        if (this.f22538f == null) {
                            this.f22538f = eVar;
                        }
                        C7806e eVar4 = this.f22539g;
                        if (eVar4 != null) {
                            eVar4.f22585E0[this.f22548p] = eVar;
                        }
                        this.f22539g = eVar;
                    }
                    if (this.f22548p == 0) {
                        if (eVar.f22656w != 0) {
                            this.f22547o = false;
                        } else if (!(eVar.f22662z == 0 && eVar.f22576A == 0)) {
                            this.f22547o = false;
                        }
                    } else if (eVar.f22658x != 0) {
                        this.f22547o = false;
                    } else if (!(eVar.f22580C == 0 && eVar.f22582D == 0)) {
                        this.f22547o = false;
                    }
                    if (eVar.f22619d0 != Utils.FLOAT_EPSILON) {
                        this.f22547o = false;
                        this.f22553u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f22587F0[this.f22548p] = eVar;
            }
            C7803d dVar = eVar.f22608W[i + 1].f22560f;
            if (dVar != null) {
                C7806e eVar5 = dVar.f22558d;
                C7803d dVar2 = eVar5.f22608W[i].f22560f;
                if (dVar2 != null && dVar2.f22558d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C7806e eVar6 = this.f22534b;
        if (eVar6 != null) {
            this.f22545m -= eVar6.f22608W[i].mo22573e();
        }
        C7806e eVar7 = this.f22536d;
        if (eVar7 != null) {
            this.f22545m -= eVar7.f22608W[i + 1].mo22573e();
        }
        this.f22535c = eVar;
        if (this.f22548p != 0 || !this.f22549q) {
            this.f22537e = this.f22533a;
        } else {
            this.f22537e = eVar;
        }
        if (!this.f22551s || !this.f22550r) {
            z = false;
        }
        this.f22552t = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f22660y[r3];
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m29531c(p214q.C7806e r2, int r3) {
        /*
            int r0 = r2.mo22625T()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            q.e$b[] r0 = r2.f22611Z
            r0 = r0[r3]
            q.e$b r1 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f22660y
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p214q.C7802c.m29531c(q.e, int):boolean");
    }

    /* renamed from: a */
    public void mo22568a() {
        if (!this.f22554v) {
            m29530b();
        }
        this.f22554v = true;
    }
}
