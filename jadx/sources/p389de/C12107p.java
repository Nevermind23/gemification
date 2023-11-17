package p389de;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import p389de.C12093j;
import p458id.C15600b;

/* renamed from: de.p */
abstract class C12107p extends C12088i {

    /* renamed from: v */
    private static final C15600b f35603v = C15600b.m56349a(C12107p.class.getSimpleName());

    /* renamed from: r */
    protected C12106o f35604r;

    /* renamed from: s */
    protected Surface f35605s;

    /* renamed from: t */
    protected int f35606t = -1;

    /* renamed from: u */
    private boolean f35607u = false;

    C12107p(C12106o oVar) {
        super("VideoEncoder");
        this.f35604r = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo32283A(long j) {
        if (j == 0 || this.f35606t < 0 || mo32254k()) {
            return false;
        }
        this.f35606t++;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo32232h() {
        return this.f35604r.f35598c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo32233q(C12093j.C12094a aVar, long j) {
        C12106o oVar = this.f35604r;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(oVar.f35601f, oVar.f35596a, oVar.f35597b);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.f35604r.f35598c);
        createVideoFormat.setInteger("frame-rate", this.f35604r.f35599d);
        createVideoFormat.setInteger("i-frame-interval", 1);
        createVideoFormat.setInteger("rotation-degrees", this.f35604r.f35600e);
        try {
            C12106o oVar2 = this.f35604r;
            String str = oVar2.f35602g;
            if (str != null) {
                this.f35534c = MediaCodec.createByCodecName(str);
            } else {
                this.f35534c = MediaCodec.createEncoderByType(oVar2.f35601f);
            }
            this.f35534c.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f35605s = this.f35534c.createInputSurface();
            this.f35534c.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo32234r() {
        this.f35606t = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo32235s() {
        f35603v.mo42878c("onStop", "setting mFrameNumber to 1 and signaling the end of input stream.");
        this.f35606t = -1;
        this.f35534c.signalEndOfInputStream();
        mo32250f(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo32259u(C12100l lVar, C12099k kVar) {
        boolean z;
        if (!this.f35607u) {
            C15600b bVar = f35603v;
            bVar.mo42880h("onWriteOutput:", "sync frame not found yet. Checking.");
            if ((kVar.f35574a.flags & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar.mo42880h("onWriteOutput:", "SYNC FRAME FOUND!");
                this.f35607u = true;
                super.mo32259u(lVar, kVar);
                return;
            }
            bVar.mo42880h("onWriteOutput:", "DROPPING FRAME and requesting a sync frame soon.");
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f35534c.setParameters(bundle);
            lVar.mo46315f(kVar);
            return;
        }
        super.mo32259u(lVar, kVar);
    }
}
