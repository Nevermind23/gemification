package p459ie;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.github.mikephil.charting.utils.Utils;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;
import p417fe.C12864a;
import p417fe.C12865b;
import p445he.C15491f;
import p445he.C15492g;
import p487ke.C16416a;
import p501le.C16558a;
import p501le.C16559b;

/* renamed from: ie.d */
public class C15616d extends C15608a {

    /* renamed from: p */
    public static final C15617a f44412p = new C15617a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private float[] f44413f;

    /* renamed from: g */
    private final C15610b f44414g;

    /* renamed from: h */
    private FloatBuffer f44415h;

    /* renamed from: i */
    private final C15610b f44416i;

    /* renamed from: j */
    private final C15610b f44417j;

    /* renamed from: k */
    private final C15610b f44418k;

    /* renamed from: l */
    private final RectF f44419l;

    /* renamed from: m */
    private int f44420m;

    /* renamed from: n */
    private C12864a f44421n;

    /* renamed from: o */
    private C16416a f44422o;

    /* renamed from: ie.d$a */
    public static final class C15617a {
        private C15617a() {
        }

        public /* synthetic */ C15617a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15616d(int i, boolean z, String str, String str2, String str3, String str4) {
        super(i, z, new C15614c[0]);
        C15610b bVar;
        C41536l.m120489i(str, "vertexPositionName");
        C41536l.m120489i(str2, "vertexMvpMatrixName");
        this.f44413f = C15492g.m56045c(C12433d.f37102b);
        C15610b bVar2 = null;
        if (str4 == null) {
            bVar = null;
        } else {
            bVar = mo42899e(str4);
        }
        this.f44414g = bVar;
        this.f44415h = C16558a.m58817b(8);
        this.f44416i = str3 != null ? mo42898d(str3) : bVar2;
        this.f44417j = mo42898d(str);
        this.f44418k = mo42899e(str2);
        this.f44419l = new RectF();
        this.f44420m = -1;
    }

    /* renamed from: g */
    public void mo42901g(C12865b bVar) {
        C41536l.m120489i(bVar, "drawable");
        super.mo42901g(bVar);
        GLES20.glDisableVertexAttribArray(this.f44417j.mo42906a());
        C15610b bVar2 = this.f44416i;
        if (bVar2 != null) {
            GLES20.glDisableVertexAttribArray(bVar2.mo42906a());
        }
        C16416a aVar = this.f44422o;
        if (aVar != null) {
            aVar.mo33047a();
        }
        C12433d.m47459b("onPostDraw end");
    }

    /* renamed from: h */
    public void mo42902h(C12865b bVar, float[] fArr) {
        boolean z;
        float f;
        float f2;
        C12865b bVar2 = bVar;
        float[] fArr2 = fArr;
        C41536l.m120489i(bVar2, "drawable");
        C41536l.m120489i(fArr2, "modelViewProjectionMatrix");
        super.mo42902h(bVar, fArr);
        if (bVar2 instanceof C12864a) {
            C16416a aVar = this.f44422o;
            if (aVar != null) {
                aVar.mo33048b();
            }
            boolean z2 = true;
            GLES20.glUniformMatrix4fv(this.f44418k.mo42907b(), 1, false, fArr2, 0);
            C12433d.m47459b("glUniformMatrix4fv");
            C15610b bVar3 = this.f44414g;
            if (bVar3 != null) {
                GLES20.glUniformMatrix4fv(bVar3.mo42907b(), 1, false, mo42913k(), 0);
                C12433d.m47459b("glUniformMatrix4fv");
            }
            C15610b bVar4 = this.f44417j;
            GLES20.glEnableVertexAttribArray(bVar4.mo42906a());
            C12433d.m47459b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar4.mo42906a(), 2, C15491f.m56028c(), false, bVar.mo33550g(), bVar.mo33547d());
            C12433d.m47459b("glVertexAttribPointer");
            C15610b bVar5 = this.f44416i;
            if (bVar5 != null) {
                if (!C41536l.m120484d(bVar2, this.f44421n) || bVar.mo33548e() != this.f44420m) {
                    C12864a aVar2 = (C12864a) bVar2;
                    this.f44421n = aVar2;
                    this.f44420m = bVar.mo33548e();
                    aVar2.mo33544h(this.f44419l);
                    int f3 = bVar.mo33549f() * 2;
                    if (this.f44415h.capacity() < f3) {
                        C16559b.m58818a(this.f44415h);
                        this.f44415h = C16558a.m58817b(f3);
                    }
                    this.f44415h.clear();
                    this.f44415h.limit(f3);
                    if (f3 > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (i % 2 == 0) {
                                z = z2;
                            } else {
                                z = false;
                            }
                            float f4 = bVar.mo33547d().get(i);
                            RectF rectF = this.f44419l;
                            if (z) {
                                f = rectF.left;
                            } else {
                                f = rectF.bottom;
                            }
                            float f5 = f;
                            RectF rectF2 = this.f44419l;
                            if (z) {
                                f2 = rectF2.right;
                            } else {
                                f2 = rectF2.top;
                            }
                            int i3 = i2;
                            this.f44415h.put(mo42912j(i / 2, aVar2, f4, f5, f2, z));
                            if (i3 >= f3) {
                                break;
                            }
                            i = i3;
                            z2 = true;
                        }
                    }
                }
                this.f44415h.rewind();
                GLES20.glEnableVertexAttribArray(bVar5.mo42906a());
                C12433d.m47459b("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(bVar5.mo42906a(), 2, C15491f.m56028c(), false, bVar.mo33550g(), this.f44415h);
                C12433d.m47459b("glVertexAttribPointer");
                return;
            }
            return;
        }
        throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
    }

    /* renamed from: i */
    public void mo42903i() {
        super.mo42903i();
        C16559b.m58818a(this.f44415h);
        C16416a aVar = this.f44422o;
        if (aVar != null) {
            aVar.mo43542i();
        }
        this.f44422o = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public float mo42912j(int i, C12864a aVar, float f, float f2, float f3, boolean z) {
        C41536l.m120489i(aVar, "drawable");
        return (((f - f2) / (f3 - f2)) * 1.0f) + Utils.FLOAT_EPSILON;
    }

    /* renamed from: k */
    public final float[] mo42913k() {
        return this.f44413f;
    }

    /* renamed from: l */
    public final void mo42914l(float[] fArr) {
        C41536l.m120489i(fArr, "<set-?>");
        this.f44413f = fArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15616d(int i, String str, String str2, String str3, String str4) {
        this(i, false, str, str2, str3, str4);
        C41536l.m120489i(str, "vertexPositionName");
        C41536l.m120489i(str2, "vertexMvpMatrixName");
    }
}
