package p346ae;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;
import androidx.exifinterface.media.C1415a;
import com.otaliastudios.cameraview.C11278a;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p472jd.C15754k;
import p486kd.C16365b;
import p500ld.C16544a;
import p500ld.C16546c;
import p500ld.C16550f;
import p651wd.C18503c;
import p651wd.C18516k;

/* renamed from: ae.b */
public class C9805b extends C9808c implements ImageReader.OnImageAvailableListener {

    /* renamed from: h */
    private final C16546c f26626h;

    /* renamed from: i */
    private final C16544a f26627i = new C9806a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ImageReader f26628j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final CaptureRequest.Builder f26629k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public DngCreator f26630l;

    /* renamed from: ae.b$a */
    class C9806a extends C16550f {
        C9806a() {
        }

        /* renamed from: e */
        public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
            super.mo26301e(cVar, captureRequest);
            if (captureRequest.getTag() == 2) {
                C9808c.f26633g.mo42878c("onCaptureStarted:", "Dispatching picture shutter.");
                C9805b.this.mo26304a(false);
                mo43702o(Integer.MAX_VALUE);
            }
        }

        /* renamed from: g */
        public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            try {
                super.mo26302g(cVar, captureRequest, totalCaptureResult);
            } catch (Exception e) {
                C9805b.this.f26636f = e;
                C9805b.this.mo26296b();
            }
            C9805b bVar = C9805b.this;
            if (bVar.f26634d.f32750g == C15754k.DNG) {
                DngCreator unused = bVar.f26630l = new DngCreator(cVar.mo43381i(this), totalCaptureResult);
                C9805b.this.f26630l.setOrientation(C18503c.m62990a(C9805b.this.f26634d.f32746c));
                C9805b bVar2 = C9805b.this;
                if (bVar2.f26634d.f32745b != null) {
                    bVar2.f26630l.setLocation(C9805b.this.f26634d.f32745b);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo26303m(C16546c cVar) {
            super.mo26303m(cVar);
            C9805b.this.f26629k.addTarget(C9805b.this.f26628j.getSurface());
            C9805b bVar = C9805b.this;
            if (bVar.f26634d.f32750g == C15754k.JPEG) {
                bVar.f26629k.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(C9805b.this.f26634d.f32746c));
            }
            C9805b.this.f26629k.setTag(2);
            try {
                cVar.mo43379g(this, C9805b.this.f26629k);
            } catch (CameraAccessException e) {
                C9805b bVar2 = C9805b.this;
                bVar2.f26634d = null;
                bVar2.f26636f = e;
                bVar2.mo26296b();
                mo43702o(Integer.MAX_VALUE);
            }
        }
    }

    /* renamed from: ae.b$b */
    static /* synthetic */ class C9807b {

        /* renamed from: a */
        static final /* synthetic */ int[] f26632a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                jd.k[] r0 = p472jd.C15754k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26632a = r0
                jd.k r1 = p472jd.C15754k.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26632a     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.k r1 = p472jd.C15754k.DNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p346ae.C9805b.C9807b.<clinit>():void");
        }
    }

    public C9805b(C11278a.C11279a aVar, C16365b bVar, CaptureRequest.Builder builder, ImageReader imageReader) {
        super(aVar, bVar);
        this.f26626h = bVar;
        this.f26629k = builder;
        this.f26628j = imageReader;
        imageReader.setOnImageAvailableListener(this, C18516k.m63024c().mo46320f());
    }

    /* renamed from: h */
    private void m36077h(Image image) {
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        C11278a.C11279a aVar = this.f26634d;
        aVar.f32749f = bArr;
        aVar.f32746c = 0;
        try {
            int c = new C1415a(new ByteArrayInputStream(this.f26634d.f32749f)).mo4096c("Orientation", 1);
            this.f26634d.f32746c = C18503c.m62991b(c);
        } catch (IOException unused) {
        }
    }

    /* renamed from: i */
    private void m36078i(Image image) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        try {
            this.f26630l.writeImage(bufferedOutputStream, image);
            bufferedOutputStream.flush();
            this.f26634d.f32749f = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f26630l.close();
            try {
                bufferedOutputStream.close();
            } catch (IOException unused) {
            }
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void mo26297c() {
        this.f26627i.mo43692d(this.f26626h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r7) {
        /*
            r6 = this;
            id.b r0 = p346ae.C9808c.f26633g
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "onImageAvailable started."
            r4 = 0
            r2[r4] = r3
            r0.mo42878c(r2)
            r2 = 0
            android.media.Image r7 = r7.acquireNextImage()     // Catch:{ Exception -> 0x005e, all -> 0x005c }
            int[] r3 = p346ae.C9805b.C9807b.f26632a     // Catch:{ Exception -> 0x005a }
            com.otaliastudios.cameraview.a$a r5 = r6.f26634d     // Catch:{ Exception -> 0x005a }
            jd.k r5 = r5.f32750g     // Catch:{ Exception -> 0x005a }
            int r5 = r5.ordinal()     // Catch:{ Exception -> 0x005a }
            r3 = r3[r5]     // Catch:{ Exception -> 0x005a }
            if (r3 == r1) goto L_0x0042
            r5 = 2
            if (r3 != r5) goto L_0x0027
            r6.m36078i(r7)     // Catch:{ Exception -> 0x005a }
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r1.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "Unknown format: "
            r1.append(r3)     // Catch:{ Exception -> 0x005a }
            com.otaliastudios.cameraview.a$a r3 = r6.f26634d     // Catch:{ Exception -> 0x005a }
            jd.k r3 = r3.f32750g     // Catch:{ Exception -> 0x005a }
            r1.append(r3)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x005a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x005a }
            throw r0     // Catch:{ Exception -> 0x005a }
        L_0x0042:
            r6.m36077h(r7)     // Catch:{ Exception -> 0x005a }
        L_0x0045:
            if (r7 == 0) goto L_0x004a
            r7.close()
        L_0x004a:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r1 = "onImageAvailable ended."
            r7[r4] = r1
            r0.mo42878c(r7)
            r6.mo26296b()
            return
        L_0x0057:
            r0 = move-exception
            r2 = r7
            goto L_0x006d
        L_0x005a:
            r0 = move-exception
            goto L_0x0060
        L_0x005c:
            r0 = move-exception
            goto L_0x006d
        L_0x005e:
            r0 = move-exception
            r7 = r2
        L_0x0060:
            r6.f26634d = r2     // Catch:{ all -> 0x0057 }
            r6.f26636f = r0     // Catch:{ all -> 0x0057 }
            r6.mo26296b()     // Catch:{ all -> 0x0057 }
            if (r7 == 0) goto L_0x006c
            r7.close()
        L_0x006c:
            return
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.close()
        L_0x0072:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p346ae.C9805b.onImageAvailable(android.media.ImageReader):void");
    }
}
