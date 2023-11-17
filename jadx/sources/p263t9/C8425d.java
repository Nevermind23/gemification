package p263t9;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p237r9.C8070a;
import p237r9.C8074c;
import p237r9.C8075d;
import p237r9.C8076e;
import p237r9.C8077f;
import p250s9.C8274a;
import p250s9.C8275b;
import p342j$.util.DesugarTimeZone;

/* renamed from: t9.d */
public final class C8425d implements C8275b {

    /* renamed from: e */
    private static final C8074c f23877e = new C8422a();

    /* renamed from: f */
    private static final C8076e f23878f = new C8423b();

    /* renamed from: g */
    private static final C8076e f23879g = new C8424c();

    /* renamed from: h */
    private static final C8427b f23880h = new C8427b((C8426a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f23881a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f23882b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8074c f23883c = f23877e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f23884d = false;

    /* renamed from: t9.d$a */
    class C8426a implements C8070a {
        C8426a() {
        }

        /* renamed from: a */
        public String mo23244a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo23245b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        /* renamed from: b */
        public void mo23245b(Object obj, Writer writer) {
            C8428e eVar = new C8428e(writer, C8425d.this.f23881a, C8425d.this.f23882b, C8425d.this.f23883c, C8425d.this.f23884d);
            eVar.mo23605i(obj, false);
            eVar.mo23613r();
        }
    }

    /* renamed from: t9.d$b */
    private static final class C8427b implements C8076e {

        /* renamed from: a */
        private static final DateFormat f23886a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f23886a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private C8427b() {
        }

        /* synthetic */ C8427b(C8426a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo23257a(Date date, C8077f fVar) {
            fVar.mo23258a(f23886a.format(date));
        }
    }

    public C8425d() {
        mo23601p(String.class, f23878f);
        mo23601p(Boolean.class, f23879g);
        mo23601p(Date.class, f23880h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m31600l(Object obj, C8075d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: i */
    public C8070a mo23597i() {
        return new C8426a();
    }

    /* renamed from: j */
    public C8425d mo23598j(C8274a aVar) {
        aVar.mo17551a(this);
        return this;
    }

    /* renamed from: k */
    public C8425d mo23599k(boolean z) {
        this.f23884d = z;
        return this;
    }

    /* renamed from: o */
    public C8425d mo23442a(Class cls, C8074c cVar) {
        this.f23881a.put(cls, cVar);
        this.f23882b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public C8425d mo23601p(Class cls, C8076e eVar) {
        this.f23882b.put(cls, eVar);
        this.f23881a.remove(cls);
        return this;
    }
}
