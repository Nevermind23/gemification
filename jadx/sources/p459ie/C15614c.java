package p459ie;

import android.opengl.GLES20;
import he1.C41234t;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;
import p445he.C15491f;

/* renamed from: ie.c */
public final class C15614c {

    /* renamed from: c */
    private static final C15615a f44409c = new C15615a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f44410a;

    /* renamed from: b */
    private final int f44411b;

    /* renamed from: ie.c$a */
    private static final class C15615a {
        private C15615a() {
        }

        public /* synthetic */ C15615a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m56395b(int i, String str) {
            int a = C41234t.m119493a(GLES20.glCreateShader(C41234t.m119493a(i)));
            C12433d.m47459b(C41536l.m120497q("glCreateShader type=", Integer.valueOf(i)));
            GLES20.glShaderSource(a, str);
            GLES20.glCompileShader(a);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(a, C15491f.m56027b(), iArr, 0);
            if (iArr[0] != 0) {
                return a;
            }
            String str2 = "Could not compile shader " + i + ": '" + GLES20.glGetShaderInfoLog(a) + "' source: " + str;
            GLES20.glDeleteShader(a);
            throw new RuntimeException(str2);
        }
    }

    public C15614c(int i, int i2) {
        this.f44410a = i;
        this.f44411b = i2;
    }

    /* renamed from: a */
    public final int mo42910a() {
        return this.f44411b;
    }

    /* renamed from: b */
    public final void mo42911b() {
        GLES20.glDeleteShader(C41234t.m119493a(this.f44411b));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15614c(int i, String str) {
        this(i, f44409c.m56395b(i, str));
        C41536l.m120489i(str, "source");
    }
}
