package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2402a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2428k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p089g4.C6206a;
import p089g4.C6223k;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b0 */
interface C2491b0 {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$a */
    public static final class C2492a implements C2491b0 {

        /* renamed from: a */
        private final ByteBuffer f7919a;

        /* renamed from: b */
        private final List f7920b;

        /* renamed from: c */
        private final C7674b f7921c;

        C2492a(ByteBuffer byteBuffer, List list, C7674b bVar) {
            this.f7919a = byteBuffer;
            this.f7920b = list;
            this.f7921c = bVar;
        }

        /* renamed from: e */
        private InputStream m9648e() {
            return C6206a.m24703g(C6206a.m24700d(this.f7919a));
        }

        /* renamed from: a */
        public Bitmap mo7978a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m9648e(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo7979b() {
        }

        /* renamed from: c */
        public int mo7980c() {
            return C2402a.m9318c(this.f7920b, C6206a.m24700d(this.f7919a), this.f7921c);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo7981d() {
            return C2402a.m9322g(this.f7920b, C6206a.m24700d(this.f7919a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$b */
    public static final class C2493b implements C2491b0 {

        /* renamed from: a */
        private final C2428k f7922a;

        /* renamed from: b */
        private final C7674b f7923b;

        /* renamed from: c */
        private final List f7924c;

        C2493b(InputStream inputStream, List list, C7674b bVar) {
            this.f7923b = (C7674b) C6223k.m24730d(bVar);
            this.f7924c = (List) C6223k.m24730d(list);
            this.f7922a = new C2428k(inputStream, bVar);
        }

        /* renamed from: a */
        public Bitmap mo7978a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f7922a.mo7774a(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo7979b() {
            this.f7922a.mo7812c();
        }

        /* renamed from: c */
        public int mo7980c() {
            return C2402a.m9317b(this.f7924c, this.f7922a.mo7774a(), this.f7923b);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo7981d() {
            return C2402a.m9321f(this.f7924c, this.f7922a.mo7774a(), this.f7923b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$c */
    public static final class C2494c implements C2491b0 {

        /* renamed from: a */
        private final C7674b f7925a;

        /* renamed from: b */
        private final List f7926b;

        /* renamed from: c */
        private final ParcelFileDescriptorRewinder f7927c;

        C2494c(ParcelFileDescriptor parcelFileDescriptor, List list, C7674b bVar) {
            this.f7925a = (C7674b) C6223k.m24730d(bVar);
            this.f7926b = (List) C6223k.m24730d(list);
            this.f7927c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public Bitmap mo7978a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f7927c.mo7774a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo7979b() {
        }

        /* renamed from: c */
        public int mo7980c() {
            return C2402a.m9316a(this.f7926b, this.f7927c, this.f7925a);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo7981d() {
            return C2402a.m9320e(this.f7926b, this.f7927c, this.f7925a);
        }
    }

    /* renamed from: a */
    Bitmap mo7978a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo7979b();

    /* renamed from: c */
    int mo7980c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo7981d();
}
