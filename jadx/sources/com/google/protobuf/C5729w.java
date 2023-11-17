package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w */
public class C5729w extends C5637c implements C5731x, RandomAccess {

    /* renamed from: f */
    private static final C5729w f18098f;

    /* renamed from: g */
    public static final C5731x f18099g;

    /* renamed from: e */
    private final List f18100e;

    static {
        C5729w wVar = new C5729w();
        f18098f = wVar;
        wVar.mo18555y();
        f18099g = wVar;
    }

    public C5729w() {
        this(10);
    }

    /* renamed from: g */
    private static String m23031g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5648f) {
            return ((C5648f) obj).mo18607E();
        }
        return C5716s.m22998i((byte[]) obj);
    }

    /* renamed from: G0 */
    public /* bridge */ /* synthetic */ boolean mo18543G0() {
        return super.mo18543G0();
    }

    /* renamed from: a0 */
    public List mo18578a0() {
        return Collections.unmodifiableList(this.f18100e);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public void add(int i, String str) {
        mo18547b();
        this.f18100e.add(i, str);
        this.modCount++;
    }

    public void clear() {
        mo18547b();
        this.f18100e.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo18580f(C5648f fVar) {
        mo18547b();
        this.f18100e.add(fVar);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public String get(int i) {
        Object obj = this.f18100e.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5648f) {
            C5648f fVar = (C5648f) obj;
            String E = fVar.mo18607E();
            if (fVar.mo18614o()) {
                this.f18100e.set(i, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = C5716s.m22998i(bArr);
        if (C5716s.m22996g(bArr)) {
            this.f18100e.set(i, i2);
        }
        return i2;
    }

    /* renamed from: j */
    public C5729w mo18774a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f18100e);
            return new C5729w(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public String remove(int i) {
        mo18547b();
        Object remove = this.f18100e.remove(i);
        this.modCount++;
        return m23031g(remove);
    }

    /* renamed from: l */
    public String set(int i, String str) {
        mo18547b();
        return m23031g(this.f18100e.set(i, str));
    }

    /* renamed from: q1 */
    public C5731x mo18584q1() {
        if (mo18543G0()) {
            return new C5645e1(this);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f18100e.size();
    }

    /* renamed from: z1 */
    public Object mo18586z1(int i) {
        return this.f18100e.get(i);
    }

    public C5729w(int i) {
        this(new ArrayList(i));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo18547b();
        if (collection instanceof C5731x) {
            collection = ((C5731x) collection).mo18578a0();
        }
        boolean addAll = this.f18100e.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C5729w(ArrayList arrayList) {
        this.f18100e = arrayList;
    }
}
