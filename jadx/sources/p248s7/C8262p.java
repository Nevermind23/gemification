package p248s7;

import android.os.Bundle;
import com.salesforce.marketingcloud.storage.p385db.C11755a;

/* renamed from: s7.p */
public abstract class C8262p {
    /* renamed from: a */
    public static Object m31092a(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    /* renamed from: b */
    public static void m31093b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(C11755a.C11756a.f34100b, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(C11755a.C11756a.f34100b, ((Long) obj).longValue());
        } else {
            bundle.putString(C11755a.C11756a.f34100b, obj.toString());
        }
    }
}
