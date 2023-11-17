package p257t3;

import java.io.InputStream;
import java.net.URL;
import p166m3.C7088h;
import p244s3.C8175h;
import p244s3.C8188n;
import p244s3.C8190o;
import p244s3.C8196r;

/* renamed from: t3.g */
public class C8362g implements C8188n {

    /* renamed from: a */
    private final C8188n f23775a;

    /* renamed from: t3.g$a */
    public static class C8363a implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8362g(rVar.mo23396d(C8175h.class, InputStream.class));
        }
    }

    public C8362g(C8188n nVar) {
        this.f23775a = nVar;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(URL url, int i, int i2, C7088h hVar) {
        return this.f23775a.mo23326a(new C8175h(url), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo23327b(URL url) {
        return true;
    }
}
