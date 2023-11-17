package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.util.C11818g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.u */
public abstract class C11591u {

    /* renamed from: com.salesforce.marketingcloud.media.u$a */
    public interface C11592a {
        /* renamed from: a */
        void mo30227a(C11593b bVar);

        /* renamed from: a */
        void mo30228a(Throwable th);
    }

    /* renamed from: com.salesforce.marketingcloud.media.u$b */
    public static final class C11593b {

        /* renamed from: a */
        private final C11580o.C11582b f33658a;

        /* renamed from: b */
        private final Bitmap f33659b;

        /* renamed from: c */
        private final Drawable f33660c;

        private C11593b(Bitmap bitmap, Drawable drawable, C11580o.C11582b bVar) {
            this.f33659b = bitmap;
            this.f33660c = drawable;
            this.f33658a = bVar;
        }

        /* renamed from: a */
        public Bitmap mo30269a() {
            return this.f33659b;
        }

        /* renamed from: b */
        public Drawable mo30270b() {
            return this.f33660c;
        }

        /* renamed from: c */
        public C11580o.C11582b mo30271c() {
            return this.f33658a;
        }

        /* renamed from: d */
        public boolean mo30272d() {
            return this.f33659b != null;
        }

        /* renamed from: e */
        public boolean mo30273e() {
            return this.f33660c != null;
        }

        public C11593b(Bitmap bitmap, C11580o.C11582b bVar) {
            this(bitmap, (Drawable) null, bVar);
        }

        public C11593b(Drawable drawable, C11580o.C11582b bVar) {
            this((Bitmap) null, drawable, bVar);
        }
    }

    /* renamed from: a */
    static Bitmap m42320a(InputStream inputStream, C11587s sVar) {
        BitmapFactory.Options b = m42324b(sVar);
        boolean a = m42323a(b);
        byte[] a2 = C11818g.m43263a(inputStream);
        if (a) {
            BitmapFactory.decodeStream(new ByteArrayInputStream(a2), (Rect) null, b);
            m42322a(sVar.f33632e, sVar.f33633f, b);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(a2), (Rect) null, b);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode bitmap");
    }

    /* renamed from: b */
    static BitmapFactory.Options m42324b(C11587s sVar) {
        if (!sVar.mo30247d()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        return options;
    }

    /* renamed from: a */
    public abstract void mo30203a(C11580o oVar, C11587s sVar, C11592a aVar);

    /* renamed from: a */
    public abstract boolean mo30204a(C11587s sVar);

    /* renamed from: a */
    static void m42321a(int i, int i2, int i3, int i4, BitmapFactory.Options options) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = (double) (((float) i3) / ((float) i));
            } else if (i == 0) {
                d = (double) (((float) i4) / ((float) i2));
            } else {
                i5 = Math.min((int) Math.floor((double) (((float) i4) / ((float) i2))), (int) Math.floor((double) (((float) i3) / ((float) i))));
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: a */
    private static void m42322a(int i, int i2, BitmapFactory.Options options) {
        m42321a(i, i2, options.outWidth, options.outHeight, options);
    }

    /* renamed from: a */
    static boolean m42323a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }
}
