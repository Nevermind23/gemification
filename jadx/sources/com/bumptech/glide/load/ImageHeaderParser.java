package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p205p3.C7674b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);
        

        /* renamed from: d */
        private final boolean f7629d;

        private ImageType(boolean z) {
            this.f7629d = z;
        }

        public boolean hasAlpha() {
            return this.f7629d;
        }

        public boolean isWebp() {
            int i = C2401a.f7630a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    static /* synthetic */ class C2401a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7630a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7630a = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7630a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.ImageHeaderParser.C2401a.<clinit>():void");
        }
    }

    /* renamed from: a */
    ImageType mo7766a(ByteBuffer byteBuffer);

    /* renamed from: b */
    int mo7767b(InputStream inputStream, C7674b bVar);

    /* renamed from: c */
    ImageType mo7768c(InputStream inputStream);

    /* renamed from: d */
    int mo7769d(ByteBuffer byteBuffer, C7674b bVar);
}
