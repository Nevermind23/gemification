package cf1;

import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: cf1.o */
abstract class C40429o {
    /* renamed from: a */
    public static void m117087a(Appendable appendable, Object obj, C43075l lVar) {
        boolean z;
        C41536l.m120489i(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
