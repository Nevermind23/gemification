package p90;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;

/* renamed from: p90.u3 */
public class C27437u3 extends C27428t3 {

    /* renamed from: D0 */
    private static final SparseIntArray f69916D0;

    /* renamed from: A0 */
    private final BogTextView f69917A0;

    /* renamed from: B0 */
    private final BigDividerView f69918B0;

    /* renamed from: C0 */
    private long f69919C0;

    /* renamed from: L */
    private final NestedScrollView f69920L;

    /* renamed from: M */
    private final LinearLayout f69921M;

    /* renamed from: N */
    private final LinearLayout f69922N;

    /* renamed from: O */
    private final BogTextView f69923O;

    /* renamed from: P */
    private final BogTextView f69924P;

    /* renamed from: Q */
    private final BigDividerView f69925Q;

    /* renamed from: R */
    private final LinearLayout f69926R;

    /* renamed from: S */
    private final BogTextView f69927S;

    /* renamed from: T */
    private final BogTextView f69928T;

    /* renamed from: U */
    private final LinearLayout f69929U;

    /* renamed from: V */
    private final BogTextView f69930V;

    /* renamed from: W */
    private final BogTextView f69931W;

    /* renamed from: X */
    private final BogTextView f69932X;

    /* renamed from: Y */
    private final BogTextView f69933Y;

    /* renamed from: Z */
    private final BogTextView f69934Z;

    /* renamed from: a0 */
    private final View f69935a0;

    /* renamed from: b0 */
    private final LinearLayout f69936b0;

    /* renamed from: c0 */
    private final BogTextView f69937c0;

    /* renamed from: d0 */
    private final LinearLayout f69938d0;

    /* renamed from: e0 */
    private final BogTextView f69939e0;

    /* renamed from: f0 */
    private final BigDividerView f69940f0;

    /* renamed from: g0 */
    private final BogTextView f69941g0;

    /* renamed from: h0 */
    private final BogTextView f69942h0;

    /* renamed from: i0 */
    private final BogTextView f69943i0;

    /* renamed from: j0 */
    private final BogTextView f69944j0;

    /* renamed from: k0 */
    private final BogTextView f69945k0;

    /* renamed from: l0 */
    private final LinearLayout f69946l0;

    /* renamed from: m0 */
    private final BogTextView f69947m0;

    /* renamed from: n0 */
    private final LinearLayout f69948n0;

    /* renamed from: o0 */
    private final BogTextView f69949o0;

    /* renamed from: p0 */
    private final LinearLayout f69950p0;

    /* renamed from: q0 */
    private final BogTextView f69951q0;

    /* renamed from: r0 */
    private final BogTextView f69952r0;

    /* renamed from: s0 */
    private final BogTextView f69953s0;

    /* renamed from: t0 */
    private final LinearLayout f69954t0;

    /* renamed from: u0 */
    private final BogTextView f69955u0;

    /* renamed from: v0 */
    private final LinearLayout f69956v0;

    /* renamed from: w0 */
    private final BogTextView f69957w0;

    /* renamed from: x0 */
    private final BogTextView f69958x0;

    /* renamed from: y0 */
    private final BogTextView f69959y0;

    /* renamed from: z0 */
    private final LinearLayout f69960z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69916D0 = sparseIntArray;
        sparseIntArray.put(C10322k.loan_cosigner_feedback, 45);
        sparseIntArray.put(C10322k.bogTextView5, 46);
        sparseIntArray.put(C10322k.bogTextView, 47);
        sparseIntArray.put(C10322k.loan_details_invoice_list_container, 48);
        sparseIntArray.put(C10322k.details_rename_button, 49);
        sparseIntArray.put(C10322k.bindedAccountDivider, 50);
        sparseIntArray.put(C10322k.bindedAccountTitle, 51);
        sparseIntArray.put(C10322k.agreementDivider, 52);
    }

    public C27437u3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 53, (ViewDataBinding.C1353i) null, f69916D0));
    }

    /* renamed from: D */
    public void mo66728D(String str) {
        this.f69841K = str;
        synchronized (this) {
            this.f69919C0 |= 4;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66729E(LoanDetailsWrapper loanDetailsWrapper) {
        this.f69840J = loanDetailsWrapper;
        synchronized (this) {
            this.f69919C0 |= 2;
        }
        mo3956a(C10312a.f28600f);
        super.mo3950x();
    }

    /* renamed from: F */
    public void mo66730F(Loan loan) {
        this.f69839I = loan;
        synchronized (this) {
            this.f69919C0 |= 1;
        }
        mo3956a(C10312a.f28602h);
        super.mo3950x();
    }

    /* renamed from: G */
    public void mo66739G() {
        synchronized (this) {
            this.f69919C0 = 8;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0760  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0870  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r109 = this;
            r1 = r109
            monitor-enter(r109)
            long r2 = r1.f69919C0     // Catch:{ all -> 0x08b5 }
            r4 = 0
            r1.f69919C0 = r4     // Catch:{ all -> 0x08b5 }
            monitor-exit(r109)     // Catch:{ all -> 0x08b5 }
            ge.bog.mobilebank.model.loans.Loan r0 = r1.f69839I
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r6 = r1.f69840J
            java.lang.String r7 = r1.f69841K
            r8 = 13
            long r10 = r2 & r8
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            r13 = 9
            r16 = 0
            r15 = 0
            r19 = 0
            if (r10 == 0) goto L_0x00f7
            long r20 = r2 & r13
            int r10 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00c9
            if (r0 == 0) goto L_0x003d
            boolean r20 = r0.isMortgage()
            java.lang.String r21 = r0.getLoanName()
            boolean r22 = r0.isPln()
            boolean r23 = r0.isLnd()
            goto L_0x0045
        L_0x003d:
            r20 = r15
            r22 = r20
            r23 = r22
            r21 = r19
        L_0x0045:
            if (r10 == 0) goto L_0x0052
            if (r20 == 0) goto L_0x004d
            r24 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x0050
        L_0x004d:
            r24 = 1048576(0x100000, double:5.180654E-318)
        L_0x0050:
            long r2 = r2 | r24
        L_0x0052:
            long r24 = r2 & r13
            int r10 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x006f
            if (r22 == 0) goto L_0x0064
            r24 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2 | r24
            r24 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x006d
        L_0x0064:
            r24 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 | r24
            r24 = 17179869184(0x400000000, double:8.4879831639E-314)
        L_0x006d:
            long r2 = r2 | r24
        L_0x006f:
            long r24 = r2 & r13
            int r10 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x007e
            if (r23 == 0) goto L_0x007a
            r24 = 512(0x200, double:2.53E-321)
            goto L_0x007c
        L_0x007a:
            r24 = 256(0x100, double:1.265E-321)
        L_0x007c:
            long r2 = r2 | r24
        L_0x007e:
            if (r20 == 0) goto L_0x0082
            r10 = r15
            goto L_0x0084
        L_0x0082:
            r10 = 8
        L_0x0084:
            boolean r20 = android.text.TextUtils.isEmpty(r21)
            r24 = r22 ^ 1
            if (r22 == 0) goto L_0x008f
            r25 = r15
            goto L_0x0091
        L_0x008f:
            r25 = 8
        L_0x0091:
            if (r22 == 0) goto L_0x0096
            r22 = 8
            goto L_0x0098
        L_0x0096:
            r22 = r15
        L_0x0098:
            if (r23 == 0) goto L_0x009d
            r23 = r15
            goto L_0x009f
        L_0x009d:
            r23 = 8
        L_0x009f:
            long r26 = r2 & r13
            int r26 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x00b0
            if (r20 == 0) goto L_0x00a9
            long r2 = r2 | r11
            goto L_0x00b0
        L_0x00a9:
            r26 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 | r26
        L_0x00b0:
            long r26 = r2 & r13
            int r26 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x00c1
            if (r24 == 0) goto L_0x00bc
            r26 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x00bf
        L_0x00bc:
            r26 = 67108864(0x4000000, double:3.31561842E-316)
        L_0x00bf:
            long r2 = r2 | r26
        L_0x00c1:
            if (r24 == 0) goto L_0x00c6
            r24 = 8
            goto L_0x00d6
        L_0x00c6:
            r24 = r15
            goto L_0x00d6
        L_0x00c9:
            r10 = r15
            r20 = r10
            r22 = r20
            r23 = r22
            r24 = r23
            r25 = r24
            r21 = r19
        L_0x00d6:
            if (r0 == 0) goto L_0x00dd
            java.math.BigDecimal r26 = r0.getAmount()
            goto L_0x00df
        L_0x00dd:
            r26 = r19
        L_0x00df:
            if (r26 == 0) goto L_0x00e6
            double r26 = r26.doubleValue()
            goto L_0x00e8
        L_0x00e6:
            r26 = r16
        L_0x00e8:
            java.lang.String r26 = g91.C32303f.m95204o(r26)
            r28 = r22
            r29 = r23
            r30 = r24
            r31 = r25
            r13 = r26
            goto L_0x0106
        L_0x00f7:
            r10 = r15
            r20 = r10
            r28 = r20
            r29 = r28
            r30 = r29
            r31 = r30
            r13 = r19
            r21 = r13
        L_0x0106:
            r24 = 14
            long r26 = r2 & r24
            int r14 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            r26 = 2048(0x800, double:1.0118E-320)
            r32 = 4194304(0x400000, double:2.0722615E-317)
            r34 = 10
            r36 = 1
            if (r14 == 0) goto L_0x0444
            if (r6 == 0) goto L_0x0136
            ge.bog.mobilebank.model.loans.LoanDetails r14 = r6.getDetails()
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r37 = r6.getLndRepayment()
            ge.bog.mobilebank.model.loans.PLNDetails r38 = r6.getPlnDetails()
            ge.bog.mobilebank.model.loans.LoanDetails r39 = r6.getDetails()
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r40 = r6.getSchedule()
            ge.bog.mobilebank.model.LoanInvoiceWrapper r41 = r6.getInvoice()
            java.math.BigDecimal r42 = r6.getTotalOffsetAmount()
            goto L_0x0144
        L_0x0136:
            r14 = r19
            r37 = r14
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
        L_0x0144:
            long r43 = r2 & r34
            int r43 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x01f1
            if (r14 == 0) goto L_0x0155
            boolean r44 = r14.hasInsFlag()
            java.lang.String r45 = r14.getFileUrl()
            goto L_0x0159
        L_0x0155:
            r44 = r15
            r45 = r19
        L_0x0159:
            if (r43 == 0) goto L_0x0168
            if (r44 == 0) goto L_0x0163
            r46 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x0166
        L_0x0163:
            r46 = 1073741824(0x40000000, double:5.304989477E-315)
        L_0x0166:
            long r2 = r2 | r46
        L_0x0168:
            if (r37 != 0) goto L_0x016d
            r43 = r36
            goto L_0x016f
        L_0x016d:
            r43 = r15
        L_0x016f:
            if (r40 != 0) goto L_0x0174
            r46 = r36
            goto L_0x0176
        L_0x0174:
            r46 = r15
        L_0x0176:
            long r47 = r2 & r34
            int r47 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r47 == 0) goto L_0x0185
            if (r43 == 0) goto L_0x0181
            long r2 = r2 | r26
            goto L_0x0185
        L_0x0181:
            r47 = 1024(0x400, double:5.06E-321)
            long r2 = r2 | r47
        L_0x0185:
            long r47 = r2 & r34
            int r47 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r47 == 0) goto L_0x0195
            if (r46 == 0) goto L_0x0191
            r47 = 32768(0x8000, double:1.61895E-319)
            goto L_0x0193
        L_0x0191:
            r47 = 16384(0x4000, double:8.0948E-320)
        L_0x0193:
            long r2 = r2 | r47
        L_0x0195:
            if (r39 == 0) goto L_0x01a0
            java.lang.String r47 = r39.getLinkAcctNo()
            java.math.BigDecimal r48 = r39.getInterestRate()
            goto L_0x01a4
        L_0x01a0:
            r47 = r19
            r48 = r47
        L_0x01a4:
            if (r40 == 0) goto L_0x01ab
            java.lang.String r49 = r40.getFormattedPayDate()
            goto L_0x01ad
        L_0x01ab:
            r49 = r19
        L_0x01ad:
            if (r44 == 0) goto L_0x01b2
            r44 = r15
            goto L_0x01b4
        L_0x01b2:
            r44 = 8
        L_0x01b4:
            if (r45 == 0) goto L_0x01b9
            r45 = r36
            goto L_0x01bb
        L_0x01b9:
            r45 = r15
        L_0x01bb:
            if (r46 == 0) goto L_0x01c0
            r50 = 8
            goto L_0x01c2
        L_0x01c0:
            r50 = r15
        L_0x01c2:
            long r51 = r2 & r34
            int r51 = (r51 > r4 ? 1 : (r51 == r4 ? 0 : -1))
            if (r51 == 0) goto L_0x01d2
            if (r45 == 0) goto L_0x01d0
            r51 = 8388608(0x800000, double:4.144523E-317)
            long r2 = r2 | r51
            goto L_0x01d2
        L_0x01d0:
            long r2 = r2 | r32
        L_0x01d2:
            if (r48 == 0) goto L_0x01d9
            double r51 = r48.doubleValue()
            goto L_0x01db
        L_0x01d9:
            r51 = r16
        L_0x01db:
            java.lang.String r11 = g91.C32303f.m95204o(r51)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = " %"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            goto L_0x0201
        L_0x01f1:
            r43 = r15
            r44 = r43
            r45 = r44
            r46 = r45
            r50 = r46
            r11 = r19
            r47 = r11
            r49 = r47
        L_0x0201:
            if (r14 == 0) goto L_0x020c
            java.math.BigDecimal r12 = r14.getOffsetIntSaved()
            java.math.BigDecimal r14 = r14.getInsAmount()
            goto L_0x020f
        L_0x020c:
            r12 = r19
            r14 = r12
        L_0x020f:
            if (r37 == 0) goto L_0x0226
            java.math.BigDecimal r48 = r37.getInterest()
            java.math.BigDecimal r51 = r37.getScheduledFee()
            java.math.BigDecimal r52 = r37.getInsAmt()
            java.math.BigDecimal r55 = r37.getPrincipal()
            java.math.BigDecimal r37 = r37.getPenalty()
            goto L_0x0230
        L_0x0226:
            r37 = r19
            r48 = r37
            r51 = r48
            r52 = r51
            r55 = r52
        L_0x0230:
            if (r38 == 0) goto L_0x023b
            java.math.BigDecimal r56 = r38.getPenalty()
            java.math.BigDecimal r38 = r38.getIntAmount()
            goto L_0x023f
        L_0x023b:
            r38 = r19
            r56 = r38
        L_0x023f:
            if (r39 == 0) goto L_0x024a
            java.math.BigDecimal r57 = r39.getInitialPrincipal()
            java.math.BigDecimal r39 = r39.getRemainingInterest()
            goto L_0x024e
        L_0x024a:
            r39 = r19
            r57 = r39
        L_0x024e:
            if (r40 == 0) goto L_0x0261
            java.math.BigDecimal r58 = r40.getPriAmt()
            java.math.BigDecimal r59 = r40.getIntAmtWithoutOffset()
            java.math.BigDecimal r60 = r40.getFeeAmt()
            java.math.BigDecimal r40 = r40.getNextPayAmt()
            goto L_0x0269
        L_0x0261:
            r40 = r19
            r58 = r40
            r59 = r58
            r60 = r59
        L_0x0269:
            if (r41 == 0) goto L_0x0270
            java.math.BigDecimal r41 = r41.getAmount()
            goto L_0x0272
        L_0x0270:
            r41 = r19
        L_0x0272:
            if (r42 == 0) goto L_0x0279
            double r61 = r42.doubleValue()
            goto L_0x027b
        L_0x0279:
            r61 = r16
        L_0x027b:
            if (r12 == 0) goto L_0x0282
            double r63 = r12.doubleValue()
            goto L_0x0284
        L_0x0282:
            r63 = r16
        L_0x0284:
            if (r14 == 0) goto L_0x028b
            double r65 = r14.doubleValue()
            goto L_0x028d
        L_0x028b:
            r65 = r16
        L_0x028d:
            if (r48 == 0) goto L_0x0294
            double r67 = r48.doubleValue()
            goto L_0x0296
        L_0x0294:
            r67 = r16
        L_0x0296:
            if (r51 == 0) goto L_0x029d
            double r69 = r51.doubleValue()
            goto L_0x029f
        L_0x029d:
            r69 = r16
        L_0x029f:
            if (r52 == 0) goto L_0x02a6
            double r51 = r52.doubleValue()
            goto L_0x02a8
        L_0x02a6:
            r51 = r16
        L_0x02a8:
            if (r55 == 0) goto L_0x02af
            double r71 = r55.doubleValue()
            goto L_0x02b1
        L_0x02af:
            r71 = r16
        L_0x02b1:
            if (r37 == 0) goto L_0x02b8
            double r73 = r37.doubleValue()
            goto L_0x02ba
        L_0x02b8:
            r73 = r16
        L_0x02ba:
            if (r56 == 0) goto L_0x02c1
            double r55 = r56.doubleValue()
            goto L_0x02c3
        L_0x02c1:
            r55 = r16
        L_0x02c3:
            if (r38 == 0) goto L_0x02ca
            double r37 = r38.doubleValue()
            goto L_0x02cc
        L_0x02ca:
            r37 = r16
        L_0x02cc:
            if (r57 == 0) goto L_0x02d3
            double r75 = r57.doubleValue()
            goto L_0x02d5
        L_0x02d3:
            r75 = r16
        L_0x02d5:
            if (r39 == 0) goto L_0x02dc
            double r77 = r39.doubleValue()
            goto L_0x02de
        L_0x02dc:
            r77 = r16
        L_0x02de:
            if (r58 == 0) goto L_0x02e5
            double r57 = r58.doubleValue()
            goto L_0x02e7
        L_0x02e5:
            r57 = r16
        L_0x02e7:
            if (r59 == 0) goto L_0x02ee
            double r79 = r59.doubleValue()
            goto L_0x02f0
        L_0x02ee:
            r79 = r16
        L_0x02f0:
            if (r60 == 0) goto L_0x02f7
            double r59 = r60.doubleValue()
            goto L_0x02f9
        L_0x02f7:
            r59 = r16
        L_0x02f9:
            if (r40 == 0) goto L_0x0300
            double r39 = r40.doubleValue()
            goto L_0x0302
        L_0x0300:
            r39 = r16
        L_0x0302:
            if (r41 == 0) goto L_0x0309
            double r41 = r41.doubleValue()
            goto L_0x030b
        L_0x0309:
            r41 = r16
        L_0x030b:
            java.lang.String r12 = g91.C32303f.m95204o(r61)
            java.lang.String r14 = g91.C32303f.m95204o(r63)
            java.lang.String r48 = g91.C32303f.m95204o(r65)
            java.lang.String r61 = g91.C32303f.m95204o(r67)
            java.lang.String r62 = g91.C32303f.m95204o(r69)
            java.lang.String r63 = g91.C32303f.m95204o(r51)
            java.lang.String r64 = g91.C32303f.m95204o(r71)
            java.lang.String r65 = g91.C32303f.m95204o(r73)
            java.lang.String r55 = g91.C32303f.m95204o(r55)
            java.lang.String r37 = g91.C32303f.m95204o(r37)
            java.lang.String r38 = g91.C32303f.m95204o(r75)
            java.lang.String r56 = g91.C32303f.m95204o(r77)
            java.lang.String r57 = g91.C32303f.m95204o(r57)
            java.lang.String r58 = g91.C32303f.m95204o(r79)
            java.lang.String r59 = g91.C32303f.m95204o(r59)
            java.lang.String r39 = g91.C32303f.m95204o(r39)
            java.lang.String r40 = g91.C32303f.m95204o(r41)
            long r41 = r2 & r34
            int r41 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r41 == 0) goto L_0x0371
            int r16 = (r51 > r16 ? 1 : (r51 == r16 ? 0 : -1))
            if (r16 <= 0) goto L_0x035c
            r16 = r36
            goto L_0x035e
        L_0x035c:
            r16 = r15
        L_0x035e:
            if (r41 == 0) goto L_0x036b
            if (r16 == 0) goto L_0x0366
            r41 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x0369
        L_0x0366:
            r41 = 268435456(0x10000000, double:1.32624737E-315)
        L_0x0369:
            long r2 = r2 | r41
        L_0x036b:
            if (r16 == 0) goto L_0x036e
            goto L_0x0371
        L_0x036e:
            r16 = 8
            goto L_0x0373
        L_0x0371:
            r16 = r15
        L_0x0373:
            long r41 = r2 & r34
            int r17 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x040c
            if (r6 == 0) goto L_0x0390
            java.lang.String r41 = r6.getStartAndMaturityDate()
            ge.bog.mobilebank.model.LoanInvoiceWrapper r42 = r6.getInvoice()
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r51 = r6.getPlnRepayment()
            java.lang.String r52 = r6.getAmount()
            java.lang.String r60 = r6.getDate()
            goto L_0x039a
        L_0x0390:
            r41 = r19
            r42 = r41
            r51 = r42
            r52 = r51
            r60 = r52
        L_0x039a:
            if (r42 == 0) goto L_0x03a1
            java.lang.String r66 = r42.getInvoicePaymentDate()
            goto L_0x03a3
        L_0x03a1:
            r66 = r19
        L_0x03a3:
            if (r42 != 0) goto L_0x03a8
            r42 = r36
            goto L_0x03aa
        L_0x03a8:
            r42 = r15
        L_0x03aa:
            if (r17 == 0) goto L_0x03c5
            if (r42 == 0) goto L_0x03b9
            r67 = 33554432(0x2000000, double:1.6578092E-316)
            long r2 = r2 | r67
            r67 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x03c3
        L_0x03b9:
            r67 = 16777216(0x1000000, double:8.289046E-317)
            long r2 = r2 | r67
            r67 = 68719476736(0x1000000000, double:3.39519326554E-313)
        L_0x03c3:
            long r2 = r2 | r67
        L_0x03c5:
            if (r51 == 0) goto L_0x03ce
            java.lang.String r17 = r51.getOperTypeDictionaryKey()
            r8 = r17
            goto L_0x03d0
        L_0x03ce:
            r8 = r19
        L_0x03d0:
            if (r42 == 0) goto L_0x03d5
            r9 = 8
            goto L_0x03d6
        L_0x03d5:
            r9 = r15
        L_0x03d6:
            java.lang.String r8 = r90.C27950a.m86286c(r8, r15)
            r81 = r16
            r15 = r37
            r82 = r38
            r83 = r39
            r84 = r40
            r85 = r41
            r86 = r44
            r87 = r47
            r88 = r48
            r89 = r49
            r90 = r50
            r91 = r52
            r92 = r55
            r93 = r56
            r94 = r57
            r95 = r58
            r96 = r59
            r97 = r60
            r98 = r61
            r99 = r62
            r100 = r63
            r101 = r64
            r102 = r65
            r103 = r66
            goto L_0x0483
        L_0x040c:
            r9 = r15
            r42 = r9
            r81 = r16
            r8 = r19
            r51 = r8
            r85 = r51
            r91 = r85
            r97 = r91
            r103 = r97
            r15 = r37
            r82 = r38
            r83 = r39
            r84 = r40
            r86 = r44
            r87 = r47
            r88 = r48
            r89 = r49
            r90 = r50
            r92 = r55
            r93 = r56
            r94 = r57
            r95 = r58
            r96 = r59
            r98 = r61
            r99 = r62
            r100 = r63
            r101 = r64
            r102 = r65
            goto L_0x0483
        L_0x0444:
            r9 = r15
            r42 = r9
            r43 = r42
            r45 = r43
            r46 = r45
            r81 = r46
            r86 = r81
            r90 = r86
            r8 = r19
            r11 = r8
            r12 = r11
            r14 = r12
            r15 = r14
            r51 = r15
            r82 = r51
            r83 = r82
            r84 = r83
            r85 = r84
            r87 = r85
            r88 = r87
            r89 = r88
            r91 = r89
            r92 = r91
            r93 = r92
            r94 = r93
            r95 = r94
            r96 = r95
            r97 = r96
            r98 = r97
            r99 = r98
            r100 = r99
            r101 = r100
            r102 = r101
            r103 = r102
        L_0x0483:
            r37 = 15
            long r37 = r2 & r37
            int r17 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0656
            long r37 = r2 & r24
            int r17 = (r37 > r4 ? 1 : (r37 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x05cf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r83
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r17 = r4
            r4 = r99
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r39 = r4
            r4 = r95
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r40 = r4
            r4 = r94
            r12.append(r4)
            r12.append(r7)
            java.lang.String r4 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r41 = r4
            r4 = r82
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r44 = r4
            r4 = r101
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r47 = r4
            r4 = r88
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r48 = r4
            r4 = r102
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r49 = r4
            r4 = r93
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r50 = r4
            r4 = r96
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r52 = r4
            r4 = r98
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r55 = r4
            r4 = r92
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r56 = r4
            r4 = r84
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r57 = r4
            r4 = r100
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = r15.toString()
            r15 = r14
            r58 = 13
            r14 = r12
            r12 = r5
            r5 = r4
            r4 = r17
            goto L_0x05ef
        L_0x05cf:
            r4 = r19
            r5 = r4
            r12 = r5
            r14 = r12
            r15 = r14
            r39 = r15
            r40 = r39
            r41 = r40
            r44 = r41
            r47 = r44
            r48 = r47
            r49 = r48
            r50 = r49
            r52 = r50
            r55 = r52
            r56 = r55
            r57 = r56
            r58 = 13
        L_0x05ef:
            long r60 = r2 & r58
            r37 = 0
            int r17 = (r60 > r37 ? 1 : (r60 == r37 ? 0 : -1))
            if (r17 == 0) goto L_0x0630
            r17 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r7 = r5
            r13 = r39
            r5 = r47
            r104 = r48
            r105 = r52
            r106 = r56
            r39 = r10
            r48 = r14
            r47 = r41
            r14 = r55
            r10 = r57
            r41 = r40
            r40 = r15
            r15 = r44
            r44 = r12
            r12 = r49
            r49 = r50
            r108 = r17
            r17 = r4
            r4 = r108
            goto L_0x0677
        L_0x0630:
            r17 = r4
            r7 = r5
            r17 = r19
            r13 = r39
            r5 = r47
            r104 = r48
            r105 = r52
            r106 = r56
            r39 = r10
            r48 = r14
            r47 = r41
            r14 = r55
            r10 = r57
            r41 = r40
            r40 = r15
            r15 = r44
            r44 = r12
            r12 = r49
            r49 = r50
            goto L_0x0677
        L_0x0656:
            r37 = r4
            r39 = r10
            r4 = r19
            r5 = r4
            r7 = r5
            r10 = r7
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r40 = r17
            r41 = r40
            r44 = r41
            r47 = r44
            r48 = r47
            r49 = r48
            r104 = r49
            r105 = r104
            r106 = r105
        L_0x0677:
            long r26 = r2 & r26
            int r26 = (r26 > r37 ? 1 : (r26 == r37 ? 0 : -1))
            if (r26 == 0) goto L_0x0682
            if (r51 != 0) goto L_0x0682
            r26 = r36
            goto L_0x0684
        L_0x0682:
            r26 = 0
        L_0x0684:
            r50 = 8589934592(0x200000000, double:4.243991582E-314)
            long r50 = r2 & r50
            int r27 = (r50 > r37 ? 1 : (r50 == r37 ? 0 : -1))
            if (r27 == 0) goto L_0x06a2
            if (r0 == 0) goto L_0x0698
            java.lang.String r0 = r0.getProductDictionaryKey()
            r16 = r15
            goto L_0x069c
        L_0x0698:
            r16 = r15
            r0 = r19
        L_0x069c:
            r15 = 0
            java.lang.String r0 = r90.C27950a.m86286c(r0, r15)
            goto L_0x06a7
        L_0x06a2:
            r16 = r15
            r15 = 0
            r0 = r19
        L_0x06a7:
            long r50 = r2 & r32
            int r27 = (r50 > r37 ? 1 : (r50 == r37 ? 0 : -1))
            r50 = 524288(0x80000, double:2.590327E-318)
            if (r27 == 0) goto L_0x06d3
            if (r6 == 0) goto L_0x06b7
            ge.bog.mobilebank.model.loans.PLNDetails r6 = r6.getPlnDetails()
            goto L_0x06b9
        L_0x06b7:
            r6 = r19
        L_0x06b9:
            if (r6 == 0) goto L_0x06be
            java.lang.String r15 = r6.fileUrl
            goto L_0x06c0
        L_0x06be:
            r15 = r19
        L_0x06c0:
            if (r15 == 0) goto L_0x06c5
            r15 = r36
            goto L_0x06c6
        L_0x06c5:
            r15 = 0
        L_0x06c6:
            if (r27 == 0) goto L_0x06d6
            if (r15 == 0) goto L_0x06cd
            long r2 = r2 | r50
            goto L_0x06d6
        L_0x06cd:
            r53 = 262144(0x40000, double:1.295163E-318)
            long r2 = r2 | r53
            goto L_0x06d6
        L_0x06d3:
            r6 = r19
            r15 = 0
        L_0x06d6:
            long r53 = r2 & r34
            r37 = 0
            int r27 = (r53 > r37 ? 1 : (r53 == r37 ? 0 : -1))
            if (r27 == 0) goto L_0x06fb
            if (r42 == 0) goto L_0x06e2
            r46 = r36
        L_0x06e2:
            if (r27 == 0) goto L_0x06ed
            if (r46 == 0) goto L_0x06e9
            r53 = 128(0x80, double:6.32E-322)
            goto L_0x06eb
        L_0x06e9:
            r53 = 64
        L_0x06eb:
            long r2 = r2 | r53
        L_0x06ed:
            if (r46 == 0) goto L_0x06f2
            r27 = 8
            goto L_0x06f4
        L_0x06f2:
            r27 = 0
        L_0x06f4:
            r108 = r27
            r27 = r0
            r0 = r108
            goto L_0x06fe
        L_0x06fb:
            r27 = r0
            r0 = 0
        L_0x06fe:
            long r53 = r2 & r34
            r37 = 0
            int r42 = (r53 > r37 ? 1 : (r53 == r37 ? 0 : -1))
            if (r42 == 0) goto L_0x0726
            if (r43 == 0) goto L_0x0709
            goto L_0x070b
        L_0x0709:
            r26 = 0
        L_0x070b:
            if (r42 == 0) goto L_0x0716
            if (r26 == 0) goto L_0x0712
            r42 = 32
            goto L_0x0714
        L_0x0712:
            r42 = 16
        L_0x0714:
            long r2 = r2 | r42
        L_0x0716:
            if (r26 == 0) goto L_0x071b
            r26 = 8
            goto L_0x071d
        L_0x071b:
            r26 = 0
        L_0x071d:
            r22 = 9
            r108 = r26
            r26 = r4
            r4 = r108
            goto L_0x072b
        L_0x0726:
            r26 = r4
            r4 = 0
            r22 = 9
        L_0x072b:
            long r42 = r2 & r22
            r37 = 0
            int r42 = (r42 > r37 ? 1 : (r42 == r37 ? 0 : -1))
            if (r42 == 0) goto L_0x073a
            if (r20 == 0) goto L_0x0737
            r21 = r27
        L_0x0737:
            r107 = r21
            goto L_0x073c
        L_0x073a:
            r107 = r19
        L_0x073c:
            long r20 = r2 & r50
            int r20 = (r20 > r37 ? 1 : (r20 == r37 ? 0 : -1))
            if (r20 == 0) goto L_0x074d
            if (r6 == 0) goto L_0x0748
            java.lang.String r6 = r6.fileId
            r19 = r6
        L_0x0748:
            if (r19 == 0) goto L_0x074d
            r6 = r36
            goto L_0x074e
        L_0x074d:
            r6 = 0
        L_0x074e:
            long r19 = r2 & r32
            r32 = 0
            int r19 = (r19 > r32 ? 1 : (r19 == r32 ? 0 : -1))
            if (r19 == 0) goto L_0x0759
            if (r15 == 0) goto L_0x0759
            goto L_0x075a
        L_0x0759:
            r6 = 0
        L_0x075a:
            long r19 = r2 & r34
            int r15 = (r19 > r32 ? 1 : (r19 == r32 ? 0 : -1))
            if (r15 == 0) goto L_0x0778
            if (r45 == 0) goto L_0x0763
            goto L_0x0765
        L_0x0763:
            r36 = r6
        L_0x0765:
            if (r15 == 0) goto L_0x0772
            if (r36 == 0) goto L_0x076d
            r19 = 131072(0x20000, double:6.47582E-319)
            goto L_0x0770
        L_0x076d:
            r19 = 65536(0x10000, double:3.2379E-319)
        L_0x0770:
            long r2 = r2 | r19
        L_0x0772:
            if (r36 == 0) goto L_0x0775
            goto L_0x0778
        L_0x0775:
            r15 = 8
            goto L_0x0779
        L_0x0778:
            r15 = 0
        L_0x0779:
            long r18 = r2 & r34
            r20 = 0
            int r6 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r6 == 0) goto L_0x07f0
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69832B
            r18 = r7
            r7 = r87
            p018b0.C2108a.m8160b(r6, r7)
            android.widget.LinearLayout r6 = r1.f69921M
            r7 = r90
            r6.setVisibility(r7)
            android.widget.LinearLayout r6 = r1.f69922N
            r6.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69923O
            r7 = r103
            p018b0.C2108a.m8160b(r6, r7)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r6 = r1.f69925Q
            r6.setVisibility(r9)
            android.widget.LinearLayout r6 = r1.f69926R
            r6.setVisibility(r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69927S
            r7 = r97
            p018b0.C2108a.m8160b(r6, r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69928T
            r7 = r91
            p018b0.C2108a.m8160b(r6, r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69932X
            r7 = r89
            p018b0.C2108a.m8160b(r6, r7)
            android.view.View r6 = r1.f69935a0
            r7 = r81
            r6.setVisibility(r7)
            android.widget.LinearLayout r6 = r1.f69936b0
            r6.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = r1.f69939e0
            p018b0.C2108a.m8160b(r6, r8)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r6 = r1.f69940f0
            r6.setVisibility(r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69944j0
            r6 = r85
            p018b0.C2108a.m8160b(r4, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69952r0
            p018b0.C2108a.m8160b(r4, r11)
            android.widget.LinearLayout r4 = r1.f69956v0
            r6 = r86
            r4.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r4 = r1.f69918B0
            r4.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f69838H
            r0.setVisibility(r15)
            goto L_0x07f2
        L_0x07f0:
            r18 = r7
        L_0x07f2:
            long r6 = r2 & r24
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0867
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69924P
            p018b0.C2108a.m8160b(r0, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69930V
            p018b0.C2108a.m8160b(r0, r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69931W
            p018b0.C2108a.m8160b(r0, r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69933Y
            p018b0.C2108a.m8160b(r0, r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69934Z
            p018b0.C2108a.m8160b(r0, r13)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69937c0
            r5 = r18
            p018b0.C2108a.m8160b(r0, r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69943i0
            r4 = r26
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69945k0
            r4 = r16
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69947m0
            r4 = r49
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69949o0
            r14 = r48
            p018b0.C2108a.m8160b(r0, r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69951q0
            r4 = r106
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69953s0
            r4 = r47
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69955u0
            r12 = r44
            p018b0.C2108a.m8160b(r0, r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69957w0
            r4 = r104
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69958x0
            r4 = r41
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69959y0
            r4 = r105
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69917A0
            r15 = r40
            p018b0.C2108a.m8160b(r0, r15)
        L_0x0867:
            r4 = 9
            long r4 = r4 & r2
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x08a4
            android.widget.LinearLayout r0 = r1.f69929U
            r15 = r28
            r0.setVisibility(r15)
            android.widget.LinearLayout r0 = r1.f69938d0
            r15 = r30
            r0.setVisibility(r15)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69941g0
            r4 = r107
            p018b0.C2108a.m8160b(r0, r4)
            android.widget.LinearLayout r0 = r1.f69946l0
            r15 = r29
            r0.setVisibility(r15)
            android.widget.LinearLayout r0 = r1.f69948n0
            r15 = r31
            r0.setVisibility(r15)
            android.widget.LinearLayout r0 = r1.f69950p0
            r0.setVisibility(r15)
            android.widget.LinearLayout r0 = r1.f69954t0
            r15 = r39
            r0.setVisibility(r15)
            android.widget.LinearLayout r0 = r1.f69960z0
            r0.setVisibility(r15)
        L_0x08a4:
            r4 = 13
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x08b4
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69942h0
            r4 = r17
            p018b0.C2108a.m8160b(r0, r4)
        L_0x08b4:
            return
        L_0x08b5:
            r0 = move-exception
            monitor-exit(r109)     // Catch:{ all -> 0x08b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27437u3.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f69919C0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C27437u3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[52], objArr[50], objArr[51], objArr[39], objArr[47], objArr[46], objArr[49], objArr[45], objArr[48], objArr[44]);
        this.f69919C0 = -1;
        this.f69832B.setTag((Object) null);
        NestedScrollView nestedScrollView = objArr[0];
        this.f69920L = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        LinearLayout linearLayout = objArr[1];
        this.f69921M = linearLayout;
        linearLayout.setTag((Object) null);
        LinearLayout linearLayout2 = objArr[10];
        this.f69922N = linearLayout2;
        linearLayout2.setTag((Object) null);
        BogTextView bogTextView = objArr[11];
        this.f69923O = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[12];
        this.f69924P = bogTextView2;
        bogTextView2.setTag((Object) null);
        BigDividerView bigDividerView = objArr[13];
        this.f69925Q = bigDividerView;
        bigDividerView.setTag((Object) null);
        LinearLayout linearLayout3 = objArr[14];
        this.f69926R = linearLayout3;
        linearLayout3.setTag((Object) null);
        BogTextView bogTextView3 = objArr[15];
        this.f69927S = bogTextView3;
        bogTextView3.setTag((Object) null);
        BogTextView bogTextView4 = objArr[16];
        this.f69928T = bogTextView4;
        bogTextView4.setTag((Object) null);
        LinearLayout linearLayout4 = objArr[17];
        this.f69929U = linearLayout4;
        linearLayout4.setTag((Object) null);
        BogTextView bogTextView5 = objArr[18];
        this.f69930V = bogTextView5;
        bogTextView5.setTag((Object) null);
        BogTextView bogTextView6 = objArr[19];
        this.f69931W = bogTextView6;
        bogTextView6.setTag((Object) null);
        BogTextView bogTextView7 = objArr[2];
        this.f69932X = bogTextView7;
        bogTextView7.setTag((Object) null);
        BogTextView bogTextView8 = objArr[20];
        this.f69933Y = bogTextView8;
        bogTextView8.setTag((Object) null);
        BogTextView bogTextView9 = objArr[21];
        this.f69934Z = bogTextView9;
        bogTextView9.setTag((Object) null);
        View view2 = objArr[22];
        this.f69935a0 = view2;
        view2.setTag((Object) null);
        LinearLayout linearLayout5 = objArr[23];
        this.f69936b0 = linearLayout5;
        linearLayout5.setTag((Object) null);
        BogTextView bogTextView10 = objArr[24];
        this.f69937c0 = bogTextView10;
        bogTextView10.setTag((Object) null);
        LinearLayout linearLayout6 = objArr[25];
        this.f69938d0 = linearLayout6;
        linearLayout6.setTag((Object) null);
        BogTextView bogTextView11 = objArr[26];
        this.f69939e0 = bogTextView11;
        bogTextView11.setTag((Object) null);
        BigDividerView bigDividerView2 = objArr[27];
        this.f69940f0 = bigDividerView2;
        bigDividerView2.setTag((Object) null);
        BogTextView bogTextView12 = objArr[28];
        this.f69941g0 = bogTextView12;
        bogTextView12.setTag((Object) null);
        BogTextView bogTextView13 = objArr[29];
        this.f69942h0 = bogTextView13;
        bogTextView13.setTag((Object) null);
        BogTextView bogTextView14 = objArr[3];
        this.f69943i0 = bogTextView14;
        bogTextView14.setTag((Object) null);
        BogTextView bogTextView15 = objArr[30];
        this.f69944j0 = bogTextView15;
        bogTextView15.setTag((Object) null);
        BogTextView bogTextView16 = objArr[31];
        this.f69945k0 = bogTextView16;
        bogTextView16.setTag((Object) null);
        LinearLayout linearLayout7 = objArr[32];
        this.f69946l0 = linearLayout7;
        linearLayout7.setTag((Object) null);
        BogTextView bogTextView17 = objArr[33];
        this.f69947m0 = bogTextView17;
        bogTextView17.setTag((Object) null);
        LinearLayout linearLayout8 = objArr[34];
        this.f69948n0 = linearLayout8;
        linearLayout8.setTag((Object) null);
        BogTextView bogTextView18 = objArr[35];
        this.f69949o0 = bogTextView18;
        bogTextView18.setTag((Object) null);
        LinearLayout linearLayout9 = objArr[36];
        this.f69950p0 = linearLayout9;
        linearLayout9.setTag((Object) null);
        BogTextView bogTextView19 = objArr[37];
        this.f69951q0 = bogTextView19;
        bogTextView19.setTag((Object) null);
        BogTextView bogTextView20 = objArr[38];
        this.f69952r0 = bogTextView20;
        bogTextView20.setTag((Object) null);
        BogTextView bogTextView21 = objArr[4];
        this.f69953s0 = bogTextView21;
        bogTextView21.setTag((Object) null);
        LinearLayout linearLayout10 = objArr[40];
        this.f69954t0 = linearLayout10;
        linearLayout10.setTag((Object) null);
        BogTextView bogTextView22 = objArr[41];
        this.f69955u0 = bogTextView22;
        bogTextView22.setTag((Object) null);
        LinearLayout linearLayout11 = objArr[42];
        this.f69956v0 = linearLayout11;
        linearLayout11.setTag((Object) null);
        BogTextView bogTextView23 = objArr[43];
        this.f69957w0 = bogTextView23;
        bogTextView23.setTag((Object) null);
        BogTextView bogTextView24 = objArr[5];
        this.f69958x0 = bogTextView24;
        bogTextView24.setTag((Object) null);
        BogTextView bogTextView25 = objArr[6];
        this.f69959y0 = bogTextView25;
        bogTextView25.setTag((Object) null);
        LinearLayout linearLayout12 = objArr[7];
        this.f69960z0 = linearLayout12;
        linearLayout12.setTag((Object) null);
        BogTextView bogTextView26 = objArr[8];
        this.f69917A0 = bogTextView26;
        bogTextView26.setTag((Object) null);
        BigDividerView bigDividerView3 = objArr[9];
        this.f69918B0 = bigDividerView3;
        bigDividerView3.setTag((Object) null);
        this.f69838H.setTag((Object) null);
        mo3945A(view);
        mo66739G();
    }
}
