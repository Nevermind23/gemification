package p264ta;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9118j;

/* renamed from: ta.b */
public class C8430b implements C9118j {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m31637c(String str, C9104c cVar, C9110e eVar) {
        try {
            C8431c.m31640b(str);
            return cVar.mo24653h().mo129a(eVar);
        } finally {
            C8431c.m31639a();
        }
    }

    /* renamed from: a */
    public List mo23615a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C9104c cVar : componentRegistrar.getComponents()) {
            String i = cVar.mo24654i();
            if (i != null) {
                cVar = cVar.mo24660t(new C8429a(i, cVar));
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
