package p190o1;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: o1.a0 */
public interface C7362a0 {

    /* renamed from: o1.a0$a */
    public static final class C7363a {
        /* renamed from: a */
        public static void m28055a(C7362a0 a0Var, String str, Set set) {
            C41536l.m120489i(str, "id");
            C41536l.m120489i(set, C11772k.C11773a.f34175g);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a0Var.mo21737a(new C7418z((String) it.next(), str));
            }
        }
    }

    /* renamed from: a */
    void mo21737a(C7418z zVar);

    /* renamed from: b */
    List mo21738b(String str);

    /* renamed from: c */
    void mo21739c(String str);

    /* renamed from: d */
    void mo21740d(String str, Set set);
}
