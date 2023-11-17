package p575qi;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.widget.C1314o;
import cf1.C40419j;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.input.BogEditText;
import p533ni.C16972m;
import p589ri.C17617a;
import p601sg.C17777b;
import p615tg.C17964e;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: qi.a */
public final class C17505a {

    /* renamed from: i */
    public static final C17506a f49021i = new C17506a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C40419j f49022j = new C40419j("\\s+");

    /* renamed from: a */
    private final TextView f49023a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BogEditText f49024b;

    /* renamed from: c */
    private C17617a f49025c;

    /* renamed from: d */
    private final int f49026d;

    /* renamed from: e */
    private final int f49027e;

    /* renamed from: f */
    private final C17507b f49028f;

    /* renamed from: g */
    private final C43075l f49029g;

    /* renamed from: h */
    private final C43080q f49030h;

    /* renamed from: qi.a$a */
    public static final class C17506a {
        private C17506a() {
        }

        public /* synthetic */ C17506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qi.a$b */
    public static final class C17507b implements TextWatcher {

        /* renamed from: d */
        private int f49031d;

        /* renamed from: e */
        private int f49032e;

        /* renamed from: f */
        final /* synthetic */ C17505a f49033f;

        C17507b(C17505a aVar) {
            this.f49033f = aVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            int i2;
            this.f49033f.f49024b.removeTextChangedListener(this);
            int i3 = 1;
            if (this.f49033f.f49024b.getSelectionStart() == 0) {
                i = 1;
            } else {
                i = this.f49033f.f49024b.getSelectionStart();
            }
            this.f49031d = i;
            if (this.f49033f.f49024b.getSelectionEnd() != 0) {
                i3 = this.f49033f.f49024b.getSelectionEnd();
            }
            this.f49032e = i3;
            this.f49033f.m61032u("‎" + new C40419j("‎").mo94490g(String.valueOf(editable), ""), this.f49033f.f49024b);
            Editable text = this.f49033f.f49024b.getText();
            if (text != null) {
                i2 = text.length();
            } else {
                i2 = 0;
            }
            int i4 = this.f49031d;
            if (i4 > i2) {
                i4 = i2;
            }
            int i5 = this.f49032e;
            if (i5 <= i2) {
                i2 = i5;
            }
            this.f49033f.f49024b.setSelection(i4, i2);
            this.f49033f.f49024b.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: qi.a$c */
    static final class C17508c extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ C17505a f49034d;

        /* renamed from: e */
        final /* synthetic */ Context f49035e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17508c(C17505a aVar, Context context) {
            super(3);
            this.f49034d = aVar;
            this.f49035e = context;
        }

        /* renamed from: a */
        public final void mo45027a(String str, String str2, int i) {
            C41536l.m120489i(str, "textBeforeChange");
            C41536l.m120489i(str2, "copiedText");
            C17964e.m61891d(this.f49034d.mo45021i(this.f49034d.m61022k(this.f49034d.m61025n(str), i, str2.length())), this.f49035e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo45027a((String) obj, (String) obj2, ((Number) obj3).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: qi.a$d */
    static final class C17509d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17505a f49036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17509d(C17505a aVar) {
            super(1);
            this.f49036d = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C41536l.m120489i(str, "pastedText");
            String g = C17505a.f49022j.mo94490g(str, "");
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(this.f49036d.f49024b.getText());
            int selectionStart = this.f49036d.f49024b.getSelectionStart();
            int selectionEnd = this.f49036d.f49024b.getSelectionEnd();
            int i = 0;
            String substring = valueOf.substring(0, selectionStart);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(g);
            String substring2 = valueOf.substring(selectionEnd, valueOf.length());
            C41536l.m120488h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring2);
            C17505a aVar = this.f49036d;
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "resultText.toString()");
            if (aVar.m61029r(sb2)) {
                C17505a aVar2 = this.f49036d;
                String sb3 = sb.toString();
                C41536l.m120488h(sb3, "resultText.toString()");
                this.f49036d.f49024b.setText(aVar2.m61028q(sb3));
                BogEditText b = this.f49036d.f49024b;
                int length = selectionStart + g.length();
                Editable text = this.f49036d.f49024b.getText();
                if (text != null) {
                    i = text.length();
                }
                b.setSelection(Math.min(length, i));
            } else {
                this.f49036d.f49024b.setText(sb);
                BogEditText b2 = this.f49036d.f49024b;
                int length2 = selectionStart + g.length();
                Editable text2 = this.f49036d.f49024b.getText();
                if (text2 != null) {
                    i = text2.length();
                }
                b2.setSelection(Math.min(length2, i));
            }
            return Boolean.TRUE;
        }
    }

    public C17505a(TextView textView, BogEditText bogEditText, C17617a aVar, Context context) {
        String str;
        C41536l.m120489i(bogEditText, "editText");
        C41536l.m120489i(aVar, "mask");
        C41536l.m120489i(context, "context");
        this.f49023a = textView;
        this.f49024b = bogEditText;
        this.f49026d = new Color.Attribute(C17777b.color_invert_component_tr_100).mo35260a(context);
        this.f49027e = new Color.Resource(17170445).mo35260a(context);
        C17507b bVar = new C17507b(this);
        this.f49028f = bVar;
        C17509d dVar = new C17509d(this);
        this.f49029g = dVar;
        C17508c cVar = new C17508c(this, context);
        this.f49030h = cVar;
        boolean z = true;
        if (!aVar.mo45197d().isEmpty()) {
            str = String.valueOf(((Character) C41358y.m120007W(aVar.mo45197d())).charValue());
        } else {
            str = "";
        }
        String e = aVar.mo45198e();
        if (!(e == null || e.length() == 0)) {
            z = false;
        }
        if (!z) {
            str = str + aVar.mo45198e();
        }
        this.f49025c = aVar.mo45194a(str + aVar.mo45195b(), aVar.mo45197d(), aVar.mo45198e(), aVar.mo45196c());
        bogEditText.setOnClipboardPasteListener(dVar);
        bogEditText.setPasteFilterRegex(this.f49025c.mo45196c());
        bogEditText.setOnClipboardCopyEventListener(cVar);
        bogEditText.addTextChangedListener(bVar);
    }

    /* renamed from: h */
    private final int m61021h(int i, int i2) {
        int length = this.f49025c.mo45195b().length();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            if (i4 == i) {
                while (true) {
                    int i6 = i2 + i3;
                    if (i6 < this.f49025c.mo45195b().length() && !this.f49025c.mo45197d().contains(Character.valueOf(this.f49025c.mo45195b().charAt(i6)))) {
                        i3++;
                    }
                }
                return i5 + i3;
            }
            if (!this.f49025c.mo45197d().contains(Character.valueOf(this.f49025c.mo45195b().charAt(i2)))) {
                i5++;
            } else {
                i4++;
            }
            i2++;
        }
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final String m61022k(String str, int i, int i2) {
        int h = i + m61021h(i, 0);
        String substring = str.substring(h, str.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return m61030s(substring, h, i2);
    }

    /* renamed from: l */
    private final float m61023l(String str, int i, int i2) {
        TextPaint paint;
        TextView textView = this.f49023a;
        if (textView == null || (paint = textView.getPaint()) == null) {
            return Utils.FLOAT_EPSILON;
        }
        String substring = str.substring(i, i2 + i);
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return paint.measureText(substring);
    }

    /* renamed from: m */
    private final String m61024m() {
        StringBuilder sb = new StringBuilder(f49022j.mo94490g(this.f49025c.mo45195b(), ""));
        String e = this.f49025c.mo45198e();
        if (e != null && sb.length() >= e.length() + 1 && C41536l.m120484d(sb.substring(1, e.length() + 1), e)) {
            sb.replace(1, e.length() + 1, "");
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "txt.toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final String m61025n(String str) {
        SpannableStringBuilder p = m61027p(str, this.f49025c.mo45195b(), this.f49025c.mo45197d());
        int length = str.length();
        String b = this.f49025c.mo45195b();
        int i = 0;
        for (int i2 = 0; i2 < b.length(); i2++) {
            if (this.f49025c.mo45197d().contains(Character.valueOf(b.charAt(i2)))) {
                i++;
            }
        }
        if (length > i) {
            String b2 = this.f49025c.mo45195b();
            int i3 = 0;
            for (int i4 = 0; i4 < b2.length(); i4++) {
                if (this.f49025c.mo45197d().contains(Character.valueOf(b2.charAt(i4)))) {
                    i3++;
                }
            }
            String substring = str.substring(i3, str.length());
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            p.append(substring);
        }
        String spannableStringBuilder = p.toString();
        C41536l.m120488h(spannableStringBuilder, "maskedTextBeforeChange.toString()");
        return spannableStringBuilder;
    }

    /* renamed from: o */
    private final SpannableStringBuilder m61026o(String str, C17617a aVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        List d = aVar.mo45197d();
        String b = aVar.mo45195b();
        int length = spannableStringBuilder.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i + 1;
            int i4 = 0;
            int i5 = i3;
            while (i5 < b.length() && !d.contains(Character.valueOf(b.charAt(i5)))) {
                i4++;
                i5++;
            }
            if (i4 > 0) {
                float l = m61023l(b, i3, i4) + Utils.FLOAT_EPSILON;
                if (l > Utils.FLOAT_EPSILON) {
                    m61031t(spannableStringBuilder, l, i2);
                }
            }
            i += i4;
        }
        return spannableStringBuilder;
    }

    /* renamed from: p */
    private final SpannableStringBuilder m61027p(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (list.contains(Character.valueOf(charAt)) && i < str.length()) {
                spannableStringBuilder.append(str.charAt(i));
                i++;
                m61033v(spannableStringBuilder, i2, this.f49027e);
            } else if (list.contains(Character.valueOf(charAt))) {
                spannableStringBuilder.append(charAt);
                m61033v(spannableStringBuilder, i2, this.f49026d);
            } else {
                spannableStringBuilder.append(charAt);
            }
        }
        String substring = str2.substring(spannableStringBuilder.length());
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        spannableStringBuilder.append(substring);
        return spannableStringBuilder;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final String m61028q(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder unused = C40435s.m117094f(sb);
        StringBuilder sb2 = new StringBuilder(m61024m());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i >= sb2.length()) {
                sb.append(str.charAt(i));
            } else if (this.f49025c.mo45197d().contains(Character.valueOf(sb2.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }
        String sb3 = sb.toString();
        C41536l.m120488h(sb3, "resultText.toString()");
        return sb3;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final boolean m61029r(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!C40440x.m117126D0(sb, "‎", false, 2, (Object) null)) {
            sb.insert(0, "‎");
        }
        StringBuilder sb2 = new StringBuilder(m61024m());
        if (sb.length() < sb2.length()) {
            return false;
        }
        int length = sb2.length();
        for (int i = 0; i < length; i++) {
            if (!this.f49025c.mo45197d().contains(Character.valueOf(sb2.charAt(i))) && sb2.charAt(i) != sb.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private final String m61030s(String str, int i, int i2) {
        String substring = str.substring(0, i2 + m61021h(i2, i));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: t */
    private final void m61031t(SpannableStringBuilder spannableStringBuilder, float f, int i) {
        spannableStringBuilder.setSpan(new C16972m(f, i), i, i + 1, 17);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m61032u(String str, BogEditText bogEditText) {
        boolean z;
        if (this.f49023a != null) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "‎";
            }
            this.f49023a.setText(m61027p(str, this.f49025c.mo45195b(), this.f49025c.mo45197d()));
            SpannableStringBuilder o = m61026o(str, this.f49025c);
            Editable text = bogEditText.getText();
            if (text != null) {
                text.clear();
            }
            Editable text2 = bogEditText.getText();
            if (text2 != null) {
                text2.append(o);
            }
        }
    }

    /* renamed from: v */
    private final void m61033v(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), i, i + 1, 17);
    }

    /* renamed from: i */
    public final String mo45021i(String str) {
        C41536l.m120489i(str, "newTextToCopy");
        if (C40439w.m117109H(str, "‎", false, 2, (Object) null)) {
            str = str.substring(1, str.length());
            C41536l.m120488h(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return f49022j.mo94490g(str, "");
    }

    /* renamed from: j */
    public final void mo45022j() {
        this.f49024b.setOnClipboardPasteListener((C43075l) null);
        this.f49024b.setOnClipboardCopyEventListener((C43080q) null);
        this.f49024b.removeTextChangedListener(this.f49028f);
    }

    /* renamed from: w */
    public final void mo45023w(int i) {
        TextView textView = this.f49023a;
        if (textView != null) {
            C1314o.m4575q(textView, i);
        }
    }
}
