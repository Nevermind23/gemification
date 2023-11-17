package p342j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;

/* renamed from: j$.util.DesugarCollections */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f25924a;

    /* renamed from: b */
    static final Class f25925b = Collections.synchronizedList(new LinkedList()).getClass();

    /* renamed from: c */
    private static final Field f25926c;

    /* renamed from: d */
    private static final Field f25927d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Constructor f25928e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Constructor f25929f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f25924a = cls;
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f25926c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f25927d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        Class<Object> cls2 = Object.class;
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(new Class[]{Set.class, cls2});
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f25929f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(new Class[]{Collection.class, cls2});
        } catch (NoSuchMethodException unused4) {
        }
        f25928e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* renamed from: c */
    public static void m34576c(Iterable iterable, Consumer consumer) {
        Field field = f25926c;
        if (field == null) {
            try {
                Collection$EL.m34569a((Collection) f25927d.get(iterable), consumer);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(iterable)) {
                    Collection$EL.m34569a((Collection) f25927d.get(iterable), consumer);
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection forEach.", e2);
            }
        }
    }

    /* renamed from: d */
    static boolean m34577d(Collection collection, Predicate predicate) {
        boolean m;
        Field field = f25926c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f25927d.get(collection);
                return collection2 instanceof C9383b ? ((C9383b) collection2).mo25303m(predicate) : C9381a.m34654n(collection2, predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    Collection collection3 = (Collection) f25927d.get(collection);
                    m = collection3 instanceof C9383b ? ((C9383b) collection3).mo25303m(predicate) : C9381a.m34654n(collection3, predicate);
                }
                return m;
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
            }
        }
    }

    /* renamed from: e */
    static void m34578e(List list, Comparator comparator) {
        Field field = f25926c;
        if (field == null) {
            try {
                List$EL.sort((List) f25927d.get(list), comparator);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    List$EL.sort((List) f25927d.get(list), comparator);
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list sort.", e2);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C9418f(map);
    }
}
