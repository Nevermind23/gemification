package g91;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import ba1.C10146d0;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.load.resource.bitmap.C2524n;
import hd0.C24978b;
import java.io.File;
import l81.C37108e;
import p035c4.C2255g;
import p035c4.C2256h;
import p296w3.C8761k;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p366bk.C10320i;

/* renamed from: g91.b0 */
public abstract class C32289b0 {

    /* renamed from: a */
    public static final Integer f79694a;

    /* renamed from: b */
    public static final Integer f79695b;

    /* renamed from: c */
    public static final Integer f79696c;

    /* renamed from: d */
    public static final Integer f79697d;

    static {
        int i = C10320i.ic_temp_lion;
        f79694a = Integer.valueOf(i);
        f79695b = Integer.valueOf(i);
        int i2 = C10320i.ic_temp_lion_circle;
        f79696c = Integer.valueOf(i2);
        f79697d = Integer.valueOf(i2);
    }

    /* renamed from: a */
    public static String m95089a(String str) {
        return m95090b(str, false);
    }

    /* renamed from: b */
    public static String m95090b(String str, boolean z) {
        String c = m95091c(str);
        if (c == null) {
            return c;
        }
        String token = C10146d0.C10159c.m37143b().getToken();
        Object[] objArr = new Object[1];
        if (token == null) {
            token = "";
        }
        objArr[0] = token;
        String concat = c.concat(String.format("&keycloakSessionToken=%s", objArr));
        if (!z) {
            return concat;
        }
        return concat + "&timestamp=" + System.currentTimeMillis();
    }

    /* renamed from: c */
    public static String m95091c(String str) {
        if (str == null) {
            return null;
        }
        return PreferencesApiManager.getInstance().getServerUrl().concat("?").concat(str).concat("&channel=MOBILE&UserId=MOBILE").concat("&langCode=").concat(PreferencesApiManager.getInstance().getLanguage().mo90433b()).concat("&darkMode=").concat(C24978b.m79846b(Boolean.valueOf(RetrofitClient.getInstance().isDarkMode())).mo63391e());
    }

    /* renamed from: d */
    public static String m95092d(String str) {
        if (str == null) {
            return null;
        }
        return PreferencesApiManager.getInstance().getServerUrl().concat("?serviceId=COMMON_GET_FILE&iconType=PAY_PROVIDER&iconSubType=").concat(str) + "&channel=MOBILE&UserId=MOBILE&langCode=GE";
    }

    /* renamed from: e */
    public static String m95093e(String str) {
        String str2;
        String c = m95091c(str);
        if (c == null) {
            return c;
        }
        String token = C10146d0.C10159c.m37143b().getToken();
        if (C10146d0.C10148b.m37109g() != null) {
            str2 = C10146d0.C10148b.m37109g().getExtCustomerId();
        } else {
            str2 = null;
        }
        Object[] objArr = new Object[2];
        if (token == null) {
            token = "";
        }
        objArr[0] = token;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        return c.concat(String.format("&keycloakSessionToken=%s&extCustomerId=%s", objArr));
    }

    /* renamed from: f */
    public static void m95094f(ImageView imageView, Uri uri) {
        m95104p(imageView, (String) null, uri, (File) null, (Integer) null, (Integer) null, (Integer) null, true);
    }

    /* renamed from: g */
    public static void m95095g(ImageView imageView, Integer num) {
        m95104p(imageView, (String) null, (Uri) null, (File) null, num, (Integer) null, (Integer) null, true);
    }

    /* renamed from: h */
    public static void m95096h(ImageView imageView, Integer num, boolean z) {
        m95105q(imageView, (String) null, (Uri) null, (File) null, num, (Integer) null, (Integer) null, true, z);
    }

    /* renamed from: i */
    public static void m95097i(ImageView imageView, String str) {
        m95104p(imageView, str, (Uri) null, (File) null, (Integer) null, (Integer) null, (Integer) null, true);
    }

    /* renamed from: j */
    public static void m95098j(ImageView imageView, Uri uri, Integer num, Integer num2, boolean z) {
        m95104p(imageView, (String) null, uri, (File) null, (Integer) null, num, num2, z);
    }

    /* renamed from: k */
    public static void m95099k(ImageView imageView, File file, Integer num, Integer num2, boolean z) {
        m95105q(imageView, (String) null, (Uri) null, file, (Integer) null, num, num2, z, false);
    }

    /* renamed from: l */
    public static void m95100l(ImageView imageView, Integer num, Integer num2, Integer num3, boolean z) {
        m95104p(imageView, (String) null, (Uri) null, (File) null, num, num2, num3, z);
    }

    /* renamed from: m */
    public static void m95101m(ImageView imageView, Integer num, Integer num2, Integer num3, boolean z, boolean z2) {
        m95105q(imageView, (String) null, (Uri) null, (File) null, num, num2, num3, z, z2);
    }

    /* renamed from: n */
    public static void m95102n(ImageView imageView, Integer num, boolean z) {
        Integer num2;
        Integer num3;
        if (z) {
            num2 = f79697d;
        } else {
            num2 = f79695b;
        }
        Integer num4 = num2;
        if (z) {
            num3 = f79696c;
        } else {
            num3 = f79694a;
        }
        m95104p(imageView, (String) null, (Uri) null, (File) null, num, num4, num3, z);
    }

    /* renamed from: o */
    public static void m95103o(ImageView imageView, String str) {
        m95104p(imageView, str, (Uri) null, (File) null, (Integer) null, f79695b, f79694a, false);
    }

    /* renamed from: p */
    public static void m95104p(ImageView imageView, String str, Uri uri, File file, Integer num, Integer num2, Integer num3, boolean z) {
        m95105q(imageView, str, uri, file, num, num2, num3, z, false);
    }

    /* renamed from: q */
    public static void m95105q(ImageView imageView, String str, Uri uri, File file, Integer num, Integer num2, Integer num3, boolean z, boolean z2) {
        m95106r(imageView, str, uri, file, num, num2, num3, z, z2, (C2255g) null);
    }

    /* renamed from: r */
    private static void m95106r(ImageView imageView, String str, Uri uri, File file, Integer num, Integer num2, Integer num3, boolean z, boolean z2, C2255g gVar) {
        C2394j jVar;
        boolean z3;
        Integer num4;
        try {
            Context context = imageView.getContext();
            C2396k t = C2379b.m9210t(context);
            if (str != null) {
                jVar = t.mo7756x(new C32357y0(str)).mo7719N0(gVar);
            } else if (uri != null) {
                jVar = t.mo7753u(uri).mo7719N0(gVar);
            } else if (file != null) {
                jVar = t.mo7754v(file).mo7719N0(gVar);
            } else {
                if (num == null) {
                    if (num3 != null) {
                        num = num3;
                    } else {
                        if (z) {
                            num4 = f79697d;
                        } else {
                            num4 = f79695b;
                        }
                        num = num4;
                    }
                }
                jVar = t.mo7755w(num).mo7719N0(gVar);
            }
            C2256h hVar = new C2256h();
            if (num3 != null) {
                hVar.mo7220c0(num3.intValue());
            }
            if (num2 != null) {
                hVar.mo7232j(num2.intValue());
            }
            if (PreferencesApiManager.getInstance().getThemeType() == 0 || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                if (!z3) {
                    hVar.mo7222d();
                } else {
                    hVar.mo7254w0(new C37108e(C32335t0.m95358c(context)), new C2524n());
                }
            } else if (z3) {
                hVar.mo7252u0(new C37108e(C32335t0.m95358c(context)));
            }
            jVar.mo7215a(hVar).mo7731c1(C8761k.m32594h()).mo7718L0(imageView);
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public static void m95107s(ImageView imageView, String str, Integer num, Integer num2, boolean z, boolean z2) {
        m95105q(imageView, str, (Uri) null, (File) null, (Integer) null, num, num2, z, z2);
    }

    /* renamed from: t */
    public static void m95108t(ImageView imageView, String str, Integer num, Integer num2, boolean z, boolean z2, C2255g gVar) {
        m95106r(imageView, str, (Uri) null, (File) null, (Integer) null, num, num2, z, z2, gVar);
    }

    /* renamed from: u */
    public static void m95109u(ImageView imageView, Integer num, Integer num2, Integer num3, boolean z, boolean z2) {
        m95105q(imageView, (String) null, (Uri) null, (File) null, num, num2, num3, z, z2);
    }

    /* renamed from: v */
    public static boolean m95110v(TemplateBasketItem templateBasketItem, ImageView imageView, Context context) {
        if (templateBasketItem.getTemplateImage(true) != null) {
            String e = m95093e(templateBasketItem.getTemplateImage(true));
            int i = C10320i.f28688dc;
            m95107s(imageView, e, Integer.valueOf(i), Integer.valueOf(i), true, false);
            return true;
        } else if (templateBasketItem.getImageRes() > 0) {
            Integer valueOf = Integer.valueOf(templateBasketItem.getImageRes());
            int i2 = C10320i.f28688dc;
            m95109u(imageView, valueOf, Integer.valueOf(i2), Integer.valueOf(i2), true, false);
            return true;
        } else if (!templateBasketItem.getTransferInitials().isEmpty()) {
            return false;
        } else {
            int i3 = C10320i.ic_transfer_domestic;
            String templateType = templateBasketItem.getTemplateType();
            templateType.hashCode();
            if (templateType.equals("M")) {
                i3 = C10320i.ic_transfer_between_accs;
            } else if (templateType.equals("R")) {
                i3 = C10320i.ic_transfer_rs;
            }
            imageView.setImageDrawable(C32290b1.m95122l(context, C0767a.m2895e(context, i3), C32335t0.m95359d(context, true)));
            return true;
        }
    }
}
