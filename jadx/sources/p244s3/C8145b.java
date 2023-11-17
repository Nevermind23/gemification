package p244s3;

import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.b */
public class C8145b implements C8188n {

    /* renamed from: a */
    private final C8148b f23294a;

    /* renamed from: s3.b$a */
    public static class C8146a implements C8190o {

        /* renamed from: s3.b$a$a */
        class C8147a implements C8148b {
            C8147a() {
            }

            /* renamed from: a */
            public Class mo23334a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo23335b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8145b(new C8147a());
        }
    }

    /* renamed from: s3.b$b */
    public interface C8148b {
        /* renamed from: a */
        Class mo23334a();

        /* renamed from: b */
        Object mo23335b(byte[] bArr);
    }

    /* renamed from: s3.b$c */
    private static class C8149c implements C2415d {

        /* renamed from: d */
        private final byte[] f23296d;

        /* renamed from: e */
        private final C8148b f23297e;

        C8149c(byte[] bArr, C8148b bVar) {
            this.f23296d = bArr;
            this.f23297e = bVar;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23297e.mo23334a();
        }

        /* renamed from: b */
        public void mo7786b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            aVar.mo7798f(this.f23297e.mo23335b(this.f23296d));
        }
    }

    /* renamed from: s3.b$d */
    public static class C8150d implements C8190o {

        /* renamed from: s3.b$d$a */
        class C8151a implements C8148b {
            C8151a() {
            }

            /* renamed from: a */
            public Class mo23334a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo23335b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8145b(new C8151a());
        }
    }

    public C8145b(C8148b bVar) {
        this.f23294a = bVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(byte[] bArr, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(bArr), new C8149c(bArr, this.f23294a));
    }

    /* renamed from: d */
    public boolean mo23327b(byte[] bArr) {
        return true;
    }
}
