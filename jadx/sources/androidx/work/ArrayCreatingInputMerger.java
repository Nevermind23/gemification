package androidx.work;

import androidx.work.C1959e;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

public final class ArrayCreatingInputMerger extends C2065j {
    /* renamed from: c */
    private final Object m7642c(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        C41536l.m120488h(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: d */
    private final Object m7643d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        C41536l.m120486f(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        C41536l.m120488h(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: e */
    private final Object m7644e(Object obj, Class cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        C41536l.m120488h(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: b */
    public C1959e mo6673b(List list) {
        Class cls;
        C41536l.m120489i(list, "inputs");
        C1959e.C1960a aVar = new C1959e.C1960a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map i = ((C1959e) it.next()).mo6729i();
            C41536l.m120488h(i, "input.keyValueMap");
            Iterator it2 = i.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        cls = value.getClass();
                    } else {
                        cls = String.class;
                    }
                    Object obj = hashMap.get(str);
                    C41536l.m120488h(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (C41536l.m120484d(cls2, cls)) {
                            C41536l.m120488h(value, C11755a.C11756a.f34100b);
                            value = m7643d(obj, value);
                        } else if (C41536l.m120484d(cls2.getComponentType(), cls)) {
                            value = m7642c(obj, value, cls);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = m7644e(value, cls);
                    }
                    C41536l.m120488h(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.mo6736d(hashMap);
        C1959e a = aVar.mo6733a();
        C41536l.m120488h(a, "output.build()");
        return a;
    }
}
