package p346ae;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import com.otaliastudios.cameraview.C11278a;
import java.io.ByteArrayOutputStream;
import p374ce.C10395a;
import p374ce.C10396b;
import p486kd.C16350a;
import p570qd.C17489c;
import p651wd.C18502b;
import p651wd.C18515j;
import p651wd.C18516k;

/* renamed from: ae.e */
public class C9811e extends C9821h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C16350a f26637h;

    /* renamed from: i */
    private Camera f26638i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10395a f26639j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f26640k;

    /* renamed from: ae.e$a */
    class C9812a implements Camera.PreviewCallback {

        /* renamed from: ae.e$a$a */
        class C9813a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ byte[] f26642d;

            /* renamed from: e */
            final /* synthetic */ C10396b f26643e;

            /* renamed from: f */
            final /* synthetic */ int f26644f;

            /* renamed from: g */
            final /* synthetic */ C10396b f26645g;

            C9813a(byte[] bArr, C10396b bVar, int i, C10396b bVar2) {
                this.f26642d = bArr;
                this.f26643e = bVar;
                this.f26644f = i;
                this.f26645g = bVar2;
            }

            public void run() {
                YuvImage yuvImage = new YuvImage(C18515j.m63022a(this.f26642d, this.f26643e, this.f26644f), C9811e.this.f26640k, this.f26645g.mo27062e(), this.f26645g.mo27060c(), (int[]) null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Rect a = C18502b.m62989a(this.f26645g, C9811e.this.f26639j);
                yuvImage.compressToJpeg(a, 90, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C11278a.C11279a aVar = C9811e.this.f26634d;
                aVar.f32749f = byteArray;
                aVar.f32747d = new C10396b(a.width(), a.height());
                C9811e eVar = C9811e.this;
                eVar.f26634d.f32746c = 0;
                eVar.mo26296b();
            }
        }

        C9812a() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C9811e.this.mo26304a(false);
            C9811e eVar = C9811e.this;
            C11278a.C11279a aVar = eVar.f26634d;
            int i = aVar.f32746c;
            C10396b bVar = aVar.f32747d;
            C10396b W = eVar.f26637h.mo43467W(C17489c.SENSOR);
            if (W != null) {
                C18516k.m63023b(new C9813a(bArr, W, i, bVar));
                camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                camera.setPreviewCallbackWithBuffer(C9811e.this.f26637h);
                C9811e.this.f26637h.mo43354p2().mo45787k(C9811e.this.f26640k, W, C9811e.this.f26637h.mo43490w());
                return;
            }
            throw new IllegalStateException("Preview stream size should never be null here.");
        }
    }

    public C9811e(C11278a.C11279a aVar, C16350a aVar2, Camera camera, C10395a aVar3) {
        super(aVar, aVar2);
        this.f26637h = aVar2;
        this.f26638i = camera;
        this.f26639j = aVar3;
        this.f26640k = camera.getParameters().getPreviewFormat();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26296b() {
        this.f26637h = null;
        this.f26638i = null;
        this.f26639j = null;
        this.f26640k = 0;
        super.mo26296b();
    }

    /* renamed from: c */
    public void mo26297c() {
        this.f26638i.setOneShotPreviewCallback(new C9812a());
    }
}
