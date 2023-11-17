package gb1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qa1.C27700a1;

/* renamed from: gb1.c */
public final class C32366c {

    /* renamed from: b */
    public static final C32367a f79811b = new C32367a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C27700a1 f79812a;

    /* renamed from: gb1.c$a */
    public static final class C32367a {
        private C32367a() {
        }

        public /* synthetic */ C32367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C32366c(C27700a1 a1Var) {
        C41536l.m120489i(a1Var, "storage");
        this.f79812a = a1Var;
    }

    /* renamed from: a */
    private final String[] m95603a(String[] strArr, Context context) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (context.checkSelfPermission(str) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: b */
    public final boolean mo72865b(Fragment fragment, int i, String... strArr) {
        boolean z;
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(strArr, "permissionName");
        Context requireContext = fragment.requireContext();
        C41536l.m120488h(requireContext, "fragment.requireContext()");
        String[] a = m95603a(strArr, requireContext);
        boolean z2 = false;
        if (a.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fragment.requestPermissions(a, i);
        }
        if (a.length == 0) {
            z2 = true;
        }
        return !z2;
    }
}
