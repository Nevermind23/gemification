package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.salesforce.marketingcloud.media.C11591u;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.l */
public final class C11570l extends BitmapDrawable {
    public C11570l(Context context, Bitmap bitmap) {
        super(context.getResources(), bitmap);
    }

    /* renamed from: a */
    static void m42242a(ImageView imageView, Context context, C11591u.C11593b bVar) {
        if (bVar.mo30272d()) {
            imageView.setImageDrawable(new C11570l(context, bVar.mo30269a()));
        } else if (bVar.mo30273e()) {
            imageView.setImageDrawable(bVar.mo30270b());
        }
    }
}
