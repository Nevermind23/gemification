package w81;

import androidx.collection.ArrayMap;

/* renamed from: w81.a */
public class C39616a extends ArrayMap {

    /* renamed from: d */
    protected Object f94125d;

    public C39616a(Object obj) {
        this.f94125d = obj;
    }

    public Object get(Object obj) {
        return containsKey(obj) ? super.get(obj) : this.f94125d;
    }
}
