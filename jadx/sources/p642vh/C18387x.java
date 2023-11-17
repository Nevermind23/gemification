package p642vh;

import af1.C40303i;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.x */
public final class C18387x implements C41555e {

    /* renamed from: a */
    private final View f51844a;

    public C18387x(View view) {
        C41536l.m120489i(view, "view");
        this.f51844a = view;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m62805d(View.OnClickListener onClickListener, C18387x xVar, View view) {
        C41536l.m120489i(xVar, "this$0");
        if (onClickListener != null) {
            onClickListener.onClick(xVar.f51844a);
        }
    }

    /* renamed from: b */
    public View.OnClickListener getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void setValue(Object obj, C40303i iVar, View.OnClickListener onClickListener) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51844a.setOnClickListener(new C18386w(onClickListener, this));
    }
}
