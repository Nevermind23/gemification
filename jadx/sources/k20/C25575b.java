package k20;

import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1613n0;
import g91.C32359z0;
import i20.C25101a;
import i20.C25103c;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p366bk.C10328q;

/* renamed from: k20.b */
public final class C25575b extends C1613n0 {

    /* renamed from: d */
    public static final C25576a f65299d = new C25576a((DefaultConstructorMarker) null);

    /* renamed from: k20.b$a */
    public static final class C25576a {
        private C25576a() {
        }

        public /* synthetic */ C25576a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: dw */
    private final BigDecimal m80812dw(List list) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25101a aVar = (C25101a) it.next();
            if (C41536l.m120484d(aVar.mo63541f(), "DEPOSIT") || C41536l.m120484d(aVar.mo63541f(), "CD")) {
                C41536l.m120488h(bigDecimal, "depositSumTemp");
                bigDecimal = bigDecimal.add(aVar.mo63537c());
                C41536l.m120488h(bigDecimal, "this.add(other)");
            }
        }
        C41536l.m120488h(bigDecimal, "depositSumTemp");
        return bigDecimal;
    }

    /* renamed from: ew */
    private final BigDecimal m80813ew(List list) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25101a aVar = (C25101a) it.next();
            if (!C41536l.m120484d(aVar.mo63541f(), "FEE")) {
                C41536l.m120488h(bigDecimal, "liabilitySumTemp");
                bigDecimal = bigDecimal.add(aVar.mo63537c());
                C41536l.m120488h(bigDecimal, "this.add(other)");
            }
        }
        C41536l.m120488h(bigDecimal, "liabilitySumTemp");
        return bigDecimal;
    }

    /* renamed from: fw */
    public final List mo64149fw(List list, List list2) {
        boolean z;
        Object obj;
        boolean z2;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(list3, "assetList");
        C41536l.m120489i(list4, "liabilityList");
        BigDecimal ew = m80813ew(list4);
        BigDecimal dw = m80812dw(list);
        if (!(list3 instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C25101a) it.next()).mo63538d()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        String a0 = C32359z0.m95557a0(C10328q.main_activity_liabilities);
        C41536l.m120488h(a0, "getString(R.string.main_activity_liabilities)");
        Drawable e = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_liabilities_home);
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((C25101a) obj).mo63539e()) {
                break;
            }
        }
        C25101a aVar = (C25101a) obj;
        if (aVar != null) {
            z2 = aVar.mo63539e();
        } else {
            z2 = false;
        }
        String a02 = C32359z0.m95557a0(C10328q.main_activity_deposits);
        Drawable e2 = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_deposits_home);
        if (C41536l.m120484d(ew, BigDecimal.ZERO) && C41536l.m120484d(dw, BigDecimal.ZERO)) {
            return C41341q.m119907j();
        }
        if (C41536l.m120484d(dw, BigDecimal.ZERO)) {
            return C41339p.m119900e(new C25577b(a0, ew, "₾", e, "LIABILITIES", z2, false, 64, (DefaultConstructorMarker) null));
        }
        if (C41536l.m120484d(ew, BigDecimal.ZERO)) {
            return C41339p.m119900e(new C25577b(a02, dw, "₾", e2, "DEPOSITS", false, z, 32, (DefaultConstructorMarker) null));
        }
        C25577b[] bVarArr = new C25577b[2];
        bVarArr[0] = new C25577b(a02, dw, "₾", e2, "DEPOSITS", false, z, 32, (DefaultConstructorMarker) null);
        C25577b[] bVarArr2 = bVarArr;
        bVarArr2[1] = new C25577b(a0, ew, "₾", e, "LIABILITIES", z2, false, 64, (DefaultConstructorMarker) null);
        return C41341q.m119910m(bVarArr2);
    }

    /* renamed from: gw */
    public final boolean mo64150gw(C25103c cVar) {
        C41536l.m120489i(cVar, "ls");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (C25101a c : cVar.mo63554d()) {
            C41536l.m120488h(bigDecimal, "liabilitySumTemp");
            bigDecimal = bigDecimal.add(c.mo63537c());
            C41536l.m120488h(bigDecimal, "this.add(other)");
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        for (C25101a aVar : cVar.mo63553c()) {
            if (C41536l.m120484d(aVar.mo63541f(), "DEPOSIT") || C41536l.m120484d(aVar.mo63541f(), "CD")) {
                C41536l.m120488h(bigDecimal2, "depositSumTemp");
                bigDecimal2 = bigDecimal2.add(aVar.mo63537c());
                C41536l.m120488h(bigDecimal2, "this.add(other)");
            }
        }
        if (!C41536l.m120484d(bigDecimal, BigDecimal.ZERO) || !C41536l.m120484d(bigDecimal2, BigDecimal.ZERO)) {
            return false;
        }
        return true;
    }

    /* renamed from: k20.b$b */
    public static final class C25577b {

        /* renamed from: a */
        private final String f65300a;

        /* renamed from: b */
        private final BigDecimal f65301b;

        /* renamed from: c */
        private final String f65302c;

        /* renamed from: d */
        private final Drawable f65303d;

        /* renamed from: e */
        private final String f65304e;

        /* renamed from: f */
        private final boolean f65305f;

        /* renamed from: g */
        private final boolean f65306g;

        public C25577b(String str, BigDecimal bigDecimal, String str2, Drawable drawable, String str3, boolean z, boolean z2) {
            C41536l.m120489i(bigDecimal, "amount");
            C41536l.m120489i(str2, "currency");
            this.f65300a = str;
            this.f65301b = bigDecimal;
            this.f65302c = str2;
            this.f65303d = drawable;
            this.f65304e = str3;
            this.f65305f = z;
            this.f65306g = z2;
        }

        /* renamed from: a */
        public final BigDecimal mo64151a() {
            return this.f65301b;
        }

        /* renamed from: b */
        public final String mo64152b() {
            return this.f65302c;
        }

        /* renamed from: c */
        public final boolean mo64153c() {
            return this.f65305f;
        }

        /* renamed from: d */
        public final boolean mo64154d() {
            return this.f65306g;
        }

        /* renamed from: e */
        public final Drawable mo64155e() {
            return this.f65303d;
        }

        /* renamed from: f */
        public final String mo64156f() {
            return this.f65300a;
        }

        /* renamed from: g */
        public final String mo64157g() {
            return this.f65304e;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25577b(String str, BigDecimal bigDecimal, String str2, Drawable drawable, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bigDecimal, str2, drawable, str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
        }
    }
}
