package p389de;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: de.h */
class C12087h {

    /* renamed from: a */
    private final MediaCodec f35528a;

    /* renamed from: b */
    private final ByteBuffer[] f35529b = null;

    /* renamed from: c */
    private ByteBuffer[] f35530c = null;

    C12087h(MediaCodec mediaCodec) {
        this.f35528a = mediaCodec;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo32246a(int i) {
        return this.f35528a.getInputBuffer(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo32247b(int i) {
        return this.f35528a.getOutputBuffer(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32248c() {
    }
}
