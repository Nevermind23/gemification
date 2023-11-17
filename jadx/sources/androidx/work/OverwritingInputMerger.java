package androidx.work;

import androidx.work.C1959e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger extends C2065j {
    /* renamed from: b */
    public C1959e mo6673b(List list) {
        C1959e.C1960a aVar = new C1959e.C1960a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((C1959e) it.next()).mo6729i());
        }
        aVar.mo6736d(hashMap);
        return aVar.mo6733a();
    }
}
