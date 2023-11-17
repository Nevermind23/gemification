package wx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import fx0.C32021a;
import g91.C32343x;
import java.math.BigDecimal;
import jx0.C36841w;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import vx0.C39491a;

/* renamed from: wx0.i */
public final class C39727i extends C39491a {

    /* renamed from: b */
    private C36841w f94385b;

    /* renamed from: c */
    private boolean f94386c;

    /* renamed from: d */
    private String f94387d;

    /* renamed from: e */
    private boolean f94388e = true;

    /* renamed from: f */
    private int f94389f = -1;

    /* renamed from: x */
    private final Integer m115412x(BigDecimal bigDecimal) {
        if (bigDecimal.signum() < 0) {
            return Integer.valueOf(C0767a.m2893c(m115413y().mo3946b().getContext(), C32021a.f78825b));
        }
        if (bigDecimal.signum() > 0) {
            return Integer.valueOf(C0767a.m2893c(m115413y().mo3946b().getContext(), C32021a.f78824a));
        }
        return null;
    }

    /* renamed from: y */
    private final C36841w m115413y() {
        C36841w wVar = this.f94385b;
        C41536l.m120486f(wVar);
        return wVar;
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94389f;
    }

    /* renamed from: g */
    public String mo93122g() {
        return this.f94387d;
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94386c;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r7.equals("debt") != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r7.equals("amount") == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo93128m(lx0.C37179d r12, java.util.List r13, s31.C38421a r14) {
        /*
            r11 = this;
            java.lang.String r0 = "debt"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r1 = "debtInput"
            kotlin.jvm.internal.C41536l.m120489i(r13, r1)
            java.lang.String r1 = "oldConfig"
            kotlin.jvm.internal.C41536l.m120489i(r14, r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x001d:
            boolean r2 = r13.hasNext()
            r3 = 0
            r4 = 0
            java.lang.String r5 = "\n"
            r6 = 1
            if (r2 == 0) goto L_0x0189
            java.lang.Object r2 = r13.next()
            s31.b r2 = (s31.C38422b) r2
            java.lang.String r7 = r2.mo91969l()
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x006d
            int r9 = r7.hashCode()
            r10 = -1413853096(0xffffffffabba5058, float:-1.3238395E-12)
            if (r9 == r10) goto L_0x005f
            r10 = 3079315(0x2efc93, float:4.31504E-39)
            if (r9 == r10) goto L_0x0058
            r10 = 3556653(0x36452d, float:4.983932E-39)
            if (r9 == r10) goto L_0x004a
            goto L_0x006d
        L_0x004a:
            java.lang.String r9 = "text"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0053
            goto L_0x006d
        L_0x0053:
            java.lang.String r7 = ox0.C37829b.m111225l(r12, r2)
            goto L_0x006e
        L_0x0058:
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006d
            goto L_0x0068
        L_0x005f:
            java.lang.String r9 = "amount"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            java.math.BigDecimal r7 = ox0.C37829b.m111221h(r12, r2)
            goto L_0x006e
        L_0x006d:
            r7 = r8
        L_0x006e:
            java.lang.String r9 = r2.mo91969l()
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r0)
            if (r9 == 0) goto L_0x00aa
            boolean r9 = r7 instanceof java.math.BigDecimal
            if (r9 == 0) goto L_0x00aa
            r9 = r7
            java.math.BigDecimal r9 = (java.math.BigDecimal) r9
            int r9 = r9.signum()
            if (r9 > 0) goto L_0x009b
            java.lang.String r9 = r2.mo91960e()
            if (r9 != 0) goto L_0x008c
            goto L_0x009b
        L_0x008c:
            java.lang.String r9 = r2.mo91960e()
            if (r9 == 0) goto L_0x00ba
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r4 = g91.C32343x.m95386E(r9, r6, r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x009b:
            java.lang.String r9 = r2.mo91966i()
            if (r9 == 0) goto L_0x00ba
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r4 = g91.C32343x.m95386E(r9, r6, r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = r2.mo91966i()
            if (r9 == 0) goto L_0x00ba
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r4 = g91.C32343x.m95386E(r9, r6, r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r8 = r4
        L_0x00ba:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r8 = ": "
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            boolean r4 = r7 instanceof java.lang.String
            r8 = 17
            if (r4 == 0) goto L_0x00fe
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
            ox0.C37829b.m111216c(r14, r3, r2)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            int r4 = r1.length()
            r1.setSpan(r2, r3, r4, r8)
            goto L_0x001d
        L_0x00fe:
            boolean r4 = r7 instanceof java.math.BigDecimal
            if (r4 == 0) goto L_0x001d
            java.math.BigDecimal r7 = (java.math.BigDecimal) r7
            java.lang.String r4 = r7.toString()
            ox0.C37829b.m111216c(r14, r4, r2)
            java.math.BigDecimal r4 = r7.abs()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = ox0.C37829b.m111218e(r4)
            java.lang.String r9 = "GEL"
            java.lang.String r4 = g91.C32343x.m95406O(r4, r9)
            java.lang.String r2 = r2.mo91969l()
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r0)
            if (r2 == 0) goto L_0x012b
            java.lang.Integer r3 = r11.m115412x(r7)
        L_0x012b:
            if (r3 == 0) goto L_0x0165
            int r2 = r3.intValue()
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r2)
            int r2 = r1.length()
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r7.<init>(r6)
            int r6 = r1.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = r9.toString()
            r1.append(r4)
            int r4 = r1.length()
            r1.setSpan(r7, r6, r4, r8)
            int r4 = r1.length()
            r1.setSpan(r3, r2, r4, r8)
            goto L_0x001d
        L_0x0165:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            int r3 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.append(r4)
            int r4 = r1.length()
            r1.setSpan(r2, r3, r4, r8)
            goto L_0x001d
        L_0x0189:
            com.google.gson.Gson r12 = new com.google.gson.Gson
            r12.<init>()
            java.lang.String r12 = r12.mo18181w(r14)
            r11.mo93136u(r12)
        L_0x0195:
            r12 = 2
            boolean r12 = cf1.C40440x.m117143O(r1, r5, r4, r12, r3)
            if (r12 == 0) goto L_0x01a9
            int r12 = r1.length()
            int r12 = r12 - r6
            int r13 = r1.length()
            r1.delete(r12, r13)
            goto L_0x0195
        L_0x01a9:
            jx0.w r12 = r11.m115413y()
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r12 = r12.f88912e
            r12.setTitle(r1)
            r11.mo93137v(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.C39727i.mo93128m(lx0.d, java.util.List, s31.a):void");
    }

    /* renamed from: p */
    public void mo93131p() {
        mo93136u((String) null);
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94389f = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        this.f94388e = z;
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        this.f94387d = str;
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94386c = z;
        C36841w wVar = this.f94385b;
        if (wVar != null && (c = wVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: z */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94385b = C36841w.m109177d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        mo93137v(!bVar.mo80328p());
        LinearLayout c = m115413y().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }
}
