package p110i;

import java.util.HashMap;
import java.util.Map;
import p110i.C6495b;

/* renamed from: i.a */
public class C6494a extends C6495b {

    /* renamed from: h */
    private final HashMap f19827h = new HashMap();

    public boolean contains(Object obj) {
        return this.f19827h.containsKey(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C6495b.C6498c mo20413g(Object obj) {
        return (C6495b.C6498c) this.f19827h.get(obj);
    }

    /* renamed from: l */
    public Object mo20414l(Object obj, Object obj2) {
        C6495b.C6498c g = mo20413g(obj);
        if (g != null) {
            return g.f19833e;
        }
        this.f19827h.put(obj, mo20424k(obj, obj2));
        return null;
    }

    /* renamed from: n */
    public Object mo20415n(Object obj) {
        Object n = super.mo20415n(obj);
        this.f19827h.remove(obj);
        return n;
    }

    /* renamed from: o */
    public Map.Entry mo20416o(Object obj) {
        if (contains(obj)) {
            return ((C6495b.C6498c) this.f19827h.get(obj)).f19835g;
        }
        return null;
    }
}
