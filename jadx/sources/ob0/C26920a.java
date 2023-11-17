package ob0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.github.mikephil.charting.utils.Utils;
import da0.C19955i;
import g91.C32343x;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ob0.a */
public final class C26920a {

    /* renamed from: a */
    public static final C26920a f67675a = new C26920a();

    private C26920a() {
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo66213a(Context context, Double d) {
        C41536l.m120489i(context, "context");
        if (d == null || C41536l.m120482b(d, Utils.DOUBLE_EPSILON)) {
            return new SpannableStringBuilder(C32343x.m95388F("applications.deposits.fields.deposit.int.rate", new Object[0]));
        }
        List x0 = C40440x.m117182x0(C32343x.m95388F("applications.deposits.fields.deposit.int.rate.with.spread", new Object[0]), new String[]{"{1s}"}, false, 0, 6, (Object) null);
        C41224m a = C41233s.m119492a(C41358y.m120010Z(x0, 0), C41358y.m120010Z(x0, 1));
        String str = (String) a.mo95675a();
        String str2 = (String) a.mo95676b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null) {
            str = "";
        }
        int i = C19955i.f54550d;
        SpannableStringBuilder append = spannableStringBuilder.append(str, new TextAppearanceSpan(context, i), 33);
        SpannableStringBuilder append2 = append.append(d + "%", new TextAppearanceSpan(context, C19955i.f54552f), 33);
        if (str2 == null) {
            str2 = "";
        }
        SpannableStringBuilder append3 = append2.append(str2, new TextAppearanceSpan(context, i), 33);
        C41536l.m120488h(append3, "SpannableStringBuilder()…CLUSIVE\n                )");
        return append3;
    }

    /* renamed from: b */
    public final SpannableStringBuilder mo66214b(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "intRate");
        List x0 = C40440x.m117182x0(C32343x.m95388F("applications.deposits.main.page.deposit.card.spread.rate", new Object[0]), new String[]{"{1s}"}, false, 0, 6, (Object) null);
        C41224m a = C41233s.m119492a(C41358y.m120010Z(x0, 0), C41358y.m120010Z(x0, 1));
        String str2 = (String) a.mo95675a();
        String str3 = (String) a.mo95676b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        int i = C19955i.f54549c;
        SpannableStringBuilder append = spannableStringBuilder.append(str2, new TextAppearanceSpan(context, i), 33);
        SpannableStringBuilder append2 = append.append(str + "%", new TextAppearanceSpan(context, C19955i.f54551e), 33);
        if (str3 == null) {
            str3 = "";
        }
        SpannableStringBuilder append3 = append2.append(str3, new TextAppearanceSpan(context, i), 33);
        C41536l.m120488h(append3, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append3;
    }

    /* renamed from: c */
    public final SpannableStringBuilder mo66215c(Context context, String str, String str2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "text");
        C41536l.m120489i(str2, "variable");
        List x0 = C40440x.m117182x0(str, new String[]{"{1s}"}, false, 0, 6, (Object) null);
        C41224m a = C41233s.m119492a(C41358y.m120010Z(x0, 0), C41358y.m120010Z(x0, 1));
        String str3 = (String) a.mo95675a();
        String str4 = (String) a.mo95676b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 == null) {
            str3 = "";
        }
        int i = C19955i.f54550d;
        SpannableStringBuilder append = spannableStringBuilder.append(str3, new TextAppearanceSpan(context, i), 33).append(str2, new TextAppearanceSpan(context, C19955i.TextH4InvertComponents400Left), 33);
        if (str4 == null) {
            str4 = "";
        }
        SpannableStringBuilder append2 = append.append(str4, new TextAppearanceSpan(context, i), 33);
        C41536l.m120488h(append2, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append2;
    }
}
