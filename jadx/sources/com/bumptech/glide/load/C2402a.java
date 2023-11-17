package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C2502f0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p089g4.C6206a;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.a */
public abstract class C2402a {

    /* renamed from: com.bumptech.glide.load.a$a */
    class C2403a implements C2410h {

        /* renamed from: a */
        final /* synthetic */ InputStream f7631a;

        C2403a(InputStream inputStream) {
            this.f7631a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7772a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7768c(this.f7631a);
            } finally {
                this.f7631a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    class C2404b implements C2410h {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f7632a;

        C2404b(ByteBuffer byteBuffer) {
            this.f7632a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7772a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7766a(this.f7632a);
            } finally {
                C6206a.m24700d(this.f7632a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    class C2405c implements C2410h {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f7633a;

        /* renamed from: b */
        final /* synthetic */ C7674b f7634b;

        C2405c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C7674b bVar) {
            this.f7633a = parcelFileDescriptorRewinder;
            this.f7634b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo7772a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.f0 r1 = new com.bumptech.glide.load.resource.bitmap.f0     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f7633a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo7774a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                p3.b r3 = r4.f7634b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo7768c(r1)     // Catch:{ all -> 0x0024 }
                r1.mo7996n()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f7633a
                r0.mo7774a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.mo7996n()
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f7633a
                r0.mo7774a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C2402a.C2405c.mo7772a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    class C2406d implements C2409g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f7635a;

        /* renamed from: b */
        final /* synthetic */ C7674b f7636b;

        C2406d(ByteBuffer byteBuffer, C7674b bVar) {
            this.f7635a = byteBuffer;
            this.f7636b = bVar;
        }

        /* renamed from: a */
        public int mo7773a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7769d(this.f7635a, this.f7636b);
            } finally {
                C6206a.m24700d(this.f7635a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    class C2407e implements C2409g {

        /* renamed from: a */
        final /* synthetic */ InputStream f7637a;

        /* renamed from: b */
        final /* synthetic */ C7674b f7638b;

        C2407e(InputStream inputStream, C7674b bVar) {
            this.f7637a = inputStream;
            this.f7638b = bVar;
        }

        /* renamed from: a */
        public int mo7773a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7767b(this.f7637a, this.f7638b);
            } finally {
                this.f7637a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    class C2408f implements C2409g {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f7639a;

        /* renamed from: b */
        final /* synthetic */ C7674b f7640b;

        C2408f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C7674b bVar) {
            this.f7639a = parcelFileDescriptorRewinder;
            this.f7640b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo7773a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.f0 r1 = new com.bumptech.glide.load.resource.bitmap.f0     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f7639a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo7774a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                p3.b r3 = r4.f7640b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                p3.b r0 = r4.f7640b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo7767b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.mo7996n()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f7639a
                r0.mo7774a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.mo7996n()
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f7639a
                r0.mo7774a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C2402a.C2408f.mo7773a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    private interface C2409g {
        /* renamed from: a */
        int mo7773a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    private interface C2410h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo7772a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m9316a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C7674b bVar) {
        return m9319d(list, new C2408f(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: b */
    public static int m9317b(List list, InputStream inputStream, C7674b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2502f0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m9319d(list, new C2407e(inputStream, bVar));
    }

    /* renamed from: c */
    public static int m9318c(List list, ByteBuffer byteBuffer, C7674b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return m9319d(list, new C2406d(byteBuffer, bVar));
    }

    /* renamed from: d */
    private static int m9319d(List list, C2409g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = gVar.mo7773a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m9320e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C7674b bVar) {
        return m9323h(list, new C2405c(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m9321f(List list, InputStream inputStream, C7674b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2502f0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m9323h(list, new C2403a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m9322g(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m9323h(list, new C2404b(byteBuffer));
    }

    /* renamed from: h */
    private static ImageHeaderParser.ImageType m9323h(List list, C2410h hVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = hVar.mo7772a((ImageHeaderParser) list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
