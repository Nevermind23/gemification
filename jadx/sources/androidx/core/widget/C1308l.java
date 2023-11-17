package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.l */
public abstract class C1308l {

    /* renamed from: androidx.core.widget.l$a */
    static class C1309a {
        /* renamed from: a */
        static boolean m4540a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m4541b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m4538a(ListView listView, int i) {
        return C1309a.m4540a(listView, i);
    }

    /* renamed from: b */
    public static void m4539b(ListView listView, int i) {
        C1309a.m4541b(listView, i);
    }
}
