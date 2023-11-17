package p651wd;

import android.opengl.GLES20;

/* renamed from: wd.g */
public class C18508g {

    /* renamed from: a */
    private final int f51993a;

    public C18508g(int i) {
        this.f51993a = i;
    }

    /* renamed from: b */
    private void m63000b(int i) {
        GLES20.glBindTexture(36197, i);
    }

    /* renamed from: a */
    public void mo46301a() {
        m63000b(this.f51993a);
    }

    /* renamed from: c */
    public void mo46302c() {
        m63000b(0);
    }
}
