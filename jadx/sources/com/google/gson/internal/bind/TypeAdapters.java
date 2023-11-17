package com.google.gson.internal.bind;

import com.google.gson.C5491e;
import com.google.gson.C5494h;
import com.google.gson.C5495i;
import com.google.gson.C5610j;
import com.google.gson.C5612l;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5578f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p277ua.C8664c;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public abstract class TypeAdapters {

    /* renamed from: A */
    public static final TypeAdapter f17650A = new TypeAdapter() {
        /* renamed from: e */
        public BigInteger mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            String I0 = aVar.mo18335I0();
            try {
                return new BigInteger(I0);
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException("Failed parsing '" + I0 + "' as BigInteger; at path " + aVar.mo18352w(), e);
            }
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, BigInteger bigInteger) {
            cVar.mo18370x0(bigInteger);
        }
    };

    /* renamed from: B */
    public static final TypeAdapter f17651B = new TypeAdapter() {
        /* renamed from: e */
        public C5578f mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() != C9145b.NULL) {
                return new C5578f(aVar.mo18335I0());
            }
            aVar.mo18344f0();
            return null;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, C5578f fVar) {
            cVar.mo18370x0(fVar);
        }
    };

    /* renamed from: C */
    public static final C5624r f17652C;

    /* renamed from: D */
    public static final TypeAdapter f17653D;

    /* renamed from: E */
    public static final C5624r f17654E;

    /* renamed from: F */
    public static final TypeAdapter f17655F;

    /* renamed from: G */
    public static final C5624r f17656G;

    /* renamed from: H */
    public static final TypeAdapter f17657H;

    /* renamed from: I */
    public static final C5624r f17658I;

    /* renamed from: J */
    public static final TypeAdapter f17659J;

    /* renamed from: K */
    public static final C5624r f17660K;

    /* renamed from: L */
    public static final TypeAdapter f17661L;

    /* renamed from: M */
    public static final C5624r f17662M;

    /* renamed from: N */
    public static final TypeAdapter f17663N;

    /* renamed from: O */
    public static final C5624r f17664O;

    /* renamed from: P */
    public static final TypeAdapter f17665P;

    /* renamed from: Q */
    public static final C5624r f17666Q;

    /* renamed from: R */
    public static final TypeAdapter f17667R;

    /* renamed from: S */
    public static final C5624r f17668S;

    /* renamed from: T */
    public static final TypeAdapter f17669T;

    /* renamed from: U */
    public static final C5624r f17670U;

    /* renamed from: V */
    public static final TypeAdapter f17671V;

    /* renamed from: W */
    public static final C5624r f17672W;

    /* renamed from: X */
    public static final C5624r f17673X = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            Class<? super Enum> rawType = aVar.getRawType();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(rawType) || rawType == cls) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a */
    public static final TypeAdapter f17674a;

    /* renamed from: b */
    public static final C5624r f17675b;

    /* renamed from: c */
    public static final TypeAdapter f17676c;

    /* renamed from: d */
    public static final C5624r f17677d;

    /* renamed from: e */
    public static final TypeAdapter f17678e;

    /* renamed from: f */
    public static final TypeAdapter f17679f = new TypeAdapter() {
        /* renamed from: e */
        public Boolean mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() != C9145b.NULL) {
                return Boolean.valueOf(aVar.mo18335I0());
            }
            aVar.mo18344f0();
            return null;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Boolean bool) {
            String str;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            cVar.mo18356F0(str);
        }
    };

    /* renamed from: g */
    public static final C5624r f17680g;

    /* renamed from: h */
    public static final TypeAdapter f17681h;

    /* renamed from: i */
    public static final C5624r f17682i;

    /* renamed from: j */
    public static final TypeAdapter f17683j;

    /* renamed from: k */
    public static final C5624r f17684k;

    /* renamed from: l */
    public static final TypeAdapter f17685l;

    /* renamed from: m */
    public static final C5624r f17686m;

    /* renamed from: n */
    public static final TypeAdapter f17687n;

    /* renamed from: o */
    public static final C5624r f17688o;

    /* renamed from: p */
    public static final TypeAdapter f17689p;

    /* renamed from: q */
    public static final C5624r f17690q;

    /* renamed from: r */
    public static final TypeAdapter f17691r;

    /* renamed from: s */
    public static final C5624r f17692s;

    /* renamed from: t */
    public static final TypeAdapter f17693t = new TypeAdapter() {
        /* renamed from: e */
        public Number mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo18341a0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Number number) {
            if (number == null) {
                cVar.mo18359Q();
            } else {
                cVar.mo18366q0(number.longValue());
            }
        }
    };

    /* renamed from: u */
    public static final TypeAdapter f17694u = new TypeAdapter() {
        /* renamed from: e */
        public Number mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() != C9145b.NULL) {
                return Float.valueOf((float) aVar.mo18337R());
            }
            aVar.mo18344f0();
            return null;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Number number) {
            if (number == null) {
                cVar.mo18359Q();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.mo18370x0(number);
        }
    };

    /* renamed from: v */
    public static final TypeAdapter f17695v = new TypeAdapter() {
        /* renamed from: e */
        public Number mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() != C9145b.NULL) {
                return Double.valueOf(aVar.mo18337R());
            }
            aVar.mo18344f0();
            return null;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Number number) {
            if (number == null) {
                cVar.mo18359Q();
            } else {
                cVar.mo18364p0(number.doubleValue());
            }
        }
    };

    /* renamed from: w */
    public static final TypeAdapter f17696w;

    /* renamed from: x */
    public static final C5624r f17697x;

    /* renamed from: y */
    public static final TypeAdapter f17698y;

    /* renamed from: z */
    public static final TypeAdapter f17699z = new TypeAdapter() {
        /* renamed from: e */
        public BigDecimal mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            String I0 = aVar.mo18335I0();
            try {
                return new BigDecimal(I0);
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException("Failed parsing '" + I0 + "' as BigDecimal; at path " + aVar.mo18352w(), e);
            }
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, BigDecimal bigDecimal) {
            cVar.mo18370x0(bigDecimal);
        }
    };

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a */
        private final Map f17714a = new HashMap();

        /* renamed from: b */
        private final Map f17715b = new HashMap();

        /* renamed from: c */
        private final Map f17716c = new HashMap();

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter$a */
        class C5550a implements PrivilegedAction {

            /* renamed from: a */
            final /* synthetic */ Class f17717a;

            C5550a(Class cls) {
                this.f17717a = cls;
            }

            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f17717a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new C5550a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    C8664c cVar = (C8664c) field.getAnnotation(C8664c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f17714a.put(put, enumR);
                        }
                    }
                    this.f17714a.put(name, enumR);
                    this.f17715b.put(str, enumR);
                    this.f17716c.put(enumR, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: e */
        public Enum mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            String I0 = aVar.mo18335I0();
            Enum enumR = (Enum) this.f17714a.get(I0);
            if (enumR == null) {
                return (Enum) this.f17715b.get(I0);
            }
            return enumR;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Enum enumR) {
            cVar.mo18356F0(enumR == null ? null : (String) this.f17716c.get(enumR));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    static /* synthetic */ class C5551a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17719a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ya.b[] r0 = p328ya.C9145b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17719a = r0
                ya.b r1 = p328ya.C9145b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17719a     // Catch:{ NoSuchFieldError -> 0x001d }
                ya.b r1 = p328ya.C9145b.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17719a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ya.b r1 = p328ya.C9145b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17719a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ya.b r1 = p328ya.C9145b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17719a     // Catch:{ NoSuchFieldError -> 0x003e }
                ya.b r1 = p328ya.C9145b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17719a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ya.b r1 = p328ya.C9145b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C5551a.<clinit>():void");
        }
    }

    static {
        TypeAdapter a = new TypeAdapter() {
            /* renamed from: e */
            public Class mo18185b(C9143a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.mo18199a();
        f17674a = a;
        f17675b = m22018a(Class.class, a);
        TypeAdapter a2 = new TypeAdapter() {
            /* renamed from: e */
            public BitSet mo18185b(C9143a aVar) {
                BitSet bitSet = new BitSet();
                aVar.mo18340a();
                C9145b n0 = aVar.mo18348n0();
                int i = 0;
                while (n0 != C9145b.END_ARRAY) {
                    int i2 = C5551a.f17719a[n0.ordinal()];
                    boolean z = true;
                    if (i2 == 1 || i2 == 2) {
                        int U = aVar.mo18338U();
                        if (U == 0) {
                            z = false;
                        } else if (U != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + U + ", expected 0 or 1; at path " + aVar.mo18352w());
                        }
                    } else if (i2 == 3) {
                        z = aVar.mo18334E0();
                    } else {
                        throw new JsonSyntaxException("Invalid bitset value type: " + n0 + "; at path " + aVar.mo18353z());
                    }
                    if (z) {
                        bitSet.set(i);
                    }
                    i++;
                    n0 = aVar.mo18348n0();
                }
                aVar.mo18349s();
                return bitSet;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, BitSet bitSet) {
                cVar.mo18362n();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo18366q0(bitSet.get(i) ? 1 : 0);
                }
                cVar.mo18365q();
            }
        }.mo18199a();
        f17676c = a2;
        f17677d = m22018a(BitSet.class, a2);
        C55373 r0 = new TypeAdapter() {
            /* renamed from: e */
            public Boolean mo18185b(C9143a aVar) {
                C9145b n0 = aVar.mo18348n0();
                if (n0 == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                } else if (n0 == C9145b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.mo18335I0()));
                } else {
                    return Boolean.valueOf(aVar.mo18334E0());
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Boolean bool) {
                cVar.mo18368s0(bool);
            }
        };
        f17678e = r0;
        f17680g = m22019b(Boolean.TYPE, Boolean.class, r0);
        C55455 r02 = new TypeAdapter() {
            /* renamed from: e */
            public Number mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                try {
                    int U = aVar.mo18338U();
                    if (U <= 255 && U >= -128) {
                        return Byte.valueOf((byte) U);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + U + " to byte; at path " + aVar.mo18352w());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                } else {
                    cVar.mo18366q0((long) number.byteValue());
                }
            }
        };
        f17681h = r02;
        f17682i = m22019b(Byte.TYPE, Byte.class, r02);
        C55466 r03 = new TypeAdapter() {
            /* renamed from: e */
            public Number mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                try {
                    int U = aVar.mo18338U();
                    if (U <= 65535 && U >= -32768) {
                        return Short.valueOf((short) U);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + U + " to short; at path " + aVar.mo18352w());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                } else {
                    cVar.mo18366q0((long) number.shortValue());
                }
            }
        };
        f17683j = r03;
        f17684k = m22019b(Short.TYPE, Short.class, r03);
        C55477 r04 = new TypeAdapter() {
            /* renamed from: e */
            public Number mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.mo18338U());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                } else {
                    cVar.mo18366q0((long) number.intValue());
                }
            }
        };
        f17685l = r04;
        f17686m = m22019b(Integer.TYPE, Integer.class, r04);
        TypeAdapter a3 = new TypeAdapter() {
            /* renamed from: e */
            public AtomicInteger mo18185b(C9143a aVar) {
                try {
                    return new AtomicInteger(aVar.mo18338U());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, AtomicInteger atomicInteger) {
                cVar.mo18366q0((long) atomicInteger.get());
            }
        }.mo18199a();
        f17687n = a3;
        f17688o = m22018a(AtomicInteger.class, a3);
        TypeAdapter a4 = new TypeAdapter() {
            /* renamed from: e */
            public AtomicBoolean mo18185b(C9143a aVar) {
                return new AtomicBoolean(aVar.mo18334E0());
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, AtomicBoolean atomicBoolean) {
                cVar.mo18357G0(atomicBoolean.get());
            }
        }.mo18199a();
        f17689p = a4;
        f17690q = m22018a(AtomicBoolean.class, a4);
        TypeAdapter a5 = new TypeAdapter() {
            /* renamed from: e */
            public AtomicIntegerArray mo18185b(C9143a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo18340a();
                while (aVar.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.mo18338U()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                }
                aVar.mo18349s();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.mo18362n();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo18366q0((long) atomicIntegerArray.get(i));
                }
                cVar.mo18365q();
            }
        }.mo18199a();
        f17691r = a5;
        f17692s = m22018a(AtomicIntegerArray.class, a5);
        C552014 r05 = new TypeAdapter() {
            /* renamed from: e */
            public Character mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                String I0 = aVar.mo18335I0();
                if (I0.length() == 1) {
                    return Character.valueOf(I0.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + I0 + "; at " + aVar.mo18352w());
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Character ch) {
                cVar.mo18356F0(ch == null ? null : String.valueOf(ch));
            }
        };
        f17696w = r05;
        f17697x = m22019b(Character.TYPE, Character.class, r05);
        C552115 r06 = new TypeAdapter() {
            /* renamed from: e */
            public String mo18185b(C9143a aVar) {
                C9145b n0 = aVar.mo18348n0();
                if (n0 == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                } else if (n0 == C9145b.BOOLEAN) {
                    return Boolean.toString(aVar.mo18334E0());
                } else {
                    return aVar.mo18335I0();
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, String str) {
                cVar.mo18356F0(str);
            }
        };
        f17698y = r06;
        f17652C = m22018a(String.class, r06);
        C552519 r07 = new TypeAdapter() {
            /* renamed from: e */
            public StringBuilder mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return new StringBuilder(aVar.mo18335I0());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, StringBuilder sb) {
                cVar.mo18356F0(sb == null ? null : sb.toString());
            }
        };
        f17653D = r07;
        f17654E = m22018a(StringBuilder.class, r07);
        C552720 r08 = new TypeAdapter() {
            /* renamed from: e */
            public StringBuffer mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return new StringBuffer(aVar.mo18335I0());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, StringBuffer stringBuffer) {
                cVar.mo18356F0(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f17655F = r08;
        f17656G = m22018a(StringBuffer.class, r08);
        C552821 r09 = new TypeAdapter() {
            /* renamed from: e */
            public URL mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                String I0 = aVar.mo18335I0();
                if ("null".equals(I0)) {
                    return null;
                }
                return new URL(I0);
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, URL url) {
                cVar.mo18356F0(url == null ? null : url.toExternalForm());
            }
        };
        f17657H = r09;
        f17658I = m22018a(URL.class, r09);
        C552922 r010 = new TypeAdapter() {
            /* renamed from: e */
            public URI mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                try {
                    String I0 = aVar.mo18335I0();
                    if ("null".equals(I0)) {
                        return null;
                    }
                    return new URI(I0);
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Throwable) e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, URI uri) {
                cVar.mo18356F0(uri == null ? null : uri.toASCIIString());
            }
        };
        f17659J = r010;
        f17660K = m22018a(URI.class, r010);
        C553023 r011 = new TypeAdapter() {
            /* renamed from: e */
            public InetAddress mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return InetAddress.getByName(aVar.mo18335I0());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, InetAddress inetAddress) {
                cVar.mo18356F0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f17661L = r011;
        f17662M = m22022e(InetAddress.class, r011);
        C553124 r012 = new TypeAdapter() {
            /* renamed from: e */
            public UUID mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                String I0 = aVar.mo18335I0();
                try {
                    return UUID.fromString(I0);
                } catch (IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + I0 + "' as UUID; at path " + aVar.mo18352w(), e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, UUID uuid) {
                cVar.mo18356F0(uuid == null ? null : uuid.toString());
            }
        };
        f17663N = r012;
        f17664O = m22018a(UUID.class, r012);
        TypeAdapter a6 = new TypeAdapter() {
            /* renamed from: e */
            public Currency mo18185b(C9143a aVar) {
                String I0 = aVar.mo18335I0();
                try {
                    return Currency.getInstance(I0);
                } catch (IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + I0 + "' as Currency; at path " + aVar.mo18352w(), e);
                }
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Currency currency) {
                cVar.mo18356F0(currency.getCurrencyCode());
            }
        }.mo18199a();
        f17665P = a6;
        f17666Q = m22018a(Currency.class, a6);
        C553326 r013 = new TypeAdapter() {
            /* renamed from: e */
            public Calendar mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                aVar.mo18347k();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (aVar.mo18348n0() != C9145b.END_OBJECT) {
                    String b0 = aVar.mo18342b0();
                    int U = aVar.mo18338U();
                    if ("year".equals(b0)) {
                        i = U;
                    } else if ("month".equals(b0)) {
                        i2 = U;
                    } else if ("dayOfMonth".equals(b0)) {
                        i3 = U;
                    } else if ("hourOfDay".equals(b0)) {
                        i4 = U;
                    } else if ("minute".equals(b0)) {
                        i5 = U;
                    } else if ("second".equals(b0)) {
                        i6 = U;
                    }
                }
                aVar.mo18350t();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.mo18359Q();
                    return;
                }
                cVar.mo18363o();
                cVar.mo18369x("year");
                cVar.mo18366q0((long) calendar.get(1));
                cVar.mo18369x("month");
                cVar.mo18366q0((long) calendar.get(2));
                cVar.mo18369x("dayOfMonth");
                cVar.mo18366q0((long) calendar.get(5));
                cVar.mo18369x("hourOfDay");
                cVar.mo18366q0((long) calendar.get(11));
                cVar.mo18369x("minute");
                cVar.mo18366q0((long) calendar.get(12));
                cVar.mo18369x("second");
                cVar.mo18366q0((long) calendar.get(13));
                cVar.mo18367s();
            }
        };
        f17667R = r013;
        f17668S = m22021d(Calendar.class, GregorianCalendar.class, r013);
        C553427 r014 = new TypeAdapter() {
            /* renamed from: e */
            public Locale mo18185b(C9143a aVar) {
                String str;
                String str2;
                String str3 = null;
                if (aVar.mo18348n0() == C9145b.NULL) {
                    aVar.mo18344f0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo18335I0(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Locale locale) {
                cVar.mo18356F0(locale == null ? null : locale.toString());
            }
        };
        f17669T = r014;
        f17670U = m22018a(Locale.class, r014);
        C553528 r015 = new TypeAdapter() {
            /* renamed from: f */
            private C5494h m22103f(C9143a aVar, C9145b bVar) {
                int i = C5551a.f17719a[bVar.ordinal()];
                if (i == 1) {
                    return new C5612l((Number) new C5578f(aVar.mo18335I0()));
                }
                if (i == 2) {
                    return new C5612l(aVar.mo18335I0());
                }
                if (i == 3) {
                    return new C5612l(Boolean.valueOf(aVar.mo18334E0()));
                }
                if (i == 6) {
                    aVar.mo18344f0();
                    return C5495i.f17561d;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }

            /* renamed from: g */
            private C5494h m22104g(C9143a aVar, C9145b bVar) {
                int i = C5551a.f17719a[bVar.ordinal()];
                if (i == 4) {
                    aVar.mo18340a();
                    return new C5491e();
                } else if (i != 5) {
                    return null;
                } else {
                    aVar.mo18347k();
                    return new C5610j();
                }
            }

            /* renamed from: e */
            public C5494h mo18185b(C9143a aVar) {
                String str;
                boolean z;
                if (aVar instanceof C5552a) {
                    return ((C5552a) aVar).mo18339V0();
                }
                C9145b n0 = aVar.mo18348n0();
                C5494h g = m22104g(aVar, n0);
                if (g == null) {
                    return m22103f(aVar, n0);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.hasNext()) {
                        if (g instanceof C5610j) {
                            str = aVar.mo18342b0();
                        } else {
                            str = null;
                        }
                        C9145b n02 = aVar.mo18348n0();
                        C5494h g2 = m22104g(aVar, n02);
                        if (g2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (g2 == null) {
                            g2 = m22103f(aVar, n02);
                        }
                        if (g instanceof C5491e) {
                            ((C5491e) g).mo18213v(g2);
                        } else {
                            ((C5610j) g).mo18448v(str, g2);
                        }
                        if (z) {
                            arrayDeque.addLast(g);
                            g = g2;
                        }
                    } else {
                        if (g instanceof C5491e) {
                            aVar.mo18349s();
                        } else {
                            aVar.mo18350t();
                        }
                        if (arrayDeque.isEmpty()) {
                            return g;
                        }
                        g = (C5494h) arrayDeque.removeLast();
                    }
                }
            }

            /* renamed from: h */
            public void mo18186d(C9146c cVar, C5494h hVar) {
                if (hVar == null || hVar.mo18219n()) {
                    cVar.mo18359Q();
                } else if (hVar.mo18221r()) {
                    C5612l i = hVar.mo18217i();
                    if (i.mo18453B()) {
                        cVar.mo18370x0(i.mo18459x());
                    } else if (i.mo18460z()) {
                        cVar.mo18357G0(i.mo18206b());
                    } else {
                        cVar.mo18356F0(i.mo18211k());
                    }
                } else if (hVar.mo18218l()) {
                    cVar.mo18362n();
                    Iterator it = hVar.mo18215c().iterator();
                    while (it.hasNext()) {
                        mo18186d(cVar, (C5494h) it.next());
                    }
                    cVar.mo18365q();
                } else if (hVar.mo18220o()) {
                    cVar.mo18363o();
                    for (Map.Entry entry : hVar.mo18216g().mo18449w()) {
                        cVar.mo18369x((String) entry.getKey());
                        mo18186d(cVar, (C5494h) entry.getValue());
                    }
                    cVar.mo18367s();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
                }
            }
        };
        f17671V = r015;
        f17672W = m22022e(C5494h.class, r015);
    }

    /* renamed from: a */
    public static C5624r m22018a(final Class cls, final TypeAdapter typeAdapter) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                if (aVar.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: b */
    public static C5624r m22019b(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: c */
    public static C5624r m22020c(final C8982a aVar, final TypeAdapter typeAdapter) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                if (aVar.equals(C8982a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    /* renamed from: d */
    public static C5624r m22021d(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: e */
    public static C5624r m22022e(final Class cls, final TypeAdapter typeAdapter) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                final Class rawType = aVar.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new TypeAdapter() {
                    /* renamed from: b */
                    public Object mo18185b(C9143a aVar) {
                        Object b = typeAdapter.mo18185b(aVar);
                        if (b == null || rawType.isInstance(b)) {
                            return b;
                        }
                        throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + b.getClass().getName() + "; at path " + aVar.mo18352w());
                    }

                    /* renamed from: d */
                    public void mo18186d(C9146c cVar, Object obj) {
                        typeAdapter.mo18186d(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
