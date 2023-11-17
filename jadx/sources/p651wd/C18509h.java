package p651wd;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: wd.h */
public class C18509h {

    /* renamed from: a */
    private final Handler f51994a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f51995b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C18512c f51996c;

    /* renamed from: d */
    final OrientationEventListener f51997d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f51998e = -1;

    /* renamed from: f */
    final DisplayManager.DisplayListener f51999f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f52000g = -1;

    /* renamed from: h */
    private boolean f52001h;

    /* renamed from: wd.h$a */
    class C18510a extends OrientationEventListener {
        C18510a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int i2 = 0;
            if (i == -1) {
                if (C18509h.this.f51998e != -1) {
                    i2 = C18509h.this.f51998e;
                }
            } else if (i < 315 && i >= 45) {
                if (i >= 45 && i < 135) {
                    i2 = 90;
                } else if (i >= 135 && i < 225) {
                    i2 = SubsamplingScaleImageView.ORIENTATION_180;
                } else if (i >= 225 && i < 315) {
                    i2 = SubsamplingScaleImageView.ORIENTATION_270;
                }
            }
            if (i2 != C18509h.this.f51998e) {
                int unused = C18509h.this.f51998e = i2;
                C18509h.this.f51996c.mo29449n(C18509h.this.f51998e);
            }
        }
    }

    /* renamed from: wd.h$b */
    class C18511b implements DisplayManager.DisplayListener {
        C18511b() {
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            int d = C18509h.this.f52000g;
            int f = C18509h.this.m63009i();
            if (f != d) {
                int unused = C18509h.this.f52000g = f;
                C18509h.this.f51996c.mo29451p();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: wd.h$c */
    public interface C18512c {
        /* renamed from: n */
        void mo29449n(int i);

        /* renamed from: p */
        void mo29451p();
    }

    public C18509h(Context context, C18512c cVar) {
        this.f51995b = context;
        this.f51996c = cVar;
        this.f51997d = new C18510a(context.getApplicationContext(), 3);
        this.f51999f = new C18511b();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m63009i() {
        int rotation = ((WindowManager) this.f51995b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (rotation != 3) {
            return 0;
        }
        return SubsamplingScaleImageView.ORIENTATION_270;
    }

    /* renamed from: g */
    public void mo46303g() {
        if (this.f52001h) {
            this.f52001h = false;
            this.f51997d.disable();
            ((DisplayManager) this.f51995b.getSystemService("display")).unregisterDisplayListener(this.f51999f);
            this.f52000g = -1;
            this.f51998e = -1;
        }
    }

    /* renamed from: h */
    public void mo46304h() {
        if (!this.f52001h) {
            this.f52001h = true;
            this.f52000g = m63009i();
            ((DisplayManager) this.f51995b.getSystemService("display")).registerDisplayListener(this.f51999f, this.f51994a);
            this.f51997d.enable();
        }
    }

    /* renamed from: j */
    public int mo46305j() {
        return this.f52000g;
    }
}
