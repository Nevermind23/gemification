package p642vh;

import af1.C40303i;
import android.widget.TextView;
import androidx.core.text.C0969e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import ue1.C43064a;

/* renamed from: vh.e0 */
public final class C18355e0 implements C41555e {

    /* renamed from: a */
    private final TextView f51802a;

    /* renamed from: b */
    private final boolean f51803b;

    /* renamed from: c */
    private final C43064a f51804c;

    public C18355e0(TextView textView, boolean z, C43064a aVar) {
        C41536l.m120489i(textView, "textView");
        this.f51802a = textView;
        this.f51803b = z;
        this.f51804c = aVar;
    }

    /* renamed from: a */
    public CharSequence getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51802a.getText();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, CharSequence charSequence) {
        String str;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        TextView textView = this.f51802a;
        if (this.f51803b) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            charSequence = C0969e.m3470a(str, 0);
        }
        textView.setText(charSequence);
        C43064a aVar = this.f51804c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18355e0(TextView textView, boolean z, C43064a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textView, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : aVar);
    }
}
