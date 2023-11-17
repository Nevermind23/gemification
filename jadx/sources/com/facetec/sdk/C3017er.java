package com.facetec.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facetec.sdk.er */
public final class C3017er {

    /* renamed from: c */
    private final C3139ft f10149c = C3139ft.m12886d();

    /* renamed from: d */
    private final Map<Type, C2979dw<?>> f10150d;

    public C3017er(Map<Type, C2979dw<?>> map) {
        this.f10150d = map;
    }

    /* renamed from: c */
    private <T> C3038ev<T> m12648c(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f10149c.mo9330b(declaredConstructor);
            }
            return new C3038ev<T>() {
                /* renamed from: a */
                public final T mo9206a() {
                    try {
                        return declaredConstructor.newInstance((Object[]) null);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InvocationTargetException e2) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> C3038ev<T> mo9204a(C3142fw<T> fwVar) {
        C3038ev<T> evVar;
        final Type b = fwVar.mo9332b();
        final Class<? super T> a = fwVar.mo9331a();
        final C2979dw dwVar = this.f10150d.get(b);
        if (dwVar != null) {
            return new C3038ev<T>() {
                /* renamed from: a */
                public final T mo9206a() {
                    return dwVar.mo9139a();
                }
            };
        }
        final C2979dw dwVar2 = this.f10150d.get(a);
        if (dwVar2 != null) {
            return new C3038ev<T>() {
                /* renamed from: a */
                public final T mo9206a() {
                    return dwVar2.mo9139a();
                }
            };
        }
        C3038ev<T> c = m12648c(a);
        if (c != null) {
            return c;
        }
        if (Collection.class.isAssignableFrom(a)) {
            if (SortedSet.class.isAssignableFrom(a)) {
                evVar = new C3038ev() {
                    /* renamed from: a */
                    public final Object mo9206a() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(a)) {
                evVar = new C3038ev() {
                    /* renamed from: a */
                    public final Object mo9206a() {
                        Type type = b;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return EnumSet.noneOf((Class) type2);
                            }
                            StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                            sb.append(b.toString());
                            throw new C2997eb(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                        sb2.append(b.toString());
                        throw new C2997eb(sb2.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(a)) {
                evVar = new C3038ev() {
                    /* renamed from: a */
                    public final Object mo9206a() {
                        return new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(a)) {
                evVar = new C3038ev() {
                    /* renamed from: a */
                    public final Object mo9206a() {
                        return new ArrayDeque();
                    }
                };
            } else {
                evVar = new C3038ev() {
                    /* renamed from: a */
                    public final Object mo9206a() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(a)) {
            evVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(a)) {
            evVar = new C3038ev() {
                /* renamed from: a */
                public final Object mo9206a() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(a)) {
            evVar = new C3038ev() {
                /* renamed from: a */
                public final Object mo9206a() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(a)) {
            evVar = new C3038ev() {
                /* renamed from: a */
                public final Object mo9206a() {
                    return new TreeMap();
                }
            };
        } else {
            if (b instanceof ParameterizedType) {
                if (!String.class.isAssignableFrom(C3142fw.m12893c(((ParameterizedType) b).getActualTypeArguments()[0]).mo9331a())) {
                    evVar = new C3038ev() {
                        /* renamed from: a */
                        public final Object mo9206a() {
                            return new LinkedHashMap();
                        }
                    };
                }
            }
            evVar = new C3038ev() {
                /* renamed from: a */
                public final Object mo9206a() {
                    return new C3040ex();
                }
            };
        }
        if (evVar != null) {
            return evVar;
        }
        return new C3038ev() {

            /* renamed from: e */
            private final C3068fd f10169e = C3068fd.m12715d();

            /* renamed from: a */
            public final Object mo9206a() {
                try {
                    return this.f10169e.mo9283d(a);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(b);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }

    public final String toString() {
        return this.f10150d.toString();
    }
}
