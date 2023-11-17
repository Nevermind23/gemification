package p417fe;

import java.nio.FloatBuffer;
import p403ee.C12433d;
import p403ee.C12436g;
import p445he.C15492g;

/* renamed from: fe.b */
public abstract class C12865b extends C12436g {

    /* renamed from: d */
    private final float[] f38011d = C15492g.m56045c(C12433d.f37102b);

    /* renamed from: e */
    private int f38012e;

    /* renamed from: a */
    public abstract void mo33545a();

    /* renamed from: b */
    public abstract int mo33543b();

    /* renamed from: c */
    public final float[] mo33546c() {
        return this.f38011d;
    }

    /* renamed from: d */
    public abstract FloatBuffer mo33547d();

    /* renamed from: e */
    public final int mo33548e() {
        return this.f38012e;
    }

    /* renamed from: f */
    public int mo33549f() {
        return mo33547d().limit() / mo33543b();
    }

    /* renamed from: g */
    public int mo33550g() {
        return mo33543b() * 4;
    }
}
