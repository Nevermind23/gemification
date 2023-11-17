package p90;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import l50.C25838r;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;

/* renamed from: p90.l3 */
public class C27356l3 extends C27347k3 {

    /* renamed from: d0 */
    private static final SparseIntArray f69217d0;

    /* renamed from: T */
    private final NestedScrollView f69218T;

    /* renamed from: U */
    private final BogTextView f69219U;

    /* renamed from: V */
    private final BogTextView f69220V;

    /* renamed from: W */
    private final BogTextView f69221W;

    /* renamed from: X */
    private final LinearLayout f69222X;

    /* renamed from: Y */
    private final View f69223Y;

    /* renamed from: Z */
    private final BogTextView f69224Z;

    /* renamed from: a0 */
    private final View f69225a0;

    /* renamed from: b0 */
    private final BogTextView f69226b0;

    /* renamed from: c0 */
    private long f69227c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69217d0 = sparseIntArray;
        sparseIntArray.put(C10322k.card_security_header, 19);
        sparseIntArray.put(C10322k.mcc_control_header, 20);
        sparseIntArray.put(C10322k.pin_reset_header, 21);
        sparseIntArray.put(C10322k.details_rename_button, 22);
        sparseIntArray.put(C10322k.card_number_title_text, 23);
        sparseIntArray.put(C10322k.card_details_click_catcher, 24);
        sparseIntArray.put(C10322k.print_digital_card, 25);
        sparseIntArray.put(C10322k.downloadPdf, 26);
        sparseIntArray.put(C10322k.close_card_text, 27);
    }

    public C27356l3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 28, (ViewDataBinding.C1353i) null, f69217d0));
    }

    /* renamed from: D */
    public void mo66640D(C25838r rVar) {
        this.f69154R = rVar;
        synchronized (this) {
            this.f69227c0 |= 2;
        }
        mo3956a(C10312a.f28597c);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66641E(Context context) {
        this.f69155S = context;
    }

    /* renamed from: F */
    public void mo66650F() {
        synchronized (this) {
            this.f69227c0 = 4;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0175  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r41 = this;
            r1 = r41
            monitor-enter(r41)
            long r2 = r1.f69227c0     // Catch:{ all -> 0x0331 }
            r4 = 0
            r1.f69227c0 = r4     // Catch:{ all -> 0x0331 }
            monitor-exit(r41)     // Catch:{ all -> 0x0331 }
            l50.r r0 = r1.f69154R
            r6 = 6
            long r8 = r2 & r6
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 67108864(0x4000000, double:3.31561842E-316)
            r11 = 16777216(0x1000000, double:8.289046E-317)
            r13 = 65536(0x10000, double:3.2379E-319)
            r15 = 64
            r17 = 16
            r19 = 16384(0x4000, double:8.0948E-320)
            r21 = 17179869184(0x400000000, double:8.4879831639E-314)
            r23 = 1024(0x400, double:5.06E-321)
            r25 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r27 = 4294967296(0x100000000, double:2.121995791E-314)
            r29 = 4096(0x1000, double:2.0237E-320)
            r31 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r33 = 1
            r34 = 8
            r35 = 0
            r36 = 0
            if (r8 == 0) goto L_0x00cb
            if (r0 == 0) goto L_0x004a
            java.lang.String r37 = r0.mo64586k()
            goto L_0x004c
        L_0x004a:
            r37 = r35
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            r38 = r33
            goto L_0x0053
        L_0x0051:
            r38 = r36
        L_0x0053:
            if (r8 == 0) goto L_0x00ab
            if (r38 == 0) goto L_0x006c
            long r2 = r2 | r17
            long r2 = r2 | r15
            long r2 = r2 | r23
            long r2 = r2 | r29
            long r2 = r2 | r19
            long r2 = r2 | r13
            long r2 = r2 | r11
            long r2 = r2 | r9
            long r2 = r2 | r27
            long r2 = r2 | r21
            long r2 = r2 | r25
            long r2 = r2 | r31
            goto L_0x00ab
        L_0x006c:
            r39 = 8
            long r2 = r2 | r39
            r39 = 32
            long r2 = r2 | r39
            r39 = 512(0x200, double:2.53E-321)
            long r2 = r2 | r39
            r39 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r39
            r39 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2 | r39
            r39 = 32768(0x8000, double:1.61895E-319)
            long r2 = r2 | r39
            r39 = 8388608(0x800000, double:4.144523E-317)
            long r2 = r2 | r39
            r39 = 33554432(0x2000000, double:1.6578092E-316)
            long r2 = r2 | r39
            r39 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r2 = r2 | r39
            r39 = 8589934592(0x200000000, double:4.243991582E-314)
            long r2 = r2 | r39
            r39 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r2 = r2 | r39
            r39 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r2 = r2 | r39
        L_0x00ab:
            if (r37 == 0) goto L_0x00b0
            r8 = r33
            goto L_0x00b2
        L_0x00b0:
            r8 = r36
        L_0x00b2:
            long r39 = r2 & r6
            int r37 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r37 == 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00be
            r39 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x00c1
        L_0x00be:
            r39 = 524288(0x80000, double:2.590327E-318)
        L_0x00c1:
            long r2 = r2 | r39
        L_0x00c3:
            if (r8 == 0) goto L_0x00c8
            r8 = r36
            goto L_0x00cf
        L_0x00c8:
            r8 = r34
            goto L_0x00cf
        L_0x00cb:
            r8 = r36
            r38 = r8
        L_0x00cf:
            long r31 = r2 & r31
            int r31 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r31 == 0) goto L_0x00dc
            if (r0 == 0) goto L_0x00dc
            java.lang.String r31 = r0.mo64597u()
            goto L_0x00de
        L_0x00dc:
            r31 = r35
        L_0x00de:
            long r29 = r2 & r29
            int r29 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x0100
            if (r0 == 0) goto L_0x00eb
            boolean r30 = r0.mo64578e()
            goto L_0x00ed
        L_0x00eb:
            r30 = r36
        L_0x00ed:
            if (r29 == 0) goto L_0x00fa
            if (r30 == 0) goto L_0x00f5
            r39 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x00f8
        L_0x00f5:
            r39 = 134217728(0x8000000, double:6.63123685E-316)
        L_0x00f8:
            long r2 = r2 | r39
        L_0x00fa:
            if (r30 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r29 = r34
            goto L_0x0102
        L_0x0100:
            r29 = r36
        L_0x0102:
            r39 = 16860176(0x1014410, double:8.3300337E-317)
            long r39 = r2 & r39
            int r30 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r30 == 0) goto L_0x01de
            if (r0 == 0) goto L_0x0112
            l50.u r30 = r0.mo64592q()
            goto L_0x0114
        L_0x0112:
            r30 = r35
        L_0x0114:
            long r23 = r2 & r23
            int r23 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0141
            if (r30 == 0) goto L_0x0123
            hd0.b r24 = r30.mo64624i()
            r6 = r24
            goto L_0x0125
        L_0x0123:
            r6 = r35
        L_0x0125:
            hd0.b r7 = hd0.C24978b.YES
            if (r6 != r7) goto L_0x012c
            r6 = r33
            goto L_0x012e
        L_0x012c:
            r6 = r36
        L_0x012e:
            if (r23 == 0) goto L_0x013b
            if (r6 == 0) goto L_0x0136
            r23 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x0139
        L_0x0136:
            r23 = 536870912(0x20000000, double:2.652494739E-315)
        L_0x0139:
            long r2 = r2 | r23
        L_0x013b:
            if (r6 == 0) goto L_0x013e
            goto L_0x0141
        L_0x013e:
            r6 = r34
            goto L_0x0143
        L_0x0141:
            r6 = r36
        L_0x0143:
            long r19 = r2 & r19
            int r7 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x016d
            if (r30 == 0) goto L_0x0152
            hd0.b r19 = r30.mo64622h()
            r15 = r19
            goto L_0x0154
        L_0x0152:
            r15 = r35
        L_0x0154:
            hd0.b r9 = hd0.C24978b.YES
            if (r15 != r9) goto L_0x015b
            r9 = r33
            goto L_0x015d
        L_0x015b:
            r9 = r36
        L_0x015d:
            if (r7 == 0) goto L_0x0167
            if (r9 == 0) goto L_0x0164
            r15 = 256(0x100, double:1.265E-321)
            goto L_0x0166
        L_0x0164:
            r15 = 128(0x80, double:6.32E-322)
        L_0x0166:
            long r2 = r2 | r15
        L_0x0167:
            if (r9 == 0) goto L_0x016a
            goto L_0x016d
        L_0x016a:
            r7 = r34
            goto L_0x016f
        L_0x016d:
            r7 = r36
        L_0x016f:
            long r9 = r2 & r13
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x019d
            if (r30 == 0) goto L_0x017c
            hd0.b r10 = r30.mo64617d()
            goto L_0x017e
        L_0x017c:
            r10 = r35
        L_0x017e:
            hd0.b r13 = hd0.C24978b.YES
            if (r10 != r13) goto L_0x0185
            r10 = r33
            goto L_0x0187
        L_0x0185:
            r10 = r36
        L_0x0187:
            if (r9 == 0) goto L_0x0197
            if (r10 == 0) goto L_0x0191
            r13 = 274877906944(0x4000000000, double:1.358077306218E-312)
            goto L_0x0196
        L_0x0191:
            r13 = 137438953472(0x2000000000, double:6.7903865311E-313)
        L_0x0196:
            long r2 = r2 | r13
        L_0x0197:
            if (r10 == 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            r9 = r34
            goto L_0x019f
        L_0x019d:
            r9 = r36
        L_0x019f:
            long r10 = r2 & r11
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x01b3
            if (r30 == 0) goto L_0x01ac
            java.lang.String r10 = r30.mo64620f()
            goto L_0x01ae
        L_0x01ac:
            r10 = r35
        L_0x01ae:
            java.lang.String r10 = r90.C27950a.m86284a(r10)
            goto L_0x01b5
        L_0x01b3:
            r10 = r35
        L_0x01b5:
            long r11 = r2 & r17
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x01db
            if (r30 == 0) goto L_0x01c2
            java.lang.String r12 = r30.mo64618e()
            goto L_0x01c4
        L_0x01c2:
            r12 = r35
        L_0x01c4:
            if (r12 == 0) goto L_0x01c7
            goto L_0x01c9
        L_0x01c7:
            r33 = r36
        L_0x01c9:
            if (r11 == 0) goto L_0x01d5
            if (r33 == 0) goto L_0x01d1
            r11 = 262144(0x40000, double:1.295163E-318)
            goto L_0x01d4
        L_0x01d1:
            r11 = 131072(0x20000, double:6.47582E-319)
        L_0x01d4:
            long r2 = r2 | r11
        L_0x01d5:
            if (r33 == 0) goto L_0x01d8
            goto L_0x01db
        L_0x01d8:
            r11 = r34
            goto L_0x01e5
        L_0x01db:
            r11 = r36
            goto L_0x01e5
        L_0x01de:
            r10 = r35
            r6 = r36
            r7 = r6
            r9 = r7
            r11 = r9
        L_0x01e5:
            long r12 = r2 & r27
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x01f2
            if (r0 == 0) goto L_0x01f2
            java.lang.String r12 = r0.mo64576c()
            goto L_0x01f4
        L_0x01f2:
            r12 = r35
        L_0x01f4:
            long r13 = r2 & r25
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0201
            if (r0 == 0) goto L_0x0201
            java.lang.String r13 = r0.mo64587l()
            goto L_0x0203
        L_0x0201:
            r13 = r35
        L_0x0203:
            long r14 = r2 & r21
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0210
            if (r0 == 0) goto L_0x0210
            java.lang.String r14 = r0.mo64593r()
            goto L_0x0212
        L_0x0210:
            r14 = r35
        L_0x0212:
            r15 = 67108864(0x4000000, double:3.31561842E-316)
            long r15 = r15 & r2
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0221
            if (r0 == 0) goto L_0x0221
            java.lang.String r15 = r0.mo64581g()
            goto L_0x0223
        L_0x0221:
            r15 = r35
        L_0x0223:
            r16 = 64
            long r16 = r2 & r16
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x024f
            if (r0 == 0) goto L_0x0232
            hd0.b r17 = r0.mo64599w()
            goto L_0x0234
        L_0x0232:
            r17 = r35
        L_0x0234:
            if (r17 == 0) goto L_0x023b
            boolean r17 = r17.mo63390c()
            goto L_0x023d
        L_0x023b:
            r17 = r36
        L_0x023d:
            if (r16 == 0) goto L_0x024a
            if (r17 == 0) goto L_0x0245
            r18 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x0248
        L_0x0245:
            r18 = 2097152(0x200000, double:1.0361308E-317)
        L_0x0248:
            long r2 = r2 | r18
        L_0x024a:
            if (r17 == 0) goto L_0x024f
            r16 = r34
            goto L_0x0251
        L_0x024f:
            r16 = r36
        L_0x0251:
            r17 = 6
            long r2 = r2 & r17
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x02c1
            if (r38 == 0) goto L_0x025e
            r36 = r11
            goto L_0x0260
        L_0x025e:
            r36 = r34
        L_0x0260:
            if (r38 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            r16 = r34
        L_0x0265:
            if (r38 == 0) goto L_0x0268
            goto L_0x026a
        L_0x0268:
            r6 = r34
        L_0x026a:
            if (r38 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r29 = r34
        L_0x026f:
            if (r38 == 0) goto L_0x0272
            goto L_0x0274
        L_0x0272:
            r7 = r34
        L_0x0274:
            if (r38 == 0) goto L_0x0278
            r34 = r9
        L_0x0278:
            if (r38 == 0) goto L_0x027d
            r35 = r10
            goto L_0x0281
        L_0x027d:
            java.lang.String r3 = ""
            r35 = r3
        L_0x0281:
            if (r38 == 0) goto L_0x0284
            goto L_0x0287
        L_0x0284:
            java.lang.String r3 = ""
            r15 = r3
        L_0x0287:
            if (r38 == 0) goto L_0x028b
            r3 = r12
            goto L_0x028d
        L_0x028b:
            java.lang.String r3 = ""
        L_0x028d:
            if (r38 == 0) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            java.lang.String r14 = ""
        L_0x0292:
            if (r38 == 0) goto L_0x0296
            r4 = r13
            goto L_0x0298
        L_0x0296:
            java.lang.String r4 = ""
        L_0x0298:
            if (r38 == 0) goto L_0x029b
            goto L_0x029f
        L_0x029b:
            java.lang.String r5 = ""
            r31 = r5
        L_0x029f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "**** "
            r5.append(r9)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            r12 = r6
            r9 = r7
            r14 = r16
            r11 = r29
            r10 = r34
            r6 = r35
            r13 = r36
            r7 = r4
            r4 = r3
            r3 = r31
            goto L_0x02cf
        L_0x02c1:
            r3 = r35
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r15 = r7
            r9 = r36
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x02cf:
            if (r2 == 0) goto L_0x0330
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f69156y
            r2.setVisibility(r9)
            android.widget.ImageView r2 = r1.f69137A
            q00.C27665j.m85656E1(r2, r0)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f69138B
            q00.C27665j.m85656E1(r2, r0)
            android.widget.LinearLayout r0 = r1.f69139C
            r0.setVisibility(r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69141E
            p018b0.C2108a.m8160b(r0, r5)
            ge.bog.designsystem.components.list.ListItem r0 = r1.f69143G
            r0.setVisibility(r11)
            androidx.appcompat.widget.AppCompatTextView r0 = r1.f69147K
            r0.setVisibility(r11)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69219U
            p018b0.C2108a.m8160b(r0, r15)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69220V
            p018b0.C2108a.m8160b(r0, r3)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69221W
            p018b0.C2108a.m8160b(r0, r4)
            android.widget.LinearLayout r0 = r1.f69222X
            r0.setVisibility(r8)
            android.view.View r0 = r1.f69223Y
            r0.setVisibility(r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69224Z
            p018b0.C2108a.m8160b(r0, r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69224Z
            r0.setVisibility(r13)
            android.view.View r0 = r1.f69225a0
            r0.setVisibility(r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f69226b0
            p018b0.C2108a.m8160b(r0, r7)
            android.widget.LinearLayout r0 = r1.f69149M
            r0.setVisibility(r14)
            android.widget.LinearLayout r0 = r1.f69151O
            r0.setVisibility(r14)
            android.widget.LinearLayout r0 = r1.f69153Q
            r0.setVisibility(r12)
        L_0x0330:
            return
        L_0x0331:
            r0 = move-exception
            monitor-exit(r41)     // Catch:{ all -> 0x0331 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27356l3.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f69227c0 != 0) {
                return true;
            }
            return false;
        }
    }

    private C27356l3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[2], objArr[24], objArr[11], objArr[12], objArr[4], objArr[23], objArr[10], objArr[19], objArr[18], objArr[27], objArr[22], objArr[26], objArr[17], objArr[20], objArr[7], objArr[21], objArr[8], objArr[25], objArr[1]);
        this.f69227c0 = -1;
        this.f69156y.setTag((Object) null);
        this.f69137A.setTag((Object) null);
        this.f69138B.setTag((Object) null);
        this.f69139C.setTag((Object) null);
        this.f69141E.setTag((Object) null);
        this.f69143G.setTag((Object) null);
        this.f69147K.setTag((Object) null);
        NestedScrollView nestedScrollView = objArr[0];
        this.f69218T = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        BogTextView bogTextView = objArr[13];
        this.f69219U = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[14];
        this.f69220V = bogTextView2;
        bogTextView2.setTag((Object) null);
        BogTextView bogTextView3 = objArr[15];
        this.f69221W = bogTextView3;
        bogTextView3.setTag((Object) null);
        LinearLayout linearLayout = objArr[16];
        this.f69222X = linearLayout;
        linearLayout.setTag((Object) null);
        View view2 = objArr[3];
        this.f69223Y = view2;
        view2.setTag((Object) null);
        BogTextView bogTextView4 = objArr[5];
        this.f69224Z = bogTextView4;
        bogTextView4.setTag((Object) null);
        View view3 = objArr[6];
        this.f69225a0 = view3;
        view3.setTag((Object) null);
        BogTextView bogTextView5 = objArr[9];
        this.f69226b0 = bogTextView5;
        bogTextView5.setTag((Object) null);
        this.f69149M.setTag((Object) null);
        this.f69151O.setTag((Object) null);
        this.f69153Q.setTag((Object) null);
        mo3945A(view);
        mo66650F();
    }
}
