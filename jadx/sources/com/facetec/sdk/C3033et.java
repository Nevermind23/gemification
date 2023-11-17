package com.facetec.sdk;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.facetec.sdk.et */
public final class C3033et {

    /* renamed from: e */
    static final Type[] f10174e = new Type[0];

    /* renamed from: com.facetec.sdk.et$a */
    static final class C3034a implements Serializable, ParameterizedType {

        /* renamed from: b */
        private final Type f10175b;

        /* renamed from: c */
        private final Type[] f10176c;

        /* renamed from: e */
        private final Type f10177e;

        public C3034a(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
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
                C3014ep.m12631a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C3033et.m12666a(type);
            }
            this.f10175b = type3;
            this.f10177e = C3033et.m12666a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f10176c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C3014ep.m12632e(this.f10176c[i]);
                C3033et.m12673b(this.f10176c[i]);
                Type[] typeArr3 = this.f10176c;
                typeArr3[i] = C3033et.m12666a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C3033et.m12675c((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f10176c.clone();
        }

        public final Type getOwnerType() {
            return this.f10175b;
        }

        public final Type getRawType() {
            return this.f10177e;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f10176c) ^ this.f10177e.hashCode()) ^ C3033et.m12667b((Object) this.f10175b);
        }

        public final String toString() {
            int length = this.f10176c.length;
            if (length == 0) {
                return C3033et.m12681e(this.f10177e);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C3033et.m12681e(this.f10177e));
            sb.append("<");
            sb.append(C3033et.m12681e(this.f10176c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C3033et.m12681e(this.f10176c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.facetec.sdk.et$b */
    static final class C3035b implements Serializable, WildcardType {

        /* renamed from: c */
        private final Type f10178c;

        /* renamed from: e */
        private final Type f10179e;

        public C3035b(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C3014ep.m12631a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3014ep.m12631a(z2);
            if (typeArr2.length == 1) {
                C3014ep.m12632e(typeArr2[0]);
                C3033et.m12673b(typeArr2[0]);
                Class<Object> cls = Object.class;
                C3014ep.m12631a(typeArr[0] != cls ? false : z3);
                this.f10179e = C3033et.m12666a(typeArr2[0]);
                this.f10178c = cls;
                return;
            }
            C3014ep.m12632e(typeArr[0]);
            C3033et.m12673b(typeArr[0]);
            this.f10179e = null;
            this.f10178c = C3033et.m12666a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C3033et.m12675c((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getLowerBounds() {
            Type type = this.f10179e;
            if (type == null) {
                return C3033et.f10174e;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f10178c};
        }

        public final int hashCode() {
            int i;
            Type type = this.f10179e;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f10178c.hashCode() + 31);
        }

        public final String toString() {
            if (this.f10179e != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C3033et.m12681e(this.f10179e));
                return sb.toString();
            } else if (this.f10178c == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C3033et.m12681e(this.f10178c));
                return sb2.toString();
            }
        }
    }

    /* renamed from: com.facetec.sdk.et$e */
    static final class C3036e implements Serializable, GenericArrayType {

        /* renamed from: d */
        private final Type f10180d;

        public C3036e(Type type) {
            this.f10180d = C3033et.m12666a(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C3033et.m12675c((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public final Type getGenericComponentType() {
            return this.f10180d;
        }

        public final int hashCode() {
            return this.f10180d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C3033et.m12681e(this.f10180d));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    private static ParameterizedType m12665a(Type type, Type type2, Type... typeArr) {
        return new C3034a(type, type2, typeArr);
    }

    /* renamed from: b */
    static int m12667b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m12675c(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (!m12682e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
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
        return true;
    }

    /* renamed from: d */
    public static Class<?> m12677d(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                C3014ep.m12631a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m12677d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    if (type == null) {
                        str = "null";
                    } else {
                        str = type.getClass().getName();
                    }
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return (Class) type;
    }

    /* renamed from: e */
    private static boolean m12682e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: f */
    private static WildcardType m12683f(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C3035b(typeArr, f10174e);
    }

    /* renamed from: g */
    private static WildcardType m12684g(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C3035b(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: j */
    private static GenericArrayType m12685j(Type type) {
        return new C3036e(type);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.facetec.sdk.et$e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m12666a(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.facetec.sdk.et$e r0 = new com.facetec.sdk.et$e
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m12666a(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.facetec.sdk.et$a r0 = new com.facetec.sdk.et$a
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.facetec.sdk.et$e r0 = new com.facetec.sdk.et$e
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.facetec.sdk.et$b r0 = new com.facetec.sdk.et$b
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3033et.m12666a(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: b */
    private static Type m12670b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C3014ep.m12631a(cls2.isAssignableFrom(cls));
        return m12671b(type, cls, m12679d(type, cls, cls2));
    }

    /* renamed from: e */
    public static String m12681e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: b */
    public static Type m12671b(Type type, Class<?> cls, Type type2) {
        return m12672b(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m12672b(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m12680d((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.TypeVariable<?>) r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m12672b(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            return r0
        L_0x0030:
            java.lang.reflect.GenericArrayType r8 = m12685j(r8)
            return r8
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m12672b(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            return r10
        L_0x0046:
            java.lang.reflect.GenericArrayType r8 = m12685j(r8)
            return r8
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008c
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m12672b(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m12672b(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008b
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r8 = m12665a(r3, r8, r4)
            return r8
        L_0x008b:
            return r10
        L_0x008c:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00be
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ac
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m12672b(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00be
            java.lang.reflect.WildcardType r8 = m12684g(r8)
            return r8
        L_0x00ac:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00be
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m12672b(r8, r9, r0, r11)     // Catch:{ all -> 0x00bf }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00be
            java.lang.reflect.WildcardType r8 = m12683f(r8)
            return r8
        L_0x00be:
            return r10
        L_0x00bf:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3033et.m12672b(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class<? super ?>, for r5v0, types: [java.lang.Class<?>] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m12679d(java.lang.reflect.Type r4, java.lang.Class<? super java.lang.Object> r5, java.lang.Class<?> r6) {
        /*
        L_0x0000:
            if (r6 != r5) goto L_0x0003
            return r4
        L_0x0003:
            boolean r4 = r6.isInterface()
            if (r4 == 0) goto L_0x002e
            java.lang.Class[] r4 = r5.getInterfaces()
            int r0 = r4.length
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x002e
            r2 = r4[r1]
            if (r2 != r6) goto L_0x001c
            java.lang.reflect.Type[] r4 = r5.getGenericInterfaces()
            r4 = r4[r1]
            return r4
        L_0x001c:
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x002b
            java.lang.reflect.Type[] r5 = r5.getGenericInterfaces()
            r5 = r5[r1]
            r4 = r4[r1]
            goto L_0x004d
        L_0x002b:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x002e:
            boolean r4 = r5.isInterface()
            if (r4 != 0) goto L_0x0053
        L_0x0034:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r5 == r4) goto L_0x0053
            java.lang.Class r4 = r5.getSuperclass()
            if (r4 != r6) goto L_0x0043
            java.lang.reflect.Type r4 = r5.getGenericSuperclass()
            return r4
        L_0x0043:
            boolean r0 = r6.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x0051
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
        L_0x004d:
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0000
        L_0x0051:
            r5 = r4
            goto L_0x0034
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3033et.m12679d(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    /* renamed from: c */
    public static Type m12674c(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: c */
    public static Type[] m12676c(Type type, Class<?> cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type b = m12670b(type, cls, (Class<?>) Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    /* renamed from: d */
    public static Type m12678d(Type type, Class<?> cls) {
        Type b = m12670b(type, cls, (Class<?>) Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: d */
    private static Type m12680d(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> b = m12669b(typeVariable);
        if (b == null) {
            return typeVariable;
        }
        Type d = m12679d(type, cls, b);
        if (!(d instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) d).getActualTypeArguments()[m12668b(b.getTypeParameters(), typeVariable)];
    }

    /* renamed from: b */
    private static int m12668b(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static Class<?> m12669b(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: b */
    static void m12673b(Type type) {
        C3014ep.m12631a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }
}
