package com.otaliastudios.cameraview.video;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import com.otaliastudios.cameraview.C11280b;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p374ce.C10396b;
import p486kd.C16365b;
import p500ld.C16544a;
import p500ld.C16546c;
import p500ld.C16550f;
import p500ld.C16551g;
import p651wd.C18500a;

public class Full2VideoRecorder extends C11286b {

    /* renamed from: k */
    private C16546c f32792k;

    /* renamed from: l */
    private final String f32793l;

    /* renamed from: m */
    private Surface f32794m;

    public class PrepareException extends Exception {
        /* synthetic */ PrepareException(Full2VideoRecorder full2VideoRecorder, Throwable th, C11283a aVar) {
            this(th);
        }

        private PrepareException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.otaliastudios.cameraview.video.Full2VideoRecorder$a */
    class C11283a extends C16550f {
        C11283a() {
        }

        /* renamed from: e */
        public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
            super.mo26301e(cVar, captureRequest);
            Object tag = cVar.mo43383m(this).build().getTag();
            Object tag2 = captureRequest.getTag();
            if (tag == null) {
                if (tag2 != null) {
                    return;
                }
            } else if (!tag.equals(tag2)) {
                return;
            }
            mo43702o(Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.otaliastudios.cameraview.video.Full2VideoRecorder$b */
    class C11284b extends C16551g {
        C11284b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26309b(C16544a aVar) {
            Full2VideoRecorder.super.mo29481l();
        }
    }

    public Full2VideoRecorder(C16365b bVar, String str) {
        super(bVar);
        this.f32792k = bVar;
        this.f32793l = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo29481l() {
        C11283a aVar = new C11283a();
        aVar.mo43691c(new C11284b());
        aVar.mo43692d(this.f32792k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo29482p(C11280b.C11281a aVar, MediaRecorder mediaRecorder) {
        mediaRecorder.setVideoSource(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public CamcorderProfile mo29483q(C11280b.C11281a aVar) {
        int i = aVar.f32769c % SubsamplingScaleImageView.ORIENTATION_180;
        C10396b bVar = aVar.f32770d;
        if (i != 0) {
            bVar = bVar.mo27059b();
        }
        return C18500a.m62987b(this.f32793l, bVar);
    }

    /* renamed from: u */
    public Surface mo29484u(C11280b.C11281a aVar) {
        if (mo29488r(aVar)) {
            Surface surface = this.f32802g.getSurface();
            this.f32794m = surface;
            return surface;
        }
        throw new PrepareException(this, this.f32823c, (C11283a) null);
    }

    /* renamed from: v */
    public Surface mo29485v() {
        return this.f32794m;
    }
}
