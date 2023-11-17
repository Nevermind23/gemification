package com.bumptech.glide.load.resource.bitmap;

import androidx.exifinterface.media.C1415a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p089g4.C6206a;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
public final class C2554x implements ImageHeaderParser {
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7766a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public int mo7767b(InputStream inputStream, C7674b bVar) {
        int c = new C1415a(inputStream).mo4096c("Orientation", 1);
        if (c == 0) {
            return -1;
        }
        return c;
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7768c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public int mo7769d(ByteBuffer byteBuffer, C7674b bVar) {
        return mo7767b(C6206a.m24703g(byteBuffer), bVar);
    }
}
