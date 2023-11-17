package org.webrtc;

import com.github.mikephil.charting.utils.Utils;
import java.nio.FloatBuffer;
import org.webrtc.C42107q;
import xh1.C43317k;

/* renamed from: org.webrtc.i */
abstract class C42092i implements C42107q.C42109b {

    /* renamed from: f */
    private static final FloatBuffer f99010f = GlUtil.m122180a(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});

    /* renamed from: g */
    private static final FloatBuffer f99011g = GlUtil.m122180a(new float[]{Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f, 1.0f});

    /* renamed from: a */
    private final String f99012a;

    /* renamed from: b */
    private final String f99013b;

    /* renamed from: c */
    private final C42093a f99014c;

    /* renamed from: d */
    private C42094b f99015d;

    /* renamed from: e */
    private C43317k f99016e;

    /* renamed from: org.webrtc.i$a */
    public interface C42093a {
    }

    /* renamed from: org.webrtc.i$b */
    public enum C42094b {
        OES,
        RGB,
        YUV
    }

    public C42092i(String str, C42093a aVar) {
        this("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", str, aVar);
    }

    /* renamed from: a */
    public void mo97612a() {
        C43317k kVar = this.f99016e;
        if (kVar != null) {
            kVar.mo102009a();
            this.f99016e = null;
            this.f99015d = null;
        }
    }

    public C42092i(String str, String str2, C42093a aVar) {
        this.f99013b = str;
        this.f99012a = str2;
        this.f99014c = aVar;
    }
}
