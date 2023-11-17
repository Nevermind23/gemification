package com.salesforce.marketingcloud.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.media.C11591u;

/* renamed from: com.salesforce.marketingcloud.media.i */
class C11567i extends C11591u {

    /* renamed from: c */
    private static final String f33575c = "drawable";

    /* renamed from: a */
    private final Context f33576a;

    /* renamed from: b */
    private int f33577b;

    C11567i(Context context) {
        this.f33576a = context;
    }

    /* renamed from: a */
    public void mo30203a(C11580o oVar, C11587s sVar, C11591u.C11592a aVar) {
        Drawable e = C0767a.m2895e(this.f33576a, this.f33577b);
        if (e == null) {
            aVar.mo30228a((Throwable) new IllegalStateException("Invalid res id for drawable"));
        } else {
            aVar.mo30227a(new C11591u.C11593b(e, C11580o.C11582b.MEMORY));
        }
    }

    /* renamed from: a */
    public boolean mo30204a(C11587s sVar) {
        if (f33575c.equalsIgnoreCase(sVar.f33628a.getScheme())) {
            this.f33577b = this.f33576a.getResources().getIdentifier(sVar.f33628a.getHost(), f33575c, this.f33576a.getPackageName());
        }
        return this.f33577b > 0;
    }
}
