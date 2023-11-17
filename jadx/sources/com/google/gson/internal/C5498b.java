package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
public abstract class C5498b {

    /* renamed from: a */
    static final Type[] f17575a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    private static final class C5499a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: d */
        private final Type f17576d;

        public C5499a(Type type) {
            Objects.requireNonNull(type);
            this.f17576d = C5498b.m21912b(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C5498b.m21916f(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public Type getGenericComponentType() {
            return this.f17576d;
        }

        public int hashCode() {
            return this.f17576d.hashCode();
        }

        public String toString() {
            return C5498b.m21930t(this.f17576d) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    private static final class C5500b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: d */
        private final Type f17577d;

        /* renamed from: e */
        private final Type f17578e;

        /* renamed from: f */
        private final Type[] f17579f;

        public C5500b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C5497a.m21910a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C5498b.m21912b(type);
            }
            this.f17577d = type3;
            this.f17578e = C5498b.m21912b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f17579f = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f17579f[i]);
                C5498b.m21913c(this.f17579f[i]);
                Type[] typeArr3 = this.f17579f;
                typeArr3[i] = C5498b.m21912b(typeArr3[i]);
            }
        }

        /* renamed from: a */
        private static int m21931a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C5498b.m21916f(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f17579f.clone();
        }

        public Type getOwnerType() {
            return this.f17577d;
        }

        public Type getRawType() {
            return this.f17578e;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f17579f) ^ this.f17578e.hashCode()) ^ m21931a(this.f17577d);
        }

        public String toString() {
            int length = this.f17579f.length;
            if (length == 0) {
                return C5498b.m21930t(this.f17578e);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C5498b.m21930t(this.f17578e));
            sb.append("<");
            sb.append(C5498b.m21930t(this.f17579f[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C5498b.m21930t(this.f17579f[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    private static final class C5501c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: d */
        private final Type f17580d;

        /* renamed from: e */
        private final Type f17581e;

        public C5501c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C5497a.m21910a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C5497a.m21910a(z2);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C5498b.m21913c(typeArr2[0]);
                Class<Object> cls = Object.class;
                C5497a.m21910a(typeArr[0] != cls ? false : z3);
                this.f17581e = C5498b.m21912b(typeArr2[0]);
                this.f17580d = cls;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            C5498b.m21913c(typeArr[0]);
            this.f17581e = null;
            this.f17580d = C5498b.m21912b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C5498b.m21916f(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            Type type = this.f17581e;
            if (type == null) {
                return C5498b.f17575a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f17580d};
        }

        public int hashCode() {
            int i;
            Type type = this.f17581e;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f17580d.hashCode() + 31);
        }

        public String toString() {
            if (this.f17581e != null) {
                return "? super " + C5498b.m21930t(this.f17581e);
            } else if (this.f17580d == Object.class) {
                return "?";
            } else {
                return "? extends " + C5498b.m21930t(this.f17580d);
            }
        }
    }

    /* renamed from: a */
    public static GenericArrayType m21911a(Type type) {
        return new C5499a(type);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m21912b(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m21912b(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.b$b r0 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.b$c r0 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C5498b.m21912b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    static void m21913c(Type type) {
        C5497a.m21910a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    private static Class m21914d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m21915e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m21916f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m21915e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m21916f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: g */
    public static Type m21917g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m21918h(Type type, Class cls) {
        Type l = m21922l(type, cls, Collection.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    private static Type m21919i(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m21919i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m21919i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m21920j(Type type, Class cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type l = m21922l(type, cls, Map.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    /* renamed from: k */
    public static Class m21921k(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C5497a.m21910a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m21921k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m21921k(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: l */
    private static Type m21922l(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C5497a.m21910a(cls2.isAssignableFrom(cls));
        return m21925o(type, cls, m21919i(type, cls, cls2));
    }

    /* renamed from: m */
    private static int m21923m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: n */
    public static ParameterizedType m21924n(Type type, Type type2, Type... typeArr) {
        return new C5500b(type, type2, typeArr);
    }

    /* renamed from: o */
    public static Type m21925o(Type type, Class cls, Type type2) {
        return m21926p(type, cls, type2, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m21926p(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.Map r12) {
        /*
            r0 = 0
        L_0x0001:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x0027
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r11 = r2
        L_0x0016:
            return r11
        L_0x0017:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            java.lang.reflect.Type r11 = m21927q(r9, r10, r1)
            if (r11 != r1) goto L_0x0001
            goto L_0x00dc
        L_0x0027:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L_0x004c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m21926p(r9, r10, r11, r12)
            boolean r10 = m21915e(r11, r9)
            if (r10 == 0) goto L_0x0045
            r11 = r1
            goto L_0x00dc
        L_0x0045:
            java.lang.reflect.GenericArrayType r9 = m21911a(r9)
        L_0x0049:
            r11 = r9
            goto L_0x00dc
        L_0x004c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0067
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m21926p(r9, r10, r1, r12)
            boolean r10 = m21915e(r1, r9)
            if (r10 == 0) goto L_0x0062
            goto L_0x00dc
        L_0x0062:
            java.lang.reflect.GenericArrayType r9 = m21911a(r9)
            goto L_0x0049
        L_0x0067:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00ab
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m21926p(r9, r10, r1, r12)
            boolean r1 = m21915e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x0081:
            if (r2 >= r6) goto L_0x00a0
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m21926p(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m21915e(r7, r8)
            if (r8 != 0) goto L_0x009d
            if (r1 != 0) goto L_0x009b
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = r3
        L_0x009b:
            r5[r2] = r7
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0081
        L_0x00a0:
            if (r1 == 0) goto L_0x00dc
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m21924n(r4, r9, r5)
            goto L_0x0049
        L_0x00ab:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto L_0x00cb
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m21926p(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = m21929s(r9)
            goto L_0x00dc
        L_0x00cb:
            int r1 = r4.length
            if (r1 != r3) goto L_0x00dc
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m21926p(r9, r10, r1, r12)     // Catch:{ all -> 0x00e2 }
            r10 = r4[r2]
            if (r9 == r10) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = m21928r(r9)
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r12.put(r0, r11)
        L_0x00e1:
            return r11
        L_0x00e2:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C5498b.m21926p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: q */
    private static Type m21927q(Type type, Class cls, TypeVariable typeVariable) {
        Class d = m21914d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = m21919i(type, cls, d);
        if (!(i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i).getActualTypeArguments()[m21923m(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: r */
    public static WildcardType m21928r(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C5501c(typeArr, f17575a);
    }

    /* renamed from: s */
    public static WildcardType m21929s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C5501c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: t */
    public static String m21930t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
