package p675xn;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cf1.C40412h;
import cf1.C40419j;
import g91.C32343x;
import g91.C32359z0;
import he1.C41217g;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p366bk.C10320i;
import p366bk.C10328q;
import p420fh.C12902d;
import p420fh.C12910e;
import p482jn.C16249b;
import p709au.C19277a;
import p725cr.C19788a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: xn.c */
public final class C18839c extends C19788a {

    /* renamed from: J */
    public static final C18840a f52652J = new C18840a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private final C41217g f52653H = C41219i.m119470b(new C18841b(this));

    /* renamed from: I */
    private C16249b f52654I;

    /* renamed from: xn.c$a */
    public static final class C18840a {
        private C18840a() {
        }

        public /* synthetic */ C18840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18839c mo46800a(DigitalCardInfo digitalCardInfo) {
            C41536l.m120489i(digitalCardInfo, "cardInfo");
            C18839c cVar = new C18839c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("card_info", digitalCardInfo);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* renamed from: xn.c$b */
    static final class C18841b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18839c f52655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18841b(C18839c cVar) {
            super(0);
            this.f52655d = cVar;
        }

        /* renamed from: b */
        public final DigitalCardInfo invoke() {
            Parcelable parcelable = this.f52655d.requireArguments().getParcelable("card_info");
            C41536l.m120486f(parcelable);
            return (DigitalCardInfo) parcelable;
        }
    }

    /* renamed from: xn.c$c */
    static final class C18842c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18842c f52656d = new C18842c();

        C18842c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C40412h hVar) {
            C41536l.m120489i(hVar, "it");
            return hVar.getValue();
        }
    }

    /* renamed from: g2 */
    private final String m63722g2(String str, int... iArr) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(i));
            if (C41333m.m119793r(iArr, i)) {
                sb.append(' ');
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h2 */
    private final void m63723h2() {
        C32359z0.m95596x(m63726k2().getDetails().getCardNumber());
        C12910e.m48788f(this, C32343x.m95452h0(C10328q.card_number_copied, new Object[0]), C12902d.C12905b.C12908c.f38105a, false, 4, (Object) null);
    }

    /* renamed from: i2 */
    private final String m63724i2(String str) {
        String substring = str.substring(0, 4);
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (Pattern.matches("^3[47][0-9]{2}$", substring)) {
            return m63722g2(str, 3, 9);
        }
        return C40355o.m116861s(C40419j.m117008d(new C40419j(".{4}"), str, 0, 2, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C18842c.f52656d, 30, (Object) null);
    }

    /* renamed from: j2 */
    private final C16249b m63725j2() {
        C16249b bVar = this.f52654I;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: k2 */
    private final DigitalCardInfo m63726k2() {
        return (DigitalCardInfo) this.f52653H.getValue();
    }

    /* renamed from: l2 */
    private final void m63727l2() {
        C16249b j2 = m63725j2();
        j2.f46021f.setInputText(m63726k2().getCardValidThru());
        j2.f46020e.setInputText(m63726k2().getDetails().getCardCVC2());
        if (m63726k2().getImageUrl() != null) {
            j2.f46022g.setImageUrl(m63726k2().getImageUrl());
        } else {
            j2.f46022g.setDrawableSrc(Integer.valueOf(C19277a.m64731a(m63726k2().getCardSubProductCode(), C10320i.f28667K1)));
        }
        j2.f46022g.setTitle(m63726k2().getCardName());
        j2.f46022g.setText(m63726k2().getCardHolder());
        j2.f46023h.setInputText(m63724i2(m63726k2().getDetails().getCardNumber()));
        j2.f46023h.setOnClickListener(new C18838b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m63728m2(C18839c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m63723h2();
    }

    /* renamed from: n2 */
    private final void m63729n2(C16249b bVar) {
        bVar.f46024i.setOnClickListener(new C18837a(this));
        m63727l2();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m63730o2(C18839c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f52654I = C16249b.m57931d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95452h0(C10328q.f28936Q1, new Object[0]));
        m63729n2(m63725j2());
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f52654I = null;
    }
}
