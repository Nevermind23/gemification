package g91;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.C0703h1;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.salesforce.marketingcloud.C11398b;
import d20.C19854i;
import iu0.C36546y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrId;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10328q;
import p380ck.C10468i;
import p739dv.C20102a;
import p739dv.C20104c;

/* renamed from: g91.z0 */
public abstract class C32359z0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f79797a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f79798b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f79799c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f79800d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f79801e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static int f79802f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static PreferencesApiManager f79803g;

    /* renamed from: h */
    private static RecyclerView.C1756u f79804h = new C32360a();

    /* renamed from: i */
    private static Cipher f79805i;

    /* renamed from: g91.z0$a */
    class C32360a extends RecyclerView.C1756u {

        /* renamed from: g91.z0$a$a */
        class C32361a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ SwipeLayout f79806d;

            /* renamed from: e */
            final /* synthetic */ RecyclerView f79807e;

            /* renamed from: g91.z0$a$a$a */
            class C32362a implements Runnable {
                C32362a() {
                }

                public void run() {
                    if (C32361a.this.f79806d.mo7599s()) {
                        C32361a.this.f79806d.mo7586B(2, true);
                        C32361a.this.f79806d.invalidate();
                    }
                }
            }

            C32361a(SwipeLayout swipeLayout, RecyclerView recyclerView) {
                this.f79806d = swipeLayout;
                this.f79807e = recyclerView;
            }

            public void run() {
                this.f79806d.mo7586B(1, true);
                this.f79806d.invalidate();
                this.f79807e.postDelayed(new C32362a(), 500);
            }
        }

        C32360a() {
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            super.mo5739d(recyclerView, i);
            if (i == 0) {
                try {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    int o2 = linearLayoutManager.mo5221o2();
                    for (int j2 = linearLayoutManager.mo5215j2(); j2 <= o2; j2++) {
                        View O = linearLayoutManager.mo5199O(j2);
                        int itemViewType = recyclerView.mo5364n0(O).getItemViewType();
                        if ((C32359z0.f79797a == 0 && itemViewType == C19854i.f54283J) || ((C32359z0.f79798b == 0 && itemViewType == 2222) || ((C32359z0.f79799c == 0 && itemViewType == 3333) || ((C32359z0.f79800d == 0 && itemViewType == 4444) || ((C32359z0.f79800d == 0 && itemViewType == 5555) || ((C32359z0.f79801e == 0 && itemViewType == 7777) || (C32359z0.f79802f == 0 && itemViewType == 8882))))))) {
                            SwipeLayout swipeLayout = (SwipeLayout) O.findViewById(C10322k.swipe_layout);
                            if (swipeLayout != null && swipeLayout.mo7619y() && !swipeLayout.mo7599s()) {
                                recyclerView.postDelayed(new C32361a(swipeLayout, recyclerView), 200);
                                if (C32359z0.f79803g != null) {
                                    if (itemViewType == C19854i.f54283J) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_HOME_TIPPER");
                                        C32359z0.f79797a = C32359z0.f79797a + 1;
                                    } else if (itemViewType == 2222) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_OPERATION_TIPPER");
                                        C32359z0.f79798b = C32359z0.f79798b + 1;
                                    } else if (itemViewType == 3333) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_PAYMENTS_TIPPER");
                                        C32359z0.f79799c = C32359z0.f79799c + 1;
                                    } else if (itemViewType == 4444 || itemViewType == 5555) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_TEMPLATES_TIPPER");
                                        C32359z0.f79800d = C32359z0.f79800d + 1;
                                    } else if (itemViewType == 7777) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_TRANSFER_TEMPLATES_TIPPER");
                                        C32359z0.f79801e = C32359z0.f79801e + 1;
                                    } else if (itemViewType == 8882) {
                                        C32359z0.f79803g.setSwipeTipCount("SCREEN_TYPE_SAVED_CARDS");
                                        C32359z0.f79802f = C32359z0.f79802f + 1;
                                    }
                                }
                                recyclerView.mo5367o1(this);
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: A */
    public static String m95530A(long j) {
        return NumberFormat.getNumberInstance(Locale.US).format(j);
    }

    /* renamed from: B */
    public static String m95531B(BigDecimal bigDecimal) {
        return NumberFormat.getNumberInstance(Locale.US).format(bigDecimal.setScale(1, 4));
    }

    /* renamed from: C */
    public static Spanned m95532C(String str) {
        if (m95584o()) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: D */
    public static int m95533D() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: E */
    public static String m95534E(String str, C20102a aVar) {
        if (aVar == null) {
            return "";
        }
        for (C20104c cVar : aVar.mo48504d()) {
            if (cVar.mo48522h().equals(str)) {
                return cVar.mo48514a().toString();
            }
        }
        return "";
    }

    /* renamed from: F */
    public static String m95535F() {
        return "ANDROID";
    }

    /* renamed from: G */
    public static int m95536G(Context context, String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    /* renamed from: H */
    public static float m95537H(int i, Context context) {
        return ((float) context.getResources().getInteger(i)) / 100.0f;
    }

    /* renamed from: I */
    public static String m95538I(String str) {
        if (str == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(Double.parseDouble(str));
            if (valueOf.indexOf(".") != valueOf.length() - 2) {
                return valueOf;
            }
            return valueOf + 0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static String m95539J(String str) {
        String I = m95538I(str);
        if (I == null) {
            return null;
        }
        return I + "₾";
    }

    /* renamed from: K */
    public static String m95540K(String str, boolean z) {
        String str2;
        String I = m95538I(str);
        if (I == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(I);
        if (z) {
            str2 = " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("₾");
        return sb.toString();
    }

    /* renamed from: L */
    public static String m95541L(String str) {
        if (str == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(Double.parseDouble(str) / 100.0d);
            if (valueOf.indexOf(".") != valueOf.length() - 2) {
                return valueOf;
            }
            return valueOf + 0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static String m95542M(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m95593u(new DecimalFormat("#,###.####", new DecimalFormatSymbols(Locale.US)).format(Double.parseDouble(str) / 100.0d));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: N */
    public static String m95543N(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m95593u(new DecimalFormat("#,###.##", new DecimalFormatSymbols(Locale.US)).format(Double.parseDouble(str) / 100.0d));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: O */
    public static String m95544O(String str) {
        return m95545P(str, false);
    }

    /* renamed from: P */
    public static String m95545P(String str, boolean z) {
        String str2;
        String L = m95541L(str);
        if (L == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(L);
        if (z) {
            str2 = " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("₾");
        return sb.toString();
    }

    /* renamed from: Q */
    public static String m95546Q(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    /* renamed from: R */
    public static String m95547R(long j, Format format) {
        return format.format(new Date(j));
    }

    /* renamed from: S */
    public static String m95548S(BigDecimal bigDecimal) {
        return new DecimalFormat("#0.00", new DecimalFormatSymbols(Locale.US)).format(bigDecimal);
    }

    /* renamed from: T */
    public static String m95549T(BigDecimal bigDecimal) {
        return new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.US)).format(bigDecimal);
    }

    /* renamed from: U */
    public static String m95550U(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(".", "").replace(",", "").replace("₾", "").replace(" ", "");
    }

    /* renamed from: V */
    public static String m95551V(int i) {
        if (i < 1000) {
            return i + " " + m95557a0(C10328q.map_object_distance_meter_short);
        } else if (i >= 10000000) {
            return null;
        } else {
            String a0 = m95557a0(C10328q.map_object_distance_km_short);
            int i2 = i / 1000;
            int i3 = (i % 1000) / 100;
            if (i3 > 0) {
                return i2 + "." + i3 + " " + a0;
            }
            return i2 + " " + a0;
        }
    }

    /* renamed from: W */
    public static String m95552W(Context context) {
        return Build.SERIAL + "_" + Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: X */
    public static int m95553X(Context context, String str) {
        return context.getResources().getIdentifier(str, "raw", context.getPackageName());
    }

    /* renamed from: Y */
    public static String m95554Y() {
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        while (sb.length() < 18) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt((int) (secureRandom.nextFloat() * ((float) 36))));
        }
        return sb.toString();
    }

    /* renamed from: Z */
    public static String m95555Z(double d) {
        if (d == Utils.DOUBLE_EPSILON) {
            return "0.00";
        }
        try {
            return m95593u(new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US)).format(d / 100.0d));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a0 */
    public static String m95557a0(int i) {
        try {
            return C36546y.m108285N().getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b0 */
    public static String m95559b0(String str) {
        try {
            return m95585o0(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c0 */
    public static Drawable m95561c0(Context context, int i, int i2) {
        Drawable mutate = C0836a.m3156r(C0767a.m2895e(context, i)).mutate();
        C0836a.m3152n(mutate, C0767a.m2893c(context, i2));
        return mutate;
    }

    /* renamed from: d0 */
    public static String m95563d0() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: e0 */
    public static boolean m95565e0(Activity activity, String str) {
        return activity.checkSelfPermission(str) == 0;
    }

    /* renamed from: f0 */
    public static void m95567f0(String str) {
        try {
            f79805i = Cipher.getInstance("AES/CBC/PKCS5Padding");
            f79805i.init(2, new SecretKeySpec(str.getBytes("UTF-8"), "AES"), new IvParameterSpec(new byte[16]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g0 */
    public static boolean m95569g0() {
        return false;
    }

    /* renamed from: h0 */
    public static boolean m95571h0(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy");
        try {
            if (Long.valueOf(simpleDateFormat.parse(str).getTime()).longValue() > Long.valueOf(simpleDateFormat.parse(str2).getTime()).longValue()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i0 */
    public static void m95573i0(EditText editText, int i) {
        if (editText.getFilters() == null || editText.getFilters().length <= 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            return;
        }
        InputFilter[] filters = editText.getFilters();
        int length = filters.length + 1;
        InputFilter[] inputFilterArr = new InputFilter[length];
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 < length - 1) {
                inputFilterArr[i2] = filters[i2];
            } else {
                inputFilterArr[i2] = new InputFilter.LengthFilter(i);
            }
        }
        editText.setFilters(inputFilterArr);
    }

    /* renamed from: j0 */
    public static void m95575j0(Object obj) {
        Log.d("B_LOG", obj + "");
    }

    /* renamed from: k0 */
    public static BigDecimal m95577k0(String str) {
        try {
            return new BigDecimal(str).setScale(2, RoundingMode.DOWN);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l0 */
    public static QrId m95579l0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (QrId) new Gson().mo18170l(str, QrId.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: m0 */
    public static String m95581m0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[C11398b.f33141t];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                C10468i.m38038b(e);
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    /* renamed from: n */
    public static void m95582n(RecyclerView recyclerView, String str, PreferencesApiManager preferencesApiManager) {
        f79803g = preferencesApiManager;
        if (preferencesApiManager.getSwipeTipCounts(str) <= 0) {
            recyclerView.mo5367o1(f79804h);
            recyclerView.mo5363n(f79804h);
        }
    }

    /* renamed from: n0 */
    public static void m95583n0(Activity activity, String str, String str2) {
        C0703h1.m2722c(activity).mo3135f(str).mo3136g("text/plain").mo3134e(str2).mo3137h();
    }

    /* renamed from: o */
    public static boolean m95584o() {
        return m95533D() >= 24;
    }

    /* renamed from: o0 */
    public static String m95585o0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(32);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static boolean m95586p() {
        return m95533D() >= 26;
    }

    /* renamed from: p0 */
    public static String m95587p0(String str, int i) {
        if (i > str.length()) {
            return str;
        }
        return str.substring(0, i);
    }

    /* renamed from: q */
    public static boolean m95588q() {
        return m95533D() >= 29;
    }

    /* renamed from: q0 */
    public static void m95589q0(TextView textView, String str) {
        textView.setText(str.replaceAll("[ ]{3,}", "  "));
    }

    /* renamed from: r */
    public static long m95590r(long j) {
        return j / 1048576;
    }

    /* renamed from: s */
    public static BigDecimal m95591s(BigDecimal bigDecimal, String str) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (str == null) {
            return bigDecimal3;
        }
        if (!str.contains(C11110u2.f31950c)) {
            return new BigDecimal(str).divide(new BigDecimal(100)).setScale(2, 1);
        }
        int indexOf = str.indexOf(C11110u2.f31950c);
        BigDecimal bigDecimal4 = new BigDecimal(str.substring(indexOf + 1, str.length()));
        BigDecimal divide = new BigDecimal(str.substring(0, indexOf)).divide(new BigDecimal(100));
        BigDecimal divide2 = bigDecimal.multiply(bigDecimal4).divide(new BigDecimal(100));
        if (divide2.compareTo(divide) != 1) {
            bigDecimal2 = divide.setScale(2, 1);
        } else {
            bigDecimal2 = divide2.setScale(2, 1);
        }
        return bigDecimal2;
    }

    /* renamed from: t */
    public static BigDecimal m95592t(BigDecimal bigDecimal, String str) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }
        return m95591s(bigDecimal, str);
    }

    /* renamed from: u */
    public static String m95593u(String str) {
        String str2 = "";
        String replace = str.replace(" ₾", str2);
        if (!replace.contains(".")) {
            replace = replace + ".";
        }
        if (replace.indexOf(".") == 0) {
            replace = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + replace;
        }
        boolean z = true;
        if (replace.indexOf(".") == replace.length() - 1) {
            replace = replace + BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        if (replace.indexOf(".") == replace.length() - 2) {
            replace = replace + BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        try {
            int parseInt = Integer.parseInt(replace.substring(0, replace.indexOf(".")));
            if (Double.parseDouble(replace) >= Utils.DOUBLE_EPSILON) {
                z = false;
            }
            StringBuilder sb = new StringBuilder();
            if (z && parseInt >= 0) {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(parseInt);
            sb.append(replace.substring(replace.indexOf("."), replace.length()));
            return sb.toString();
        } catch (Exception unused) {
            return replace;
        }
    }

    /* renamed from: v */
    public static String m95594v(String str) {
        return str.concat("₾");
    }

    /* renamed from: w */
    public static Object[] m95595w(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + length2);
        System.arraycopy(objArr, 0, objArr3, 0, length);
        System.arraycopy(objArr2, 0, objArr3, length, length2);
        return objArr3;
    }

    /* renamed from: x */
    public static void m95596x(String str) {
        ((ClipboardManager) C36546y.m108285N().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
    }

    /* renamed from: y */
    public static String m95597y(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: z */
    public static boolean m95598z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
