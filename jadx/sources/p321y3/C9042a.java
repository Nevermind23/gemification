package p321y3;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C2402a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p089g4.C6218g;
import p089g4.C6224l;
import p153l3.C6874a;
import p153l3.C6877c;
import p153l3.C6878d;
import p153l3.C6879e;
import p166m3.C7080b;
import p166m3.C7088h;
import p166m3.C7090j;
import p205p3.C7674b;
import p205p3.C7676d;
import p270u3.C8566n;

/* renamed from: y3.a */
public class C9042a implements C7090j {

    /* renamed from: f */
    private static final C9043a f25188f = new C9043a();

    /* renamed from: g */
    private static final C9044b f25189g = new C9044b();

    /* renamed from: a */
    private final Context f25190a;

    /* renamed from: b */
    private final List f25191b;

    /* renamed from: c */
    private final C9044b f25192c;

    /* renamed from: d */
    private final C9043a f25193d;

    /* renamed from: e */
    private final C9045b f25194e;

    /* renamed from: y3.a$a */
    static class C9043a {
        C9043a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6874a mo24531a(C6874a.C6875a aVar, C6877c cVar, ByteBuffer byteBuffer, int i) {
            return new C6879e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: y3.a$b */
    static class C9044b {

        /* renamed from: a */
        private final Queue f25195a = C6224l.m24737f(0);

        C9044b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C6878d mo24532a(ByteBuffer byteBuffer) {
            C6878d dVar;
            dVar = (C6878d) this.f25195a.poll();
            if (dVar == null) {
                dVar = new C6878d();
            }
            return dVar.mo20970p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo24533b(C6878d dVar) {
            dVar.mo20968a();
            this.f25195a.offer(dVar);
        }
    }

    public C9042a(Context context, List list, C7676d dVar, C7674b bVar) {
        this(context, list, dVar, bVar, f25189g, f25188f);
    }

    /* renamed from: c */
    private C9049e m33471c(ByteBuffer byteBuffer, int i, int i2, C6878d dVar, C7088h hVar) {
        Bitmap.Config config;
        long b = C6218g.m24714b();
        try {
            C6877c c = dVar.mo20969c();
            if (c.mo20965b() > 0) {
                if (c.mo20966c() == 0) {
                    if (hVar.mo21312c(C9056i.f25235a) == C7080b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    C6874a a = this.f25193d.mo24531a(this.f25194e, c, byteBuffer, m33472e(c, i, i2));
                    a.mo20952d(config);
                    a.mo20949b();
                    Bitmap a2 = a.mo20948a();
                    if (a2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6218g.m24713a(b));
                        }
                        return null;
                    }
                    C9049e eVar = new C9049e(new C9046c(this.f25190a, a, C8566n.m32035c(), i, i2, a2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6218g.m24713a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6218g.m24713a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m33472e(C6877c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo20964a() / i2, cVar.mo20967d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo20967d() + "x" + cVar.mo20964a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C9049e mo7972b(ByteBuffer byteBuffer, int i, int i2, C7088h hVar) {
        C6878d a = this.f25192c.mo24532a(byteBuffer);
        try {
            return m33471c(byteBuffer, i, i2, a, hVar);
        } finally {
            this.f25192c.mo24533b(a);
        }
    }

    /* renamed from: f */
    public boolean mo7971a(ByteBuffer byteBuffer, C7088h hVar) {
        if (((Boolean) hVar.mo21312c(C9056i.f25236b)).booleanValue() || C2402a.m9322g(this.f25191b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    C9042a(Context context, List list, C7676d dVar, C7674b bVar, C9044b bVar2, C9043a aVar) {
        this.f25190a = context.getApplicationContext();
        this.f25191b = list;
        this.f25193d = aVar;
        this.f25194e = new C9045b(dVar, bVar);
        this.f25192c = bVar2;
    }
}
