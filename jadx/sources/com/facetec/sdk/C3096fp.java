package com.facetec.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
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

/* renamed from: com.facetec.sdk.fp */
public final class C3096fp {

    /* renamed from: A */
    public static final C3013eo f10283A;

    /* renamed from: B */
    public static final C3004eg<C3000ee> f10284B;

    /* renamed from: C */
    public static final C3013eo f10285C;

    /* renamed from: D */
    public static final C3013eo f10286D;

    /* renamed from: E */
    public static final C3013eo f10287E = new C3013eo() {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.facetec.sdk.fw<T>, com.facetec.sdk.fw] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> com.facetec.sdk.C3004eg<T> mo9200c(com.facetec.sdk.C2972dv r2, com.facetec.sdk.C3142fw<T> r3) {
            /*
                r1 = this;
                java.lang.Class r2 = r3.mo9331a()
                java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
                boolean r0 = r3.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x001f
                if (r2 != r3) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r3 = r2.isEnum()
                if (r3 != 0) goto L_0x0019
                java.lang.Class r2 = r2.getSuperclass()
            L_0x0019:
                com.facetec.sdk.fp$c r3 = new com.facetec.sdk.fp$c
                r3.<init>(r2)
                return r3
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3096fp.C311121.mo9200c(com.facetec.sdk.dv, com.facetec.sdk.fw):com.facetec.sdk.eg");
        }
    };

    /* renamed from: F */
    private static C3004eg<Boolean> f10288F = new C3004eg<Boolean>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9314d((Boolean) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            C3141fv f = fxVar.mo9292f();
            if (f == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            } else if (f == C3141fv.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(fxVar.mo9295i()));
            } else {
                return Boolean.valueOf(fxVar.mo9296j());
            }
        }
    };

    /* renamed from: G */
    private static C3004eg<Class> f10289G;

    /* renamed from: H */
    private static C3004eg<BitSet> f10290H;

    /* renamed from: I */
    private static C3004eg<Number> f10291I;

    /* renamed from: J */
    private static C3004eg<Number> f10292J;

    /* renamed from: K */
    private static C3004eg<AtomicIntegerArray> f10293K;

    /* renamed from: L */
    private static C3004eg<AtomicInteger> f10294L;

    /* renamed from: M */
    private static C3004eg<AtomicBoolean> f10295M;

    /* renamed from: N */
    private static C3004eg<Number> f10296N;

    /* renamed from: O */
    private static C3004eg<String> f10297O = new C3004eg<String>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9315d((String) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            C3141fv f = fxVar.mo9292f();
            if (f == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            } else if (f == C3141fv.BOOLEAN) {
                return Boolean.toString(fxVar.mo9296j());
            } else {
                return fxVar.mo9295i();
            }
        }
    };

    /* renamed from: P */
    private static C3004eg<Character> f10298P;

    /* renamed from: Q */
    private static C3004eg<StringBuilder> f10299Q;

    /* renamed from: R */
    private static C3004eg<StringBuffer> f10300R;

    /* renamed from: S */
    private static C3004eg<Number> f10301S;

    /* renamed from: T */
    private static C3004eg<Currency> f10302T;

    /* renamed from: U */
    private static C3004eg<URI> f10303U;

    /* renamed from: V */
    private static C3004eg<UUID> f10304V;

    /* renamed from: W */
    private static C3004eg<URL> f10305W;

    /* renamed from: X */
    private static C3004eg<InetAddress> f10306X;

    /* renamed from: a */
    public static final C3004eg<Boolean> f10307a = new C3004eg<Boolean>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            gbVar.mo9315d(str);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() != C3141fv.NULL) {
                return Boolean.valueOf(fxVar.mo9295i());
            }
            fxVar.mo9298l();
            return null;
        }
    };

    /* renamed from: aa */
    private static C3004eg<Calendar> f10308aa;

    /* renamed from: ac */
    private static C3004eg<Locale> f10309ac;

    /* renamed from: b */
    public static final C3013eo f10310b;

    /* renamed from: c */
    public static final C3013eo f10311c;

    /* renamed from: d */
    public static final C3013eo f10312d = m12796a(Boolean.TYPE, Boolean.class, f10288F);

    /* renamed from: e */
    public static final C3013eo f10313e;

    /* renamed from: f */
    public static final C3013eo f10314f;

    /* renamed from: g */
    public static final C3013eo f10315g;

    /* renamed from: h */
    public static final C3013eo f10316h;

    /* renamed from: i */
    public static final C3013eo f10317i;

    /* renamed from: j */
    public static final C3013eo f10318j;

    /* renamed from: k */
    public static final C3004eg<Number> f10319k = new C3004eg<Number>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9307a((Number) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() != C3141fv.NULL) {
                return Float.valueOf((float) fxVar.mo9300n());
            }
            fxVar.mo9298l();
            return null;
        }
    };

    /* renamed from: l */
    public static final C3004eg<Number> f10320l = new C3004eg<Number>() {
        /* renamed from: c */
        private static Number m12863c(C3143fx fxVar) {
            if (fxVar.mo9292f() == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            try {
                return Long.valueOf(fxVar.mo9297k());
            } catch (NumberFormatException e) {
                throw new C3007ei((Throwable) e);
            }
        }

        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9307a((Number) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            return m12863c(fxVar);
        }
    };

    /* renamed from: m */
    public static final C3013eo f10321m;

    /* renamed from: n */
    public static final C3004eg<Number> f10322n = new C3004eg<Number>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9307a((Number) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() != C3141fv.NULL) {
                return Double.valueOf(fxVar.mo9300n());
            }
            fxVar.mo9298l();
            return null;
        }
    };

    /* renamed from: o */
    public static final C3013eo f10323o;

    /* renamed from: p */
    public static final C3004eg<BigInteger> f10324p = new C3004eg<BigInteger>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9307a((Number) (BigInteger) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            return m12802b(fxVar);
        }

        /* renamed from: b */
        private static BigInteger m12802b(C3143fx fxVar) {
            if (fxVar.mo9292f() == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            try {
                return new BigInteger(fxVar.mo9295i());
            } catch (NumberFormatException e) {
                throw new C3007ei((Throwable) e);
            }
        }
    };

    /* renamed from: q */
    public static final C3004eg<BigDecimal> f10325q = new C3004eg<BigDecimal>() {
        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            gbVar.mo9307a((Number) (BigDecimal) obj);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            return m12868b(fxVar);
        }

        /* renamed from: b */
        private static BigDecimal m12868b(C3143fx fxVar) {
            if (fxVar.mo9292f() == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            try {
                return new BigDecimal(fxVar.mo9295i());
            } catch (NumberFormatException e) {
                throw new C3007ei((Throwable) e);
            }
        }
    };

    /* renamed from: r */
    public static final C3013eo f10326r;

    /* renamed from: s */
    public static final C3013eo f10327s;

    /* renamed from: t */
    public static final C3013eo f10328t = m12797c(String.class, f10297O);

    /* renamed from: u */
    public static final C3013eo f10329u;

    /* renamed from: v */
    public static final C3013eo f10330v;

    /* renamed from: w */
    public static final C3013eo f10331w;

    /* renamed from: x */
    public static final C3013eo f10332x;

    /* renamed from: y */
    public static final C3013eo f10333y;

    /* renamed from: z */
    public static final C3013eo f10334z = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            if (fwVar.mo9331a() != Timestamp.class) {
                return null;
            }
            final C3004eg<Date> b = dvVar.mo9134b(Date.class);
            return new C3004eg<Timestamp>() {
                /* renamed from: b */
                public final /* bridge */ /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                    b.mo8991b(gbVar, (Timestamp) obj);
                }

                /* renamed from: d */
                public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                    Date date = (Date) b.mo8992d(fxVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            };
        }
    };

    /* renamed from: com.facetec.sdk.fp$26 */
    static /* synthetic */ class C311626 {

        /* renamed from: e */
        static final /* synthetic */ int[] f10339e;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.fv[] r0 = com.facetec.sdk.C3141fv.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10339e = r0
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f10339e     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3096fp.C311626.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.fp$c */
    static final class C3134c<T extends Enum<T>> extends C3004eg<T> {

        /* renamed from: c */
        private final Map<T, String> f10350c = new HashMap();

        /* renamed from: e */
        private final Map<String, T> f10351e = new HashMap();

        public C3134c(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C3011em emVar = (C3011em) cls.getField(name).getAnnotation(C3011em.class);
                    if (emVar != null) {
                        name = emVar.mo9197c();
                        for (String put : emVar.mo9196a()) {
                            this.f10351e.put(put, enumR);
                        }
                    }
                    this.f10351e.put(name, enumR);
                    this.f10350c.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = this.f10350c.get(enumR);
            }
            gbVar.mo9315d(str);
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() != C3141fv.NULL) {
                return (Enum) this.f10351e.get(fxVar.mo9295i());
            }
            fxVar.mo9298l();
            return null;
        }
    }

    static {
        C3004eg<Class> c = new C3004eg<Class>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(((Class) obj).getName());
                sb.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(sb.toString());
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.mo9185c();
        f10289G = c;
        f10311c = m12797c(Class.class, c);
        C3004eg<BitSet> c2 = new C3004eg<BitSet>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                BitSet bitSet = (BitSet) obj;
                gbVar.mo9312d();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    gbVar.mo9313d(bitSet.get(i) ? 1 : 0);
                }
                gbVar.mo9306a();
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12808b(fxVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
                if (r7.mo9299m() != 0) goto L_0x005b;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0060 A[SYNTHETIC] */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.util.BitSet m12808b(com.facetec.sdk.C3143fx r7) {
                /*
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r7.mo9286b()
                    com.facetec.sdk.fv r1 = r7.mo9292f()
                    r2 = 0
                    r3 = r2
                L_0x000e:
                    com.facetec.sdk.fv r4 = com.facetec.sdk.C3141fv.END_ARRAY
                    if (r1 == r4) goto L_0x0067
                    int[] r4 = com.facetec.sdk.C3096fp.C311626.f10339e
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x0055
                    r6 = 2
                    if (r4 == r6) goto L_0x0050
                    r6 = 3
                    if (r4 != r6) goto L_0x0040
                    java.lang.String r1 = r7.mo9295i()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                    if (r1 == 0) goto L_0x002e
                    goto L_0x005b
                L_0x002e:
                    r5 = r2
                    goto L_0x005b
                L_0x0030:
                    com.facetec.sdk.ei r7 = new com.facetec.sdk.ei
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>((java.lang.String) r0)
                    throw r7
                L_0x0040:
                    com.facetec.sdk.ei r7 = new com.facetec.sdk.ei
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Invalid bitset value type: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>((java.lang.String) r0)
                    throw r7
                L_0x0050:
                    boolean r5 = r7.mo9296j()
                    goto L_0x005b
                L_0x0055:
                    int r1 = r7.mo9299m()
                    if (r1 == 0) goto L_0x002e
                L_0x005b:
                    if (r5 == 0) goto L_0x0060
                    r0.set(r3)
                L_0x0060:
                    int r3 = r3 + 1
                    com.facetec.sdk.fv r1 = r7.mo9292f()
                    goto L_0x000e
                L_0x0067:
                    r7.mo9284a()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3096fp.C310012.m12808b(com.facetec.sdk.fx):java.util.BitSet");
            }
        }.mo9185c();
        f10290H = c2;
        f10313e = m12797c(BitSet.class, c2);
        C312533 r0 = new C3004eg<Number>() {
            /* renamed from: a */
            private static Number m12854a(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) fxVar.mo9299m());
                } catch (NumberFormatException e) {
                    throw new C3007ei((Throwable) e);
                }
            }

            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9307a((Number) obj);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12854a(fxVar);
            }
        };
        f10291I = r0;
        f10310b = m12796a(Byte.TYPE, Byte.class, r0);
        C312432 r02 = new C3004eg<Number>() {
            /* renamed from: e */
            private static Number m12851e(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                try {
                    return Short.valueOf((short) fxVar.mo9299m());
                } catch (NumberFormatException e) {
                    throw new C3007ei((Throwable) e);
                }
            }

            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9307a((Number) obj);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12851e(fxVar);
            }
        };
        f10292J = r02;
        f10314f = m12796a(Short.TYPE, Short.class, r02);
        C312735 r03 = new C3004eg<Number>() {
            /* renamed from: c */
            private static Number m12860c(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                try {
                    return Integer.valueOf(fxVar.mo9299m());
                } catch (NumberFormatException e) {
                    throw new C3007ei((Throwable) e);
                }
            }

            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9307a((Number) obj);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12860c(fxVar);
            }
        };
        f10296N = r03;
        f10315g = m12796a(Integer.TYPE, Integer.class, r03);
        C3004eg<AtomicInteger> c3 = new C3004eg<AtomicInteger>() {
            /* renamed from: e */
            private static AtomicInteger m12857e(C3143fx fxVar) {
                try {
                    return new AtomicInteger(fxVar.mo9299m());
                } catch (NumberFormatException e) {
                    throw new C3007ei((Throwable) e);
                }
            }

            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9313d((long) ((AtomicInteger) obj).get());
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12857e(fxVar);
            }
        }.mo9185c();
        f10294L = c3;
        f10316h = m12797c(AtomicInteger.class, c3);
        C3004eg<AtomicBoolean> c4 = new C3004eg<AtomicBoolean>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9317e(((AtomicBoolean) obj).get());
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return new AtomicBoolean(fxVar.mo9296j());
            }
        }.mo9185c();
        f10295M = c4;
        f10317i = m12797c(AtomicBoolean.class, c4);
        C3004eg<AtomicIntegerArray> c5 = new C3004eg<AtomicIntegerArray>() {
            /* renamed from: e */
            private static AtomicIntegerArray m12799e(C3143fx fxVar) {
                ArrayList arrayList = new ArrayList();
                fxVar.mo9286b();
                while (fxVar.mo9291e()) {
                    try {
                        arrayList.add(Integer.valueOf(fxVar.mo9299m()));
                    } catch (NumberFormatException e) {
                        throw new C3007ei((Throwable) e);
                    }
                }
                fxVar.mo9284a();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                gbVar.mo9312d();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    gbVar.mo9313d((long) atomicIntegerArray.get(i));
                }
                gbVar.mo9306a();
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12799e(fxVar);
            }
        }.mo9185c();
        f10293K = c5;
        f10318j = m12797c(AtomicIntegerArray.class, c5);
        C31328 r04 = new C3004eg<Number>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9307a((Number) obj);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                C3141fv f = fxVar.mo9292f();
                int i = C311626.f10339e[f.ordinal()];
                if (i == 1 || i == 3) {
                    return new C3039ew(fxVar.mo9295i());
                }
                if (i == 4) {
                    fxVar.mo9298l();
                    return null;
                }
                throw new C3007ei("Expecting number, got: ".concat(String.valueOf(f)));
            }
        };
        f10301S = r04;
        f10321m = m12797c(Number.class, r04);
        C31317 r05 = new C3004eg<Character>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                Character ch = (Character) obj;
                if (ch == null) {
                    str = null;
                } else {
                    str = String.valueOf(ch);
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                String i = fxVar.mo9295i();
                if (i.length() == 1) {
                    return Character.valueOf(i.charAt(0));
                }
                throw new C3007ei("Expecting character, got: ".concat(i));
            }
        };
        f10298P = r05;
        f10323o = m12796a(Character.TYPE, Character.class, r05);
        C310315 r06 = new C3004eg<StringBuilder>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                StringBuilder sb = (StringBuilder) obj;
                if (sb == null) {
                    str = null;
                } else {
                    str = sb.toString();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() != C3141fv.NULL) {
                    return new StringBuilder(fxVar.mo9295i());
                }
                fxVar.mo9298l();
                return null;
            }
        };
        f10299Q = r06;
        f10326r = m12797c(StringBuilder.class, r06);
        C310214 r07 = new C3004eg<StringBuffer>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer == null) {
                    str = null;
                } else {
                    str = stringBuffer.toString();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() != C3141fv.NULL) {
                    return new StringBuffer(fxVar.mo9295i());
                }
                fxVar.mo9298l();
                return null;
            }
        };
        f10300R = r07;
        f10327s = m12797c(StringBuffer.class, r07);
        C310113 r08 = new C3004eg<URL>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                URL url = (URL) obj;
                if (url == null) {
                    str = null;
                } else {
                    str = url.toExternalForm();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                String i = fxVar.mo9295i();
                if ("null".equals(i)) {
                    return null;
                }
                return new URL(i);
            }
        };
        f10305W = r08;
        f10333y = m12797c(URL.class, r08);
        C309911 r09 = new C3004eg<URI>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                URI uri = (URI) obj;
                if (uri == null) {
                    str = null;
                } else {
                    str = uri.toASCIIString();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return m12805b(fxVar);
            }

            /* renamed from: b */
            private static URI m12805b(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                try {
                    String i = fxVar.mo9295i();
                    if ("null".equals(i)) {
                        return null;
                    }
                    return new URI(i);
                } catch (URISyntaxException e) {
                    throw new C2997eb((Throwable) e);
                }
            }
        };
        f10303U = r09;
        f10332x = m12797c(URI.class, r09);
        C310719 r010 = new C3004eg<InetAddress>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    str = null;
                } else {
                    str = inetAddress.getHostAddress();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() != C3141fv.NULL) {
                    return InetAddress.getByName(fxVar.mo9295i());
                }
                fxVar.mo9298l();
                return null;
            }
        };
        f10306X = r010;
        f10329u = m12798d(InetAddress.class, r010);
        C310416 r011 = new C3004eg<UUID>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    str = null;
                } else {
                    str = uuid.toString();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() != C3141fv.NULL) {
                    return UUID.fromString(fxVar.mo9295i());
                }
                fxVar.mo9298l();
                return null;
            }
        };
        f10304V = r011;
        f10331w = m12797c(UUID.class, r011);
        C3004eg<Currency> c6 = new C3004eg<Currency>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                gbVar.mo9315d(((Currency) obj).getCurrencyCode());
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return Currency.getInstance(fxVar.mo9295i());
            }
        }.mo9185c();
        f10302T = c6;
        f10330v = m12797c(Currency.class, c6);
        final C310618 r012 = new C3004eg<Calendar>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    gbVar.mo9318f();
                    return;
                }
                gbVar.mo9316e();
                gbVar.mo9308a("year");
                gbVar.mo9313d((long) calendar.get(1));
                gbVar.mo9308a("month");
                gbVar.mo9313d((long) calendar.get(2));
                gbVar.mo9308a("dayOfMonth");
                gbVar.mo9313d((long) calendar.get(5));
                gbVar.mo9308a("hourOfDay");
                gbVar.mo9313d((long) calendar.get(11));
                gbVar.mo9308a("minute");
                gbVar.mo9313d((long) calendar.get(12));
                gbVar.mo9308a("second");
                gbVar.mo9313d((long) calendar.get(13));
                gbVar.mo9310c();
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                fxVar.mo9289d();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (fxVar.mo9292f() != C3141fv.END_OBJECT) {
                    String g = fxVar.mo9293g();
                    int m = fxVar.mo9299m();
                    if ("year".equals(g)) {
                        i = m;
                    } else if ("month".equals(g)) {
                        i2 = m;
                    } else if ("dayOfMonth".equals(g)) {
                        i3 = m;
                    } else if ("hourOfDay".equals(g)) {
                        i4 = m;
                    } else if ("minute".equals(g)) {
                        i5 = m;
                    } else if ("second".equals(g)) {
                        i6 = m;
                    }
                }
                fxVar.mo9287c();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
        };
        f10308aa = r012;
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        f10283A = new C3013eo() {
            /* renamed from: c */
            public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
                Class<? super T> a = fwVar.mo9331a();
                if (a == cls || a == cls2) {
                    return r012;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(r012);
                sb.append("]");
                return sb.toString();
            }
        };
        C311222 r013 = new C3004eg<Locale>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                String str;
                Locale locale = (Locale) obj;
                if (locale == null) {
                    str = null;
                } else {
                    str = locale.toString();
                }
                gbVar.mo9315d(str);
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                String str;
                String str2;
                String str3 = null;
                if (fxVar.mo9292f() == C3141fv.NULL) {
                    fxVar.mo9298l();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(fxVar.mo9295i(), "_");
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
        };
        f10309ac = r013;
        f10286D = m12797c(Locale.class, r013);
        C311424 r014 = new C3004eg<C3000ee>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo8991b(C3160gb gbVar, C3000ee eeVar) {
                if (eeVar == null || eeVar.mo9182j()) {
                    gbVar.mo9318f();
                } else if (eeVar.mo9179f()) {
                    C3008ej o = eeVar.mo9183o();
                    if (o.mo9192n()) {
                        gbVar.mo9307a(o.mo9147d());
                    } else if (o.mo9191l()) {
                        gbVar.mo9317e(o.mo9152i());
                    } else {
                        gbVar.mo9315d(o.mo9144b());
                    }
                } else if (eeVar.mo9180g()) {
                    gbVar.mo9312d();
                    if (eeVar.mo9180g()) {
                        Iterator<C3000ee> it = ((C2982dz) eeVar).iterator();
                        while (it.hasNext()) {
                            mo8991b(gbVar, it.next());
                        }
                        gbVar.mo9306a();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(eeVar)));
                } else if (eeVar.mo9181h()) {
                    gbVar.mo9316e();
                    if (eeVar.mo9181h()) {
                        for (Map.Entry next : ((C2999ed) eeVar).mo9178l()) {
                            gbVar.mo9308a((String) next.getKey());
                            mo8991b(gbVar, (C3000ee) next.getValue());
                        }
                        gbVar.mo9310c();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(eeVar)));
                } else {
                    StringBuilder sb = new StringBuilder("Couldn't write ");
                    sb.append(eeVar.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3000ee mo8992d(C3143fx fxVar) {
                switch (C311626.f10339e[fxVar.mo9292f().ordinal()]) {
                    case 1:
                        return new C3008ej((Number) new C3039ew(fxVar.mo9295i()));
                    case 2:
                        return new C3008ej(Boolean.valueOf(fxVar.mo9296j()));
                    case 3:
                        return new C3008ej(fxVar.mo9295i());
                    case 4:
                        fxVar.mo9298l();
                        return C2996ea.f10129b;
                    case 5:
                        C2982dz dzVar = new C2982dz();
                        fxVar.mo9286b();
                        while (fxVar.mo9291e()) {
                            dzVar.mo9149e(mo8992d(fxVar));
                        }
                        fxVar.mo9284a();
                        return dzVar;
                    case 6:
                        C2999ed edVar = new C2999ed();
                        fxVar.mo9289d();
                        while (fxVar.mo9291e()) {
                            edVar.mo9173c(fxVar.mo9293g(), mo8992d(fxVar));
                        }
                        fxVar.mo9287c();
                        return edVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        };
        f10284B = r014;
        f10285C = m12798d(C3000ee.class, r014);
    }

    /* renamed from: a */
    public static <TT> C3013eo m12796a(final Class<TT> cls, final Class<TT> cls2, final C3004eg<? super TT> egVar) {
        return new C3013eo() {
            /* renamed from: c */
            public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
                Class<? super T> a = fwVar.mo9331a();
                if (a == cls || a == cls2) {
                    return egVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(egVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: c */
    public static <TT> C3013eo m12797c(final Class<TT> cls, final C3004eg<TT> egVar) {
        return new C3013eo() {
            /* renamed from: c */
            public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
                if (fwVar.mo9331a() == cls) {
                    return egVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(egVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: d */
    private static <T1> C3013eo m12798d(final Class<T1> cls, final C3004eg<T1> egVar) {
        return new C3013eo() {
            /* renamed from: c */
            public final <T2> C3004eg<T2> mo9200c(C2972dv dvVar, C3142fw<T2> fwVar) {
                final Class<? super T2> a = fwVar.mo9331a();
                if (!cls.isAssignableFrom(a)) {
                    return null;
                }
                return new C3004eg<T1>() {
                    /* renamed from: b */
                    public final void mo8991b(C3160gb gbVar, T1 t1) {
                        egVar.mo8991b(gbVar, t1);
                    }

                    /* renamed from: d */
                    public final T1 mo8992d(C3143fx fxVar) {
                        T1 d = egVar.mo8992d(fxVar);
                        if (d == null || a.isInstance(d)) {
                            return d;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(a.getName());
                        sb.append(" but was ");
                        sb.append(d.getClass().getName());
                        throw new C3007ei(sb.toString());
                    }
                };
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(egVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
