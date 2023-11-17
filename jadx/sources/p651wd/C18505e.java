package p651wd;

import android.opengl.GLES20;
import p403ee.C12433d;
import p458id.C15600b;
import p459ie.C15608a;
import p487ke.C16416a;
import p612td.C17928b;
import p612td.C17930d;

/* renamed from: wd.e */
public class C18505e {

    /* renamed from: f */
    private static final C15600b f51980f = C15600b.m56349a(C18505e.class.getSimpleName());

    /* renamed from: a */
    private final C16416a f51981a;

    /* renamed from: b */
    private float[] f51982b;

    /* renamed from: c */
    private C17928b f51983c;

    /* renamed from: d */
    private C17928b f51984d;

    /* renamed from: e */
    private int f51985e;

    public C18505e() {
        this(new C16416a(33984, 36197));
    }

    /* renamed from: a */
    public void mo46289a(long j) {
        if (this.f51984d != null) {
            mo46292d();
            this.f51983c = this.f51984d;
            this.f51984d = null;
        }
        if (this.f51985e == -1) {
            int c = C15608a.m56376c(this.f51983c.mo45591b(), this.f51983c.mo45603c());
            this.f51985e = c;
            this.f51983c.mo45592d(c);
            C12433d.m47459b("program creation");
        }
        GLES20.glUseProgram(this.f51985e);
        C12433d.m47459b("glUseProgram(handle)");
        this.f51981a.mo33048b();
        this.f51983c.mo45594f(j, this.f51982b);
        this.f51981a.mo33047a();
        GLES20.glUseProgram(0);
        C12433d.m47459b("glUseProgram(0)");
    }

    /* renamed from: b */
    public C16416a mo46290b() {
        return this.f51981a;
    }

    /* renamed from: c */
    public float[] mo46291c() {
        return this.f51982b;
    }

    /* renamed from: d */
    public void mo46292d() {
        if (this.f51985e != -1) {
            this.f51983c.onDestroy();
            GLES20.glDeleteProgram(this.f51985e);
            this.f51985e = -1;
        }
    }

    /* renamed from: e */
    public void mo46293e(C17928b bVar) {
        this.f51984d = bVar;
    }

    /* renamed from: f */
    public void mo46294f(float[] fArr) {
        this.f51982b = fArr;
    }

    public C18505e(int i) {
        this(new C16416a(33984, 36197, Integer.valueOf(i)));
    }

    public C18505e(C16416a aVar) {
        this.f51982b = (float[]) C12433d.f37102b.clone();
        this.f51983c = new C17930d();
        this.f51984d = null;
        this.f51985e = -1;
        this.f51981a = aVar;
    }
}
