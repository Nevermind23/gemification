package p257t3;

import com.bumptech.glide.load.data.C2425j;
import p166m3.C7085g;
import p166m3.C7088h;
import p244s3.C8175h;
import p244s3.C8185m;
import p244s3.C8188n;
import p244s3.C8190o;
import p244s3.C8196r;

/* renamed from: t3.a */
public class C8349a implements C8188n {

    /* renamed from: b */
    public static final C7085g f23751b = C7085g.m27365f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C8185m f23752a;

    /* renamed from: t3.a$a */
    public static class C8350a implements C8190o {

        /* renamed from: a */
        private final C8185m f23753a = new C8185m(500);

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8349a(this.f23753a);
        }
    }

    public C8349a(C8185m mVar) {
        this.f23752a = mVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(C8175h hVar, int i, int i2, C7088h hVar2) {
        C8185m mVar = this.f23752a;
        if (mVar != null) {
            C8175h hVar3 = (C8175h) mVar.mo23381a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f23752a.mo23382b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new C8188n.C8189a(hVar, new C2425j(hVar, ((Integer) hVar2.mo21312c(f23751b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo23327b(C8175h hVar) {
        return true;
    }
}
