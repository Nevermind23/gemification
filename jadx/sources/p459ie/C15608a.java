package p459ie;

import android.opengl.GLES20;
import he1.C41234t;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;
import p403ee.C12434e;
import p417fe.C12865b;
import p445he.C15491f;

/* renamed from: ie.a */
public abstract class C15608a implements C12434e {

    /* renamed from: e */
    public static final C15609a f44396e = new C15609a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f44397a;

    /* renamed from: b */
    private final boolean f44398b;

    /* renamed from: c */
    private final C15614c[] f44399c;

    /* renamed from: d */
    private boolean f44400d;

    /* renamed from: ie.a$a */
    public static final class C15609a {
        private C15609a() {
        }

        public /* synthetic */ C15609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42904a(String str, String str2) {
            C41536l.m120489i(str, "vertexShaderSource");
            C41536l.m120489i(str2, "fragmentShaderSource");
            return mo42905b(new C15614c(C15491f.m56042q(), str), new C15614c(C15491f.m56029d(), str2));
        }

        /* renamed from: b */
        public final int mo42905b(C15614c... cVarArr) {
            C41536l.m120489i(cVarArr, "shaders");
            int a = C41234t.m119493a(GLES20.glCreateProgram());
            C12433d.m47459b("glCreateProgram");
            if (a != 0) {
                for (C15614c a2 : cVarArr) {
                    GLES20.glAttachShader(a, C41234t.m119493a(a2.mo42910a()));
                    C12433d.m47459b("glAttachShader");
                }
                GLES20.glLinkProgram(a);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(a, C15491f.m56031f(), iArr, 0);
                if (iArr[0] == C15491f.m56041p()) {
                    return a;
                }
                String q = C41536l.m120497q("Could not link program: ", GLES20.glGetProgramInfoLog(a));
                GLES20.glDeleteProgram(a);
                throw new RuntimeException(q);
            }
            throw new RuntimeException("Could not create program");
        }
    }

    protected C15608a(int i, boolean z, C15614c... cVarArr) {
        C41536l.m120489i(cVarArr, "shaders");
        this.f44397a = i;
        this.f44398b = z;
        this.f44399c = cVarArr;
    }

    /* renamed from: c */
    public static final int m56376c(String str, String str2) {
        return f44396e.mo42904a(str, str2);
    }

    /* renamed from: a */
    public void mo33047a() {
        GLES20.glUseProgram(0);
    }

    /* renamed from: b */
    public void mo33048b() {
        GLES20.glUseProgram(C41234t.m119493a(this.f44397a));
        C12433d.m47459b("glUseProgram");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C15610b mo42898d(String str) {
        C41536l.m120489i(str, "name");
        return C15610b.f44401d.mo42908a(this.f44397a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C15610b mo42899e(String str) {
        C41536l.m120489i(str, "name");
        return C15610b.f44401d.mo42909b(this.f44397a, str);
    }

    /* renamed from: f */
    public void mo42900f(C12865b bVar) {
        C41536l.m120489i(bVar, "drawable");
        bVar.mo33545a();
    }

    /* renamed from: g */
    public void mo42901g(C12865b bVar) {
        C41536l.m120489i(bVar, "drawable");
    }

    /* renamed from: h */
    public void mo42902h(C12865b bVar, float[] fArr) {
        C41536l.m120489i(bVar, "drawable");
        C41536l.m120489i(fArr, "modelViewProjectionMatrix");
    }

    /* renamed from: i */
    public void mo42903i() {
        if (!this.f44400d) {
            if (this.f44398b) {
                GLES20.glDeleteProgram(C41234t.m119493a(this.f44397a));
            }
            for (C15614c b : this.f44399c) {
                b.mo42911b();
            }
            this.f44400d = true;
        }
    }
}
