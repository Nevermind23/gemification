package p318y0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y0.a */
public final class C8989a implements C9007l {

    /* renamed from: f */
    public static final C8990a f25020f = new C8990a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String f25021d;

    /* renamed from: e */
    private final Object[] f25022e;

    /* renamed from: y0.a$a */
    public static final class C8990a {
        private C8990a() {
        }

        public /* synthetic */ C8990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m33276a(C9006k kVar, int i, Object obj) {
            long j;
            if (obj == null) {
                kVar.mo23624j1(i);
            } else if (obj instanceof byte[]) {
                kVar.mo23618X0(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                kVar.mo23620b(i, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                kVar.mo23620b(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                kVar.mo23628r(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                kVar.mo23628r(i, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                kVar.mo23628r(i, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                kVar.mo23628r(i, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                kVar.mo23623j(i, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                kVar.mo23628r(i, j);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        /* renamed from: b */
        public final void mo24407b(C9006k kVar, Object[] objArr) {
            C41536l.m120489i(kVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    Object obj = objArr[i];
                    i++;
                    m33276a(kVar, i, obj);
                }
            }
        }
    }

    public C8989a(String str, Object[] objArr) {
        C41536l.m120489i(str, "query");
        this.f25021d = str;
        this.f25022e = objArr;
    }

    /* renamed from: a */
    public String mo23619a() {
        return this.f25021d;
    }

    /* renamed from: c */
    public void mo23621c(C9006k kVar) {
        C41536l.m120489i(kVar, "statement");
        f25020f.mo24407b(kVar, this.f25022e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8989a(String str) {
        this(str, (Object[]) null);
        C41536l.m120489i(str, "query");
    }
}
