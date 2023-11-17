package p321y3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.load.resource.bitmap.C2504g;
import java.security.MessageDigest;
import p089g4.C6223k;
import p166m3.C7092l;
import p192o3.C7430c;

/* renamed from: y3.f */
public class C9050f implements C7092l {

    /* renamed from: b */
    private final C7092l f25210b;

    public C9050f(C7092l lVar) {
        this.f25210b = (C7092l) C6223k.m24730d(lVar);
    }

    /* renamed from: a */
    public C7430c mo8004a(Context context, C7430c cVar, int i, int i2) {
        C9046c cVar2 = (C9046c) cVar.get();
        C2504g gVar = new C2504g(cVar2.mo24537e(), C2379b.m9204c(context).mo7685f());
        C7430c a = this.f25210b.mo8004a(context, gVar, i, i2);
        if (!gVar.equals(a)) {
            gVar.recycle();
        }
        cVar2.mo24547m(this.f25210b, (Bitmap) a.get());
        return cVar;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        this.f25210b.mo7845b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9050f) {
            return this.f25210b.equals(((C9050f) obj).f25210b);
        }
        return false;
    }

    public int hashCode() {
        return this.f25210b.hashCode();
    }
}
