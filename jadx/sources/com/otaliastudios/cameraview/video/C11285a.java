package com.otaliastudios.cameraview.video;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import com.otaliastudios.cameraview.C11280b;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p374ce.C10396b;
import p486kd.C16350a;
import p651wd.C18500a;

/* renamed from: com.otaliastudios.cameraview.video.a */
public class C11285a extends C11286b {

    /* renamed from: k */
    private final C16350a f32798k;

    /* renamed from: l */
    private final Camera f32799l;

    /* renamed from: m */
    private final int f32800m;

    public C11285a(C16350a aVar, Camera camera, int i) {
        super(aVar);
        this.f32799l = camera;
        this.f32798k = aVar;
        this.f32800m = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo29486k() {
        this.f32799l.setPreviewCallbackWithBuffer(this.f32798k);
        super.mo29486k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo29482p(C11280b.C11281a aVar, MediaRecorder mediaRecorder) {
        mediaRecorder.setCamera(this.f32799l);
        mediaRecorder.setVideoSource(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public CamcorderProfile mo29483q(C11280b.C11281a aVar) {
        int i = aVar.f32769c % SubsamplingScaleImageView.ORIENTATION_180;
        C10396b bVar = aVar.f32770d;
        if (i != 0) {
            bVar = bVar.mo27059b();
        }
        return C18500a.m62986a(this.f32800m, bVar);
    }
}
