package k20;

import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1613n0;
import c20.C19455a;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32343x;
import i20.C25102b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p366bk.C10320i;
import r90.C27950a;

/* renamed from: k20.a */
public final class C25571a extends C1613n0 {

    /* renamed from: d */
    private Drawable f65290d;

    /* renamed from: e */
    private Integer f65291e;

    /* renamed from: k20.a$a */
    public static final class C25572a {

        /* renamed from: a */
        private final String f65292a;

        /* renamed from: b */
        private final String f65293b;

        /* renamed from: c */
        private final Drawable f65294c;

        /* renamed from: d */
        private final String f65295d;

        /* renamed from: e */
        private final Integer f65296e;

        /* renamed from: f */
        private final String f65297f;

        public C25572a(String str, String str2, Drawable drawable, String str3, Integer num, String str4) {
            this.f65292a = str;
            this.f65293b = str2;
            this.f65294c = drawable;
            this.f65295d = str3;
            this.f65296e = num;
            this.f65297f = str4;
        }

        /* renamed from: a */
        public final String mo64143a() {
            return this.f65297f;
        }

        /* renamed from: b */
        public final Integer mo64144b() {
            return this.f65296e;
        }

        /* renamed from: c */
        public final Drawable mo64145c() {
            return this.f65294c;
        }

        /* renamed from: d */
        public final String mo64146d() {
            return this.f65293b;
        }

        /* renamed from: e */
        public final String mo64147e() {
            return this.f65292a;
        }

        /* renamed from: f */
        public final String mo64148f() {
            return this.f65295d;
        }
    }

    /* renamed from: dw */
    private final String m80801dw(C25102b bVar) {
        if (!C41536l.m120484d(PensionStatusResult.STATUS_ACTIVE, bVar.mo63547d())) {
            return C19455a.m64963b(C19455a.f53689a, bVar.mo63544a(), 0, 2, (Object) null);
        }
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{C32303f.m95204o(bVar.mo63544a().doubleValue()), "₾"}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* renamed from: ew */
    private final boolean m80802ew(String str, BigDecimal bigDecimal, List list) {
        this.f65290d = null;
        this.f65291e = null;
        if (C41536l.m120484d(str, "PLUS") && mo64142gw(list, "PLUS")) {
            this.f65290d = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_logo_plus);
            this.f65291e = 16;
            return true;
        } else if (C41536l.m120484d(str, ProductType.BONUS_PROD_TYPE_MEMBREWARD) && mo64142gw(list, "AMEX")) {
            this.f65290d = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_mr);
            this.f65291e = 8;
            return true;
        } else if (C41536l.m120484d(str, ProductType.BONUS_PROD_TYPE_CASHBACK) && mo64142gw(list, "AMEX_CASHBACK")) {
            this.f65290d = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_cashback);
            this.f65291e = 10;
            return true;
        } else if (C41536l.m120484d(str, "PRLLOT") && mo64142gw(list, "PRLLOT") && bigDecimal.doubleValue() > Utils.DOUBLE_EPSILON) {
            this.f65290d = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_prlo);
            this.f65291e = 17;
            return true;
        } else if (!C41536l.m120484d(str, ProductType.BONUS_PROD_TYPE_SCOOL) || !mo64142gw(list, "SCOOLA")) {
            return false;
        } else {
            this.f65290d = C0767a.m2895e(C36546y.m108285N(), C10320i.ic_school);
            this.f65291e = 15;
            return true;
        }
    }

    /* renamed from: fw */
    public final List mo64141fw(List list, List list2) {
        int size;
        String str;
        C41536l.m120489i(list, "pointsList");
        C41536l.m120489i(list2, "productTypeList");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25102b bVar = (C25102b) it.next();
            if (m80802ew(bVar.mo63548e(), bVar.mo63544a(), list2)) {
                String c = C27950a.m86286c(bVar.mo63546c(), false);
                String dw = m80801dw(bVar);
                Drawable drawable = this.f65290d;
                String e = bVar.mo63548e();
                Integer num = this.f65291e;
                BigDecimal b = bVar.mo63545b();
                if (b != null) {
                    str = C32343x.m95408P(b, "GEL");
                } else {
                    str = null;
                }
                arrayList.add(new C25572a(c, dw, drawable, e, num, str));
            }
        }
        if (arrayList.size() > 4 && 4 < arrayList.size() - 1) {
            arrayList.remove(size);
        }
        return C41358y.m120036z0(arrayList);
    }

    /* renamed from: gw */
    public final boolean mo64142gw(List list, String str) {
        Object obj;
        C41536l.m120489i(list, "productTypeList");
        if (str == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((ProductType) obj).getProduct(), str)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }
}
