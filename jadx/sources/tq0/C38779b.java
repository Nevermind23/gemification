package tq0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import sp0.C38499r;

/* renamed from: tq0.b */
public final class C38779b extends FrameLayout {

    /* renamed from: d */
    private final C38499r f92724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38779b(Context context, String str, String str2, boolean z) {
        super(context, (AttributeSet) null, 0);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "label");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        C38499r d = C38499r.m113011d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f92724d = d;
        d.f92268e.setText(str);
        d.f92269f.setText(str2);
        View view = d.f92270g;
        C41536l.m120488h(view, "binding.divider");
        C32343x.m95483r1(view, !z, false, 2, (Object) null);
    }
}
