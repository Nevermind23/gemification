package p329z;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1152f3;
import androidx.core.view.C1161g3;
import kotlin.jvm.internal.C41536l;

/* renamed from: z.a */
public abstract class C9147a {

    /* renamed from: a */
    private static final int f25375a = C9149c.pooling_container_listener_holder_tag;

    /* renamed from: b */
    private static final int f25376b = C9149c.is_pooling_container_tag;

    /* renamed from: a */
    public static final void m33773a(View view) {
        C41536l.m120489i(view, "<this>");
        for (View c : C1161g3.m4227a(view)) {
            m33775c(c).mo24723a();
        }
    }

    /* renamed from: b */
    public static final void m33774b(ViewGroup viewGroup) {
        C41536l.m120489i(viewGroup, "<this>");
        for (View c : C1152f3.m4215b(viewGroup)) {
            m33775c(c).mo24723a();
        }
    }

    /* renamed from: c */
    private static final C9148b m33775c(View view) {
        int i = f25375a;
        C9148b bVar = (C9148b) view.getTag(i);
        if (bVar != null) {
            return bVar;
        }
        C9148b bVar2 = new C9148b();
        view.setTag(i, bVar2);
        return bVar2;
    }

    /* renamed from: d */
    public static final void m33776d(View view, boolean z) {
        C41536l.m120489i(view, "<this>");
        view.setTag(f25376b, Boolean.valueOf(z));
    }
}
