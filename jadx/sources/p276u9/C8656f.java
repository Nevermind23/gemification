package p276u9;

import com.github.mikephil.charting.utils.Utils;
import com.google.firebase.encoders.EncodingException;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p237r9.C8071b;
import p237r9.C8074c;
import p237r9.C8075d;
import p237r9.C8076e;

/* renamed from: u9.f */
final class C8656f implements C8075d {

    /* renamed from: f */
    private static final Charset f24450f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C8071b f24451g = C8071b.m30586a("key").mo23252b(C8649a.m32272b().mo23986c(1).mo23985a()).mo23251a();

    /* renamed from: h */
    private static final C8071b f24452h = C8071b.m30586a(C11755a.C11756a.f34100b).mo23252b(C8649a.m32272b().mo23986c(2).mo23985a()).mo23251a();

    /* renamed from: i */
    private static final C8074c f24453i = new C8655e();

    /* renamed from: a */
    private OutputStream f24454a;

    /* renamed from: b */
    private final Map f24455b;

    /* renamed from: c */
    private final Map f24456c;

    /* renamed from: d */
    private final C8074c f24457d;

    /* renamed from: e */
    private final C8661i f24458e = new C8661i(this);

    /* renamed from: u9.f$a */
    static /* synthetic */ class C8657a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24459a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                u9.d$a[] r0 = p276u9.C8653d.C8654a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24459a = r0
                u9.d$a r1 = p276u9.C8653d.C8654a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24459a     // Catch:{ NoSuchFieldError -> 0x001d }
                u9.d$a r1 = p276u9.C8653d.C8654a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24459a     // Catch:{ NoSuchFieldError -> 0x0028 }
                u9.d$a r1 = p276u9.C8653d.C8654a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p276u9.C8656f.C8657a.<clinit>():void");
        }
    }

    C8656f(OutputStream outputStream, Map map, Map map2, C8074c cVar) {
        this.f24454a = outputStream;
        this.f24455b = map;
        this.f24456c = map2;
        this.f24457d = cVar;
    }

    /* renamed from: o */
    private static ByteBuffer m32279o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private long m32280p(C8074c cVar, Object obj) {
        OutputStream outputStream;
        C8651b bVar = new C8651b();
        try {
            outputStream = this.f24454a;
            this.f24454a = bVar;
            cVar.mo17552a(obj, this);
            this.f24454a = outputStream;
            long a = bVar.mo23993a();
            bVar.close();
            return a;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    private C8656f m32281q(C8074c cVar, C8071b bVar, Object obj, boolean z) {
        long p = m32280p(cVar, obj);
        if (z && p == 0) {
            return this;
        }
        m32286w((m32284u(bVar) << 3) | 2);
        m32287x(p);
        cVar.mo17552a(obj, this);
        return this;
    }

    /* renamed from: r */
    private C8656f m32282r(C8076e eVar, C8071b bVar, Object obj, boolean z) {
        this.f24458e.mo24012c(bVar, z);
        eVar.mo23257a(obj, this.f24458e);
        return this;
    }

    /* renamed from: t */
    private static C8653d m32283t(C8071b bVar) {
        C8653d dVar = (C8653d) bVar.mo23247c(C8653d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m32284u(C8071b bVar) {
        C8653d dVar = (C8653d) bVar.mo23247c(C8653d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m32285v(Map.Entry entry, C8075d dVar) {
        dVar.mo23256e(f24451g, entry.getKey());
        dVar.mo23256e(f24452h, entry.getValue());
    }

    /* renamed from: w */
    private void m32286w(int i) {
        while (((long) (i & -128)) != 0) {
            this.f24454a.write((i & C11051p3.f31760d) | 128);
            i >>>= 7;
        }
        this.f24454a.write(i & C11051p3.f31760d);
    }

    /* renamed from: x */
    private void m32287x(long j) {
        while ((-128 & j) != 0) {
            this.f24454a.write((((int) j) & C11051p3.f31760d) | 128);
            j >>>= 7;
        }
        this.f24454a.write(((int) j) & C11051p3.f31760d);
    }

    /* renamed from: e */
    public C8075d mo23256e(C8071b bVar, Object obj) {
        return mo23999h(bVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C8075d mo23997f(C8071b bVar, double d, boolean z) {
        if (z && d == Utils.DOUBLE_EPSILON) {
            return this;
        }
        m32286w((m32284u(bVar) << 3) | 1);
        this.f24454a.write(m32279o(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8075d mo23998g(C8071b bVar, float f, boolean z) {
        if (z && f == Utils.FLOAT_EPSILON) {
            return this;
        }
        m32286w((m32284u(bVar) << 3) | 5);
        this.f24454a.write(m32279o(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C8075d mo23999h(C8071b bVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m32286w((m32284u(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f24450f);
            m32286w(bytes.length);
            this.f24454a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object h : (Collection) obj) {
                mo23999h(bVar, h, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry q : ((Map) obj).entrySet()) {
                m32281q(f24453i, bVar, q, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo23997f(bVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo23998g(bVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo24003l(bVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo24005n(bVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m32286w((m32284u(bVar) << 3) | 2);
                m32286w(bArr.length);
                this.f24454a.write(bArr);
                return this;
            }
            C8074c cVar = (C8074c) this.f24455b.get(obj.getClass());
            if (cVar != null) {
                return m32281q(cVar, bVar, obj, z);
            }
            C8076e eVar = (C8076e) this.f24456c.get(obj.getClass());
            if (eVar != null) {
                return m32282r(eVar, bVar, obj, z);
            }
            if (obj instanceof C8652c) {
                return mo23254c(bVar, ((C8652c) obj).mo19678i());
            }
            if (obj instanceof Enum) {
                return mo23254c(bVar, ((Enum) obj).ordinal());
            }
            return m32281q(this.f24457d, bVar, obj, z);
        }
    }

    /* renamed from: i */
    public C8656f mo23254c(C8071b bVar, int i) {
        return mo24001j(bVar, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C8656f mo24001j(C8071b bVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C8653d t = m32283t(bVar);
        int i2 = C8657a.f24459a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            m32286w(t.tag() << 3);
            m32286w(i);
        } else if (i2 == 2) {
            m32286w(t.tag() << 3);
            m32286w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m32286w((t.tag() << 3) | 5);
            this.f24454a.write(m32279o(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: k */
    public C8656f mo23253b(C8071b bVar, long j) {
        return mo24003l(bVar, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C8656f mo24003l(C8071b bVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C8653d t = m32283t(bVar);
        int i = C8657a.f24459a[t.intEncoding().ordinal()];
        if (i == 1) {
            m32286w(t.tag() << 3);
            m32287x(j);
        } else if (i == 2) {
            m32286w(t.tag() << 3);
            m32287x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m32286w((t.tag() << 3) | 1);
            this.f24454a.write(m32279o(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: m */
    public C8656f mo23255d(C8071b bVar, boolean z) {
        return mo24005n(bVar, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C8656f mo24005n(C8071b bVar, boolean z, boolean z2) {
        return mo24001j(bVar, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C8656f mo24006s(Object obj) {
        if (obj == null) {
            return this;
        }
        C8074c cVar = (C8074c) this.f24455b.get(obj.getClass());
        if (cVar != null) {
            cVar.mo17552a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
