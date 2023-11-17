package p263t9;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p237r9.C8071b;
import p237r9.C8074c;
import p237r9.C8075d;
import p237r9.C8076e;
import p237r9.C8077f;

/* renamed from: t9.e */
final class C8428e implements C8075d, C8077f {

    /* renamed from: a */
    private C8428e f23887a = null;

    /* renamed from: b */
    private boolean f23888b = true;

    /* renamed from: c */
    private final JsonWriter f23889c;

    /* renamed from: d */
    private final Map f23890d;

    /* renamed from: e */
    private final Map f23891e;

    /* renamed from: f */
    private final C8074c f23892f;

    /* renamed from: g */
    private final boolean f23893g;

    C8428e(Writer writer, Map map, Map map2, C8074c cVar, boolean z) {
        this.f23889c = new JsonWriter(writer);
        this.f23890d = map;
        this.f23891e = map2;
        this.f23892f = cVar;
        this.f23893g = z;
    }

    /* renamed from: q */
    private boolean m31613q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C8428e m31614t(String str, Object obj) {
        m31616v();
        this.f23889c.name(str);
        if (obj != null) {
            return mo23605i(obj, false);
        }
        this.f23889c.nullValue();
        return this;
    }

    /* renamed from: u */
    private C8428e m31615u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m31616v();
        this.f23889c.name(str);
        return mo23605i(obj, false);
    }

    /* renamed from: v */
    private void m31616v() {
        if (this.f23888b) {
            C8428e eVar = this.f23887a;
            if (eVar != null) {
                eVar.m31616v();
                this.f23887a.f23888b = false;
                this.f23887a = null;
                this.f23889c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: b */
    public C8075d mo23253b(C8071b bVar, long j) {
        return mo23608l(bVar.mo23246b(), j);
    }

    /* renamed from: c */
    public C8075d mo23254c(C8071b bVar, int i) {
        return mo23607k(bVar.mo23246b(), i);
    }

    /* renamed from: d */
    public C8075d mo23255d(C8071b bVar, boolean z) {
        return mo23610n(bVar.mo23246b(), z);
    }

    /* renamed from: e */
    public C8075d mo23256e(C8071b bVar, Object obj) {
        return mo23609m(bVar.mo23246b(), obj);
    }

    /* renamed from: g */
    public C8428e mo23603g(int i) {
        m31616v();
        this.f23889c.value((long) i);
        return this;
    }

    /* renamed from: h */
    public C8428e mo23604h(long j) {
        m31616v();
        this.f23889c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C8428e mo23605i(Object obj, boolean z) {
        Class<?> cls;
        int i = 0;
        if (z && m31613q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f23889c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f23889c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo23612p((byte[]) obj);
            }
            this.f23889c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f23889c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo23604h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f23889c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f23889c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo23605i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo23605i(i3, false);
                }
            }
            this.f23889c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f23889c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo23605i(i4, false);
            }
            this.f23889c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f23889c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo23609m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f23889c.endObject();
            return this;
        } else {
            C8074c cVar = (C8074c) this.f23890d.get(obj.getClass());
            if (cVar != null) {
                return mo23614s(cVar, obj, z);
            }
            C8076e eVar = (C8076e) this.f23891e.get(obj.getClass());
            if (eVar != null) {
                eVar.mo23257a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo23614s(this.f23892f, obj, z);
            } else {
                mo23258a(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: j */
    public C8428e mo23258a(String str) {
        m31616v();
        this.f23889c.value(str);
        return this;
    }

    /* renamed from: k */
    public C8428e mo23607k(String str, int i) {
        m31616v();
        this.f23889c.name(str);
        return mo23603g(i);
    }

    /* renamed from: l */
    public C8428e mo23608l(String str, long j) {
        m31616v();
        this.f23889c.name(str);
        return mo23604h(j);
    }

    /* renamed from: m */
    public C8428e mo23609m(String str, Object obj) {
        if (this.f23893g) {
            return m31615u(str, obj);
        }
        return m31614t(str, obj);
    }

    /* renamed from: n */
    public C8428e mo23610n(String str, boolean z) {
        m31616v();
        this.f23889c.name(str);
        return mo23259f(z);
    }

    /* renamed from: o */
    public C8428e mo23259f(boolean z) {
        m31616v();
        this.f23889c.value(z);
        return this;
    }

    /* renamed from: p */
    public C8428e mo23612p(byte[] bArr) {
        m31616v();
        if (bArr == null) {
            this.f23889c.nullValue();
        } else {
            this.f23889c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23613r() {
        m31616v();
        this.f23889c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C8428e mo23614s(C8074c cVar, Object obj, boolean z) {
        if (!z) {
            this.f23889c.beginObject();
        }
        cVar.mo17552a(obj, this);
        if (!z) {
            this.f23889c.endObject();
        }
        return this;
    }
}
