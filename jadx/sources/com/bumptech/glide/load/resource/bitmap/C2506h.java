package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C2379b;
import p089g4.C6224l;
import p166m3.C7092l;
import p192o3.C7430c;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public abstract class C2506h implements C7092l {
    /* renamed from: a */
    public final C7430c mo8004a(Context context, C7430c cVar, int i, int i2) {
        if (C6224l.m24752u(i, i2)) {
            C7676d f = C2379b.m9204c(context).mo7685f();
            Bitmap bitmap = (Bitmap) cVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo8005c(f, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return cVar;
            }
            return C2504g.m9689e(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2);
}
