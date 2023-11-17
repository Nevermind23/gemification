package v30;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.C41536l;
import o30.C26710a;
import p366bk.C10322k;
import s30.C28141c;

/* renamed from: v30.e */
public final class C28989e extends C26710a {

    /* renamed from: k */
    private final TextView f73930k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28989e(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f73930k = (TextView) view.findViewById(C10322k.debt_text);
    }

    /* renamed from: l */
    public void mo65920j(C28141c cVar) {
        C41536l.m120489i(cVar, "item");
        super.mo65920j(cVar);
        this.f73930k.setText(cVar.mo67672m());
    }
}
