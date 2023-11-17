package p240s;

import android.view.View;

/* renamed from: s.a */
public abstract class C8090a {
    /* renamed from: a */
    public static String m30629a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
