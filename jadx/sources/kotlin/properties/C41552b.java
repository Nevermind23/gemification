package kotlin.properties;

import af1.C40303i;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: kotlin.properties.b */
final class C41552b implements C41555e {

    /* renamed from: a */
    private Object f97719a;

    public Object getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(iVar, "property");
        Object obj2 = this.f97719a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + iVar.getName() + " should be initialized before get.");
    }

    public void setValue(Object obj, C40303i iVar, Object obj2) {
        C41536l.m120489i(iVar, "property");
        C41536l.m120489i(obj2, C11755a.C11756a.f34100b);
        this.f97719a = obj2;
    }
}
