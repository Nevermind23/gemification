package ip0;

import android.graphics.drawable.Drawable;
import dp0.C12419a;
import g91.C32289b0;
import i41.C36354b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.designsystem.components.common.Image;
import p668xg.C18762d;

/* renamed from: ip0.a */
public final class C15733a {

    /* renamed from: a */
    private final C36354b f44603a;

    public C15733a(C36354b bVar) {
        C41536l.m120489i(bVar, "isInNightMode");
        this.f44603a = bVar;
    }

    /* renamed from: a */
    private final AccountSelectorItemView.C13140a m56656a(C12419a aVar) {
        boolean z;
        Currency instance = Currency.getInstance(aVar.mo33024g());
        C41536l.m120488h(instance, "getInstance(account.ccy)");
        C18762d dVar = new C18762d(instance, new BigDecimal(String.valueOf(aVar.mo33020d())), false, 4, (DefaultConstructorMarker) null);
        String a = aVar.mo33017a();
        if (a == null) {
            a = aVar.mo33019c();
        }
        String str = a;
        List e = C41339p.m119900e(dVar);
        boolean h = aVar.mo33025h();
        String d = aVar.mo33021e().mo89541d();
        if (d == null) {
            d = "";
        }
        String c = C32289b0.m95091c(d);
        C41536l.m120488h(c, "generateImageUrl(account.cardImage.fileUrl ?: \"\")");
        Image.Url url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        if (aVar.mo33021e().mo89541d() != null) {
            if (!aVar.mo33021e().mo89542e()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = this.f44603a.invoke();
        }
        return new AccountSelectorItemView.C13140a(str, dVar, e, h, (Image) null, url, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final List mo43113b(List list) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m56656a((C12419a) it.next()));
        }
        return arrayList;
    }
}
