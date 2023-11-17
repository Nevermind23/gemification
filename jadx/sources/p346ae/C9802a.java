package p346ae;

import android.hardware.Camera;
import androidx.exifinterface.media.C1415a;
import com.otaliastudios.cameraview.C11278a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import p374ce.C10396b;
import p458id.C15600b;
import p486kd.C16350a;
import p570qd.C17489c;
import p598sd.C17757b;
import p651wd.C18503c;

/* renamed from: ae.a */
public class C9802a extends C9808c {

    /* renamed from: h */
    private final Camera f26622h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C16350a f26623i;

    /* renamed from: ae.a$a */
    class C9803a implements Camera.ShutterCallback {
        C9803a() {
        }

        public void onShutter() {
            C9808c.f26633g.mo42878c("take(): got onShutter callback.");
            C9802a.this.mo26304a(true);
        }
    }

    /* renamed from: ae.a$b */
    class C9804b implements Camera.PictureCallback {
        C9804b() {
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            int i;
            C9808c.f26633g.mo42878c("take(): got picture callback.");
            try {
                i = C18503c.m62991b(new C1415a(new ByteArrayInputStream(bArr)).mo4096c("Orientation", 1));
            } catch (IOException unused) {
                i = 0;
            }
            C11278a.C11279a aVar = C9802a.this.f26634d;
            aVar.f32749f = bArr;
            aVar.f32746c = i;
            C9808c.f26633g.mo42878c("take(): starting preview again. ", Thread.currentThread());
            if (C9802a.this.f26623i.mo43508Z().mo45341a(C17757b.PREVIEW)) {
                camera.setPreviewCallbackWithBuffer(C9802a.this.f26623i);
                C10396b W = C9802a.this.f26623i.mo43467W(C17489c.SENSOR);
                if (W != null) {
                    C9802a.this.f26623i.mo43354p2().mo45787k(C9802a.this.f26623i.mo43436G(), W, C9802a.this.f26623i.mo43490w());
                    camera.startPreview();
                } else {
                    throw new IllegalStateException("Preview stream size should never be null here.");
                }
            }
            C9802a.this.mo26296b();
        }
    }

    public C9802a(C11278a.C11279a aVar, C16350a aVar2, Camera camera) {
        super(aVar, aVar2);
        this.f26623i = aVar2;
        this.f26622h = camera;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(this.f26634d.f32746c);
        camera.setParameters(parameters);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26296b() {
        C9808c.f26633g.mo42878c("dispatching result. Thread:", Thread.currentThread());
        super.mo26296b();
    }

    /* renamed from: c */
    public void mo26297c() {
        C15600b bVar = C9808c.f26633g;
        bVar.mo42878c("take() called.");
        this.f26622h.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        this.f26623i.mo43354p2().mo45786j();
        try {
            this.f26622h.takePicture(new C9803a(), (Camera.PictureCallback) null, (Camera.PictureCallback) null, new C9804b());
            bVar.mo42878c("take() returned.");
        } catch (Exception e) {
            this.f26636f = e;
            mo26296b();
        }
    }
}
