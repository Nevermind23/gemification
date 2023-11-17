package p417fe;

import android.opengl.GLES20;
import he1.C41238w;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;
import p445he.C15491f;
import p501le.C16558a;

/* renamed from: fe.c */
public class C12866c extends C12864a {

    /* renamed from: h */
    private static final C12867a f38013h = new C12867a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private static final float[] f38014i = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: g */
    private FloatBuffer f38015g;

    /* renamed from: fe.c$a */
    private static final class C12867a {
        private C12867a() {
        }

        public /* synthetic */ C12867a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12866c() {
        float[] fArr = f38014i;
        FloatBuffer b = C16558a.m58817b(fArr.length);
        b.put(fArr);
        b.clear();
        C41238w wVar = C41238w.f97225a;
        this.f38015g = b;
    }

    /* renamed from: a */
    public void mo33545a() {
        C12433d.m47459b("glDrawArrays start");
        GLES20.glDrawArrays(C15491f.m56040o(), 0, mo33549f());
        C12433d.m47459b("glDrawArrays end");
    }

    /* renamed from: d */
    public FloatBuffer mo33547d() {
        return this.f38015g;
    }
}
