package com.google.gson.internal.bind;

import com.github.mikephil.charting.utils.Utils;
import com.google.gson.C5489c;
import com.google.gson.C5617o;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5557c;
import com.google.gson.internal.C5587h;
import com.google.gson.internal.C5589j;
import com.google.gson.internal.C5590k;
import com.google.gson.internal.Excluder;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p277ua.C8663b;
import p277ua.C8664c;
import p303wa.C8900a;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class ReflectiveTypeAdapterFactory implements C5624r {

    /* renamed from: d */
    private final C5557c f17610d;

    /* renamed from: e */
    private final C5489c f17611e;

    /* renamed from: f */
    private final Excluder f17612f;

    /* renamed from: g */
    private final JsonAdapterAnnotationTypeAdapterFactory f17613g;

    /* renamed from: h */
    private final List f17614h;

    public static abstract class Adapter<T, A> extends TypeAdapter {

        /* renamed from: a */
        final Map f17615a;

        Adapter(Map map) {
            this.f17615a = map;
        }

        /* renamed from: b */
        public Object mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            Object e = mo18261e();
            try {
                aVar.mo18347k();
                while (aVar.hasNext()) {
                    C5512b bVar = (C5512b) this.f17615a.get(aVar.mo18342b0());
                    if (bVar != null) {
                        if (bVar.f17634d) {
                            mo18263g(e, aVar, bVar);
                        }
                    }
                    aVar.mo18336N();
                }
                aVar.mo18350t();
                return mo18262f(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw C8900a.m33067e(e3);
            }
        }

        /* renamed from: d */
        public void mo18186d(C9146c cVar, Object obj) {
            if (obj == null) {
                cVar.mo18359Q();
                return;
            }
            cVar.mo18363o();
            try {
                for (C5512b c : this.f17615a.values()) {
                    c.mo18269c(cVar, obj);
                }
                cVar.mo18367s();
            } catch (IllegalAccessException e) {
                throw C8900a.m33067e(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Object mo18261e();

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Object mo18262f(Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract void mo18263g(Object obj, C9143a aVar, C5512b bVar);
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b */
        private final C5587h f17616b;

        FieldReflectionAdapter(C5587h hVar, Map map) {
            super(map);
            this.f17616b = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Object mo18261e() {
            return this.f17616b.mo18376a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object mo18262f(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo18263g(Object obj, C9143a aVar, C5512b bVar) {
            bVar.mo18268b(aVar, obj);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e */
        static final Map f17617e = m21994j();

        /* renamed from: b */
        private final Constructor f17618b;

        /* renamed from: c */
        private final Object[] f17619c;

        /* renamed from: d */
        private final Map f17620d = new HashMap();

        RecordAdapter(Class cls, Map map, boolean z) {
            super(map);
            Constructor h = C8900a.m33070h(cls);
            this.f17618b = h;
            if (z) {
                ReflectiveTypeAdapterFactory.m21980c((Object) null, h);
            } else {
                C8900a.m33073k(h);
            }
            String[] i = C8900a.m33071i(cls);
            for (int i2 = 0; i2 < i.length; i2++) {
                this.f17620d.put(i[i2], Integer.valueOf(i2));
            }
            Class[] parameterTypes = this.f17618b.getParameterTypes();
            this.f17619c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.f17619c[i3] = f17617e.get(parameterTypes[i3]);
            }
        }

        /* renamed from: j */
        private static Map m21994j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(Utils.FLOAT_EPSILON));
            hashMap.put(Double.TYPE, Double.valueOf(Utils.DOUBLE_EPSILON));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object[] mo18261e() {
            return (Object[]) this.f17619c.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Object mo18262f(Object[] objArr) {
            try {
                return this.f17618b.newInstance(objArr);
            } catch (IllegalAccessException e) {
                throw C8900a.m33067e(e);
            } catch (IllegalArgumentException | InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + C8900a.m33065c(this.f17618b) + "' with args " + Arrays.toString(objArr), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + C8900a.m33065c(this.f17618b) + "' with args " + Arrays.toString(objArr), e3.getCause());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo18263g(Object[] objArr, C9143a aVar, C5512b bVar) {
            Integer num = (Integer) this.f17620d.get(bVar.f17632b);
            if (num != null) {
                bVar.mo18267a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C8900a.m33065c(this.f17618b) + "' for field with name '" + bVar.f17632b + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    class C5511a extends C5512b {

        /* renamed from: e */
        final /* synthetic */ boolean f17621e;

        /* renamed from: f */
        final /* synthetic */ Method f17622f;

        /* renamed from: g */
        final /* synthetic */ Field f17623g;

        /* renamed from: h */
        final /* synthetic */ boolean f17624h;

        /* renamed from: i */
        final /* synthetic */ TypeAdapter f17625i;

        /* renamed from: j */
        final /* synthetic */ Gson f17626j;

        /* renamed from: k */
        final /* synthetic */ C8982a f17627k;

        /* renamed from: l */
        final /* synthetic */ boolean f17628l;

        /* renamed from: m */
        final /* synthetic */ boolean f17629m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5511a(String str, String str2, boolean z, boolean z2, boolean z3, Method method, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, C8982a aVar, boolean z5, boolean z6) {
            super(str, str2, z, z2);
            this.f17621e = z3;
            this.f17622f = method;
            this.f17623g = field;
            this.f17624h = z4;
            this.f17625i = typeAdapter;
            this.f17626j = gson;
            this.f17627k = aVar;
            this.f17628l = z5;
            this.f17629m = z6;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18267a(C9143a aVar, int i, Object[] objArr) {
            Object b = this.f17625i.mo18185b(aVar);
            if (b != null || !this.f17628l) {
                objArr[i] = b;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f17632b + "' of primitive type; at path " + aVar.mo18353z());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo18268b(C9143a aVar, Object obj) {
            Object b = this.f17625i.mo18185b(aVar);
            if (b != null || !this.f17628l) {
                if (this.f17621e) {
                    ReflectiveTypeAdapterFactory.m21980c(obj, this.f17623g);
                } else if (this.f17629m) {
                    String f = C8900a.m33068f(this.f17623g, false);
                    throw new JsonIOException("Cannot set value of 'static final' " + f);
                }
                this.f17623g.set(obj, b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo18269c(C9146c cVar, Object obj) {
            Object obj2;
            TypeAdapter typeAdapter;
            if (this.f17633c) {
                if (this.f17621e) {
                    Method method = this.f17622f;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.m21980c(obj, this.f17623g);
                    } else {
                        ReflectiveTypeAdapterFactory.m21980c(obj, method);
                    }
                }
                Method method2 = this.f17622f;
                if (method2 != null) {
                    try {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } catch (InvocationTargetException e) {
                        String f = C8900a.m33068f(this.f17622f, false);
                        throw new JsonIOException("Accessor " + f + " threw exception", e.getCause());
                    }
                } else {
                    obj2 = this.f17623g.get(obj);
                }
                if (obj2 != obj) {
                    cVar.mo18369x(this.f17631a);
                    if (this.f17624h) {
                        typeAdapter = this.f17625i;
                    } else {
                        typeAdapter = new TypeAdapterRuntimeTypeWrapper(this.f17626j, this.f17625i, this.f17627k.getType());
                    }
                    typeAdapter.mo18186d(cVar, obj2);
                }
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C5512b {

        /* renamed from: a */
        final String f17631a;

        /* renamed from: b */
        final String f17632b;

        /* renamed from: c */
        final boolean f17633c;

        /* renamed from: d */
        final boolean f17634d;

        protected C5512b(String str, String str2, boolean z, boolean z2) {
            this.f17631a = str;
            this.f17632b = str2;
            this.f17633c = z;
            this.f17634d = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo18267a(C9143a aVar, int i, Object[] objArr);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo18268b(C9143a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo18269c(C9146c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(C5557c cVar, C5489c cVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f17610d = cVar;
        this.f17611e = cVar2;
        this.f17612f = excluder;
        this.f17613g = jsonAdapterAnnotationTypeAdapterFactory;
        this.f17614h = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m21980c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C5590k.m22240a(accessibleObject, obj)) {
            String f = C8900a.m33068f(accessibleObject, true);
            throw new JsonIOException(f + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    /* renamed from: d */
    private C5512b m21981d(Gson gson, Field field, Method method, String str, C8982a aVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        TypeAdapter typeAdapter;
        boolean z5;
        Gson gson2 = gson;
        C8982a aVar2 = aVar;
        boolean a = C5589j.m22238a(aVar.getRawType());
        int modifiers = field.getModifiers();
        if (!Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
            z4 = false;
        } else {
            z4 = true;
        }
        C8663b bVar = (C8663b) field.getAnnotation(C8663b.class);
        if (bVar != null) {
            typeAdapter = this.f17613g.mo18256b(this.f17610d, gson2, aVar2, bVar);
        } else {
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (typeAdapter == null) {
            typeAdapter = gson2.mo18175q(aVar2);
        }
        return new C5511a(str, field.getName(), z, z2, z3, method, field, z5, typeAdapter, gson, aVar, a, z4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0164 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map m21982e(com.google.gson.Gson r29, p316xa.C8982a r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            r28 = this;
            r9 = r28
            r10 = r31
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            boolean r0 = r31.isInterface()
            if (r0 == 0) goto L_0x0010
            return r11
        L_0x0010:
            java.lang.reflect.Type r12 = r30.getType()
            r13 = r30
            r0 = r32
            r14 = r10
        L_0x0019:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r14 == r1) goto L_0x019c
            java.lang.reflect.Field[] r15 = r14.getDeclaredFields()
            r8 = 1
            r7 = 0
            if (r14 == r10) goto L_0x005e
            int r1 = r15.length
            if (r1 <= 0) goto L_0x005e
            java.util.List r0 = r9.f17614h
            com.google.gson.o r0 = com.google.gson.internal.C5590k.m22241b(r0, r14)
            com.google.gson.o r1 = com.google.gson.C5617o.BLOCK_ALL
            if (r0 == r1) goto L_0x003a
            com.google.gson.o r1 = com.google.gson.C5617o.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L_0x0038
            r0 = r8
            goto L_0x005e
        L_0x0038:
            r0 = r7
            goto L_0x005e
        L_0x003a:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x005e:
            r16 = r0
            int r6 = r15.length
            r5 = r7
        L_0x0062:
            if (r5 >= r6) goto L_0x0180
            r4 = r15[r5]
            boolean r0 = r9.m21984g(r4, r8)
            boolean r1 = r9.m21984g(r4, r7)
            if (r0 != 0) goto L_0x007e
            if (r1 != 0) goto L_0x007e
            r25 = r5
            r21 = r6
            r26 = r7
            r27 = r8
            r30 = r15
            goto L_0x0154
        L_0x007e:
            if (r33 == 0) goto L_0x00ca
            int r3 = r4.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L_0x008d
            r17 = r7
            goto L_0x00cc
        L_0x008d:
            java.lang.reflect.Method r3 = p303wa.C8900a.m33069g(r14, r4)
            if (r16 != 0) goto L_0x0096
            p303wa.C8900a.m33073k(r3)
        L_0x0096:
            java.lang.Class<ua.c> r2 = p277ua.C8664c.class
            java.lang.annotation.Annotation r17 = r3.getAnnotation(r2)
            if (r17 == 0) goto L_0x00c5
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            if (r2 == 0) goto L_0x00a5
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r0 = p303wa.C8900a.m33068f(r3, r7)
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@SerializedName on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00c5:
            r17 = r1
            r18 = r3
            goto L_0x00ce
        L_0x00ca:
            r17 = r1
        L_0x00cc:
            r18 = 0
        L_0x00ce:
            if (r16 != 0) goto L_0x00d5
            if (r18 != 0) goto L_0x00d5
            p303wa.C8900a.m33073k(r4)
        L_0x00d5:
            java.lang.reflect.Type r1 = r13.getType()
            java.lang.reflect.Type r2 = r4.getGenericType()
            java.lang.reflect.Type r19 = com.google.gson.internal.C5498b.m21925o(r1, r14, r2)
            java.util.List r3 = r9.m21983f(r4)
            int r2 = r3.size()
            r9 = r7
            r1 = 0
        L_0x00eb:
            if (r9 >= r2) goto L_0x0147
            java.lang.Object r20 = r3.get(r9)
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10
            if (r9 == 0) goto L_0x00fa
            r20 = r7
            goto L_0x00fc
        L_0x00fa:
            r20 = r0
        L_0x00fc:
            xa.a r21 = p316xa.C8982a.get((java.lang.reflect.Type) r19)
            r0 = r28
            r30 = r15
            r15 = r1
            r1 = r29
            r22 = r2
            r2 = r4
            r23 = r3
            r3 = r18
            r24 = r4
            r4 = r10
            r25 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r26 = r7
            r7 = r17
            r27 = r8
            r8 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = r0.m21981d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r11.put(r10, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C5512b) r0
            if (r15 != 0) goto L_0x012f
            r1 = r0
            goto L_0x0130
        L_0x012f:
            r1 = r15
        L_0x0130:
            int r9 = r9 + 1
            r15 = r30
            r10 = r31
            r0 = r20
            r6 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r26
            r8 = r27
            goto L_0x00eb
        L_0x0147:
            r25 = r5
            r21 = r6
            r26 = r7
            r27 = r8
            r30 = r15
            r15 = r1
            if (r15 != 0) goto L_0x0164
        L_0x0154:
            int r5 = r25 + 1
            r9 = r28
            r15 = r30
            r10 = r31
            r6 = r21
            r7 = r26
            r8 = r27
            goto L_0x0062
        L_0x0164:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r15.f17631a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0180:
            java.lang.reflect.Type r0 = r13.getType()
            java.lang.reflect.Type r1 = r14.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C5498b.m21925o(r0, r14, r1)
            xa.a r13 = p316xa.C8982a.get((java.lang.reflect.Type) r0)
            java.lang.Class r14 = r13.getRawType()
            r9 = r28
            r10 = r31
            r0 = r16
            goto L_0x0019
        L_0x019c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m21982e(com.google.gson.Gson, xa.a, java.lang.Class, boolean, boolean):java.util.Map");
    }

    /* renamed from: f */
    private List m21983f(Field field) {
        C8664c cVar = (C8664c) field.getAnnotation(C8664c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f17611e.mo18202a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    /* renamed from: g */
    private boolean m21984g(Field field, boolean z) {
        return !this.f17612f.mo18227c(field.getType(), z) && !this.f17612f.mo18229f(field, z);
    }

    /* renamed from: a */
    public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
        boolean z;
        Class rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        C5617o b = C5590k.m22241b(this.f17614h, rawType);
        if (b != C5617o.BLOCK_ALL) {
            if (b == C5617o.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (C8900a.m33072j(rawType)) {
                return new RecordAdapter(rawType, m21982e(gson, aVar, rawType, z2, true), z2);
            }
            return new FieldReflectionAdapter(this.f17610d.mo18374b(aVar), m21982e(gson, aVar, rawType, z2, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
