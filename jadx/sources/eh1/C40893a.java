package eh1;

import af1.C40296c;
import android.os.Bundle;
import androidx.lifecycle.C1613n0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import ph1.C42203a;
import ue1.C43064a;
import yg1.C43399a;
import yg1.C43401b;
import yg1.C43402c;

/* renamed from: eh1.a */
public abstract class C40893a {
    /* renamed from: a */
    public static final C1613n0 m118633a(C42203a aVar, C41806a aVar2, C43064a aVar3, C43064a aVar4, C40296c cVar, C43064a aVar5) {
        Bundle bundle;
        C41536l.m120489i(aVar, "$this$getViewModel");
        C41536l.m120489i(aVar4, "owner");
        C41536l.m120489i(cVar, "clazz");
        C43399a aVar6 = (C43399a) aVar4.invoke();
        if (aVar3 == null || (bundle = (Bundle) aVar3.invoke()) == null) {
            bundle = new Bundle();
        }
        return m118634b(aVar, new C43401b(cVar, aVar2, aVar5, bundle, aVar6.mo102075b(), aVar6.mo102074a()));
    }

    /* renamed from: b */
    public static final C1613n0 m118634b(C42203a aVar, C43401b bVar) {
        C41536l.m120489i(aVar, "$this$getViewModel");
        C41536l.m120489i(bVar, "viewModelParameters");
        return C43402c.m124510d(C43402c.m124507a(aVar, bVar), bVar);
    }
}
