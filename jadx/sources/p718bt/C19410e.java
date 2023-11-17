package p718bt;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p718bt.C19408d;

/* renamed from: bt.e */
public final class C19410e {

    /* renamed from: a */
    private final List f53637a;

    public C19410e() {
        C19408d.C19409a aVar = C19408d.f53631f;
        Double valueOf = Double.valueOf(-0.8d);
        Double valueOf2 = Double.valueOf(-0.6d);
        Double valueOf3 = Double.valueOf(-0.4d);
        Double valueOf4 = Double.valueOf(-0.2d);
        Double valueOf5 = Double.valueOf(Utils.DOUBLE_EPSILON);
        Double valueOf6 = Double.valueOf(1.0E-5d);
        Double valueOf7 = Double.valueOf(0.2d);
        Double valueOf8 = Double.valueOf(0.4d);
        Double valueOf9 = Double.valueOf(0.6d);
        Double valueOf10 = Double.valueOf(0.8d);
        this.f53637a = C41341q.m119910m(C19408d.C19409a.m64905b(aVar, (Double) null, valueOf, "#e63636", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf, valueOf2, "#ea5353", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf2, valueOf3, "#ee7575", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf3, valueOf4, "#f5abab", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf4, valueOf5, "#f8c7c7", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf5, valueOf6, "#ffefe7", "#3d3d3d", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf6, valueOf7, "#c0ecbc", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf7, valueOf8, "#aee7a8", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf8, valueOf9, "#8edd86", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf9, valueOf10, "#68d15c", "#ffffff", (String) null, 16, (Object) null), C19408d.C19409a.m64905b(aVar, valueOf10, (Double) null, "#5cce50", "#ffffff", (String) null, 16, (Object) null));
    }

    /* renamed from: a */
    public final C19408d mo47640a(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "heatLevel");
        for (C19408d dVar : this.f53637a) {
            if (dVar.mo47632a(bigDecimal)) {
                return dVar;
            }
        }
        return null;
    }
}
