package p90;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.credit.BillInfo;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;

/* renamed from: p90.s2 */
public class C27418s2 extends C27409r2 {

    /* renamed from: o0 */
    private static final SparseIntArray f69741o0;

    /* renamed from: R */
    private final NestedScrollView f69742R;

    /* renamed from: S */
    private final BogTextView f69743S;

    /* renamed from: T */
    private final LinearLayout f69744T;

    /* renamed from: U */
    private final BogTextView f69745U;

    /* renamed from: V */
    private final BogTextView f69746V;

    /* renamed from: W */
    private final BogTextView f69747W;

    /* renamed from: X */
    private final BogTextView f69748X;

    /* renamed from: Y */
    private final BogTextView f69749Y;

    /* renamed from: Z */
    private final BogTextView f69750Z;

    /* renamed from: a0 */
    private final BigDividerView f69751a0;

    /* renamed from: b0 */
    private final LinearLayout f69752b0;

    /* renamed from: c0 */
    private final BogTextView f69753c0;

    /* renamed from: d0 */
    private final LinearLayout f69754d0;

    /* renamed from: e0 */
    private final BogTextView f69755e0;

    /* renamed from: f0 */
    private final BogTextView f69756f0;

    /* renamed from: g0 */
    private final BogTextView f69757g0;

    /* renamed from: h0 */
    private final LinearLayout f69758h0;

    /* renamed from: i0 */
    private final BogTextView f69759i0;

    /* renamed from: j0 */
    private final BogTextView f69760j0;

    /* renamed from: k0 */
    private final BogTextView f69761k0;

    /* renamed from: l0 */
    private final BogTextView f69762l0;

    /* renamed from: m0 */
    private final BigDividerView f69763m0;

    /* renamed from: n0 */
    private long f69764n0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69741o0 = sparseIntArray;
        sparseIntArray.put(C10322k.details_rename_button, 25);
        sparseIntArray.put(C10322k.details_share_button, 26);
        sparseIntArray.put(C10322k.account_loan_layout_container, 27);
        sparseIntArray.put(C10322k.account_loan_layout, 28);
        sparseIntArray.put(C10322k.mr_points_layout, 29);
        sparseIntArray.put(C10322k.mr_catalog_button, 30);
        sparseIntArray.put(C10322k.activation_date, 31);
        sparseIntArray.put(C10322k.collected_points, 32);
        sparseIntArray.put(C10322k.spent_points, 33);
        sparseIntArray.put(C10322k.f28805Y1, 34);
        sparseIntArray.put(C10322k.ordered_prize_count, 35);
        sparseIntArray.put(C10322k.account_insurance_layout_container, 36);
        sparseIntArray.put(C10322k.account_insurance_layout, 37);
    }

    public C27418s2(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 38, (ViewDataBinding.C1353i) null, f69741o0));
    }

    /* renamed from: D */
    public void mo66704D(BillInfo billInfo) {
        this.f69666P = billInfo;
        synchronized (this) {
            this.f69764n0 |= 1;
        }
        mo3956a(C10312a.f28596b);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66705E(CreditCardAccount creditCardAccount) {
        this.f69665O = creditCardAccount;
        synchronized (this) {
            this.f69764n0 |= 2;
        }
        mo3956a(C10312a.f28597c);
        super.mo3950x();
    }

    /* renamed from: F */
    public void mo66706F(String str) {
        this.f69667Q = str;
        synchronized (this) {
            this.f69764n0 |= 4;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: G */
    public void mo66718G() {
        synchronized (this) {
            this.f69764n0 = 8;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0145  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r53 = this;
            r1 = r53
            monitor-enter(r53)
            long r2 = r1.f69764n0     // Catch:{ all -> 0x047a }
            r4 = 0
            r1.f69764n0 = r4     // Catch:{ all -> 0x047a }
            monitor-exit(r53)     // Catch:{ all -> 0x047a }
            ge.bog.mobilebank.model.credit.BillInfo r0 = r1.f69666P
            ge.bog.mobilebank.model.credit.CreditCardAccount r6 = r1.f69665O
            java.lang.String r7 = r1.f69667Q
            r8 = 13
            long r10 = r2 & r8
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 131072(0x20000, double:6.47582E-319)
            r14 = 9
            r16 = 1
            r17 = 0
            r19 = 0
            r20 = 0
            if (r10 == 0) goto L_0x015e
            if (r0 == 0) goto L_0x0048
            java.lang.Double r10 = r0.getCommissions()
            java.lang.Double r21 = r0.getFullPaymentDue()
            java.lang.Double r22 = r0.getBaseAmount()
            java.lang.Double r23 = r0.getInterests()
            java.lang.Double r24 = r0.getMinimumPayment()
            java.lang.Double r25 = r0.getClosingBalance()
            java.lang.Double r26 = r0.getMinimumPaymentDue()
            java.lang.Double r27 = r0.getOverusedLimit()
            goto L_0x0058
        L_0x0048:
            r10 = r20
            r21 = r10
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
        L_0x0058:
            if (r10 == 0) goto L_0x005f
            double r28 = r10.doubleValue()
            goto L_0x0061
        L_0x005f:
            r28 = r17
        L_0x0061:
            if (r21 == 0) goto L_0x0068
            double r30 = r21.doubleValue()
            goto L_0x006a
        L_0x0068:
            r30 = r17
        L_0x006a:
            if (r22 == 0) goto L_0x0071
            double r21 = r22.doubleValue()
            goto L_0x0073
        L_0x0071:
            r21 = r17
        L_0x0073:
            if (r23 == 0) goto L_0x007a
            double r32 = r23.doubleValue()
            goto L_0x007c
        L_0x007a:
            r32 = r17
        L_0x007c:
            if (r24 == 0) goto L_0x0083
            double r23 = r24.doubleValue()
            goto L_0x0085
        L_0x0083:
            r23 = r17
        L_0x0085:
            if (r25 == 0) goto L_0x008c
            double r34 = r25.doubleValue()
            goto L_0x008e
        L_0x008c:
            r34 = r17
        L_0x008e:
            if (r26 == 0) goto L_0x0095
            double r25 = r26.doubleValue()
            goto L_0x0097
        L_0x0095:
            r25 = r17
        L_0x0097:
            if (r27 == 0) goto L_0x009e
            double r36 = r27.doubleValue()
            goto L_0x00a0
        L_0x009e:
            r36 = r17
        L_0x00a0:
            java.lang.String r10 = g91.C32303f.m95204o(r28)
            java.lang.String r28 = g91.C32303f.m95204o(r30)
            java.lang.String r21 = g91.C32303f.m95204o(r21)
            java.lang.String r22 = g91.C32303f.m95204o(r32)
            java.lang.String r23 = g91.C32303f.m95204o(r23)
            java.lang.String r24 = g91.C32303f.m95204o(r34)
            java.lang.String r25 = g91.C32303f.m95204o(r25)
            java.lang.String r26 = g91.C32303f.m95204o(r36)
            long r32 = r2 & r14
            int r29 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x00e0
            int r30 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r30 == 0) goto L_0x00cd
            r30 = r16
            goto L_0x00cf
        L_0x00cd:
            r30 = r19
        L_0x00cf:
            if (r29 == 0) goto L_0x00da
            if (r30 == 0) goto L_0x00d6
            r31 = 512(0x200, double:2.53E-321)
            goto L_0x00d8
        L_0x00d6:
            r31 = 256(0x100, double:1.265E-321)
        L_0x00d8:
            long r2 = r2 | r31
        L_0x00da:
            if (r30 == 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            r29 = 8
            goto L_0x00e2
        L_0x00e0:
            r29 = r19
        L_0x00e2:
            long r30 = r2 & r14
            int r30 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            if (r30 == 0) goto L_0x0145
            if (r0 == 0) goto L_0x00f3
            java.lang.Long r31 = r0.getDueDate()
            java.lang.Long r32 = r0.getInpSysdate()
            goto L_0x00f7
        L_0x00f3:
            r31 = r20
            r32 = r31
        L_0x00f7:
            if (r0 == 0) goto L_0x00fc
            r0 = r16
            goto L_0x00fe
        L_0x00fc:
            r0 = r19
        L_0x00fe:
            if (r30 == 0) goto L_0x0112
            if (r0 == 0) goto L_0x0109
            r33 = 32768(0x8000, double:1.61895E-319)
            long r2 = r2 | r33
            long r2 = r2 | r11
            goto L_0x0112
        L_0x0109:
            r33 = 16384(0x4000, double:8.0948E-320)
            long r2 = r2 | r33
            r33 = 65536(0x10000, double:3.2379E-319)
            long r2 = r2 | r33
        L_0x0112:
            if (r31 == 0) goto L_0x0119
            long r30 = r31.longValue()
            goto L_0x011b
        L_0x0119:
            r30 = r4
        L_0x011b:
            long r32 = androidx.databinding.ViewDataBinding.m4670y(r32)
            if (r0 == 0) goto L_0x0124
            r34 = r19
            goto L_0x0126
        L_0x0124:
            r34 = 8
        L_0x0126:
            java.lang.String r30 = g91.C32319m.m95314u(r30)
            java.lang.String r31 = g91.C32319m.m95314u(r32)
            r13 = r21
            r14 = r22
            r15 = r23
            r11 = r24
            r12 = r25
            r38 = r26
            r39 = r28
            r40 = r29
            r41 = r30
            r42 = r31
            r43 = r34
            goto L_0x0177
        L_0x0145:
            r0 = r19
            r43 = r0
            r41 = r20
            r42 = r41
            r13 = r21
            r14 = r22
            r15 = r23
            r11 = r24
            r12 = r25
            r38 = r26
            r39 = r28
            r40 = r29
            goto L_0x0177
        L_0x015e:
            r36 = r17
            r0 = r19
            r40 = r0
            r43 = r40
            r10 = r20
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r27 = r15
            r38 = r27
            r39 = r38
            r41 = r39
            r42 = r41
        L_0x0177:
            r28 = 14
            long r30 = r2 & r28
            int r26 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            r30 = 128(0x80, double:6.32E-322)
            r32 = 10
            if (r26 == 0) goto L_0x023c
            long r34 = r2 & r32
            int r26 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x01fc
            if (r6 == 0) goto L_0x019e
            java.math.BigDecimal r34 = r6.getAtmPercent()
            java.math.BigDecimal r35 = r6.getPosPercent()
            java.lang.String r44 = r6.getAccountTitle()
            java.lang.String r8 = r6.fileUrl
            java.lang.String r9 = r6.getPrintAcctNo()
            goto L_0x01a7
        L_0x019e:
            r8 = r20
            r9 = r8
            r34 = r9
            r35 = r34
            r44 = r35
        L_0x01a7:
            if (r34 == 0) goto L_0x01ae
            double r46 = r34.doubleValue()
            goto L_0x01b0
        L_0x01ae:
            r46 = r17
        L_0x01b0:
            if (r35 == 0) goto L_0x01b7
            double r34 = r35.doubleValue()
            goto L_0x01b9
        L_0x01b7:
            r34 = r17
        L_0x01b9:
            if (r8 == 0) goto L_0x01be
            r8 = r16
            goto L_0x01c0
        L_0x01be:
            r8 = r19
        L_0x01c0:
            if (r26 == 0) goto L_0x01cb
            if (r8 == 0) goto L_0x01c7
            long r2 = r2 | r30
            goto L_0x01cb
        L_0x01c7:
            r48 = 64
            long r2 = r2 | r48
        L_0x01cb:
            java.lang.String r4 = g91.C32303f.m95204o(r46)
            java.lang.String r5 = g91.C32303f.m95204o(r34)
            r34 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r3 = "%"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r4 = "%"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r2
            r5 = r3
            r2 = r34
            goto L_0x0204
        L_0x01fc:
            r8 = r19
            r4 = r20
            r5 = r4
            r9 = r5
            r44 = r9
        L_0x0204:
            if (r6 == 0) goto L_0x020f
            java.math.BigDecimal r26 = r6.getOverdraftLimit()
            java.math.BigDecimal r34 = r6.getAvailableAmount()
            goto L_0x0213
        L_0x020f:
            r26 = r20
            r34 = r26
        L_0x0213:
            if (r26 == 0) goto L_0x021a
            double r46 = r26.doubleValue()
            goto L_0x021c
        L_0x021a:
            r46 = r17
        L_0x021c:
            if (r34 == 0) goto L_0x0223
            double r34 = r34.doubleValue()
            goto L_0x0225
        L_0x0223:
            r34 = r17
        L_0x0225:
            java.lang.String r26 = g91.C32303f.m95204o(r46)
            java.lang.String r34 = g91.C32303f.m95204o(r34)
            r50 = r44
            r51 = r34
            r34 = r4
            r4 = r51
            r52 = r26
            r26 = r5
            r5 = r52
            goto L_0x0248
        L_0x023c:
            r8 = r19
            r4 = r20
            r5 = r4
            r9 = r5
            r26 = r9
            r34 = r26
            r50 = r34
        L_0x0248:
            r46 = 15
            long r46 = r2 & r46
            r48 = 0
            int r35 = (r46 > r48 ? 1 : (r46 == r48 ? 0 : -1))
            if (r35 == 0) goto L_0x0319
            r44 = 13
            long r46 = r2 & r44
            int r35 = (r46 > r48 ? 1 : (r46 == r48 ? 0 : -1))
            if (r35 == 0) goto L_0x02dd
            r35 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r7)
            java.lang.String r12 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r7)
            java.lang.String r10 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r44 = r9
            r9 = r38
            r15.append(r9)
            r15.append(r7)
            java.lang.String r9 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r7)
            java.lang.String r11 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r38 = r9
            r9 = r39
            r15.append(r9)
            r15.append(r7)
            java.lang.String r9 = r15.toString()
            goto L_0x02ea
        L_0x02dd:
            r35 = r9
            r9 = r20
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r38 = r14
            r44 = r38
        L_0x02ea:
            long r46 = r2 & r28
            r48 = 0
            int r15 = (r46 > r48 ? 1 : (r46 == r48 ? 0 : -1))
            if (r15 == 0) goto L_0x0311
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r5)
            r15.append(r7)
            java.lang.String r5 = r15.toString()
            goto L_0x0314
        L_0x0311:
            r4 = r20
            r5 = r4
        L_0x0314:
            r7 = r38
            r15 = r44
            goto L_0x0326
        L_0x0319:
            r35 = r9
            r4 = r20
            r5 = r4
            r7 = r5
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0326:
            long r30 = r2 & r30
            r38 = 0
            int r30 = (r30 > r38 ? 1 : (r30 == r38 ? 0 : -1))
            if (r30 == 0) goto L_0x0339
            if (r6 == 0) goto L_0x0334
            java.lang.String r6 = r6.fileId
            r20 = r6
        L_0x0334:
            if (r20 == 0) goto L_0x0339
            r6 = r16
            goto L_0x033b
        L_0x0339:
            r6 = r19
        L_0x033b:
            r24 = 131072(0x20000, double:6.47582E-319)
            long r24 = r2 & r24
            r30 = 0
            int r20 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r20 == 0) goto L_0x034b
            if (r27 == 0) goto L_0x034b
            r20 = r16
            goto L_0x034d
        L_0x034b:
            r20 = r19
        L_0x034d:
            long r24 = r2 & r32
            int r24 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r24 == 0) goto L_0x0369
            if (r8 == 0) goto L_0x0356
            goto L_0x0358
        L_0x0356:
            r6 = r19
        L_0x0358:
            if (r24 == 0) goto L_0x0363
            if (r6 == 0) goto L_0x035f
            r24 = 2048(0x800, double:1.0118E-320)
            goto L_0x0361
        L_0x035f:
            r24 = 1024(0x400, double:5.06E-321)
        L_0x0361:
            long r2 = r2 | r24
        L_0x0363:
            if (r6 == 0) goto L_0x0366
            goto L_0x0369
        L_0x0366:
            r6 = 8
            goto L_0x036b
        L_0x0369:
            r6 = r19
        L_0x036b:
            r22 = 9
            long r24 = r2 & r22
            r30 = 0
            int r8 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            r24 = 8192(0x2000, double:4.0474E-320)
            if (r8 == 0) goto L_0x0388
            if (r0 == 0) goto L_0x037a
            goto L_0x037c
        L_0x037a:
            r20 = r19
        L_0x037c:
            if (r8 == 0) goto L_0x038a
            if (r20 == 0) goto L_0x0383
            long r2 = r2 | r24
            goto L_0x038a
        L_0x0383:
            r30 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 | r30
            goto L_0x038a
        L_0x0388:
            r20 = r19
        L_0x038a:
            long r24 = r2 & r24
            r30 = 0
            int r0 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r0 == 0) goto L_0x0397
            int r0 = (r36 > r17 ? 1 : (r36 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0397
            goto L_0x0399
        L_0x0397:
            r16 = r19
        L_0x0399:
            r17 = 9
            long r24 = r2 & r17
            int r0 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r0 == 0) goto L_0x03b6
            if (r20 == 0) goto L_0x03a4
            goto L_0x03a6
        L_0x03a4:
            r16 = r19
        L_0x03a6:
            if (r0 == 0) goto L_0x03b1
            if (r16 == 0) goto L_0x03ad
            r17 = 32
            goto L_0x03af
        L_0x03ad:
            r17 = 16
        L_0x03af:
            long r2 = r2 | r17
        L_0x03b1:
            if (r16 == 0) goto L_0x03b4
            goto L_0x03b6
        L_0x03b4:
            r19 = 8
        L_0x03b6:
            r0 = r19
            long r16 = r2 & r32
            r18 = 0
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x03e4
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = r1.f69668y
            r16 = r4
            r4 = r35
            p018b0.C2108a.m8160b(r8, r4)
            android.widget.LinearLayout r4 = r1.f69655E
            r4.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69743S
            r6 = r50
            p018b0.C2108a.m8160b(r4, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69761k0
            r6 = r34
            p018b0.C2108a.m8160b(r4, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69762l0
            r6 = r26
            p018b0.C2108a.m8160b(r4, r6)
            goto L_0x03e6
        L_0x03e4:
            r16 = r4
        L_0x03e6:
            r17 = 8
            long r17 = r2 & r17
            r19 = 0
            int r4 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x03fb
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69660J
            java.lang.String r6 = "creditcard.account.details.agreement"
            java.lang.String r6 = r90.C27950a.m86284a(r6)
            p018b0.C2108a.m8160b(r4, r6)
        L_0x03fb:
            r17 = 9
            long r17 = r2 & r17
            int r4 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x0433
            android.widget.LinearLayout r4 = r1.f69744T
            r6 = r43
            r4.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69745U
            r8 = r42
            p018b0.C2108a.m8160b(r4, r8)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r4 = r1.f69751a0
            r4.setVisibility(r6)
            android.widget.LinearLayout r4 = r1.f69752b0
            r4.setVisibility(r6)
            android.widget.LinearLayout r4 = r1.f69754d0
            r8 = r40
            r4.setVisibility(r8)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69756f0
            r8 = r41
            p018b0.C2108a.m8160b(r4, r8)
            android.widget.LinearLayout r4 = r1.f69758h0
            r4.setVisibility(r0)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r0 = r1.f69763m0
            r0.setVisibility(r6)
        L_0x0433:
            r17 = 13
            long r17 = r2 & r17
            r19 = 0
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0465
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69746V
            p018b0.C2108a.m8160b(r0, r11)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69747W
            p018b0.C2108a.m8160b(r0, r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69748X
            p018b0.C2108a.m8160b(r0, r15)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69749Y
            p018b0.C2108a.m8160b(r0, r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69750Z
            p018b0.C2108a.m8160b(r0, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69753c0
            p018b0.C2108a.m8160b(r0, r13)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69755e0
            p018b0.C2108a.m8160b(r0, r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69759i0
            p018b0.C2108a.m8160b(r0, r7)
        L_0x0465:
            long r2 = r2 & r28
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0479
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69757g0
            p018b0.C2108a.m8160b(r0, r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69760j0
            r4 = r16
            p018b0.C2108a.m8160b(r0, r4)
        L_0x0479:
            return
        L_0x047a:
            r0 = move-exception
            monitor-exit(r53)     // Catch:{ all -> 0x047a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27418s2.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f69764n0 != 0) {
                return true;
            }
            return false;
        }
    }

    private C27418s2(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[2], objArr[37], objArr[36], objArr[28], objArr[27], objArr[31], objArr[23], objArr[34], objArr[32], objArr[25], objArr[26], objArr[24], objArr[30], objArr[29], objArr[35], objArr[33]);
        this.f69764n0 = -1;
        this.f69668y.setTag((Object) null);
        this.f69655E.setTag((Object) null);
        this.f69660J.setTag((Object) null);
        NestedScrollView nestedScrollView = objArr[0];
        this.f69742R = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        BogTextView bogTextView = objArr[1];
        this.f69743S = bogTextView;
        bogTextView.setTag((Object) null);
        LinearLayout linearLayout = objArr[10];
        this.f69744T = linearLayout;
        linearLayout.setTag((Object) null);
        BogTextView bogTextView2 = objArr[11];
        this.f69745U = bogTextView2;
        bogTextView2.setTag((Object) null);
        BogTextView bogTextView3 = objArr[12];
        this.f69746V = bogTextView3;
        bogTextView3.setTag((Object) null);
        BogTextView bogTextView4 = objArr[13];
        this.f69747W = bogTextView4;
        bogTextView4.setTag((Object) null);
        BogTextView bogTextView5 = objArr[14];
        this.f69748X = bogTextView5;
        bogTextView5.setTag((Object) null);
        BogTextView bogTextView6 = objArr[15];
        this.f69749Y = bogTextView6;
        bogTextView6.setTag((Object) null);
        BogTextView bogTextView7 = objArr[16];
        this.f69750Z = bogTextView7;
        bogTextView7.setTag((Object) null);
        BigDividerView bigDividerView = objArr[17];
        this.f69751a0 = bigDividerView;
        bigDividerView.setTag((Object) null);
        LinearLayout linearLayout2 = objArr[18];
        this.f69752b0 = linearLayout2;
        linearLayout2.setTag((Object) null);
        BogTextView bogTextView8 = objArr[19];
        this.f69753c0 = bogTextView8;
        bogTextView8.setTag((Object) null);
        LinearLayout linearLayout3 = objArr[20];
        this.f69754d0 = linearLayout3;
        linearLayout3.setTag((Object) null);
        BogTextView bogTextView9 = objArr[21];
        this.f69755e0 = bogTextView9;
        bogTextView9.setTag((Object) null);
        BogTextView bogTextView10 = objArr[22];
        this.f69756f0 = bogTextView10;
        bogTextView10.setTag((Object) null);
        BogTextView bogTextView11 = objArr[3];
        this.f69757g0 = bogTextView11;
        bogTextView11.setTag((Object) null);
        LinearLayout linearLayout4 = objArr[4];
        this.f69758h0 = linearLayout4;
        linearLayout4.setTag((Object) null);
        BogTextView bogTextView12 = objArr[5];
        this.f69759i0 = bogTextView12;
        bogTextView12.setTag((Object) null);
        BogTextView bogTextView13 = objArr[6];
        this.f69760j0 = bogTextView13;
        bogTextView13.setTag((Object) null);
        BogTextView bogTextView14 = objArr[7];
        this.f69761k0 = bogTextView14;
        bogTextView14.setTag((Object) null);
        BogTextView bogTextView15 = objArr[8];
        this.f69762l0 = bogTextView15;
        bogTextView15.setTag((Object) null);
        BigDividerView bigDividerView2 = objArr[9];
        this.f69763m0 = bigDividerView2;
        bigDividerView2.setTag((Object) null);
        mo3945A(view);
        mo66718G();
    }
}
