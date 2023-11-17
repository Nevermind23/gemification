package p270u3;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.C2489a0;
import com.bumptech.glide.load.resource.bitmap.C2535o;
import com.bumptech.glide.load.resource.bitmap.C2548u;
import p166m3.C7080b;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7089i;

/* renamed from: u3.l */
public final class C8563l implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    private final C2489a0 f24293a = C2489a0.m9633b();

    /* renamed from: b */
    private final int f24294b;

    /* renamed from: c */
    private final int f24295c;

    /* renamed from: d */
    private final C7080b f24296d;

    /* renamed from: e */
    private final C2535o f24297e;

    /* renamed from: f */
    private final boolean f24298f;

    /* renamed from: g */
    private final C7089i f24299g;

    /* renamed from: u3.l$a */
    class C8564a implements ImageDecoder.OnPartialImageListener {
        C8564a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C8563l(int i, int i2, C7088h hVar) {
        boolean z;
        this.f24294b = i;
        this.f24295c = i2;
        this.f24296d = (C7080b) hVar.mo21312c(C2548u.f7991f);
        this.f24297e = (C2535o) hVar.mo21312c(C2535o.f7986h);
        C7085g gVar = C2548u.f7995j;
        if (hVar.mo21312c(gVar) == null || !((Boolean) hVar.mo21312c(gVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f24298f = z;
        this.f24299g = (C7089i) hVar.mo21312c(C2548u.f7992g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z = false;
        if (this.f24293a.mo7973e(this.f24294b, this.f24295c, this.f24298f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f24296d == C7080b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C8564a());
        Size a = imageInfo.getSize();
        int i = this.f24294b;
        if (i == Integer.MIN_VALUE) {
            i = a.getWidth();
        }
        int i2 = this.f24295c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = a.getHeight();
        }
        float b = this.f24297e.mo8040b(a.getWidth(), a.getHeight(), i, i2);
        int round = Math.round(((float) a.getWidth()) * b);
        int round2 = Math.round(((float) a.getHeight()) * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + a.getWidth() + "x" + a.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        imageDecoder.setTargetSize(round, round2);
        C7089i iVar = this.f24299g;
        if (iVar != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (iVar == C7089i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
