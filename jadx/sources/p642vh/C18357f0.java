package p642vh;

import af1.C40303i;
import android.widget.TextView;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.f0 */
public final class C18357f0 implements C41555e {

    /* renamed from: a */
    private final TextView f51808a;

    public C18357f0(TextView textView) {
        C41536l.m120489i(textView, "textView");
        this.f51808a = textView;
    }

    /* renamed from: a */
    public Integer getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Integer.valueOf(this.f51808a.getMaxLines());
    }

    /* renamed from: b */
    public void mo46140b(Object obj, C40303i iVar, int i) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (i > 0) {
            this.f51808a.setMaxLines(i);
        }
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo46140b(obj, iVar, ((Number) obj2).intValue());
    }
}
