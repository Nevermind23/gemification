package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.p016os.C0908e;
import androidx.savedstate.C1846a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41233s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41568k;

/* renamed from: androidx.lifecycle.f0 */
public final class C1580f0 {

    /* renamed from: f */
    public static final C1581a f4582f = new C1581a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Class[] f4583g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map f4584a;

    /* renamed from: b */
    private final Map f4585b;

    /* renamed from: c */
    private final Map f4586c;

    /* renamed from: d */
    private final Map f4587d;

    /* renamed from: e */
    private final C1846a.C1849c f4588e;

    /* renamed from: androidx.lifecycle.f0$a */
    public static final class C1581a {
        private C1581a() {
        }

        public /* synthetic */ C1581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1580f0 mo4895a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C11769i.C11770a.f34151n);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = parcelableArrayList.get(i);
                        C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
                    return new C1580f0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new C1580f0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    C41536l.m120488h(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new C1580f0(hashMap);
            }
        }

        /* renamed from: b */
        public final boolean mo4896b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1580f0.f4583g) {
                C41536l.m120486f(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1580f0(Map map) {
        C41536l.m120489i(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4584a = linkedHashMap;
        this.f4585b = new LinkedHashMap();
        this.f4586c = new LinkedHashMap();
        this.f4587d = new LinkedHashMap();
        this.f4588e = new C1578e0(this);
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m5607d(C1580f0 f0Var) {
        C41536l.m120489i(f0Var, "this$0");
        for (Map.Entry entry : C41344r0.m119941w(f0Var.f4585b).entrySet()) {
            f0Var.mo4894e((String) entry.getKey(), ((C1846a.C1849c) entry.getValue()).mo350a());
        }
        Set<String> keySet = f0Var.f4584a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(f0Var.f4584a.get(str));
        }
        return C0908e.m3336b(C41233s.m119492a(C11769i.C11770a.f34151n, arrayList), C41233s.m119492a("values", arrayList2));
    }

    /* renamed from: c */
    public final C1846a.C1849c mo4893c() {
        return this.f4588e;
    }

    /* renamed from: e */
    public final void mo4894e(String str, Object obj) {
        C1644x xVar;
        C41536l.m120489i(str, "key");
        if (f4582f.mo4896b(obj)) {
            Object obj2 = this.f4586c.get(str);
            if (obj2 instanceof C1644x) {
                xVar = (C1644x) obj2;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                xVar.mo4826r(obj);
            } else {
                this.f4584a.put(str, obj);
            }
            C41568k kVar = (C41568k) this.f4587d.get(str);
            if (kVar != null) {
                kVar.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C41536l.m120486f(obj);
        sb.append(obj.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public C1580f0() {
        this.f4584a = new LinkedHashMap();
        this.f4585b = new LinkedHashMap();
        this.f4586c = new LinkedHashMap();
        this.f4587d = new LinkedHashMap();
        this.f4588e = new C1578e0(this);
    }
}
