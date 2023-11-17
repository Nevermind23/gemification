package p642vh;

import af1.C40303i;
import android.content.res.ColorStateList;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.d0 */
public final class C18353d0 implements C41555e {

    /* renamed from: a */
    private final TextView f51800a;

    public C18353d0(TextView textView) {
        C41536l.m120489i(textView, "textView");
        this.f51800a = textView;
    }

    /* renamed from: a */
    public ColorStateList getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        ColorStateList textColors = this.f51800a.getTextColors();
        C41536l.m120488h(textColors, "textView.textColors");
        return textColors;
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, ColorStateList colorStateList) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C41536l.m120489i(colorStateList, C11755a.C11756a.f34100b);
        this.f51800a.setTextColor(colorStateList);
    }
}
