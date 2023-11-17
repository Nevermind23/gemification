package p403ee;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Log;
import ie1.C41330k0;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p445he.C15486a;
import p445he.C15488c;
import p445he.C15489d;

/* renamed from: ee.b */
public class C12429b {

    /* renamed from: a */
    public static final C12430a f37095a = new C12430a((DefaultConstructorMarker) null);

    /* renamed from: ee.b$a */
    public static final class C12430a {
        private C12430a() {
        }

        public /* synthetic */ C12430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C15486a mo33037a(C15488c cVar, int i, boolean z) {
        C15486a aVar;
        C41536l.m120489i(cVar, "display");
        C15486a[] aVarArr = new C15486a[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(cVar.mo42588a(), mo33038b(i, z), 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eglChooseConfig) {
            Iterator it = C41333m.m119798w(aVarArr).iterator();
            while (it.hasNext()) {
                int nextInt = ((C41330k0) it).nextInt();
                EGLConfig eGLConfig = eGLConfigArr[nextInt];
                if (eGLConfig == null) {
                    aVar = null;
                } else {
                    aVar = new C15486a(eGLConfig);
                }
                aVarArr[nextInt] = aVar;
            }
        }
        if (eglChooseConfig) {
            return aVarArr[0];
        }
        Log.w("EglConfigChooser", "Unable to find RGB8888 / " + i + " EGLConfig");
        return null;
    }

    /* renamed from: b */
    public final int[] mo33038b(int i, boolean z) {
        int i2;
        int i3;
        if (i >= 3) {
            i2 = C15489d.m56016k() | C15489d.m56017l();
        } else {
            i2 = C15489d.m56016k();
        }
        int[] iArr = new int[15];
        iArr[0] = C15489d.m56019n();
        iArr[1] = 8;
        iArr[2] = C15489d.m56010e();
        iArr[3] = 8;
        iArr[4] = C15489d.m56007b();
        iArr[5] = 8;
        iArr[6] = C15489d.m56006a();
        iArr[7] = 8;
        iArr[8] = C15489d.m56022q();
        iArr[9] = C15489d.m56024s() | C15489d.m56018m();
        iArr[10] = C15489d.m56020o();
        iArr[11] = i2;
        if (z != 0) {
            i3 = 12610;
        } else {
            i3 = C15489d.m56012g();
        }
        iArr[12] = i3;
        iArr[13] = z;
        iArr[14] = C15489d.m56012g();
        return iArr;
    }
}
