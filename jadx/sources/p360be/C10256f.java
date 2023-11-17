package p360be;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import p458id.C15600b;
import p458id.C15605e;
import p458id.C15606f;

/* renamed from: be.f */
public class C10256f extends C10241a {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C15600b f28490l = C15600b.m56349a(C10256f.class.getSimpleName());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f28491j;

    /* renamed from: k */
    private View f28492k;

    /* renamed from: be.f$a */
    class C10257a implements SurfaceHolder.Callback {
        C10257a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C10256f.f28490l.mo42878c("callback:", "surfaceChanged", "w:", Integer.valueOf(i2), "h:", Integer.valueOf(i3), "dispatched:", Boolean.valueOf(C10256f.this.f28491j));
            if (!C10256f.this.f28491j) {
                C10256f.this.mo26803f(i2, i3);
                boolean unused = C10256f.this.f28491j = true;
                return;
            }
            C10256f.this.mo26805h(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C10256f.f28490l.mo42878c("callback: surfaceCreated.");
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C10256f.f28490l.mo42878c("callback: surfaceDestroyed");
            C10256f.this.mo26804g();
            boolean unused = C10256f.this.f28491j = false;
        }
    }

    public C10256f(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* renamed from: B */
    public SurfaceHolder mo26806i() {
        return ((SurfaceView) mo26810m()).getHolder();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public SurfaceView mo26813p(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C15606f.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        SurfaceView surfaceView = (SurfaceView) inflate.findViewById(C15605e.surface_view);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new C10257a());
        this.f28492k = inflate;
        return surfaceView;
    }

    /* renamed from: j */
    public Class mo26807j() {
        return SurfaceHolder.class;
    }

    /* renamed from: k */
    public View mo26808k() {
        return this.f28492k;
    }
}
