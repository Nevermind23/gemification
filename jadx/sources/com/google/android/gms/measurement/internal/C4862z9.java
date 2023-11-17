package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C4092a5;
import com.google.android.gms.internal.measurement.C4109b5;
import com.google.android.gms.internal.measurement.C4159e4;
import com.google.android.gms.internal.measurement.C4176f4;
import com.google.android.gms.internal.measurement.C4193g4;
import com.google.android.gms.internal.measurement.C4210h4;
import com.google.android.gms.internal.measurement.C4388rc;
import com.google.android.gms.internal.measurement.C4497y4;
import com.google.android.gms.internal.measurement.C4513z4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p248s7.C8248c0;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
final class C4862z9 {

    /* renamed from: a */
    private String f15083a;

    /* renamed from: b */
    private boolean f15084b;

    /* renamed from: c */
    private C4513z4 f15085c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f15086d;

    /* renamed from: e */
    private BitSet f15087e;

    /* renamed from: f */
    private Map f15088f;

    /* renamed from: g */
    private Map f15089g;

    /* renamed from: h */
    final /* synthetic */ C4585b f15090h;

    /* synthetic */ C4862z9(C4585b bVar, String str, C8248c0 c0Var) {
        this.f15090h = bVar;
        this.f15083a = str;
        this.f15084b = true;
        this.f15086d = new BitSet();
        this.f15087e = new BitSet();
        this.f15088f = new ArrayMap();
        this.f15089g = new ArrayMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4176f4 mo14980a(int i) {
        ArrayList arrayList;
        List list;
        C4159e4 B = C4176f4.m15800B();
        B.mo13052p(i);
        B.mo13054r(this.f15084b);
        C4513z4 z4Var = this.f15085c;
        if (z4Var != null) {
            B.mo13055s(z4Var);
        }
        C4497y4 E = C4513z4.m17283E();
        E.mo13823q(C4741o9.m18053H(this.f15086d));
        E.mo13825s(C4741o9.m18053H(this.f15087e));
        Map map = this.f15088f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f15088f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f15088f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C4193g4 C = C4210h4.m15971C();
                    C.mo13145q(intValue2);
                    C.mo13144p(l.longValue());
                    arrayList2.add((C4210h4) C.mo13361l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            E.mo13822p(arrayList);
        }
        Map map2 = this.f15089g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f15089g.keySet()) {
                C4092a5 D = C4109b5.m15545D();
                D.mo12840q(num.intValue());
                List list2 = (List) this.f15089g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    D.mo12839p(list2);
                }
                arrayList3.add((C4109b5) D.mo13361l());
            }
            list = arrayList3;
        }
        E.mo13824r(list);
        B.mo13053q(E);
        return (C4176f4) B.mo13361l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14981c(C4608ca caVar) {
        int a = caVar.mo14315a();
        Boolean bool = caVar.f14250c;
        if (bool != null) {
            BitSet bitSet = this.f15087e;
            bool.booleanValue();
            bitSet.set(a, true);
        }
        Boolean bool2 = caVar.f14251d;
        if (bool2 != null) {
            this.f15086d.set(a, bool2.booleanValue());
        }
        if (caVar.f14252e != null) {
            Map map = this.f15088f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = caVar.f14252e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f15088f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (caVar.f14253f != null) {
            Map map2 = this.f15089g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f15089g.put(valueOf2, list);
            }
            if (caVar.mo14317c()) {
                list.clear();
            }
            C4388rc.m16600c();
            C4643g z = this.f15090h.f14613a.mo14876z();
            String str = this.f15083a;
            C4625e3 e3Var = C4636f3.f14361a0;
            if (z.mo14398B(str, e3Var) && caVar.mo14316b()) {
                list.clear();
            }
            C4388rc.m16600c();
            if (this.f15090h.f14613a.mo14876z().mo14398B(this.f15083a, e3Var)) {
                Long valueOf3 = Long.valueOf(caVar.f14253f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(caVar.f14253f.longValue() / 1000));
        }
    }

    /* synthetic */ C4862z9(C4585b bVar, String str, C4513z4 z4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C8248c0 c0Var) {
        this.f15090h = bVar;
        this.f15083a = str;
        this.f15086d = bitSet;
        this.f15087e = bitSet2;
        this.f15088f = map;
        this.f15089g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f15089g.put(num, arrayList);
        }
        this.f15084b = false;
        this.f15085c = z4Var;
    }
}
