package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.C1005e;
import androidx.core.util.C1006f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0650a {

    /* renamed from: a */
    private final C1005e f3234a = new C1006f(10);

    /* renamed from: b */
    private final SimpleArrayMap f3235b = new SimpleArrayMap();

    /* renamed from: c */
    private final ArrayList f3236c = new ArrayList();

    /* renamed from: d */
    private final HashSet f3237d = new HashSet();

    /* renamed from: e */
    private void m2568e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f3235b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2568e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList m2569f() {
        ArrayList arrayList = (ArrayList) this.f3234a.mo3440b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: k */
    private void m2570k(ArrayList arrayList) {
        arrayList.clear();
        this.f3234a.mo3439a(arrayList);
    }

    /* renamed from: a */
    public void mo3084a(Object obj, Object obj2) {
        if (!this.f3235b.containsKey(obj) || !this.f3235b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f3235b.get(obj);
        if (arrayList == null) {
            arrayList = m2569f();
            this.f3235b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    /* renamed from: b */
    public void mo3085b(Object obj) {
        if (!this.f3235b.containsKey(obj)) {
            this.f3235b.put(obj, null);
        }
    }

    /* renamed from: c */
    public void mo3086c() {
        int size = this.f3235b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3235b.valueAt(i);
            if (arrayList != null) {
                m2570k(arrayList);
            }
        }
        this.f3235b.clear();
    }

    /* renamed from: d */
    public boolean mo3087d(Object obj) {
        return this.f3235b.containsKey(obj);
    }

    /* renamed from: g */
    public List mo3088g(Object obj) {
        return (List) this.f3235b.get(obj);
    }

    /* renamed from: h */
    public List mo3089h(Object obj) {
        int size = this.f3235b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f3235b.valueAt(i);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3235b.keyAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList mo3090i() {
        this.f3236c.clear();
        this.f3237d.clear();
        int size = this.f3235b.size();
        for (int i = 0; i < size; i++) {
            m2568e(this.f3235b.keyAt(i), this.f3236c, this.f3237d);
        }
        return this.f3236c;
    }

    /* renamed from: j */
    public boolean mo3091j(Object obj) {
        int size = this.f3235b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3235b.valueAt(i);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
