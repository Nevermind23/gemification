package p612td;

import p374ce.C10396b;
import p417fe.C12865b;
import p417fe.C12866c;
import p458id.C15600b;
import p459ie.C15616d;

/* renamed from: td.a */
public abstract class C17927a implements C17928b {

    /* renamed from: i */
    private static final C15600b f51016i = C15600b.m56349a(C17927a.class.getSimpleName());

    /* renamed from: a */
    C15616d f51017a = null;

    /* renamed from: b */
    private C12865b f51018b = null;

    /* renamed from: c */
    C10396b f51019c;

    /* renamed from: d */
    protected String f51020d = "aPosition";

    /* renamed from: e */
    protected String f51021e = "aTextureCoord";

    /* renamed from: f */
    protected String f51022f = "uMVPMatrix";

    /* renamed from: g */
    protected String f51023g = "uTexMatrix";

    /* renamed from: h */
    protected String f51024h = "vTextureCoord";

    /* renamed from: i */
    private static String m61744i(String str) {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 " + str + ";\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, " + str + ");\n}\n";
    }

    /* renamed from: k */
    private static String m61745k(String str, String str2, String str3, String str4, String str5) {
        return "uniform mat4 " + str3 + ";\nuniform mat4 " + str4 + ";\nattribute vec4 " + str + ";\nattribute vec4 " + str2 + ";\nvarying vec2 " + str5 + ";\nvoid main() {\n    gl_Position = " + str3 + " * " + str + ";\n    " + str5 + " = (" + str4 + " * " + str2 + ").xy;\n}\n";
    }

    /* renamed from: b */
    public String mo45591b() {
        return mo45597j();
    }

    /* renamed from: d */
    public void mo45592d(int i) {
        this.f51017a = new C15616d(i, this.f51020d, this.f51022f, this.f51021e, this.f51023g);
        this.f51018b = new C12866c();
    }

    /* renamed from: e */
    public void mo45593e(int i, int i2) {
        this.f51019c = new C10396b(i, i2);
    }

    /* renamed from: f */
    public void mo45594f(long j, float[] fArr) {
        if (this.f51017a == null) {
            f51016i.mo42880h("Filter.draw() called after destroying the filter. This can happen rarely because of threading.");
            return;
        }
        mo45601o(j, fArr);
        mo45599m(j);
        mo45600n(j);
    }

    /* renamed from: g */
    public final C17927a mo45590a() {
        C17927a l = mo45598l();
        C10396b bVar = this.f51019c;
        if (bVar != null) {
            l.mo45593e(bVar.mo27062e(), this.f51019c.mo27060c());
        }
        return l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo45596h() {
        return m61744i(this.f51024h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo45597j() {
        return m61745k(this.f51020d, this.f51021e, this.f51022f, this.f51023g, this.f51024h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C17927a mo45598l() {
        try {
            return (C17927a) getClass().newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo45599m(long j) {
        this.f51017a.mo42900f(this.f51018b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo45600n(long j) {
        this.f51017a.mo42901g(this.f51018b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo45601o(long j, float[] fArr) {
        this.f51017a.mo42914l(fArr);
        C15616d dVar = this.f51017a;
        C12865b bVar = this.f51018b;
        dVar.mo42902h(bVar, bVar.mo33546c());
    }

    public void onDestroy() {
        this.f51017a.mo42903i();
        this.f51017a = null;
        this.f51018b = null;
    }
}
