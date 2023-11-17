package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlinx.coroutines.internal.j */
public abstract class C41604j {
    /* renamed from: a */
    public static Object m120699a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m120700b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m120699a(obj);
    }

    /* renamed from: c */
    public static final Object m120701c(Object obj, Object obj2) {
        if (obj == null) {
            return m120699a(obj2);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return m120699a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m120699a(arrayList);
    }
}
