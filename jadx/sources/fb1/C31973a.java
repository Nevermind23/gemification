package fb1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import ba1.C10211p;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10215t;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41233s;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import p485kc.C16341a;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: fb1.a */
public final class C31973a {

    /* renamed from: a */
    public static final C31973a f78755a = new C31973a();

    private C31973a() {
    }

    /* renamed from: f */
    private final String m94384f(int i) {
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* renamed from: a */
    public final Intent mo72466a(Context context) {
        C41536l.m120489i(context, "context");
        return C16341a.f46171a.mo43317e(context);
    }

    /* renamed from: b */
    public final void mo72467b(String str) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C16341a.f46171a.mo43320h(str);
    }

    /* renamed from: c */
    public final void mo72468c(C43064a aVar) {
        C41536l.m120489i(aVar, "callback");
        C16341a.f46171a.mo43321i(aVar);
    }

    /* renamed from: d */
    public final void mo72469d(String str) {
        C41536l.m120489i(str, "identomatToken");
        C16341a.f46171a.mo43323k(str);
    }

    /* renamed from: e */
    public final void mo72470e(Context context, Map map, C43064a aVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(map, "stringMap");
        C41536l.m120489i(aVar, "callback");
        int i = C10211p.f28266e;
        int d = C18368l.m62755d(context, i);
        int c = C0767a.m2893c(context, C10212q.f28271e);
        if (d == 0) {
            d = C18368l.m62755d(context, i);
        }
        Typeface h = C0808h.m3033h(context, C10215t.f28286b);
        Typeface h2 = C0808h.m3033h(context, C10215t.f28287c);
        C16341a aVar2 = C16341a.f46171a;
        aVar2.mo43324l(C41344r0.m119931m(C41233s.m119492a("scan_retry_icon", Integer.valueOf(C10214s.illustration_document_scan)), C41233s.m119492a("button_corner_radius", 16), C41233s.m119492a("head1_font", h), C41233s.m119492a("head2_font", h), C41233s.m119492a("body_font", h2), C41233s.m119492a("head1_font_size", 20), C41233s.m119492a("head2_font_size", 15), C41233s.m119492a("body_font_size", 13)));
        aVar2.mo43322j(C41344r0.m119931m(C41233s.m119492a("primary_button", m94384f(d)), C41233s.m119492a("text_color_header", m94384f(c))));
        aVar2.mo43325m(C41344r0.m119931m(C41233s.m119492a("en", map), C41233s.m119492a("ka", map)));
        mo72468c(aVar);
    }
}
