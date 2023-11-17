package p90;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;

/* renamed from: p90.q3 */
public class C27401q3 extends C27392p3 {

    /* renamed from: T */
    private static final SparseIntArray f69590T;

    /* renamed from: D */
    private final NestedScrollView f69591D;

    /* renamed from: E */
    private final BogTextView f69592E;

    /* renamed from: F */
    private final BogTextView f69593F;

    /* renamed from: G */
    private final View f69594G;

    /* renamed from: H */
    private final BogTextView f69595H;

    /* renamed from: I */
    private final BogTextView f69596I;

    /* renamed from: J */
    private final BogTextView f69597J;

    /* renamed from: K */
    private final BogTextView f69598K;

    /* renamed from: L */
    private final BogTextView f69599L;

    /* renamed from: M */
    private final BogTextView f69600M;

    /* renamed from: N */
    private final BogTextView f69601N;

    /* renamed from: O */
    private final BogTextView f69602O;

    /* renamed from: P */
    private final BogTextView f69603P;

    /* renamed from: Q */
    private final LinearLayout f69604Q;

    /* renamed from: R */
    private final BogTextView f69605R;

    /* renamed from: S */
    private long f69606S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69590T = sparseIntArray;
        sparseIntArray.put(C10322k.deposit_bond_details_agree_nos, 16);
        sparseIntArray.put(C10322k.agreementDivider, 17);
    }

    public C27401q3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 18, (ViewDataBinding.C1353i) null, f69590T));
    }

    /* renamed from: D */
    public void mo66686D(DepositBond depositBond) {
        this.f69528B = depositBond;
        synchronized (this) {
            this.f69606S |= 1;
        }
        mo3956a(C10312a.f28596b);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66687E(String str) {
        this.f69529C = str;
        synchronized (this) {
            this.f69606S |= 2;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: F */
    public void mo66696F() {
        synchronized (this) {
            this.f69606S = 4;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0178  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r34 = this;
            r1 = r34
            monitor-enter(r34)
            long r2 = r1.f69606S     // Catch:{ all -> 0x0219 }
            r4 = 0
            r1.f69606S = r4     // Catch:{ all -> 0x0219 }
            monitor-exit(r34)     // Catch:{ all -> 0x0219 }
            ge.bog.mobilebank.model.DepositBond r0 = r1.f69528B
            java.lang.String r6 = r1.f69529C
            r7 = 7
            long r9 = r2 & r7
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r10 = 5
            if (r9 == 0) goto L_0x0189
            if (r0 == 0) goto L_0x002b
            java.math.BigDecimal r9 = r0.getPrincipalValueTotal()
            java.math.BigDecimal r14 = r0.getDiscount()
            java.math.BigDecimal r15 = r0.getInterestAccrued()
            java.math.BigDecimal r16 = r0.getMarketValue()
            goto L_0x0030
        L_0x002b:
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0030:
            r17 = 0
            if (r9 == 0) goto L_0x0039
            double r19 = r9.doubleValue()
            goto L_0x003b
        L_0x0039:
            r19 = r17
        L_0x003b:
            if (r14 == 0) goto L_0x0042
            double r21 = r14.doubleValue()
            goto L_0x0044
        L_0x0042:
            r21 = r17
        L_0x0044:
            if (r15 == 0) goto L_0x004b
            double r23 = r15.doubleValue()
            goto L_0x004d
        L_0x004b:
            r23 = r17
        L_0x004d:
            if (r16 == 0) goto L_0x0054
            double r15 = r16.doubleValue()
            goto L_0x0056
        L_0x0054:
            r15 = r17
        L_0x0056:
            java.lang.String r9 = g91.C32303f.m95204o(r19)
            java.lang.String r12 = g91.C32303f.m95204o(r21)
            java.lang.String r13 = g91.C32303f.m95204o(r23)
            java.lang.String r15 = g91.C32303f.m95204o(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            long r12 = r2 & r10
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x00bd
            if (r14 != 0) goto L_0x00ac
            r14 = 1
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            if (r12 == 0) goto L_0x00b8
            if (r14 == 0) goto L_0x00b4
            r23 = 16
            goto L_0x00b6
        L_0x00b4:
            r23 = 8
        L_0x00b6:
            long r2 = r2 | r23
        L_0x00b8:
            if (r14 == 0) goto L_0x00bd
            r12 = 8
            goto L_0x00be
        L_0x00bd:
            r12 = 0
        L_0x00be:
            long r23 = r2 & r10
            int r14 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0178
            if (r0 == 0) goto L_0x00e5
            long r23 = r0.getMaturityDate()
            java.lang.String r13 = r0.intWithPeriodTypeValue
            java.lang.String r25 = r0.getDictionaryKey()
            java.math.BigDecimal r26 = r0.getCdAmount()
            java.lang.String r15 = r0.bondPdfUrl
            java.math.BigDecimal r28 = r0.getNominalValue()
            java.lang.String r4 = r0.intWithPeriodType
            java.math.BigDecimal r5 = r0.getInterestRate()
            long r31 = r0.getIssueDate()
            goto L_0x00f3
        L_0x00e5:
            r4 = 0
            r5 = 0
            r13 = 0
            r15 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r31 = 0
        L_0x00f3:
            java.lang.String r0 = g91.C32319m.m95314u(r23)
            java.lang.String r23 = r90.C27950a.m86284a(r25)
            if (r15 == 0) goto L_0x00ff
            r15 = 1
            goto L_0x0100
        L_0x00ff:
            r15 = 0
        L_0x0100:
            if (r4 != 0) goto L_0x0105
            r27 = 1
            goto L_0x0107
        L_0x0105:
            r27 = 0
        L_0x0107:
            java.lang.String r4 = g91.C32319m.m95314u(r31)
            if (r14 == 0) goto L_0x0116
            if (r15 == 0) goto L_0x0112
            r24 = 256(0x100, double:1.265E-321)
            goto L_0x0114
        L_0x0112:
            r24 = 128(0x80, double:6.32E-322)
        L_0x0114:
            long r2 = r2 | r24
        L_0x0116:
            long r24 = r2 & r10
            r29 = 0
            int r14 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r14 == 0) goto L_0x0127
            if (r27 == 0) goto L_0x0123
            r24 = 64
            goto L_0x0125
        L_0x0123:
            r24 = 32
        L_0x0125:
            long r2 = r2 | r24
        L_0x0127:
            if (r26 == 0) goto L_0x0130
            java.lang.String r14 = r26.toString()
            r20 = r14
            goto L_0x0132
        L_0x0130:
            r20 = 0
        L_0x0132:
            if (r28 == 0) goto L_0x0139
            double r24 = r28.doubleValue()
            goto L_0x013b
        L_0x0139:
            r24 = r17
        L_0x013b:
            if (r5 == 0) goto L_0x0141
            double r17 = r5.doubleValue()
        L_0x0141:
            if (r15 == 0) goto L_0x0145
            r5 = 0
            goto L_0x0147
        L_0x0145:
            r5 = 8
        L_0x0147:
            if (r27 == 0) goto L_0x014c
            r16 = 8
            goto L_0x014e
        L_0x014c:
            r16 = 0
        L_0x014e:
            java.lang.String r14 = g91.C32303f.m95204o(r24)
            java.lang.String r15 = g91.C32303f.m95204o(r17)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            java.lang.String r11 = " %"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = r6
            r15 = r7
            r33 = r8
            r8 = r20
            r7 = r0
            r6 = r4
            r0 = r12
            r4 = r13
            r12 = r16
            r13 = r23
            r16 = 5
            goto L_0x019a
        L_0x0178:
            r15 = r7
            r33 = r8
            r16 = r10
            r0 = r12
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r6
            r6 = 0
            goto L_0x019a
        L_0x0189:
            r16 = r10
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r33 = 0
        L_0x019a:
            long r16 = r2 & r16
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x01e1
            r16 = r15
            ge.bog.mobilebank.ui.views.widgets.BogTextView r15 = r1.f69592E
            p018b0.C2108a.m8160b(r15, r13)
            android.view.View r13 = r1.f69594G
            r13.setVisibility(r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r1.f69595H
            r13.setVisibility(r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r1.f69596I
            p018b0.C2108a.m8160b(r13, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69596I
            r4.setVisibility(r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69598K
            p018b0.C2108a.m8160b(r4, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69599L
            p018b0.C2108a.m8160b(r4, r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69600M
            p018b0.C2108a.m8160b(r4, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69601N
            p018b0.C2108a.m8160b(r4, r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69602O
            p018b0.C2108a.m8160b(r4, r8)
            android.widget.LinearLayout r4 = r1.f69604Q
            r4.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f69527A
            r0.setVisibility(r5)
            goto L_0x01e3
        L_0x01e1:
            r16 = r15
        L_0x01e3:
            r4 = 7
            long r4 = r4 & r2
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69593F
            p018b0.C2108a.m8160b(r0, r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69597J
            p018b0.C2108a.m8160b(r0, r11)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69603P
            r7 = r16
            p018b0.C2108a.m8160b(r0, r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69605R
            r8 = r33
            p018b0.C2108a.m8160b(r0, r8)
        L_0x0204:
            r4 = 4
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0218
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69595H
            java.lang.String r2 = "cd.deposit.details.with.period"
            java.lang.String r2 = r90.C27950a.m86284a(r2)
            p018b0.C2108a.m8160b(r0, r2)
        L_0x0218:
            return
        L_0x0219:
            r0 = move-exception
            monitor-exit(r34)     // Catch:{ all -> 0x0219 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27401q3.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f69606S != 0) {
                return true;
            }
            return false;
        }
    }

    private C27401q3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[17], objArr[16], objArr[15]);
        this.f69606S = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.f69591D = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        BogTextView bogTextView = objArr[1];
        this.f69592E = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[10];
        this.f69593F = bogTextView2;
        bogTextView2.setTag((Object) null);
        View view2 = objArr[11];
        this.f69594G = view2;
        view2.setTag((Object) null);
        BogTextView bogTextView3 = objArr[12];
        this.f69595H = bogTextView3;
        bogTextView3.setTag((Object) null);
        BogTextView bogTextView4 = objArr[13];
        this.f69596I = bogTextView4;
        bogTextView4.setTag((Object) null);
        BogTextView bogTextView5 = objArr[14];
        this.f69597J = bogTextView5;
        bogTextView5.setTag((Object) null);
        BogTextView bogTextView6 = objArr[2];
        this.f69598K = bogTextView6;
        bogTextView6.setTag((Object) null);
        BogTextView bogTextView7 = objArr[3];
        this.f69599L = bogTextView7;
        bogTextView7.setTag((Object) null);
        BogTextView bogTextView8 = objArr[4];
        this.f69600M = bogTextView8;
        bogTextView8.setTag((Object) null);
        BogTextView bogTextView9 = objArr[5];
        this.f69601N = bogTextView9;
        bogTextView9.setTag((Object) null);
        BogTextView bogTextView10 = objArr[6];
        this.f69602O = bogTextView10;
        bogTextView10.setTag((Object) null);
        BogTextView bogTextView11 = objArr[7];
        this.f69603P = bogTextView11;
        bogTextView11.setTag((Object) null);
        LinearLayout linearLayout = objArr[8];
        this.f69604Q = linearLayout;
        linearLayout.setTag((Object) null);
        BogTextView bogTextView12 = objArr[9];
        this.f69605R = bogTextView12;
        bogTextView12.setTag((Object) null);
        this.f69527A.setTag((Object) null);
        mo3945A(view);
        mo66696F();
    }
}
