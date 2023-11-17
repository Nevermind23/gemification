package p244s3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.g */
public class C8167g implements C8188n {

    /* renamed from: a */
    private final C8172d f23316a;

    /* renamed from: s3.g$a */
    public static class C8168a implements C8190o {

        /* renamed from: a */
        private final C8172d f23317a;

        public C8168a(C8172d dVar) {
            this.f23317a = dVar;
        }

        /* renamed from: d */
        public final C8188n mo23331d(C8196r rVar) {
            return new C8167g(this.f23317a);
        }
    }

    /* renamed from: s3.g$b */
    public static class C8169b extends C8168a {

        /* renamed from: s3.g$b$a */
        class C8170a implements C8172d {
            C8170a() {
            }

            /* renamed from: a */
            public Class mo23359a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo23360b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo23361c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C8169b() {
            super(new C8170a());
        }
    }

    /* renamed from: s3.g$c */
    private static final class C8171c implements C2415d {

        /* renamed from: d */
        private final File f23318d;

        /* renamed from: e */
        private final C8172d f23319e;

        /* renamed from: f */
        private Object f23320f;

        C8171c(File file, C8172d dVar) {
            this.f23318d = file;
            this.f23319e = dVar;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23319e.mo23359a();
        }

        /* renamed from: b */
        public void mo7786b() {
            Object obj = this.f23320f;
            if (obj != null) {
                try {
                    this.f23319e.mo23360b(obj);
                } catch (IOException unused) {
                }
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
                Object c = this.f23319e.mo23361c(this.f23318d);
                this.f23320f = c;
                aVar.mo7798f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo7797c(e);
            }
        }
    }

    /* renamed from: s3.g$d */
    public interface C8172d {
        /* renamed from: a */
        Class mo23359a();

        /* renamed from: b */
        void mo23360b(Object obj);

        /* renamed from: c */
        Object mo23361c(File file);
    }

    /* renamed from: s3.g$e */
    public static class C8173e extends C8168a {

        /* renamed from: s3.g$e$a */
        class C8174a implements C8172d {
            C8174a() {
            }

            /* renamed from: a */
            public Class mo23359a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo23360b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo23361c(File file) {
                return new FileInputStream(file);
            }
        }

        public C8173e() {
            super(new C8174a());
        }
    }

    public C8167g(C8172d dVar) {
        this.f23316a = dVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(File file, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(file), new C8171c(file, this.f23316a));
    }

    /* renamed from: d */
    public boolean mo23327b(File file) {
        return true;
    }
}
