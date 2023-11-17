package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import com.salesforce.marketingcloud.media.C11591u;
import java.lang.ref.WeakReference;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.p */
public class C11584p extends C11553a<ImageView> {

    /* renamed from: f */
    C11562f f33620f;

    public C11584p(C11580o oVar, C11594v<ImageView> vVar, C11587s sVar, C11562f fVar) {
        super(oVar, vVar, sVar);
        this.f33620f = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30161a() {
        super.mo30161a();
        this.f33620f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30162a(C11591u.C11593b bVar) {
        WeakReference<T> weakReference = this.f33533b;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView != null) {
            C11570l.m42242a(imageView, mo30164b().f33604a, bVar);
            C11562f fVar = this.f33620f;
            if (fVar != null) {
                fVar.mo30170a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30163a(Exception exc) {
        C11562f fVar = this.f33620f;
        if (fVar != null) {
            fVar.mo30172a(exc);
        }
    }
}
