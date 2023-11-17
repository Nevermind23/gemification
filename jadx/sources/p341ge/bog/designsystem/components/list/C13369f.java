package p341ge.bog.designsystem.components.list;

import android.view.View;
import he1.C41233s;
import java.util.Map;
import p601sg.C17786k;

/* renamed from: ge.bog.designsystem.components.list.f */
public abstract class C13369f {

    /* renamed from: a */
    private static final Map f39765a = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(C17786k.f49823N), Integer.valueOf(C17786k.TextSubtitle2InvertComponents400Left)), C41233s.m119492a(Integer.valueOf(C17786k.TextBody1InvertComponents150Left), Integer.valueOf(C17786k.TextSubtitle2InvertComponents150Left)), C41233s.m119492a(Integer.valueOf(C17786k.TextBody1), Integer.valueOf(C17786k.TextTitle2)));

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m50302c(View... viewArr) {
        for (View view : viewArr) {
            if (!view.isInLayout()) {
                view.requestLayout();
            } else {
                view.forceLayout();
            }
            view.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = (java.lang.Integer) r0.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m50303d(int r1, boolean r2) {
        /*
            java.util.Map r0 = f39765a
            if (r2 == 0) goto L_0x0005
            goto L_0x0006
        L_0x0005:
            r0 = 0
        L_0x0006:
            if (r0 == 0) goto L_0x0018
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0018
            int r1 = r2.intValue()
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.list.C13369f.m50303d(int, boolean):int");
    }
}
