package p244s3;

import android.util.Log;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p076f4.C6156d;
import p089g4.C6206a;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.d */
public class C8153d implements C8188n {

    /* renamed from: s3.d$a */
    private static final class C8154a implements C2415d {

        /* renamed from: d */
        private final File f23299d;

        C8154a(File file) {
            this.f23299d = file;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return ByteBuffer.class;
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
            try {
                aVar.mo7798f(C6206a.m24697a(this.f23299d));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo7797c(e);
            }
        }
    }

    /* renamed from: s3.d$b */
    public static class C8155b implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8153d();
        }
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(File file, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(file), new C8154a(file));
    }

    /* renamed from: d */
    public boolean mo23327b(File file) {
        return true;
    }
}
