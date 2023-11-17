package p642vh;

import af1.C40303i;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p561pi.C17365a;

/* renamed from: vh.m */
public final class C18374m implements C41555e {

    /* renamed from: a */
    private final TextView f51829a;

    /* renamed from: b */
    private final C17365a f51830b;

    public C18374m(TextView textView, C17365a aVar) {
        C41536l.m120489i(textView, "textView");
        C41536l.m120489i(aVar, "formatter");
        this.f51829a = textView;
        this.f51830b = aVar;
    }

    /* renamed from: a */
    public CharSequence getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51830b.mo44803c(this.f51829a.getText().toString());
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, CharSequence charSequence) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C41536l.m120489i(charSequence, C11755a.C11756a.f34100b);
        this.f51829a.setText(this.f51830b.mo44804d(charSequence.toString()));
    }
}
