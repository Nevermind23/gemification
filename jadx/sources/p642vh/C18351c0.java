package p642vh;

import af1.C40303i;
import android.content.Context;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: vh.c0 */
public final class C18351c0 implements C41555e {

    /* renamed from: a */
    private final TextView f51798a;

    public C18351c0(TextView textView) {
        C41536l.m120489i(textView, "textView");
        this.f51798a = textView;
    }

    /* renamed from: a */
    public Color getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Color color) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C41536l.m120489i(color, C11755a.C11756a.f34100b);
        try {
            Context context = this.f51798a.getContext();
            C41536l.m120488h(context, "textView.context");
            this.f51798a.setTextColor(color.mo35260a(context));
        } catch (Exception unused) {
        }
    }
}
