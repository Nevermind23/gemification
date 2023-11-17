package p342j$.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.Function;

/* renamed from: j$.util.f */
final class C9418f implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f26061a;

    /* renamed from: b */
    final Object f26062b = this;

    /* renamed from: c */
    private transient Set f26063c;

    /* renamed from: d */
    private transient Set f26064d;

    /* renamed from: e */
    private transient Collection f26065e;

    C9418f(Map map) {
        map.getClass();
        this.f26061a = map;
    }

    /* renamed from: a */
    private static Set m34766a(Set set, Object obj) {
        if (DesugarCollections.f25929f == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f25929f.newInstance(new Object[]{set, obj});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    public final void clear() {
        synchronized (this.f26062b) {
            this.f26061a.clear();
        }
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        Object s;
        synchronized (this.f26062b) {
            s = C9381a.m34659s(this.f26061a, obj, biFunction);
        }
        return s;
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        Object t;
        synchronized (this.f26062b) {
            t = C9381a.m34660t(this.f26061a, obj, function);
        }
        return t;
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object u;
        synchronized (this.f26062b) {
            u = C9381a.m34661u(this.f26061a, obj, biFunction);
        }
        return u;
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f26062b) {
            containsKey = this.f26061a.containsKey(obj);
        }
        return containsKey;
    }

    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f26062b) {
            containsValue = this.f26061a.containsValue(obj);
        }
        return containsValue;
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.f26062b) {
            if (this.f26064d == null) {
                this.f26064d = m34766a(this.f26061a.entrySet(), this.f26062b);
            }
            set = this.f26064d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f26062b) {
            equals = this.f26061a.equals(obj);
        }
        return equals;
    }

    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f26062b) {
            C9381a.m34640E(this.f26061a, biConsumer);
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f26062b) {
            obj2 = this.f26061a.get(obj);
        }
        return obj2;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object F;
        synchronized (this.f26062b) {
            F = C9381a.m34641F(this.f26061a, obj, obj2);
        }
        return F;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f26062b) {
            hashCode = this.f26061a.hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f26062b) {
            isEmpty = this.f26061a.isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.f26062b) {
            if (this.f26063c == null) {
                this.f26063c = m34766a(this.f26061a.keySet(), this.f26062b);
            }
            set = this.f26063c;
        }
        return set;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object G;
        synchronized (this.f26062b) {
            G = C9381a.m34642G(this.f26061a, obj, obj2, biFunction);
        }
        return G;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f26062b) {
            put = this.f26061a.put(obj, obj2);
        }
        return put;
    }

    public final void putAll(Map map) {
        synchronized (this.f26062b) {
            this.f26061a.putAll(map);
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object H;
        synchronized (this.f26062b) {
            H = C9381a.m34643H(this.f26061a, obj, obj2);
        }
        return H;
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f26062b) {
            remove = this.f26061a.remove(obj);
        }
        return remove;
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean I;
        synchronized (this.f26062b) {
            I = C9381a.m34644I(this.f26061a, obj, obj2);
        }
        return I;
    }

    public final Object replace(Object obj, Object obj2) {
        Object J;
        synchronized (this.f26062b) {
            J = C9381a.m34645J(this.f26061a, obj, obj2);
        }
        return J;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean K;
        synchronized (this.f26062b) {
            K = C9381a.m34646K(this.f26061a, obj, obj2, obj3);
        }
        return K;
    }

    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f26062b) {
            C9381a.m34647L(this.f26061a, biFunction);
        }
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final int size() {
        int size;
        synchronized (this.f26062b) {
            size = this.f26061a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f26062b) {
            obj = this.f26061a.toString();
        }
        return obj;
    }

    public final Collection values() {
        Collection collection;
        Collection collection2;
        synchronized (this.f26062b) {
            if (this.f26065e == null) {
                Collection values = this.f26061a.values();
                Object obj = this.f26062b;
                if (DesugarCollections.f25928e == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        collection2 = (Collection) DesugarCollections.f25928e.newInstance(new Object[]{values, obj});
                    } catch (InstantiationException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f26065e = collection2;
            }
            collection = this.f26065e;
        }
        return collection;
    }
}
