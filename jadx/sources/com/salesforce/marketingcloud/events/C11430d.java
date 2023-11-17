package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: com.salesforce.marketingcloud.events.d */
public final class C11430d {

    /* renamed from: a */
    private static final String f33258a = C11461g.m41875a("EventUtilsKt");

    /* renamed from: com.salesforce.marketingcloud.events.d$a */
    static final class C11431a extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ Event f33259a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11431a(Event event) {
            super(0);
            this.f33259a = event;
        }

        /* renamed from: a */
        public final String invoke() {
            return '(' + this.f33259a + ") returned null during conversion to Push SDK Event.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.d$b */
    static final class C11432b extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ Object f33260a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11432b(Object obj) {
            super(0);
            this.f33260a = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to convert event '" + this.f33260a + "' to Push SDK Event.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.d$c */
    static final class C11433c extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ Event f33261a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11433c(Event event) {
            super(0);
            this.f33261a = event;
        }

        /* renamed from: a */
        public final String invoke() {
            return '(' + this.f33261a + ") returned null during conversion to SFMC SDK Event.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.d$d */
    static final class C11434d extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ Object f33262a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11434d(Object obj) {
            super(0);
            this.f33262a = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to convert event '" + this.f33262a + "' to SFMCSdk Event.";
        }
    }

    /* renamed from: a */
    public static final Event m41779a(Event event) {
        C41536l.m120489i(event, "<this>");
        return EventManager.Companion.customEvent(event.name(), event.attributes(), event.getProducer());
    }

    /* renamed from: b */
    public static final Event m41791b(Event event) {
        C41536l.m120489i(event, "<this>");
        return EventManager.Companion.customEvent$default(EventManager.Companion, event.name(), event.attributes(), Event.Producer.PUSH, (Event.Category) null, 8, (Object) null);
    }

    /* renamed from: a */
    public static final Map<String, List<Object>> m41780a(Event event) {
        C41536l.m120489i(event, "<this>");
        return m41782a((Map) new LinkedHashMap(), (Object) event.attributes(), (String) null, 4, (Object) null);
    }

    /* renamed from: b */
    public static final Event[] m41792b(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return m41790a(objArr, (EnumSet) null, 1, (Object) null);
    }

    /* renamed from: a */
    private static final Map<String, List<Object>> m41781a(Map<String, List<Object>> map, Object obj, String str) {
        try {
            if (obj instanceof List) {
                return m41783a(map, (List<Object>) C41527d0.m120456c(obj), str);
            }
            return obj instanceof Map ? m41784a(map, (Map<Object, Object>) C41527d0.m120457d(obj), str) : map;
        } catch (Exception unused) {
            return map;
        }
    }

    /* renamed from: b */
    public static final Event[] m41793b(Object[] objArr, EnumSet<Event.Producer> enumSet) {
        Object[] objArr2 = objArr;
        EnumSet<Event.Producer> enumSet2 = enumSet;
        C41536l.m120489i(objArr2, "<this>");
        C41536l.m120489i(enumSet2, "producers");
        ArrayList arrayList = new ArrayList();
        int length = objArr2.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr2[i];
            i++;
            if (obj != null) {
                try {
                    Event event = (Event) obj;
                    if (enumSet2.contains(event.getProducer())) {
                        Event b = m41791b(event);
                        if ((b == null ? null : Boolean.valueOf(arrayList.add(b))) == null) {
                            C11461g.m41887c(C11461g.f33306a, f33258a, (Throwable) null, new C11433c(event), 2, (Object) null);
                        }
                    }
                } catch (Exception unused) {
                    C11461g.m41893e(C11461g.f33306a, f33258a, (Throwable) null, new C11434d(obj), 2, (Object) null);
                }
            }
        }
        Object[] array = arrayList.toArray(new Event[0]);
        if (array != null) {
            return (Event[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    static /* synthetic */ Map m41782a(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = "";
        }
        return m41781a((Map<String, List<Object>>) map, obj, str);
    }

    /* renamed from: a */
    private static final Map<String, List<Object>> m41783a(Map<String, List<Object>> map, List<Object> list, String str) {
        for (Object next : list) {
            Locale locale = Locale.getDefault();
            C41536l.m120488h(locale, "getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                C41536l.m120488h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (next != null) {
                    if (m41785a(next)) {
                        map.putAll(m41781a(map, next, str));
                    } else {
                        Collection collection = map.get(lowerCase);
                        if (collection == null || collection.isEmpty()) {
                            map.put(lowerCase, C41341q.m119913p(next));
                        } else {
                            List list2 = map.get(lowerCase);
                            if (list2 != null) {
                                list2.add(next);
                            }
                        }
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return map;
    }

    /* renamed from: a */
    private static final Map<String, List<Object>> m41784a(Map<String, List<Object>> map, Map<Object, Object> map2, String str) {
        Locale locale;
        String str2;
        for (Map.Entry next : map2.entrySet()) {
            if (!C40439w.m117118v(str)) {
                str2 = str + '.' + next.getKey();
                locale = Locale.getDefault();
                C41536l.m120488h(locale, "getDefault()");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str2 = (String) next.getKey();
                locale = Locale.getDefault();
                C41536l.m120488h(locale, "getDefault()");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            String lowerCase = str2.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (m41785a(next.getValue())) {
                map.putAll(m41781a(map, next.getValue(), lowerCase));
            } else {
                Collection collection = map.get(lowerCase);
                if (collection == null || collection.isEmpty()) {
                    map.put(lowerCase, C41341q.m119913p(next.getValue()));
                } else {
                    List list = map.get(lowerCase);
                    if (list != null) {
                        list.add(next.getValue());
                    }
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    private static final boolean m41785a(Object obj) {
        if (obj instanceof Map) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        for (Object next : (Iterable) obj) {
            if (next != null && m41785a(next)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final Event[] m41786a(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return m41789a(objArr, (EnumSet) null, (EnumSet) null, 3, (Object) null);
    }

    /* renamed from: a */
    public static final Event[] m41787a(Object[] objArr, EnumSet<Event.Producer> enumSet) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(enumSet, "producers");
        return m41789a(objArr, (EnumSet) enumSet, (EnumSet) null, 2, (Object) null);
    }

    /* renamed from: a */
    public static final Event[] m41788a(Object[] objArr, EnumSet<Event.Producer> enumSet, EnumSet<Event.Category> enumSet2) {
        Object[] objArr2 = objArr;
        EnumSet<Event.Producer> enumSet3 = enumSet;
        EnumSet<Event.Category> enumSet4 = enumSet2;
        C41536l.m120489i(objArr2, "<this>");
        C41536l.m120489i(enumSet3, "producers");
        C41536l.m120489i(enumSet4, "categories");
        ArrayList arrayList = new ArrayList();
        int length = objArr2.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr2[i];
            i++;
            if (obj != null) {
                try {
                    Event event = (Event) obj;
                    if (enumSet3.contains(event.getProducer()) && enumSet4.contains(event.getCategory())) {
                        Event a = m41779a(event);
                        if ((a == null ? null : Boolean.valueOf(arrayList.add(a))) == null) {
                            C11461g.m41887c(C11461g.f33306a, f33258a, (Throwable) null, new C11431a(event), 2, (Object) null);
                        }
                    }
                } catch (Exception unused) {
                    C11461g.m41883b(C11461g.f33306a, f33258a, (Throwable) null, new C11432b(obj), 2, (Object) null);
                }
            }
        }
        Object[] array = arrayList.toArray(new Event[0]);
        if (array != null) {
            return (Event[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static /* synthetic */ Event[] m41789a(Object[] objArr, EnumSet<E> enumSet, EnumSet<E> enumSet2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumSet = EnumSet.allOf(Event.Producer.class);
            C41536l.m120488h(enumSet, "allOf(\n        UnifiedSd…roducer::class.java\n    )");
        }
        if ((i & 2) != 0) {
            enumSet2 = EnumSet.allOf(Event.Category.class);
            C41536l.m120488h(enumSet2, "allOf(UnifiedSdkEvent.Category::class.java)");
        }
        return m41788a(objArr, (EnumSet<Event.Producer>) enumSet, (EnumSet<Event.Category>) enumSet2);
    }

    /* renamed from: a */
    public static /* synthetic */ Event[] m41790a(Object[] objArr, EnumSet<E> enumSet, int i, Object obj) {
        if ((i & 1) != 0) {
            enumSet = EnumSet.allOf(Event.Producer.class);
            C41536l.m120488h(enumSet, "allOf(UnifiedSdkEvent.Producer::class.java)");
        }
        return m41793b(objArr, enumSet);
    }
}
