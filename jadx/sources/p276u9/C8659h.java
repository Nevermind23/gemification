package p276u9;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p237r9.C8074c;
import p237r9.C8075d;
import p250s9.C8274a;
import p250s9.C8275b;

/* renamed from: u9.h */
public class C8659h {

    /* renamed from: a */
    private final Map f24460a;

    /* renamed from: b */
    private final Map f24461b;

    /* renamed from: c */
    private final C8074c f24462c;

    /* renamed from: u9.h$a */
    public static final class C8660a implements C8275b {

        /* renamed from: d */
        private static final C8074c f24463d = new C8658g();

        /* renamed from: a */
        private final Map f24464a = new HashMap();

        /* renamed from: b */
        private final Map f24465b = new HashMap();

        /* renamed from: c */
        private C8074c f24466c = f24463d;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m32307e(Object obj, C8075d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C8659h mo24009c() {
            return new C8659h(new HashMap(this.f24464a), new HashMap(this.f24465b), this.f24466c);
        }

        /* renamed from: d */
        public C8660a mo24010d(C8274a aVar) {
            aVar.mo17551a(this);
            return this;
        }

        /* renamed from: f */
        public C8660a mo23442a(Class cls, C8074c cVar) {
            this.f24464a.put(cls, cVar);
            this.f24465b.remove(cls);
            return this;
        }
    }

    C8659h(Map map, Map map2, C8074c cVar) {
        this.f24460a = map;
        this.f24461b = map2;
        this.f24462c = cVar;
    }

    /* renamed from: a */
    public static C8660a m32303a() {
        return new C8660a();
    }

    /* renamed from: b */
    public void mo24007b(Object obj, OutputStream outputStream) {
        new C8656f(outputStream, this.f24460a, this.f24461b, this.f24462c).mo24006s(obj);
    }

    /* renamed from: c */
    public byte[] mo24008c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo24007b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
