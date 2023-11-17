package ih1;

import af1.C40296c;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import sh1.C42576a;

/* renamed from: ih1.b */
public abstract class C41370b {
    /* renamed from: a */
    public static final String m120068a(C40296c cVar, C41806a aVar) {
        String str;
        C41536l.m120489i(cVar, "clazz");
        if (aVar != null) {
            str = aVar.getValue();
        } else {
            str = null;
        }
        if (str == null) {
            return C42576a.m123264a(cVar);
        }
        return C42576a.m123264a(cVar) + "::" + aVar.getValue();
    }
}
