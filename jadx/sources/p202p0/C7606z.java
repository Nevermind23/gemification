package p202p0;

import android.os.Bundle;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p0.z */
public abstract class C7606z {

    /* renamed from: c */
    public static final C7618l f22195c = new C7618l((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final C7606z f22196d = new C7612f();

    /* renamed from: e */
    public static final C7606z f22197e = new C7615i();

    /* renamed from: f */
    public static final C7606z f22198f = new C7611e();

    /* renamed from: g */
    public static final C7606z f22199g = new C7614h();

    /* renamed from: h */
    public static final C7606z f22200h = new C7613g();

    /* renamed from: i */
    public static final C7606z f22201i = new C7610d();

    /* renamed from: j */
    public static final C7606z f22202j = new C7609c();

    /* renamed from: k */
    public static final C7606z f22203k = new C7608b();

    /* renamed from: l */
    public static final C7606z f22204l = new C7607a();

    /* renamed from: m */
    public static final C7606z f22205m = new C7617k();

    /* renamed from: n */
    public static final C7606z f22206n = new C7616j();

    /* renamed from: a */
    private final boolean f22207a;

    /* renamed from: b */
    private final String f22208b = "nav_type";

    /* renamed from: p0.z$a */
    public static final class C7607a extends C7606z {
        C7607a() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "boolean[]";
        }

        /* renamed from: g */
        public boolean[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: h */
        public boolean[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, boolean[] zArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* renamed from: p0.z$b */
    public static final class C7608b extends C7606z {
        C7608b() {
            super(false);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "boolean";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo22275f(Bundle bundle, String str, Object obj) {
            mo22282i(bundle, str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: g */
        public Boolean mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (Boolean) bundle.get(str);
        }

        /* renamed from: h */
        public Boolean mo22274e(String str) {
            boolean z;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C41536l.m120484d(str, "true")) {
                z = true;
            } else if (C41536l.m120484d(str, "false")) {
                z = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: i */
        public void mo22282i(Bundle bundle, String str, boolean z) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putBoolean(str, z);
        }
    }

    /* renamed from: p0.z$c */
    public static final class C7609c extends C7606z {
        C7609c() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "float[]";
        }

        /* renamed from: g */
        public float[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (float[]) bundle.get(str);
        }

        /* renamed from: h */
        public float[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, float[] fArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    /* renamed from: p0.z$d */
    public static final class C7610d extends C7606z {
        C7610d() {
            super(false);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "float";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo22275f(Bundle bundle, String str, Object obj) {
            mo22288i(bundle, str, ((Number) obj).floatValue());
        }

        /* renamed from: g */
        public Float mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        /* renamed from: h */
        public Float mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: i */
        public void mo22288i(Bundle bundle, String str, float f) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putFloat(str, f);
        }
    }

    /* renamed from: p0.z$e */
    public static final class C7611e extends C7606z {
        C7611e() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "integer[]";
        }

        /* renamed from: g */
        public int[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (int[]) bundle.get(str);
        }

        /* renamed from: h */
        public int[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, int[] iArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    /* renamed from: p0.z$f */
    public static final class C7612f extends C7606z {
        C7612f() {
            super(false);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "integer";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo22275f(Bundle bundle, String str, Object obj) {
            mo22294i(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: g */
        public Integer mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* renamed from: h */
        public Integer mo22274e(String str) {
            int i;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C40439w.m117109H(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, C40405b.m116976a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: i */
        public void mo22294i(Bundle bundle, String str, int i) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putInt(str, i);
        }
    }

    /* renamed from: p0.z$g */
    public static final class C7613g extends C7606z {
        C7613g() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "long[]";
        }

        /* renamed from: g */
        public long[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (long[]) bundle.get(str);
        }

        /* renamed from: h */
        public long[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, long[] jArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    /* renamed from: p0.z$h */
    public static final class C7614h extends C7606z {
        C7614h() {
            super(false);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "long";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo22275f(Bundle bundle, String str, Object obj) {
            mo22300i(bundle, str, ((Number) obj).longValue());
        }

        /* renamed from: g */
        public Long mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        /* renamed from: h */
        public Long mo22274e(String str) {
            String str2;
            long j;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C40439w.m117114r(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                C41536l.m120488h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (C40439w.m117109H(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                j = Long.parseLong(substring, C40405b.m116976a(16));
            } else {
                j = Long.parseLong(str2);
            }
            return Long.valueOf(j);
        }

        /* renamed from: i */
        public void mo22300i(Bundle bundle, String str, long j) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putLong(str, j);
        }
    }

    /* renamed from: p0.z$i */
    public static final class C7615i extends C7606z {
        C7615i() {
            super(false);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "reference";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo22275f(Bundle bundle, String str, Object obj) {
            mo22303i(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: g */
        public Integer mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* renamed from: h */
        public Integer mo22274e(String str) {
            int i;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C40439w.m117109H(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, C40405b.m116976a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: i */
        public void mo22303i(Bundle bundle, String str, int i) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putInt(str, i);
        }
    }

    /* renamed from: p0.z$j */
    public static final class C7616j extends C7606z {
        C7616j() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "string[]";
        }

        /* renamed from: g */
        public String[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (String[]) bundle.get(str);
        }

        /* renamed from: h */
        public String[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, String[] strArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    /* renamed from: p0.z$k */
    public static final class C7617k extends C7606z {
        C7617k() {
            super(true);
        }

        /* renamed from: b */
        public String mo22271b() {
            return "string";
        }

        /* renamed from: g */
        public String mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (String) bundle.get(str);
        }

        /* renamed from: h */
        public String mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            return str;
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, String str2) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* renamed from: p0.z$l */
    public static final class C7618l {
        private C7618l() {
        }

        public /* synthetic */ C7618l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public C7606z mo22310a(String str, String str2) {
            boolean z;
            String str3;
            C7606z zVar = C7606z.f22196d;
            if (C41536l.m120484d(zVar.mo22271b(), str)) {
                return zVar;
            }
            C7606z zVar2 = C7606z.f22198f;
            if (C41536l.m120484d(zVar2.mo22271b(), str)) {
                return zVar2;
            }
            C7606z zVar3 = C7606z.f22199g;
            if (C41536l.m120484d(zVar3.mo22271b(), str)) {
                return zVar3;
            }
            C7606z zVar4 = C7606z.f22200h;
            if (C41536l.m120484d(zVar4.mo22271b(), str)) {
                return zVar4;
            }
            C7606z zVar5 = C7606z.f22203k;
            if (C41536l.m120484d(zVar5.mo22271b(), str)) {
                return zVar5;
            }
            C7606z zVar6 = C7606z.f22204l;
            if (C41536l.m120484d(zVar6.mo22271b(), str)) {
                return zVar6;
            }
            C7606z zVar7 = C7606z.f22205m;
            if (C41536l.m120484d(zVar7.mo22271b(), str)) {
                return zVar7;
            }
            C7606z zVar8 = C7606z.f22206n;
            if (C41536l.m120484d(zVar8.mo22271b(), str)) {
                return zVar8;
            }
            C7606z zVar9 = C7606z.f22201i;
            if (C41536l.m120484d(zVar9.mo22271b(), str)) {
                return zVar9;
            }
            C7606z zVar10 = C7606z.f22202j;
            if (C41536l.m120484d(zVar10.mo22271b(), str)) {
                return zVar10;
            }
            C7606z zVar11 = C7606z.f22197e;
            if (C41536l.m120484d(zVar11.mo22271b(), str)) {
                return zVar11;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return zVar7;
            }
            try {
                if (!C40439w.m117109H(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                Class<Serializable> cls = Serializable.class;
                Class<Parcelable> cls2 = Parcelable.class;
                if (C40439w.m117114r(str, "[]", false, 2, (Object) null)) {
                    str3 = str3.substring(0, str3.length() - 2);
                    C41536l.m120488h(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls3 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls3)) {
                        return new C7620n(cls3);
                    }
                    if (cls.isAssignableFrom(cls3)) {
                        return new C7622p(cls3);
                    }
                } else {
                    Class<?> cls4 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls4)) {
                        return new C7621o(cls4);
                    }
                    if (Enum.class.isAssignableFrom(cls4)) {
                        return new C7619m(cls4);
                    }
                    if (cls.isAssignableFrom(cls4)) {
                        return new C7623q(cls4);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = p202p0.C7606z.f22203k;
            r0.mo22274e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            return p202p0.C7606z.f22205m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0 = p202p0.C7606z.f22199g;
            r0.mo22274e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r0 = p202p0.C7606z.f22201i;
            r0.mo22274e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            return r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p202p0.C7606z mo22311b(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                p0.z r0 = p202p0.C7606z.f22196d     // Catch:{ IllegalArgumentException -> 0x000b }
                r0.mo22274e(r2)     // Catch:{ IllegalArgumentException -> 0x000b }
                return r0
            L_0x000b:
                p0.z r0 = p202p0.C7606z.f22199g     // Catch:{ IllegalArgumentException -> 0x0011 }
                r0.mo22274e(r2)     // Catch:{ IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                p0.z r0 = p202p0.C7606z.f22201i     // Catch:{ IllegalArgumentException -> 0x0017 }
                r0.mo22274e(r2)     // Catch:{ IllegalArgumentException -> 0x0017 }
                return r0
            L_0x0017:
                p0.z r0 = p202p0.C7606z.f22203k     // Catch:{ IllegalArgumentException -> 0x001d }
                r0.mo22274e(r2)     // Catch:{ IllegalArgumentException -> 0x001d }
                return r0
            L_0x001d:
                p0.z r2 = p202p0.C7606z.f22205m
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p202p0.C7606z.C7618l.mo22311b(java.lang.String):p0.z");
        }

        /* renamed from: c */
        public final C7606z mo22312c(Object obj) {
            C7606z zVar;
            if (obj instanceof Integer) {
                return C7606z.f22196d;
            }
            if (obj instanceof int[]) {
                return C7606z.f22198f;
            }
            if (obj instanceof Long) {
                return C7606z.f22199g;
            }
            if (obj instanceof long[]) {
                return C7606z.f22200h;
            }
            if (obj instanceof Float) {
                return C7606z.f22201i;
            }
            if (obj instanceof float[]) {
                return C7606z.f22202j;
            }
            if (obj instanceof Boolean) {
                return C7606z.f22203k;
            }
            if (obj instanceof boolean[]) {
                return C7606z.f22204l;
            }
            if ((obj instanceof String) || obj == null) {
                return C7606z.f22205m;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                return C7606z.f22206n;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                C41536l.m120486f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    if (componentType2 != null) {
                        zVar = new C7620n(componentType2);
                        return zVar;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                C41536l.m120486f(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    if (componentType4 != null) {
                        zVar = new C7622p(componentType4);
                        return zVar;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                }
            }
            if (obj instanceof Parcelable) {
                zVar = new C7621o(obj.getClass());
            } else if (obj instanceof Enum) {
                zVar = new C7619m(obj.getClass());
            } else if (obj instanceof Serializable) {
                zVar = new C7623q(obj.getClass());
            } else {
                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
            }
            return zVar;
        }
    }

    /* renamed from: p0.z$m */
    public static final class C7619m extends C7623q {

        /* renamed from: p */
        private final Class f22209p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7619m(Class cls) {
            super(false, cls);
            C41536l.m120489i(cls, "type");
            if (cls.isEnum()) {
                this.f22209p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        /* renamed from: b */
        public String mo22271b() {
            String name = this.f22209p.getName();
            C41536l.m120488h(name, "type.name");
            return name;
        }

        /* renamed from: j */
        public Enum mo22313h(String str) {
            Enum enumR;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            Object[] enumConstants = this.f22209p.getEnumConstants();
            C41536l.m120488h(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumR = null;
                    break;
                }
                enumR = enumConstants[i];
                if (C40439w.m117115s(((Enum) enumR).name(), str, true)) {
                    break;
                }
                i++;
            }
            Enum enumR2 = enumR;
            if (enumR2 != null) {
                return enumR2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f22209p.getName() + '.');
        }
    }

    /* renamed from: p0.z$n */
    public static final class C7620n extends C7606z {

        /* renamed from: o */
        private final Class f22210o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7620n(Class cls) {
            super(true);
            C41536l.m120489i(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f22210o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        /* renamed from: b */
        public String mo22271b() {
            String name = this.f22210o.getName();
            C41536l.m120488h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C41536l.m120484d(C7620n.class, obj.getClass())) {
                return false;
            }
            return C41536l.m120484d(this.f22210o, ((C7620n) obj).f22210o);
        }

        /* renamed from: g */
        public Parcelable[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: h */
        public Parcelable[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f22210o.hashCode();
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, Parcelable[] parcelableArr) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            this.f22210o.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }
    }

    /* renamed from: p0.z$o */
    public static final class C7621o extends C7606z {

        /* renamed from: o */
        private final Class f22211o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7621o(Class cls) {
            super(true);
            C41536l.m120489i(cls, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z = false;
            }
            if (z) {
                this.f22211o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        /* renamed from: a */
        public Object mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return bundle.get(str);
        }

        /* renamed from: b */
        public String mo22271b() {
            String name = this.f22211o.getName();
            C41536l.m120488h(name, "type.name");
            return name;
        }

        /* renamed from: e */
        public Object mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C41536l.m120484d(C7621o.class, obj.getClass())) {
                return false;
            }
            return C41536l.m120484d(this.f22211o, ((C7621o) obj).f22211o);
        }

        /* renamed from: f */
        public void mo22275f(Bundle bundle, String str, Object obj) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            this.f22211o.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f22211o.hashCode();
        }
    }

    /* renamed from: p0.z$p */
    public static final class C7622p extends C7606z {

        /* renamed from: o */
        private final Class f22212o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7622p(Class cls) {
            super(true);
            C41536l.m120489i(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f22212o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        /* renamed from: b */
        public String mo22271b() {
            String name = this.f22212o.getName();
            C41536l.m120488h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C41536l.m120484d(C7622p.class, obj.getClass())) {
                return false;
            }
            return C41536l.m120484d(this.f22212o, ((C7622p) obj).f22212o);
        }

        /* renamed from: g */
        public Serializable[] mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: h */
        public Serializable[] mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f22212o.hashCode();
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo22275f(android.os.Bundle r2, java.lang.String r3, java.io.Serializable[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.Class r0 = r1.f22212o
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p202p0.C7606z.C7622p.mo22275f(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    public C7606z(boolean z) {
        this.f22207a = z;
    }

    /* renamed from: a */
    public abstract Object mo22270a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo22271b();

    /* renamed from: c */
    public boolean mo22272c() {
        return this.f22207a;
    }

    /* renamed from: d */
    public final Object mo22273d(Bundle bundle, String str, String str2) {
        C41536l.m120489i(bundle, "bundle");
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        Object e = mo22274e(str2);
        mo22275f(bundle, str, e);
        return e;
    }

    /* renamed from: e */
    public abstract Object mo22274e(String str);

    /* renamed from: f */
    public abstract void mo22275f(Bundle bundle, String str, Object obj);

    public String toString() {
        return mo22271b();
    }

    /* renamed from: p0.z$q */
    public static class C7623q extends C7606z {

        /* renamed from: o */
        private final Class f22213o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7623q(Class cls) {
            super(true);
            C41536l.m120489i(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f22213o = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        /* renamed from: b */
        public String mo22271b() {
            String name = this.f22213o.getName();
            C41536l.m120488h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7623q)) {
                return false;
            }
            return C41536l.m120484d(this.f22213o, ((C7623q) obj).f22213o);
        }

        /* renamed from: g */
        public Serializable mo22270a(Bundle bundle, String str) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            return (Serializable) bundle.get(str);
        }

        /* renamed from: h */
        public Serializable mo22274e(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public int hashCode() {
            return this.f22213o.hashCode();
        }

        /* renamed from: i */
        public void mo22275f(Bundle bundle, String str, Serializable serializable) {
            C41536l.m120489i(bundle, "bundle");
            C41536l.m120489i(str, "key");
            C41536l.m120489i(serializable, C11755a.C11756a.f34100b);
            this.f22213o.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7623q(boolean z, Class cls) {
            super(z);
            C41536l.m120489i(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f22213o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
