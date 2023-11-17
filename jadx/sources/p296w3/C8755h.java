package p296w3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.C2402a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p089g4.C6206a;
import p089g4.C6224l;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7674b;
import p270u3.C8563l;

/* renamed from: w3.h */
public final class C8755h {

    /* renamed from: a */
    private final List f24606a;

    /* renamed from: b */
    private final C7674b f24607b;

    /* renamed from: w3.h$a */
    private static final class C8756a implements C7430c {

        /* renamed from: d */
        private final AnimatedImageDrawable f24608d;

        C8756a(AnimatedImageDrawable animatedImageDrawable) {
            this.f24608d = animatedImageDrawable;
        }

        /* renamed from: a */
        public int mo7941a() {
            return this.f24608d.getIntrinsicWidth() * this.f24608d.getIntrinsicHeight() * C6224l.m24740i(Bitmap.Config.ARGB_8888) * 2;
        }

        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f24608d;
        }

        /* renamed from: d */
        public Class mo7944d() {
            return Drawable.class;
        }

        public void recycle() {
            this.f24608d.stop();
            this.f24608d.clearAnimationCallbacks();
        }
    }

    /* renamed from: w3.h$b */
    private static final class C8757b implements C7090j {

        /* renamed from: a */
        private final C8755h f24609a;

        C8757b(C8755h hVar) {
            this.f24609a = hVar;
        }

        /* renamed from: c */
        public C7430c mo7972b(ByteBuffer byteBuffer, int i, int i2, C7088h hVar) {
            return this.f24609a.mo24156b(ImageDecoder.createSource(byteBuffer), i, i2, hVar);
        }

        /* renamed from: d */
        public boolean mo7971a(ByteBuffer byteBuffer, C7088h hVar) {
            return this.f24609a.mo24158d(byteBuffer);
        }
    }

    /* renamed from: w3.h$c */
    private static final class C8758c implements C7090j {

        /* renamed from: a */
        private final C8755h f24610a;

        C8758c(C8755h hVar) {
            this.f24610a = hVar;
        }

        /* renamed from: c */
        public C7430c mo7972b(InputStream inputStream, int i, int i2, C7088h hVar) {
            return this.f24610a.mo24156b(ImageDecoder.createSource(C6206a.m24698b(inputStream)), i, i2, hVar);
        }

        /* renamed from: d */
        public boolean mo7971a(InputStream inputStream, C7088h hVar) {
            return this.f24610a.mo24157c(inputStream);
        }
    }

    private C8755h(List list, C7674b bVar) {
        this.f24606a = list;
        this.f24607b = bVar;
    }

    /* renamed from: a */
    public static C7090j m32570a(List list, C7674b bVar) {
        return new C8757b(new C8755h(list, bVar));
    }

    /* renamed from: e */
    private boolean m32571e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    /* renamed from: f */
    public static C7090j m32572f(List list, C7674b bVar) {
        return new C8758c(new C8755h(list, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7430c mo24156b(ImageDecoder.Source source, int i, int i2, C7088h hVar) {
        Drawable a = ImageDecoder.decodeDrawable(source, new C8563l(i, i2, hVar));
        if (C8749b.m32564a(a)) {
            return new C8756a(C8750c.m32565a(a));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo24157c(InputStream inputStream) {
        return m32571e(C2402a.m9321f(this.f24606a, inputStream, this.f24607b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo24158d(ByteBuffer byteBuffer) {
        return m32571e(C2402a.m9322g(this.f24606a, byteBuffer));
    }
}
