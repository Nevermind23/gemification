package p244s3;

import android.util.Base64;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.e */
public final class C8156e implements C8188n {

    /* renamed from: a */
    private final C8157a f23300a;

    /* renamed from: s3.e$a */
    public interface C8157a {
        /* renamed from: a */
        Class mo23341a();

        /* renamed from: b */
        void mo23342b(Object obj);

        /* renamed from: c */
        Object mo23343c(String str);
    }

    /* renamed from: s3.e$b */
    private static final class C8158b implements C2415d {

        /* renamed from: d */
        private final String f23301d;

        /* renamed from: e */
        private final C8157a f23302e;

        /* renamed from: f */
        private Object f23303f;

        C8158b(String str, C8157a aVar) {
            this.f23301d = str;
            this.f23302e = aVar;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23302e.mo23341a();
        }

        /* renamed from: b */
        public void mo7786b() {
            try {
                this.f23302e.mo23342b(this.f23303f);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            try {
                Object c = this.f23302e.mo23343c(this.f23301d);
                this.f23303f = c;
                aVar.mo7798f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo7797c(e);
            }
        }
    }

    /* renamed from: s3.e$c */
    public static final class C8159c implements C8190o {

        /* renamed from: a */
        private final C8157a f23304a = new C8160a();

        /* renamed from: s3.e$c$a */
        class C8160a implements C8157a {
            C8160a() {
            }

            /* renamed from: a */
            public Class mo23341a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo23342b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo23343c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8156e(this.f23304a);
        }
    }

    public C8156e(C8157a aVar) {
        this.f23300a = aVar;
    }

    /* renamed from: a */
    public C8188n.C8189a mo23326a(Object obj, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(obj), new C8158b(obj.toString(), this.f23300a));
    }

    /* renamed from: b */
    public boolean mo23327b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
