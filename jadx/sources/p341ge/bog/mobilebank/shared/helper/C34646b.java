package p341ge.bog.mobilebank.shared.helper;

import android.content.Context;
import g91.C32343x;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.shared.helper.b */
public abstract class C34646b {
    /* renamed from: a */
    public static final StringSource.Dictionary m101747a(String str, boolean z, Object... objArr) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(objArr, "variables");
        return new StringSource.Dictionary(str, Boolean.valueOf(z), C41333m.m119788O(objArr));
    }

    /* renamed from: b */
    public static final StringSource.Dictionary m101748b(String str, Object... objArr) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(objArr, "variables");
        return new StringSource.Dictionary(str, Boolean.FALSE, C41333m.m119788O(objArr));
    }

    /* renamed from: c */
    public static final StringSource.Raw m101749c(String str) {
        C41536l.m120489i(str, "<this>");
        return new StringSource.Raw(str);
    }

    /* renamed from: d */
    public static final StringSource.Resource m101750d(int i, Object... objArr) {
        C41536l.m120489i(objArr, "variables");
        return new StringSource.Resource(i, C41333m.m119788O(objArr));
    }

    /* renamed from: e */
    public static final String m101751e(StringSource stringSource, Context context) {
        String str;
        boolean z;
        C41536l.m120489i(stringSource, "<this>");
        if (stringSource instanceof StringSource.Dictionary) {
            StringSource.Dictionary dictionary = (StringSource.Dictionary) stringSource;
            String b = dictionary.mo84399b();
            Boolean d = dictionary.mo84400d();
            if (d != null) {
                z = d.booleanValue();
            } else {
                z = false;
            }
            Object[] a = stringSource.mo84398a();
            return C32343x.m95386E(b, z, Arrays.copyOf(a, a.length));
        } else if (stringSource instanceof StringSource.Raw) {
            return ((StringSource.Raw) stringSource).mo84410b();
        } else {
            if (stringSource instanceof StringSource.Resource) {
                if (context != null) {
                    int b2 = ((StringSource.Resource) stringSource).mo84420b();
                    Object[] a2 = stringSource.mo84398a();
                    String string = context.getString(b2, Arrays.copyOf(a2, a2.length));
                    if (string != null) {
                        str = string;
                        C41536l.m120488h(str, "context?.getString(resId…ing(*additionalVariables)");
                        return str;
                    }
                }
                int b3 = ((StringSource.Resource) stringSource).mo84420b();
                Object[] a3 = stringSource.mo84398a();
                str = C32343x.m95452h0(b3, Arrays.copyOf(a3, a3.length));
                C41536l.m120488h(str, "context?.getString(resId…ing(*additionalVariables)");
                return str;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ String m101752f(StringSource stringSource, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return m101751e(stringSource, context);
    }
}
