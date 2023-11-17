package com.facetec.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.util.Size;

@TargetApi(21)
/* renamed from: com.facetec.sdk.dp */
final class C2959dp {

    /* renamed from: h */
    private static RenderScript f10034h;

    /* renamed from: a */
    final Allocation f10035a;

    /* renamed from: b */
    private final ScriptIntrinsicYuvToRGB f10036b;

    /* renamed from: c */
    private final Size f10037c;

    /* renamed from: d */
    C2960a f10038d;

    /* renamed from: e */
    private final Allocation f10039e;

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.dp$a */
    interface C2960a {
        void onImageAvailable(byte[] bArr, Size size);
    }

    C2959dp(Context context, Size size) {
        m12507c(context);
        RenderScript renderScript = f10034h;
        Type.Builder builder = new Type.Builder(renderScript, Element.YUV(renderScript));
        builder.setX(size.getWidth());
        builder.setY(size.getHeight());
        builder.setYuvFormat(35);
        Allocation createTyped = Allocation.createTyped(f10034h, builder.create(), 33);
        this.f10035a = createTyped;
        createTyped.setOnBufferAvailableListener(new C3469nj(this));
        this.f10037c = size;
        ScriptIntrinsicYuvToRGB create = ScriptIntrinsicYuvToRGB.create(f10034h, Element.createPixel(f10034h, Element.DataType.UNSIGNED_8, Element.DataKind.PIXEL_YUV));
        this.f10036b = create;
        create.setInput(createTyped);
        RenderScript renderScript2 = f10034h;
        this.f10039e = Allocation.createTyped(f10034h, new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(size.getWidth()).setY(size.getHeight()).create(), 1);
    }

    @TargetApi(21)
    /* renamed from: c */
    static void m12507c(Context context) {
        if (f10034h == null) {
            f10034h = RenderScript.create(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9126e(C2960a aVar) {
        this.f10038d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12508c(Allocation allocation) {
        this.f10035a.ioReceive();
        C2960a aVar = this.f10038d;
        if (aVar != null) {
            this.f10036b.forEach(this.f10039e);
            byte[] bArr = new byte[this.f10039e.getBytesSize()];
            this.f10039e.copyTo(bArr);
            aVar.onImageAvailable(bArr, this.f10037c);
        }
    }
}
