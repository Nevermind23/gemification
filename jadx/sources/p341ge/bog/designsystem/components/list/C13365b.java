package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: ge.bog.designsystem.components.list.b */
final class C13365b implements C41555e {

    /* renamed from: a */
    private final TextView f39753a;

    /* renamed from: b */
    private boolean f39754b;

    public C13365b(TextView textView) {
        C41536l.m120489i(textView, "textView");
        this.f39753a = textView;
    }

    /* renamed from: a */
    public Boolean getValue(View view, C40303i iVar) {
        C41536l.m120489i(view, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Boolean.valueOf(this.f39754b);
    }

    /* renamed from: b */
    public void mo36104b(View view, C40303i iVar, boolean z) {
        C41536l.m120489i(view, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f39754b = z;
        TextView textView = this.f39753a;
        if (z) {
            textView.setMinLines(0);
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize((TextUtils.TruncateAt) null);
        } else {
            textView.setMinLines(1);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (ViewCompat.m3579V(view)) {
            view.requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo36104b((View) obj, iVar, ((Boolean) obj2).booleanValue());
    }
}
