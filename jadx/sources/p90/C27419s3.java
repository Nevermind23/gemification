package p90;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositDetails;
import p341ge.bog.mobilebank.model.deposits.DepositMaximaWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;

/* renamed from: p90.s3 */
public class C27419s3 extends C27410r3 {

    /* renamed from: k0 */
    private static final SparseIntArray f69765k0;

    /* renamed from: L */
    private final NestedScrollView f69766L;

    /* renamed from: M */
    private final BogTextView f69767M;

    /* renamed from: N */
    private final BogTextView f69768N;

    /* renamed from: O */
    private final LinearLayout f69769O;

    /* renamed from: P */
    private final BogTextView f69770P;

    /* renamed from: Q */
    private final LinearLayout f69771Q;

    /* renamed from: R */
    private final BogTextView f69772R;

    /* renamed from: S */
    private final BogTextView f69773S;

    /* renamed from: T */
    private final LinearLayout f69774T;

    /* renamed from: U */
    private final BogTextView f69775U;

    /* renamed from: V */
    private final LinearLayout f69776V;

    /* renamed from: W */
    private final BogTextView f69777W;

    /* renamed from: X */
    private final BogTextView f69778X;

    /* renamed from: Y */
    private final LinearLayout f69779Y;

    /* renamed from: Z */
    private final BogTextView f69780Z;

    /* renamed from: a0 */
    private final LinearLayout f69781a0;

    /* renamed from: b0 */
    private final BogTextView f69782b0;

    /* renamed from: c0 */
    private final BogTextView f69783c0;

    /* renamed from: d0 */
    private final LinearLayout f69784d0;

    /* renamed from: e0 */
    private final BogTextView f69785e0;

    /* renamed from: f0 */
    private final BogTextView f69786f0;

    /* renamed from: g0 */
    private final BogTextView f69787g0;

    /* renamed from: h0 */
    private final BogTextView f69788h0;

    /* renamed from: i0 */
    private final LinearLayout f69789i0;

    /* renamed from: j0 */
    private long f69790j0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69765k0 = sparseIntArray;
        sparseIntArray.put(C10322k.details_rename_button, 25);
        sparseIntArray.put(C10322k.bogTextView2, 26);
        sparseIntArray.put(C10322k.deposit_details_end_date_layout, 27);
        sparseIntArray.put(C10322k.agreementDivider, 28);
        sparseIntArray.put(C10322k.maxima_details_list_container, 29);
        sparseIntArray.put(C10322k.maxima_details_list_layout, 30);
        sparseIntArray.put(C10322k.deposit_details_piggy_container, 31);
        sparseIntArray.put(C10322k.deposit_details_piggy_layout, 32);
    }

    public C27419s3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 33, (ViewDataBinding.C1353i) null, f69765k0));
    }

    /* renamed from: D */
    public void mo66707D(String str) {
        this.f69680K = str;
        synchronized (this) {
            this.f69790j0 |= 2;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66708E(Deposit deposit) {
        this.f69677H = deposit;
        synchronized (this) {
            this.f69790j0 |= 8;
        }
        mo3956a(C10312a.f28600f);
        super.mo3950x();
    }

    /* renamed from: F */
    public void mo66709F(DepositDetails depositDetails) {
        this.f69678I = depositDetails;
        synchronized (this) {
            this.f69790j0 |= 4;
        }
        mo3956a(C10312a.f28601g);
        super.mo3950x();
    }

    /* renamed from: G */
    public void mo66710G(DepositMaximaWrapper depositMaximaWrapper) {
        this.f69679J = depositMaximaWrapper;
        synchronized (this) {
            this.f69790j0 |= 1;
        }
        mo3956a(C10312a.f28603i);
        super.mo3950x();
    }

    /* renamed from: H */
    public void mo66719H() {
        synchronized (this) {
            this.f69790j0 = 16;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r67 = this;
            r1 = r67
            monitor-enter(r67)
            long r2 = r1.f69790j0     // Catch:{ all -> 0x0524 }
            r4 = 0
            r1.f69790j0 = r4     // Catch:{ all -> 0x0524 }
            monitor-exit(r67)     // Catch:{ all -> 0x0524 }
            ge.bog.mobilebank.model.deposits.DepositMaximaWrapper r0 = r1.f69679J
            java.lang.String r6 = r1.f69680K
            ge.bog.mobilebank.model.deposits.DepositDetails r7 = r1.f69678I
            ge.bog.mobilebank.model.deposits.Deposit r8 = r1.f69677H
            r9 = 21
            long r11 = r2 & r9
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r12 = 4096(0x1000, double:2.0237E-320)
            r16 = 17
            r18 = 8
            r19 = 1
            if (r11 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0027
            r11 = r19
            goto L_0x0028
        L_0x0027:
            r11 = 0
        L_0x0028:
            long r22 = r2 & r16
            int r15 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0037
            if (r11 == 0) goto L_0x0033
            r22 = 1024(0x400, double:5.06E-321)
            goto L_0x0035
        L_0x0033:
            r22 = 512(0x200, double:2.53E-321)
        L_0x0035:
            long r2 = r2 | r22
        L_0x0037:
            long r22 = r2 & r9
            int r15 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0045
            if (r11 == 0) goto L_0x0041
            long r2 = r2 | r12
            goto L_0x0045
        L_0x0041:
            r20 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r20
        L_0x0045:
            long r22 = r2 & r16
            int r15 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0052
            if (r11 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r15 = r18
            goto L_0x0053
        L_0x0051:
            r11 = 0
        L_0x0052:
            r15 = 0
        L_0x0053:
            r22 = 30
            long r22 = r2 & r22
            int r22 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            r23 = 16777216(0x1000000, double:8.289046E-317)
            r25 = 524288(0x80000, double:2.590327E-318)
            r27 = 26
            r29 = 0
            r31 = 28
            r33 = 24
            r35 = 0
            if (r22 == 0) goto L_0x0286
            long r36 = r2 & r27
            int r22 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x00dc
            if (r8 == 0) goto L_0x008c
            java.lang.String r22 = r8.getTotalBalance()
            java.lang.String r36 = r8.getIntAccrued()
            java.math.BigDecimal r37 = r8.getMinAccrualBalance()
            java.lang.String r38 = r8.getBalance()
            r9 = r22
            r10 = r36
            r22 = r37
            r12 = r38
            goto L_0x0092
        L_0x008c:
            r9 = r35
            r10 = r9
            r12 = r10
            r22 = r12
        L_0x0092:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r6)
            java.lang.String r9 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r6)
            java.lang.String r10 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r6)
            java.lang.String r12 = r13.toString()
            if (r22 == 0) goto L_0x00c6
            double r40 = r22.doubleValue()
            goto L_0x00c8
        L_0x00c6:
            r40 = r29
        L_0x00c8:
            java.lang.String r13 = g91.C32303f.m95204o(r40)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r6)
            java.lang.String r13 = r14.toString()
            goto L_0x00e1
        L_0x00dc:
            r9 = r35
            r10 = r9
            r12 = r10
            r13 = r12
        L_0x00e1:
            long r40 = r2 & r33
            int r14 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x01d6
            if (r8 == 0) goto L_0x0118
            java.lang.String r40 = r8.getProdType()
            boolean r41 = r8.purposeEmpty()
            java.lang.String r42 = r8.getDepositTitle()
            java.lang.String r43 = r8.getStartDate()
            java.lang.String r44 = r8.getMaturityDate()
            java.lang.String r45 = r8.getInterestRate()
            boolean r46 = r8.showWithdrawalDate()
            long r47 = r8.getNextWithdrawalDate()
            java.lang.String r49 = r8.getDepositPdfUrl()
            java.lang.String r50 = r8.getDictionaryKey()
            r51 = r40
            r52 = r45
            r53 = r50
            goto L_0x012c
        L_0x0118:
            r47 = r4
            r42 = r35
            r43 = r42
            r44 = r43
            r49 = r44
            r51 = r49
            r52 = r51
            r53 = r52
            r41 = 0
            r46 = 0
        L_0x012c:
            if (r14 == 0) goto L_0x0139
            if (r41 == 0) goto L_0x0134
            r54 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x0137
        L_0x0134:
            r54 = 2097152(0x200000, double:1.0361308E-317)
        L_0x0137:
            long r2 = r2 | r54
        L_0x0139:
            long r54 = r2 & r33
            int r14 = (r54 > r4 ? 1 : (r54 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x014a
            if (r46 == 0) goto L_0x0145
            r54 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x0148
        L_0x0145:
            r54 = 536870912(0x20000000, double:2.652494739E-315)
        L_0x0148:
            long r2 = r2 | r54
        L_0x014a:
            java.lang.String r14 = "PREMIUM"
            r4 = r51
            boolean r4 = r14.equals(r4)
            if (r41 == 0) goto L_0x0157
            r5 = r18
            goto L_0x0158
        L_0x0157:
            r5 = 0
        L_0x0158:
            r40 = r5
            if (r44 != 0) goto L_0x015f
            r14 = r19
            goto L_0x0160
        L_0x015f:
            r14 = 0
        L_0x0160:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r41 = r9
            r9 = r52
            r5.append(r9)
            java.lang.String r9 = " %"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            if (r46 == 0) goto L_0x0179
            r9 = 0
            goto L_0x017b
        L_0x0179:
            r9 = r18
        L_0x017b:
            java.lang.String r45 = g91.C32319m.m95314u(r47)
            r46 = r5
            r47 = r9
            if (r49 == 0) goto L_0x018b
            r22 = r19
            r5 = r53
            r9 = 0
            goto L_0x0190
        L_0x018b:
            r5 = r53
            r9 = 0
            r22 = 0
        L_0x0190:
            java.lang.String r5 = r90.C27950a.m86286c(r5, r9)
            long r48 = r2 & r33
            r50 = 0
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x01a7
            if (r4 == 0) goto L_0x01a2
            r48 = 65536(0x10000, double:3.2379E-319)
            goto L_0x01a5
        L_0x01a2:
            r48 = 32768(0x8000, double:1.61895E-319)
        L_0x01a5:
            long r2 = r2 | r48
        L_0x01a7:
            long r48 = r2 & r33
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x01b7
            if (r14 == 0) goto L_0x01b5
            r48 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 | r48
            goto L_0x01b7
        L_0x01b5:
            long r2 = r2 | r25
        L_0x01b7:
            long r48 = r2 & r33
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x01c8
            if (r22 == 0) goto L_0x01c3
            r48 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x01c6
        L_0x01c3:
            r48 = 134217728(0x8000000, double:6.63123685E-316)
        L_0x01c6:
            long r2 = r2 | r48
        L_0x01c8:
            if (r4 == 0) goto L_0x01cc
            r4 = r9
            goto L_0x01ce
        L_0x01cc:
            r4 = r18
        L_0x01ce:
            if (r22 == 0) goto L_0x01d3
            r22 = r9
            goto L_0x01ed
        L_0x01d3:
            r22 = r18
            goto L_0x01ed
        L_0x01d6:
            r41 = r9
            r9 = 0
            r4 = r9
            r14 = r4
            r22 = r14
            r40 = r22
            r47 = r40
            r5 = r35
            r42 = r5
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
        L_0x01ed:
            long r48 = r2 & r31
            r50 = 0
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x0267
            if (r8 == 0) goto L_0x01fc
            boolean r8 = r8.isMaxima()
            goto L_0x01fd
        L_0x01fc:
            r8 = r9
        L_0x01fd:
            r8 = r8 ^ 1
            long r48 = r2 & r33
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x0210
            if (r8 == 0) goto L_0x020b
            r48 = 262144(0x40000, double:1.295163E-318)
            goto L_0x020e
        L_0x020b:
            r48 = 131072(0x20000, double:6.47582E-319)
        L_0x020e:
            long r2 = r2 | r48
        L_0x0210:
            long r48 = r2 & r31
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x0220
            if (r8 == 0) goto L_0x021b
            long r2 = r2 | r23
            goto L_0x0220
        L_0x021b:
            r48 = 8388608(0x800000, double:4.144523E-317)
            long r2 = r2 | r48
        L_0x0220:
            long r48 = r2 & r33
            int r48 = (r48 > r50 ? 1 : (r48 == r50 ? 0 : -1))
            if (r48 == 0) goto L_0x024f
            if (r8 == 0) goto L_0x022b
            r48 = r9
            goto L_0x022d
        L_0x022b:
            r48 = r18
        L_0x022d:
            r9 = r47
            r47 = r22
            r22 = r14
            r14 = r40
            r65 = r45
            r45 = r10
            r10 = r42
            r42 = r41
            r41 = r13
            r13 = r48
            r48 = r43
            r43 = r12
            r12 = r65
            r66 = r46
            r46 = r15
            r15 = r66
            goto L_0x02a4
        L_0x024f:
            r48 = r43
            r43 = r12
            r12 = r45
            r45 = r10
            r10 = r42
            r42 = r41
            r41 = r13
            r13 = r9
            r9 = r47
            r47 = r22
            r22 = r14
            r14 = r40
            goto L_0x027f
        L_0x0267:
            r8 = r9
            r48 = r43
            r43 = r12
            r12 = r45
            r9 = r47
            r45 = r10
            r47 = r22
            r10 = r42
            r22 = r14
            r14 = r40
            r42 = r41
            r41 = r13
            r13 = r8
        L_0x027f:
            r65 = r46
            r46 = r15
            r15 = r65
            goto L_0x02a4
        L_0x0286:
            r50 = r4
            r9 = 0
            r4 = r9
            r8 = r4
            r13 = r8
            r14 = r13
            r22 = r14
            r47 = r22
            r46 = r15
            r5 = r35
            r10 = r5
            r12 = r10
            r15 = r12
            r41 = r15
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r48 = r45
        L_0x02a4:
            r52 = 22
            long r54 = r2 & r52
            int r49 = (r54 > r50 ? 1 : (r54 == r50 ? 0 : -1))
            r56 = 8192(0x2000, double:4.0474E-320)
            r58 = 67108864(0x4000000, double:3.31561842E-316)
            r60 = 20
            if (r49 == 0) goto L_0x0325
            long r54 = r2 & r60
            int r49 = (r54 > r50 ? 1 : (r54 == r50 ? 0 : -1))
            if (r49 == 0) goto L_0x02f2
            if (r7 == 0) goto L_0x02c0
            java.lang.String r50 = r7.getPurposeDictionaryKey()
            goto L_0x02c2
        L_0x02c0:
            r50 = r35
        L_0x02c2:
            if (r7 == 0) goto L_0x02c7
            r51 = r19
            goto L_0x02c9
        L_0x02c7:
            r51 = 0
        L_0x02c9:
            if (r7 != 0) goto L_0x02ce
            r62 = r19
            goto L_0x02d0
        L_0x02ce:
            r62 = 0
        L_0x02d0:
            if (r49 == 0) goto L_0x02dc
            if (r51 == 0) goto L_0x02d7
            long r2 = r2 | r58
            goto L_0x02dc
        L_0x02d7:
            r63 = 33554432(0x2000000, double:1.6578092E-316)
            long r2 = r2 | r63
        L_0x02dc:
            long r63 = r2 & r60
            r54 = 0
            int r49 = (r63 > r54 ? 1 : (r63 == r54 ? 0 : -1))
            if (r49 == 0) goto L_0x02ed
            if (r62 == 0) goto L_0x02eb
            r63 = 16384(0x4000, double:8.0948E-320)
            long r2 = r2 | r63
            goto L_0x02ed
        L_0x02eb:
            long r2 = r2 | r56
        L_0x02ed:
            java.lang.String r49 = r90.C27950a.m86284a(r50)
            goto L_0x02f8
        L_0x02f2:
            r49 = r35
            r51 = 0
            r62 = 0
        L_0x02f8:
            if (r7 == 0) goto L_0x02ff
            java.math.BigDecimal r50 = r7.getCasAmount()
            goto L_0x0301
        L_0x02ff:
            r50 = r35
        L_0x0301:
            if (r50 == 0) goto L_0x0307
            double r29 = r50.doubleValue()
        L_0x0307:
            r63 = r2
            java.lang.String r2 = g91.C32303f.m95204o(r29)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r20 = r2
            r6 = r49
            r2 = r63
            r29 = 2048(0x800, double:1.0118E-320)
            goto L_0x032f
        L_0x0325:
            r6 = r35
            r20 = r6
            r29 = 2048(0x800, double:1.0118E-320)
            r51 = 0
            r62 = 0
        L_0x032f:
            long r29 = r2 & r29
            r49 = 0
            int r21 = (r29 > r49 ? 1 : (r29 == r49 ? 0 : -1))
            if (r21 == 0) goto L_0x033e
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = r0.getAgreeNo()
            goto L_0x0340
        L_0x033e:
            r0 = r35
        L_0x0340:
            long r25 = r2 & r25
            int r21 = (r25 > r49 ? 1 : (r25 == r49 ? 0 : -1))
            if (r21 == 0) goto L_0x0354
            if (r44 == 0) goto L_0x034d
            int r21 = r44.length()
            goto L_0x034f
        L_0x034d:
            r21 = 0
        L_0x034f:
            if (r21 != 0) goto L_0x0354
            r21 = r19
            goto L_0x0356
        L_0x0354:
            r21 = 0
        L_0x0356:
            r25 = 83898368(0x5003000, double:4.14513014E-316)
            long r25 = r2 & r25
            r29 = 0
            int r25 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            if (r25 == 0) goto L_0x03c6
            long r23 = r2 & r23
            int r23 = (r23 > r29 ? 1 : (r23 == r29 ? 0 : -1))
            if (r23 == 0) goto L_0x0383
            if (r7 == 0) goto L_0x0374
            java.lang.String r23 = r7.getShowCasAmount()
            r65 = r23
            r23 = r0
            r0 = r65
            goto L_0x0378
        L_0x0374:
            r23 = r0
            r0 = r35
        L_0x0378:
            r24 = r6
            if (r0 == 0) goto L_0x0387
            java.lang.String r6 = "Y"
            boolean r0 = r0.equals(r6)
            goto L_0x0388
        L_0x0383:
            r23 = r0
            r24 = r6
        L_0x0387:
            r0 = 0
        L_0x0388:
            r25 = 4096(0x1000, double:2.0237E-320)
            long r25 = r2 & r25
            r29 = 0
            int r6 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            if (r6 == 0) goto L_0x0399
            if (r7 == 0) goto L_0x0399
            java.lang.String r6 = r7.getAgreeNo()
            goto L_0x039b
        L_0x0399:
            r6 = r35
        L_0x039b:
            r25 = 67117056(0x4002000, double:3.31602316E-316)
            long r25 = r2 & r25
            int r25 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            if (r25 == 0) goto L_0x03c3
            if (r7 == 0) goto L_0x03a9
            java.lang.String r7 = r7.periodTypeNameDctKey
            goto L_0x03ab
        L_0x03a9:
            r7 = r35
        L_0x03ab:
            long r25 = r2 & r58
            int r25 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            if (r25 == 0) goto L_0x03b6
            java.lang.String r25 = r90.C27950a.m86284a(r7)
            goto L_0x03b8
        L_0x03b6:
            r25 = r35
        L_0x03b8:
            long r38 = r2 & r56
            int r26 = (r38 > r29 ? 1 : (r38 == r29 ? 0 : -1))
            if (r26 == 0) goto L_0x03cf
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            goto L_0x03d0
        L_0x03c3:
            r25 = r35
            goto L_0x03cf
        L_0x03c6:
            r23 = r0
            r24 = r6
            r6 = r35
            r25 = r6
            r0 = 0
        L_0x03cf:
            r7 = 0
        L_0x03d0:
            r36 = 21
            long r38 = r2 & r36
            int r26 = (r38 > r29 ? 1 : (r38 == r29 ? 0 : -1))
            if (r26 == 0) goto L_0x03de
            if (r11 == 0) goto L_0x03db
            goto L_0x03e0
        L_0x03db:
            r6 = r23
            goto L_0x03e0
        L_0x03de:
            r6 = r35
        L_0x03e0:
            long r38 = r2 & r60
            int r11 = (r38 > r29 ? 1 : (r38 == r29 ? 0 : -1))
            if (r11 == 0) goto L_0x0409
            if (r62 == 0) goto L_0x03ea
            r7 = r19
        L_0x03ea:
            if (r51 == 0) goto L_0x03ed
            goto L_0x03ef
        L_0x03ed:
            r25 = r35
        L_0x03ef:
            if (r11 == 0) goto L_0x0400
            if (r7 == 0) goto L_0x03f9
            r29 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x03fe
        L_0x03f9:
            r29 = 2147483648(0x80000000, double:1.0609978955E-314)
        L_0x03fe:
            long r2 = r2 | r29
        L_0x0400:
            if (r7 == 0) goto L_0x0405
            r7 = r18
            goto L_0x0406
        L_0x0405:
            r7 = 0
        L_0x0406:
            r11 = r25
            goto L_0x040c
        L_0x0409:
            r11 = r35
            r7 = 0
        L_0x040c:
            long r25 = r2 & r33
            r29 = 0
            int r23 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            if (r23 == 0) goto L_0x0425
            if (r22 == 0) goto L_0x0417
            goto L_0x0419
        L_0x0417:
            r19 = r21
        L_0x0419:
            if (r23 == 0) goto L_0x0427
            if (r19 == 0) goto L_0x0420
            r21 = 64
            goto L_0x0422
        L_0x0420:
            r21 = 32
        L_0x0422:
            long r2 = r2 | r21
            goto L_0x0427
        L_0x0425:
            r19 = 0
        L_0x0427:
            long r21 = r2 & r31
            r25 = 0
            int r21 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r21 == 0) goto L_0x0445
            if (r8 == 0) goto L_0x0432
            goto L_0x0433
        L_0x0432:
            r0 = 0
        L_0x0433:
            if (r21 == 0) goto L_0x043e
            if (r0 == 0) goto L_0x043a
            r21 = 256(0x100, double:1.265E-321)
            goto L_0x043c
        L_0x043a:
            r21 = 128(0x80, double:6.32E-322)
        L_0x043c:
            long r2 = r2 | r21
        L_0x043e:
            if (r0 == 0) goto L_0x0442
            r18 = 0
        L_0x0442:
            r0 = r18
            goto L_0x0446
        L_0x0445:
            r0 = 0
        L_0x0446:
            long r21 = r2 & r33
            r25 = 0
            int r8 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r8 == 0) goto L_0x045b
            if (r19 == 0) goto L_0x0459
            java.lang.String r18 = "text.deposits.details.end.date.termless"
            java.lang.String r18 = r90.C27950a.m86284a(r18)
            r35 = r18
            goto L_0x045b
        L_0x0459:
            r35 = r44
        L_0x045b:
            r18 = r6
            r6 = r35
            if (r8 == 0) goto L_0x049c
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = r1.f69767M
            p018b0.C2108a.m8160b(r8, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = r1.f69768N
            p018b0.C2108a.m8160b(r8, r15)
            android.widget.LinearLayout r8 = r1.f69776V
            r8.setVisibility(r13)
            android.widget.LinearLayout r8 = r1.f69779Y
            r8.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = r1.f69780Z
            p018b0.C2108a.m8160b(r8, r12)
            android.widget.LinearLayout r8 = r1.f69781a0
            r8.setVisibility(r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69783c0
            p018b0.C2108a.m8160b(r4, r5)
            android.widget.LinearLayout r4 = r1.f69784d0
            r4.setVisibility(r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69786f0
            r5 = r48
            p018b0.C2108a.m8160b(r4, r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69788h0
            p018b0.C2108a.m8160b(r4, r6)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r1.f69676G
            r9 = r47
            r4.setVisibility(r9)
        L_0x049c:
            long r4 = r2 & r60
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x04b5
            android.widget.LinearLayout r4 = r1.f69769O
            r4.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69770P
            p018b0.C2108a.m8160b(r4, r11)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69785e0
            r5 = r24
            p018b0.C2108a.m8160b(r4, r5)
        L_0x04b5:
            long r4 = r2 & r16
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x04c7
            android.widget.LinearLayout r4 = r1.f69771Q
            r14 = r46
            r4.setVisibility(r14)
            android.widget.LinearLayout r4 = r1.f69789i0
            r4.setVisibility(r14)
        L_0x04c7:
            long r4 = r2 & r27
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x04e9
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69772R
            r10 = r45
            p018b0.C2108a.m8160b(r4, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69773S
            r12 = r43
            p018b0.C2108a.m8160b(r4, r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69777W
            r5 = r42
            p018b0.C2108a.m8160b(r4, r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r1.f69782b0
            r13 = r41
            p018b0.C2108a.m8160b(r4, r13)
        L_0x04e9:
            long r4 = r2 & r31
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x04f6
            android.widget.LinearLayout r4 = r1.f69774T
            r4.setVisibility(r0)
        L_0x04f6:
            long r4 = r2 & r52
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0503
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69775U
            r4 = r20
            p018b0.C2108a.m8160b(r0, r4)
        L_0x0503:
            r4 = 21
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0511
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69778X
            r4 = r18
            p018b0.C2108a.m8160b(r0, r4)
        L_0x0511:
            r4 = 16
            long r2 = r2 & r4
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0523
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69787g0
            java.lang.String r2 = "text.deposits.details.end.date"
            java.lang.String r2 = r90.C27950a.m86284a(r2)
            p018b0.C2108a.m8160b(r0, r2)
        L_0x0523:
            return
        L_0x0524:
            r0 = move-exception
            monitor-exit(r67)     // Catch:{ all -> 0x0524 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27419s3.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f69790j0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C27419s3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[28], objArr[26], objArr[27], objArr[31], objArr[32], objArr[25], objArr[29], objArr[30], objArr[24]);
        this.f69790j0 = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.f69766L = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        BogTextView bogTextView = objArr[1];
        this.f69767M = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[10];
        this.f69768N = bogTextView2;
        bogTextView2.setTag((Object) null);
        LinearLayout linearLayout = objArr[11];
        this.f69769O = linearLayout;
        linearLayout.setTag((Object) null);
        BogTextView bogTextView3 = objArr[12];
        this.f69770P = bogTextView3;
        bogTextView3.setTag((Object) null);
        LinearLayout linearLayout2 = objArr[13];
        this.f69771Q = linearLayout2;
        linearLayout2.setTag((Object) null);
        BogTextView bogTextView4 = objArr[14];
        this.f69772R = bogTextView4;
        bogTextView4.setTag((Object) null);
        BogTextView bogTextView5 = objArr[15];
        this.f69773S = bogTextView5;
        bogTextView5.setTag((Object) null);
        LinearLayout linearLayout3 = objArr[16];
        this.f69774T = linearLayout3;
        linearLayout3.setTag((Object) null);
        BogTextView bogTextView6 = objArr[17];
        this.f69775U = bogTextView6;
        bogTextView6.setTag((Object) null);
        LinearLayout linearLayout4 = objArr[18];
        this.f69776V = linearLayout4;
        linearLayout4.setTag((Object) null);
        BogTextView bogTextView7 = objArr[19];
        this.f69777W = bogTextView7;
        bogTextView7.setTag((Object) null);
        BogTextView bogTextView8 = objArr[2];
        this.f69778X = bogTextView8;
        bogTextView8.setTag((Object) null);
        LinearLayout linearLayout5 = objArr[20];
        this.f69779Y = linearLayout5;
        linearLayout5.setTag((Object) null);
        BogTextView bogTextView9 = objArr[21];
        this.f69780Z = bogTextView9;
        bogTextView9.setTag((Object) null);
        LinearLayout linearLayout6 = objArr[22];
        this.f69781a0 = linearLayout6;
        linearLayout6.setTag((Object) null);
        BogTextView bogTextView10 = objArr[23];
        this.f69782b0 = bogTextView10;
        bogTextView10.setTag((Object) null);
        BogTextView bogTextView11 = objArr[3];
        this.f69783c0 = bogTextView11;
        bogTextView11.setTag((Object) null);
        LinearLayout linearLayout7 = objArr[4];
        this.f69784d0 = linearLayout7;
        linearLayout7.setTag((Object) null);
        BogTextView bogTextView12 = objArr[5];
        this.f69785e0 = bogTextView12;
        bogTextView12.setTag((Object) null);
        BogTextView bogTextView13 = objArr[6];
        this.f69786f0 = bogTextView13;
        bogTextView13.setTag((Object) null);
        BogTextView bogTextView14 = objArr[7];
        this.f69787g0 = bogTextView14;
        bogTextView14.setTag((Object) null);
        BogTextView bogTextView15 = objArr[8];
        this.f69788h0 = bogTextView15;
        bogTextView15.setTag((Object) null);
        LinearLayout linearLayout8 = objArr[9];
        this.f69789i0 = linearLayout8;
        linearLayout8.setTag((Object) null);
        this.f69676G.setTag((Object) null);
        mo3945A(view);
        mo66719H();
    }
}
