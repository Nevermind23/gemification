package ug0;

import android.content.Context;
import cf1.C40419j;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41238w;
import ie0.C25190j;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ug0.c */
public abstract class C28786c {

    /* renamed from: ug0.c$a */
    static final class C28787a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BigInputView f73595d;

        /* renamed from: e */
        final /* synthetic */ String f73596e;

        /* renamed from: f */
        final /* synthetic */ NumericKeyboardView f73597f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28787a(BigInputView bigInputView, String str, NumericKeyboardView numericKeyboardView) {
            super(0);
            this.f73595d = bigInputView;
            this.f73596e = str;
            this.f73597f = numericKeyboardView;
        }

        public final void invoke() {
            String text = this.f73595d.getText();
            String str = this.f73596e;
            Context context = this.f73597f.getContext();
            C41536l.m120488h(context, "context");
            String c = C28786c.m88247c(text, str, context);
            if (c.length() == 0) {
                this.f73595d.setText("");
                return;
            }
            String substring = c.substring(0, c.length() - 1);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            BigInputView bigInputView = this.f73595d;
            if (!(substring.length() == 0)) {
                if (C41536l.m120484d(substring, BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
                    substring = substring + this.f73596e;
                } else {
                    substring = C28786c.m88249e(substring) + this.f73596e;
                }
            }
            bigInputView.setText(substring);
            this.f73597f.setAdditionalButtonEnabled(!C40440x.m117139M(this.f73595d.getText(), ".", false, 2, (Object) null));
        }
    }

    /* renamed from: ug0.c$b */
    static final class C28788b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BigInputView f73598d;

        /* renamed from: e */
        final /* synthetic */ String f73599e;

        /* renamed from: f */
        final /* synthetic */ NumericKeyboardView f73600f;

        /* renamed from: g */
        final /* synthetic */ int f73601g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28788b(BigInputView bigInputView, String str, NumericKeyboardView numericKeyboardView, int i) {
            super(1);
            this.f73598d = bigInputView;
            this.f73599e = str;
            this.f73600f = numericKeyboardView;
            this.f73601g = i;
        }

        /* renamed from: a */
        public final void mo68517a(String str) {
            boolean z;
            String str2;
            boolean z2;
            boolean z3;
            C41536l.m120489i(str, "it");
            String text = this.f73598d.getText();
            String str3 = this.f73599e;
            Context context = this.f73600f.getContext();
            C41536l.m120488h(context, "context");
            String c = C28786c.m88247c(text, str3, context);
            if (c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && new BigDecimal(c).compareTo(new BigDecimal(String.valueOf(9.9999999999E8d))) > 0) {
                return;
            }
            if (!C40440x.m117139M(c, ".", false, 2, (Object) null) || C40440x.m117156X(c, ".", 0, false, 6, (Object) null) != (c.length() - this.f73601g) - 1) {
                if (C41536l.m120484d(str, ".")) {
                    if (c.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || new C40419j("[0]+").mo94489f(c)) {
                        str2 = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + str;
                    } else {
                        str2 = C28786c.m88249e(c) + str;
                    }
                } else {
                    if (c.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = c + str;
                    } else {
                        str2 = C28786c.m88249e(c + str);
                    }
                }
                this.f73598d.setText(str2 + this.f73599e);
                this.f73600f.setAdditionalButtonEnabled(C40440x.m117139M(this.f73598d.getText(), ".", false, 2, (Object) null) ^ true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68517a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public static final void m88245a(NumericKeyboardView numericKeyboardView, String str, BigInputView bigInputView) {
        C41536l.m120489i(numericKeyboardView, "<this>");
        C41536l.m120489i(str, "suffix");
        C41536l.m120489i(bigInputView, "inputView");
        numericKeyboardView.setBackSpaceClickedListener(new C28787a(bigInputView, str, numericKeyboardView));
    }

    /* renamed from: b */
    public static final void m88246b(NumericKeyboardView numericKeyboardView, String str, int i, BigInputView bigInputView) {
        C41536l.m120489i(numericKeyboardView, "<this>");
        C41536l.m120489i(str, "suffix");
        C41536l.m120489i(bigInputView, "inputView");
        numericKeyboardView.setNumbersClickedListener(new C28788b(bigInputView, str, numericKeyboardView, i));
    }

    /* renamed from: c */
    public static final String m88247c(String str, String str2, Context context) {
        String str3;
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(context, "context");
        if (str2 != null) {
            String B = C40439w.m117103B(C40439w.m117103B(str, str2, "", false, 4, (Object) null), ",", "", false, 4, (Object) null);
            String string = context.getString(C25190j.gt_text_share);
            C41536l.m120488h(string, "context.getString(R.string.gt_text_share)");
            str3 = C40439w.m117103B(B, string, "", false, 4, (Object) null);
        } else {
            String B2 = C40439w.m117103B(str, ",", "", false, 4, (Object) null);
            String string2 = context.getString(C25190j.gt_text_share);
            C41536l.m120488h(string2, "context.getString(R.string.gt_text_share)");
            str3 = C40439w.m117103B(B2, string2, "", false, 4, (Object) null);
        }
        if (C41536l.m120484d(str3, "00")) {
            str3 = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        return C40439w.m117103B(str3, " ", "", false, 4, (Object) null);
    }

    /* renamed from: d */
    public static final List m88248d(TransferAccounts transferAccounts, String str) {
        ArrayList arrayList;
        List b;
        String str2 = str;
        C41536l.m120489i(transferAccounts, "<this>");
        C41536l.m120489i(str2, "currency");
        TransferAccount d = transferAccounts.mo52163d();
        if (d == null || (b = d.mo52123b()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object next : b) {
                List t = ((TransferAccountItem) next).mo52151t();
                boolean z = false;
                if (!(t instanceof Collection) || !t.isEmpty()) {
                    Iterator it = t.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C41536l.m120484d(((TransferAccountItem) it.next()).mo52142i(), str2)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TransferAccountItem transferAccountItem = (TransferAccountItem) it2.next();
                boolean u = transferAccountItem.mo52153u();
                boolean w = transferAccountItem.mo52155w();
                long m = transferAccountItem.mo52146m();
                String d2 = transferAccountItem.mo52134d();
                String q = transferAccountItem.mo52148q();
                String i = transferAccountItem.mo52142i();
                BigDecimal g = transferAccountItem.mo52139g();
                long p = transferAccountItem.mo52147p();
                BigDecimal s = transferAccountItem.mo52150s();
                boolean v = transferAccountItem.mo52154v();
                String e = transferAccountItem.mo52136e();
                boolean l = transferAccountItem.mo52145l();
                String f = transferAccountItem.mo52138f();
                List t2 = transferAccountItem.mo52151t();
                Iterator it3 = it2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = t2.iterator();
                while (it4.hasNext()) {
                    ArrayList arrayList4 = arrayList2;
                    Object next2 = it4.next();
                    Iterator it5 = it4;
                    if (C41536l.m120484d(((TransferAccountItem) next2).mo52142i(), str2)) {
                        arrayList3.add(next2);
                    }
                    it4 = it5;
                    arrayList2 = arrayList4;
                }
                ArrayList arrayList5 = arrayList3;
                ArrayList arrayList6 = arrayList2;
                arrayList6.add(new TransferAccountItem(u, w, m, d2, q, i, g, p, s, v, e, l, f, arrayList5, transferAccountItem.mo52149r(), transferAccountItem.mo52143j(), transferAccountItem.mo52144k(), (TransferExternalFile) null, 131072, (DefaultConstructorMarker) null));
                arrayList2 = arrayList6;
                it2 = it3;
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    public static final String m88249e(String str) {
        String str2;
        C41536l.m120489i(str, "<this>");
        boolean z = false;
        if (C40439w.m117109H(str, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, false, 2, (Object) null)) {
            str2 = "###,##0.0#";
        } else {
            str2 = "###,##0.##";
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat(str2, decimalFormatSymbols);
        if (C40440x.m117139M(str, ".", false, 2, (Object) null)) {
            List x0 = C40440x.m117182x0(str, new String[]{"."}, false, 0, 6, (Object) null);
            String str3 = (String) x0.get(0);
            if (str3.length() > 0) {
                z = true;
            }
            if (z && !C41536l.m120484d(str3, BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
                str3 = decimalFormat.format(Double.parseDouble(str3));
                C41536l.m120488h(str3, "formatter.format(txt.toDouble())");
            }
            return str3 + "." + x0.get(1);
        }
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return "";
        }
        C36546y N = C36546y.m108285N();
        C41536l.m120488h(N, "getInstance()");
        String format = decimalFormat.format(Double.parseDouble(m88247c(str, "$", N)));
        C41536l.m120488h(format, "{\n        formatter.form…input string: \"22$\"\n    }");
        return format;
    }

    /* renamed from: f */
    public static final String m88250f(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "<this>");
        String str = C32343x.m95427Y0(bigDecimal, 2) + "%";
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return str;
        }
        return "+" + str;
    }

    /* renamed from: g */
    public static final String m88251g(double d) {
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format(Locale.US, "%.8f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        C41536l.m120488h(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: h */
    public static final String m88252h(double d) {
        if (!Double.valueOf(d % ((double) 1)).equals(Double.valueOf(Utils.DOUBLE_EPSILON))) {
            return String.valueOf(d);
        }
        String str = (String) C41358y.m120009Y(C40440x.m117182x0(String.valueOf(d), new String[]{"."}, false, 0, 6, (Object) null));
        if (str == null) {
            return "";
        }
        return str;
    }
}
