package p90;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;

/* renamed from: p90.i3 */
public class C27327i3 extends C27317h3 {

    /* renamed from: J */
    private static final SparseIntArray f68964J = null;

    /* renamed from: A */
    private final NestedScrollView f68965A;

    /* renamed from: B */
    private final BogTextView f68966B;

    /* renamed from: C */
    private final BogTextView f68967C;

    /* renamed from: D */
    private final BogTextView f68968D;

    /* renamed from: E */
    private final BogTextView f68969E;

    /* renamed from: F */
    private final BogTextView f68970F;

    /* renamed from: G */
    private final BogTextView f68971G;

    /* renamed from: H */
    private final BogTextView f68972H;

    /* renamed from: I */
    private long f68973I;

    public C27327i3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 8, (ViewDataBinding.C1353i) null, f68964J));
    }

    /* renamed from: D */
    public void mo66609D(Bond bond) {
        this.f68875y = bond;
        synchronized (this) {
            this.f68973I |= 1;
        }
        mo3956a(C10312a.f28596b);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66610E(String str) {
        this.f68876z = str;
        synchronized (this) {
            this.f68973I |= 2;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: F */
    public void mo66620F() {
        synchronized (this) {
            this.f68973I = 4;
        }
        mo3950x();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.math.BigDecimal} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3947k() {
        /*
            r22 = this;
            r1 = r22
            monitor-enter(r22)
            long r2 = r1.f68973I     // Catch:{ all -> 0x00d9 }
            r4 = 0
            r1.f68973I = r4     // Catch:{ all -> 0x00d9 }
            monitor-exit(r22)     // Catch:{ all -> 0x00d9 }
            ge.bog.mobilebank.model.Bond r0 = r1.f68875y
            java.lang.String r6 = r1.f68876z
            r7 = 7
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 5
            r10 = 0
            if (r7 == 0) goto L_0x00a6
            long r11 = r2 & r8
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x0031
            java.lang.String r11 = r0.getTickerName()
            java.lang.String r12 = r0.getSecurityName()
            long r13 = r0.getQuantity()
            java.lang.String r15 = r0.getAgreementName()
            goto L_0x0035
        L_0x0031:
            r13 = r4
            r11 = r10
            r12 = r11
            r15 = r12
        L_0x0035:
            java.lang.String r13 = g91.C32303f.m95199j(r13)
            goto L_0x003e
        L_0x003a:
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x003e:
            if (r0 == 0) goto L_0x004d
            java.math.BigDecimal r10 = r0.getUnrealisedProfitLoss()
            java.math.BigDecimal r14 = r0.getPurchasePrice()
            java.math.BigDecimal r0 = r0.getMarketPrice()
            goto L_0x004f
        L_0x004d:
            r0 = r10
            r14 = r0
        L_0x004f:
            r16 = 0
            if (r10 == 0) goto L_0x0058
            double r18 = r10.doubleValue()
            goto L_0x005a
        L_0x0058:
            r18 = r16
        L_0x005a:
            if (r14 == 0) goto L_0x0061
            double r20 = r14.doubleValue()
            goto L_0x0063
        L_0x0061:
            r20 = r16
        L_0x0063:
            if (r0 == 0) goto L_0x0069
            double r16 = r0.doubleValue()
        L_0x0069:
            java.lang.String r0 = g91.C32303f.m95204o(r18)
            java.lang.String r10 = g91.C32303f.m95204o(r20)
            java.lang.String r14 = g91.C32303f.m95204o(r16)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r6)
            java.lang.String r10 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5 = r0
            r0 = r10
            r10 = r12
            goto L_0x00ac
        L_0x00a6:
            r0 = r10
            r4 = r0
            r5 = r4
            r11 = r5
            r13 = r11
            r15 = r13
        L_0x00ac:
            long r2 = r2 & r8
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00c7
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f68966B
            p018b0.C2108a.m8160b(r2, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f68967C
            p018b0.C2108a.m8160b(r2, r11)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f68968D
            p018b0.C2108a.m8160b(r2, r15)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f68969E
            p018b0.C2108a.m8160b(r2, r13)
        L_0x00c7:
            if (r7 == 0) goto L_0x00d8
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r1.f68970F
            p018b0.C2108a.m8160b(r2, r0)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f68971G
            p018b0.C2108a.m8160b(r0, r4)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r1.f68972H
            p018b0.C2108a.m8160b(r0, r5)
        L_0x00d8:
            return
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x00d9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27327i3.mo3947k():void");
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f68973I != 0) {
                return true;
            }
            return false;
        }
    }

    private C27327i3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0);
        this.f68973I = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.f68965A = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        BogTextView bogTextView = objArr[1];
        this.f68966B = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[2];
        this.f68967C = bogTextView2;
        bogTextView2.setTag((Object) null);
        BogTextView bogTextView3 = objArr[3];
        this.f68968D = bogTextView3;
        bogTextView3.setTag((Object) null);
        BogTextView bogTextView4 = objArr[4];
        this.f68969E = bogTextView4;
        bogTextView4.setTag((Object) null);
        BogTextView bogTextView5 = objArr[5];
        this.f68970F = bogTextView5;
        bogTextView5.setTag((Object) null);
        BogTextView bogTextView6 = objArr[6];
        this.f68971G = bogTextView6;
        bogTextView6.setTag((Object) null);
        BogTextView bogTextView7 = objArr[7];
        this.f68972H = bogTextView7;
        bogTextView7.setTag((Object) null);
        mo3945A(view);
        mo66620F();
    }
}
