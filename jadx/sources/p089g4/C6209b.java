package p089g4;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: g4.b */
public final class C6209b extends ArrayMap {

    /* renamed from: d */
    private int f19223d;

    public void clear() {
        this.f19223d = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f19223d == 0) {
            this.f19223d = super.hashCode();
        }
        return this.f19223d;
    }

    public Object put(Object obj, Object obj2) {
        this.f19223d = 0;
        return super.put(obj, obj2);
    }

    public void putAll(SimpleArrayMap simpleArrayMap) {
        this.f19223d = 0;
        super.putAll(simpleArrayMap);
    }

    public Object removeAt(int i) {
        this.f19223d = 0;
        return super.removeAt(i);
    }

    public Object setValueAt(int i, Object obj) {
        this.f19223d = 0;
        return super.setValueAt(i, obj);
    }
}
