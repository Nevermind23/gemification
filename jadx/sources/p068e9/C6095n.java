package p068e9;

import java.io.File;
import java.io.IOException;
import p027b9.C2184f;
import p133j9.C6762f;

/* renamed from: e9.n */
class C6095n {

    /* renamed from: a */
    private final String f18952a;

    /* renamed from: b */
    private final C6762f f18953b;

    public C6095n(String str, C6762f fVar) {
        this.f18952a = str;
        this.f18953b = fVar;
    }

    /* renamed from: b */
    private File m24365b() {
        return this.f18953b.mo20793e(this.f18952a);
    }

    /* renamed from: a */
    public boolean mo19627a() {
        try {
            return m24365b().createNewFile();
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7092e("Error creating marker: " + this.f18952a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo19628c() {
        return m24365b().exists();
    }

    /* renamed from: d */
    public boolean mo19629d() {
        return m24365b().delete();
    }
}
