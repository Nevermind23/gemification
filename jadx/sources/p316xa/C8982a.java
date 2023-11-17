package p316xa;

import com.google.gson.internal.C5498b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: xa.a */
public class C8982a<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    protected C8982a() {
        Type b = m33254b();
        this.type = b;
        this.rawType = C5498b.m21921k(b);
        this.hashCode = b.hashCode();
    }

    /* renamed from: a */
    private static AssertionError m33253a(Type type2, Class... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    /* renamed from: b */
    private Type m33254b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Class<C8982a> cls = C8982a.class;
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                return C5498b.m21912b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* renamed from: c */
    private static boolean m33255c(Type type2, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            cls = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            boolean z = type2 instanceof Class;
            cls = type2;
            if (z) {
                Class<?> cls2 = (Class) type2;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return m33256d(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    /* renamed from: d */
    private static boolean m33256d(Type type2, ParameterizedType parameterizedType, Map map) {
        ParameterizedType parameterizedType2;
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class k = C5498b.m21921k(type2);
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        } else {
            parameterizedType2 = null;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = k.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = (Type) map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (m33258f(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type d : k.getGenericInterfaces()) {
            if (m33256d(d, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m33256d(k.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    /* renamed from: e */
    private static boolean m33257e(Type type2, Type type3, Map map) {
        if (type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m33258f(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!m33257e(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public static C8982a<?> get(Type type2) {
        return new C8982a<>(type2);
    }

    public static C8982a<?> getArray(Type type2) {
        return new C8982a<>(C5498b.m21911a(type2));
    }

    public static C8982a<?> getParameterized(Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        Objects.requireNonNull(typeArr);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            TypeVariable[] typeParameters = cls.getTypeParameters();
            int length = typeParameters.length;
            int length2 = typeArr.length;
            if (length2 == length) {
                for (int i = 0; i < length; i++) {
                    Type type3 = typeArr[i];
                    Class k = C5498b.m21921k(type3);
                    TypeVariable typeVariable = typeParameters[i];
                    Type[] bounds = typeVariable.getBounds();
                    int length3 = bounds.length;
                    int i2 = 0;
                    while (i2 < length3) {
                        if (C5498b.m21921k(bounds[i2]).isAssignableFrom(k)) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type2);
                        }
                    }
                }
                return new C8982a<>(C5498b.m21924n((Type) null, type2, typeArr));
            }
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        throw new IllegalArgumentException("rawType must be of type Class, but was " + type2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8982a) || !C5498b.m21916f(this.type, ((C8982a) obj).type)) {
            return false;
        }
        return true;
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return C5498b.m21930t(this.type);
    }

    public static <T> C8982a<T> get(Class<T> cls) {
        return new C8982a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C5498b.m21921k(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return m33256d(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw m33253a(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(C5498b.m21921k(type2)) || !m33255c(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    private C8982a(Type type2) {
        Objects.requireNonNull(type2);
        Type b = C5498b.m21912b(type2);
        this.type = b;
        this.rawType = C5498b.m21921k(b);
        this.hashCode = b.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(C8982a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
