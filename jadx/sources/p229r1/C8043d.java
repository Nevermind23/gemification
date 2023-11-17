package p229r1;

import androidx.work.C2073m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7362a0;
import p190o1.C7378i;
import p190o1.C7379j;
import p190o1.C7388o;
import p190o1.C7399v;
import p190o1.C7417y;
import ue1.C43075l;

/* renamed from: r1.d */
public abstract class C8043d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23191a;

    static {
        String i = C2073m.m8073i("DiagnosticsWrkr");
        C41536l.m120488h(i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f23191a = i;
    }

    /* renamed from: c */
    private static final String m30542c(C7399v vVar, String str, Integer num, String str2) {
        return 10 + vVar.f21630a + "\t " + vVar.f21632c + "\t " + num + "\t " + vVar.f21631b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m30543d(C7388o oVar, C7362a0 a0Var, C7379j jVar, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7399v vVar = (C7399v) it.next();
            C7378i g = jVar.mo21767g(C7417y.m28225a(vVar));
            if (g != null) {
                num = Integer.valueOf(g.f21603c);
            } else {
                num = null;
            }
            sb.append(m30542c(vVar, C41358y.m120017g0(oVar.mo21777b(vVar.f21630a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null), num, C41358y.m120017g0(a0Var.mo21738b(vVar.f21630a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null)));
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
