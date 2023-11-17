package ke0;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.BuySellDefaultAmountApiModel;
import xe0.C29744b;

/* renamed from: ke0.b */
public final class C25713b {
    /* renamed from: a */
    public final List mo64281a(List list) {
        double d;
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BuySellDefaultAmountApiModel buySellDefaultAmountApiModel = (BuySellDefaultAmountApiModel) it.next();
            Double h = C40437u.m117096h(buySellDefaultAmountApiModel.getLookupValue());
            if (h != null) {
                d = h.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            arrayList.add(new C29744b(d, buySellDefaultAmountApiModel.getDictionaryKey()));
        }
        return arrayList;
    }
}
