package p447hg;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.C0767a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.domain.model.components.ProductType;
import p653wf.C18584m;
import p653wf.C18587p;

/* renamed from: hg.c */
public abstract class C15499c {

    /* renamed from: hg.c$a */
    public /* synthetic */ class C15500a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44005a;

        static {
            int[] iArr = new int[ProductType.values().length];
            iArr[ProductType.CALL.ordinal()] = 1;
            iArr[ProductType.CHILD.ordinal()] = 2;
            iArr[ProductType.ENLARG.ordinal()] = 3;
            iArr[ProductType.ENLARGSOLO.ordinal()] = 4;
            iArr[ProductType.EXPRESS.ordinal()] = 5;
            iArr[ProductType.INVEST.ordinal()] = 6;
            iArr[ProductType.PREMIUM.ordinal()] = 7;
            iArr[ProductType.SAVING.ordinal()] = 8;
            iArr[ProductType.TERM.ordinal()] = 9;
            f44005a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m56058a(Date date) {
        String str;
        C41536l.m120489i(date, "<this>");
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        instance.setTime(date);
        if (i == instance.get(1)) {
            str = "d MMMM, HH:mm";
        } else {
            str = "d MMMM, yyyy HH:mm";
        }
        String format = new SimpleDateFormat(str, Locale.getDefault()).format(date);
        C41536l.m120488h(format, "format.format(this)");
        return format;
    }

    /* renamed from: b */
    public static final int m56059b(Context context, int i, boolean z) {
        C41536l.m120489i(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (z) {
            return i2;
        }
        return C0767a.m2893c(context, i2);
    }

    /* renamed from: c */
    public static final int m56060c(Context context) {
        C41536l.m120489i(context, "<this>");
        return m56059b(context, C18584m.f52131b, false);
    }

    /* renamed from: d */
    public static final int m56061d(ProductType productType) {
        int i;
        if (productType == null) {
            i = -1;
        } else {
            i = C15500a.f44005a[productType.ordinal()];
        }
        switch (i) {
            case 1:
                return C18587p.f52138o;
            case 2:
                return C18587p.f52140q;
            case 3:
            case 4:
                return C18587p.f52141r;
            case 5:
                return C18587p.f52137n;
            case 6:
                return C18587p.f52143t;
            case 7:
                return C18587p.f52139p;
            case 8:
                return C18587p.f52142s;
            case 9:
                return C18587p.f52143t;
            default:
                return C18587p.f52146w;
        }
    }
}
