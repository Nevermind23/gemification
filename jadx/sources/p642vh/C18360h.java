package p642vh;

import af1.C40303i;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.h */
public final class C18360h implements C41555e {

    /* renamed from: a */
    private final TextView f51810a;

    /* renamed from: b */
    private final SimpleDateFormat f51811b;

    public C18360h(TextView textView, String str, Locale locale) {
        C41536l.m120489i(textView, "textView");
        C41536l.m120489i(str, "pattern");
        C41536l.m120489i(locale, C11772k.C11773a.f34182n);
        this.f51810a = textView;
        this.f51811b = new SimpleDateFormat(str, locale);
    }

    /* renamed from: a */
    public Date getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        try {
            return this.f51811b.parse(this.f51810a.getText().toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Date date) {
        String str;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        TextView textView = this.f51810a;
        if (date == null || (str = this.f51811b.format(date)) == null) {
            str = "";
        }
        textView.setText(str);
    }
}
