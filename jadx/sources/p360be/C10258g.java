package p360be;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutionException;
import p337z7.C9227g;
import p337z7.C9231i;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p360be.C10241a;
import p374ce.C10395a;
import p458id.C15600b;
import p458id.C15605e;
import p458id.C15606f;

/* renamed from: be.g */
public class C10258g extends C10241a {

    /* renamed from: j */
    private View f28494j;

    /* renamed from: be.g$a */
    class C10259a implements TextureView.SurfaceTextureListener {
        C10259a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C10258g.this.mo26803f(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C10258g.this.mo26804g();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C10258g.this.mo26805h(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: be.g$b */
    class C10260b implements Runnable {
        C10260b(C10241a.C10243b bVar) {
        }

        public void run() {
            int i;
            int i2;
            float f;
            boolean z;
            C10258g gVar = C10258g.this;
            if (gVar.f28466g != 0 && gVar.f28465f != 0 && (i = gVar.f28464e) != 0 && (i2 = gVar.f28463d) != 0) {
                C10395a f2 = C10395a.m37800f(i2, i);
                C10258g gVar2 = C10258g.this;
                C10395a f3 = C10395a.m37800f(gVar2.f28465f, gVar2.f28466g);
                float f4 = 1.0f;
                if (f2.mo27056j() >= f3.mo27056j()) {
                    f = f2.mo27056j() / f3.mo27056j();
                } else {
                    float j = f3.mo27056j() / f2.mo27056j();
                    f = 1.0f;
                    f4 = j;
                }
                ((TextureView) C10258g.this.mo26810m()).setScaleX(f4);
                ((TextureView) C10258g.this.mo26810m()).setScaleY(f);
                C10258g gVar3 = C10258g.this;
                if (f4 > 1.02f || f > 1.02f) {
                    z = true;
                } else {
                    z = false;
                }
                gVar3.f28462c = z;
                C15600b bVar = C10241a.f28459i;
                bVar.mo42878c("crop:", "applied scaleX=", Float.valueOf(f4));
                bVar.mo42878c("crop:", "applied scaleY=", Float.valueOf(f));
            }
        }
    }

    /* renamed from: be.g$c */
    class C10261c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f28497d;

        /* renamed from: e */
        final /* synthetic */ C9227g f28498e;

        C10261c(int i, C9227g gVar) {
            this.f28497d = i;
            this.f28498e = gVar;
        }

        public void run() {
            boolean z;
            Matrix matrix = new Matrix();
            C10258g gVar = C10258g.this;
            int i = gVar.f28463d;
            float f = ((float) i) / 2.0f;
            int i2 = gVar.f28464e;
            float f2 = ((float) i2) / 2.0f;
            if (this.f28497d % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float f3 = ((float) i2) / ((float) i);
                matrix.postScale(f3, 1.0f / f3, f, f2);
            }
            matrix.postRotate((float) this.f28497d, f, f2);
            ((TextureView) C10258g.this.mo26810m()).setTransform(matrix);
            this.f28498e.mo24885c((Object) null);
        }
    }

    public C10258g(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26802e(C10241a.C10243b bVar) {
        ((TextureView) mo26810m()).post(new C10260b(bVar));
    }

    /* renamed from: j */
    public Class mo26807j() {
        return SurfaceTexture.class;
    }

    /* renamed from: k */
    public View mo26808k() {
        return this.f28494j;
    }

    /* renamed from: u */
    public void mo26818u(int i) {
        super.mo26818u(i);
        C9227g gVar = new C9227g();
        ((TextureView) mo26810m()).post(new C10261c(i, gVar));
        try {
            C9231i.m34107a(gVar.mo24883a());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* renamed from: x */
    public boolean mo26821x() {
        return true;
    }

    /* renamed from: y */
    public SurfaceTexture mo26806i() {
        return ((TextureView) mo26810m()).getSurfaceTexture();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public TextureView mo26813p(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C15606f.cameraview_texture_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        TextureView textureView = (TextureView) inflate.findViewById(C15605e.texture_view);
        textureView.setSurfaceTextureListener(new C10259a());
        this.f28494j = inflate;
        return textureView;
    }
}
