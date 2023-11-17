package p473je;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12427a;
import p403ee.C12433d;
import p445he.C15490e;

/* renamed from: je.c */
public abstract class C15760c extends C15758a {

    /* renamed from: e */
    public static final C15761a f44718e = new C15761a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final String f44719f;

    /* renamed from: je.c$a */
    public static final class C15761a {
        private C15761a() {
        }

        public /* synthetic */ C15761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = C15490e.class.getSimpleName();
        C41536l.m120488h(simpleName, "EglSurface::class.java.simpleName");
        f44719f = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15760c(C12427a aVar, C15490e eVar) {
        super(aVar, eVar);
        C41536l.m120489i(aVar, "eglCore");
        C41536l.m120489i(eVar, "eglSurface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        se1.C42550b.m123187a(r0, r3);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo43166i(android.graphics.Bitmap.CompressFormat r3) {
        /*
            r2 = this;
            java.lang.String r0 = "format"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2.mo43167j(r0, r3)     // Catch:{ all -> 0x001b }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x001b }
            java.lang.String r1 = "it.toByteArray()"
            kotlin.jvm.internal.C41536l.m120488h(r3, r1)     // Catch:{ all -> 0x001b }
            r1 = 0
            se1.C42550b.m123187a(r0, r1)
            return r3
        L_0x001b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001d }
        L_0x001d:
            r1 = move-exception
            se1.C42550b.m123187a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p473je.C15760c.mo43166i(android.graphics.Bitmap$CompressFormat):byte[]");
    }

    /* renamed from: j */
    public final void mo43167j(OutputStream outputStream, Bitmap.CompressFormat compressFormat) {
        C41536l.m120489i(outputStream, "stream");
        C41536l.m120489i(compressFormat, "format");
        if (mo43161e()) {
            int d = mo43160d();
            int c = mo43159c();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(d * c * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            GLES20.glReadPixels(0, 0, d, c, 6408, 5121, allocateDirect);
            C12433d.m47459b("glReadPixels");
            allocateDirect.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(d, c, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            createBitmap.compress(compressFormat, 90, outputStream);
            createBitmap.recycle();
            return;
        }
        throw new RuntimeException("Expected EGL context/surface is not current");
    }
}
