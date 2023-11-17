package p214q;

import android.support.p013v4.media.session.C0125b;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p175n.C7174d;
import p175n.C7177e;
import p175n.C7183i;
import p214q.C7806e;
import p227r.C8006b;
import p227r.C8011e;

/* renamed from: q.f */
public class C7809f extends C7815k {

    /* renamed from: M0 */
    C8006b f22671M0 = new C8006b(this);

    /* renamed from: N0 */
    public C8011e f22672N0 = new C8011e(this);

    /* renamed from: O0 */
    private int f22673O0;

    /* renamed from: P0 */
    protected C8006b.C8008b f22674P0 = null;

    /* renamed from: Q0 */
    private boolean f22675Q0 = false;

    /* renamed from: R0 */
    protected C7174d f22676R0 = new C7174d();

    /* renamed from: S0 */
    int f22677S0;

    /* renamed from: T0 */
    int f22678T0;

    /* renamed from: U0 */
    int f22679U0;

    /* renamed from: V0 */
    int f22680V0;

    /* renamed from: W0 */
    public int f22681W0 = 0;

    /* renamed from: X0 */
    public int f22682X0 = 0;

    /* renamed from: Y0 */
    C7802c[] f22683Y0 = new C7802c[4];

    /* renamed from: Z0 */
    C7802c[] f22684Z0 = new C7802c[4];

    /* renamed from: a1 */
    public boolean f22685a1 = false;

    /* renamed from: b1 */
    public boolean f22686b1 = false;

    /* renamed from: c1 */
    public boolean f22687c1 = false;

    /* renamed from: d1 */
    public int f22688d1 = 0;

    /* renamed from: e1 */
    public int f22689e1 = 0;

    /* renamed from: f1 */
    private int f22690f1 = 257;

    /* renamed from: g1 */
    public boolean f22691g1 = false;

    /* renamed from: h1 */
    private boolean f22692h1 = false;

    /* renamed from: i1 */
    private boolean f22693i1 = false;

    /* renamed from: j1 */
    int f22694j1 = 0;

    /* renamed from: k1 */
    private WeakReference f22695k1 = null;

    /* renamed from: l1 */
    private WeakReference f22696l1 = null;

    /* renamed from: m1 */
    private WeakReference f22697m1 = null;

    /* renamed from: n1 */
    private WeakReference f22698n1 = null;

    /* renamed from: o1 */
    HashSet f22699o1 = new HashSet();

    /* renamed from: p1 */
    public C8006b.C8007a f22700p1 = new C8006b.C8007a();

    /* renamed from: O1 */
    public static boolean m29666O1(int i, C7806e eVar, C8006b.C8008b bVar, C8006b.C8007a aVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (eVar.mo22625T() == 8 || (eVar instanceof C7810g) || (eVar instanceof C7800a)) {
            aVar.f23081e = 0;
            aVar.f23082f = 0;
            return false;
        }
        aVar.f23077a = eVar.mo22687y();
        aVar.f23078b = eVar.mo22621R();
        aVar.f23079c = eVar.mo22627U();
        aVar.f23080d = eVar.mo22683v();
        aVar.f23085i = false;
        aVar.f23086j = i2;
        C7806e.C7808b bVar2 = aVar.f23077a;
        C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f23078b == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || eVar.f22619d0 <= Utils.FLOAT_EPSILON) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || eVar.f22619d0 <= Utils.FLOAT_EPSILON) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z && eVar.mo22635Y(0) && eVar.f22656w == 0 && !z3) {
            aVar.f23077a = C7806e.C7808b.WRAP_CONTENT;
            if (z2 && eVar.f22658x == 0) {
                aVar.f23077a = C7806e.C7808b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.mo22635Y(1) && eVar.f22658x == 0 && !z4) {
            aVar.f23078b = C7806e.C7808b.WRAP_CONTENT;
            if (z && eVar.f22656w == 0) {
                aVar.f23078b = C7806e.C7808b.FIXED;
            }
            z2 = false;
        }
        if (eVar.mo22556l0()) {
            aVar.f23077a = C7806e.C7808b.FIXED;
            z = false;
        }
        if (eVar.mo22557m0()) {
            aVar.f23078b = C7806e.C7808b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.f22660y[0] == 4) {
                aVar.f23077a = C7806e.C7808b.FIXED;
            } else if (!z2) {
                C7806e.C7808b bVar4 = aVar.f23078b;
                C7806e.C7808b bVar5 = C7806e.C7808b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.f23080d;
                } else {
                    aVar.f23077a = C7806e.C7808b.WRAP_CONTENT;
                    bVar.mo2897b(eVar, aVar);
                    i4 = aVar.f23082f;
                }
                aVar.f23077a = bVar5;
                aVar.f23079c = (int) (eVar.mo22680t() * ((float) i4));
            }
        }
        if (z4) {
            if (eVar.f22660y[1] == 4) {
                aVar.f23078b = C7806e.C7808b.FIXED;
            } else if (!z) {
                C7806e.C7808b bVar6 = aVar.f23077a;
                C7806e.C7808b bVar7 = C7806e.C7808b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.f23079c;
                } else {
                    aVar.f23078b = C7806e.C7808b.WRAP_CONTENT;
                    bVar.mo2897b(eVar, aVar);
                    i3 = aVar.f23081e;
                }
                aVar.f23078b = bVar7;
                if (eVar.mo22682u() == -1) {
                    aVar.f23080d = (int) (((float) i3) / eVar.mo22680t());
                } else {
                    aVar.f23080d = (int) (eVar.mo22680t() * ((float) i3));
                }
            }
        }
        bVar.mo2897b(eVar, aVar);
        eVar.mo22653g1(aVar.f23081e);
        eVar.mo22606I0(aVar.f23082f);
        eVar.mo22604H0(aVar.f23084h);
        eVar.mo22686x0(aVar.f23083g);
        aVar.f23086j = C8006b.C8007a.f23074k;
        return aVar.f23085i;
    }

    /* renamed from: Q1 */
    private void m29667Q1() {
        this.f22681W0 = 0;
        this.f22682X0 = 0;
    }

    /* renamed from: t1 */
    private void m29668t1(C7806e eVar) {
        int i = this.f22681W0 + 1;
        C7802c[] cVarArr = this.f22684Z0;
        if (i >= cVarArr.length) {
            this.f22684Z0 = (C7802c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f22684Z0[this.f22681W0] = new C7802c(eVar, 0, mo22702L1());
        this.f22681W0++;
    }

    /* renamed from: w1 */
    private void m29669w1(C7803d dVar, C7183i iVar) {
        this.f22676R0.mo21482h(iVar, this.f22676R0.mo21489q(dVar), 0, 5);
    }

    /* renamed from: x1 */
    private void m29670x1(C7803d dVar, C7183i iVar) {
        this.f22676R0.mo21482h(this.f22676R0.mo21489q(dVar), iVar, 0, 5);
    }

    /* renamed from: y1 */
    private void m29671y1(C7806e eVar) {
        int i = this.f22682X0 + 1;
        C7802c[] cVarArr = this.f22683Y0;
        if (i >= cVarArr.length) {
            this.f22683Y0 = (C7802c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f22683Y0[this.f22682X0] = new C7802c(eVar, 1, mo22702L1());
        this.f22682X0++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo22691A1(C7803d dVar) {
        WeakReference weakReference = this.f22695k1;
        if (weakReference == null || weakReference.get() == null || dVar.mo22572d() > ((C7803d) this.f22695k1.get()).mo22572d()) {
            this.f22695k1 = new WeakReference(dVar);
        }
    }

    /* renamed from: B1 */
    public boolean mo22692B1(boolean z) {
        return this.f22672N0.mo23168f(z);
    }

    /* renamed from: C1 */
    public boolean mo22693C1(boolean z) {
        return this.f22672N0.mo23169g(z);
    }

    /* renamed from: D1 */
    public boolean mo22694D1(boolean z, int i) {
        return this.f22672N0.mo23170h(z, i);
    }

    /* renamed from: E1 */
    public void mo22695E1(C7177e eVar) {
        this.f22676R0.mo21492v(eVar);
    }

    /* renamed from: F1 */
    public C8006b.C8008b mo22696F1() {
        return this.f22674P0;
    }

    /* renamed from: G1 */
    public int mo22697G1() {
        return this.f22690f1;
    }

    /* renamed from: H1 */
    public C7174d mo22698H1() {
        return this.f22676R0;
    }

    /* renamed from: I1 */
    public void mo22699I1() {
        this.f22672N0.mo23171j();
    }

    /* renamed from: J1 */
    public void mo22700J1() {
        this.f22672N0.mo23172k();
    }

    /* renamed from: K1 */
    public boolean mo22701K1() {
        return this.f22693i1;
    }

    /* renamed from: L1 */
    public boolean mo22702L1() {
        return this.f22675Q0;
    }

    /* renamed from: M */
    public void mo22613M(StringBuilder sb) {
        sb.append(this.f22640o + ":{\n");
        sb.append("  actualWidth:" + this.f22615b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f22617c0);
        sb.append("\n");
        Iterator it = mo22734n1().iterator();
        while (it.hasNext()) {
            ((C7806e) it.next()).mo22613M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* renamed from: M1 */
    public boolean mo22703M1() {
        return this.f22692h1;
    }

    /* renamed from: N1 */
    public long mo22704N1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i12 = i8;
        this.f22677S0 = i12;
        int i13 = i9;
        this.f22678T0 = i13;
        return this.f22671M0.mo23157d(this, i, i12, i13, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: P1 */
    public boolean mo22705P1(int i) {
        return (this.f22690f1 & i) == i;
    }

    /* renamed from: R1 */
    public void mo22706R1(C8006b.C8008b bVar) {
        this.f22674P0 = bVar;
        this.f22672N0.mo23174n(bVar);
    }

    /* renamed from: S1 */
    public void mo22707S1(int i) {
        this.f22690f1 = i;
        C7174d.f21247r = mo22705P1(C11398b.f33140s);
    }

    /* renamed from: T1 */
    public void mo22708T1(int i) {
        this.f22673O0 = i;
    }

    /* renamed from: U1 */
    public void mo22709U1(boolean z) {
        this.f22675Q0 = z;
    }

    /* renamed from: V1 */
    public boolean mo22710V1(C7174d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = mo22705P1(64);
        mo22667m1(dVar, P1);
        int size = this.f22713L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C7806e eVar = (C7806e) this.f22713L0.get(i);
            eVar.mo22667m1(dVar, P1);
            if (eVar.mo22639a0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: W1 */
    public void mo22711W1() {
        this.f22671M0.mo23158e(this);
    }

    /* renamed from: l1 */
    public void mo22665l1(boolean z, boolean z2) {
        super.mo22665l1(z, z2);
        int size = this.f22713L0.size();
        for (int i = 0; i < size; i++) {
            ((C7806e) this.f22713L0.get(i)).mo22665l1(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030e  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22712o1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f22623f0 = r2
            r1.f22625g0 = r2
            r1.f22692h1 = r2
            r1.f22693i1 = r2
            java.util.ArrayList r0 = r1.f22713L0
            int r3 = r0.size()
            int r0 = r18.mo22627U()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo22683v()
            int r4 = java.lang.Math.max(r2, r4)
            q.e$b[] r5 = r1.f22611Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f22673O0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f22690f1
            boolean r8 = p214q.C7814j.m29727b(r8, r6)
            if (r8 == 0) goto L_0x0084
            r.b$b r8 = r18.mo22696F1()
            p227r.C8015h.m30446h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList r9 = r1.f22713L0
            java.lang.Object r9 = r9.get(r8)
            q.e r9 = (p214q.C7806e) r9
            boolean r10 = r9.mo22662k0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof p214q.C7810g
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof p214q.C7800a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.mo22659j0()
            if (r10 != 0) goto L_0x0081
            q.e$b r10 = r9.mo22678s(r2)
            q.e$b r11 = r9.mo22678s(r6)
            q.e$b r12 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0072
            int r10 = r9.f22656w
            if (r10 == r6) goto L_0x0072
            if (r11 != r12) goto L_0x0072
            int r10 = r9.f22658x
            if (r10 == r6) goto L_0x0072
            r10 = r6
            goto L_0x0073
        L_0x0072:
            r10 = r2
        L_0x0073:
            if (r10 != 0) goto L_0x0081
            r.b$a r10 = new r.b$a
            r10.<init>()
            r.b$b r11 = r1.f22674P0
            int r12 = p227r.C8006b.C8007a.f23074k
            m29666O1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            q.e$b r9 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f22690f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = p214q.C7814j.m29727b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            r.b$b r10 = r18.mo22696F1()
            boolean r10 = p227r.C8016i.m30450c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.mo22627U()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.mo22653g1(r0)
            r1.f22692h1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.mo22627U()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.mo22683v()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.mo22606I0(r4)
            r1.f22693i1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.mo22683v()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.mo22705P1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo22705P1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            n.d r12 = r1.f22676R0
            r12.f21262h = r2
            r12.f21263i = r2
            int r13 = r1.f22690f1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f21263i = r6
        L_0x00f2:
            java.util.ArrayList r11 = r1.f22713L0
            q.e$b r12 = r18.mo22687y()
            q.e$b r13 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            q.e$b r12 = r18.mo22621R()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = r2
            goto L_0x0106
        L_0x0105:
            r12 = r6
        L_0x0106:
            r18.m29667Q1()
            r13 = r2
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList r14 = r1.f22713L0
            java.lang.Object r14 = r14.get(r13)
            q.e r14 = (p214q.C7806e) r14
            boolean r15 = r14 instanceof p214q.C7815k
            if (r15 == 0) goto L_0x011d
            q.k r14 = (p214q.C7815k) r14
            r14.mo22712o1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.mo22705P1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x0315
            int r15 = r0 + 1
            n.d r0 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            r0.mo21475E()     // Catch:{ Exception -> 0x01d8 }
            r18.m29667Q1()     // Catch:{ Exception -> 0x01d8 }
            n.d r0 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            r1.mo22661k(r0)     // Catch:{ Exception -> 0x01d8 }
            r0 = r2
        L_0x0139:
            if (r0 >= r3) goto L_0x014d
            java.util.ArrayList r6 = r1.f22713L0     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01d8 }
            q.e r6 = (p214q.C7806e) r6     // Catch:{ Exception -> 0x01d8 }
            n.d r2 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            r6.mo22661k(r2)     // Catch:{ Exception -> 0x01d8 }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            n.d r0 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            boolean r14 = r1.mo22714s1(r0)     // Catch:{ Exception -> 0x01d8 }
            java.lang.ref.WeakReference r0 = r1.f22695k1     // Catch:{ Exception -> 0x01d8 }
            r2 = 0
            if (r0 == 0) goto L_0x0173
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x0173
            java.lang.ref.WeakReference r0 = r1.f22695k1     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            q.d r0 = (p214q.C7803d) r0     // Catch:{ Exception -> 0x01d8 }
            n.d r6 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            q.d r8 = r1.f22601P     // Catch:{ Exception -> 0x01d8 }
            n.i r6 = r6.mo21489q(r8)     // Catch:{ Exception -> 0x01d8 }
            r1.m29670x1(r0, r6)     // Catch:{ Exception -> 0x01d8 }
            r1.f22695k1 = r2     // Catch:{ Exception -> 0x01d8 }
        L_0x0173:
            java.lang.ref.WeakReference r0 = r1.f22697m1     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x0192
            java.lang.ref.WeakReference r0 = r1.f22697m1     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            q.d r0 = (p214q.C7803d) r0     // Catch:{ Exception -> 0x01d8 }
            n.d r6 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            q.d r8 = r1.f22603R     // Catch:{ Exception -> 0x01d8 }
            n.i r6 = r6.mo21489q(r8)     // Catch:{ Exception -> 0x01d8 }
            r1.m29669w1(r0, r6)     // Catch:{ Exception -> 0x01d8 }
            r1.f22697m1 = r2     // Catch:{ Exception -> 0x01d8 }
        L_0x0192:
            java.lang.ref.WeakReference r0 = r1.f22696l1     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01b1
            java.lang.ref.WeakReference r0 = r1.f22696l1     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            q.d r0 = (p214q.C7803d) r0     // Catch:{ Exception -> 0x01d8 }
            n.d r6 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            q.d r8 = r1.f22600O     // Catch:{ Exception -> 0x01d8 }
            n.i r6 = r6.mo21489q(r8)     // Catch:{ Exception -> 0x01d8 }
            r1.m29670x1(r0, r6)     // Catch:{ Exception -> 0x01d8 }
            r1.f22696l1 = r2     // Catch:{ Exception -> 0x01d8 }
        L_0x01b1:
            java.lang.ref.WeakReference r0 = r1.f22698n1     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01d0
            java.lang.ref.WeakReference r0 = r1.f22698n1     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01d8 }
            q.d r0 = (p214q.C7803d) r0     // Catch:{ Exception -> 0x01d8 }
            n.d r6 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            q.d r8 = r1.f22602Q     // Catch:{ Exception -> 0x01d8 }
            n.i r6 = r6.mo21489q(r8)     // Catch:{ Exception -> 0x01d8 }
            r1.m29669w1(r0, r6)     // Catch:{ Exception -> 0x01d8 }
            r1.f22698n1 = r2     // Catch:{ Exception -> 0x01d8 }
        L_0x01d0:
            if (r14 == 0) goto L_0x01f2
            n.d r0 = r1.f22676R0     // Catch:{ Exception -> 0x01d8 }
            r0.mo21473A()     // Catch:{ Exception -> 0x01d8 }
            goto L_0x01f2
        L_0x01d8:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f2:
            if (r14 == 0) goto L_0x01fd
            n.d r0 = r1.f22676R0
            boolean[] r2 = p214q.C7814j.f22712a
            boolean r0 = r1.mo22710V1(r0, r2)
            goto L_0x0216
        L_0x01fd:
            n.d r0 = r1.f22676R0
            r1.mo22667m1(r0, r10)
            r0 = 0
        L_0x0203:
            if (r0 >= r3) goto L_0x0215
            java.util.ArrayList r2 = r1.f22713L0
            java.lang.Object r2 = r2.get(r0)
            q.e r2 = (p214q.C7806e) r2
            n.d r6 = r1.f22676R0
            r2.mo22667m1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0203
        L_0x0215:
            r0 = 0
        L_0x0216:
            r2 = 8
            if (r12 == 0) goto L_0x0287
            if (r15 >= r2) goto L_0x0287
            boolean[] r6 = p214q.C7814j.f22712a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0287
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0226:
            if (r6 >= r3) goto L_0x0250
            java.util.ArrayList r2 = r1.f22713L0
            java.lang.Object r2 = r2.get(r6)
            q.e r2 = (p214q.C7806e) r2
            r16 = r0
            int r0 = r2.f22623f0
            int r17 = r2.mo22627U()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f22625g0
            int r2 = r2.mo22683v()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0226
        L_0x0250:
            r16 = r0
            int r0 = r1.f22637m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f22639n0
            int r2 = java.lang.Math.max(r2, r8)
            q.e$b r6 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0273
            int r8 = r18.mo22627U()
            if (r8 >= r0) goto L_0x0273
            r1.mo22653g1(r0)
            q.e$b[] r0 = r1.f22611Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0273:
            if (r7 != r6) goto L_0x0289
            int r0 = r18.mo22683v()
            if (r0 >= r2) goto L_0x0289
            r1.mo22606I0(r2)
            q.e$b[] r0 = r1.f22611Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0289
        L_0x0287:
            r16 = r0
        L_0x0289:
            int r0 = r1.f22637m0
            int r2 = r18.mo22627U()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo22627U()
            if (r0 <= r2) goto L_0x02a6
            r1.mo22653g1(r0)
            q.e$b[] r0 = r1.f22611Z
            q.e$b r2 = p214q.C7806e.C7808b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a6:
            int r0 = r1.f22639n0
            int r2 = r18.mo22683v()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo22683v()
            if (r0 <= r2) goto L_0x02c4
            r1.mo22606I0(r0)
            q.e$b[] r0 = r1.f22611Z
            q.e$b r2 = p214q.C7806e.C7808b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c6
        L_0x02c4:
            r6 = 1
            r2 = r13
        L_0x02c6:
            if (r2 != 0) goto L_0x0305
            q.e$b[] r0 = r1.f22611Z
            r8 = 0
            r0 = r0[r8]
            q.e$b r13 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e7
            if (r4 <= 0) goto L_0x02e7
            int r0 = r18.mo22627U()
            if (r0 <= r4) goto L_0x02e7
            r1.f22692h1 = r6
            q.e$b[] r0 = r1.f22611Z
            q.e$b r2 = p214q.C7806e.C7808b.FIXED
            r0[r8] = r2
            r1.mo22653g1(r4)
            r2 = r6
            r16 = r2
        L_0x02e7:
            q.e$b[] r0 = r1.f22611Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0305
            if (r9 <= 0) goto L_0x0305
            int r0 = r18.mo22683v()
            if (r0 <= r9) goto L_0x0305
            r1.f22693i1 = r6
            q.e$b[] r0 = r1.f22611Z
            q.e$b r2 = p214q.C7806e.C7808b.FIXED
            r0[r6] = r2
            r1.mo22606I0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030a
        L_0x0305:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030a:
            if (r15 <= r0) goto L_0x030e
            r14 = 0
            goto L_0x030f
        L_0x030e:
            r14 = r2
        L_0x030f:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0315:
            r1.f22713L0 = r11
            if (r13 == 0) goto L_0x0321
            q.e$b[] r0 = r1.f22611Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0321:
            n.d r0 = r1.f22676R0
            n.c r0 = r0.mo21493w()
            r1.mo22681t0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p214q.C7809f.mo22712o1():void");
    }

    /* renamed from: r0 */
    public void mo22677r0() {
        this.f22676R0.mo21475E();
        this.f22677S0 = 0;
        this.f22679U0 = 0;
        this.f22678T0 = 0;
        this.f22680V0 = 0;
        this.f22691g1 = false;
        super.mo22677r0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo22713r1(C7806e eVar, int i) {
        if (i == 0) {
            m29668t1(eVar);
        } else if (i == 1) {
            m29671y1(eVar);
        }
    }

    /* renamed from: s1 */
    public boolean mo22714s1(C7174d dVar) {
        int i;
        boolean P1 = mo22705P1(64);
        mo22554g(dVar, P1);
        int size = this.f22713L0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7806e eVar = (C7806e) this.f22713L0.get(i2);
            eVar.mo22618P0(0, false);
            eVar.mo22618P0(1, false);
            if (eVar instanceof C7800a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C7806e eVar2 = (C7806e) this.f22713L0.get(i3);
                if (eVar2 instanceof C7800a) {
                    ((C7800a) eVar2).mo22564u1();
                }
            }
        }
        this.f22699o1.clear();
        for (int i4 = 0; i4 < size; i4++) {
            C7806e eVar3 = (C7806e) this.f22713L0.get(i4);
            if (eVar3.mo22649f()) {
                eVar3.mo22554g(dVar, P1);
            }
        }
        while (this.f22699o1.size() > 0) {
            int size2 = this.f22699o1.size();
            Iterator it = this.f22699o1.iterator();
            if (it.hasNext()) {
                C0125b.m366a((C7806e) it.next());
                throw null;
            } else if (size2 == this.f22699o1.size()) {
                Iterator it2 = this.f22699o1.iterator();
                while (it2.hasNext()) {
                    ((C7806e) it2.next()).mo22554g(dVar, P1);
                }
                this.f22699o1.clear();
            }
        }
        if (C7174d.f21247r) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                C7806e eVar4 = (C7806e) this.f22713L0.get(i5);
                if (!eVar4.mo22649f()) {
                    hashSet.add(eVar4);
                }
            }
            if (mo22687y() == C7806e.C7808b.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            mo22646e(this, dVar, hashSet, i, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C7806e eVar5 = (C7806e) it3.next();
                C7814j.m29726a(this, dVar, eVar5);
                eVar5.mo22554g(dVar, P1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                C7806e eVar6 = (C7806e) this.f22713L0.get(i6);
                if (eVar6 instanceof C7809f) {
                    C7806e.C7808b[] bVarArr = eVar6.f22611Z;
                    C7806e.C7808b bVar = bVarArr[0];
                    C7806e.C7808b bVar2 = bVarArr[1];
                    C7806e.C7808b bVar3 = C7806e.C7808b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.mo22614M0(C7806e.C7808b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo22644c1(C7806e.C7808b.FIXED);
                    }
                    eVar6.mo22554g(dVar, P1);
                    if (bVar == bVar3) {
                        eVar6.mo22614M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo22644c1(bVar2);
                    }
                } else {
                    C7814j.m29726a(this, dVar, eVar6);
                    if (!eVar6.mo22649f()) {
                        eVar6.mo22554g(dVar, P1);
                    }
                }
            }
        }
        if (this.f22681W0 > 0) {
            C7801b.m29529b(this, dVar, (ArrayList) null, 0);
        }
        if (this.f22682X0 > 0) {
            C7801b.m29529b(this, dVar, (ArrayList) null, 1);
        }
        return true;
    }

    /* renamed from: u1 */
    public void mo22715u1(C7803d dVar) {
        WeakReference weakReference = this.f22698n1;
        if (weakReference == null || weakReference.get() == null || dVar.mo22572d() > ((C7803d) this.f22698n1.get()).mo22572d()) {
            this.f22698n1 = new WeakReference(dVar);
        }
    }

    /* renamed from: v1 */
    public void mo22716v1(C7803d dVar) {
        WeakReference weakReference = this.f22696l1;
        if (weakReference == null || weakReference.get() == null || dVar.mo22572d() > ((C7803d) this.f22696l1.get()).mo22572d()) {
            this.f22696l1 = new WeakReference(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo22717z1(C7803d dVar) {
        WeakReference weakReference = this.f22697m1;
        if (weakReference == null || weakReference.get() == null || dVar.mo22572d() > ((C7803d) this.f22697m1.get()).mo22572d()) {
            this.f22697m1 = new WeakReference(dVar);
        }
    }
}
