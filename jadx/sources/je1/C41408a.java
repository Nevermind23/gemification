package je1;

import ie1.C41318f;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.a */
public abstract class C41408a extends C41318f {
    /* renamed from: c */
    public final boolean mo96043c(Map.Entry entry) {
        C41536l.m120489i(entry, "element");
        return mo96045i(entry);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo96043c((Map.Entry) obj);
    }

    /* renamed from: i */
    public abstract boolean mo96045i(Map.Entry entry);

    /* renamed from: l */
    public abstract /* bridge */ boolean mo96046l(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo96046l((Map.Entry) obj);
    }
}
