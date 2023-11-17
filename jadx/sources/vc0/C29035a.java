package vc0;

import ad0.C19227a;
import androidx.collection.ArrayMap;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionaryDataEntity;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionarySegmentRelations;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionarySubstitute;
import rc0.C27999b;
import xc0.C29740b;

/* renamed from: vc0.a */
public final class C29035a {

    /* renamed from: vc0.a$a */
    public static final class C29036a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((DictionarySubstitute) obj).getPriority(), ((DictionarySubstitute) obj2).getPriority());
        }
    }

    /* renamed from: c */
    public static /* synthetic */ ArrayMap m88854c(C29035a aVar, DictionaryDataEntity dictionaryDataEntity, String str, ArrayMap arrayMap, int i, Object obj) {
        if ((i & 4) != 0) {
            arrayMap = null;
        }
        return aVar.mo68905b(dictionaryDataEntity, str, arrayMap);
    }

    /* renamed from: d */
    private final DictionarySubstitute m88855d(DictionarySubstitute dictionarySubstitute) {
        String originalSegmentDct = dictionarySubstitute.getOriginalSegmentDct();
        if (originalSegmentDct == null) {
            originalSegmentDct = C27999b.COMMON.mo67555c();
        }
        return DictionarySubstitute.copy$default(dictionarySubstitute, originalSegmentDct, (String) null, (String) null, 6, (Object) null);
    }

    /* renamed from: f */
    private final List m88856f(DictionarySegmentRelations dictionarySegmentRelations, String str) {
        List<DictionarySubstitute> substitutes;
        if (dictionarySegmentRelations == null || (substitutes = dictionarySegmentRelations.getSubstitutes()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(substitutes, 10));
        for (DictionarySubstitute d : substitutes) {
            arrayList.add(m88855d(d));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (C41536l.m120484d(((DictionarySubstitute) next).getOriginalSegmentDct(), str)) {
                arrayList2.add(next);
            }
        }
        return C41358y.m120030t0(arrayList2, new C29036a());
    }

    /* renamed from: a */
    public final C19227a mo68904a(C29740b bVar) {
        C41536l.m120489i(bVar, "entry");
        return new C19227a(bVar.getKey(), bVar.mo69742a(), bVar.mo69743b(), bVar.mo69744c());
    }

    /* renamed from: b */
    public final ArrayMap mo68905b(DictionaryDataEntity dictionaryDataEntity, String str, ArrayMap arrayMap) {
        ArrayMap arrayMap2;
        C19227a aVar;
        C41536l.m120489i(dictionaryDataEntity, "dictionary");
        C41536l.m120489i(str, "segment");
        if (arrayMap == null) {
            arrayMap2 = new ArrayMap();
        } else {
            arrayMap2 = arrayMap;
        }
        Map<String, String> en = dictionaryDataEntity.getEN();
        if (en != null) {
            for (Map.Entry next : en.entrySet()) {
                arrayMap2.put(next.getKey(), new C19227a((String) next.getKey(), str, (String) next.getValue(), (String) null, 8, (DefaultConstructorMarker) null));
            }
        }
        Map<String, String> ge = dictionaryDataEntity.getGE();
        if (ge != null) {
            for (Map.Entry next2 : ge.entrySet()) {
                C19227a aVar2 = (C19227a) arrayMap2.get(next2.getKey());
                if (aVar2 == null) {
                    aVar = new C19227a((String) next2.getKey(), str, (String) null, (String) null, 12, (DefaultConstructorMarker) null);
                } else {
                    aVar = aVar2;
                }
                arrayMap2.put(next2.getKey(), C19227a.m64666b(aVar, (String) null, (String) null, (String) null, (String) next2.getValue(), 7, (Object) null));
            }
        }
        return arrayMap2;
    }

    /* renamed from: e */
    public final ArrayMap mo68906e(ArrayMap arrayMap, String str, DictionarySegmentRelations dictionarySegmentRelations) {
        Object obj;
        C41536l.m120489i(arrayMap, "commonData");
        C41536l.m120489i(str, "segment");
        List<C27999b> c = C41331l.m119759c(C27999b.values());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C27999b c2 : c) {
            arrayList.add(c2.mo67555c());
        }
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
        List p = C41341q.m119913p(str);
        arrayList2.remove(str);
        Iterable<DictionarySubstitute> f = m88856f(dictionarySegmentRelations, str);
        if (f == null) {
            f = new ArrayList<>();
        }
        for (DictionarySubstitute dictionarySubstitute : f) {
            String substituteSegment = dictionarySubstitute.getSubstituteSegment();
            if (substituteSegment != null) {
                p.add(substituteSegment);
            }
            arrayList2.remove(dictionarySubstitute.getSubstituteSegment());
        }
        for (String str2 : arrayList2) {
            C41536l.m120488h(str2, "it");
            p.add(str2);
        }
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayList arrayList3 = new ArrayList(arrayMap.size());
        for (Map.Entry entry : arrayMap.entrySet()) {
            Object value = entry.getValue();
            C41536l.m120488h(value, "entry.value");
            Iterator it = ((Iterable) value).iterator();
            C41238w wVar = null;
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int indexOf = p.indexOf(((C19227a) obj).mo47464d());
                    if (indexOf == -1) {
                        indexOf = 99;
                    }
                    do {
                        Object next = it.next();
                        int indexOf2 = p.indexOf(((C19227a) next).mo47464d());
                        if (indexOf2 == -1) {
                            indexOf2 = 99;
                        }
                        if (indexOf > indexOf2) {
                            obj = next;
                            indexOf = indexOf2;
                        }
                    } while (it.hasNext());
                }
            }
            C19227a aVar = (C19227a) obj;
            if (aVar != null) {
                arrayMap2.put(entry.getKey(), aVar);
                wVar = C41238w.f97225a;
            }
            arrayList3.add(wVar);
        }
        return arrayMap2;
    }
}
